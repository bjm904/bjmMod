package bjmMod;

import java.io.File;

import bjmMod.blocks.help.AquaSaplingMeta;
import bjmMod.Ids;
import bjmMod.Names;
import net.minecraftforge.common.Configuration;

public class ConfigHandler {
public static void init(File configFile) {
Configuration config = new Configuration(configFile);

config.load();
Ids.macuahuitlDiamond = config.getItem(Names.macuahuitlDiamond_name, Ids.macuahuitlDiamond_default).getInt() - 256;
Ids.macuahuitlGold = config.getItem(Names.macuahuitlGold_name, Ids.macuahuitlGold_default).getInt() - 256;
Ids.macuahuitlIron = config.getItem(Names.macuahuitlIron_name, Ids.macuahuitlIron_default).getInt() - 256;
Ids.macuahuitlStone = config.getItem(Names.macuahuitlStone_name, Ids.macuahuitlStone_default).getInt() - 256;
Ids.macuahuitlWood = config.getItem(Names.macuahuitlWood_name, Ids.macuahuitlWood_default).getInt() - 256;
Ids.macuahuitlDiamondClub = config.getItem(Names.macuahuitlDiamondClub_name, Ids.macuahuitlDiamondClub_default).getInt() - 256;
Ids.macuahuitlGoldClub = config.getItem(Names.macuahuitlGoldClub_name, Ids.macuahuitlGoldClub_default).getInt() - 256;
Ids.macuahuitlIronClub = config.getItem(Names.macuahuitlIronClub_name, Ids.macuahuitlIronClub_default).getInt() - 256;
Ids.macuahuitlStoneClub = config.getItem(Names.macuahuitlStoneClub_name, Ids.macuahuitlStoneClub_default).getInt() - 256;
Ids.macuahuitlWoodClub = config.getItem(Names.macuahuitlWoodClub_name, Ids.macuahuitlWoodClub_default).getInt() - 256;
Ids.macuahuitlDiamondStock = config.getItem(Names.macuahuitlDiamondStock_name, Ids.macuahuitlDiamondStock_default).getInt() - 256;
Ids.macuahuitlGoldStock = config.getItem(Names.macuahuitlGoldStock_name, Ids.macuahuitlGoldStock_default).getInt() - 256;
Ids.macuahuitlIronStock = config.getItem(Names.macuahuitlIronStock_name, Ids.macuahuitlIronStock_default).getInt() - 256;
Ids.macuahuitlStoneStock = config.getItem(Names.macuahuitlStoneStock_name, Ids.macuahuitlStoneStock_default).getInt() - 256;
Ids.macuahuitlWoodStock = config.getItem(Names.macuahuitlWoodStock_name, Ids.macuahuitlWoodStock_default).getInt() - 256;
Ids.lunarium = config.getItem(Names.lunarium_name, Ids.lunarium_default).getInt() - 256;
Ids.solsteim = config.getItem(Names.solsteim_name, Ids.solsteim_default).getInt() - 256;
Ids.lunite = config.getItem(Names.lunite_name, Ids.lunite_default).getInt() - 256;
Ids.solidParticle = config.getItem(Names.solidParticle_name, Ids.solidParticle_default).getInt() - 256;
Ids.core = config.getItem(Names.core_name, Ids.core_default).getInt() - 256;
Ids.glaiveDiamond = config.getItem(Names.glaiveDiamond_name, Ids.glaiveDiamond_default).getInt() - 256;
Ids.glaiveGold = config.getItem(Names.glaiveGold_name, Ids.glaiveGold_default).getInt() - 256;
Ids.glaiveIron = config.getItem(Names.glaiveIron_name, Ids.glaiveIron_default).getInt() - 256;
Ids.glaiveStone = config.getItem(Names.glaiveStone_name, Ids.glaiveStone_default).getInt() - 256;
Ids.glaiveWood = config.getItem(Names.glaiveWood_name, Ids.glaiveWood_default).getInt() - 256;
Ids.scytheDiamond = config.getItem(Names.scytheDiamond_name, Ids.scytheDiamond_default).getInt() - 256;
Ids.scytheGold = config.getItem(Names.scytheGold_name, Ids.scytheGold_default).getInt() - 256;
Ids.scytheIron = config.getItem(Names.scytheIron_name, Ids.scytheIron_default).getInt() - 256;
Ids.scytheStone = config.getItem(Names.scytheStone_name, Ids.scytheStone_default).getInt() - 256;
Ids.scytheWood = config.getItem(Names.scytheWood_name, Ids.scytheWood_default).getInt() - 256;


Ids.nightendSapling = config.getBlock("Nightend Sapling", Ids.nightendSapling_default).getInt();
Ids.daystarSapling = config.getBlock("Daystar Sapling", Ids.daystarSapling_default).getInt();
Ids.aerobreezeSapling = config.getBlock("Aerobreeze Sapling", Ids.aerobreezeSapling_default).getInt();
Ids.aquaSapling = config.getBlock("Aqua Sapling", Ids.aquaSapling_default).getInt();
Ids.nightendLog = config.getBlock("Nightend Log", Ids.nightendLog_default).getInt();
Ids.daystarLog = config.getBlock("Daystar Log", Ids.daystarLog_default).getInt();
Ids.aerobreezeLog = config.getBlock("Aerobreeze Log", Ids.aerobreezeLog_default).getInt();
Ids.aquaLog = config.getBlock("Aqua Log", Ids.aquaLog_default).getInt();
Ids.nightendPlank = config.getBlock("Nightend Plank", Ids.nightendPlank_default).getInt();
Ids.daystarPlank = config.getBlock("Daystar Plank", Ids.daystarPlank_default).getInt();
Ids.aerobreezePlank = config.getBlock("Aerobreeze Plank", Ids.aerobreezePlank_default).getInt();
Ids.aquaPlank = config.getBlock("Aqua Plank", Ids.aquaPlank_default).getInt();
Ids.nightendLeaves = config.getBlock("Nightend Leaves", Ids.nightendLeaves_default).getInt();
Ids.daystarLeaves = config.getBlock("Daystar Leaves", Ids.daystarLeaves_default).getInt();
Ids.aerobreezeLeaves = config.getBlock("Aerobreeze Leaves", Ids.aerobreezeLeaves_default).getInt();
Ids.aquaLeaves = config.getBlock("Aqua Leaves", Ids.aquaLeaves_default).getInt();

Ids.inverterActive = config.getBlock(Names.inverterActive_name, Ids.inverterActive_default).getInt();
Ids.inverterIdle = config.getBlock(Names.inverterIdle_name, Ids.inverterIdle_default).getInt();

Ids.battlePortal = config.getBlock(Names.battlePortal_name, Ids.battlePortal_default).getInt();

config.save();
}
}