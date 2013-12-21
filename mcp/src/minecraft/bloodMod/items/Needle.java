package bloodMod.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import bloodMod.ModInfo;
import bloodMod.Names;
import bloodMod.bloodMod;

public class Needle extends Item{
	public Needle(int par1) {
		super(par1);
		setCreativeTab(bloodMod.tabBlood);
		setUnlocalizedName(Names.needle_unlocalizedName);
		setMaxDamage(30);
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(ModInfo.texture + ":" + Names.needle_unlocalizedName);
	}
	public int getIndexOfItem(EntityPlayer entityplayer, int itemID, int damage)
	{    
        for (int j = 0; j < entityplayer.inventory.mainInventory.length; ++j)
        {
            if (entityplayer.inventory.mainInventory[j] != null && entityplayer.inventory.mainInventory[j].itemID == itemID && entityplayer.inventory.mainInventory[j].getItemDamage() == damage)
            {
                return j;
            }
        }

        return -1;
	}
	public void onDraw(ItemStack itemstack, EntityPlayer player, EntityLivingBase target){
		target.worldObj.spawnParticle("reddust", target.posX,  target.posY+target.getEyeHeight()+0.2,  target.posZ, 0D, 0D, 0D);
		target.worldObj.spawnParticle("reddust", target.posX,  target.posY+target.getEyeHeight()+0.5,  target.posZ, 0D, 0D, 0D);
		target.performHurtAnimation();
		target.hurtTime = 20;
		target.setHealth(target.getHealth()-1);
		target.attackEntityAsMob(target);
		itemstack.damageItem(1, player);
	}
	public boolean itemInteractionForEntity(ItemStack itemstack, EntityPlayer player, EntityLivingBase target) {
		if(target.worldObj.isRemote) {
				if(target instanceof EntityBat) {
					int bagid = Items.bloodBagBat.itemID;
					
					for(int i=9;i>0;i--){
						int slotnum = this.getIndexOfItem(player, bagid, i);
						if(slotnum >= 0){
							Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
							ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
							int damage = itemstack1.getItemDamage();
							if(damage < 10){
								player.inventory.setInventorySlotContents(slotnum, new ItemStack(itemstack1.itemID, 1 , itemstack1.getItemDamage()+1));
								onDraw(itemstack, player, target);
								
								return true;
								
							}
						}
					}
					int slotnum = this.getIndexOfItem(player, Items.bloodBag.itemID, 0);
					if(slotnum >= 0){
						Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
						ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
						int damage = itemstack1.getItemDamage();
						if(damage < 10){
							player.inventory.setInventorySlotContents(slotnum, new ItemStack(bagid, 1 , 1));
							onDraw(itemstack, player, target);
							return true;
						}
					}
				}else if(target instanceof EntityBlaze) {
					int bagid = Items.bloodBagBlaze.itemID;
					
					for(int i=9;i>0;i--){
						int slotnum = this.getIndexOfItem(player, bagid, i);
						if(slotnum >= 0){
							Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
							ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
							int damage = itemstack1.getItemDamage();
							if(damage < 10){
								player.inventory.setInventorySlotContents(slotnum, new ItemStack(itemstack1.itemID, 1 , itemstack1.getItemDamage()+1));
								onDraw(itemstack, player, target);
								return true;
							}
						}
					}
					int slotnum = this.getIndexOfItem(player, Items.bloodBag.itemID, 0);
					if(slotnum >= 0){
						Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
						ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
						int damage = itemstack1.getItemDamage();
						if(damage < 10){
							player.inventory.setInventorySlotContents(slotnum, new ItemStack(bagid, 1 , 1));
							onDraw(itemstack, player, target);
							return true;
						}
					}
				}else if(target instanceof EntityCaveSpider) {
					int bagid = Items.bloodBagCaveSpider.itemID;
					
					for(int i=9;i>0;i--){
						int slotnum = this.getIndexOfItem(player, bagid, i);
						if(slotnum >= 0){
							Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
							ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
							int damage = itemstack1.getItemDamage();
							if(damage < 10){
								player.inventory.setInventorySlotContents(slotnum, new ItemStack(itemstack1.itemID, 1 , itemstack1.getItemDamage()+1));
								onDraw(itemstack, player, target);
								return true;
							}
						}
					}
					int slotnum = this.getIndexOfItem(player, Items.bloodBag.itemID, 0);
					if(slotnum >= 0){
						Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
						ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
						int damage = itemstack1.getItemDamage();
						if(damage < 10){
							player.inventory.setInventorySlotContents(slotnum, new ItemStack(bagid, 1 , 1));
							onDraw(itemstack, player, target);
							return true;
						}
					}
				}else if(target instanceof EntityChicken) {
					int bagid = Items.bloodBagChicken.itemID;
					
					for(int i=9;i>0;i--){
						int slotnum = this.getIndexOfItem(player, bagid, i);
						if(slotnum >= 0){
							Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
							ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
							int damage = itemstack1.getItemDamage();
							if(damage < 10){
								player.inventory.setInventorySlotContents(slotnum, new ItemStack(itemstack1.itemID, 1 , itemstack1.getItemDamage()+1));
								onDraw(itemstack, player, target);
								
								return true;
							}
						}
					}
					int slotnum = this.getIndexOfItem(player, Items.bloodBag.itemID, 0);
					if(slotnum >= 0){
						Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
						ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
						int damage = itemstack1.getItemDamage();
						if(damage < 10){
							player.inventory.setInventorySlotContents(slotnum, new ItemStack(bagid, 1 , 1));
							onDraw(itemstack, player, target);
							return true;
						}
					}
				}else if(target instanceof EntityCow) {
					int bagid = Items.bloodBagCow.itemID;
					
					for(int i=9;i>0;i--){
						int slotnum = this.getIndexOfItem(player, bagid, i);
						if(slotnum >= 0){
							Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
							ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
							int damage = itemstack1.getItemDamage();
							if(damage < 10){
								player.inventory.setInventorySlotContents(slotnum, new ItemStack(itemstack1.itemID, 1 , itemstack1.getItemDamage()+1));
								onDraw(itemstack, player, target);
								return true;
							}
						}
					}
					int slotnum = this.getIndexOfItem(player, Items.bloodBag.itemID, 0);
					if(slotnum >= 0){
						Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
						ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
						int damage = itemstack1.getItemDamage();
						if(damage < 10){
							player.inventory.setInventorySlotContents(slotnum, new ItemStack(bagid, 1 , 1));
							onDraw(itemstack, player, target);
							return true;
						}
					}
				}else if(target instanceof EntityCreeper) {
					int bagid = Items.bloodBagCreeper.itemID;
					
					for(int i=9;i>0;i--){
						int slotnum = this.getIndexOfItem(player, bagid, i);
						if(slotnum >= 0){
							Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
							ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
							int damage = itemstack1.getItemDamage();
							if(damage < 10){
								player.inventory.setInventorySlotContents(slotnum, new ItemStack(itemstack1.itemID, 1 , itemstack1.getItemDamage()+1));
								onDraw(itemstack, player, target);
								return true;
							}
						}
					}
					int slotnum = this.getIndexOfItem(player, Items.bloodBag.itemID, 0);
					if(slotnum >= 0){
						Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
						ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
						int damage = itemstack1.getItemDamage();
						if(damage < 10){
							player.inventory.setInventorySlotContents(slotnum, new ItemStack(bagid, 1 , 1));
							onDraw(itemstack, player, target);
							return true;
						}
					}
				}else if(target instanceof EntityDragon) {
					int bagid = Items.bloodBagEnderDragon.itemID;
					
					for(int i=9;i>0;i--){
						int slotnum = this.getIndexOfItem(player, bagid, i);
						if(slotnum >= 0){
							Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
							ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
							int damage = itemstack1.getItemDamage();
							if(damage < 10){
								player.inventory.setInventorySlotContents(slotnum, new ItemStack(itemstack1.itemID, 1 , itemstack1.getItemDamage()+1));
								onDraw(itemstack, player, target);
								return true;
							}
						}
					}
					int slotnum = this.getIndexOfItem(player, Items.bloodBag.itemID, 0);
					if(slotnum >= 0){
						Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
						ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
						int damage = itemstack1.getItemDamage();
						if(damage < 10){
							player.inventory.setInventorySlotContents(slotnum, new ItemStack(bagid, 1 , 1));
							onDraw(itemstack, player, target);
							return true;
						}
					}
				}else if(target instanceof EntityEnderman) {
					int bagid = Items.bloodBagEnderman.itemID;
					
					for(int i=9;i>0;i--){
						int slotnum = this.getIndexOfItem(player, bagid, i);
						if(slotnum >= 0){
							Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
							ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
							int damage = itemstack1.getItemDamage();
							if(damage < 10){
								player.inventory.setInventorySlotContents(slotnum, new ItemStack(itemstack1.itemID, 1 , itemstack1.getItemDamage()+1));
								onDraw(itemstack, player, target);
								return true;
							}
						}
					}
					int slotnum = this.getIndexOfItem(player, Items.bloodBag.itemID, 0);
					if(slotnum >= 0){
						Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
						ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
						int damage = itemstack1.getItemDamage();
						if(damage < 10){
							player.inventory.setInventorySlotContents(slotnum, new ItemStack(bagid, 1 , 1));
							onDraw(itemstack, player, target);
							return true;
						}
					}
				}else if(target instanceof EntityGhast) {
					int bagid = Items.bloodBagGhast.itemID;
					
					for(int i=9;i>0;i--){
						int slotnum = this.getIndexOfItem(player, bagid, i);
						if(slotnum >= 0){
							Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
							ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
							int damage = itemstack1.getItemDamage();
							if(damage < 10){
								player.inventory.setInventorySlotContents(slotnum, new ItemStack(itemstack1.itemID, 1 , itemstack1.getItemDamage()+1));
								onDraw(itemstack, player, target);
								return true;
							}
						}
					}
					int slotnum = this.getIndexOfItem(player, Items.bloodBag.itemID, 0);
					if(slotnum >= 0){
						Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
						ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
						int damage = itemstack1.getItemDamage();
						if(damage < 10){
							player.inventory.setInventorySlotContents(slotnum, new ItemStack(bagid, 1 , 1));
							onDraw(itemstack, player, target);
							return true;
						}
					}
				}else if(target instanceof EntityHorse) {
					int bagid = Items.bloodBagHorse.itemID;
					
					for(int i=9;i>0;i--){
						int slotnum = this.getIndexOfItem(player, bagid, i);
						if(slotnum >= 0){
							Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
							ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
							int damage = itemstack1.getItemDamage();
							if(damage < 10){
								player.inventory.setInventorySlotContents(slotnum, new ItemStack(itemstack1.itemID, 1 , itemstack1.getItemDamage()+1));
								onDraw(itemstack, player, target);
								return true;
							}
						}
					}
					int slotnum = this.getIndexOfItem(player, Items.bloodBag.itemID, 0);
					if(slotnum >= 0){
						Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
						ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
						int damage = itemstack1.getItemDamage();
						if(damage < 10){
							player.inventory.setInventorySlotContents(slotnum, new ItemStack(bagid, 1 , 1));
							onDraw(itemstack, player, target);
							return true;
						}
					}
				}else if(target instanceof EntityIronGolem) {
					int bagid = Items.bloodBagIronGolem.itemID;
					
					for(int i=9;i>0;i--){
						int slotnum = this.getIndexOfItem(player, bagid, i);
						if(slotnum >= 0){
							Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
							ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
							int damage = itemstack1.getItemDamage();
							if(damage < 10){
								player.inventory.setInventorySlotContents(slotnum, new ItemStack(itemstack1.itemID, 1 , itemstack1.getItemDamage()+1));
								onDraw(itemstack, player, target);
								return true;
							}
						}
					}
					int slotnum = this.getIndexOfItem(player, Items.bloodBag.itemID, 0);
					if(slotnum >= 0){
						Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
						ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
						int damage = itemstack1.getItemDamage();
						if(damage < 10){
							player.inventory.setInventorySlotContents(slotnum, new ItemStack(bagid, 1 , 1));
							onDraw(itemstack, player, target);
							return true;
						}
					}
				}else if(target instanceof EntityMagmaCube) {
					int bagid = Items.bloodBagMagmaCube.itemID;
					
					for(int i=9;i>0;i--){
						int slotnum = this.getIndexOfItem(player, bagid, i);
						if(slotnum >= 0){
							Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
							ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
							int damage = itemstack1.getItemDamage();
							if(damage < 10){
								player.inventory.setInventorySlotContents(slotnum, new ItemStack(itemstack1.itemID, 1 , itemstack1.getItemDamage()+1));
								onDraw(itemstack, player, target);
								return true;
							}
						}
					}
					int slotnum = this.getIndexOfItem(player, Items.bloodBag.itemID, 0);
					if(slotnum >= 0){
						Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
						ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
						int damage = itemstack1.getItemDamage();
						if(damage < 10){
							player.inventory.setInventorySlotContents(slotnum, new ItemStack(bagid, 1 , 1));
							onDraw(itemstack, player, target);
							return true;
						}
					}
				}else if(target instanceof EntityMooshroom) {
					int bagid = Items.bloodBagMooshroom.itemID;
					
					for(int i=9;i>0;i--){
						int slotnum = this.getIndexOfItem(player, bagid, i);
						if(slotnum >= 0){
							Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
							ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
							int damage = itemstack1.getItemDamage();
							if(damage < 10){
								player.inventory.setInventorySlotContents(slotnum, new ItemStack(itemstack1.itemID, 1 , itemstack1.getItemDamage()+1));
								onDraw(itemstack, player, target);
								return true;
							}
						}
					}
					int slotnum = this.getIndexOfItem(player, Items.bloodBag.itemID, 0);
					if(slotnum >= 0){
						Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
						ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
						int damage = itemstack1.getItemDamage();
						if(damage < 10){
							player.inventory.setInventorySlotContents(slotnum, new ItemStack(bagid, 1 , 1));
							onDraw(itemstack, player, target);
							return true;
						}
					}
				}else if(target instanceof EntityOcelot) {
					int bagid = Items.bloodBagOcelot.itemID;
					
					for(int i=9;i>0;i--){
						int slotnum = this.getIndexOfItem(player, bagid, i);
						if(slotnum >= 0){
							Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
							ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
							int damage = itemstack1.getItemDamage();
							if(damage < 10){
								player.inventory.setInventorySlotContents(slotnum, new ItemStack(itemstack1.itemID, 1 , itemstack1.getItemDamage()+1));
								onDraw(itemstack, player, target);
								return true;
							}
						}
					}
					int slotnum = this.getIndexOfItem(player, Items.bloodBag.itemID, 0);
					if(slotnum >= 0){
						Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
						ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
						int damage = itemstack1.getItemDamage();
						if(damage < 10){
							player.inventory.setInventorySlotContents(slotnum, new ItemStack(bagid, 1 , 1));
							onDraw(itemstack, player, target);
							return true;
						}
					}
				}else if(target instanceof EntityPig) {
					int bagid = Items.bloodBagPig.itemID;
					
					for(int i=9;i>0;i--){
						int slotnum = this.getIndexOfItem(player, bagid, i);
						if(slotnum >= 0){
							Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
							ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
							int damage = itemstack1.getItemDamage();
							if(damage < 10){
								player.inventory.setInventorySlotContents(slotnum, new ItemStack(itemstack1.itemID, 1 , itemstack1.getItemDamage()+1));
								onDraw(itemstack, player, target);
								return true;
							}
						}
					}
					int slotnum = this.getIndexOfItem(player, Items.bloodBag.itemID, 0);
					if(slotnum >= 0){
						Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
						ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
						int damage = itemstack1.getItemDamage();
						if(damage < 10){
							player.inventory.setInventorySlotContents(slotnum, new ItemStack(bagid, 1 , 1));
							onDraw(itemstack, player, target);
							return true;
						}
					}
				}else if(target instanceof EntitySheep) {
					int bagid = Items.bloodBagSheep.itemID;
					
					for(int i=9;i>0;i--){
						int slotnum = this.getIndexOfItem(player, bagid, i);
						if(slotnum >= 0){
							Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
							ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
							int damage = itemstack1.getItemDamage();
							if(damage < 10){
								player.inventory.setInventorySlotContents(slotnum, new ItemStack(itemstack1.itemID, 1 , itemstack1.getItemDamage()+1));
								onDraw(itemstack, player, target);
								return true;
							}
						}
					}
					int slotnum = this.getIndexOfItem(player, Items.bloodBag.itemID, 0);
					if(slotnum >= 0){
						Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
						ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
						int damage = itemstack1.getItemDamage();
						if(damage < 10){
							player.inventory.setInventorySlotContents(slotnum, new ItemStack(bagid, 1 , 1));
							onDraw(itemstack, player, target);
							return true;
						}
					}
				}else if(target instanceof EntitySilverfish) {
					int bagid = Items.bloodBagSilverfish.itemID;
					
					for(int i=9;i>0;i--){
						int slotnum = this.getIndexOfItem(player, bagid, i);
						if(slotnum >= 0){
							Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
							ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
							int damage = itemstack1.getItemDamage();
							if(damage < 10){
								player.inventory.setInventorySlotContents(slotnum, new ItemStack(itemstack1.itemID, 1 , itemstack1.getItemDamage()+1));
								onDraw(itemstack, player, target);
								return true;
							}
						}
					}
					int slotnum = this.getIndexOfItem(player, Items.bloodBag.itemID, 0);
					if(slotnum >= 0){
						Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
						ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
						int damage = itemstack1.getItemDamage();
						if(damage < 10){
							player.inventory.setInventorySlotContents(slotnum, new ItemStack(bagid, 1 , 1));
							onDraw(itemstack, player, target);
							return true;
						}
					}
				}else if(target instanceof EntitySkeleton) {
					int bagid = Items.bloodBagSkeleton.itemID;
					
					for(int i=9;i>0;i--){
						int slotnum = this.getIndexOfItem(player, bagid, i);
						if(slotnum >= 0){
							Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
							ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
							int damage = itemstack1.getItemDamage();
							if(damage < 10){
								player.inventory.setInventorySlotContents(slotnum, new ItemStack(itemstack1.itemID, 1 , itemstack1.getItemDamage()+1));
								onDraw(itemstack, player, target);
								return true;
							}
						}
					}
					int slotnum = this.getIndexOfItem(player, Items.bloodBag.itemID, 0);
					if(slotnum >= 0){
						Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
						ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
						int damage = itemstack1.getItemDamage();
						if(damage < 10){
							player.inventory.setInventorySlotContents(slotnum, new ItemStack(bagid, 1 , 1));
							onDraw(itemstack, player, target);
							return true;
						}
					}
				}else if(target instanceof EntitySlime) {
					int bagid = Items.bloodBagSlime.itemID;
					
					for(int i=9;i>0;i--){
						int slotnum = this.getIndexOfItem(player, bagid, i);
						if(slotnum >= 0){
							Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
							ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
							int damage = itemstack1.getItemDamage();
							if(damage < 10){
								player.inventory.setInventorySlotContents(slotnum, new ItemStack(itemstack1.itemID, 1 , itemstack1.getItemDamage()+1));
								onDraw(itemstack, player, target);
								return true;
							}
						}
					}
					int slotnum = this.getIndexOfItem(player, Items.bloodBag.itemID, 0);
					if(slotnum >= 0){
						Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
						ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
						int damage = itemstack1.getItemDamage();
						if(damage < 10){
							player.inventory.setInventorySlotContents(slotnum, new ItemStack(bagid, 1 , 1));
							onDraw(itemstack, player, target);
							return true;
						}
					}
				}else if(target instanceof EntitySnowman) {
					int bagid = Items.bloodBagSnowGolem.itemID;
					
					for(int i=9;i>0;i--){
						int slotnum = this.getIndexOfItem(player, bagid, i);
						if(slotnum >= 0){
							Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
							ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
							int damage = itemstack1.getItemDamage();
							if(damage < 10){
								player.inventory.setInventorySlotContents(slotnum, new ItemStack(itemstack1.itemID, 1 , itemstack1.getItemDamage()+1));
								onDraw(itemstack, player, target);
								return true;
							}
						}
					}
					int slotnum = this.getIndexOfItem(player, Items.bloodBag.itemID, 0);
					if(slotnum >= 0){
						Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
						ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
						int damage = itemstack1.getItemDamage();
						if(damage < 10){
							player.inventory.setInventorySlotContents(slotnum, new ItemStack(bagid, 1 , 1));
							onDraw(itemstack, player, target);
							return true;
						}
					}
				}else if(target instanceof EntitySpider) {
					int bagid = Items.bloodBagSpider.itemID;
					
					for(int i=9;i>0;i--){
						int slotnum = this.getIndexOfItem(player, bagid, i);
						if(slotnum >= 0){
							Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
							ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
							int damage = itemstack1.getItemDamage();
							if(damage < 10){
								player.inventory.setInventorySlotContents(slotnum, new ItemStack(itemstack1.itemID, 1 , itemstack1.getItemDamage()+1));
								onDraw(itemstack, player, target);
								return true;
							}
						}
					}
					int slotnum = this.getIndexOfItem(player, Items.bloodBag.itemID, 0);
					if(slotnum >= 0){
						Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
						ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
						int damage = itemstack1.getItemDamage();
						if(damage < 10){
							player.inventory.setInventorySlotContents(slotnum, new ItemStack(bagid, 1 , 1));
							onDraw(itemstack, player, target);
							return true;
						}
					}
				}else if(target instanceof EntitySquid) {
					int bagid = Items.bloodBagSquid.itemID;
					
					for(int i=9;i>0;i--){
						int slotnum = this.getIndexOfItem(player, bagid, i);
						if(slotnum >= 0){
							Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
							ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
							int damage = itemstack1.getItemDamage();
							if(damage < 10){
								player.inventory.setInventorySlotContents(slotnum, new ItemStack(itemstack1.itemID, 1 , itemstack1.getItemDamage()+1));
								onDraw(itemstack, player, target);
								return true;
							}
						}
					}
					int slotnum = this.getIndexOfItem(player, Items.bloodBag.itemID, 0);
					if(slotnum >= 0){
						Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
						ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
						int damage = itemstack1.getItemDamage();
						if(damage < 10){
							player.inventory.setInventorySlotContents(slotnum, new ItemStack(bagid, 1 , 1));
							onDraw(itemstack, player, target);
							return true;
						}
					}
				}else if(target instanceof EntityVillager) {
					int bagid = Items.bloodBagVillager.itemID;
					
					for(int i=9;i>0;i--){
						int slotnum = this.getIndexOfItem(player, bagid, i);
						if(slotnum >= 0){
							Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
							ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
							int damage = itemstack1.getItemDamage();
							if(damage < 10){
								player.inventory.setInventorySlotContents(slotnum, new ItemStack(itemstack1.itemID, 1 , itemstack1.getItemDamage()+1));
								onDraw(itemstack, player, target);
								return true;
							}
						}
					}
					int slotnum = this.getIndexOfItem(player, Items.bloodBag.itemID, 0);
					if(slotnum >= 0){
						Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
						ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
						int damage = itemstack1.getItemDamage();
						if(damage < 10){
							player.inventory.setInventorySlotContents(slotnum, new ItemStack(bagid, 1 , 1));
							onDraw(itemstack, player, target);
							return true;
						}
					}
				}else if(target instanceof EntityWitch) {
					int bagid = Items.bloodBagWitch.itemID;
					
					for(int i=9;i>0;i--){
						int slotnum = this.getIndexOfItem(player, bagid, i);
						if(slotnum >= 0){
							Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
							ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
							int damage = itemstack1.getItemDamage();
							if(damage < 10){
								player.inventory.setInventorySlotContents(slotnum, new ItemStack(itemstack1.itemID, 1 , itemstack1.getItemDamage()+1));
								onDraw(itemstack, player, target);
								return true;
							}
						}
					}
					int slotnum = this.getIndexOfItem(player, Items.bloodBag.itemID, 0);
					if(slotnum >= 0){
						Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
						ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
						int damage = itemstack1.getItemDamage();
						if(damage < 10){
							player.inventory.setInventorySlotContents(slotnum, new ItemStack(bagid, 1 , 1));
							onDraw(itemstack, player, target);
							return true;
						}
					}
				}else if(target instanceof EntityWither) {
					int bagid = Items.bloodBagWither.itemID;
					
					for(int i=9;i>0;i--){
						int slotnum = this.getIndexOfItem(player, bagid, i);
						if(slotnum >= 0){
							Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
							ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
							int damage = itemstack1.getItemDamage();
							if(damage < 10){
								player.inventory.setInventorySlotContents(slotnum, new ItemStack(itemstack1.itemID, 1 , itemstack1.getItemDamage()+1));
								onDraw(itemstack, player, target);
								return true;
							}
						}
					}
					int slotnum = this.getIndexOfItem(player, Items.bloodBag.itemID, 0);
					if(slotnum >= 0){
						Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
						ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
						int damage = itemstack1.getItemDamage();
						if(damage < 10){
							player.inventory.setInventorySlotContents(slotnum, new ItemStack(bagid, 1 , 1));
							onDraw(itemstack, player, target);
							return true;
						}
					}
				}else if(target instanceof EntityWither) {
					int bagid = Items.bloodBagWitherSkeleton.itemID;
					
					for(int i=9;i>0;i--){
						int slotnum = this.getIndexOfItem(player, bagid, i);
						if(slotnum >= 0){
							Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
							ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
							int damage = itemstack1.getItemDamage();
							if(damage < 10){
								player.inventory.setInventorySlotContents(slotnum, new ItemStack(itemstack1.itemID, 1 , itemstack1.getItemDamage()+1));
								onDraw(itemstack, player, target);
								return true;
							}
						}
					}
					int slotnum = this.getIndexOfItem(player, Items.bloodBag.itemID, 0);
					if(slotnum >= 0){
						Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
						ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
						int damage = itemstack1.getItemDamage();
						if(damage < 10){
							player.inventory.setInventorySlotContents(slotnum, new ItemStack(bagid, 1 , 1));
							onDraw(itemstack, player, target);
							return true;
						}
					}
				}else if(target instanceof EntityWolf) {
					int bagid = Items.bloodBagWolf.itemID;
					
					for(int i=9;i>0;i--){
						int slotnum = this.getIndexOfItem(player, bagid, i);
						if(slotnum >= 0){
							Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
							ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
							int damage = itemstack1.getItemDamage();
							if(damage < 10){
								player.inventory.setInventorySlotContents(slotnum, new ItemStack(itemstack1.itemID, 1 , itemstack1.getItemDamage()+1));
								onDraw(itemstack, player, target);
								return true;
							}
						}
					}
					int slotnum = this.getIndexOfItem(player, Items.bloodBag.itemID, 0);
					if(slotnum >= 0){
						Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
						ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
						int damage = itemstack1.getItemDamage();
						if(damage < 10){
							player.inventory.setInventorySlotContents(slotnum, new ItemStack(bagid, 1 , 1));
							onDraw(itemstack, player, target);
							return true;
						}
					}
				}else if(target instanceof EntityZombie) {
					int bagid = Items.bloodBagZombie.itemID;
					
					for(int i=9;i>0;i--){
						int slotnum = this.getIndexOfItem(player, bagid, i);
						if(slotnum >= 0){
							Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
							ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
							int damage = itemstack1.getItemDamage();
							if(damage < 10){
								player.inventory.setInventorySlotContents(slotnum, new ItemStack(itemstack1.itemID, 1 , itemstack1.getItemDamage()+1));
								onDraw(itemstack, player, target);
								return true;
							}
						}
					}
					int slotnum = this.getIndexOfItem(player, Items.bloodBag.itemID, 0);
					if(slotnum >= 0){
						Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
						ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
						int damage = itemstack1.getItemDamage();
						if(damage < 10){
							player.inventory.setInventorySlotContents(slotnum, new ItemStack(bagid, 1 , 1));
							onDraw(itemstack, player, target);
							return true;
						}
					}
				}else if(target instanceof EntityPigZombie) {
					int bagid = Items.bloodBagZombiePigman.itemID;
					
					for(int i=9;i>0;i--){
						int slotnum = this.getIndexOfItem(player, bagid, i);
						if(slotnum >= 0){
							Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
							ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
							int damage = itemstack1.getItemDamage();
							if(damage < 10){
								player.inventory.setInventorySlotContents(slotnum, new ItemStack(itemstack1.itemID, 1 , itemstack1.getItemDamage()+1));
								onDraw(itemstack, player, target);
								return true;
							}
						}
					}
					int slotnum = this.getIndexOfItem(player, Items.bloodBag.itemID, 0);
					if(slotnum >= 0){
						Slot slot = (Slot)player.inventoryContainer.getSlot(slotnum);
						ItemStack itemstack1 = player.inventory.getStackInSlot(slotnum);
						int damage = itemstack1.getItemDamage();
						if(damage < 10){
							player.inventory.setInventorySlotContents(slotnum, new ItemStack(bagid, 1 , 1));
							onDraw(itemstack, player, target);
							return true;
						}
					}
				}
			return false;
		}
		return false;
	}
}
