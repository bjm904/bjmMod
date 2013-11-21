package bjmMod.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import bjmMod.ModInfo;
import bjmMod.Names;
import bjmMod.bjmMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Lunarium extends Item{
	public Lunarium(int id) {
		super(id);
		this.setCreativeTab(bjmMod.CreativeTabBjmMod);
		this.setUnlocalizedName(Names.lunarium_unlocalizedName);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(ModInfo.texture + ":" + Names.lunarium_unlocalizedName);
	}
}
