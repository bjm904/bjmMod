package bjm904.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import bjm904.ModInfo;
import bjm904.Names;
import bjm904.bjmMod;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraft.util.Icon;

public class MacuahuitlGold extends ItemSword {

	public MacuahuitlGold(int id, EnumToolMaterial toolMaterial) {
		super(id, toolMaterial);
		this.setCreativeTab(bjmMod.CreativeTabBjmMod);
		this.setUnlocalizedName(Names.macuahuitlGold_unlocalizedName);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(ModInfo.texture + ":" + Names.macuahuitlGold_unlocalizedName);
	}
	
}
