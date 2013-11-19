package bjm904.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import bjm904.Ids;
import bjm904.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Blocks {
public static Block block;

public static void init() {
block = new NightendLog(Ids.nightendLog, null);
GameRegistry.registerBlock(block, Names.nightendLog_name);
}

public static void addNames() {
LanguageRegistry.addName(block, Names.nightendLog_name);
}
}