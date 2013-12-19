package bloodMod.container;

import java.util.Random;

import bjmMod.Names;
import bloodMod.Analyze;
import bloodMod.Ids;
import bloodMod.ModInfo;
import bloodMod.PhlebotorSlot;
import bloodMod.items.Items;
import bloodMod.tileEntity.TileEntityPhlebotor;
import cpw.mods.fml.common.network.Player;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatMessageComponent;
import net.minecraft.util.ResourceLocation;

public class ContainerPhlebotor extends Container {
	
	private TileEntityPhlebotor phlebotor;
	
	public int lastBurnTime;
	
	public int lastItemBurnTime;
	
	public int lastCookTime;
	
	public ContainerPhlebotor(InventoryPlayer inventory, TileEntityPhlebotor tileentity){
		this.phlebotor = tileentity;
		
		this.addSlotToContainer(new Slot(tileentity, 0, 9, 19));
		this.addSlotToContainer(new Slot(tileentity, 1, 135, 19));
		
		for(int i=0;i<2;i++){
			for(int j=0;j<9;j++){
				this.addSlotToContainer(new PhlebotorSlot(tileentity, j+i*9+2, 8+j*18, 65+i*18));
			}
		}
		
		for(int i=0;i<2;i++){
			for(int j=0;j<9;j++){
				this.addSlotToContainer(new PhlebotorSlot(tileentity, j+i*9+20, 8+j*18, 115+i*18));
			}
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<9;j++){
				this.addSlotToContainer(new Slot(inventory, j+i*9+9, 8+j*18, 165+i*18));
			}
		}
		
		for(int i=0;i<9;i++){
			this.addSlotToContainer(new Slot(inventory, i, 8+i*18, 223));
		}
		
		for(int i=0;i<74;i++){
			Slot slot = (Slot)this.inventorySlots.get(i);
			ResourceLocation resource = new ResourceLocation(ModInfo.texture, "textures/gui/slotHolder.png");
			slot.setBackgroundIconTexture(resource);
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
		Slot slot = (Slot)this.inventorySlots.get(0);         
		if(slot.getHasStack()){
			ItemStack itemstack=slot.getStack();
			int setAmount=11;
			for(int i=10;i>0;i--){
				int checkParts = 0;
				for(int o=0;o<18;o++){
				//	checkParts += itemstack.getTagCompound().getInteger(i+"particle"+o);
				}
				//MinecraftServer.getServer().getConfigurationManager().sendChatMsg(ChatMessageComponent.createFromText(""+checkParts));
				if(checkParts == 0){
				//	setAmount=i;
				}
			}
			//MinecraftServer.getServer().getConfigurationManager().sendChatMsg(ChatMessageComponent.createFromText("Set Amount: "+setAmount));
			//NBTTagCompound nbtcopy = (NBTTagCompound) itemstack.stackTagCompound.copy();
			//slot.putStack(new ItemStack(itemstack.itemID, 1, setAmount-1));
			//slot.getStack().setTagCompound(nbtcopy);
		}
	}
	
	@Override
	public ItemStack slotClick(int slotnum, int par2, int par3, EntityPlayer player){
		checkStacksForNull();
		Random rand = new Random();
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
				
				if(slotnum >= 2 && slotnum <= 19){
					int namenum=slotnum-2;
					String removParticle = "";
					Slot slot2 = (Slot)this.inventorySlots.get(slotnum+18);
					ItemStack itemstack2 = slot2.getStack();
					for(int i=0;i<10;i++){
						if(itemstack0.getTagCompound().getInteger((itemstack0.getItemDamage()-i)+"particle"+namenum)>0){
							removParticle = (itemstack0.getItemDamage()-i)+"particle"+namenum;
							break;
						}
					}
					if(itemstack2 != null && itemstack1 != null && itemstack0 != null){
						if(itemstack0.getTagCompound().getInteger(removParticle)>0){
							itemstack0.getTagCompound().setInteger(removParticle, itemstack0.getTagCompound().getInteger(removParticle)-1);
						}
						itemstack2.stackSize++;
					}else if(itemstack2 == null && itemstack0 != null){
						if(itemstack0.getTagCompound().getInteger(removParticle)>0){
							itemstack0.getTagCompound().setInteger(removParticle, itemstack0.getTagCompound().getInteger(removParticle)-1);
						}
						slot2.putStack(new ItemStack(itemstack1.itemID, 1, itemstack1.getItemDamage()));
					}
					checkStacksForNull();
					return null;
				}else if(slotnum >= 20 && slotnum <= 38){
					if(itemstack1 != null && itemstack0 != null){
						if(player.capabilities.isCreativeMode || player.experienceLevel > 0)
						if(!player.capabilities.isCreativeMode) player.experienceLevel =-1;
						itemstack1.stackSize--;
						int level = rand.nextInt(itemstack0.getItemDamage()+1);
						itemstack0.getTagCompound().setInteger(level+"particle"+(slotnum-20), itemstack0.getTagCompound().getInteger(level+"particle"+(slotnum-20))+1);
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
