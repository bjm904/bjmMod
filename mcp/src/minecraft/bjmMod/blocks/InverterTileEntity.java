package bjmMod.blocks;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class InverterTileEntity extends TileEntity implements IInventory {
	private ItemStack[] inventory;

	
	public InverterTileEntity() {
		inventory = new ItemStack[3];
		}
	@Override
	public int getSizeInventory() {
	return inventory.length;
	}

	@Override
	public ItemStack getStackInSlot(int i) {
	return inventory[i];
	}

	@Override
	public ItemStack decrStackSize(int slot, int count) {
	ItemStack itemstack = getStackInSlot(slot);

	if(itemstack != null) {
	if(itemstack.stackSize <= count) {
	setInventorySlotContents(slot, null);
	} else {
	itemstack = itemstack.splitStack(count);
	onInventoryChanged();
	}
	}
	return itemstack;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int slot) {
	ItemStack itemstack = getStackInSlot(slot);
	setInventorySlotContents(slot, null);
	return itemstack;
	}

	@Override
	public void setInventorySlotContents(int slot, ItemStack itemstack) {
	inventory[slot] = itemstack;

	if(itemstack != null && itemstack.stackSize > getInventoryStackLimit()) {
	itemstack.stackSize = getInventoryStackLimit();
	}
	onInventoryChanged();
	}

	@Override
	public String getInvName() {
	return "Inverter";
	}

	@Override
	public boolean isInvNameLocalized() {
	return true;
	}

	@Override
	public int getInventoryStackLimit() {
	return 64;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer player) {
	return player.getDistanceSq(xCoord + 0.5D, yCoord + 0.5D, zCoord + 0.5D) <= 64;
	}

	@Override
	public void openChest() {}

	@Override
	public void closeChest() {}

	@Override
	public boolean isItemValidForSlot(int slot, ItemStack itemstack) {
	return true;
	}
	@Override
	public void writeToNBT(NBTTagCompound compound) {
		super.writeToNBT(compound);
		NBTTagList list = new NBTTagList();
		for(int i = 0; i < getSizeInventory(); i++) {
			  ItemStack itemstack = getStackInSlot(i);
			  if(itemstack != null) {
			  NBTTagCompound item = new NBTTagCompound();

			  item.setByte("SlotbjmModInverter", (byte) i);
			  itemstack.writeToNBT(item);

			  list.appendTag(item);
			}
		}
		compound.setTag("ItemsbjmModInverter", list);
	}
	@Override
	public void readFromNBT(NBTTagCompound compound) {
	  super.readFromNBT(compound);

	  NBTTagList list = compound.getTagList("ItemsbjmModInverter");

	  for(int i = 0; i < list.tagCount(); i++) {
	        NBTTagCompound item = (NBTTagCompound) list.tagAt(i);
	        int slot = item.getByte("SlotbjmModInverter");

	        if(slot >= 0 && slot < getSizeInventory()) {
	          setInventorySlotContents(slot, ItemStack.loadItemStackFromNBT(item));
	        }
	  }
	}
	}