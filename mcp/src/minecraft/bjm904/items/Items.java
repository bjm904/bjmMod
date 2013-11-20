package bjm904.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import bjm904.Ids;
import bjm904.Names;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;

public class Items {
	public static Item macuahuitlDiamond;
	public static Item macuahuitlGold;
	public static Item macuahuitlIron;
	public static Item macuahuitlStone;
	public static Item macuahuitlWood;
	public static Item macuahuitlDiamondClub;
	public static Item macuahuitlGoldClub;
	public static Item macuahuitlIronClub;
	public static Item macuahuitlStoneClub;
	public static Item macuahuitlWoodClub;
	public static Item macuahuitlDiamondStock;
	public static Item macuahuitlGoldStock;
	public static Item macuahuitlIronStock;
	public static Item macuahuitlStoneStock;
	public static Item macuahuitlWoodStock;
	public static Item lunarium;
	public static Item solsteim;
	public static Item lunite;
	
	public static void init() {
		macuahuitlDiamond = new MacuahuitlDiamond(Ids.macuahuitlDiamond, EnumToolMaterial.EMERALD);
		macuahuitlGold = new MacuahuitlGold(Ids.macuahuitlGold, EnumToolMaterial.GOLD);
		macuahuitlIron = new MacuahuitlIron(Ids.macuahuitlIron, EnumToolMaterial.IRON);
		macuahuitlStone = new MacuahuitlStone(Ids.macuahuitlStone, EnumToolMaterial.STONE);
		macuahuitlWood = new MacuahuitlWood(Ids.macuahuitlWood, EnumToolMaterial.WOOD);
		
		macuahuitlDiamondClub = new MacuahuitlDiamondClub(Ids.macuahuitlDiamondClub);
		macuahuitlGoldClub = new MacuahuitlGoldClub(Ids.macuahuitlGoldClub);
		macuahuitlIronClub = new MacuahuitlIronClub(Ids.macuahuitlIronClub);
		macuahuitlStoneClub = new MacuahuitlStoneClub(Ids.macuahuitlStoneClub);
		macuahuitlWoodClub = new MacuahuitlWoodClub(Ids.macuahuitlWoodClub);
		
		macuahuitlDiamondStock = new MacuahuitlDiamondStock(Ids.macuahuitlDiamondStock);
		macuahuitlGoldStock = new MacuahuitlGoldStock(Ids.macuahuitlGoldStock);
		macuahuitlIronStock = new MacuahuitlIronStock(Ids.macuahuitlIronStock);
		macuahuitlStoneStock = new MacuahuitlStoneStock(Ids.macuahuitlStoneStock);
		macuahuitlWoodStock = new MacuahuitlWoodStock(Ids.macuahuitlWoodStock);
		
		lunarium = new Lunarium(Ids.lunarium);
		solsteim = new Solsteim(Ids.solsteim);
		lunite = new Lunite(Ids.lunite);
	}
	public static void addNames() {
		LanguageRegistry.addName(macuahuitlDiamond, Names.macuahuitlDiamond_name);
		LanguageRegistry.addName(macuahuitlGold, Names.macuahuitlGold_name);
		LanguageRegistry.addName(macuahuitlIron, Names.macuahuitlIron_name);
		LanguageRegistry.addName(macuahuitlStone, Names.macuahuitlStone_name);
		LanguageRegistry.addName(macuahuitlWood, Names.macuahuitlWood_name);
		LanguageRegistry.addName(macuahuitlDiamondClub, Names.macuahuitlDiamondClub_name);
		LanguageRegistry.addName(macuahuitlGoldClub, Names.macuahuitlGoldClub_name);
		LanguageRegistry.addName(macuahuitlIronClub, Names.macuahuitlIronClub_name);
		LanguageRegistry.addName(macuahuitlStoneClub, Names.macuahuitlStoneClub_name);
		LanguageRegistry.addName(macuahuitlWoodClub, Names.macuahuitlWoodClub_name);
		LanguageRegistry.addName(macuahuitlDiamondStock, Names.macuahuitlDiamondStock_name);
		LanguageRegistry.addName(macuahuitlGoldStock, Names.macuahuitlGoldStock_name);
		LanguageRegistry.addName(macuahuitlIronStock, Names.macuahuitlIronStock_name);
		LanguageRegistry.addName(macuahuitlStoneStock, Names.macuahuitlStoneStock_name);
		LanguageRegistry.addName(macuahuitlWoodStock, Names.macuahuitlWoodStock_name);
		
		LanguageRegistry.addName(lunarium, Names.lunarium_name);
		LanguageRegistry.addName(solsteim, Names.solsteim_name);
		LanguageRegistry.addName(lunite, Names.lunite_name);
	}
}
