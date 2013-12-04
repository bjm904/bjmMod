package bloodMod.container;

import bloodMod.PhlebotorSlot;
import bloodMod.tileEntity.TileEntityPhlebotor;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

public class ContainerPhlebotor extends Container {
	
	private TileEntityPhlebotor phlebotor;
	
	public int lastBurnTime;
	
	public int lastItemBurnTime;
	
	public int lastCookTime;
	
	public ContainerPhlebotor(InventoryPlayer inventory, TileEntityPhlebotor tileentity){
		this.phlebotor = tileentity;
		
		this.addSlotToContainer(new PhlebotorSlot(tileentity, 0, 5, 17));
		this.addSlotToContainer(new PhlebotorSlot(tileentity, 1, 105, 17));
		
		for(int i=0;i<2;i++){
			for(int j=0;j<9;j++){
				this.addSlotToContainer(new PhlebotorSlot(tileentity, j+i*9+2, 8+j*18, 48+i*18));
			}
		}
		for(int i=0;i<2;i++){
			for(int j=0;j<9;j++){
				this.addSlotToContainer(new PhlebotorSlot(tileentity, j+i*9+20, 8+j*18, 95+i*18));
			}
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<9;j++){
				this.addSlotToContainer(new Slot(inventory, j+i*9+9, 8+j*18, 144+i*18));
			}
		}
		
		for(int i=0;i<9;i++){
			this.addSlotToContainer(new Slot(inventory, i, 8+i*18, 202));
		}
	}
	
	public void addCraftingToCrafters(ICrafting icrafting){
		super.addCraftingToCrafters(icrafting);//in container
		icrafting.sendProgressBarUpdate(this, 0, this.phlebotor.cookTime);
		icrafting.sendProgressBarUpdate(this, 1, this.phlebotor.burnTime);
		icrafting.sendProgressBarUpdate(this, 2, this.phlebotor.currentItemBurnTime);
	}
	
	public void detectAndSendChanges(){
		super.detectAndSendChanges();//in container
		
		for(int i=0;i<this.crafters.size();i++){
			ICrafting icrafting = (ICrafting)this.crafters.get(i);
			
			if(this.lastCookTime != this.phlebotor.cookTime){
				icrafting.sendProgressBarUpdate(this, 0, this.phlebotor.cookTime);
			}
			if(this.lastBurnTime != this.phlebotor.burnTime){
				icrafting.sendProgressBarUpdate(this, 1, this.phlebotor.burnTime);
			}
			if(this.lastItemBurnTime != this.phlebotor.currentItemBurnTime){
				icrafting.sendProgressBarUpdate(this, 2, this.phlebotor.currentItemBurnTime);
			}
		}
		
		this.lastCookTime = this.phlebotor.cookTime;
		this.lastBurnTime = this.phlebotor.burnTime;
		this.lastItemBurnTime = this.phlebotor.currentItemBurnTime;
	}
	
	@SideOnly(Side.CLIENT)
	public void updateProgressBar(int slot, int newValue){
		if(slot == 0) this.phlebotor.cookTime = newValue;
		if(slot == 1) this.phlebotor.burnTime = newValue;
		if(slot == 2) this.phlebotor.currentItemBurnTime = newValue;
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
				}else if(TileEntityPhlebotor.isItemFuel(itemstack1)){
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
		return this.phlebotor.isUseableByPlayer(entityplayer);
	}

}
