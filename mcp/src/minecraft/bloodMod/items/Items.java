package bloodMod.items;

import bloodMod.Ids;
import bloodMod.Names;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Items {
	public static Item bloodBag;
	public static Item bloodBagBat;
	public static Item bloodBagBlaze;
	public static Item bloodBagCaveSpider;
	public static Item bloodBagChicken;
	public static Item bloodBagCow;
	public static Item bloodBagCreeper;
	public static Item bloodBagEnderDragon;
	public static Item bloodBagEnderman;
	public static Item bloodBagGhast;
	public static Item bloodBagHorse;
	public static Item bloodBagIronGolem;
	public static Item bloodBagMagmaCube;
	public static Item bloodBagMooshroom;
	public static Item bloodBagOcelot;
	public static Item bloodBagPig;
	public static Item bloodBagSheep;
	public static Item bloodBagSilverfish;
	public static Item bloodBagSkeleton;
	public static Item bloodBagSlime;
	public static Item bloodBagSnowGolem;
	public static Item bloodBagSpider;
	public static Item bloodBagSquid;
	public static Item bloodBagVillager;
	public static Item bloodBagWitch;
	public static Item bloodBagWither;
	public static Item bloodBagWitherSkeleton;
	public static Item bloodBagWolf;
	public static Item bloodBagZombie;
	public static Item bloodBagZombiePigman;
	public static Item bloodBagZombieVillager;
	
	public static void init() {
		
		bloodBag = new BloodBagBat(Ids.bloodBag);
		bloodBagBat = new BloodBagBat(Ids.bloodBagBat);
		bloodBagBlaze = new BloodBagBlaze(Ids.bloodBagBlaze);
		bloodBagCaveSpider = new BloodBagCaveSpider(Ids.bloodBagCaveSpider);
		bloodBagChicken = new BloodBagChicken(Ids.bloodBagChicken);
		bloodBagCow = new BloodBagCow(Ids.bloodBagCow);
		bloodBagCreeper = new BloodBagCreeper(Ids.bloodBagCreeper);
		bloodBagEnderDragon = new BloodBagEnderDragon(Ids.bloodBagEnderDragon);
		bloodBagEnderman = new BloodBagEnderman(Ids.bloodBagEnderman);
		bloodBagGhast = new BloodBagGhast(Ids.bloodBagGhast);
		bloodBagHorse = new BloodBagHorse(Ids.bloodBagHorse);
		bloodBagIronGolem = new BloodBagIronGolem(Ids.bloodBagIronGolem);
		bloodBagMagmaCube = new BloodBagMagmaCube(Ids.bloodBagMagmaCube);
		bloodBagMooshroom = new BloodBagMooshroom(Ids.bloodBagMooshroom);
		bloodBagOcelot = new BloodBagOcelot(Ids.bloodBagOcelot);
		bloodBagPig = new BloodBagPig(Ids.bloodBagPig);
		bloodBagSheep = new BloodBagSheep(Ids.bloodBagSheep);
		bloodBagSilverfish = new BloodBagSilverfish(Ids.bloodBagSilverfish);
		bloodBagSkeleton = new BloodBagSkeleton(Ids.bloodBagSkeleton);
		bloodBagSlime = new BloodBagSlime(Ids.bloodBagSlime);
		bloodBagSnowGolem = new BloodBagSnowGolem(Ids.bloodBagSnowGolem);
		bloodBagSpider = new BloodBagSpider(Ids.bloodBagSpider);
		bloodBagSquid = new BloodBagSquid(Ids.bloodBagSquid);
		bloodBagVillager = new BloodBagVillager(Ids.bloodBagVillager);
		bloodBagWitch = new BloodBagWitch(Ids.bloodBagWitch);
		bloodBagWither = new BloodBagWither(Ids.bloodBagWither);
		bloodBagWitherSkeleton = new BloodBagWitherSkeleton(Ids.bloodBagWitherSkeleton);
		bloodBagWolf = new BloodBagWolf(Ids.bloodBagWolf);
		bloodBagZombie = new BloodBagZombie(Ids.bloodBagZombie);
		bloodBagZombiePigman = new BloodBagZombiePigman(Ids.bloodBagZombiePigman);
		bloodBagZombieVillager = new BloodBagZombieVillager(Ids.bloodBagZombieVillager);
		
	}
	public static void addNames() {
		//LanguageRegistry.addName(macuahuitlDiamond, Names.macuahuitlDiamond_name);
		for(int i = 0; i < Names.bloodBagBat_name.length; i++) {
			LanguageRegistry.addName(new ItemStack(bloodBagBat, 1, i), Names.bloodBagBat_name[i]);
			}
		for(int i = 0; i < Names.bloodBagBlaze_name.length; i++) {
			LanguageRegistry.addName(new ItemStack(bloodBagBlaze, 1, i), Names.bloodBagBlaze_name[i]);
			}
		for(int i = 0; i < Names.bloodBagCaveSpider_name.length; i++) {
			LanguageRegistry.addName(new ItemStack(bloodBagCaveSpider, 1, i), Names.bloodBagCaveSpider_name[i]);
			}
		for(int i = 0; i < Names.bloodBagChicken_name.length; i++) {
			LanguageRegistry.addName(new ItemStack(bloodBagChicken, 1, i), Names.bloodBagChicken_name[i]);
			}
		for(int i = 0; i < Names.bloodBagCow_name.length; i++) {
			LanguageRegistry.addName(new ItemStack(bloodBagCow, 1, i), Names.bloodBagCow_name[i]);
			}
		for(int i = 0; i < Names.bloodBagCreeper_name.length; i++) {
			LanguageRegistry.addName(new ItemStack(bloodBagCreeper, 1, i), Names.bloodBagCreeper_name[i]);
			}
		for(int i = 0; i < Names.bloodBagEnderDragon_name.length; i++) {
			LanguageRegistry.addName(new ItemStack(bloodBagEnderDragon, 1, i), Names.bloodBagEnderDragon_name[i]);
			}
		for(int i = 0; i < Names.bloodBagEnderman_name.length; i++) {
			LanguageRegistry.addName(new ItemStack(bloodBagEnderman, 1, i), Names.bloodBagEnderman_name[i]);
			}
		for(int i = 0; i < Names.bloodBagGhast_name.length; i++) {
			LanguageRegistry.addName(new ItemStack(bloodBagGhast, 1, i), Names.bloodBagGhast_name[i]);
			}
		for(int i = 0; i < Names.bloodBagHorse_name.length; i++) {
			LanguageRegistry.addName(new ItemStack(bloodBagHorse, 1, i), Names.bloodBagHorse_name[i]);
			}
		for(int i = 0; i < Names.bloodBagIronGolem_name.length; i++) {
			LanguageRegistry.addName(new ItemStack(bloodBagIronGolem, 1, i), Names.bloodBagIronGolem_name[i]);
			}
		for(int i = 0; i < Names.bloodBagMagmaCube_name.length; i++) {
			LanguageRegistry.addName(new ItemStack(bloodBagMagmaCube, 1, i), Names.bloodBagMagmaCube_name[i]);
			}
		for(int i = 0; i < Names.bloodBagMooshroom_name.length; i++) {
			LanguageRegistry.addName(new ItemStack(bloodBagMooshroom, 1, i), Names.bloodBagMooshroom_name[i]);
			}
		for(int i = 0; i < Names.bloodBagOcelot_name.length; i++) {
			LanguageRegistry.addName(new ItemStack(bloodBagOcelot, 1, i), Names.bloodBagOcelot_name[i]);
			}
		for(int i = 0; i < Names.bloodBagPig_name.length; i++) {
			LanguageRegistry.addName(new ItemStack(bloodBagPig, 1, i), Names.bloodBagPig_name[i]);
			}
		for(int i = 0; i < Names.bloodBagSheep_name.length; i++) {
			LanguageRegistry.addName(new ItemStack(bloodBagSheep, 1, i), Names.bloodBagSheep_name[i]);
			}
		for(int i = 0; i < Names.bloodBagSilverfish_name.length; i++) {
			LanguageRegistry.addName(new ItemStack(bloodBagSilverfish, 1, i), Names.bloodBagSilverfish_name[i]);
			}
		for(int i = 0; i < Names.bloodBagSkeleton_name.length; i++) {
			LanguageRegistry.addName(new ItemStack(bloodBagSkeleton, 1, i), Names.bloodBagSkeleton_name[i]);
			}
		for(int i = 0; i < Names.bloodBagSlime_name.length; i++) {
			LanguageRegistry.addName(new ItemStack(bloodBagSlime, 1, i), Names.bloodBagSlime_name[i]);
			}
		for(int i = 0; i < Names.bloodBagSnowGolem_name.length; i++) {
			LanguageRegistry.addName(new ItemStack(bloodBagSnowGolem, 1, i), Names.bloodBagSnowGolem_name[i]);
			}
		for(int i = 0; i < Names.bloodBagSpider_name.length; i++) {
			LanguageRegistry.addName(new ItemStack(bloodBagSpider, 1, i), Names.bloodBagSpider_name[i]);
			}
		for(int i = 0; i < Names.bloodBagSquid_name.length; i++) {
			LanguageRegistry.addName(new ItemStack(bloodBagSquid, 1, i), Names.bloodBagSquid_name[i]);
			}
		for(int i = 0; i < Names.bloodBagVillager_name.length; i++) {
			LanguageRegistry.addName(new ItemStack(bloodBagVillager, 1, i), Names.bloodBagVillager_name[i]);
			}
		for(int i = 0; i < Names.bloodBagWitch_name.length; i++) {
			LanguageRegistry.addName(new ItemStack(bloodBagWitch, 1, i), Names.bloodBagWitch_name[i]);
			}
		for(int i = 0; i < Names.bloodBagWither_name.length; i++) {
			LanguageRegistry.addName(new ItemStack(bloodBagWither, 1, i), Names.bloodBagWither_name[i]);
			}
		for(int i = 0; i < Names.bloodBagWitherSkeleton_name.length; i++) {
			LanguageRegistry.addName(new ItemStack(bloodBagWitherSkeleton, 1, i), Names.bloodBagWitherSkeleton_name[i]);
			}
		for(int i = 0; i < Names.bloodBagWolf_name.length; i++) {
			LanguageRegistry.addName(new ItemStack(bloodBagWolf, 1, i), Names.bloodBagWolf_name[i]);
			}
		for(int i = 0; i < Names.bloodBagZombie_name.length; i++) {
			LanguageRegistry.addName(new ItemStack(bloodBagZombie, 1, i), Names.bloodBagZombie_name[i]);
			}
		for(int i = 0; i < Names.bloodBagZombiePigman_name.length; i++) {
			LanguageRegistry.addName(new ItemStack(bloodBagZombiePigman, 1, i), Names.bloodBagZombiePigman_name[i]);
			}
		for(int i = 0; i < Names.bloodBagZombieVillager_name.length; i++) {
			LanguageRegistry.addName(new ItemStack(bloodBagZombieVillager, 1, i), Names.bloodBagZombieVillager_name[i]);
			}
		
	}
}
