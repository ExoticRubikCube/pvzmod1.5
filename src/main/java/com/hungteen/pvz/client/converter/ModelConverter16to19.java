package com.hungteen.pvz.client.converter;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * PVZ 1.16.5 EntityModel → 1.19.2 批量转换器。
 *
 * <h3>转换范围</h3>
 * <ul>
 *   <li>类型：{@code ModelRenderer} → {@code ModelPart}</li>
 *   <li>包路径：{@code net.minecraft.client.renderer.model.ModelRenderer}
 *       → {@code net.minecraft.client.model.geom.ModelPart}</li>
 *   <li>渲染管线参数：{@code PoseStack} → {@code PoseStack}；
 *       {@code VertexConsumer} → {@code VertexConsumer}</li>
 *   <li>模型构建：构造函数内的 {@code new ModelRenderer(this)} + {@code setPos} +
 *       {@code addChild} + {@code texOffs(...).addBox(...)} 迁移为 1.19 的
 *       {@code LayerDefinition / MeshDefinition / PartDefinition / PartPose / CubeListBuilder / CubeDeformation}
 *       静态 {@code createBodyLayer()} 工厂；构造函数切换为
 *       {@code ModelClass(ModelPart root)} 并通过 {@code root.getChild(name)}
 *       绑定每个子部件。</li>
 *   <li>保留 setupAnim、renderToBuffer、setRotationAngle、自定义辅助方法、
 *       Blockbench 注释、端侧注解（若存在）、{@code @Override}、泛型参数、
 *       implements 接口等非几何逻辑 100% 不变（仅必要的 import 与类型名替换）。</li>
 * </ul>
 *
 * <h3>执行入口</h3>
 * <ul>
 *   <li>{@link #main(String[])}：0 参 = DRY_RUN；1 参且为 {@code -apply} = 实际写回覆盖；
 *       2 参可用 {@code <clientSrcDir> -apply|-dryrun} 指定根目录。</li>
 *   <li>{@link #run(Path, boolean)}：程序化调用入口，返回汇总报告。</li>
 * </ul>
 *
 * <h3>设计约束（严格遵守项目军规）</h3>
 * <ol>
 *   <li>外科手术式修改：转换过程中只重写 「构造函数 + createBodyLayer 新增 + 字段类型 + import + 方法签名类型」，
 *       其他行逐字保留。</li>
 *   <li>禁止过度抽象：所有解析逻辑均以 2 层 for/if 线性展开，不为 <10 行的片段提取私有方法。</li>
 *   <li>编码严格 UTF-8 无 BOM；写回时用 {@code Files.write(path, bytes)} 直接写字节，不引入系统换行默认值。</li>
 * </ol>
 */
public final class ModelConverter16to19 {

	// ------------- 常量：输入输出 import/类型 映射表 -------------

	public static final String OLD_PACKAGE_MODEL_RENDERER = "net.minecraft.client.renderer.model.ModelRenderer";
	public static final String NEW_PACKAGE_MODEL_PART    = "net.minecraft.client.model.geom.ModelPart";

	public static final String OLD_PACKAGE_MATRIX_STACK  = "com.mojang.blaze3d.matrix.PoseStack";
	public static final String NEW_PACKAGE_POSE_STACK    = "com.mojang.blaze3d.vertex.PoseStack";

	public static final String OLD_PACKAGE_VERTEX        = "com.mojang.blaze3d.vertex.VertexConsumer";
	public static final String NEW_PACKAGE_VERTEX_CONS   = "com.mojang.blaze3d.vertex.VertexConsumer";

	public static final String[] REQUIRED_NEW_IMPORTS = new String[] {
			"net.minecraft.client.model.geom.builders.CubeDeformation",
			"net.minecraft.client.model.geom.builders.CubeListBuilder",
			"net.minecraft.client.model.geom.builders.LayerDefinition",
			"net.minecraft.client.model.geom.builders.MeshDefinition",
			"net.minecraft.client.model.geom.builders.PartDefinition",
			"net.minecraft.client.model.geom.PartPose",
	};

	public static final String OLD_TYPE_RENDERER = "ModelRenderer";
	public static final String NEW_TYPE_PART     = "ModelPart";
	public static final String OLD_TYPE_MATRIX   = "PoseStack";
	public static final String NEW_TYPE_POSE     = "PoseStack";
	public static final String OLD_TYPE_VB       = "VertexConsumer";
	public static final String NEW_TYPE_VC       = "VertexConsumer";

	// ------------- 正则：构造函数内结构识别 -------------

	// 字段声明：private(/protected/public) (final)? ModelRenderer NAME;  (允许多字段一行，非典型兼容)
	private static final Pattern FIELD_DECL = Pattern.compile(
			"^\\s*(private|protected|public)\\s+(final\\s+)?ModelRenderer\\s+(\\w[\\w,\\s]*?)\\s*;\\s*$");

	// 构造函数入口 public ClassName() (支持注释尾 / 泛型参数忽略，Class 名取自文件类声明)
	private static final Pattern CDECL_HEAD = Pattern.compile(
			"^\\s*public\\s+(\\w+)\\s*\\(\\s*\\)\\s*\\{?\\s*$");

	// 构造器内：texWidth = 128; / texHeight = 128;  (支持 this. / 纯字段)
	private static final Pattern TEX_SIZE = Pattern.compile(
			"^\\s*(?:this\\s*\\.\\s*)?tex(Width|Height)\\s*=\\s*(\\d+)\\s*;\\s*$");

	// 创建 part：NAME = new ModelRenderer(this);
	private static final Pattern NEW_PART = Pattern.compile(
			"^\\s*(?:this\\s*\\.\\s*)?(\\w+)\\s*=\\s*new\\s+ModelRenderer\\s*\\(\\s*this\\s*\\)\\s*;\\s*$");

	// setPos：NAME.setPos(1.0F, 2.0F, 3.0F);
	private static final Pattern SET_POS = Pattern.compile(
			"^\\s*(?:this\\s*\\.\\s*)?(\\w+)\\s*\\.\\s*setPos\\s*\\(\\s*([^,)]+)\\s*,\\s*([^,)]+)\\s*,\\s*([^)]+?)\\s*\\)\\s*;\\s*$");

	// addChild：PARENT.addChild(CHILD);
	private static final Pattern ADD_CHILD = Pattern.compile(
			"^\\s*(?:this\\s*\\.\\s*)?(\\w+)\\s*\\.\\s*addChild\\s*\\(\\s*(?:this\\s*\\.\\s*)?(\\w+)\\s*\\)\\s*;\\s*$");

	// setRotationAngle(NAME, x, y, z);   (可能是 this.setRotationAngle 或 setRotationAngle)
	private static final Pattern SET_ROT = Pattern.compile(
			"^\\s*(?:this\\s*\\.\\s*)?setRotationAngle\\s*\\(\\s*(?:this\\s*\\.\\s*)?(\\w+)\\s*,\\s*([^,)]+)\\s*,\\s*([^,)]+)\\s*,\\s*([^)]+?)\\s*\\)\\s*;\\s*$");

	// FIELD.texOffs(u,v).addBox(minX, minY, minZ, w, h, d[, delta][, mirror]);
	private static final Pattern TEXOFFS_ADDBOX = Pattern.compile(
			"^\\s*(?:this\\s*\\.\\s*)?(\\w+)\\s*\\.\\s*texOffs\\s*\\(\\s*(-?\\d+)\\s*,\\s*(-?\\d+)\\s*\\)\\s*\\.\\s*addBox\\s*\\(([^)]*)\\)\\s*;\\s*$");

	// 偶见直接 addBox(6/7/8 参)：FIELD.addBox(args);
	private static final Pattern DIRECT_ADDBOX = Pattern.compile(
			"^\\s*(?:this\\s*\\.\\s*)?(\\w+)\\s*\\.\\s*addBox\\s*\\(([^)]*)\\)\\s*;\\s*$");

	// 类声明：public class ClassName<Generic> extends SuperClass<T> ...
	private static final Pattern CLASS_DECL = Pattern.compile(
			"^\\s*(public\\s+)?(?:(?:final|abstract)\\s+)?class\\s+(\\w+)\\s*(?:<[^>]*>)?\\s*(extends\\s+[\\w<>.,?\\s]+)?(implements\\s+[\\w<>.,?\\s]+)?\\s*\\{?\\s*$");

	// 方法签名：setupAnim(T,float,float,float,float,float)  不解析泛型，仅做类型替换
	private static final Pattern METHOD_SETUPANIM = Pattern.compile(
			"^\\s*(@Override\\s*)?public\\s+void\\s+setupAnim\\s*\\(");

	// 方法签名：renderToBuffer(PoseStack, VertexConsumer, int, int, float, float, float, float)
	private static final Pattern METHOD_RENDERTOBUF = Pattern.compile(
			"^\\s*(@Override\\s*)?public\\s+void\\s+renderToBuffer\\s*\\(");

	// 方法签名：setRotationAngle(ModelRenderer, float, float, float) — 兼容 public/package
	private static final Pattern METHOD_SETROT_HEAD = Pattern.compile(
			"^\\s*(?:public|protected)?\\s*void\\s+setRotationAngle\\s*\\(\\s*ModelRenderer\\s+");

	// ------------- 中间数据结构 -------------

	/**
	 * 部件记录：对应 1.16 构造函数里的一个 ModelRenderer 字段。
	 * 字段顺序严格按源代码声明顺序（LinkedHashMap 插入序）。
	 */
	static final class PartRecord {
		final String name;
		final List<int[]> cubes = new ArrayList<>();   // [u, v, minX, minY, minZ, w, h, d, deltaE7*1M, mirror(0/1)]
		final List<String> cubeDeltaLiterals = new ArrayList<>(); // 保留原始字面量（含 F/f/1.0 等）
		String posX = "0.0F", posY = "0.0F", posZ = "0.0F";
		String rotX = "0.0F", rotY = "0.0F", rotZ = "0.0F";
		String parent = null; // null = 根级子节点
		boolean hadSetPos = false;
		boolean hadSetRot = false;

		PartRecord(String name) {
			this.name = name;
		}
	}

	/**
	 * 单次文件转换结果，供批量汇总打印。
	 */
	public static final class ConversionReport {
		public int filesScanned;
		public int filesMatched;
		public int filesConverted;
		public int partsTotal;
		public int cubesTotal;
		public int warnings;
		public final List<String> warnDetails = new ArrayList<>();
		public final List<String> convertedFiles = new ArrayList<>();
		public final List<String> skippedFiles = new ArrayList<>();

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("ModelConverter16to19.Report {\n");
			sb.append("  scanned   = ").append(filesScanned).append('\n');
			sb.append("  matched   = ").append(filesMatched).append('\n');
			sb.append("  converted = ").append(filesConverted).append('\n');
			sb.append("  parts     = ").append(partsTotal).append('\n');
			sb.append("  cubes     = ").append(cubesTotal).append('\n');
			sb.append("  warnings  = ").append(warnings).append('\n');
			sb.append("  converted :\n");
			for (String s : convertedFiles) sb.append("    [OK] ").append(s).append('\n');
			sb.append("  skipped :\n");
			for (String s : skippedFiles) sb.append("    [--] ").append(s).append('\n');
			if (!warnDetails.isEmpty()) {
				sb.append("  warn details (first 50):\n");
				int n = Math.min(50, warnDetails.size());
				for (int i = 0; i < n; i++) sb.append("    [WARN] ").append(warnDetails.get(i)).append('\n');
			}
			sb.append('}');
			return sb.toString();
		}
	}

	// ------------- 主入口 -------------

	public static void main(String[] args) {
		String clientSrc = "c:\\Users\\Administrator\\Desktop\\SuSenMod\\pvzmod1.5\\src\\main\\java\\com\\hungteen\\pvz\\client";
		boolean apply = false;
		if (args.length == 1) {
			if ("-apply".equalsIgnoreCase(args[0])) apply = true;
			else if ("-dryrun".equalsIgnoreCase(args[0])) apply = false;
			else clientSrc = args[0];
		} else if (args.length == 2) {
			clientSrc = args[0];
			apply = "-apply".equalsIgnoreCase(args[1]);
		}
		ConversionReport report = run(Paths.get(clientSrc), apply);
		System.out.println(report);
	}

	/**
	 * 扫描 clientSrc 下的 model 目录，对所有包含 1.16.5 风格 ModelRenderer 声明
	 * 并 extends EntityModel/PVZEntityModel/ComponentModel 的 java 文件执行转换。
	 *
	 * @param clientSrc client 源码根目录（通常 .../com/hungteen/pvz/client）
	 * @param apply true = 覆盖写回；false = 仅生成报告，不修改磁盘
	 * @return 汇总报告（绝不为 null）
	 */
	public static ConversionReport run(Path clientSrc, boolean apply) {
		ConversionReport rep = new ConversionReport();
		if (clientSrc == null || !Files.isDirectory(clientSrc)) {
			rep.warnings++;
			rep.warnDetails.add("clientSrc 无效或不存在: " + clientSrc);
			return rep;
		}
		Path modelDir = clientSrc.resolve("model");
		if (!Files.isDirectory(modelDir)) {
			rep.warnings++;
			rep.warnDetails.add("不存在 model/ 子目录: " + modelDir);
			return rep;
		}
		List<Path> files = new ArrayList<>();
		try {
			Files.walk(modelDir)
					.filter(Files::isRegularFile)
					.filter(p -> p.toString().endsWith(".java"))
					.sorted(Comparator.comparing(Path::toString))
					.forEach(files::add);
		} catch (IOException e) {
			rep.warnings++;
			rep.warnDetails.add("遍历 model 目录失败: " + e);
			return rep;
		}
		rep.filesScanned = files.size();
		for (Path javaFile : files) {
			try {
				byte[] raw = Files.readAllBytes(javaFile);
				String content = new String(raw, StandardCharsets.UTF_8);
				// 去 BOM（仅防御）
				if (!content.isEmpty() && content.charAt(0) == '\uFEFF') content = content.substring(1);

				// ---------- 自修复：清理首次错误 -apply 遗留的错误 FQN ----------
				boolean selfHealed = false;
				if (content.contains("com.mojang.blaze3d.matrix.PoseStack")) {
					content = content.replace("com.mojang.blaze3d.matrix.PoseStack",
							NEW_PACKAGE_POSE_STACK);
					selfHealed = true;
				}
				if (content.contains("net.minecraft.client.renderer.model.ModelPart")) {
					content = content.replace("net.minecraft.client.renderer.model.ModelPart",
							NEW_PACKAGE_MODEL_PART);
					selfHealed = true;
				}
				boolean stillHasOldType = content.contains(OLD_TYPE_RENDERER)
						|| content.contains(OLD_TYPE_MATRIX)
						|| content.contains(OLD_TYPE_VB)
						|| content.contains(OLD_PACKAGE_MODEL_RENDERER)
						|| content.contains(OLD_PACKAGE_MATRIX_STACK)
						|| content.contains(OLD_PACKAGE_VERTEX);

				if (!stillHasOldType && !selfHealed) {
					rep.skippedFiles.add(javaFile.toString());
					continue;
				}
				rep.filesMatched++;

				String converted = convertModelSource(content, javaFile.toString(), rep);
				if (converted == null) {
					// 回退：仅做类型/包浅层重命名（抽象基类、无几何部件的中间类）
					converted = shallowRenameOnlyConvert(content);
					if (converted == null) {
						// 仍为 null → 浅层没有变化，但可能 selfHealed 阶段发生了改动；此时必须写回修复结果
						if (selfHealed) converted = content;
						else {
							rep.skippedFiles.add(javaFile.toString());
							continue;
						}
					}
				}
				rep.convertedFiles.add(javaFile.toString());
				rep.filesConverted++;
				if (apply) {
					byte[] out = converted.getBytes(StandardCharsets.UTF_8);
					Files.write(javaFile, out);
				}
			} catch (Exception ex) {
				rep.warnings++;
				rep.warnDetails.add("文件 " + javaFile + " 转换异常: " + ex);
			}
		}
		return rep;
	}

	// ------------- 单文件转换核心 -------------

	/**
	 * @param source   原文件完整源代码（UTF-8, 无 BOM）
	 * @param fileName 仅用于打印日志
	 * @param rep      报告聚合
	 * @return 转换后的源码，若无法转换返回 null
	 */
	static String convertModelSource(String source, String fileName, ConversionReport rep) {
		List<String> lines = Arrays.asList(source.split("\\R", -1));
		int nLines = lines.size();

		// ---- 阶段 1：定位 class 声明行、类名、构造器区间、字段声明区间、方法区间 ----
		String className = null;
		int classDeclLine = -1;
		int constructorStart = -1; // 含 public ClassName() 那行
		int constructorEnd   = -1; // 构造函数最后一个 '}' 行（按花括号匹配）
		int packageLine = -1;
		int firstImportLine = -1;
		int lastImportLine  = -1;

		for (int i = 0; i < nLines; i++) {
			String ln = lines.get(i);
			if (ln.startsWith("package ") && packageLine == -1) packageLine = i;
			if (ln.startsWith("import ")) {
				if (firstImportLine == -1) firstImportLine = i;
				lastImportLine = i;
				continue;
			}
			if (className == null) {
				Matcher m = CLASS_DECL.matcher(ln);
				if (m.matches()) {
					className = m.group(2);
					classDeclLine = i;
					// 下一行开始找构造函数（一般紧跟在字段区后）
				}
			}
		}
		if (className == null) {
			rep.warnings++;
			rep.warnDetails.add(fileName + " 找不到类声明，跳过");
			return null;
		}

		// 找构造函数
		for (int i = classDeclLine + 1; i < nLines; i++) {
			String ln = lines.get(i).trim();
			Matcher m = CDECL_HEAD.matcher(lines.get(i));
			if (m.matches() && className.equals(m.group(1))) {
				constructorStart = i;
				break;
			}
			if (ln.startsWith("public ") && ln.contains("(") && ln.contains(" setupAnim(")) break; // 方法区开始仍未找到构造函数
		}
		if (constructorStart == -1) {
			rep.warnings++;
			rep.warnDetails.add(fileName + " 找不到无参构造函数 public " + className + "()，跳过");
			return null;
		}
		// 花括号配对定位构造函数结束
		int brace = 0;
		boolean foundOpen = false;
		for (int i = constructorStart; i < nLines; i++) {
			String ln = lines.get(i);
			for (int j = 0; j < ln.length(); j++) {
				char c = ln.charAt(j);
				if      (c == '{') { brace++; foundOpen = true; }
				else if (c == '}') { brace--; }
			}
			if (foundOpen && brace == 0) { constructorEnd = i; break; }
		}
		if (constructorEnd == -1) {
			rep.warnings++;
			rep.warnDetails.add(fileName + " 构造函数花括号未闭合，跳过");
			return null;
		}

		// ---- 阶段 2：字段提取（类声明之后、构造函数之前的 ModelRenderer 字段） ----
		// 同时记录行号用于生成新的字段声明（类型替换）
		Map<String, PartRecord> parts = new LinkedHashMap<>();
		// 字段行号 → 字段名列表（一行多字段用 ',' 分隔），非典型；通常一对一
		Map<Integer, List<String>> fieldLines = new TreeMap<>();
		for (int i = classDeclLine + 1; i < constructorStart; i++) {
			String raw = lines.get(i);
			Matcher fm = FIELD_DECL.matcher(raw);
			if (fm.matches()) {
				String namesRaw = fm.group(3).trim();
				List<String> ns = new ArrayList<>();
				for (String n : namesRaw.split(",")) {
					n = n.trim();
					if (!n.isEmpty()) ns.add(n);
				}
				for (String n : ns) parts.put(n, new PartRecord(n));
				fieldLines.put(i, ns);
			}
		}
		if (parts.isEmpty()) {
			rep.warnings++;
			rep.warnDetails.add(fileName + " 未找到任何 ModelRenderer 字段声明，跳过");
			return null;
		}

		// ---- 阶段 3：解析构造函数体，填充 PartRecord 结构与 texWidth/texHeight ----
		int texW = 64, texH = 32;
		for (int i = constructorStart + 1; i < constructorEnd; i++) {
			String ln = lines.get(i);
			Matcher m1 = TEX_SIZE.matcher(ln);
			if (m1.matches()) {
				try {
					int val = Integer.parseInt(m1.group(2));
					if ("Width".equals(m1.group(1))) texW = val; else texH = val;
				} catch (NumberFormatException ignored) { }
				continue;
			}
			Matcher m2 = NEW_PART.matcher(ln);
			if (m2.matches()) {
				String n = m2.group(1);
				if (!parts.containsKey(n)) parts.put(n, new PartRecord(n));
				continue;
			}
			Matcher m3 = SET_POS.matcher(ln);
			if (m3.matches()) {
				String n = m3.group(1);
				PartRecord rec = parts.get(n);
				if (rec != null) {
					rec.posX = m3.group(2).trim();
					rec.posY = m3.group(3).trim();
					rec.posZ = m3.group(4).trim();
					rec.hadSetPos = true;
				} else {
					rep.warnings++;
					rep.warnDetails.add(fileName + ": setPos 指向未知部件 '" + n + "'");
				}
				continue;
			}
			Matcher m4 = ADD_CHILD.matcher(ln);
			if (m4.matches()) {
				String parent = m4.group(1);
				String child  = m4.group(2);
				PartRecord c = parts.get(child);
				if (c != null) {
					// this.addChild(x) 表示挂到模型根，等价于 1.19 的 root 直连子节点
					c.parent = "this".equals(parent) ? null : parent;
				} else {
					rep.warnings++;
					rep.warnDetails.add(fileName + ": addChild 子部件未知 '" + child + "'");
				}
				continue;
			}
			Matcher m5 = SET_ROT.matcher(ln);
			if (m5.matches()) {
				String n = m5.group(1);
				PartRecord rec = parts.get(n);
				if (rec != null) {
					rec.rotX = m5.group(2).trim();
					rec.rotY = m5.group(3).trim();
					rec.rotZ = m5.group(4).trim();
					rec.hadSetRot = true;
				}
				continue;
			}
			Matcher m6 = TEXOFFS_ADDBOX.matcher(ln);
			if (m6.matches()) {
				handleCube(parts, rep, fileName, m6.group(1),
						Integer.parseInt(m6.group(2)), Integer.parseInt(m6.group(3)),
						splitCsv(m6.group(4)));
				continue;
			}
			Matcher m7 = DIRECT_ADDBOX.matcher(ln);
			if (m7.matches()) {
				handleCube(parts, rep, fileName, m7.group(1),
						NO_TEXOFFS_SENTINEL, NO_TEXOFFS_SENTINEL,
						splitCsv(m7.group(2)));
				continue;
			}
			// 其他行（注释、空行、texOffs 未立即 addBox 等）忽略
		}

		rep.partsTotal += parts.size();

		// ---- 阶段 4：imports 重组 ----
		List<String> newImports = new ArrayList<>();
		// 4.1 用 TreeMap 以字符串字典序去重排序
		java.util.Set<String> impSet = new java.util.LinkedHashSet<>();
		if (firstImportLine != -1) {
			for (int i = firstImportLine; i <= lastImportLine; i++) {
				String imp = lines.get(i);
				String trimmed = imp.trim();
				if (!trimmed.startsWith("import ") || !trimmed.endsWith(";")) continue;
				String fqn = trimmed.substring("import ".length(), trimmed.length() - 1).trim();
				if (fqn.startsWith("static ")) {
					String inner = fqn.substring(7).trim();
					// 若 static import 是 MathHelper.* 则替换（通常已在迁移脚本处理，这里双保险）
					if (inner.startsWith("net.minecraft.util.math.MathHelper.")) {
						inner = "net.minecraft.util.Mth."
								+ inner.substring("net.minecraft.util.math.MathHelper.".length());
					}
					impSet.add("import static " + inner + ";");
				} else {
					String mapped = mapImportFqn(fqn);
					impSet.add("import " + mapped + ";");
				}
			}
		}
		// 加入 LayerDefinition 相关（若尚未存在），注意放 net.minecraft.* 段末尾前的 alphabetical 位置
		for (String req : REQUIRED_NEW_IMPORTS) {
			String line = "import " + req + ";";
			impSet.add(line);
		}
		// 加入 PoseStack / VertexConsumer / ModelPart 如果映射后不在里面（mapImportFqn 已完成）
		impSet.add("import " + NEW_PACKAGE_POSE_STACK + ";"); // 防御性
		impSet.add("import " + NEW_PACKAGE_VERTEX_CONS + ";");
		impSet.add("import " + NEW_PACKAGE_MODEL_PART + ";");
		// 去重 & 删除我们不想要的旧包（可能在 mapImportFqn 里已映射，但防漏）
		Iterator<String> it = impSet.iterator();
		while (it.hasNext()) {
			String s = it.next();
			if (s.contains(OLD_PACKAGE_MODEL_RENDERER)
					|| s.contains(OLD_PACKAGE_MATRIX_STACK)
					|| s.contains(OLD_PACKAGE_VERTEX)) {
				it.remove();
			}
		}
		newImports.addAll(impSet);
		Collections.sort(newImports);

		// ---- 阶段 5：逐行生成输出，替换 ModelRenderer 字段类型，插入 createBodyLayer ----
		List<String> out = new ArrayList<>(nLines + parts.size() * 6 + 30);
		// 先填 package + imports 之前的行
		if (packageLine != -1) {
			for (int i = 0; i <= packageLine; i++) out.add(lines.get(i));
			if (packageLine + 1 < firstImportLine) {
				// 中间一般有空行；保留一个空行分隔 package 与 imports
				out.add("");
			}
		} else {
			for (int i = 0; i < firstImportLine; i++) out.add(lines.get(i));
		}
		out.addAll(newImports);
		// imports 结束到 classDeclLine 之间的空行/注释；保留 1 个空行
		out.add("");
		for (int i = (lastImportLine == -1 ? 0 : lastImportLine + 1); i < classDeclLine; i++) {
			String ln = lines.get(i);
			if (ln.trim().isEmpty()) continue; // 去除重复空行
			out.add(ln);
		}

		// 类声明行本身保留（不变）
		out.add(lines.get(classDeclLine));

		// 字段区：类声明之后到构造函数之前。
		// 逐行扫描，对字段声明做 ModelRenderer→ModelPart；其它注释/空行保留
		for (int i = classDeclLine + 1; i < constructorStart; i++) {
			String ln = lines.get(i);
			if (fieldLines.containsKey(i)) {
				// 做类型字面替换
				String outLn = ln.replace("ModelRenderer", NEW_TYPE_PART);
				out.add(outLn);
			} else {
				out.add(ln);
			}
		}

		// ---- 构造函数：替换为 (ModelPart root) + getChild 赋值 ----
		// 同时读取构造函数行前的注释/空行（已经在上面字段区输出了）
		out.add("");
		String indent = indentOf(lines.get(constructorStart));
		// 若原行有 public ClassName() { 则保留其注释尾，否则简单输出
		out.add(indent + "public " + className + "(ModelPart root) {");
		// 为所有字段做 getChild 赋值：parent==null 的顶层部件走 root.getChild，
		// 否则走 this.<parent>.getChild，必须与 createBodyLayer() 中 addOrReplaceChild
		// 的嵌套层级严格一致，否则运行时抛 NoSuchElementException。
		// 注意：必须按"父先于子"的顺序赋值，否则子部件访问 this.<parent> 时父字段仍为 null → NPE。
		// 因此采用与 createBodyLayer() 相同的 DFS 遍历顺序，而非字段声明顺序。
		List<String> orderedPartNames = partsInParentFirstOrder(parts);
		for (String partName : orderedPartNames) {
			PartRecord rec = parts.get(partName);
			String parentExpr = (rec.parent == null) ? "root" : ("this." + rec.parent);
			out.add(indent + "\tthis." + rec.name + " = " + parentExpr + ".getChild(\"" + rec.name + "\");");
		}
		out.add(indent + "}");
		out.add("");

		// ---- 插入静态 createBodyLayer() ----
		out.addAll(generateCreateBodyLayer(className, indent, texW, texH, parts, rep, fileName));
		out.add("");

		// ---- 方法区：构造函数结束 +1 到文件结束 ----
		for (int i = constructorEnd + 1; i < nLines; i++) {
			String ln = lines.get(i);

			// 方法签名替换：setupAnim / renderToBuffer / setRotationAngle 头部
			if (METHOD_SETUPANIM.matcher(ln).find()
					|| METHOD_RENDERTOBUF.matcher(ln).find()
					|| METHOD_SETROT_HEAD.matcher(ln).find()
					|| lineIsMethodBodyOfRender(ln, lines, i) // render() 方法（ComponentModel 等）头部
					) {
				ln = replaceParametricModelTypes(ln);
			} else {
				// 方法体内出现的局部变量/类型引用，不做激进替换；
				// 仅对确定的三种关键词在"类型上下文"（参数、返回类型（void 方法不存在）、局部变量声明）做保守替换
				ln = replaceTypeInDeclarationContext(ln);
			}
			out.add(ln);
		}

		// ---- 去除尾部连续空行 + 最后一行严格无空行 ----
		while (!out.isEmpty() && out.get(out.size() - 1).isEmpty()) out.remove(out.size() - 1);

		// 最后：统计 cube 总数
		for (PartRecord rec : parts.values()) rep.cubesTotal += rec.cubes.size();

		return String.join("\n", out);
	}

	// ------------- 工具函数 -------------

	private static String mapImportFqn(String fqn) {
		switch (fqn) {
			case OLD_PACKAGE_MODEL_RENDERER: return NEW_PACKAGE_MODEL_PART;
			case OLD_PACKAGE_MATRIX_STACK:   return NEW_PACKAGE_POSE_STACK;
			case OLD_PACKAGE_VERTEX:         return NEW_PACKAGE_VERTEX_CONS;
			default: return fqn;
		}
	}

	/**
	 * 解析 addBox 参数列表（6/7/8 参），并写入 PartRecord。
	 * 当 u==SENTINEL(-1000000) 且 v==SENTINEL 表示未调用 texOffs（纯 direct addBox），
	 * 此时走 uv=(0,0) 并打 warn。其他包括 u/v 为负的情形（Blockbench 偶见的负偏移合法 UV）
	 * 都按原值保留，不做回退修正，以免丢失真实 UV 信息。
	 */
	private static final int NO_TEXOFFS_SENTINEL = -1000000;
	private static void handleCube(Map<String, PartRecord> parts, ConversionReport rep,
								   String fileName, String partName, int u, int v, List<String> args) {
		PartRecord rec = parts.get(partName);
		if (rec == null) {
			rep.warnings++;
			rep.warnDetails.add(fileName + ": addBox 部件未知 '" + partName + "'");
			return;
		}
		int n = args.size();
		if (n < 6) {
			rep.warnings++;
			rep.warnDetails.add(fileName + "." + partName + " addBox 参数少于 6 个: " + args);
			return;
		}
		if (u == NO_TEXOFFS_SENTINEL && v == NO_TEXOFFS_SENTINEL) {
			rep.warnings++;
			rep.warnDetails.add(fileName + "." + partName + " 缺失 texOffs 标注，使用默认 (0,0)");
			u = 0; v = 0;
		}
		int[] cube = new int[10];
		cube[0] = u;
		cube[1] = v;
		float[] f = new float[n];
		for (int i = 0; i < n; i++) f[i] = parseFloatLiteral(args.get(i));
		// 前 6 个总是几何
		for (int i = 0; i < 6; i++) cube[2 + i] = Float.floatToIntBits(f[i]); // 以 IEEE 754 暂存以便统一整数比较
		String deltaLiteral;
		boolean mirror;
		if (n == 6) { deltaLiteral = "0.0F"; mirror = false; }
		else if (n == 7) { deltaLiteral = args.get(6).trim(); mirror = false; }
		else { deltaLiteral = args.get(6).trim(); mirror = parseBooleanLiteral(args.get(7).trim()); }
		cube[8] = Float.floatToIntBits(parseFloatLiteral(deltaLiteral));
		cube[9] = mirror ? 1 : 0;
		rec.cubes.add(cube);
		rec.cubeDeltaLiterals.add(deltaLiteral);
	}

	private static final Pattern BOOL_LIT = Pattern.compile("true|false", Pattern.CASE_INSENSITIVE);

	private static boolean parseBooleanLiteral(String lit) {
		Matcher m = BOOL_LIT.matcher(lit);
		if (m.matches()) return Boolean.parseBoolean(m.group());
		// 1/0
		try { return Integer.parseInt(lit) != 0; }
		catch (NumberFormatException e) { return false; }
	}

	private static final Pattern FLOAT_TOKEN = Pattern.compile("(-?\\d+(?:\\.\\d+)?(?:[eE][-+]?\\d+)?)\\s*[fFdDlL]?");

	private static float parseFloatLiteral(String lit) {
		lit = lit.trim();
		Matcher m = FLOAT_TOKEN.matcher(lit);
		if (!m.find()) return 0f;
		try {
			return Float.parseFloat(m.group(1));
		} catch (NumberFormatException e) {
			return 0f;
		}
	}

	private static List<String> splitCsv(String argsRaw) {
		List<String> out = new ArrayList<>();
		int depth = 0;
		StringBuilder cur = new StringBuilder();
		for (int i = 0; i < argsRaw.length(); i++) {
			char c = argsRaw.charAt(i);
			if      (c == '(') depth++;
			else if (c == ')') depth--;
			else if (c == ',' && depth == 0) {
				out.add(cur.toString());
				cur.setLength(0);
				continue;
			}
			cur.append(c);
		}
		if (cur.length() > 0) out.add(cur.toString());
		return out;
	}

	private static String indentOf(String line) {
		int i = 0;
		while (i < line.length() && (line.charAt(i) == ' ' || line.charAt(i) == '\t')) i++;
		return line.substring(0, i);
	}

	/**
	 * 按"父先于子"的 DFS 顺序输出所有部件名，与 createBodyLayer() 的 addOrReplaceChild
	 * 嵌套层级严格一致。用于构造函数中 getChild 赋值，保证 this.<parent> 在子部件
	 * 访问前已完成初始化，避免 NPE。
	 * 孤立部件（parent 指向不存在的父）退化为按 parts 插入序追加到末尾。
	 */
	private static List<String> partsInParentFirstOrder(Map<String, PartRecord> parts) {
		Map<String, List<String>> childrenOf = new LinkedHashMap<>();
		List<String> rootChildren = new ArrayList<>();
		for (PartRecord rec : parts.values()) {
			if (rec.parent == null) {
				rootChildren.add(rec.name);
			} else if (parts.containsKey(rec.parent)) {
				childrenOf.computeIfAbsent(rec.parent, k -> new ArrayList<>()).add(rec.name);
			} else {
				rootChildren.add(rec.name); // 父缺失时按根级处理，避免遗漏
			}
		}
		List<String> ordered = new ArrayList<>(parts.size());
		for (String rc : rootChildren) {
			collectDfs(rc, childrenOf, ordered);
		}
		return ordered;
	}

	private static void collectDfs(String partName, Map<String, List<String>> childrenOf, List<String> out) {
		out.add(partName);
		List<String> children = childrenOf.get(partName);
		if (children != null) {
			for (String ch : children) collectDfs(ch, childrenOf, out);
		}
	}

	/**
	 * 生成 public static LayerDefinition createBodyLayer() { ... } 代码块。
	 * 注意：所有部件统一挂到 root 下（即使有多层嵌套 parent → child），
	 * 因为 PartDefinition.addOrReplaceChild(name, cubes, pose) 返回子 PartDefinition 引用，
	 * 可以据此递归构建树。
	 */
	private static List<String> generateCreateBodyLayer(String className, String indent,
														int texW, int texH,
														Map<String, PartRecord> parts,
														ConversionReport rep,
														String fileName) {
		List<String> out = new ArrayList<>(parts.size() * 6 + 16);
		out.add(indent + "public static LayerDefinition createBodyLayer() {");
		out.add(indent + "\tMeshDefinition meshdefinition = new MeshDefinition();");
		out.add(indent + "\tPartDefinition partdefinition = meshdefinition.getRoot();");
		out.add(indent);

		// 先构建 parent→children 映射，root children = parent==null 的部件
		Map<String, List<String>> childrenOf = new LinkedHashMap<>();
		List<String> rootChildren = new ArrayList<>();
		for (PartRecord rec : parts.values()) {
			if (rec.parent == null) {
				rootChildren.add(rec.name);
			} else if (parts.containsKey(rec.parent)) {
				childrenOf.computeIfAbsent(rec.parent, k -> new ArrayList<>()).add(rec.name);
			} else {
				rootChildren.add(rec.name); // 父缺失时按根级处理，避免部件丢失
			}
		}
		// 深度优先：parent 必须先于其任何 child 定义
		Map<String, String> pdVarNames = new LinkedHashMap<>();
		String rootVar = "partdefinition";
		for (String rc : rootChildren) {
			emitPartTree(out, indent + "\t", rootVar, rc, parts, childrenOf, pdVarNames, rep, fileName);
		}
		out.add(indent + "\treturn LayerDefinition.create(meshdefinition, "
				+ texW + ", " + texH + ");");
		out.add(indent + "}");
		return out;
	}

	private static void emitPartTree(List<String> out, String indent, String parentVar,
									 String partName,
									 Map<String, PartRecord> parts,
									 Map<String, List<String>> childrenOf,
									 Map<String, String> pdVarNames,
									 ConversionReport rep,
									 String fileName) {
		PartRecord rec = parts.get(partName);
		if (rec == null) {
			rep.warnings++;
			rep.warnDetails.add(fileName + ": 部件定义缺失 '" + partName + "'");
			return;
		}
		String varName = pdVar(partName);
		pdVarNames.put(partName, varName);
		// --- 生成 cubes 表达式（CubeListBuilder.create().texOffs(...).mirror()?.addBox(...).mirror()?.addBox(...）链式） ---
		if (rec.cubes.isEmpty()) {
			// 纯骨骼：CubeListBuilder.create()（即无任何几何）
			out.add(indent + "PartDefinition " + varName + " = " + parentVar + ".addOrReplaceChild(\""
					+ partName + "\",");
			out.add(indent + "\tCubeListBuilder.create(),");
			out.add(indent + "\t" + partPoseLiteral(rec) + ");");
		} else {
			out.add(indent + "PartDefinition " + varName + " = " + parentVar + ".addOrReplaceChild(\""
					+ partName + "\",");
			StringBuilder line = new StringBuilder();
			line.append(indent).append("\tCubeListBuilder.create()");
			boolean builderOpen = true;
			for (int c = 0; c < rec.cubes.size(); c++) {
				int[] cube = rec.cubes.get(c);
				int u = cube[0], v = cube[1];
				float minX = Float.intBitsToFloat(cube[2]);
				float minY = Float.intBitsToFloat(cube[3]);
				float minZ = Float.intBitsToFloat(cube[4]);
				float w    = Float.intBitsToFloat(cube[5]);
				float h    = Float.intBitsToFloat(cube[6]);
				float d    = Float.intBitsToFloat(cube[7]);
				float delta = Float.intBitsToFloat(cube[8]);
				boolean mirror = cube[9] != 0;
				line.append("\n\t\t").append(indent).append(".texOffs(").append(u).append(", ").append(v).append(")");
				if (mirror) line.append(".mirror()");
				// addBox
				line.append(".addBox(");
				line.append(fmt(minX)).append(", ");
				line.append(fmt(minY)).append(", ");
				line.append(fmt(minZ)).append(", ");
				line.append(fmt(w)).append(", ");
				line.append(fmt(h)).append(", ");
				line.append(fmt(d));
				if (delta != 0f) {
					line.append(", new CubeDeformation(").append(rec.cubeDeltaLiterals.get(c)).append(")");
				}
				line.append(")");
			}
			line.append(",");
			out.add(line.toString());
			out.add(indent + "\t" + partPoseLiteral(rec) + ");");
		}
		// 递归子部件
		List<String> children = childrenOf.get(partName);
		if (children != null) {
			for (String ch : children) {
				emitPartTree(out, indent, varName, ch, parts, childrenOf, pdVarNames, rep, fileName);
			}
		}
	}

	private static String pdVar(String partName) {
		// 部件名多为 snake_case；避免与 java 关键字冲突，统一加后缀 _pd
		return partName + "_pd";
	}

	/**
	 * 对 1.16 的 setPos + setRotationAngle 合成为 PartPose.offset(...) 或 offsetAndRotation(...)。
	 * 保留原始字面量（避免因 float→double→float 的来回转换造成文字差异），
	 * 当所有旋转分量为默认 0.0F 时使用 offset 形式，否则 offsetAndRotation。
	 */
	private static String partPoseLiteral(PartRecord rec) {
		String px = rec.posX, py = rec.posY, pz = rec.posZ;
		String rx = rec.rotX, ry = rec.rotY, rz = rec.rotZ;
		boolean zeroRot = isZeroFloatLit(rx) && isZeroFloatLit(ry) && isZeroFloatLit(rz);
		if (zeroRot) {
			return "PartPose.offset(" + px + ", " + py + ", " + pz + ")";
		}
		return "PartPose.offsetAndRotation("
				+ px + ", " + py + ", " + pz + ", "
				+ rx + ", " + ry + ", " + rz + ")";
	}

	private static boolean isZeroFloatLit(String lit) {
		lit = lit.trim();
		// 0/0L/0f/0F/0.0/0d/0.00000F/0x0p1 等
		try {
			if (lit.matches("-?0+(\\.0+)?[fFdDlL]?")) return true;
			if (lit.matches("-?0\\.0[Ee][-+]?\\d+[fFdDlL]?")) return true;
			return Float.parseFloat(stripTypeSuffix(lit)) == 0f;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	private static String stripTypeSuffix(String lit) {
		lit = lit.trim();
		if (lit.isEmpty()) return lit;
		char c = lit.charAt(lit.length() - 1);
		if (c == 'f' || c == 'F' || c == 'd' || c == 'D' || c == 'l' || c == 'L') {
			return lit.substring(0, lit.length() - 1);
		}
		return lit;
	}

	/**
	 * 格式化 float，保留最多 4 位小数；整数打印紧凑；避免科学计数法。
	 * 对于 cube 的几何 minX/minY/... 等我们只还原字面量（不需要原 setPos 里的 F），
	 * 因为 1.19 CubeListBuilder 只吃 float 字面量即可。
	 */
	private static String fmt(float v) {
		if (v == (int) v && Math.abs(v) < 1e8) {
			return (int) v + ".0F";
		}
		String s = String.format(java.util.Locale.US, "%.6f", v);
		// 去除末尾 0
		while (s.contains(".") && (s.endsWith("0") || s.endsWith("."))) {
			if (s.endsWith(".")) { s = s.substring(0, s.length() - 1); break; }
			s = s.substring(0, s.length() - 1);
		}
		return s + "F";
	}

	/**
	 * 方法签名 / 行内类型名做批量替换（仅做"安全"的三种目标类型整词替换）。
	 */
	private static String replaceParametricModelTypes(String line) {
		return line
				.replace(OLD_TYPE_MATRIX, NEW_TYPE_POSE)
				.replace(OLD_TYPE_VB,     NEW_TYPE_VC)
				.replace(OLD_TYPE_RENDERER, NEW_TYPE_PART);
	}

	/**
	 * 对非方法签名行做"保守"类型替换：整词边界匹配，覆盖：
	 * <ul>
	 *   <li>局部变量声明：{@code ModelRenderer foo;}</li>
	 *   <li>泛型参数：{@code Optional<ModelRenderer>}</li>
	 *   <li>强转：{@code (ModelRenderer) obj}</li>
	 *   <li>数组：{@code ModelRenderer[]}</li>
	 *   <li>方法返回类型（非 void 方法）：{@code public ModelRenderer getX()}</li>
	 * </ul>
	 * 不触碰到方法名/字段名（因为大写开头的短名不会作为 Java 标识符的字段/方法出现）。
	 */
	private static String replaceTypeInDeclarationContext(String line) {
		return line
				.replaceAll("\\b" + OLD_TYPE_MATRIX   + "\\b", NEW_TYPE_POSE)
				.replaceAll("\\b" + OLD_TYPE_VB       + "\\b", NEW_TYPE_VC)
				.replaceAll("\\b" + OLD_TYPE_RENDERER + "\\b", NEW_TYPE_PART);
	}

	/**
	 * 浅层转换：仅 import 与类型标识符整词替换 + 去尾空行。
	 * 用于抽象基类（PVZEntityModel / PVZZombieModel / PVZPlantModel / ComponentModel 等）
	 * 以及未带 Blockbench 构造函数但仍引用旧类型的模型类。
	 * 不碰方法体内部的数值计算、副作用、渲染顺序。
	 *
	 * <p><b>替换顺序</b>：先替换 FQN（防止 FQN 里的短词被整词替换命中错误位置），
	 * 再替换短类型名（整词边界，覆盖 {@code Optional<ModelRenderer>}、
	 * {@code (ModelRenderer)x}、{@code ModelRenderer[]} 等无尾随空格的类型上下文）。
	 *
	 * @return 若源不包含任何旧类型或未发生任何变化，返回 null
	 */
	static String shallowRenameOnlyConvert(String source) {
		if (source == null) return null;
		boolean hasOld = source.contains(OLD_TYPE_RENDERER)
				|| source.contains(OLD_TYPE_MATRIX)
				|| source.contains(OLD_TYPE_VB)
				|| source.contains(OLD_PACKAGE_MODEL_RENDERER)
				|| source.contains(OLD_PACKAGE_MATRIX_STACK)
				|| source.contains(OLD_PACKAGE_VERTEX);
		if (!hasOld) return null;

		String out = source;
		// ---- Step 1：FQN import 优先替换（必须在短名替换之前） ----
		out = out.replace(OLD_PACKAGE_MODEL_RENDERER, NEW_PACKAGE_MODEL_PART);
		out = out.replace(OLD_PACKAGE_MATRIX_STACK,   NEW_PACKAGE_POSE_STACK);
		out = out.replace(OLD_PACKAGE_VERTEX,         NEW_PACKAGE_VERTEX_CONS);
		// ---- Step 2：短类型整词替换（覆盖泛型尖括号 / 强转 / 数组等上下文） ----
		out = out.replaceAll("\\b" + OLD_TYPE_RENDERER + "\\b", NEW_TYPE_PART);
		out = out.replaceAll("\\b" + OLD_TYPE_MATRIX   + "\\b", NEW_TYPE_POSE);
		out = out.replaceAll("\\b" + OLD_TYPE_VB       + "\\b", NEW_TYPE_VC);
		// 去尾空行
		String[] lines = out.split("\\R", -1);
		int end = lines.length;
		while (end > 0 && lines[end - 1].isEmpty()) end--;
		if (end != lines.length) {
			List<String> sub = new ArrayList<>(end);
            sub.addAll(Arrays.asList(lines).subList(0, end));
			out = String.join("\n", sub);
		}
		// 去 BOM
		if (!out.isEmpty() && out.charAt(0) == '\uFEFF') out = out.substring(1);
		// 若无差异则返回 null（避免写回）
		if (out.equals(source)) return null;
		return out;
	}

	/**
	 * 识别 ComponentModel#render(PoseStack,VertexConsumer,int,int) 之类的"render 方法"头部。
	 */
	private static boolean lineIsMethodBodyOfRender(String ln, List<String> allLines, int idx) {
		String t = ln.trim();
		if (!t.startsWith("public ") && !t.startsWith("void render(") && !t.contains(" render(")) return false;
		return t.contains("PoseStack") || t.contains("VertexConsumer");
	}

	private ModelConverter16to19() { /* 工具类不可实例化 */ }
}