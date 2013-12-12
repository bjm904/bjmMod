package bloodMod;

import java.util.List;

import net.minecraft.item.ItemStack;

public class BloodBagHelper {

	
	
public static List getList(ItemStack stack, List list){
	if(stack.stackTagCompound != null && stack.stackTagCompound.getBoolean("analyzed")==true){
		int info;
		
		
		
		info=stack.stackTagCompound.getInteger("aqua");
		if(info != 0){
			list.add("\u00a73\u00a7oAqua:\u00a7r\u00a73 "+info);
		}
		info=stack.stackTagCompound.getInteger("archier");
		if(info != 0){
			list.add("\u00a75\u00a7oArchier:\u00a7r\u00a75 "+info);
		}
		info=stack.stackTagCompound.getInteger("darkness");
		if(info != 0){
			list.add("\u00a70\u00a7oDarkness:\u00a7r\u00a70 "+info);
		}
		info=stack.stackTagCompound.getInteger("day");
		if(info != 0){
			list.add("\u00a7e\u00a7oDay:\u00a7r\u00a7e "+info);
		}
		info=stack.stackTagCompound.getInteger("death");
		if(info != 0){
			list.add("\u00a74\u00a7oDeath:\u00a7r\u00a74 "+info);
		}
		info=stack.stackTagCompound.getInteger("diamond");
		if(info != 0){
			list.add("\u00a7b\u00a7oDiamond:\u00a7r\u00a7b "+info);
		}
		info=stack.stackTagCompound.getInteger("echo");
		if(info != 0){
			list.add("\u00a7d\u00a7oEcho:\u00a7r\u00a7d "+info);
		}
		info=stack.stackTagCompound.getInteger("end");
		if(info != 0){
			list.add("\u00a77\u00a7oEnd:\u00a7r\u00a77 "+info);
		}
		info=stack.stackTagCompound.getInteger("fear");
		if(info != 0){
			list.add("\u00a7c\u00a7oFear:\u00a7r\u00a7c "+info);
		}
		info=stack.stackTagCompound.getInteger("feather");
		if(info != 0){
			list.add("\u00a7f\u00a7oFeather:\u00a7r\u00a7f "+info);
		}
		info=stack.stackTagCompound.getInteger("flame");
		if(info != 0){
			list.add("\u00a76\u00a7oFlame:\u00a7r\u00a76 "+info);
		}
		info=stack.stackTagCompound.getInteger("gunpowder");
		if(info != 0){
			list.add("\u00a77\u00a7oGunpowder:\u00a7r\u00a77 "+info);
		}
		info=stack.stackTagCompound.getInteger("iron");
		if(info != 0){
			list.add("\u00a7f\u00a7oIron:\u00a7r\u00a7f "+info);
		}
		info=stack.stackTagCompound.getInteger("light");
		if(info != 0){
			list.add("\u00a7e\u00a7oLight:\u00a7r\u00a7e "+info);
		}
		info=stack.stackTagCompound.getInteger("race");
		if(info != 0){
			list.add("\u00a7a\u00a7oRace:\u00a7r\u00a7a "+info);
		}
		info=stack.stackTagCompound.getInteger("spring");
		if(info != 0){
			list.add("\u00a72\u00a7oSpring:\u00a7r\u00a72 "+info);
		}
		info=stack.stackTagCompound.getInteger("sugar");
		if(info != 0){
			list.add("\u00a7f\u00a7oSugar:\u00a7r\u00a7f "+info);
		}
		info=stack.stackTagCompound.getInteger("sustenance ");
		if(info != 0){
			list.add("\u00a79\u00a7oSustenance:\u00a7r\u00a79 "+info);
		}
	}else{
		list = null;
	}
	return list;
}
}
