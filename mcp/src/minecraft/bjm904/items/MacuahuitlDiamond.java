package bjm904.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import bjm904.ModInfo;
import bjm904.Names;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

public class MacuahuitlDiamond extends ItemSword {

	public MacuahuitlDiamond(int id, EnumToolMaterial toolMaterial) {
		super(id, toolMaterial);
		this.setCreativeTab(CreativeTabs.tabFood);
		this.setUnlocalizedName(Names.macuahuitlDiamond_unlocalizedName);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(ModInfo.texture + ":" + Names.macuahuitlDiamond_unlocalizedName);
	}
	
	
}
