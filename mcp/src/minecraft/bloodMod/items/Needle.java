package bloodMod.items;

import bloodMod.bloodMod;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.InventoryPlayer;

public class Needle extends Item{
	public Needle(int par1) {
		super(par1);
		setCreativeTab(bloodMod.tabBlood);
	}

	public boolean itemInteractionForEntity(ItemStack itemstack, EntityPlayer player, EntityLivingBase target) {
		if(target.worldObj.isRemote) {
				if(target instanceof EntityChicken) {
					if(player.inventory.hasItemStack(new ItemStack(Items.bloodBagChicken,1,9))){
						player.inventory.consumeInventoryItem(Items.bloodBagChicken.itemID|9);
						player.inventory.addItemStackToInventory(new ItemStack(Items.bloodBagChicken,1,10));
					}
					else if(player.inventory.hasItemStack(new ItemStack(Items.bloodBagChicken,1,8))){
						player.inventory.consumeInventoryItem(Items.bloodBagChicken.itemID|8);
						player.inventory.addItemStackToInventory(new ItemStack(Items.bloodBagChicken,1,9));
					}
					else if(player.inventory.hasItemStack(new ItemStack(Items.bloodBagChicken,1,7))){
						player.inventory.consumeInventoryItem(Items.bloodBagChicken.itemID|7);
						player.inventory.addItemStackToInventory(new ItemStack(Items.bloodBagChicken,1,8));
					}
					else if(player.inventory.hasItemStack(new ItemStack(Items.bloodBagChicken,1,6))){
						player.addChatMessage("3-4");
						player.inventory.consumeInventoryItem(Items.bloodBagChicken.itemID|6);
						player.inventory.addItemStackToInventory(new ItemStack(Items.bloodBagChicken,1,7));
					}
					else if(player.inventory.hasItemStack(new ItemStack(Items.bloodBagChicken,1,5))){
						player.inventory.consumeInventoryItem(Items.bloodBagChicken.itemID|5);
						player.inventory.addItemStackToInventory(new ItemStack(Items.bloodBagChicken,1,6));
					}
					else if(player.inventory.hasItemStack(new ItemStack(Items.bloodBagChicken,1,4))){
						player.inventory.consumeInventoryItem(Items.bloodBagChicken.itemID|4);
						player.inventory.addItemStackToInventory(new ItemStack(Items.bloodBagChicken,1,5));
					}
					else if(player.inventory.hasItemStack(new ItemStack(Items.bloodBagChicken,1,3))){
						player.inventory.consumeInventoryItem(Items.bloodBagChicken.itemID|3);
						player.inventory.addItemStackToInventory(new ItemStack(Items.bloodBagChicken,1,4));
					}
					else if(player.inventory.hasItemStack(new ItemStack(Items.bloodBagChicken,1,2))){
						player.inventory.consumeInventoryItem(Items.bloodBagChicken.itemID|2);
						player.inventory.addItemStackToInventory(new ItemStack(Items.bloodBagChicken,1,3));
					}
					else if(player.inventory.hasItemStack(new ItemStack(Items.bloodBagChicken,1,1))){
						player.inventory.consumeInventoryItem(Items.bloodBagChicken.itemID|1);
						player.inventory.addItemStackToInventory(new ItemStack(Items.bloodBagChicken,1,2));
					}
					else if(player.inventory.hasItemStack(new ItemStack(Items.bloodBag,1,0))){
						player.inventory.consumeInventoryItem(Items.bloodBag.itemID|0);
						player.inventory.addItemStackToInventory(new ItemStack(Items.bloodBagChicken,1,1));
					}
				}
				return false;
		}
		else{return false;}
	}
}
