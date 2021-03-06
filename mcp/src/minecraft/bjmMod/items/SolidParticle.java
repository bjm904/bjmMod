package bjmMod.items;

import bjmMod.ModInfo;
import bjmMod.Names;
import bjmMod.bjmMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class SolidParticle extends Item{
	public SolidParticle(int id) {
		super(id);
		this.setCreativeTab(bjmMod.CreativeTabBjmMod);
		this.setUnlocalizedName(Names.solidParticle_unlocalizedName);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(ModInfo.texture + ":" + Names.solidParticle_unlocalizedName);
	}
}

