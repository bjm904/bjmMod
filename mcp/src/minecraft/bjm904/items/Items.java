package bjm904.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import bjm904.Ids;
import bjm904.Names;
import bjm904.items.combat.Glaive;
import bjm904.items.combat.MacuahuitlDiamond;
import bjm904.items.combat.MacuahuitlGold;
import bjm904.items.combat.MacuahuitlIron;
import bjm904.items.combat.MacuahuitlStone;
import bjm904.items.combat.MacuahuitlWood;
import bjm904.items.combat.Scythe;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;

public class Items {
	public static Item macuahuitlDiamond;
	public static Item macuahuitlGold;
	public static Item macuahuitlIron;
	public static Item macuahuitlStone;
	public static Item macuahuitlWood;
	public static Item glaiveDiamond;
	public static Item glaiveGold;
	public static Item glaiveIron;
	public static Item glaiveStone;
	public static Item glaiveWood;
	public static Item scytheDiamond;
	public static Item scytheGold;
	public static Item scytheIron;
	public static Item scytheStone;
	public static Item scytheWood;
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
	public static Item solidParticle;
	public static Item core;
	
	public static void init() {
		macuahuitlDiamond = new MacuahuitlDiamond(Ids.macuahuitlDiamond, EnumToolMaterial.EMERALD);
		macuahuitlGold = new MacuahuitlGold(Ids.macuahuitlGold, EnumToolMaterial.GOLD);
		macuahuitlIron = new MacuahuitlIron(Ids.macuahuitlIron, EnumToolMaterial.IRON);
		macuahuitlStone = new MacuahuitlStone(Ids.macuahuitlStone, EnumToolMaterial.STONE);
		macuahuitlWood = new MacuahuitlWood(Ids.macuahuitlWood, EnumToolMaterial.WOOD);
		
		glaiveDiamond = new Glaive(Ids.glaiveDiamond, EnumToolMaterial.EMERALD, 3000, 40F, Names.glaiveDiamond_unlocalizedName);
		glaiveGold = new Glaive(Ids.glaiveGold, EnumToolMaterial.GOLD, 1, 40F, Names.glaiveGold_unlocalizedName);
		glaiveIron = new Glaive(Ids.glaiveIron, EnumToolMaterial.IRON, 1, 40F, Names.glaiveIron_unlocalizedName);
		glaiveStone = new Glaive(Ids.glaiveStone, EnumToolMaterial.STONE, 1, 40F, Names.glaiveStone_unlocalizedName);
		glaiveWood = new Glaive(Ids.glaiveWood, EnumToolMaterial.WOOD, 1, 40F, Names.glaiveWood_unlocalizedName);

		
		scytheDiamond = new Scythe(Ids.scytheDiamond, EnumToolMaterial.EMERALD, 3000, 40F, Names.scytheDiamond_unlocalizedName);
		scytheGold = new Scythe(Ids.scytheGold, EnumToolMaterial.GOLD, 1, 40F, Names.scytheGold_unlocalizedName);
		scytheIron = new Scythe(Ids.scytheIron, EnumToolMaterial.IRON, 1, 40F, Names.scytheIron_unlocalizedName);
		scytheStone = new Scythe(Ids.scytheStone, EnumToolMaterial.STONE, 1, 40F, Names.scytheStone_unlocalizedName);
		scytheWood = new Scythe(Ids.scytheWood, EnumToolMaterial.WOOD, 1, 40F, Names.scytheWood_unlocalizedName);
		
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
		solidParticle = new SolidParticle(Ids.solidParticle);
		core = new Core(Ids.core);
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
		
		LanguageRegistry.addName(glaiveDiamond, Names.glaiveDiamond_name);
		LanguageRegistry.addName(glaiveGold, Names.glaiveGold_name);
		LanguageRegistry.addName(glaiveIron, Names.glaiveIron_name);
		LanguageRegistry.addName(glaiveStone, Names.glaiveStone_name);
		LanguageRegistry.addName(glaiveWood, Names.glaiveWood_name);
		
		LanguageRegistry.addName(scytheDiamond, Names.scytheDiamond_name);
		LanguageRegistry.addName(scytheGold, Names.scytheGold_name);
		LanguageRegistry.addName(scytheIron, Names.scytheIron_name);
		LanguageRegistry.addName(scytheStone, Names.scytheStone_name);
		LanguageRegistry.addName(scytheWood, Names.scytheWood_name);
		
		LanguageRegistry.addName(lunarium, Names.lunarium_name);
		LanguageRegistry.addName(solsteim, Names.solsteim_name);
		LanguageRegistry.addName(lunite, Names.lunite_name);
		LanguageRegistry.addName(solidParticle, Names.solidParticle_name);
		LanguageRegistry.addName(core, Names.core_name);
	}
}
