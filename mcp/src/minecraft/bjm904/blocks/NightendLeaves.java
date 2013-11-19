package bjm904.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import bjm904.ModInfo;
import bjm904.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;

public class NightendLeaves extends Block {

	public NightendLeaves(int id, Material material) {
		super(id, material);
		this.setUnlocalizedName(Names.nightendLeaves_unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabFood);
		this.setHardness(0.2F);
		this.setResistance(15F);
		this.setStepSound(Block.soundGrassFootstep);
		this.setLightValue(0F);
	}
	@SideOnly(Side.CLIENT)
	public static Icon topIcon;
	@SideOnly(Side.CLIENT)
	public static Icon bottomIcon;
	@SideOnly(Side.CLIENT)
	public static Icon sideIcon;
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		topIcon = icon.registerIcon(ModInfo.texture.toLowerCase() + ":" + Names.nightendLeaves_unlocalizedName+"Opaque");
		bottomIcon = icon.registerIcon(ModInfo.texture.toLowerCase() + ":" + Names.nightendLeaves_unlocalizedName+"Opaque");
		sideIcon = icon.registerIcon(ModInfo.texture.toLowerCase() + ":" + Names.nightendLeaves_unlocalizedName+"Opaque");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int metadata) {
	if(side == 0) {
	return bottomIcon;
	} else if(side == 1) {
	return topIcon;
	} else {
	return sideIcon;
	}
	}
}
