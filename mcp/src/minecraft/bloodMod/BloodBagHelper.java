package bloodMod;

import java.util.List;

import net.minecraft.item.ItemStack;

public class BloodBagHelper {

	
	
public static List getList(ItemStack stack, List list){
	if(stack.stackTagCompound != null && stack.stackTagCompound.getBoolean("analyzed")==true){
		
		
		int info = 0;
		for(int i=1;i<11;i++){
			info += stack.stackTagCompound.getInteger(i+"particle0");
		}
		if(info != 0){
			list.add("\u00a73\u00a7oAqua:\u00a7r\u00a73 "+info);
		}
		info = 0;
		for(int i=1;i<11;i++){
			info += stack.stackTagCompound.getInteger(i+"particle1");
		}
		if(info != 0){
			list.add("\u00a75\u00a7oArchier:\u00a7r\u00a75 "+info);
		}
		info = 0;
		for(int i=1;i<11;i++){
			info += stack.stackTagCompound.getInteger(i+"particle2");
		}
		if(info != 0){
			list.add("\u00a70\u00a7oDarkness:\u00a7r\u00a70 "+info);
		}
		info = 0;
		for(int i=1;i<11;i++){
			info += stack.stackTagCompound.getInteger(i+"particle3");
		}
		if(info != 0){
			list.add("\u00a7e\u00a7oDay:\u00a7r\u00a7e "+info);
		}
		info = 0;
		for(int i=1;i<11;i++){
			info += stack.stackTagCompound.getInteger(i+"particle4");
		}
		if(info != 0){
			list.add("\u00a74\u00a7oDeath:\u00a7r\u00a74 "+info);
		}
		info = 0;
		for(int i=1;i<11;i++){
			info += stack.stackTagCompound.getInteger(i+"particle5");
		}
		if(info != 0){
			list.add("\u00a7b\u00a7oDiamond:\u00a7r\u00a7b "+info);
		}
		info = 0;
		for(int i=1;i<11;i++){
			info += stack.stackTagCompound.getInteger(i+"particle6");
		}
		if(info != 0){
			list.add("\u00a7d\u00a7oEcho:\u00a7r\u00a7d "+info);
		}
		info = 0;
		for(int i=1;i<11;i++){
			info += stack.stackTagCompound.getInteger(i+"particle7");
		}
		if(info != 0){
			list.add("\u00a77\u00a7oEnd:\u00a7r\u00a77 "+info);
		}
		info = 0;
		for(int i=1;i<11;i++){
			info += stack.stackTagCompound.getInteger(i+"particle8");
		}
		if(info != 0){
			list.add("\u00a7c\u00a7oFear:\u00a7r\u00a7c "+info);
		}
		info = 0;
		for(int i=1;i<11;i++){
			info += stack.stackTagCompound.getInteger(i+"particle9");
		}
		if(info != 0){
			list.add("\u00a7f\u00a7oFeather:\u00a7r\u00a7f "+info);
		}
		info = 0;
		for(int i=1;i<11;i++){
			info += stack.stackTagCompound.getInteger(i+"particle10");
		}
		if(info != 0){
			list.add("\u00a76\u00a7oFlame:\u00a7r\u00a76 "+info);
		}
		info = 0;
		for(int i=1;i<11;i++){
			info += stack.stackTagCompound.getInteger(i+"particle11");
		}
		if(info != 0){
			list.add("\u00a77\u00a7oGunpowder:\u00a7r\u00a77 "+info);
		}
		info = 0;
		for(int i=1;i<11;i++){
			info += stack.stackTagCompound.getInteger(i+"particle12");
		}
		if(info != 0){
			list.add("\u00a7f\u00a7oIron:\u00a7r\u00a7f "+info);
		}
		info = 0;
		for(int i=1;i<11;i++){
			info += stack.stackTagCompound.getInteger(i+"particle13");
		}
		if(info != 0){
			list.add("\u00a7e\u00a7oLight:\u00a7r\u00a7e "+info);
		}
		info = 0;
		for(int i=1;i<11;i++){
			info += stack.stackTagCompound.getInteger(i+"particle14");
		}
		if(info != 0){
			list.add("\u00a7a\u00a7oRace:\u00a7r\u00a7a "+info);
		}
		info = 0;
		for(int i=1;i<11;i++){
			info += stack.stackTagCompound.getInteger(i+"particle15");
		}
		if(info != 0){
			list.add("\u00a72\u00a7oSpring:\u00a7r\u00a72 "+info);
		}
		info = 0;
		for(int i=1;i<11;i++){
			info += stack.stackTagCompound.getInteger(i+"particle16");
		}
		if(info != 0){
			list.add("\u00a7f\u00a7oSugar:\u00a7r\u00a7f "+info);
		}
		info = 0;
		for(int i=1;i<11;i++){
			info += stack.stackTagCompound.getInteger(i+"particle17");
		}
		if(info != 0){
			list.add("\u00a79\u00a7oSustenance:\u00a7r\u00a79 "+info);
		}
	}else{
		list = null;
	}
	return list;
}
}
