package com.hungteen.pvz.client.model.armor;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;

import java.lang.reflect.Field;
import java.util.Map;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class FootballArmorModel extends HumanoidModel<LivingEntity> {
	private final ModelPart helmet;
	private final ModelPart chestplate;
	private final ModelPart right_hand_armor;
	private final ModelPart bone2;
	private final ModelPart left_hand_armor;
	private final ModelPart bone;
	private final EquipmentSlot slot;

	public FootballArmorModel(EquipmentSlot slot, float scale) {
		super(createHumanoidMesh().getRoot().bake(64, 64));
		this.slot = slot;

		ModelPart root = LayerDefinition.create(createMesh(), 64, 64).bakeRoot();
		helmet = root.getChild("helmet");
		chestplate = root.getChild("chestplate");
		right_hand_armor = root.getChild("right_hand_armor");
		bone2 = right_hand_armor.getChild("bone2");
		left_hand_armor = root.getChild("left_hand_armor");
		bone = left_hand_armor.getChild("bone");

		attachChild(this.head, "helmet", helmet);
		attachChild(this.body, "chestplate", chestplate);
		attachChild(this.rightArm, "right_hand_armor", right_hand_armor);
		attachChild(this.leftArm, "left_hand_armor", left_hand_armor);
	}

	private static MeshDefinition createHumanoidMesh() {
		MeshDefinition mesh = new MeshDefinition();
		PartDefinition root = mesh.getRoot();
		root.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.ZERO);
		root.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
		root.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.ZERO);
		root.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.ZERO);
		root.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.ZERO);
		root.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.ZERO);
		root.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.ZERO);
		return mesh;
	}

	private static MeshDefinition createMesh() {
		MeshDefinition mesh = new MeshDefinition();
		PartDefinition root = mesh.getRoot();

		root.addOrReplaceChild("helmet",
			CubeListBuilder.create()
				.texOffs(30, 54).addBox(-4.0F, -9.0F, -5.0F, 8.0F, 1.0F, 9.0F)
				.texOffs(46, 44).addBox(-4.0F, -8.0F, 4.0F, 8.0F, 8.0F, 1.0F)
				.texOffs(25, 36).addBox(-5.0F, -8.0F, -5.0F, 1.0F, 8.0F, 9.0F)
				.texOffs(0, 34).addBox(4.0F, -8.0F, -5.0F, 1.0F, 8.0F, 9.0F)
				.texOffs(45, 40).addBox(-4.0F, -1.0F, -5.0F, 8.0F, 1.0F, 1.0F)
				.texOffs(45, 37).addBox(-4.0F, -3.0F, -5.0F, 8.0F, 1.0F, 1.0F)
				.texOffs(40, 42).addBox(-3.0F, -2.0F, -5.0F, 1.0F, 1.0F, 1.0F)
				.texOffs(40, 39).addBox(2.0F, -2.0F, -5.0F, 1.0F, 1.0F, 1.0F)
				.texOffs(39, 36).addBox(-3.0F, -8.0F, -5.0F, 1.0F, 1.0F, 1.0F)
				.texOffs(58, 58).addBox(2.0F, -8.0F, -5.0F, 1.0F, 1.0F, 1.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));

		root.addOrReplaceChild("chestplate",
			CubeListBuilder.create()
				.texOffs(0, 51).addBox(-4.0F, -12.0F, -3.0F, 8.0F, 12.0F, 1.0F)
				.texOffs(0, 38).addBox(-4.0F, -12.0F, 2.0F, 8.0F, 12.0F, 1.0F)
				.texOffs(18, 38).addBox(-5.0F, -9.0F, -2.0F, 1.0F, 9.0F, 4.0F)
				.texOffs(18, 51).addBox(4.0F, -9.0F, -2.0F, 1.0F, 9.0F, 4.0F),
			PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition rightHandPd = root.addOrReplaceChild("right_hand_armor",
			CubeListBuilder.create()
				.texOffs(28, 43).addBox(-5.0F, -2.0F, -2.0F, 3.0F, 1.0F, 4.0F)
				.texOffs(28, 38).addBox(-2.0F, -2.0F, 2.0F, 4.0F, 4.0F, 1.0F)
				.texOffs(22, 33).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 1.0F, 4.0F)
				.texOffs(12, 33).addBox(-2.0F, -2.0F, -3.0F, 4.0F, 4.0F, 1.0F)
				.texOffs(8, 34).addBox(-3.0F, -2.0F, -3.0F, 1.0F, 3.0F, 1.0F)
				.texOffs(4, 35).addBox(-4.0F, -2.0F, -3.0F, 1.0F, 2.0F, 1.0F)
				.texOffs(0, 34).addBox(-5.0F, -2.0F, -3.0F, 1.0F, 1.0F, 1.0F)
				.texOffs(18, 39).addBox(-4.0F, -2.0F, 2.0F, 1.0F, 2.0F, 1.0F)
				.texOffs(24, 38).addBox(-3.0F, -2.0F, 2.0F, 1.0F, 3.0F, 1.0F)
				.texOffs(0, 36).addBox(-5.0F, -2.0F, 2.0F, 1.0F, 1.0F, 1.0F),
			PartPose.offset(-1.0F, -1.0F, 0.0F));

		rightHandPd.addOrReplaceChild("bone2",
			CubeListBuilder.create()
				.texOffs(28, 59).addBox(-3.5355F, -1.7071F, -2.0F, 4.0F, 1.0F, 4.0F),
			PartPose.offsetAndRotation(-3.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition leftHandPd = root.addOrReplaceChild("left_hand_armor",
			CubeListBuilder.create()
				.texOffs(50, 59).addBox(2.0F, -2.0F, -2.0F, 3.0F, 1.0F, 4.0F)
				.texOffs(48, 53).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 1.0F, 4.0F)
				.texOffs(54, 47).addBox(-2.0F, -2.0F, -3.0F, 4.0F, 4.0F, 1.0F)
				.texOffs(60, 42).addBox(2.0F, -2.0F, -3.0F, 1.0F, 3.0F, 1.0F)
				.texOffs(53, 42).addBox(3.0F, -2.0F, -3.0F, 1.0F, 2.0F, 1.0F)
				.texOffs(28, 48).addBox(4.0F, -2.0F, -3.0F, 1.0F, 1.0F, 1.0F)
				.texOffs(24, 51).addBox(3.0F, -2.0F, 2.0F, 1.0F, 2.0F, 1.0F)
				.texOffs(38, 40).addBox(2.0F, -2.0F, 2.0F, 1.0F, 3.0F, 1.0F)
				.texOffs(38, 38).addBox(4.0F, -2.0F, 2.0F, 1.0F, 1.0F, 1.0F)
				.texOffs(38, 33).addBox(-2.0F, -2.0F, 2.0F, 4.0F, 4.0F, 1.0F),
			PartPose.offset(1.0F, -1.0F, 0.0F));

		leftHandPd.addOrReplaceChild("bone",
			CubeListBuilder.create()
				.texOffs(28, 53).addBox(-0.4645F, -1.7071F, -2.0F, 4.0F, 1.0F, 4.0F),
			PartPose.offsetAndRotation(3.0F, 2.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

		return mesh;
	}

	public void setRotationAngle(ModelPart modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}

	private static void attachChild(ModelPart parent, String name, ModelPart child) {
		try {
			Field field = ModelPart.class.getDeclaredField("children");
			field.setAccessible(true);
			@SuppressWarnings("unchecked")
			Map<String, ModelPart> children = (Map<String, ModelPart>) field.get(parent);
			children.put(name, child);
		} catch (ReflectiveOperationException e) {
			throw new RuntimeException("Failed to attach ModelPart '" + name + "' to parent at runtime (1.19 ModelPart children is private)", e);
		}
	}

	@Override
	public void renderToBuffer(PoseStack matrixStackIn, VertexConsumer bufferIn, int packedLightIn, int packedOverlayIn,
			float red, float green, float blue, float alpha) {
		this.helmet.visible = this.slot == EquipmentSlot.HEAD;
		this.right_hand_armor.visible = this.slot == EquipmentSlot.CHEST;
		this.left_hand_armor.visible = this.slot == EquipmentSlot.CHEST;
		super.renderToBuffer(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
	}

}
