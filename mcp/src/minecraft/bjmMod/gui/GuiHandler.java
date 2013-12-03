package bjmMod.gui;

import bjmMod.Ids;
import bjmMod.blocks.TileEntityInverter;
import bjmMod.container.ContainerInverter;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

public class GuiHandler implements IGuiHandler{
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
TileEntity entity = world.getBlockTileEntity(x, y, z);
		
		if(entity != null){
			switch(ID){
				case Ids.guiIdInverter:
					if(entity instanceof TileEntityInverter){
						return new ContainerInverter(player.inventory, (TileEntityInverter) entity);
					}
			}
		}
		return null;
	}

	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getBlockTileEntity(x, y, z);
		
		if(entity != null){
			switch(ID){
				case Ids.guiIdInverter:
					if(entity instanceof TileEntityInverter){
						return new GuiInverter(player.inventory, (TileEntityInverter) entity);
					}
			}
		}
		return null;
	}
	
}
