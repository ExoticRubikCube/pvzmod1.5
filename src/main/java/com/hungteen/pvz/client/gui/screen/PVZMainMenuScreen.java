package com.hungteen.pvz.client.gui.screen;

import com.hungteen.pvz.compat.patchouli.PVZPatchouliHandler;
import com.hungteen.pvz.utils.StringUtil;
import com.hungteen.pvz.utils.enums.Colors;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Vector3f;
import net.minecraft.Util;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.client.renderer.CubeMap;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.renderer.PanoramaRenderer; // 1.19.2 正确导包位置
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.internal.BrandingControl;

import java.util.Random;

@OnlyIn(Dist.CLIENT)
public class PVZMainMenuScreen extends TitleScreen {

    private static final CubeMap PANORAMA_RESOURCES = new CubeMap(StringUtil.prefix("textures/gui/mainmenu/panorama"));
    private static final ResourceLocation MINECRAFT_TITLE_TEXTURES = new ResourceLocation("minecraft", "textures/gui/title/minecraft.png");
    private String splashText;
    private final PanoramaRenderer panorama = new PanoramaRenderer(PANORAMA_RESOURCES);
    private final Random rand = new Random();

    public PVZMainMenuScreen() {
        if (splashText == null) {
            this.splashText = StringUtil.getRandomLangText(minecraft, rand, "splashes");
        }
    }

    @Override
    public void render(PoseStack stack, int mouseX, int mouseY, float partialTicks) {
        stack.pushPose();

        this.panorama.render(partialTicks, 1.0F);

        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderTexture(0, MINECRAFT_TITLE_TEXTURES);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);

        this.blit(stack, this.width / 2 - 274 / 2, 30, 0, 0, 155, 44);
        this.blit(stack, this.width / 2 - 274 / 2 + 155, 30, 0, 45, 155, 44);

        if (this.splashText != null) {
            stack.pushPose();
            stack.translate((float) (this.width / 2 + 90), 70.0F, 0.0F);
            stack.mulPose(Vector3f.ZP.rotationDegrees(-22.5F));
            float f2 = 1.8F - Mth.abs(Mth.sin((float) (Util.getMillis() % 1000L) / 1000.0F * ((float) Math.PI * 2F)) * 0.1F);
            f2 = f2 * 100.0F / (float) (this.font.width(this.splashText) + 32);
            stack.scale(f2, f2, f2);
            drawCenteredString(stack, this.font, this.splashText, 0, -8, 16776960);
            stack.popPose();
        }

        if (!PVZPatchouliHandler.isPatchouliLoaded()) {
            stack.pushPose();
            String tip = Component.translatable("help.pvz.patchouli").getString();
            drawString(stack, this.font, tip, this.width - this.font.width(tip) - 2, this.height - 20, Colors.RED);
            stack.popPose();
        }

        BrandingControl.forEachLine(true, true, (brdline, brd) ->
                drawString(stack, this.font, brd, 2, this.height - (10 + brdline * (this.font.lineHeight + 1)), 16777215)
        );
        BrandingControl.forEachAboveCopyrightLine((brdline, brd) ->
                drawString(stack, this.font, brd, this.width - font.width(brd), this.height - (10 + (brdline + 1) * (this.font.lineHeight + 1)), 16777215)
        );

        ForgeHooksClient.renderMainMenu(this, stack, this.font, this.width, this.height, mouseY);

        String s1 = "Copyright Mojang AB. Do not distribute!";
        drawString(stack, this.font, s1, this.width - this.font.width(s1) - 2, this.height - 10, 0xFFFFFFFF);

        super.render(stack, mouseX, mouseY, partialTicks);

        stack.popPose();
    }
}