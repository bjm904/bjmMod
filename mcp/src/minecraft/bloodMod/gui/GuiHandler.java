package bloodMod.gui;

import bloodMod.Ids;
import bloodMod.container.ContainerPhlebotor;
import bloodMod.tileEntity.TileEntityPhlebotor;
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
				case Ids.guiIdPhlebotor:
					if(entity instanceof TileEntityPhlebotor){
						return new ContainerPhlebotor(player.inventory, (TileEntityPhlebotor) entity);
					}
			}
		}
		return null;
	}

	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getBlockTileEntity(x, y, z);
		
		if(entity != null){
			switch(ID){
				case Ids.guiIdPhlebotor:
					if(entity instanceof TileEntityPhlebotor){
						return new GuiPhlebotor(player.inventory, (TileEntityPhlebotor) entity);
					}
			}
		}
		return null;
	}
	
}
