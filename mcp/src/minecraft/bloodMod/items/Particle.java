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


public class Particle extends Item {
public Particle(int id) {
super(id);
setHasSubtypes(true);
}

@Override
public String getUnlocalizedName(ItemStack itemstack) {
return Names.particle_unlocalizedName[itemstack.getItemDamage()];
}

@SideOnly(Side.CLIENT)
public static Icon[] icons;

private static final String[] ICON = {
"particle0",
"particle1",
"particle2",
"particle3",
"particle4",
"particle5",
"particle6",
"particle7",
"particle8",
"particle9",
"particle10",
"particle11",
"particle12",
"particle13",
"particle14",
"particle15"
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
for(int i = 0; i < 1; i++) {
ItemStack itemstack = new ItemStack(id, 1, i);
list.add(itemstack);
}
}
}