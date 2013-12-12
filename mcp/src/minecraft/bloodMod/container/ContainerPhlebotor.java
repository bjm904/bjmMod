package bloodMod.container;

import bloodMod.Analyze;
import bloodMod.Ids;
import bloodMod.PhlebotorSlot;
import bloodMod.items.Items;
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
		
		this.addSlotToContainer(new Slot(tileentity, 0, 5, 17));
		this.addSlotToContainer(new Slot(tileentity, 1, 105, 17));
		
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
	
	
	public void detectAndSendChanges(){
		super.detectAndSendChanges();//in container
	}
	
	public void checkStacksForNull(){
		for(int i=0;i<this.inventorySlots.size();i++){
			Slot slot = (Slot)this.inventorySlots.get(i);
			if(slot.getHasStack()){
				ItemStack itemstack = slot.getStack();
			
				if(itemstack.stackSize <= 0){
					slot.putStack((ItemStack)null);
				}
			}
		}
	}
	
	@Override
	public ItemStack slotClick(int slotnum, int par2, int par3, EntityPlayer player){
		checkStacksForNull();
		ItemStack itemstack = super.slotClick(slotnum, par2, par3, player);
		Slot slot;
		if(slotnum>=0){//Need this to work
		slot = (Slot)this.inventorySlots.get(slotnum);
		} else {
			return itemstack;
		}
		if(slot.getHasStack() == true && player.inventory.getItemStack() == null){
			ItemStack itemstack1 = slot.getStack();
			Slot slot0 = (Slot)this.inventorySlots.get(0);
			ItemStack itemstack0 = slot0.getStack();
			String[] names= {"aqua","archier","darkness","day","death","diamond","echo","end","fear","feather","flame","gunpowder","iron","light","race","spring","sugar","sustenance"};

			
			if(slotnum >= 2 && slotnum <= 19){
				int namenum=slotnum-2;
				Slot slot2 = (Slot)this.inventorySlots.get(slotnum+18);
				ItemStack itemstack2 = slot2.getStack();
				if(itemstack2 != null && itemstack1 != null){
					if(itemstack0.getTagCompound().getInteger(names[namenum])>0){
						itemstack0.getTagCompound().setInteger(names[namenum], itemstack0.getTagCompound().getInteger(names[namenum])-1);
					}
					itemstack2.stackSize++;
				}else if(itemstack2 == null){
					if(itemstack0.getTagCompound().getInteger(names[namenum])>0){
						itemstack0.getTagCompound().setInteger(names[namenum], itemstack0.getTagCompound().getInteger(names[namenum])-1);
					}
					slot2.putStack(new ItemStack(itemstack1.itemID, 1, itemstack1.getItemDamage()));
				}
				checkStacksForNull();
				return null;
			}else if(slotnum >= 20 && slotnum <= 38){
				int namenum=slotnum-20;
				if(itemstack1 != null){
					itemstack1.stackSize--;
					itemstack0.getTagCompound().setInteger(names[namenum], itemstack0.getTagCompound().getInteger(names[namenum])+1);
				}
				checkStacksForNull();
				return null;
			}
		}

		return itemstack;
		
	 }
	
	
	public ItemStack transferStackInSlot(EntityPlayer player, int clickedSlotNumber){//Shift click
		ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(clickedSlotNumber);
        
        if(slot != null && slot.getHasStack()){
                ItemStack itemstack1 = slot.getStack();
                itemstack = itemstack1.copy();
                
                if(clickedSlotNumber !=1 && clickedSlotNumber != 0){
                       	if(clickedSlotNumber >= 38 && clickedSlotNumber < 65){
                                if(!this.mergeItemStack(itemstack1, 65, 74, false)){
                                        return null;
                                }
                        }else if(clickedSlotNumber >=65 && clickedSlotNumber < 74){
                                if(!this.mergeItemStack(itemstack1, 38, 65, false)){
                                        return null;
                                }
                        }
                }else if(!this.mergeItemStack(itemstack1, 38, 65, false)){
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
