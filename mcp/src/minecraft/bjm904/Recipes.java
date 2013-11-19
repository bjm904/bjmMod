package bjm904;

import bjm904.blocks.Blocks;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
	public static void init() {
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.nightendPlanks, 4), new ItemStack(Blocks.nightendLog, 1));

	}
}
