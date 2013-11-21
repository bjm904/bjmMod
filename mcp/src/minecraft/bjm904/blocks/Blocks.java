package bjm904.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import bjm904.Ids;
import bjm904.Names;
import bjm904.blocks.help.AerobreezeLogMeta;
import bjm904.blocks.help.AerobreezeSaplingMeta;
import bjm904.blocks.help.AquaLogMeta;
import bjm904.blocks.help.AquaSaplingMeta;
import bjm904.blocks.help.DaystarLogMeta;
import bjm904.blocks.help.DaystarSaplingMeta;
import bjm904.blocks.help.NightendLogMeta;
import bjm904.blocks.help.NightendSaplingMeta;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

public class Blocks {
public static Block nightendPlanks;
public static Block nightendLeaves;
public static BlockFlower nightendSapling;
public static BlockFlower daystarSapling;
public static BlockFlower aerobreezeSapling;
public static BlockFlower aquaSapling;
public static Block nightendLog;
public static Block daystarLog;
public static Block aerobreezeLog;
public static Block aquaLog;

public static void init() {

nightendPlanks = new NightendPlanks(Ids.nightendPlanks, Material.wood);
GameRegistry.registerBlock(nightendPlanks, Names.nightendPlanks_name);

nightendLeaves = new NightendLeaves(Ids.nightendLeaves);
GameRegistry.registerBlock(nightendLeaves, Names.nightendLeaves_name);

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
}

public static void addNames() {
LanguageRegistry.addName(nightendPlanks, Names.nightendPlanks_name);
LanguageRegistry.addName(nightendLeaves, Names.nightendLeaves_name);

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


}
}