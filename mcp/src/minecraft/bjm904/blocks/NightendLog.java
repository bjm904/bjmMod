package bjm904.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import bjm904.ModInfo;
import bjm904.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class NightendLog extends Block {
	public NightendLog(int id, Material par2Material) {
		super(id, Material.wood);
		this.setUnlocalizedName(Names.nightendLog_unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabFood);
		this.setHardness(2F);
		this.setResistance(15F);
		this.setStepSound(Block.soundWoodFootstep);
		this.setLightValue(0F);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
	blockIcon = icon.registerIcon(ModInfo.texture + ":" + Names.nightendLog_unlocalizedName);
	}
}
