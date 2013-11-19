package bjm904.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import bjm904.Ids;
import bjm904.Names;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;

public class Blocks {
public static Block nightendLog;
public static Block nightendPlanks;
public static Block nightendLeaves;
public static BlockFlower nightendSapling;

public static void init() {
nightendLog = new NightendLog(Ids.nightendLog, Material.wood);
GameRegistry.registerBlock(nightendLog, Names.nightendLog_name);

nightendPlanks = new NightendPlanks(Ids.nightendPlanks, Material.wood);
GameRegistry.registerBlock(nightendPlanks, Names.nightendPlanks_name);

nightendLeaves = new NightendLeaves(Ids.nightendLeaves, Material.leaves);
GameRegistry.registerBlock(nightendLeaves, Names.nightendLeaves_name);

nightendSapling = new nightendSapling(Ids.nightendSapling);
GameRegistry.registerBlock(nightendSapling, Names.nightendSapling_name);
}

public static void addNames() {
LanguageRegistry.addName(nightendLog, Names.nightendLog_name);
LanguageRegistry.addName(nightendPlanks, Names.nightendPlanks_name);
LanguageRegistry.addName(nightendLeaves, Names.nightendLeaves_name);
LanguageRegistry.addName(nightendSapling, Names.nightendSapling_name);
}
}