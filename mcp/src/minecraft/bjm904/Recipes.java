package bjm904;

import bjm904.blocks.Blocks;
import bjm904.items.Items;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
	public static void init() {
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.nightendPlanks, 4), new ItemStack(Blocks.nightendLog, 1));

		GameRegistry.addRecipe(new ItemStack(Items.macuahuitlDiamond, 1),
				new Object[] {"  C"," W ","R  ",'R', Block.stone, 'W', Item.stick, 'C', Items.macuahuitlDiamondClub
				});
		GameRegistry.addRecipe(new ItemStack(Items.macuahuitlDiamond, 1),
				new Object[] {"C  "," W ","  R",'R', Block.stone, 'W', Item.stick, 'C', Items.macuahuitlDiamondClub
				});
		GameRegistry.addRecipe(new ItemStack(Items.macuahuitlGold, 1),
				new Object[] {"  C"," W ","R  ",'R', Block.stone, 'W', Item.stick, 'C', Items.macuahuitlGoldClub
				});
		GameRegistry.addRecipe(new ItemStack(Items.macuahuitlGold, 1),
				new Object[] {"C  "," W ","  R",'R', Block.stone, 'W', Item.stick, 'C', Items.macuahuitlGoldClub
				});
		GameRegistry.addRecipe(new ItemStack(Items.macuahuitlIron, 1),
				new Object[] {"  C"," W ","R  ",'R', Block.stone, 'W', Item.stick, 'C', Items.macuahuitlIronClub
				});
		GameRegistry.addRecipe(new ItemStack(Items.macuahuitlIron, 1),
				new Object[] {"C  "," W ","  R",'R', Block.stone, 'W', Item.stick, 'C', Items.macuahuitlIronClub
				});
		GameRegistry.addRecipe(new ItemStack(Items.macuahuitlStone, 1),
				new Object[] {"  C"," W ","R  ",'R', Block.stone, 'W', Item.stick, 'C', Items.macuahuitlStoneClub
				});
		GameRegistry.addRecipe(new ItemStack(Items.macuahuitlStone, 1),
				new Object[] {"C  "," W ","  R",'R', Block.stone, 'W', Item.stick, 'C', Items.macuahuitlStoneClub
				});
		GameRegistry.addRecipe(new ItemStack(Items.macuahuitlWood, 1),
				new Object[] {"  C"," W ","R  ",'R', Block.stone, 'W', Item.stick, 'C', Items.macuahuitlWoodClub
				});
		GameRegistry.addRecipe(new ItemStack(Items.macuahuitlWood, 1),
				new Object[] {"C  "," W ","  R",'R', Block.stone, 'W', Item.stick, 'C', Items.macuahuitlWoodClub
				});
		GameRegistry.addRecipe(new ItemStack(Items.macuahuitlDiamondClub, 1),
				new Object[] {"S  "," S ","  S",'S', Items.macuahuitlDiamondStock
				});
		GameRegistry.addRecipe(new ItemStack(Items.macuahuitlGoldClub, 1),
				new Object[] {"S  "," S ","  S",'S', Items.macuahuitlGoldStock
				});
		GameRegistry.addRecipe(new ItemStack(Items.macuahuitlIronClub, 1),
				new Object[] {"S  "," S ","  S",'S', Items.macuahuitlIronStock
				});
		GameRegistry.addRecipe(new ItemStack(Items.macuahuitlStoneClub, 1),
				new Object[] {"S  "," S ","  S",'S', Items.macuahuitlStoneStock
				});
		GameRegistry.addRecipe(new ItemStack(Items.macuahuitlWoodClub, 1),
				new Object[] {"S  "," S ","  S",'S', Items.macuahuitlWoodStock
				});
		GameRegistry.addRecipe(new ItemStack(Items.macuahuitlDiamondStock, 1),
				new Object[] {"ODO",'O', Block.obsidian, 'D', Item.diamond
				});
		GameRegistry.addRecipe(new ItemStack(Items.macuahuitlGoldStock, 1),
				new Object[] {"ODO",'O', Block.obsidian, 'D', Item.ingotGold
				});
		GameRegistry.addRecipe(new ItemStack(Items.macuahuitlIronStock, 1),
				new Object[] {"ODO",'O', Block.obsidian, 'D', Item.ingotIron
				});
		GameRegistry.addRecipe(new ItemStack(Items.macuahuitlStoneStock, 1),
				new Object[] {"ODO",'O', Block.obsidian, 'D', Block.cobblestone
				});
		GameRegistry.addRecipe(new ItemStack(Items.macuahuitlWoodStock, 1),
				new Object[] {"ODO",'O', Block.obsidian, 'D', Block.planks
				});
		
		GameRegistry.addRecipe(new ItemStack(Blocks.nightendSapling, 1),
				new Object[] {"LLL","LSL","LLL",'S', Block.sapling, 'L', Items.lunite
				});
	}
}
