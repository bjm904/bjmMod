package bjmMod.container;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import bjmMod.blocks.TileEntityInverter;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

public class ContainerInverter extends Container {
	
	private TileEntityInverter inverter;
	
	public int lastBurnTime;
	
	public int lastItemBurnTime;
	
	public int lastCookTime;
	
	public ContainerInverter(InventoryPlayer inventory, TileEntityInverter tileentity){
		this.inverter = tileentity;
		
		this.addSlotToContainer(new Slot(tileentity, 0, 56, 17));
		this.addSlotToContainer(new Slot(tileentity, 1, 56, 53));
		this.addSlotToContainer(new SlotFurnace(inventory.player, tileentity, 2, 116, 35));
		
		for(int i=0;i<3;i++){
			for(int j=0;j<9;j++){
				this.addSlotToContainer(new Slot(inventory, j+i*9+9, 8+j*18, 84+i*18));
			}
		}
		
		for(int i=0;i<9;i++){
			this.addSlotToContainer(new Slot(inventory, i, 8+i*18, 142));
		}
	}
	
	public void addCraftingToCrafters(ICrafting icrafting){
		super.addCraftingToCrafters(icrafting);//in container
		icrafting.sendProgressBarUpdate(this, 0, this.inverter.cookTime);
		icrafting.sendProgressBarUpdate(this, 1, this.inverter.burnTime);
		icrafting.sendProgressBarUpdate(this, 2, this.inverter.currentItemBurnTime);
	}
	
	public void detectAndSendChanges(){
		super.detectAndSendChanges();//in container
		
		for(int i=0;i<this.crafters.size();i++){
			ICrafting icrafting = (ICrafting)this.crafters.get(i);
			
			if(this.lastCookTime != this.inverter.cookTime){
				icrafting.sendProgressBarUpdate(this, 0, this.inverter.cookTime);
			}
			if(this.lastBurnTime != this.inverter.burnTime){
				icrafting.sendProgressBarUpdate(this, 1, this.inverter.burnTime);
			}
			if(this.lastItemBurnTime != this.inverter.currentItemBurnTime){
				icrafting.sendProgressBarUpdate(this, 2, this.inverter.currentItemBurnTime);
			}
		}
		
		this.lastCookTime = this.inverter.cookTime;
		this.lastBurnTime = this.inverter.burnTime;
		this.lastItemBurnTime = this.inverter.currentItemBurnTime;
	}
	
	@SideOnly(Side.CLIENT)
	public void updateProgressBar(int slot, int newValue){
		if(slot == 0) this.inverter.cookTime = newValue;
		if(slot == 1) this.inverter.burnTime = newValue;
		if(slot == 2) this.inverter.currentItemBurnTime = newValue;
	}
	
	public ItemStack transferStackInSlot(EntityPlayer player, int clickedSlotNumber){//Shift click
		ItemStack itemstack = null;
		Slot slot = (Slot)this.inventorySlots.get(clickedSlotNumber);
		
		if(slot != null && slot.getHasStack()){
			ItemStack itemstack1 = slot.getStack();
			itemstack = itemstack1.copy();
			
			if(clickedSlotNumber == 2){
				if(!this.mergeItemStack(itemstack1, 3, 39, true)){///CHANGE ON CUSTOM SLOT 3 is starting slot
					return null;
				}
				
				slot.onSlotChange(itemstack1, itemstack);
			}else if(clickedSlotNumber !=1 && clickedSlotNumber != 0){
				if(FurnaceRecipes.smelting().getSmeltingResult(itemstack1) != null){
					if(!this.mergeItemStack(itemstack1, 0, 1, false)){
						return null;
					}
				}else if(TileEntityInverter.isItemFuel(itemstack1)){
					if(!this.mergeItemStack(itemstack1, 1, 2, false)){
						return null;
					}
				}else if(clickedSlotNumber >= 3 && clickedSlotNumber < 30){
					if(!this.mergeItemStack(itemstack1, 30, 39, false)){
						return null;
					}
				}else if(clickedSlotNumber >=30 && clickedSlotNumber < 39){
					if(!this.mergeItemStack(itemstack1, 3, 30, false)){
						return null;
					}
				}
			}else if(!this.mergeItemStack(itemstack1, 3, 39, false)){
				return null;
			}
			
			if(itemstack1.stackSize == 0){
				slot.putStack((ItemStack)null);
			}else{
				slot.onSlotChanged();
			}
			
			if(itemstack1.stackSize == itemstack.stackSize){
				return null;
			}
			
			slot.onPickupFromSlot(player, itemstack1);
		}
		
		
		return itemstack;
	}

	public boolean canInteractWith(EntityPlayer entityplayer) {
		return this.inverter.isUseableByPlayer(entityplayer);
	}

}
