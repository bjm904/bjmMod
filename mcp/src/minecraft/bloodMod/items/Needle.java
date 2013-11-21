package bloodMod.items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class Needle {
	public boolean itemInteractionForEntity(ItemStack itemstack, EntityPlayer player, EntityLivingBase target) {
		if(target.worldObj.isRemote) {
			//if(thisent=="chicken"){
				if(target instanceof EntityChicken) {
					target.motionY = 2;
					//} 
			}
		return false;
		}else{
		return false;
		}
		}
}
