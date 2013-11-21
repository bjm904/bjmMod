package bjm904.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import bjm904.Ids;
import bjm904.Names;
import bjm904.blocks.help.daystarSaplingMeta;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

public class Blocks {
public static Block nightendLog;
public static Block nightendPlanks;
public static Block nightendLeaves;
public static BlockFlower nightendSapling;
public static BlockFlower daystarSapling;

public static void init() {
nightendLog = new NightendLog(Ids.nightendLog);
GameRegistry.registerBlock(nightendLog, Names.nightendLog_name);

nightendPlanks = new NightendPlanks(Ids.nightendPlanks, Material.wood);
GameRegistry.registerBlock(nightendPlanks, Names.nightendPlanks_name);

nightendLeaves = new NightendLeaves(Ids.nightendLeaves);
GameRegistry.registerBlock(nightendLeaves, Names.nightendLeaves_name);

nightendSapling = new NightendSapling(Ids.nightendSapling);
GameRegistry.registerBlock(nightendSapling, Names.nightendSapling_name);

daystarSapling = new DaystarSapling(Ids.daystarSapling);
GameRegistry.registerBlock(daystarSapling, daystarSaplingMeta.class);
}

public static void addNames() {
LanguageRegistry.addName(nightendLog, Names.nightendLog_name);
LanguageRegistry.addName(nightendPlanks, Names.nightendPlanks_name);
LanguageRegistry.addName(nightendLeaves, Names.nightendLeaves_name);
LanguageRegistry.addName(nightendSapling, Names.nightendSapling_name);
for(int i = 0; i < Names.daystarSapling_name.length; i++) {
LanguageRegistry.addName(new ItemStack(daystarSapling, 1, i), Names.daystarSapling_name[i]);
}
}
}