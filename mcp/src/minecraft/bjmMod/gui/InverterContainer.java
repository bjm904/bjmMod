package bjmMod.gui;

import bjmMod.blocks.InverterTileEntity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class InverterContainer extends Container {
	private InverterTileEntity inverter;
	public InverterContainer(InventoryPlayer invPlayer, InverterTileEntity entity) {
		this.inverter = entity;
			for(int x = 0; x < 9; x++) {
				this.addSlotToContainer(new Slot(invPlayer, x, 8+x*18, 142));
			}
			for(int y = 0; y < 3; y++) {
				  for(int x = 0; x < 9; x++) {
				        this.addSlotToContainer(new Slot(invPlayer, 9 + x + y * 9, 8 + x * 18, 84 + y * 18));
				  }
			}
			this.addSlotToContainer(new Slot(entity, 0, 56, 17));
			this.addSlotToContainer(new Slot(entity, 1, 56, 53));
			this.addSlotToContainer(new Slot(entity, 2, 116, 35));
	}
	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int i) {
		 Slot slot = getSlot(i);

		  if(slot != null && slot.getHasStack()) {
		        ItemStack itemstack = slot.getStack();
		        ItemStack result = itemstack.copy();

		        if(i >= 36) {
		          if(!mergeItemStack(itemstack, 0, 36, false)) {
		                return null;
		          }
		        } else if(!mergeItemStack(itemstack, 36, 36 + inverter.getSizeInventory(), false)) {
		          return null;
		        }

		        if(itemstack.stackSize == 0) {
		          slot.putStack(null);
		        } else {
		          slot.onSlotChanged();
		        }
		        slot.onPickupFromSlot(player, itemstack); 
		        return result;
		  }
		  return null;
	}
	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return inverter.isUseableByPlayer(player);
	}

}
