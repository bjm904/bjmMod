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

public class NightendPlanks extends Block {
	public NightendPlanks(int id, Material par2Material) {
		super(id, Material.wood);
		this.setUnlocalizedName(Names.nightendPlanks_unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabFood);
		this.setHardness(2F);
		this.setResistance(15F);
		this.setStepSound(Block.soundWoodFootstep);
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
		topIcon = icon.registerIcon(ModInfo.texture.toLowerCase() + ":" + Names.nightendPlanks_unlocalizedName);
		bottomIcon = icon.registerIcon(ModInfo.texture.toLowerCase() + ":" + Names.nightendPlanks_unlocalizedName);
		sideIcon = icon.registerIcon(ModInfo.texture.toLowerCase() + ":" + Names.nightendPlanks_unlocalizedName);
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
