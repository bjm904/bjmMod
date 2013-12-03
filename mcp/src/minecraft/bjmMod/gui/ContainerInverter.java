package bjmMod.gui;

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

public class ContainerInverter extends Container {
	
	private TileEntityInverter inverter;
	
	public int lastBurnTime;
	
	public int lastItemBurnTime;
	
	public int lasCookTime;
	
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
	}
	
	@SideOnly(Side.CLIENT)
	public void updateProgressBar(int slot, int newValue){
		if(slot == 0) this.inverter.cookTime = newValue;
		if(slot == 1) this.inverter.burnTime = newValue;
		if(slot == 2) this.inverter.currentItemBurnTime = newValue;
	}
	
	public ItemStack transferStackInSlot(EntityPlayer player, int slot){//Shift click
		return null;
	}

	public boolean canInteractWith(EntityPlayer entityplayer) {
		return this.inverter.isUseableByPlayer(entityplayer);
	}

}
