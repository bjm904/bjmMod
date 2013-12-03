package bjmMod.gui;

import org.lwjgl.opengl.GL11;

import bjmMod.ModInfo;
import bjmMod.blocks.TileEntityInverter;
import bjmMod.container.ContainerInverter;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

public class GuiInverter extends GuiContainer{
	
	public static final ResourceLocation texture = new ResourceLocation(ModInfo.texture, "textures/gui/inverter.png");
	
	public TileEntityInverter inverter;

	public GuiInverter(InventoryPlayer inventoryPlayer, TileEntityInverter entity) {
		super(new ContainerInverter(inventoryPlayer, entity));
		
		this.inverter = entity;
		
		this.xSize = 176;
		this.ySize = 166;
	}
	
	public void drawGuiContainerForegroundLayer(int par1, int par2){
		String name = this.inverter.isInvNameLocalized() ? this.inverter.getInvName() : I18n.getString(this.inverter.getInvName());
		
		this.fontRenderer.drawString(name, this.xSize / 2 - this.fontRenderer.getStringWidth(name) / 2, 6, 4210752);
		this.fontRenderer.drawString(I18n.getString("container.inventory"), 8, this.ySize-96+2, 4210752);
	}

	protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {
		GL11.glColor4f(1F, 1F, 1F, 1F);//RGBA
		
		mc.getTextureManager().bindTexture(texture);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		
		if(this.inverter.isBurning()){
			int k = this.inverter.getBurnTimeRemainingScaled(12);
			drawTexturedModalRect(guiLeft+56, guiTop+36+12-k, 176, 12-k, 14, k+2);//first set is where its drawing, second is where in the texture it starts reading, third is width and height //// DRAWING FIRE
		}
		
		int k = this.inverter.getCookProgressScaled(24);
		drawTexturedModalRect(guiLeft+79, guiTop+34, 176, 14, k+1, 16);//DRAW PROGRESS ARROW
	}

	
}