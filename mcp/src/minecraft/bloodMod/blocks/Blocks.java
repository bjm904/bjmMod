package bloodMod.blocks;

import bloodMod.Ids;
import bloodMod.Names;
import bloodMod.bloodMod;
import bloodMod.tileEntity.TileEntityPhlebotor;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Blocks {
	
public static Block aquaLeaves;
public static Block phlebotorActive;
public static Block phlebotorIdle;

public static void init() {
phlebotorActive = new Phlebotor(Ids.phlebotorActive, true).setUnlocalizedName(Names.phlebotorActive_unlocalizedName).setLightValue(0.8F);
GameRegistry.registerBlock(phlebotorActive, Names.phlebotorActive_unlocalizedName);
phlebotorIdle = new Phlebotor(Ids.phlebotorIdle, false).setUnlocalizedName(Names.phlebotorIdle_unlocalizedName).setCreativeTab(bloodMod.tabBlood);;
GameRegistry.registerBlock(phlebotorIdle, Names.phlebotorIdle_unlocalizedName);
}

public static void addNames() {
	LanguageRegistry.addName(phlebotorIdle, Names.phlebotorIdle_name);
}

public static void registerTileEntities() {
	GameRegistry.registerTileEntity(TileEntityPhlebotor.class, "bloodModPhlebotor");
}
}