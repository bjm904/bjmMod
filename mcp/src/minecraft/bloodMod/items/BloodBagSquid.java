package bloodMod.items;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import bloodMod.ModInfo;
import bloodMod.Names;
import bloodMod.bloodMod;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;


public class BloodBagSquid extends Item {
public BloodBagSquid(int id) {
super(id);
setCreativeTab(bloodMod.tabBlood);
setHasSubtypes(true);
maxStackSize = 1;
}

@Override
public String getUnlocalizedName(ItemStack itemstack) {
return Names.bloodBagSquid_unlocalizedName[itemstack.getItemDamage()];
}

@SideOnly(Side.CLIENT)
public static Icon[] icons;

private static final String[] ICON = {
"bloodBag0",
"bloodBag1",
"bloodBag2",
"bloodBag3",
"bloodBag4",
"bloodBag5",
"bloodBag6",
"bloodBag7",
"bloodBag8",
"bloodBag9",
"bloodBag10"
};

@Override
@SideOnly(Side.CLIENT)
public void registerIcons(IconRegister icon) {
icons = new Icon[ICON.length];

for(int i = 0; i < icons.length; i++) {
icons[i] = icon.registerIcon(ModInfo.texture.toLowerCase() + ":" + ICON[i]);
}
}

@Override
@SideOnly(Side.CLIENT)
public Icon getIconFromDamage(int damage) {
return icons[damage];
}
@Override
public void getSubItems(int id, CreativeTabs tab, List list) {
for(int i = 9; i < icons.length-1; i++) {
ItemStack itemstack = new ItemStack(id, 1, i+1);
list.add(itemstack);
}
}
}