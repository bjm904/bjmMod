package bjm904.blocks;

import java.util.Random;

import bjm904.ModInfo;
import bjm904.Names;
import bjm904.bjmMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.TerrainGen;

public class NightendSapling extends BlockFlower {
	
	public NightendSapling(int id) {
		super(id);
		this.setUnlocalizedName(Names.nightendSapling_unlocalizedName);
		this.setCreativeTab(bjmMod.CreativeTabBjmMod);
		this.setHardness(0F);
		this.setResistance(15F);
		this.setLightValue(0F);
		float f = 0.4F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
	}
    
    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (!par1World.isRemote)
        {
            super.updateTick(par1World, par2, par3, par4, par5Random);

            if (par1World.getBlockLightValue(par2, par3 + 1, par4) >= 9 && par5Random.nextInt(7) == 0)
            {
                this.markOrGrowMarked(par1World, par2, par3, par4, par5Random);
            }
        }
    }


    public void markOrGrowMarked(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        int l = par1World.getBlockMetadata(par2, par3, par4);

        if ((l & 8) == 0)
        {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, l | 8, 4);
        }
        else
        {
            this.growTree(par1World, par2, par3, par4, par5Random);
        }
    }

    /**
     * Attempts to grow a sapling into a tree
     */
    public void growTree(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (!TerrainGen.saplingGrowTree(par1World, par5Random, par2, par3, par4)) return;

        int l = par1World.getBlockMetadata(par2, par3, par4) & 3;
        Object object = null;
        int i1 = 0;
        int j1 = 0;
       boolean flag = false;
       object = new WorldGenBigTree(true);
    
            par1World.setBlock(par2, par3, par4, 0, 0, 4);
        

        if (!((WorldGenerator)object).generate(par1World, par5Random, par2 + i1, par3, par4 + j1))
        {
           
                par1World.setBlock(par2, par3, par4, this.blockID, l, 4);
            }
        }
    //}

    /**
     * Determines if the same sapling is present at the given location.
     */
    public boolean isSameSapling(World par1World, int par2, int par3, int par4, int par5)
    {
        return par1World.getBlockId(par2, par3, par4) == this.blockID && (par1World.getBlockMetadata(par2, par3, par4) & 3) == par5;
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
