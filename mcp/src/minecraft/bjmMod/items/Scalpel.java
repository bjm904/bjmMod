package bjmMod.items;

import java.util.Random;

import bjmMod.ModInfo;
import bjmMod.Names;
import bjmMod.bjmMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class Scalpel extends Item{
	private boolean isDiamond;
	private String unlocname;
	
	public Scalpel(int id, boolean isDiamond, String unlocname) {
		super(id);
		this.setCreativeTab(bjmMod.CreativeTabBjmMod);
		this.isDiamond=isDiamond;
		this.unlocname=unlocname;
		this.setUnlocalizedName(unlocname);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(ModInfo.texture + ":" + unlocname);
	}
	
	public boolean itemInteractionForEntity(ItemStack itemstack, EntityPlayer player, EntityLivingBase target) {
		Random rand = new Random();
		if (target instanceof EntityPig){
			EntityItem item = new EntityItem(target.worldObj, target.posX, target.posY, target.posZ, new ItemStack(Block.blockDiamond, 1));
			float f3 = 0.1F;
			item.motionX = (double)((float)rand.nextGaussian() * f3);
			item.motionY = (double)((float)rand.nextGaussian() * f3 + 0.2F);
			item.motionZ = (double)((float)rand.nextGaussian() * f3);
			target.worldObj.spawnEntityInWorld(item);
		} else{
			player.addChatMessage("Havent Programed that Entity yet.");
		}
		
		
		
		
		
		
		return false;
		
		
	}
}

