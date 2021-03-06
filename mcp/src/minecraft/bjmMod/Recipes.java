package bjmMod;

import bjmMod.blocks.Blocks;
import bjmMod.items.Items;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
	public static void init() {
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.nightendPlank, 4), new ItemStack(Blocks.nightendLog, 1));

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
		
		GameRegistry.addRecipe(new ItemStack(Blocks.aerobreezeSapling, 1, 0),//Oak
				new Object[] {"LLL","LSL","LLL",'S', new ItemStack(Block.sapling, 1, 0), 'L', Items.lunite});
		GameRegistry.addRecipe(new ItemStack(Blocks.aquaSapling, 1, 0),
				new Object[] {"LLL","LSL","LLL",'S', new ItemStack(Block.sapling, 1, 0), 'L', Items.lunite});
		GameRegistry.addRecipe(new ItemStack(Blocks.daystarSapling, 1, 0),
				new Object[] {"LLL","LSL","LLL",'S', new ItemStack(Block.sapling, 1, 0), 'L', Items.lunite});
		GameRegistry.addRecipe(new ItemStack(Blocks.nightendSapling, 1, 0),
				new Object[] {"LLL","LSL","LLL",'S', new ItemStack(Block.sapling, 1, 0), 'L', Items.lunite});
		GameRegistry.addRecipe(new ItemStack(Blocks.aerobreezeSapling, 1, 1),//Spruce
				new Object[] {"LLL","LSL","LLL",'S', new ItemStack(Block.sapling, 1, 1), 'L', Items.lunite});
		GameRegistry.addRecipe(new ItemStack(Blocks.aquaSapling, 1, 1),
				new Object[] {"LLL","LSL","LLL",'S', new ItemStack(Block.sapling, 1, 1), 'L', Items.lunite});
		GameRegistry.addRecipe(new ItemStack(Blocks.daystarSapling, 1, 1),
				new Object[] {"LLL","LSL","LLL",'S', new ItemStack(Block.sapling, 1, 1), 'L', Items.lunite});
		GameRegistry.addRecipe(new ItemStack(Blocks.nightendSapling, 1, 1),
				new Object[] {"LLL","LSL","LLL",'S', new ItemStack(Block.sapling, 1, 1), 'L', Items.lunite});
		GameRegistry.addRecipe(new ItemStack(Blocks.aerobreezeSapling, 1, 2),//Birch
				new Object[] {"LLL","LSL","LLL",'S', new ItemStack(Block.sapling, 1, 2), 'L', Items.lunite});
		GameRegistry.addRecipe(new ItemStack(Blocks.aquaSapling, 1, 2),
				new Object[] {"LLL","LSL","LLL",'S', new ItemStack(Block.sapling, 1, 2), 'L', Items.lunite});
		GameRegistry.addRecipe(new ItemStack(Blocks.daystarSapling, 1, 2),
				new Object[] {"LLL","LSL","LLL",'S', new ItemStack(Block.sapling, 1, 2), 'L', Items.lunite});
		GameRegistry.addRecipe(new ItemStack(Blocks.nightendSapling, 1, 2),
				new Object[] {"LLL","LSL","LLL",'S', new ItemStack(Block.sapling, 1, 2), 'L', Items.lunite});
		GameRegistry.addRecipe(new ItemStack(Blocks.aerobreezeSapling, 1, 3),//Jungle
				new Object[] {"LLL","LSL","LLL",'S', new ItemStack(Block.sapling, 1, 3), 'L', Items.lunite});
		GameRegistry.addRecipe(new ItemStack(Blocks.aquaSapling, 1, 3),
				new Object[] {"LLL","LSL","LLL",'S', new ItemStack(Block.sapling, 1, 3), 'L', Items.lunite});
		GameRegistry.addRecipe(new ItemStack(Blocks.daystarSapling, 1, 3),
				new Object[] {"LLL","LSL","LLL",'S', new ItemStack(Block.sapling, 1, 3), 'L', Items.lunite});
		GameRegistry.addRecipe(new ItemStack(Blocks.nightendSapling, 1, 3),
				new Object[] {"LLL","LSL","LLL",'S', new ItemStack(Block.sapling, 1, 3), 'L', Items.lunite});
	}
}
