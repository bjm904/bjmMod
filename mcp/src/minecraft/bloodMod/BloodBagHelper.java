package bloodMod;

import java.util.List;

import net.minecraft.item.ItemStack;

public class BloodBagHelper {

	
	
public static List getList(ItemStack stack, List list){
	if(stack.stackTagCompound != null && stack.stackTagCompound.getBoolean("analyzed")==true){
		int info;
		
		
		
		info=stack.stackTagCompound.getInteger("aqua");
		if(info != 0){
			list.add("§3§oAqua:§r§3 "+info);
		}
		info=stack.stackTagCompound.getInteger("archier");
		if(info != 0){
			list.add("§5§oArchier:§r§5 "+info);
		}
		info=stack.stackTagCompound.getInteger("darkness");
		if(info != 0){
			list.add("§0§oDarkness:§r§0 "+info);
		}
		info=stack.stackTagCompound.getInteger("day");
		if(info != 0){
			list.add("§e§oDay:§r§e "+info);
		}
		info=stack.stackTagCompound.getInteger("death");
		if(info != 0){
			list.add("§4§oDeath:§r§4 "+info);
		}
		info=stack.stackTagCompound.getInteger("diamond");
		if(info != 0){
			list.add("§b§oDiamond:§r§b "+info);
		}
		info=stack.stackTagCompound.getInteger("echo");
		if(info != 0){
			list.add("§d§oEcho:§r§d "+info);
		}
		info=stack.stackTagCompound.getInteger("end");
		if(info != 0){
			list.add("§7§oEnd:§r§7 "+info);
		}
		info=stack.stackTagCompound.getInteger("fear");
		if(info != 0){
			list.add("§c§oFear:§r§c "+info);
		}
		info=stack.stackTagCompound.getInteger("feather");
		if(info != 0){
			list.add("§f§oFeather:§r§f "+info);
		}
		info=stack.stackTagCompound.getInteger("flame");
		if(info != 0){
			list.add("§6§oFlame:§r§6 "+info);
		}
		info=stack.stackTagCompound.getInteger("gunpowder");
		if(info != 0){
			list.add("§7§oGunpowder:§r§7 "+info);
		}
		info=stack.stackTagCompound.getInteger("iron");
		if(info != 0){
			list.add("§f§oIron:§r§f "+info);
		}
		info=stack.stackTagCompound.getInteger("light");
		if(info != 0){
			list.add("§e§oLight:§r§e "+info);
		}
		info=stack.stackTagCompound.getInteger("race");
		if(info != 0){
			list.add("§a§oRace:§r§a "+info);
		}
		info=stack.stackTagCompound.getInteger("spring");
		if(info != 0){
			list.add("§2§oSpring:§r§2 "+info);
		}
		info=stack.stackTagCompound.getInteger("sugar");
		if(info != 0){
			list.add("§f§oSugar:§r§f "+info);
		}
		info=stack.stackTagCompound.getInteger("sustenance ");
		if(info != 0){
			list.add("§9§oSustenance:§r§9 "+info);
		}
	}else{
		list = null;
	}
	return list;
}
}
