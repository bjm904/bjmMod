package bjmMod.tileEntity;
/*package bjmMod.BACKUP;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class InverterTileEntity extends TileEntity implements ISidedInventory {
	private ItemStack[] inventory;
    public int furnaceBurnTime;

    public int currentItemBurnTime;

	
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
	 private boolean canSmelt()
	    {
	        if (this.inventory[0] == null)
	        {
	            return false;
	        }
	        else
	        {
	            ItemStack itemstack = FurnaceRecipes.smelting().getSmeltingResult(this.inventory[0]);
	            if (itemstack == null) return false;
	            if (this.inventory[2] == null) return true;
	            if (!this.inventory[2].isItemEqual(itemstack)) return false;
	            int result = inventory[2].stackSize + itemstack.stackSize;
	            return (result <= getInventoryStackLimit() && result <= itemstack.getMaxStackSize());
	        }
	    }


	    public void smeltItem()
	    {
	        if (this.canSmelt())
	        {
	            ItemStack itemstack = FurnaceRecipes.smelting().getSmeltingResult(this.inventory[0]);

	            if (this.inventory[2] == null)
	            {
	                this.inventory[2] = itemstack.copy();
	            }
	            else if (this.inventory[2].isItemEqual(itemstack))
	            {
	                inventory[2].stackSize += itemstack.stackSize;
	            }

	            --this.inventory[0].stackSize;

	            if (this.inventory[0].stackSize <= 0)
	            {
	                this.inventory[0] = null;
	            }
	        }
	    }


	    public static int getItemBurnTime(ItemStack par0ItemStack)
	    {
	        if (par0ItemStack == null)
	        {
	            return 0;
	        }
	        else
	        {
	            int i = par0ItemStack.getItem().itemID;
	            Item item = par0ItemStack.getItem();

	            if (par0ItemStack.getItem() instanceof ItemBlock && Block.blocksList[i] != null)
	            {
	                Block block = Block.blocksList[i];

	                if (block == Block.woodSingleSlab)
	                {
	                    return 150;
	                }

	                if (block.blockMaterial == Material.wood)
	                {
	                    return 300;
	                }

	                if (block == Block.coalBlock)
	                {
	                    return 16000;
	                }
	            }

	            if (item instanceof ItemTool && ((ItemTool) item).getToolMaterialName().equals("WOOD")) return 200;
	            if (item instanceof ItemSword && ((ItemSword) item).getToolMaterialName().equals("WOOD")) return 200;
	            if (item instanceof ItemHoe && ((ItemHoe) item).getMaterialName().equals("WOOD")) return 200;
	            if (i == Item.stick.itemID) return 100;
	            if (i == Item.coal.itemID) return 1600;
	            if (i == Item.bucketLava.itemID) return 20000;
	            if (i == Block.sapling.blockID) return 100;
	            if (i == Item.blazeRod.itemID) return 2400;
	            return GameRegistry.getFuelValue(par0ItemStack);
	        }
	    }


	    public static boolean isItemFuel(ItemStack par0ItemStack)
	    {
	        return getItemBurnTime(par0ItemStack) > 0;
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
	@Override
	public int[] getAccessibleSlotsFromSide(int var1) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean canInsertItem(int i, ItemStack itemstack, int j) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean canExtractItem(int i, ItemStack itemstack, int j) {
		// TODO Auto-generated method stub
		return false;
	}
	}
	*/