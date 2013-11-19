package bjm904.blocks;

import bjm904.ModInfo;
import bjm904.Names;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;

public class nightendSapling extends BlockFlower {
	
	public nightendSapling(int id) {
		super(id);
		this.setUnlocalizedName(Names.nightendSapling_unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabFood);
		this.setHardness(0F);
		this.setResistance(15F);
		this.setLightValue(0F);
		float f = 0.4F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
	}

	@SideOnly(Side.CLIENT)
	public static Icon everyicon;
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		everyicon = icon.registerIcon(ModInfo.texture.toLowerCase() + ":" + Names.nightendSapling_unlocalizedName);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int metadata) {
	return everyicon;
	}
}
