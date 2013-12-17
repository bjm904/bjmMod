package bjmMod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.item.ItemStack;
import bjmMod.Ids;
import bjmMod.Names;
import bjmMod.bjmMod;
import bjmMod.blocks.help.AerobreezeLeavesMeta;
import bjmMod.blocks.help.AerobreezeLogMeta;
import bjmMod.blocks.help.AerobreezePlankMeta;
import bjmMod.blocks.help.AerobreezeSaplingMeta;
import bjmMod.blocks.help.AquaLeavesMeta;
import bjmMod.blocks.help.AquaLogMeta;
import bjmMod.blocks.help.AquaPlankMeta;
import bjmMod.blocks.help.AquaSaplingMeta;
import bjmMod.blocks.help.DaystarLeavesMeta;
import bjmMod.blocks.help.DaystarLogMeta;
import bjmMod.blocks.help.DaystarPlankMeta;
import bjmMod.blocks.help.DaystarSaplingMeta;
import bjmMod.blocks.help.NightendLeavesMeta;
import bjmMod.blocks.help.NightendLogMeta;
import bjmMod.blocks.help.NightendPlankMeta;
import bjmMod.blocks.help.NightendSaplingMeta;
import bjmMod.tileEntity.TileEntityInverter;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Blocks {
public static BlockFlower nightendSapling;
public static BlockFlower daystarSapling;
public static BlockFlower aerobreezeSapling;
public static BlockFlower aquaSapling;
public static Block nightendLog;
public static Block daystarLog;
public static Block aerobreezeLog;
public static Block aquaLog;
public static Block nightendPlank;
public static Block daystarPlank;
public static Block aerobreezePlank;
public static Block aquaPlank;
public static Block nightendLeaves;
public static Block daystarLeaves;
public static Block aerobreezeLeaves;
public static Block aquaLeaves;
public static Block inverterActive;
public static Block inverterIdle;
public static Block battlePortal;

public static void init() {

//nightendLeaves = new NightendLeaves(Ids.nightendLeaves);
//GameRegistry.registerBlock(nightendLeaves, Names.nightendLeaves_name);

nightendSapling = new NightendSapling(Ids.nightendSapling);
GameRegistry.registerBlock(nightendSapling, NightendSaplingMeta.class);
daystarSapling = new DaystarSapling(Ids.daystarSapling);
GameRegistry.registerBlock(daystarSapling, DaystarSaplingMeta.class);
aerobreezeSapling = new AerobreezeSapling(Ids.aerobreezeSapling);
GameRegistry.registerBlock(aerobreezeSapling, AerobreezeSaplingMeta.class);
aquaSapling = new AquaSapling(Ids.aquaSapling);
GameRegistry.registerBlock(aquaSapling, AquaSaplingMeta.class);

nightendLog = new NightendLog(Ids.nightendLog);
GameRegistry.registerBlock(nightendLog, NightendLogMeta.class);
daystarLog = new DaystarLog(Ids.daystarLog);
GameRegistry.registerBlock(daystarLog, DaystarLogMeta.class);
aerobreezeLog = new AerobreezeLog(Ids.aerobreezeLog);
GameRegistry.registerBlock(aerobreezeLog, AerobreezeLogMeta.class);
aquaLog = new AquaLog(Ids.aquaLog);
GameRegistry.registerBlock(aquaLog, AquaLogMeta.class);

nightendPlank = new NightendPlank(Ids.nightendPlank);
GameRegistry.registerBlock(nightendPlank, NightendPlankMeta.class);
daystarPlank = new DaystarPlank(Ids.daystarPlank);
GameRegistry.registerBlock(daystarPlank, DaystarPlankMeta.class);
aerobreezePlank = new AerobreezePlank(Ids.aerobreezePlank);
GameRegistry.registerBlock(aerobreezePlank, AerobreezePlankMeta.class);
aquaPlank = new AquaPlank(Ids.aquaPlank);
GameRegistry.registerBlock(aquaPlank, AquaPlankMeta.class);

nightendLeaves = new NightendLeaves(Ids.nightendLeaves);
GameRegistry.registerBlock(nightendLeaves, NightendLeavesMeta.class);
daystarLeaves = new DaystarLeaves(Ids.daystarLeaves);
GameRegistry.registerBlock(daystarLeaves, DaystarLeavesMeta.class);
aerobreezeLeaves = new AerobreezeLeaves(Ids.aerobreezeLeaves);
GameRegistry.registerBlock(aerobreezeLeaves, AerobreezeLeavesMeta.class);
aquaLeaves = new AquaLeaves(Ids.aquaLeaves);
GameRegistry.registerBlock(aquaLeaves, AquaLeavesMeta.class);
inverterActive = new Inverter(Ids.inverterActive, true).setUnlocalizedName(Names.inverterActive_unlocalizedName).setLightValue(0.8F);
GameRegistry.registerBlock(inverterActive, Names.inverterActive_unlocalizedName);
inverterIdle = new Inverter(Ids.inverterIdle, false).setUnlocalizedName(Names.inverterIdle_unlocalizedName).setCreativeTab(bjmMod.CreativeTabBjmMod);;
GameRegistry.registerBlock(inverterIdle, Names.inverterIdle_unlocalizedName);

battlePortal = new BattlePortal(Ids.battlePortal).setUnlocalizedName(Names.battlePortal_unlocalizedName).setCreativeTab(bjmMod.CreativeTabBjmMod);;
GameRegistry.registerBlock(battlePortal, Names.battlePortal_unlocalizedName);
}

public static void addNames() {
LanguageRegistry.addName(inverterIdle, Names.inverterIdle_name);
LanguageRegistry.addName(battlePortal, Names.battlePortal_name);


for(int i = 0; i < Names.nightendSapling_name.length; i++) {
LanguageRegistry.addName(new ItemStack(nightendSapling, 1, i), Names.nightendSapling_name[i]);}
for(int i = 0; i < Names.daystarSapling_name.length; i++) {
LanguageRegistry.addName(new ItemStack(daystarSapling, 1, i), Names.daystarSapling_name[i]);}
for(int i = 0; i < Names.aerobreezeSapling_name.length; i++) {
LanguageRegistry.addName(new ItemStack(aerobreezeSapling, 1, i), Names.aerobreezeSapling_name[i]);}
for(int i = 0; i < Names.aquaSapling_name.length; i++) {
LanguageRegistry.addName(new ItemStack(aquaSapling, 1, i), Names.aquaSapling_name[i]);}

for(int i = 0; i < Names.nightendLog_name.length; i++) {
LanguageRegistry.addName(new ItemStack(nightendLog, 1, i), Names.nightendLog_name[i]);}
for(int i = 0; i < Names.daystarLog_name.length; i++) {
LanguageRegistry.addName(new ItemStack(daystarLog, 1, i), Names.daystarLog_name[i]);}
for(int i = 0; i < Names.aerobreezeLog_name.length; i++) {
LanguageRegistry.addName(new ItemStack(aerobreezeLog, 1, i), Names.aerobreezeLog_name[i]);}
for(int i = 0; i < Names.aquaLog_name.length; i++) {
LanguageRegistry.addName(new ItemStack(aquaLog, 1, i), Names.aquaLog_name[i]);}

for(int i = 0; i < Names.nightendPlank_name.length; i++) {
LanguageRegistry.addName(new ItemStack(nightendPlank, 1, i), Names.nightendPlank_name[i]);}
for(int i = 0; i < Names.daystarPlank_name.length; i++) {
LanguageRegistry.addName(new ItemStack(daystarPlank, 1, i), Names.daystarPlank_name[i]);}
for(int i = 0; i < Names.aerobreezePlank_name.length; i++) {
LanguageRegistry.addName(new ItemStack(aerobreezePlank, 1, i), Names.aerobreezePlank_name[i]);}
for(int i = 0; i < Names.aquaPlank_name.length; i++) {
LanguageRegistry.addName(new ItemStack(aquaPlank, 1, i), Names.aquaPlank_name[i]);}

for(int i = 0; i < Names.nightendLeaves_name.length; i++) {
LanguageRegistry.addName(new ItemStack(nightendLeaves, 1, i), Names.nightendLeaves_name[i]);}
for(int i = 0; i < Names.daystarLeaves_name.length; i++) {
LanguageRegistry.addName(new ItemStack(daystarLeaves, 1, i), Names.daystarLeaves_name[i]);}
for(int i = 0; i < Names.aerobreezeLeaves_name.length; i++) {
LanguageRegistry.addName(new ItemStack(aerobreezeLeaves, 1, i), Names.aerobreezeLeaves_name[i]);}
for(int i = 0; i < Names.aquaLeaves_name.length; i++) {
LanguageRegistry.addName(new ItemStack(aquaLeaves, 1, i), Names.aquaLeaves_name[i]);}
}
public static void registerTileEntities() {
	GameRegistry.registerTileEntity(TileEntityInverter.class, "bjmModInverter");
}
}