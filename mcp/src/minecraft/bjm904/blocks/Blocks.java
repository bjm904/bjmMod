package bjm904.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import bjm904.Ids;
import bjm904.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Blocks {
public static Block nightendLog;
public static Block nightendPlanks;

public static void init() {
nightendLog = new NightendLog(Ids.nightendLog, null);
GameRegistry.registerBlock(nightendLog, Names.nightendLog_name);

nightendPlanks = new NightendPlanks(Ids.nightendPlanks, null);
GameRegistry.registerBlock(nightendPlanks, Names.nightendPlanks_name);
}

public static void addNames() {
LanguageRegistry.addName(nightendLog, Names.nightendLog_name);
LanguageRegistry.addName(nightendPlanks, Names.nightendPlanks_name);
}
}