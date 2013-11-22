package bloodMod;

import java.io.File;


import net.minecraftforge.common.Configuration;

public class ConfigHandler {
public static void init(File configFile) {
Configuration config = new Configuration(configFile);

config.load();

Ids.bloodBag = config.getItem("Blood Bag", Ids.bloodBag_default).getInt() - 256;
Ids.bloodBagBat = config.getItem("Blood Bag Bat", Ids.bloodBagBat_default).getInt() - 256;
Ids.bloodBagBlaze = config.getItem("Blood Bag Blaze", Ids.bloodBagBlaze_default).getInt() - 256;
Ids.bloodBagCaveSpider = config.getItem("Blood Bag CaveSpider", Ids.bloodBagCaveSpider_default).getInt() - 256;
Ids.bloodBagChicken = config.getItem("Blood Bag Chicken", Ids.bloodBagChicken_default).getInt() - 256;
Ids.bloodBagCow = config.getItem("Blood Bag Cow", Ids.bloodBagCow_default).getInt() - 256;
Ids.bloodBagCreeper = config.getItem("Blood Bag Creeper", Ids.bloodBagCreeper_default).getInt() - 256;
Ids.bloodBagEnderDragon = config.getItem("Blood Bag EnderDragon", Ids.bloodBagEnderDragon_default).getInt() - 256;
Ids.bloodBagEnderman = config.getItem("Blood Bag Enderman", Ids.bloodBagEnderman_default).getInt() - 256;
Ids.bloodBagGhast = config.getItem("Blood Bag Ghast", Ids.bloodBagGhast_default).getInt() - 256;
Ids.bloodBagHorse = config.getItem("Blood Bag Horse", Ids.bloodBagHorse_default).getInt() - 256;
Ids.bloodBagIronGolem = config.getItem("Blood Bag IronGolem", Ids.bloodBagIronGolem_default).getInt() - 256;
Ids.bloodBagMagmaCube = config.getItem("Blood Bag MagmaCube", Ids.bloodBagMagmaCube_default).getInt() - 256;
Ids.bloodBagMooshroom = config.getItem("Blood Bag Mooshroom", Ids.bloodBagMooshroom_default).getInt() - 256;
Ids.bloodBagOcelot = config.getItem("Blood Bag Ocelot", Ids.bloodBagOcelot_default).getInt() - 256;
Ids.bloodBagPig = config.getItem("Blood Bag Pig", Ids.bloodBagPig_default).getInt() - 256;
Ids.bloodBagSheep = config.getItem("Blood Bag Sheep", Ids.bloodBagSheep_default).getInt() - 256;
Ids.bloodBagSilverfish = config.getItem("Blood Bag Silverfish", Ids.bloodBagSilverfish_default).getInt() - 256;
Ids.bloodBagSkeleton = config.getItem("Blood Bag Skeleton", Ids.bloodBagSkeleton_default).getInt() - 256;
Ids.bloodBagSlime = config.getItem("Blood Bag Slime", Ids.bloodBagSlime_default).getInt() - 256;
Ids.bloodBagSnowGolem = config.getItem("Blood Bag SnowGolem", Ids.bloodBagSnowGolem_default).getInt() - 256;
Ids.bloodBagSpider = config.getItem("Blood Bag Spider", Ids.bloodBagSpider_default).getInt() - 256;
Ids.bloodBagSquid = config.getItem("Blood Bag Squid", Ids.bloodBagSquid_default).getInt() - 256;
Ids.bloodBagVillager = config.getItem("Blood Bag Villager", Ids.bloodBagVillager_default).getInt() - 256;
Ids.bloodBagWitch = config.getItem("Blood Bag Witch", Ids.bloodBagWitch_default).getInt() - 256;
Ids.bloodBagWither = config.getItem("Blood Bag Wither", Ids.bloodBagWither_default).getInt() - 256;
Ids.bloodBagWitherSkeleton = config.getItem("Blood Bag WitherSkeleton", Ids.bloodBagWitherSkeleton_default).getInt() - 256;
Ids.bloodBagWolf = config.getItem("Blood Bag Wolf", Ids.bloodBagWolf_default).getInt() - 256;
Ids.bloodBagZombie = config.getItem("Blood Bag Zombie", Ids.bloodBagZombie_default).getInt() - 256;
Ids.bloodBagZombiePigman = config.getItem("Blood Bag ZombiePigman", Ids.bloodBagZombiePigman_default).getInt() - 256;
Ids.bloodBagZombieVillager = config.getItem("Blood Bag ZombieVillager", Ids.bloodBagZombieVillager_default).getInt() - 256;



config.save();
}
}