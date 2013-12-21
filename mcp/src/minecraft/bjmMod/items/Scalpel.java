package bjmMod.items;

import java.util.Random;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.item.EntityItem;
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
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import bjmMod.ModInfo;
import bjmMod.bjmMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class Scalpel extends Item{
	private boolean isDiamond;
	private String unlocname;
	
	public Scalpel(int id, boolean isDiamond, String unlocname) {
		super(id);
		this.setCreativeTab(bjmMod.CreativeTabBjmMod);
		this.isDiamond=isDiamond;
		this.unlocname=unlocname;
		this.setUnlocalizedName(unlocname);
		if(isDiamond) this.setMaxDamage(30);
		else this.setMaxDamage(15);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(ModInfo.texture + ":" + unlocname);
	}
	
	public void damage(ItemStack itemstack, EntityPlayer player){
		itemstack.damageItem(1, player);
	}
	
	public void spawnitem(ItemStack itemstack, EntityLivingBase target, EntityPlayer player){
		Random rand = new Random();
		target.attackEntityFrom(DamageSource.generic, 1);
		target.setLastAttacker(player);
		target.entityDropItem(itemstack, 0);
		
		
		//EntityItem item = new EntityItem(target.worldObj, target.posX, target.posY, target.posZ, itemstack);
		//float f3 = 0.1F;
		//item.motionX = (double)((float)rand.nextGaussian() * f3);
		//item.motionY = (double)((float)rand.nextGaussian() * f3 + 0.2F);
		//item.motionZ = (double)((float)rand.nextGaussian() * f3);
		//target.worldObj.spawnEntityInWorld(item);
	}
	
	public boolean itemInteractionForEntity(ItemStack itemstack, EntityPlayer player, EntityLivingBase target) {
		if (target instanceof EntityBat){
			spawnitem(new ItemStack(Item.porkRaw, 1), target, player);
			damage(itemstack, player);
			return true;
		}else if (target instanceof EntityBlaze){
			spawnitem(new ItemStack(Item.porkRaw, 1), target, player);
			damage(itemstack, player);
			return true;
		}else if (target instanceof EntityCaveSpider){
			spawnitem(new ItemStack(Item.porkRaw, 1), target, player);
			damage(itemstack, player);
			return true;
		}else if (target instanceof EntityChicken){
			spawnitem(new ItemStack(Item.porkRaw, 1), target, player);
			damage(itemstack, player);
			return true;
		}else if (target instanceof EntityCow){
			spawnitem(new ItemStack(Item.porkRaw, 1), target, player);
			damage(itemstack, player);
			return true;
		}else if (target instanceof EntityCreeper){
			spawnitem(new ItemStack(Item.porkRaw, 1), target, player);
			damage(itemstack, player);
			return true;
		}else if (target instanceof EntityDragon){
			spawnitem(new ItemStack(Item.porkRaw, 1), target, player);
			damage(itemstack, player);
			return true;
		}else if (target instanceof EntityEnderman){
			spawnitem(new ItemStack(Item.porkRaw, 1), target, player);
			damage(itemstack, player);
			return true;
		}else if (target instanceof EntityGhast){
			spawnitem(new ItemStack(Item.porkRaw, 1), target, player);
			damage(itemstack, player);
			return true;
		}else if (target instanceof EntityHorse){
			spawnitem(new ItemStack(Item.porkRaw, 1), target, player);
			damage(itemstack, player);
			return true;
		}else if (target instanceof EntityIronGolem){
			spawnitem(new ItemStack(Item.porkRaw, 1), target, player);
			damage(itemstack, player);
			return true;
		}else if (target instanceof EntityMagmaCube){
			spawnitem(new ItemStack(Item.porkRaw, 1), target, player);
			damage(itemstack, player);
			return true;
		}else if (target instanceof EntityMooshroom){
			spawnitem(new ItemStack(Item.porkRaw, 1), target, player);
			damage(itemstack, player);
			return true;
		}else if (target instanceof EntityOcelot){
			spawnitem(new ItemStack(Item.porkRaw, 1), target, player);
			damage(itemstack, player);
			return true;
		}else if (target instanceof EntityPig){
			spawnitem(new ItemStack(Item.porkRaw, 1), target, player);
			damage(itemstack, player);
			return true;
		}else if (target instanceof EntitySheep){
			spawnitem(new ItemStack(Item.porkRaw, 1), target, player);
			damage(itemstack, player);
			return true;
		}else if (target instanceof EntitySilverfish){
			spawnitem(new ItemStack(Item.porkRaw, 1), target, player);
			damage(itemstack, player);
			return true;
		}else if (target instanceof EntitySkeleton){
			spawnitem(new ItemStack(Item.porkRaw, 1), target, player);
			damage(itemstack, player);
			return true;
		}else if (target instanceof EntitySlime){
			spawnitem(new ItemStack(Item.porkRaw, 1), target, player);
			damage(itemstack, player);
			return true;
		}else if (target instanceof EntitySnowman){
			spawnitem(new ItemStack(Item.porkRaw, 1), target, player);
			damage(itemstack, player);
			return true;
		}else if (target instanceof EntitySpider){
			spawnitem(new ItemStack(Item.porkRaw, 1), target, player);
			damage(itemstack, player);
			return true;
		}else if (target instanceof EntitySquid){
			spawnitem(new ItemStack(Item.porkRaw, 1), target, player);
			damage(itemstack, player);
			return true;
		}else if (target instanceof EntityVillager){
			spawnitem(new ItemStack(Item.porkRaw, 1), target, player);
			damage(itemstack, player);
			return true;
		}else if (target instanceof EntityWitch){
			spawnitem(new ItemStack(Item.porkRaw, 1), target, player);
			damage(itemstack, player);
			return true;
		}else if (target instanceof EntityWither){
			spawnitem(new ItemStack(Item.porkRaw, 1), target, player);
			damage(itemstack, player);
			return true;
		}else if (target instanceof EntityWolf){
			spawnitem(new ItemStack(Item.porkRaw, 1), target, player);
			damage(itemstack, player);
			return true;
		}else if (target instanceof EntityZombie){
			spawnitem(new ItemStack(Item.porkRaw, 1), target, player);
			damage(itemstack, player);
			return true;
		}else if (target instanceof EntityPigZombie){
			spawnitem(new ItemStack(Item.porkRaw, 1), target, player);
			damage(itemstack, player);
			return true;
		}

		return false;
		
		
	}
}

