package bjm904.blocks;

import java.util.List;
import java.util.Random;

import bjm904.ModInfo;
import bjm904.Names;
import bjm904.bjmMod;
import bjm904.treeGen.DaystarGen;
import bjm904.treeGen.DaystarGenForest;
import bjm904.treeGen.DaystarGenHuge;
import bjm904.treeGen.DaystarGenTaiga;
import net.minecraft.block.BlockFlower;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.TerrainGen;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class DaystarSapling extends BlockFlower
{
    public static final String[] WOOD_TYPES = new String[] {"Oak", "Spruce", "Birch", "Jungle"};
    @SideOnly(Side.CLIENT)
    private Icon[] saplingIcon;

    public DaystarSapling(int par1)
    {
        super(par1);
        float f = 0.4F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
        this.setCreativeTab(bjmMod.CreativeTabBjmModTree);
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

    @SideOnly(Side.CLIENT)

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public Icon getIcon(int par1, int par2)
    {
        par2 &= 3;
        return this.saplingIcon[par2];
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

        if (l == 1)
        {
            object = new DaystarGenTaiga(true);
        }
        else if (l == 2)
        {
            object = new DaystarGenForest(true);
        }
        else if (l == 3)
        {
            for (i1 = 0; i1 >= -1; --i1)
            {
                for (j1 = 0; j1 >= -1; --j1)
                {
                    if (this.isSameSapling(par1World, par2 + i1, par3, par4 + j1, 3) && this.isSameSapling(par1World, par2 + i1 + 1, par3, par4 + j1, 3) && this.isSameSapling(par1World, par2 + i1, par3, par4 + j1 + 1, 3) && this.isSameSapling(par1World, par2 + i1 + 1, par3, par4 + j1 + 1, 3))
                    {
                        object = new DaystarGenHuge(true, 10 + par5Random.nextInt(20), 3, 3);
                        flag = true;
                        break;
                    }
                }

                if (object != null)
                {
                    break;
                }
            }

            if (object == null)
            {
                j1 = 0;
                i1 = 0;
                object = new DaystarGen(true, 4 + par5Random.nextInt(7), 3, 3, false);
            }
        }
        else
        {
            object = new DaystarGen(true);
        }

        if (flag)
        {
            par1World.setBlock(par2 + i1, par3, par4 + j1, 0, 0, 4);
            par1World.setBlock(par2 + i1 + 1, par3, par4 + j1, 0, 0, 4);
            par1World.setBlock(par2 + i1, par3, par4 + j1 + 1, 0, 0, 4);
            par1World.setBlock(par2 + i1 + 1, par3, par4 + j1 + 1, 0, 0, 4);
        }
        else
        {
            par1World.setBlock(par2, par3, par4, 0, 0, 4);
        }

        if (!((WorldGenerator)object).generate(par1World, par5Random, par2 + i1, par3, par4 + j1))
        {
            if (flag)
            {
                par1World.setBlock(par2 + i1, par3, par4 + j1, this.blockID, l, 4);
                par1World.setBlock(par2 + i1 + 1, par3, par4 + j1, this.blockID, l, 4);
                par1World.setBlock(par2 + i1, par3, par4 + j1 + 1, this.blockID, l, 4);
                par1World.setBlock(par2 + i1 + 1, par3, par4 + j1 + 1, this.blockID, l, 4);
            }
            else
            {
                par1World.setBlock(par2, par3, par4, this.blockID, l, 4);
            }
        }
    }

    /**
     * Determines if the same sapling is present at the given location.
     */
    public boolean isSameSapling(World par1World, int par2, int par3, int par4, int par5)
    {
        return par1World.getBlockId(par2, par3, par4) == this.blockID && (par1World.getBlockMetadata(par2, par3, par4) & 3) == par5;
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int par1)
    {
        return par1 & 3;
    }

    @SideOnly(Side.CLIENT)

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        par3List.add(new ItemStack(par1, 1, 0));
        par3List.add(new ItemStack(par1, 1, 1));
        par3List.add(new ItemStack(par1, 1, 2));
        par3List.add(new ItemStack(par1, 1, 3));
    }

    @SideOnly(Side.CLIENT)

    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.saplingIcon = new Icon[WOOD_TYPES.length];

        for (int i = 0; i < this.saplingIcon.length; ++i)
        {
            this.saplingIcon[i] = par1IconRegister.registerIcon(ModInfo.texture.toLowerCase() + ":" + "daystarSapling" + WOOD_TYPES[i]);
        }
    }
}
