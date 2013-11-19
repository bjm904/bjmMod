package bjm904.items;

import bjm904.ModInfo;
import bjm904.Names;
import bjm904.bjmMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MacuahuitlGoldClub extends Item {

	public MacuahuitlGoldClub(int id) {
		super(id);
		this.setCreativeTab(bjmMod.CreativeTabBjmMod);
		this.setUnlocalizedName(Names.macuahuitlGoldClub_unlocalizedName);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(ModInfo.texture + ":" + Names.macuahuitlGoldClub_unlocalizedName);
	}
}
