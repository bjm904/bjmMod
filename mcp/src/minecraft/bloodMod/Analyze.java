package bloodMod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class Analyze {
public static void AnalyzeBlood(ItemStack itemstack, boolean useMachine, EntityPlayer player){
	//player.getEntityWorld()
	if(itemstack.stackTagCompound == null){
		 itemstack.setTagCompound( new NBTTagCompound( ) );
		 itemstack.stackTagCompound.setBoolean("analyzed", false);
	}
	boolean analyzed = itemstack.stackTagCompound.getBoolean("analyzed");
	if(analyzed == false){
		player.addChatMessage("Gunna add some data"); 
		
		
		
		itemstack.stackTagCompound.setBoolean("analyzed", true);
	}else {
		
		player.addChatMessage("Got some data");
	}
}
}
