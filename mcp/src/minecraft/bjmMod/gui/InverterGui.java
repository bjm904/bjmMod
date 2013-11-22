package bjmMod.gui;

import org.lwjgl.opengl.GL11;

import bjmMod.ModInfo;
import bjmMod.blocks.InverterTileEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class InverterGui extends GuiContainer {
	public static final ResourceLocation texture = new ResourceLocation(ModInfo.texture.toLowerCase(), "textures/gui/inverter.png");
	public InverterGui(InventoryPlayer invPlayer, InverterTileEntity entity) {
		super(new InverterContainer(invPlayer, entity));

		xSize = 176;
		ySize = 165;
		}
	@Override
	public void drawGuiContainerBackgroundLayer(float f, int j, int i) {
		GL11.glColor4f(1F, 1F, 1F, 1F);
		mc.getTextureManager().bindTexture(texture);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
	}
}
