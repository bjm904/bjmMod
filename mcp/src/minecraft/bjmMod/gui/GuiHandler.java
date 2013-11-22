package bjmMod.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import bjmMod.bjmMod;
import bjmMod.blocks.InverterTileEntity;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

public class GuiHandler implements IGuiHandler {
	public GuiHandler() {
		NetworkRegistry.instance().registerGuiHandler(bjmMod.instance, this);
		}
	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getBlockTileEntity(x, y, z);

		switch(id) {
		case 0:
		if(entity != null && entity instanceof InverterTileEntity) {
		return new InverterContainer(player.inventory, (InverterTileEntity) entity);
		} else {
		return null;
		}
		default:
		return null;
		}
	}
	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getBlockTileEntity(x, y, z);

		switch(id) {
		case 0:
		if(entity != null && entity instanceof InverterTileEntity) {
		return new InverterGui(player.inventory, (InverterTileEntity) entity);
		} else {
		return null;
		}
		default:
		return null;
		}
		}
	}
