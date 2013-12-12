package bloodMod;

import java.lang.reflect.Array;
import java.util.Random;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import bloodMod.items.Items;

public class Analyze {
public static void AnalyzeBlood(ItemStack itemstack, boolean useMachine){
	
	if(itemstack.stackTagCompound == null){
		 itemstack.setTagCompound( new NBTTagCompound( ) );
		 itemstack.stackTagCompound.setBoolean("analyzed", false);
	}
	boolean analyzed = itemstack.stackTagCompound.getBoolean("analyzed");
	Random rand = new Random();
	if(analyzed == false){

	
	int[] tagsBat = {
			//Max (0 to this) , Influence to, % of influence 0-10
			100,26,3, //Aqua
			100,26,3, //Archier
			100,26,3, //Darkness
			100,26,3, //Day / Night
			100,26,3, //Death
			100,26,3, //Diamond
			100,26,3, //Echo
			100,26,3, //End
			100,26,3, //Fear
			100,26,3, //Feather
			100,26,3, //Flame
			100,26,3, //Gunpowder
			100,26,3, //Iron
			100,26,3, //Light
			100,26,3, //Race
			100,26,3, //Spring
			100,26,3, //Sugar
			100,26,3 //Sustenance
			};	
	int[] tagsBlaze = {
			//Max (0 to this) , Influence to, % of influence 0-10
			100,26,3, //Aqua
			100,26,3, //Archier
			100,26,3, //Darkness
			100,26,3, //Day / Night
			100,26,3, //Death
			100,26,3, //Diamond
			100,26,3, //Echo
			100,26,3, //End
			100,26,3, //Fear
			100,26,3, //Feather
			100,26,3, //Flame
			100,26,3, //Gunpowder
			100,26,3, //Iron
			100,26,3, //Light
			100,26,3, //Race
			100,26,3, //Spring
			100,26,3, //Sugar
			100,26,3 //Sustenance
			};	
	int[] tagsCaveSpider = {
			//Max (0 to this) , Influence to, % of influence 0-10
			100,26,3, //Aqua
			100,26,3, //Archier
			100,26,3, //Darkness
			100,26,3, //Day / Night
			100,26,3, //Death
			100,26,3, //Diamond
			100,26,3, //Echo
			100,26,3, //End
			100,26,3, //Fear
			100,26,3, //Feather
			100,26,3, //Flame
			100,26,3, //Gunpowder
			100,26,3, //Iron
			100,26,3, //Light
			100,26,3, //Race
			100,26,3, //Spring
			100,26,3, //Sugar
			100,26,3 //Sustenance
			};	
	int[] tagsChicken = {
			//Max (0 to this) , Influence to, % of influence 0-10
			100,26,3, //Aqua
			100,26,3, //Archier
			100,26,3, //Darkness
			100,26,3, //Day / Night
			100,26,3, //Death
			100,26,3, //Diamond
			100,26,3, //Echo
			100,26,3, //End
			100,26,3, //Fear
			100,26,3, //Feather
			100,26,3, //Flame
			100,26,3, //Gunpowder
			100,26,3, //Iron
			100,26,3, //Light
			100,26,3, //Race
			100,26,3, //Spring
			100,26,3, //Sugar
			100,26,3 //Sustenance
			};	
	int[] tagsCow = {
			//Max (0 to this) , Influence to, % of influence 0-10
			100,26,3, //Aqua
			100,26,3, //Archier
			100,26,3, //Darkness
			100,26,3, //Day / Night
			100,26,3, //Death
			100,26,3, //Diamond
			100,26,3, //Echo
			100,26,3, //End
			100,26,3, //Fear
			100,26,3, //Feather
			100,26,3, //Flame
			100,26,3, //Gunpowder
			100,26,3, //Iron
			100,26,3, //Light
			100,26,3, //Race
			100,26,3, //Spring
			100,26,3, //Sugar
			100,26,3 //Sustenance
			};	
	int[] tagsCreeper = {
			//Max (0 to this) , Influence to, % of influence 0-10
			100,26,3, //Aqua
			100,26,3, //Archier
			100,26,3, //Darkness
			100,26,3, //Day / Night
			100,26,3, //Death
			100,26,3, //Diamond
			100,26,3, //Echo
			100,26,3, //End
			100,26,3, //Fear
			100,26,3, //Feather
			100,26,3, //Flame
			100,26,3, //Gunpowder
			100,26,3, //Iron
			100,26,3, //Light
			100,26,3, //Race
			100,26,3, //Spring
			100,26,3, //Sugar
			100,26,3 //Sustenance
			};	
	int[] tagsEnderDragon = {
			//Max (0 to this) , Influence to, % of influence 0-10
			100,26,3, //Aqua
			100,26,3, //Archier
			100,26,3, //Darkness
			100,26,3, //Day / Night
			100,26,3, //Death
			100,26,3, //Diamond
			100,26,3, //Echo
			100,26,3, //End
			100,26,3, //Fear
			100,26,3, //Feather
			100,26,3, //Flame
			100,26,3, //Gunpowder
			100,26,3, //Iron
			100,26,3, //Light
			100,26,3, //Race
			100,26,3, //Spring
			100,26,3, //Sugar
			100,26,3 //Sustenance
			};	
	int[] tagsEnderman = {
			//Max (0 to this) , Influence to, % of influence 0-10
			100,26,3, //Aqua
			100,26,3, //Archier
			100,26,3, //Darkness
			100,26,3, //Day / Night
			100,26,3, //Death
			100,26,3, //Diamond
			100,26,3, //Echo
			100,26,3, //End
			100,26,3, //Fear
			100,26,3, //Feather
			100,26,3, //Flame
			100,26,3, //Gunpowder
			100,26,3, //Iron
			100,26,3, //Light
			100,26,3, //Race
			100,26,3, //Spring
			100,26,3, //Sugar
			100,26,3 //Sustenance
			};	
	int[] tagsGhast = {
			//Max (0 to this) , Influence to, % of influence 0-10
			100,26,3, //Aqua
			100,26,3, //Archier
			100,26,3, //Darkness
			100,26,3, //Day / Night
			100,26,3, //Death
			100,26,3, //Diamond
			100,26,3, //Echo
			100,26,3, //End
			100,26,3, //Fear
			100,26,3, //Feather
			100,26,3, //Flame
			100,26,3, //Gunpowder
			100,26,3, //Iron
			100,26,3, //Light
			100,26,3, //Race
			100,26,3, //Spring
			100,26,3, //Sugar
			100,26,3 //Sustenance
			};	
	int[] tagsHorse = {
			//Max (0 to this) , Influence to, % of influence 0-10
			100,26,3, //Aqua
			100,26,3, //Archier
			100,26,3, //Darkness
			100,26,3, //Day / Night
			100,26,3, //Death
			100,26,3, //Diamond
			100,26,3, //Echo
			100,26,3, //End
			100,26,3, //Fear
			100,26,3, //Feather
			100,26,3, //Flame
			100,26,3, //Gunpowder
			100,26,3, //Iron
			100,26,3, //Light
			100,26,3, //Race
			100,26,3, //Spring
			100,26,3, //Sugar
			100,26,3 //Sustenance
			};	
	int[] tagsIronGolem = {
			//Max (0 to this) , Influence to, % of influence 0-10
			100,26,3, //Aqua
			100,26,3, //Archier
			100,26,3, //Darkness
			100,26,3, //Day / Night
			100,26,3, //Death
			100,26,3, //Diamond
			100,26,3, //Echo
			100,26,3, //End
			100,26,3, //Fear
			100,26,3, //Feather
			100,26,3, //Flame
			100,26,3, //Gunpowder
			100,26,3, //Iron
			100,26,3, //Light
			100,26,3, //Race
			100,26,3, //Spring
			100,26,3, //Sugar
			100,26,3 //Sustenance
			};	
	int[] tagsMagmaCube = {
			//Max (0 to this) , Influence to, % of influence 0-10
			100,26,3, //Aqua
			100,26,3, //Archier
			100,26,3, //Darkness
			100,26,3, //Day / Night
			100,26,3, //Death
			100,26,3, //Diamond
			100,26,3, //Echo
			100,26,3, //End
			100,26,3, //Fear
			100,26,3, //Feather
			100,26,3, //Flame
			100,26,3, //Gunpowder
			100,26,3, //Iron
			100,26,3, //Light
			100,26,3, //Race
			100,26,3, //Spring
			100,26,3, //Sugar
			100,26,3 //Sustenance
			};	
	int[] tagsMooshroom = {
			//Max (0 to this) , Influence to, % of influence 0-10
			100,26,3, //Aqua
			100,26,3, //Archier
			100,26,3, //Darkness
			100,26,3, //Day / Night
			100,26,3, //Death
			100,26,3, //Diamond
			100,26,3, //Echo
			100,26,3, //End
			100,26,3, //Fear
			100,26,3, //Feather
			100,26,3, //Flame
			100,26,3, //Gunpowder
			100,26,3, //Iron
			100,26,3, //Light
			100,26,3, //Race
			100,26,3, //Spring
			100,26,3, //Sugar
			100,26,3 //Sustenance
			};	
	int[] tagsOcelot = {
			//Max (0 to this) , Influence to, % of influence 0-10
			100,26,3, //Aqua
			100,26,3, //Archier
			100,26,3, //Darkness
			100,26,3, //Day / Night
			100,26,3, //Death
			100,26,3, //Diamond
			100,26,3, //Echo
			100,26,3, //End
			100,26,3, //Fear
			100,26,3, //Feather
			100,26,3, //Flame
			100,26,3, //Gunpowder
			100,26,3, //Iron
			100,26,3, //Light
			100,26,3, //Race
			100,26,3, //Spring
			100,26,3, //Sugar
			100,26,3 //Sustenance
			};	
	int[] tagsPig = {
			//Max (0 to this) , Influence to, % of influence 0-10
			100,26,3, //Aqua
			100,26,3, //Archier
			100,26,3, //Darkness
			100,26,3, //Day / Night
			100,26,3, //Death
			100,26,3, //Diamond
			100,26,3, //Echo
			100,26,3, //End
			100,26,3, //Fear
			100,26,3, //Feather
			100,26,3, //Flame
			100,26,3, //Gunpowder
			100,26,3, //Iron
			100,26,3, //Light
			100,26,3, //Race
			100,26,3, //Spring
			100,26,3, //Sugar
			100,26,3 //Sustenance
			};	
	int[] tagsSheep = {
			//Max (0 to this) , Influence to, % of influence 0-10
			100,26,3, //Aqua
			100,26,3, //Archier
			100,26,3, //Darkness
			100,26,3, //Day / Night
			100,26,3, //Death
			100,26,3, //Diamond
			100,26,3, //Echo
			100,26,3, //End
			100,26,3, //Fear
			100,26,3, //Feather
			100,26,3, //Flame
			100,26,3, //Gunpowder
			100,26,3, //Iron
			100,26,3, //Light
			100,26,3, //Race
			100,26,3, //Spring
			100,26,3, //Sugar
			100,26,3 //Sustenance
			};	
	int[] tagsSilverfish = {
			//Max (0 to this) , Influence to, % of influence 0-10
			100,26,3, //Aqua
			100,26,3, //Archier
			100,26,3, //Darkness
			100,26,3, //Day / Night
			100,26,3, //Death
			100,26,3, //Diamond
			100,26,3, //Echo
			100,26,3, //End
			100,26,3, //Fear
			100,26,3, //Feather
			100,26,3, //Flame
			100,26,3, //Gunpowder
			100,26,3, //Iron
			100,26,3, //Light
			100,26,3, //Race
			100,26,3, //Spring
			100,26,3, //Sugar
			100,26,3 //Sustenance
			};	
	int[] tagsSkeleton = {
			//Max (0 to this) , Influence to, % of influence 0-10
			100,26,3, //Aqua
			100,26,3, //Archier
			100,26,3, //Darkness
			100,26,3, //Day / Night
			100,26,3, //Death
			100,26,3, //Diamond
			100,26,3, //Echo
			100,26,3, //End
			100,26,3, //Fear
			100,26,3, //Feather
			100,26,3, //Flame
			100,26,3, //Gunpowder
			100,26,3, //Iron
			100,26,3, //Light
			100,26,3, //Race
			100,26,3, //Spring
			100,26,3, //Sugar
			100,26,3 //Sustenance
			};	
	int[] tagsSlime = {
			//Max (0 to this) , Influence to, % of influence 0-10
			100,26,3, //Aqua
			100,26,3, //Archier
			100,26,3, //Darkness
			100,26,3, //Day / Night
			100,26,3, //Death
			100,26,3, //Diamond
			100,26,3, //Echo
			100,26,3, //End
			100,26,3, //Fear
			100,26,3, //Feather
			100,26,3, //Flame
			100,26,3, //Gunpowder
			100,26,3, //Iron
			100,26,3, //Light
			100,26,3, //Race
			100,26,3, //Spring
			100,26,3, //Sugar
			100,26,3 //Sustenance
			};	
	int[] tagsSnowGolem = {
			//Max (0 to this) , Influence to, % of influence 0-10
			100,26,3, //Aqua
			100,26,3, //Archier
			100,26,3, //Darkness
			100,26,3, //Day / Night
			100,26,3, //Death
			100,26,3, //Diamond
			100,26,3, //Echo
			100,26,3, //End
			100,26,3, //Fear
			100,26,3, //Feather
			100,26,3, //Flame
			100,26,3, //Gunpowder
			100,26,3, //Iron
			100,26,3, //Light
			100,26,3, //Race
			100,26,3, //Spring
			100,26,3, //Sugar
			100,26,3 //Sustenance
			};	
	int[] tagsSpider = {
			//Max (0 to this) , Influence to, % of influence 0-10
			100,26,3, //Aqua
			100,26,3, //Archier
			100,26,3, //Darkness
			100,26,3, //Day / Night
			100,26,3, //Death
			100,26,3, //Diamond
			100,26,3, //Echo
			100,26,3, //End
			100,26,3, //Fear
			100,26,3, //Feather
			100,26,3, //Flame
			100,26,3, //Gunpowder
			100,26,3, //Iron
			100,26,3, //Light
			100,26,3, //Race
			100,26,3, //Spring
			100,26,3, //Sugar
			100,26,3 //Sustenance
			};	
	int[] tagsSquid = {
			//Max (0 to this) , Influence to, % of influence 0-10
			100,26,3, //Aqua
			100,26,3, //Archier
			100,26,3, //Darkness
			100,26,3, //Day / Night
			100,26,3, //Death
			100,26,3, //Diamond
			100,26,3, //Echo
			100,26,3, //End
			100,26,3, //Fear
			100,26,3, //Feather
			100,26,3, //Flame
			100,26,3, //Gunpowder
			100,26,3, //Iron
			100,26,3, //Light
			100,26,3, //Race
			100,26,3, //Spring
			100,26,3, //Sugar
			100,26,3 //Sustenance
			};	
	int[] tagsVillager = {
			//Max (0 to this) , Influence to, % of influence 0-10
			100,26,3, //Aqua
			100,26,3, //Archier
			100,26,3, //Darkness
			100,26,3, //Day / Night
			100,26,3, //Death
			100,26,3, //Diamond
			100,26,3, //Echo
			100,26,3, //End
			100,26,3, //Fear
			100,26,3, //Feather
			100,26,3, //Flame
			100,26,3, //Gunpowder
			100,26,3, //Iron
			100,26,3, //Light
			100,26,3, //Race
			100,26,3, //Spring
			100,26,3, //Sugar
			100,26,3 //Sustenance
			};	
	int[] tagsWitch = {
			//Max (0 to this) , Influence to, % of influence 0-10
			100,26,3, //Aqua
			100,26,3, //Archier
			100,26,3, //Darkness
			100,26,3, //Day / Night
			100,26,3, //Death
			100,26,3, //Diamond
			100,26,3, //Echo
			100,26,3, //End
			100,26,3, //Fear
			100,26,3, //Feather
			100,26,3, //Flame
			100,26,3, //Gunpowder
			100,26,3, //Iron
			100,26,3, //Light
			100,26,3, //Race
			100,26,3, //Spring
			100,26,3, //Sugar
			100,26,3 //Sustenance
			};	
	int[] tagsWither = {
			//Max (0 to this) , Influence to, % of influence 0-10
			100,26,3, //Aqua
			100,26,3, //Archier
			100,26,3, //Darkness
			100,26,3, //Day / Night
			100,26,3, //Death
			100,26,3, //Diamond
			100,26,3, //Echo
			100,26,3, //End
			100,26,3, //Fear
			100,26,3, //Feather
			100,26,3, //Flame
			100,26,3, //Gunpowder
			100,26,3, //Iron
			100,26,3, //Light
			100,26,3, //Race
			100,26,3, //Spring
			100,26,3, //Sugar
			100,26,3 //Sustenance
			};	
	int[] tagsWitherSkeleton = {
			//Max (0 to this) , Influence to, % of influence 0-10
			100,26,3, //Aqua
			100,26,3, //Archier
			100,26,3, //Darkness
			100,26,3, //Day / Night
			100,26,3, //Death
			100,26,3, //Diamond
			100,26,3, //Echo
			100,26,3, //End
			100,26,3, //Fear
			100,26,3, //Feather
			100,26,3, //Flame
			100,26,3, //Gunpowder
			100,26,3, //Iron
			100,26,3, //Light
			100,26,3, //Race
			100,26,3, //Spring
			100,26,3, //Sugar
			100,26,3 //Sustenance
			};	
	int[] tagsWolf = {
			//Max (0 to this) , Influence to, % of influence 0-10
			100,26,3, //Aqua
			100,26,3, //Archier
			100,26,3, //Darkness
			100,26,3, //Day / Night
			100,26,3, //Death
			100,26,3, //Diamond
			100,26,3, //Echo
			100,26,3, //End
			100,26,3, //Fear
			100,26,3, //Feather
			100,26,3, //Flame
			100,26,3, //Gunpowder
			100,26,3, //Iron
			100,26,3, //Light
			100,26,3, //Race
			100,26,3, //Spring
			100,26,3, //Sugar
			100,26,3 //Sustenance
			};
	int[] tagsZombie = {
			//Max (0 to this) , Influence to, % of influence 0-10
			100,26,3, //Aqua
			100,26,3, //Archier
			100,26,3, //Darkness
			100,26,3, //Day / Night
			100,26,3, //Death
			100,26,3, //Diamond
			100,26,3, //Echo
			100,26,3, //End
			100,26,3, //Fear
			100,26,3, //Feather
			100,26,3, //Flame
			100,26,3, //Gunpowder
			100,26,3, //Iron
			100,26,3, //Light
			100,26,3, //Race
			100,26,3, //Spring
			100,26,3, //Sugar
			100,26,3 //Sustenance
			};
	int[] tagsZombiePigman = {
			//Max (0 to this) , Influence to, % of influence 0-10
			100,26,3, //Aqua
			100,26,3, //Archier
			100,26,3, //Darkness
			100,26,3, //Day / Night
			100,26,3, //Death
			100,26,3, //Diamond
			100,26,3, //Echo
			100,26,3, //End
			100,26,3, //Fear
			100,26,3, //Feather
			100,26,3, //Flame
			100,26,3, //Gunpowder
			100,26,3, //Iron
			100,26,3, //Light
			100,26,3, //Race
			100,26,3, //Spring
			100,26,3, //Sugar
			100,26,3 //Sustenance
			};
	int[] tagsZombieVillager = {
			//Max (0 to this) , Influence to, % of influence 0-10
			100,26,3, //Aqua
			100,26,3, //Archier
			100,26,3, //Darkness
			100,26,3, //Day / Night
			100,26,3, //Death
			100,26,3, //Diamond
			100,26,3, //Echo
			100,26,3, //End
			100,26,3, //Fear
			100,26,3, //Feather
			100,26,3, //Flame
			100,26,3, //Gunpowder
			100,26,3, //Iron
			100,26,3, //Light
			100,26,3, //Race
			100,26,3, //Spring
			100,26,3, //Sugar
			100,26,3 //Sustenance
			};
	
		if(itemstack.getItem().itemID==Items.bloodBagBat.itemID){
			int num1;
			
			num1=rand.nextInt(tagsBat[0]);
			if (num1!=tagsBat[1]){
				if(rand.nextInt(10)<tagsBat[2]) num1=tagsBat[1];
			}
			itemstack.stackTagCompound.setInteger("aqua", num1);
			
			num1=rand.nextInt(tagsBat[3]);
			if (num1!=tagsBat[4]){
				if(rand.nextInt(10)<tagsBat[5]) num1=tagsBat[4];
			}
			itemstack.stackTagCompound.setInteger("archier", num1);
			
			num1=rand.nextInt(tagsBat[6]);
			if (num1!=tagsBat[7]){
				if(rand.nextInt(10)<tagsBat[8]) num1=tagsBat[7];
			}
			itemstack.stackTagCompound.setInteger("darkness", num1);
			
			num1=rand.nextInt(tagsBat[9]);
			if (num1!=tagsBat[10]){
				if(rand.nextInt(10)<tagsBat[11]) num1=tagsBat[10];
			}
			itemstack.stackTagCompound.setInteger("day", num1);
			
			num1=rand.nextInt(tagsBat[12]);
			if (num1!=tagsBat[13]){
				if(rand.nextInt(10)<tagsBat[14]) num1=tagsBat[13];
			}
			itemstack.stackTagCompound.setInteger("death", num1);
			
			num1=rand.nextInt(tagsBat[15]);
			if (num1!=tagsBat[16]){
				if(rand.nextInt(10)<tagsBat[17]) num1=tagsBat[16];
			}
			itemstack.stackTagCompound.setInteger("diamond", num1);
			
			num1=rand.nextInt(tagsBat[18]);
			if (num1!=tagsBat[19]){
				if(rand.nextInt(10)<tagsBat[20]) num1=tagsBat[19];
			}
			itemstack.stackTagCompound.setInteger("echo", num1);
			
			num1=rand.nextInt(tagsBat[21]);
			if (num1!=tagsBat[22]){
				if(rand.nextInt(10)<tagsBat[23]) num1=tagsBat[22];
			}
			itemstack.stackTagCompound.setInteger("end", num1);
			
			num1=rand.nextInt(tagsBat[24]);
			if (num1!=tagsBat[25]){
				if(rand.nextInt(10)<tagsBat[26]) num1=tagsBat[25];
			}
			itemstack.stackTagCompound.setInteger("fear", num1);
			
			num1=rand.nextInt(tagsBat[27]);
			if (num1!=tagsBat[28]){
				if(rand.nextInt(10)<tagsBat[29]) num1=tagsBat[28];
			}
			itemstack.stackTagCompound.setInteger("feather", num1);
			
			num1=rand.nextInt(tagsBat[30]);
			if (num1!=tagsBat[31]){
				if(rand.nextInt(10)<tagsBat[32]) num1=tagsBat[31];
			}
			itemstack.stackTagCompound.setInteger("flame", num1);
			
			num1=rand.nextInt(tagsBat[33]);
			if (num1!=tagsBat[34]){
				if(rand.nextInt(10)<tagsBat[35]) num1=tagsBat[34];
			}
			itemstack.stackTagCompound.setInteger("gunpowder", num1);
			
			num1=rand.nextInt(tagsBat[36]);
			if (num1!=tagsBat[37]){
				if(rand.nextInt(10)<tagsBat[38]) num1=tagsBat[37];
			}
			itemstack.stackTagCompound.setInteger("iron", num1);
			
			num1=rand.nextInt(tagsBat[39]);
			if (num1!=tagsBat[40]){
				if(rand.nextInt(10)<tagsBat[41]) num1=tagsBat[40];
			}
			itemstack.stackTagCompound.setInteger("light", num1);
			
			num1=rand.nextInt(tagsBat[42]);
			if (num1!=tagsBat[43]){
				if(rand.nextInt(10)<tagsBat[44]) num1=tagsBat[43];
			}
			itemstack.stackTagCompound.setInteger("race", num1);
			
			num1=rand.nextInt(tagsBat[45]);
			if (num1!=tagsBat[46]){
				if(rand.nextInt(10)<tagsBat[47]) num1=tagsBat[46];
			}
			itemstack.stackTagCompound.setInteger("spring", num1);
			
			num1=rand.nextInt(tagsBat[48]);
			if (num1!=tagsBat[49]){
				if(rand.nextInt(10)<tagsBat[50]) num1=tagsBat[49];
			}
			itemstack.stackTagCompound.setInteger("sugar", num1);
			
			num1=rand.nextInt(tagsBat[51]);
			if (num1!=tagsBat[52]){
				if(rand.nextInt(10)<tagsBat[53]) num1=tagsBat[52];
			}
			itemstack.stackTagCompound.setInteger("sustenance", num1);
			
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}	
		else if(itemstack.getItem().itemID==Items.bloodBagBlaze.itemID){
			int num1;
			
			num1=rand.nextInt(tagsBlaze[0]);
			if (num1!=tagsBlaze[1]){
				if(rand.nextInt(10)<tagsBlaze[2]) num1=tagsBlaze[1];
			}
			itemstack.stackTagCompound.setInteger("aqua", num1);
			
			num1=rand.nextInt(tagsBlaze[3]);
			if (num1!=tagsBlaze[4]){
				if(rand.nextInt(10)<tagsBlaze[5]) num1=tagsBlaze[4];
			}
			itemstack.stackTagCompound.setInteger("archier", num1);
			
			num1=rand.nextInt(tagsBlaze[6]);
			if (num1!=tagsBlaze[7]){
				if(rand.nextInt(10)<tagsBlaze[8]) num1=tagsBlaze[7];
			}
			itemstack.stackTagCompound.setInteger("darkness", num1);
			
			num1=rand.nextInt(tagsBlaze[9]);
			if (num1!=tagsBlaze[10]){
				if(rand.nextInt(10)<tagsBlaze[11]) num1=tagsBlaze[10];
			}
			itemstack.stackTagCompound.setInteger("day", num1);
			
			num1=rand.nextInt(tagsBlaze[12]);
			if (num1!=tagsBlaze[13]){
				if(rand.nextInt(10)<tagsBlaze[14]) num1=tagsBlaze[13];
			}
			itemstack.stackTagCompound.setInteger("death", num1);
			
			num1=rand.nextInt(tagsBlaze[15]);
			if (num1!=tagsBlaze[16]){
				if(rand.nextInt(10)<tagsBlaze[17]) num1=tagsBlaze[16];
			}
			itemstack.stackTagCompound.setInteger("diamond", num1);
			
			num1=rand.nextInt(tagsBlaze[18]);
			if (num1!=tagsBlaze[19]){
				if(rand.nextInt(10)<tagsBlaze[20]) num1=tagsBlaze[19];
			}
			itemstack.stackTagCompound.setInteger("echo", num1);
			
			num1=rand.nextInt(tagsBlaze[21]);
			if (num1!=tagsBlaze[22]){
				if(rand.nextInt(10)<tagsBlaze[23]) num1=tagsBlaze[22];
			}
			itemstack.stackTagCompound.setInteger("end", num1);
			
			num1=rand.nextInt(tagsBlaze[24]);
			if (num1!=tagsBlaze[25]){
				if(rand.nextInt(10)<tagsBlaze[26]) num1=tagsBlaze[25];
			}
			itemstack.stackTagCompound.setInteger("fear", num1);
			
			num1=rand.nextInt(tagsBlaze[27]);
			if (num1!=tagsBlaze[28]){
				if(rand.nextInt(10)<tagsBlaze[29]) num1=tagsBlaze[28];
			}
			itemstack.stackTagCompound.setInteger("feather", num1);
			
			num1=rand.nextInt(tagsBlaze[30]);
			if (num1!=tagsBlaze[31]){
				if(rand.nextInt(10)<tagsBlaze[32]) num1=tagsBlaze[31];
			}
			itemstack.stackTagCompound.setInteger("flame", num1);
			
			num1=rand.nextInt(tagsBlaze[33]);
			if (num1!=tagsBlaze[34]){
				if(rand.nextInt(10)<tagsBlaze[35]) num1=tagsBlaze[34];
			}
			itemstack.stackTagCompound.setInteger("gunpowder", num1);
			
			num1=rand.nextInt(tagsBlaze[36]);
			if (num1!=tagsBlaze[37]){
				if(rand.nextInt(10)<tagsBlaze[38]) num1=tagsBlaze[37];
			}
			itemstack.stackTagCompound.setInteger("iron", num1);
			
			num1=rand.nextInt(tagsBlaze[39]);
			if (num1!=tagsBlaze[40]){
				if(rand.nextInt(10)<tagsBlaze[41]) num1=tagsBlaze[40];
			}
			itemstack.stackTagCompound.setInteger("light", num1);
			
			num1=rand.nextInt(tagsBlaze[42]);
			if (num1!=tagsBlaze[43]){
				if(rand.nextInt(10)<tagsBlaze[44]) num1=tagsBlaze[43];
			}
			itemstack.stackTagCompound.setInteger("race", num1);
			
			num1=rand.nextInt(tagsBlaze[45]);
			if (num1!=tagsBlaze[46]){
				if(rand.nextInt(10)<tagsBlaze[47]) num1=tagsBlaze[46];
			}
			itemstack.stackTagCompound.setInteger("spring", num1);
			
			num1=rand.nextInt(tagsBlaze[48]);
			if (num1!=tagsBlaze[49]){
				if(rand.nextInt(10)<tagsBlaze[50]) num1=tagsBlaze[49];
			}
			itemstack.stackTagCompound.setInteger("sugar", num1);
			
			num1=rand.nextInt(tagsBlaze[51]);
			if (num1!=tagsBlaze[52]){
				if(rand.nextInt(10)<tagsBlaze[53]) num1=tagsBlaze[52];
			}
			itemstack.stackTagCompound.setInteger("sustenance", num1);
			
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}	
		else if(itemstack.getItem().itemID==Items.bloodBagCaveSpider.itemID){
			int num1;
			
			num1=rand.nextInt(tagsCaveSpider[0]);
			if (num1!=tagsCaveSpider[1]){
				if(rand.nextInt(10)<tagsCaveSpider[2]) num1=tagsCaveSpider[1];
			}
			itemstack.stackTagCompound.setInteger("aqua", num1);
			
			num1=rand.nextInt(tagsCaveSpider[3]);
			if (num1!=tagsCaveSpider[4]){
				if(rand.nextInt(10)<tagsCaveSpider[5]) num1=tagsCaveSpider[4];
			}
			itemstack.stackTagCompound.setInteger("archier", num1);
			
			num1=rand.nextInt(tagsCaveSpider[6]);
			if (num1!=tagsCaveSpider[7]){
				if(rand.nextInt(10)<tagsCaveSpider[8]) num1=tagsCaveSpider[7];
			}
			itemstack.stackTagCompound.setInteger("darkness", num1);
			
			num1=rand.nextInt(tagsCaveSpider[9]);
			if (num1!=tagsCaveSpider[10]){
				if(rand.nextInt(10)<tagsCaveSpider[11]) num1=tagsCaveSpider[10];
			}
			itemstack.stackTagCompound.setInteger("day", num1);
			
			num1=rand.nextInt(tagsCaveSpider[12]);
			if (num1!=tagsCaveSpider[13]){
				if(rand.nextInt(10)<tagsCaveSpider[14]) num1=tagsCaveSpider[13];
			}
			itemstack.stackTagCompound.setInteger("death", num1);
			
			num1=rand.nextInt(tagsCaveSpider[15]);
			if (num1!=tagsCaveSpider[16]){
				if(rand.nextInt(10)<tagsCaveSpider[17]) num1=tagsCaveSpider[16];
			}
			itemstack.stackTagCompound.setInteger("diamond", num1);
			
			num1=rand.nextInt(tagsCaveSpider[18]);
			if (num1!=tagsCaveSpider[19]){
				if(rand.nextInt(10)<tagsCaveSpider[20]) num1=tagsCaveSpider[19];
			}
			itemstack.stackTagCompound.setInteger("echo", num1);
			
			num1=rand.nextInt(tagsCaveSpider[21]);
			if (num1!=tagsCaveSpider[22]){
				if(rand.nextInt(10)<tagsCaveSpider[23]) num1=tagsCaveSpider[22];
			}
			itemstack.stackTagCompound.setInteger("end", num1);
			
			num1=rand.nextInt(tagsCaveSpider[24]);
			if (num1!=tagsCaveSpider[25]){
				if(rand.nextInt(10)<tagsCaveSpider[26]) num1=tagsCaveSpider[25];
			}
			itemstack.stackTagCompound.setInteger("fear", num1);
			
			num1=rand.nextInt(tagsCaveSpider[27]);
			if (num1!=tagsCaveSpider[28]){
				if(rand.nextInt(10)<tagsCaveSpider[29]) num1=tagsCaveSpider[28];
			}
			itemstack.stackTagCompound.setInteger("feather", num1);
			
			num1=rand.nextInt(tagsCaveSpider[30]);
			if (num1!=tagsCaveSpider[31]){
				if(rand.nextInt(10)<tagsCaveSpider[32]) num1=tagsCaveSpider[31];
			}
			itemstack.stackTagCompound.setInteger("flame", num1);
			
			num1=rand.nextInt(tagsCaveSpider[33]);
			if (num1!=tagsCaveSpider[34]){
				if(rand.nextInt(10)<tagsCaveSpider[35]) num1=tagsCaveSpider[34];
			}
			itemstack.stackTagCompound.setInteger("gunpowder", num1);
			
			num1=rand.nextInt(tagsCaveSpider[36]);
			if (num1!=tagsCaveSpider[37]){
				if(rand.nextInt(10)<tagsCaveSpider[38]) num1=tagsCaveSpider[37];
			}
			itemstack.stackTagCompound.setInteger("iron", num1);
			
			num1=rand.nextInt(tagsCaveSpider[39]);
			if (num1!=tagsCaveSpider[40]){
				if(rand.nextInt(10)<tagsCaveSpider[41]) num1=tagsCaveSpider[40];
			}
			itemstack.stackTagCompound.setInteger("light", num1);
			
			num1=rand.nextInt(tagsCaveSpider[42]);
			if (num1!=tagsCaveSpider[43]){
				if(rand.nextInt(10)<tagsCaveSpider[44]) num1=tagsCaveSpider[43];
			}
			itemstack.stackTagCompound.setInteger("race", num1);
			
			num1=rand.nextInt(tagsCaveSpider[45]);
			if (num1!=tagsCaveSpider[46]){
				if(rand.nextInt(10)<tagsCaveSpider[47]) num1=tagsCaveSpider[46];
			}
			itemstack.stackTagCompound.setInteger("spring", num1);
			
			num1=rand.nextInt(tagsCaveSpider[48]);
			if (num1!=tagsCaveSpider[49]){
				if(rand.nextInt(10)<tagsCaveSpider[50]) num1=tagsCaveSpider[49];
			}
			itemstack.stackTagCompound.setInteger("sugar", num1);
			
			num1=rand.nextInt(tagsCaveSpider[51]);
			if (num1!=tagsCaveSpider[52]){
				if(rand.nextInt(10)<tagsCaveSpider[53]) num1=tagsCaveSpider[52];
			}
			itemstack.stackTagCompound.setInteger("sustenance", num1);
			
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}	
		else if(itemstack.getItem().itemID==Items.bloodBagChicken.itemID){
			int num1;
			
			num1=rand.nextInt(tagsChicken[0]);
			if (num1!=tagsChicken[1]){
				if(rand.nextInt(10)<tagsChicken[2]) num1=tagsChicken[1];
			}
			itemstack.stackTagCompound.setInteger("aqua", num1);
			
			num1=rand.nextInt(tagsChicken[3]);
			if (num1!=tagsChicken[4]){
				if(rand.nextInt(10)<tagsChicken[5]) num1=tagsChicken[4];
			}
			itemstack.stackTagCompound.setInteger("archier", num1);
			
			num1=rand.nextInt(tagsChicken[6]);
			if (num1!=tagsChicken[7]){
				if(rand.nextInt(10)<tagsChicken[8]) num1=tagsChicken[7];
			}
			itemstack.stackTagCompound.setInteger("darkness", num1);
			
			num1=rand.nextInt(tagsChicken[9]);
			if (num1!=tagsChicken[10]){
				if(rand.nextInt(10)<tagsChicken[11]) num1=tagsChicken[10];
			}
			itemstack.stackTagCompound.setInteger("day", num1);
			
			num1=rand.nextInt(tagsChicken[12]);
			if (num1!=tagsChicken[13]){
				if(rand.nextInt(10)<tagsChicken[14]) num1=tagsChicken[13];
			}
			itemstack.stackTagCompound.setInteger("death", num1);
			
			num1=rand.nextInt(tagsChicken[15]);
			if (num1!=tagsChicken[16]){
				if(rand.nextInt(10)<tagsChicken[17]) num1=tagsChicken[16];
			}
			itemstack.stackTagCompound.setInteger("diamond", num1);
			
			num1=rand.nextInt(tagsChicken[18]);
			if (num1!=tagsChicken[19]){
				if(rand.nextInt(10)<tagsChicken[20]) num1=tagsChicken[19];
			}
			itemstack.stackTagCompound.setInteger("echo", num1);
			
			num1=rand.nextInt(tagsChicken[21]);
			if (num1!=tagsChicken[22]){
				if(rand.nextInt(10)<tagsChicken[23]) num1=tagsChicken[22];
			}
			itemstack.stackTagCompound.setInteger("end", num1);
			
			num1=rand.nextInt(tagsChicken[24]);
			if (num1!=tagsChicken[25]){
				if(rand.nextInt(10)<tagsChicken[26]) num1=tagsChicken[25];
			}
			itemstack.stackTagCompound.setInteger("fear", num1);
			
			num1=rand.nextInt(tagsChicken[27]);
			if (num1!=tagsChicken[28]){
				if(rand.nextInt(10)<tagsChicken[29]) num1=tagsChicken[28];
			}
			itemstack.stackTagCompound.setInteger("feather", num1);
			
			num1=rand.nextInt(tagsChicken[30]);
			if (num1!=tagsChicken[31]){
				if(rand.nextInt(10)<tagsChicken[32]) num1=tagsChicken[31];
			}
			itemstack.stackTagCompound.setInteger("flame", num1);
			
			num1=rand.nextInt(tagsChicken[33]);
			if (num1!=tagsChicken[34]){
				if(rand.nextInt(10)<tagsChicken[35]) num1=tagsChicken[34];
			}
			itemstack.stackTagCompound.setInteger("gunpowder", num1);
			
			num1=rand.nextInt(tagsChicken[36]);
			if (num1!=tagsChicken[37]){
				if(rand.nextInt(10)<tagsChicken[38]) num1=tagsChicken[37];
			}
			itemstack.stackTagCompound.setInteger("iron", num1);
			
			num1=rand.nextInt(tagsChicken[39]);
			if (num1!=tagsChicken[40]){
				if(rand.nextInt(10)<tagsChicken[41]) num1=tagsChicken[40];
			}
			itemstack.stackTagCompound.setInteger("light", num1);
			
			num1=rand.nextInt(tagsChicken[42]);
			if (num1!=tagsChicken[43]){
				if(rand.nextInt(10)<tagsChicken[44]) num1=tagsChicken[43];
			}
			itemstack.stackTagCompound.setInteger("race", num1);
			
			num1=rand.nextInt(tagsChicken[45]);
			if (num1!=tagsChicken[46]){
				if(rand.nextInt(10)<tagsChicken[47]) num1=tagsChicken[46];
			}
			itemstack.stackTagCompound.setInteger("spring", num1);
			
			num1=rand.nextInt(tagsChicken[48]);
			if (num1!=tagsChicken[49]){
				if(rand.nextInt(10)<tagsChicken[50]) num1=tagsChicken[49];
			}
			itemstack.stackTagCompound.setInteger("sugar", num1);
			
			num1=rand.nextInt(tagsChicken[51]);
			if (num1!=tagsChicken[52]){
				if(rand.nextInt(10)<tagsChicken[53]) num1=tagsChicken[52];
			}
			itemstack.stackTagCompound.setInteger("sustenance", num1);
			
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}	
		else if(itemstack.getItem().itemID==Items.bloodBagCow.itemID){
			int num1;
			
			num1=rand.nextInt(tagsCow[0]);
			if (num1!=tagsCow[1]){
				if(rand.nextInt(10)<tagsCow[2]) num1=tagsCow[1];
			}
			itemstack.stackTagCompound.setInteger("aqua", num1);
			
			num1=rand.nextInt(tagsCow[3]);
			if (num1!=tagsCow[4]){
				if(rand.nextInt(10)<tagsCow[5]) num1=tagsCow[4];
			}
			itemstack.stackTagCompound.setInteger("archier", num1);
			
			num1=rand.nextInt(tagsCow[6]);
			if (num1!=tagsCow[7]){
				if(rand.nextInt(10)<tagsCow[8]) num1=tagsCow[7];
			}
			itemstack.stackTagCompound.setInteger("darkness", num1);
			
			num1=rand.nextInt(tagsCow[9]);
			if (num1!=tagsCow[10]){
				if(rand.nextInt(10)<tagsCow[11]) num1=tagsCow[10];
			}
			itemstack.stackTagCompound.setInteger("day", num1);
			
			num1=rand.nextInt(tagsCow[12]);
			if (num1!=tagsCow[13]){
				if(rand.nextInt(10)<tagsCow[14]) num1=tagsCow[13];
			}
			itemstack.stackTagCompound.setInteger("death", num1);
			
			num1=rand.nextInt(tagsCow[15]);
			if (num1!=tagsCow[16]){
				if(rand.nextInt(10)<tagsCow[17]) num1=tagsCow[16];
			}
			itemstack.stackTagCompound.setInteger("diamond", num1);
			
			num1=rand.nextInt(tagsCow[18]);
			if (num1!=tagsCow[19]){
				if(rand.nextInt(10)<tagsCow[20]) num1=tagsCow[19];
			}
			itemstack.stackTagCompound.setInteger("echo", num1);
			
			num1=rand.nextInt(tagsCow[21]);
			if (num1!=tagsCow[22]){
				if(rand.nextInt(10)<tagsCow[23]) num1=tagsCow[22];
			}
			itemstack.stackTagCompound.setInteger("end", num1);
			
			num1=rand.nextInt(tagsCow[24]);
			if (num1!=tagsCow[25]){
				if(rand.nextInt(10)<tagsCow[26]) num1=tagsCow[25];
			}
			itemstack.stackTagCompound.setInteger("fear", num1);
			
			num1=rand.nextInt(tagsCow[27]);
			if (num1!=tagsCow[28]){
				if(rand.nextInt(10)<tagsCow[29]) num1=tagsCow[28];
			}
			itemstack.stackTagCompound.setInteger("feather", num1);
			
			num1=rand.nextInt(tagsCow[30]);
			if (num1!=tagsCow[31]){
				if(rand.nextInt(10)<tagsCow[32]) num1=tagsCow[31];
			}
			itemstack.stackTagCompound.setInteger("flame", num1);
			
			num1=rand.nextInt(tagsCow[33]);
			if (num1!=tagsCow[34]){
				if(rand.nextInt(10)<tagsCow[35]) num1=tagsCow[34];
			}
			itemstack.stackTagCompound.setInteger("gunpowder", num1);
			
			num1=rand.nextInt(tagsCow[36]);
			if (num1!=tagsCow[37]){
				if(rand.nextInt(10)<tagsCow[38]) num1=tagsCow[37];
			}
			itemstack.stackTagCompound.setInteger("iron", num1);
			
			num1=rand.nextInt(tagsCow[39]);
			if (num1!=tagsCow[40]){
				if(rand.nextInt(10)<tagsCow[41]) num1=tagsCow[40];
			}
			itemstack.stackTagCompound.setInteger("light", num1);
			
			num1=rand.nextInt(tagsCow[42]);
			if (num1!=tagsCow[43]){
				if(rand.nextInt(10)<tagsCow[44]) num1=tagsCow[43];
			}
			itemstack.stackTagCompound.setInteger("race", num1);
			
			num1=rand.nextInt(tagsCow[45]);
			if (num1!=tagsCow[46]){
				if(rand.nextInt(10)<tagsCow[47]) num1=tagsCow[46];
			}
			itemstack.stackTagCompound.setInteger("spring", num1);
			
			num1=rand.nextInt(tagsCow[48]);
			if (num1!=tagsCow[49]){
				if(rand.nextInt(10)<tagsCow[50]) num1=tagsCow[49];
			}
			itemstack.stackTagCompound.setInteger("sugar", num1);
			
			num1=rand.nextInt(tagsCow[51]);
			if (num1!=tagsCow[52]){
				if(rand.nextInt(10)<tagsCow[53]) num1=tagsCow[52];
			}
			itemstack.stackTagCompound.setInteger("sustenance", num1);
			
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}	
		else if(itemstack.getItem().itemID==Items.bloodBagCreeper.itemID){
			int num1;
			
			num1=rand.nextInt(tagsCreeper[0]);
			if (num1!=tagsCreeper[1]){
				if(rand.nextInt(10)<tagsCreeper[2]) num1=tagsCreeper[1];
			}
			itemstack.stackTagCompound.setInteger("aqua", num1);
			
			num1=rand.nextInt(tagsCreeper[3]);
			if (num1!=tagsCreeper[4]){
				if(rand.nextInt(10)<tagsCreeper[5]) num1=tagsCreeper[4];
			}
			itemstack.stackTagCompound.setInteger("archier", num1);
			
			num1=rand.nextInt(tagsCreeper[6]);
			if (num1!=tagsCreeper[7]){
				if(rand.nextInt(10)<tagsCreeper[8]) num1=tagsCreeper[7];
			}
			itemstack.stackTagCompound.setInteger("darkness", num1);
			
			num1=rand.nextInt(tagsCreeper[9]);
			if (num1!=tagsCreeper[10]){
				if(rand.nextInt(10)<tagsCreeper[11]) num1=tagsCreeper[10];
			}
			itemstack.stackTagCompound.setInteger("day", num1);
			
			num1=rand.nextInt(tagsCreeper[12]);
			if (num1!=tagsCreeper[13]){
				if(rand.nextInt(10)<tagsCreeper[14]) num1=tagsCreeper[13];
			}
			itemstack.stackTagCompound.setInteger("death", num1);
			
			num1=rand.nextInt(tagsCreeper[15]);
			if (num1!=tagsCreeper[16]){
				if(rand.nextInt(10)<tagsCreeper[17]) num1=tagsCreeper[16];
			}
			itemstack.stackTagCompound.setInteger("diamond", num1);
			
			num1=rand.nextInt(tagsCreeper[18]);
			if (num1!=tagsCreeper[19]){
				if(rand.nextInt(10)<tagsCreeper[20]) num1=tagsCreeper[19];
			}
			itemstack.stackTagCompound.setInteger("echo", num1);
			
			num1=rand.nextInt(tagsCreeper[21]);
			if (num1!=tagsCreeper[22]){
				if(rand.nextInt(10)<tagsCreeper[23]) num1=tagsCreeper[22];
			}
			itemstack.stackTagCompound.setInteger("end", num1);
			
			num1=rand.nextInt(tagsCreeper[24]);
			if (num1!=tagsCreeper[25]){
				if(rand.nextInt(10)<tagsCreeper[26]) num1=tagsCreeper[25];
			}
			itemstack.stackTagCompound.setInteger("fear", num1);
			
			num1=rand.nextInt(tagsCreeper[27]);
			if (num1!=tagsCreeper[28]){
				if(rand.nextInt(10)<tagsCreeper[29]) num1=tagsCreeper[28];
			}
			itemstack.stackTagCompound.setInteger("feather", num1);
			
			num1=rand.nextInt(tagsCreeper[30]);
			if (num1!=tagsCreeper[31]){
				if(rand.nextInt(10)<tagsCreeper[32]) num1=tagsCreeper[31];
			}
			itemstack.stackTagCompound.setInteger("flame", num1);
			
			num1=rand.nextInt(tagsCreeper[33]);
			if (num1!=tagsCreeper[34]){
				if(rand.nextInt(10)<tagsCreeper[35]) num1=tagsCreeper[34];
			}
			itemstack.stackTagCompound.setInteger("gunpowder", num1);
			
			num1=rand.nextInt(tagsCreeper[36]);
			if (num1!=tagsCreeper[37]){
				if(rand.nextInt(10)<tagsCreeper[38]) num1=tagsCreeper[37];
			}
			itemstack.stackTagCompound.setInteger("iron", num1);
			
			num1=rand.nextInt(tagsCreeper[39]);
			if (num1!=tagsCreeper[40]){
				if(rand.nextInt(10)<tagsCreeper[41]) num1=tagsCreeper[40];
			}
			itemstack.stackTagCompound.setInteger("light", num1);
			
			num1=rand.nextInt(tagsCreeper[42]);
			if (num1!=tagsCreeper[43]){
				if(rand.nextInt(10)<tagsCreeper[44]) num1=tagsCreeper[43];
			}
			itemstack.stackTagCompound.setInteger("race", num1);
			
			num1=rand.nextInt(tagsCreeper[45]);
			if (num1!=tagsCreeper[46]){
				if(rand.nextInt(10)<tagsCreeper[47]) num1=tagsCreeper[46];
			}
			itemstack.stackTagCompound.setInteger("spring", num1);
			
			num1=rand.nextInt(tagsCreeper[48]);
			if (num1!=tagsCreeper[49]){
				if(rand.nextInt(10)<tagsCreeper[50]) num1=tagsCreeper[49];
			}
			itemstack.stackTagCompound.setInteger("sugar", num1);
			
			num1=rand.nextInt(tagsCreeper[51]);
			if (num1!=tagsCreeper[52]){
				if(rand.nextInt(10)<tagsCreeper[53]) num1=tagsCreeper[52];
			}
			itemstack.stackTagCompound.setInteger("sustenance", num1);
			
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}	
		else if(itemstack.getItem().itemID==Items.bloodBagEnderDragon.itemID){
			int num1;
			
			num1=rand.nextInt(tagsEnderDragon[0]);
			if (num1!=tagsEnderDragon[1]){
				if(rand.nextInt(10)<tagsEnderDragon[2]) num1=tagsEnderDragon[1];
			}
			itemstack.stackTagCompound.setInteger("aqua", num1);
			
			num1=rand.nextInt(tagsEnderDragon[3]);
			if (num1!=tagsEnderDragon[4]){
				if(rand.nextInt(10)<tagsEnderDragon[5]) num1=tagsEnderDragon[4];
			}
			itemstack.stackTagCompound.setInteger("archier", num1);
			
			num1=rand.nextInt(tagsEnderDragon[6]);
			if (num1!=tagsEnderDragon[7]){
				if(rand.nextInt(10)<tagsEnderDragon[8]) num1=tagsEnderDragon[7];
			}
			itemstack.stackTagCompound.setInteger("darkness", num1);
			
			num1=rand.nextInt(tagsEnderDragon[9]);
			if (num1!=tagsEnderDragon[10]){
				if(rand.nextInt(10)<tagsEnderDragon[11]) num1=tagsEnderDragon[10];
			}
			itemstack.stackTagCompound.setInteger("day", num1);
			
			num1=rand.nextInt(tagsEnderDragon[12]);
			if (num1!=tagsEnderDragon[13]){
				if(rand.nextInt(10)<tagsEnderDragon[14]) num1=tagsEnderDragon[13];
			}
			itemstack.stackTagCompound.setInteger("death", num1);
			
			num1=rand.nextInt(tagsEnderDragon[15]);
			if (num1!=tagsEnderDragon[16]){
				if(rand.nextInt(10)<tagsEnderDragon[17]) num1=tagsEnderDragon[16];
			}
			itemstack.stackTagCompound.setInteger("diamond", num1);
			
			num1=rand.nextInt(tagsEnderDragon[18]);
			if (num1!=tagsEnderDragon[19]){
				if(rand.nextInt(10)<tagsEnderDragon[20]) num1=tagsEnderDragon[19];
			}
			itemstack.stackTagCompound.setInteger("echo", num1);
			
			num1=rand.nextInt(tagsEnderDragon[21]);
			if (num1!=tagsEnderDragon[22]){
				if(rand.nextInt(10)<tagsEnderDragon[23]) num1=tagsEnderDragon[22];
			}
			itemstack.stackTagCompound.setInteger("end", num1);
			
			num1=rand.nextInt(tagsEnderDragon[24]);
			if (num1!=tagsEnderDragon[25]){
				if(rand.nextInt(10)<tagsEnderDragon[26]) num1=tagsEnderDragon[25];
			}
			itemstack.stackTagCompound.setInteger("fear", num1);
			
			num1=rand.nextInt(tagsEnderDragon[27]);
			if (num1!=tagsEnderDragon[28]){
				if(rand.nextInt(10)<tagsEnderDragon[29]) num1=tagsEnderDragon[28];
			}
			itemstack.stackTagCompound.setInteger("feather", num1);
			
			num1=rand.nextInt(tagsEnderDragon[30]);
			if (num1!=tagsEnderDragon[31]){
				if(rand.nextInt(10)<tagsEnderDragon[32]) num1=tagsEnderDragon[31];
			}
			itemstack.stackTagCompound.setInteger("flame", num1);
			
			num1=rand.nextInt(tagsEnderDragon[33]);
			if (num1!=tagsEnderDragon[34]){
				if(rand.nextInt(10)<tagsEnderDragon[35]) num1=tagsEnderDragon[34];
			}
			itemstack.stackTagCompound.setInteger("gunpowder", num1);
			
			num1=rand.nextInt(tagsEnderDragon[36]);
			if (num1!=tagsEnderDragon[37]){
				if(rand.nextInt(10)<tagsEnderDragon[38]) num1=tagsEnderDragon[37];
			}
			itemstack.stackTagCompound.setInteger("iron", num1);
			
			num1=rand.nextInt(tagsEnderDragon[39]);
			if (num1!=tagsEnderDragon[40]){
				if(rand.nextInt(10)<tagsEnderDragon[41]) num1=tagsEnderDragon[40];
			}
			itemstack.stackTagCompound.setInteger("light", num1);
			
			num1=rand.nextInt(tagsEnderDragon[42]);
			if (num1!=tagsEnderDragon[43]){
				if(rand.nextInt(10)<tagsEnderDragon[44]) num1=tagsEnderDragon[43];
			}
			itemstack.stackTagCompound.setInteger("race", num1);
			
			num1=rand.nextInt(tagsEnderDragon[45]);
			if (num1!=tagsEnderDragon[46]){
				if(rand.nextInt(10)<tagsEnderDragon[47]) num1=tagsEnderDragon[46];
			}
			itemstack.stackTagCompound.setInteger("spring", num1);
			
			num1=rand.nextInt(tagsEnderDragon[48]);
			if (num1!=tagsEnderDragon[49]){
				if(rand.nextInt(10)<tagsEnderDragon[50]) num1=tagsEnderDragon[49];
			}
			itemstack.stackTagCompound.setInteger("sugar", num1);
			
			num1=rand.nextInt(tagsEnderDragon[51]);
			if (num1!=tagsEnderDragon[52]){
				if(rand.nextInt(10)<tagsEnderDragon[53]) num1=tagsEnderDragon[52];
			}
			itemstack.stackTagCompound.setInteger("sustenance", num1);
			
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}	
		else if(itemstack.getItem().itemID==Items.bloodBagEnderman.itemID){
			int num1;
			
			num1=rand.nextInt(tagsEnderman[0]);
			if (num1!=tagsEnderman[1]){
				if(rand.nextInt(10)<tagsEnderman[2]) num1=tagsEnderman[1];
			}
			itemstack.stackTagCompound.setInteger("aqua", num1);
			
			num1=rand.nextInt(tagsEnderman[3]);
			if (num1!=tagsEnderman[4]){
				if(rand.nextInt(10)<tagsEnderman[5]) num1=tagsEnderman[4];
			}
			itemstack.stackTagCompound.setInteger("archier", num1);
			
			num1=rand.nextInt(tagsEnderman[6]);
			if (num1!=tagsEnderman[7]){
				if(rand.nextInt(10)<tagsEnderman[8]) num1=tagsEnderman[7];
			}
			itemstack.stackTagCompound.setInteger("darkness", num1);
			
			num1=rand.nextInt(tagsEnderman[9]);
			if (num1!=tagsEnderman[10]){
				if(rand.nextInt(10)<tagsEnderman[11]) num1=tagsEnderman[10];
			}
			itemstack.stackTagCompound.setInteger("day", num1);
			
			num1=rand.nextInt(tagsEnderman[12]);
			if (num1!=tagsEnderman[13]){
				if(rand.nextInt(10)<tagsEnderman[14]) num1=tagsEnderman[13];
			}
			itemstack.stackTagCompound.setInteger("death", num1);
			
			num1=rand.nextInt(tagsEnderman[15]);
			if (num1!=tagsEnderman[16]){
				if(rand.nextInt(10)<tagsEnderman[17]) num1=tagsEnderman[16];
			}
			itemstack.stackTagCompound.setInteger("diamond", num1);
			
			num1=rand.nextInt(tagsEnderman[18]);
			if (num1!=tagsEnderman[19]){
				if(rand.nextInt(10)<tagsEnderman[20]) num1=tagsEnderman[19];
			}
			itemstack.stackTagCompound.setInteger("echo", num1);
			
			num1=rand.nextInt(tagsEnderman[21]);
			if (num1!=tagsEnderman[22]){
				if(rand.nextInt(10)<tagsEnderman[23]) num1=tagsEnderman[22];
			}
			itemstack.stackTagCompound.setInteger("end", num1);
			
			num1=rand.nextInt(tagsEnderman[24]);
			if (num1!=tagsEnderman[25]){
				if(rand.nextInt(10)<tagsEnderman[26]) num1=tagsEnderman[25];
			}
			itemstack.stackTagCompound.setInteger("fear", num1);
			
			num1=rand.nextInt(tagsEnderman[27]);
			if (num1!=tagsEnderman[28]){
				if(rand.nextInt(10)<tagsEnderman[29]) num1=tagsEnderman[28];
			}
			itemstack.stackTagCompound.setInteger("feather", num1);
			
			num1=rand.nextInt(tagsEnderman[30]);
			if (num1!=tagsEnderman[31]){
				if(rand.nextInt(10)<tagsEnderman[32]) num1=tagsEnderman[31];
			}
			itemstack.stackTagCompound.setInteger("flame", num1);
			
			num1=rand.nextInt(tagsEnderman[33]);
			if (num1!=tagsEnderman[34]){
				if(rand.nextInt(10)<tagsEnderman[35]) num1=tagsEnderman[34];
			}
			itemstack.stackTagCompound.setInteger("gunpowder", num1);
			
			num1=rand.nextInt(tagsEnderman[36]);
			if (num1!=tagsEnderman[37]){
				if(rand.nextInt(10)<tagsEnderman[38]) num1=tagsEnderman[37];
			}
			itemstack.stackTagCompound.setInteger("iron", num1);
			
			num1=rand.nextInt(tagsEnderman[39]);
			if (num1!=tagsEnderman[40]){
				if(rand.nextInt(10)<tagsEnderman[41]) num1=tagsEnderman[40];
			}
			itemstack.stackTagCompound.setInteger("light", num1);
			
			num1=rand.nextInt(tagsEnderman[42]);
			if (num1!=tagsEnderman[43]){
				if(rand.nextInt(10)<tagsEnderman[44]) num1=tagsEnderman[43];
			}
			itemstack.stackTagCompound.setInteger("race", num1);
			
			num1=rand.nextInt(tagsEnderman[45]);
			if (num1!=tagsEnderman[46]){
				if(rand.nextInt(10)<tagsEnderman[47]) num1=tagsEnderman[46];
			}
			itemstack.stackTagCompound.setInteger("spring", num1);
			
			num1=rand.nextInt(tagsEnderman[48]);
			if (num1!=tagsEnderman[49]){
				if(rand.nextInt(10)<tagsEnderman[50]) num1=tagsEnderman[49];
			}
			itemstack.stackTagCompound.setInteger("sugar", num1);
			
			num1=rand.nextInt(tagsEnderman[51]);
			if (num1!=tagsEnderman[52]){
				if(rand.nextInt(10)<tagsEnderman[53]) num1=tagsEnderman[52];
			}
			itemstack.stackTagCompound.setInteger("sustenance", num1);
			
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}	
		else if(itemstack.getItem().itemID==Items.bloodBagGhast.itemID){
			int num1;
			
			num1=rand.nextInt(tagsGhast[0]);
			if (num1!=tagsGhast[1]){
				if(rand.nextInt(10)<tagsGhast[2]) num1=tagsGhast[1];
			}
			itemstack.stackTagCompound.setInteger("aqua", num1);
			
			num1=rand.nextInt(tagsGhast[3]);
			if (num1!=tagsGhast[4]){
				if(rand.nextInt(10)<tagsGhast[5]) num1=tagsGhast[4];
			}
			itemstack.stackTagCompound.setInteger("archier", num1);
			
			num1=rand.nextInt(tagsGhast[6]);
			if (num1!=tagsGhast[7]){
				if(rand.nextInt(10)<tagsGhast[8]) num1=tagsGhast[7];
			}
			itemstack.stackTagCompound.setInteger("darkness", num1);
			
			num1=rand.nextInt(tagsGhast[9]);
			if (num1!=tagsGhast[10]){
				if(rand.nextInt(10)<tagsGhast[11]) num1=tagsGhast[10];
			}
			itemstack.stackTagCompound.setInteger("day", num1);
			
			num1=rand.nextInt(tagsGhast[12]);
			if (num1!=tagsGhast[13]){
				if(rand.nextInt(10)<tagsGhast[14]) num1=tagsGhast[13];
			}
			itemstack.stackTagCompound.setInteger("death", num1);
			
			num1=rand.nextInt(tagsGhast[15]);
			if (num1!=tagsGhast[16]){
				if(rand.nextInt(10)<tagsGhast[17]) num1=tagsGhast[16];
			}
			itemstack.stackTagCompound.setInteger("diamond", num1);
			
			num1=rand.nextInt(tagsGhast[18]);
			if (num1!=tagsGhast[19]){
				if(rand.nextInt(10)<tagsGhast[20]) num1=tagsGhast[19];
			}
			itemstack.stackTagCompound.setInteger("echo", num1);
			
			num1=rand.nextInt(tagsGhast[21]);
			if (num1!=tagsGhast[22]){
				if(rand.nextInt(10)<tagsGhast[23]) num1=tagsGhast[22];
			}
			itemstack.stackTagCompound.setInteger("end", num1);
			
			num1=rand.nextInt(tagsGhast[24]);
			if (num1!=tagsGhast[25]){
				if(rand.nextInt(10)<tagsGhast[26]) num1=tagsGhast[25];
			}
			itemstack.stackTagCompound.setInteger("fear", num1);
			
			num1=rand.nextInt(tagsGhast[27]);
			if (num1!=tagsGhast[28]){
				if(rand.nextInt(10)<tagsGhast[29]) num1=tagsGhast[28];
			}
			itemstack.stackTagCompound.setInteger("feather", num1);
			
			num1=rand.nextInt(tagsGhast[30]);
			if (num1!=tagsGhast[31]){
				if(rand.nextInt(10)<tagsGhast[32]) num1=tagsGhast[31];
			}
			itemstack.stackTagCompound.setInteger("flame", num1);
			
			num1=rand.nextInt(tagsGhast[33]);
			if (num1!=tagsGhast[34]){
				if(rand.nextInt(10)<tagsGhast[35]) num1=tagsGhast[34];
			}
			itemstack.stackTagCompound.setInteger("gunpowder", num1);
			
			num1=rand.nextInt(tagsGhast[36]);
			if (num1!=tagsGhast[37]){
				if(rand.nextInt(10)<tagsGhast[38]) num1=tagsGhast[37];
			}
			itemstack.stackTagCompound.setInteger("iron", num1);
			
			num1=rand.nextInt(tagsGhast[39]);
			if (num1!=tagsGhast[40]){
				if(rand.nextInt(10)<tagsGhast[41]) num1=tagsGhast[40];
			}
			itemstack.stackTagCompound.setInteger("light", num1);
			
			num1=rand.nextInt(tagsGhast[42]);
			if (num1!=tagsGhast[43]){
				if(rand.nextInt(10)<tagsGhast[44]) num1=tagsGhast[43];
			}
			itemstack.stackTagCompound.setInteger("race", num1);
			
			num1=rand.nextInt(tagsGhast[45]);
			if (num1!=tagsGhast[46]){
				if(rand.nextInt(10)<tagsGhast[47]) num1=tagsGhast[46];
			}
			itemstack.stackTagCompound.setInteger("spring", num1);
			
			num1=rand.nextInt(tagsGhast[48]);
			if (num1!=tagsGhast[49]){
				if(rand.nextInt(10)<tagsGhast[50]) num1=tagsGhast[49];
			}
			itemstack.stackTagCompound.setInteger("sugar", num1);
			
			num1=rand.nextInt(tagsGhast[51]);
			if (num1!=tagsGhast[52]){
				if(rand.nextInt(10)<tagsGhast[53]) num1=tagsGhast[52];
			}
			itemstack.stackTagCompound.setInteger("sustenance", num1);
			
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}	
		else if(itemstack.getItem().itemID==Items.bloodBagHorse.itemID){
			int num1;
			
			num1=rand.nextInt(tagsHorse[0]);
			if (num1!=tagsHorse[1]){
				if(rand.nextInt(10)<tagsHorse[2]) num1=tagsHorse[1];
			}
			itemstack.stackTagCompound.setInteger("aqua", num1);
			
			num1=rand.nextInt(tagsHorse[3]);
			if (num1!=tagsHorse[4]){
				if(rand.nextInt(10)<tagsHorse[5]) num1=tagsHorse[4];
			}
			itemstack.stackTagCompound.setInteger("archier", num1);
			
			num1=rand.nextInt(tagsHorse[6]);
			if (num1!=tagsHorse[7]){
				if(rand.nextInt(10)<tagsHorse[8]) num1=tagsHorse[7];
			}
			itemstack.stackTagCompound.setInteger("darkness", num1);
			
			num1=rand.nextInt(tagsHorse[9]);
			if (num1!=tagsHorse[10]){
				if(rand.nextInt(10)<tagsHorse[11]) num1=tagsHorse[10];
			}
			itemstack.stackTagCompound.setInteger("day", num1);
			
			num1=rand.nextInt(tagsHorse[12]);
			if (num1!=tagsHorse[13]){
				if(rand.nextInt(10)<tagsHorse[14]) num1=tagsHorse[13];
			}
			itemstack.stackTagCompound.setInteger("death", num1);
			
			num1=rand.nextInt(tagsHorse[15]);
			if (num1!=tagsHorse[16]){
				if(rand.nextInt(10)<tagsHorse[17]) num1=tagsHorse[16];
			}
			itemstack.stackTagCompound.setInteger("diamond", num1);
			
			num1=rand.nextInt(tagsHorse[18]);
			if (num1!=tagsHorse[19]){
				if(rand.nextInt(10)<tagsHorse[20]) num1=tagsHorse[19];
			}
			itemstack.stackTagCompound.setInteger("echo", num1);
			
			num1=rand.nextInt(tagsHorse[21]);
			if (num1!=tagsHorse[22]){
				if(rand.nextInt(10)<tagsHorse[23]) num1=tagsHorse[22];
			}
			itemstack.stackTagCompound.setInteger("end", num1);
			
			num1=rand.nextInt(tagsHorse[24]);
			if (num1!=tagsHorse[25]){
				if(rand.nextInt(10)<tagsHorse[26]) num1=tagsHorse[25];
			}
			itemstack.stackTagCompound.setInteger("fear", num1);
			
			num1=rand.nextInt(tagsHorse[27]);
			if (num1!=tagsHorse[28]){
				if(rand.nextInt(10)<tagsHorse[29]) num1=tagsHorse[28];
			}
			itemstack.stackTagCompound.setInteger("feather", num1);
			
			num1=rand.nextInt(tagsHorse[30]);
			if (num1!=tagsHorse[31]){
				if(rand.nextInt(10)<tagsHorse[32]) num1=tagsHorse[31];
			}
			itemstack.stackTagCompound.setInteger("flame", num1);
			
			num1=rand.nextInt(tagsHorse[33]);
			if (num1!=tagsHorse[34]){
				if(rand.nextInt(10)<tagsHorse[35]) num1=tagsHorse[34];
			}
			itemstack.stackTagCompound.setInteger("gunpowder", num1);
			
			num1=rand.nextInt(tagsHorse[36]);
			if (num1!=tagsHorse[37]){
				if(rand.nextInt(10)<tagsHorse[38]) num1=tagsHorse[37];
			}
			itemstack.stackTagCompound.setInteger("iron", num1);
			
			num1=rand.nextInt(tagsHorse[39]);
			if (num1!=tagsHorse[40]){
				if(rand.nextInt(10)<tagsHorse[41]) num1=tagsHorse[40];
			}
			itemstack.stackTagCompound.setInteger("light", num1);
			
			num1=rand.nextInt(tagsHorse[42]);
			if (num1!=tagsHorse[43]){
				if(rand.nextInt(10)<tagsHorse[44]) num1=tagsHorse[43];
			}
			itemstack.stackTagCompound.setInteger("race", num1);
			
			num1=rand.nextInt(tagsHorse[45]);
			if (num1!=tagsHorse[46]){
				if(rand.nextInt(10)<tagsHorse[47]) num1=tagsHorse[46];
			}
			itemstack.stackTagCompound.setInteger("spring", num1);
			
			num1=rand.nextInt(tagsHorse[48]);
			if (num1!=tagsHorse[49]){
				if(rand.nextInt(10)<tagsHorse[50]) num1=tagsHorse[49];
			}
			itemstack.stackTagCompound.setInteger("sugar", num1);
			
			num1=rand.nextInt(tagsHorse[51]);
			if (num1!=tagsHorse[52]){
				if(rand.nextInt(10)<tagsHorse[53]) num1=tagsHorse[52];
			}
			itemstack.stackTagCompound.setInteger("sustenance", num1);
			
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}	
		else if(itemstack.getItem().itemID==Items.bloodBagIronGolem.itemID){
			int num1;
			
			num1=rand.nextInt(tagsIronGolem[0]);
			if (num1!=tagsIronGolem[1]){
				if(rand.nextInt(10)<tagsIronGolem[2]) num1=tagsIronGolem[1];
			}
			itemstack.stackTagCompound.setInteger("aqua", num1);
			
			num1=rand.nextInt(tagsIronGolem[3]);
			if (num1!=tagsIronGolem[4]){
				if(rand.nextInt(10)<tagsIronGolem[5]) num1=tagsIronGolem[4];
			}
			itemstack.stackTagCompound.setInteger("archier", num1);
			
			num1=rand.nextInt(tagsIronGolem[6]);
			if (num1!=tagsIronGolem[7]){
				if(rand.nextInt(10)<tagsIronGolem[8]) num1=tagsIronGolem[7];
			}
			itemstack.stackTagCompound.setInteger("darkness", num1);
			
			num1=rand.nextInt(tagsIronGolem[9]);
			if (num1!=tagsIronGolem[10]){
				if(rand.nextInt(10)<tagsIronGolem[11]) num1=tagsIronGolem[10];
			}
			itemstack.stackTagCompound.setInteger("day", num1);
			
			num1=rand.nextInt(tagsIronGolem[12]);
			if (num1!=tagsIronGolem[13]){
				if(rand.nextInt(10)<tagsIronGolem[14]) num1=tagsIronGolem[13];
			}
			itemstack.stackTagCompound.setInteger("death", num1);
			
			num1=rand.nextInt(tagsIronGolem[15]);
			if (num1!=tagsIronGolem[16]){
				if(rand.nextInt(10)<tagsIronGolem[17]) num1=tagsIronGolem[16];
			}
			itemstack.stackTagCompound.setInteger("diamond", num1);
			
			num1=rand.nextInt(tagsIronGolem[18]);
			if (num1!=tagsIronGolem[19]){
				if(rand.nextInt(10)<tagsIronGolem[20]) num1=tagsIronGolem[19];
			}
			itemstack.stackTagCompound.setInteger("echo", num1);
			
			num1=rand.nextInt(tagsIronGolem[21]);
			if (num1!=tagsIronGolem[22]){
				if(rand.nextInt(10)<tagsIronGolem[23]) num1=tagsIronGolem[22];
			}
			itemstack.stackTagCompound.setInteger("end", num1);
			
			num1=rand.nextInt(tagsIronGolem[24]);
			if (num1!=tagsIronGolem[25]){
				if(rand.nextInt(10)<tagsIronGolem[26]) num1=tagsIronGolem[25];
			}
			itemstack.stackTagCompound.setInteger("fear", num1);
			
			num1=rand.nextInt(tagsIronGolem[27]);
			if (num1!=tagsIronGolem[28]){
				if(rand.nextInt(10)<tagsIronGolem[29]) num1=tagsIronGolem[28];
			}
			itemstack.stackTagCompound.setInteger("feather", num1);
			
			num1=rand.nextInt(tagsIronGolem[30]);
			if (num1!=tagsIronGolem[31]){
				if(rand.nextInt(10)<tagsIronGolem[32]) num1=tagsIronGolem[31];
			}
			itemstack.stackTagCompound.setInteger("flame", num1);
			
			num1=rand.nextInt(tagsIronGolem[33]);
			if (num1!=tagsIronGolem[34]){
				if(rand.nextInt(10)<tagsIronGolem[35]) num1=tagsIronGolem[34];
			}
			itemstack.stackTagCompound.setInteger("gunpowder", num1);
			
			num1=rand.nextInt(tagsIronGolem[36]);
			if (num1!=tagsIronGolem[37]){
				if(rand.nextInt(10)<tagsIronGolem[38]) num1=tagsIronGolem[37];
			}
			itemstack.stackTagCompound.setInteger("iron", num1);
			
			num1=rand.nextInt(tagsIronGolem[39]);
			if (num1!=tagsIronGolem[40]){
				if(rand.nextInt(10)<tagsIronGolem[41]) num1=tagsIronGolem[40];
			}
			itemstack.stackTagCompound.setInteger("light", num1);
			
			num1=rand.nextInt(tagsIronGolem[42]);
			if (num1!=tagsIronGolem[43]){
				if(rand.nextInt(10)<tagsIronGolem[44]) num1=tagsIronGolem[43];
			}
			itemstack.stackTagCompound.setInteger("race", num1);
			
			num1=rand.nextInt(tagsIronGolem[45]);
			if (num1!=tagsIronGolem[46]){
				if(rand.nextInt(10)<tagsIronGolem[47]) num1=tagsIronGolem[46];
			}
			itemstack.stackTagCompound.setInteger("spring", num1);
			
			num1=rand.nextInt(tagsIronGolem[48]);
			if (num1!=tagsIronGolem[49]){
				if(rand.nextInt(10)<tagsIronGolem[50]) num1=tagsIronGolem[49];
			}
			itemstack.stackTagCompound.setInteger("sugar", num1);
			
			num1=rand.nextInt(tagsIronGolem[51]);
			if (num1!=tagsIronGolem[52]){
				if(rand.nextInt(10)<tagsIronGolem[53]) num1=tagsIronGolem[52];
			}
			itemstack.stackTagCompound.setInteger("sustenance", num1);
			
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}	
		else if(itemstack.getItem().itemID==Items.bloodBagMagmaCube.itemID){
			int num1;
			
			num1=rand.nextInt(tagsMagmaCube[0]);
			if (num1!=tagsMagmaCube[1]){
				if(rand.nextInt(10)<tagsMagmaCube[2]) num1=tagsMagmaCube[1];
			}
			itemstack.stackTagCompound.setInteger("aqua", num1);
			
			num1=rand.nextInt(tagsMagmaCube[3]);
			if (num1!=tagsMagmaCube[4]){
				if(rand.nextInt(10)<tagsMagmaCube[5]) num1=tagsMagmaCube[4];
			}
			itemstack.stackTagCompound.setInteger("archier", num1);
			
			num1=rand.nextInt(tagsMagmaCube[6]);
			if (num1!=tagsMagmaCube[7]){
				if(rand.nextInt(10)<tagsMagmaCube[8]) num1=tagsMagmaCube[7];
			}
			itemstack.stackTagCompound.setInteger("darkness", num1);
			
			num1=rand.nextInt(tagsMagmaCube[9]);
			if (num1!=tagsMagmaCube[10]){
				if(rand.nextInt(10)<tagsMagmaCube[11]) num1=tagsMagmaCube[10];
			}
			itemstack.stackTagCompound.setInteger("day", num1);
			
			num1=rand.nextInt(tagsMagmaCube[12]);
			if (num1!=tagsMagmaCube[13]){
				if(rand.nextInt(10)<tagsMagmaCube[14]) num1=tagsMagmaCube[13];
			}
			itemstack.stackTagCompound.setInteger("death", num1);
			
			num1=rand.nextInt(tagsMagmaCube[15]);
			if (num1!=tagsMagmaCube[16]){
				if(rand.nextInt(10)<tagsMagmaCube[17]) num1=tagsMagmaCube[16];
			}
			itemstack.stackTagCompound.setInteger("diamond", num1);
			
			num1=rand.nextInt(tagsMagmaCube[18]);
			if (num1!=tagsMagmaCube[19]){
				if(rand.nextInt(10)<tagsMagmaCube[20]) num1=tagsMagmaCube[19];
			}
			itemstack.stackTagCompound.setInteger("echo", num1);
			
			num1=rand.nextInt(tagsMagmaCube[21]);
			if (num1!=tagsMagmaCube[22]){
				if(rand.nextInt(10)<tagsMagmaCube[23]) num1=tagsMagmaCube[22];
			}
			itemstack.stackTagCompound.setInteger("end", num1);
			
			num1=rand.nextInt(tagsMagmaCube[24]);
			if (num1!=tagsMagmaCube[25]){
				if(rand.nextInt(10)<tagsMagmaCube[26]) num1=tagsMagmaCube[25];
			}
			itemstack.stackTagCompound.setInteger("fear", num1);
			
			num1=rand.nextInt(tagsMagmaCube[27]);
			if (num1!=tagsMagmaCube[28]){
				if(rand.nextInt(10)<tagsMagmaCube[29]) num1=tagsMagmaCube[28];
			}
			itemstack.stackTagCompound.setInteger("feather", num1);
			
			num1=rand.nextInt(tagsMagmaCube[30]);
			if (num1!=tagsMagmaCube[31]){
				if(rand.nextInt(10)<tagsMagmaCube[32]) num1=tagsMagmaCube[31];
			}
			itemstack.stackTagCompound.setInteger("flame", num1);
			
			num1=rand.nextInt(tagsMagmaCube[33]);
			if (num1!=tagsMagmaCube[34]){
				if(rand.nextInt(10)<tagsMagmaCube[35]) num1=tagsMagmaCube[34];
			}
			itemstack.stackTagCompound.setInteger("gunpowder", num1);
			
			num1=rand.nextInt(tagsMagmaCube[36]);
			if (num1!=tagsMagmaCube[37]){
				if(rand.nextInt(10)<tagsMagmaCube[38]) num1=tagsMagmaCube[37];
			}
			itemstack.stackTagCompound.setInteger("iron", num1);
			
			num1=rand.nextInt(tagsMagmaCube[39]);
			if (num1!=tagsMagmaCube[40]){
				if(rand.nextInt(10)<tagsMagmaCube[41]) num1=tagsMagmaCube[40];
			}
			itemstack.stackTagCompound.setInteger("light", num1);
			
			num1=rand.nextInt(tagsMagmaCube[42]);
			if (num1!=tagsMagmaCube[43]){
				if(rand.nextInt(10)<tagsMagmaCube[44]) num1=tagsMagmaCube[43];
			}
			itemstack.stackTagCompound.setInteger("race", num1);
			
			num1=rand.nextInt(tagsMagmaCube[45]);
			if (num1!=tagsMagmaCube[46]){
				if(rand.nextInt(10)<tagsMagmaCube[47]) num1=tagsMagmaCube[46];
			}
			itemstack.stackTagCompound.setInteger("spring", num1);
			
			num1=rand.nextInt(tagsMagmaCube[48]);
			if (num1!=tagsMagmaCube[49]){
				if(rand.nextInt(10)<tagsMagmaCube[50]) num1=tagsMagmaCube[49];
			}
			itemstack.stackTagCompound.setInteger("sugar", num1);
			
			num1=rand.nextInt(tagsMagmaCube[51]);
			if (num1!=tagsMagmaCube[52]){
				if(rand.nextInt(10)<tagsMagmaCube[53]) num1=tagsMagmaCube[52];
			}
			itemstack.stackTagCompound.setInteger("sustenance", num1);
			
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}	
		else if(itemstack.getItem().itemID==Items.bloodBagMooshroom.itemID){
			int num1;
			
			num1=rand.nextInt(tagsMooshroom[0]);
			if (num1!=tagsMagmaCube[1]){
				if(rand.nextInt(10)<tagsMooshroom[2]) num1=tagsMooshroom[1];
			}
			itemstack.stackTagCompound.setInteger("aqua", num1);
			
			num1=rand.nextInt(tagsMooshroom[3]);
			if (num1!=tagsMooshroom[4]){
				if(rand.nextInt(10)<tagsMooshroom[5]) num1=tagsMooshroom[4];
			}
			itemstack.stackTagCompound.setInteger("archier", num1);
			
			num1=rand.nextInt(tagsMooshroom[6]);
			if (num1!=tagsMooshroom[7]){
				if(rand.nextInt(10)<tagsMooshroom[8]) num1=tagsMooshroom[7];
			}
			itemstack.stackTagCompound.setInteger("darkness", num1);
			
			num1=rand.nextInt(tagsMooshroom[9]);
			if (num1!=tagsMooshroom[10]){
				if(rand.nextInt(10)<tagsMooshroom[11]) num1=tagsMooshroom[10];
			}
			itemstack.stackTagCompound.setInteger("day", num1);
			
			num1=rand.nextInt(tagsMooshroom[12]);
			if (num1!=tagsMooshroom[13]){
				if(rand.nextInt(10)<tagsMooshroom[14]) num1=tagsMooshroom[13];
			}
			itemstack.stackTagCompound.setInteger("death", num1);
			
			num1=rand.nextInt(tagsMooshroom[15]);
			if (num1!=tagsMooshroom[16]){
				if(rand.nextInt(10)<tagsMooshroom[17]) num1=tagsMooshroom[16];
			}
			itemstack.stackTagCompound.setInteger("diamond", num1);
			
			num1=rand.nextInt(tagsMooshroom[18]);
			if (num1!=tagsMooshroom[19]){
				if(rand.nextInt(10)<tagsMooshroom[20]) num1=tagsMooshroom[19];
			}
			itemstack.stackTagCompound.setInteger("echo", num1);
			
			num1=rand.nextInt(tagsMooshroom[21]);
			if (num1!=tagsMooshroom[22]){
				if(rand.nextInt(10)<tagsMooshroom[23]) num1=tagsMooshroom[22];
			}
			itemstack.stackTagCompound.setInteger("end", num1);
			
			num1=rand.nextInt(tagsMooshroom[24]);
			if (num1!=tagsMooshroom[25]){
				if(rand.nextInt(10)<tagsMooshroom[26]) num1=tagsMooshroom[25];
			}
			itemstack.stackTagCompound.setInteger("fear", num1);
			
			num1=rand.nextInt(tagsMooshroom[27]);
			if (num1!=tagsMooshroom[28]){
				if(rand.nextInt(10)<tagsMooshroom[29]) num1=tagsMooshroom[28];
			}
			itemstack.stackTagCompound.setInteger("feather", num1);
			
			num1=rand.nextInt(tagsMooshroom[30]);
			if (num1!=tagsMooshroom[31]){
				if(rand.nextInt(10)<tagsMooshroom[32]) num1=tagsMooshroom[31];
			}
			itemstack.stackTagCompound.setInteger("flame", num1);
			
			num1=rand.nextInt(tagsMooshroom[33]);
			if (num1!=tagsMooshroom[34]){
				if(rand.nextInt(10)<tagsMooshroom[35]) num1=tagsMooshroom[34];
			}
			itemstack.stackTagCompound.setInteger("gunpowder", num1);
			
			num1=rand.nextInt(tagsMooshroom[36]);
			if (num1!=tagsMooshroom[37]){
				if(rand.nextInt(10)<tagsMooshroom[38]) num1=tagsMooshroom[37];
			}
			itemstack.stackTagCompound.setInteger("iron", num1);
			
			num1=rand.nextInt(tagsMooshroom[39]);
			if (num1!=tagsMooshroom[40]){
				if(rand.nextInt(10)<tagsMooshroom[41]) num1=tagsMooshroom[40];
			}
			itemstack.stackTagCompound.setInteger("light", num1);
			
			num1=rand.nextInt(tagsMooshroom[42]);
			if (num1!=tagsMooshroom[43]){
				if(rand.nextInt(10)<tagsMooshroom[44]) num1=tagsMooshroom[43];
			}
			itemstack.stackTagCompound.setInteger("race", num1);
			
			num1=rand.nextInt(tagsMooshroom[45]);
			if (num1!=tagsMooshroom[46]){
				if(rand.nextInt(10)<tagsMooshroom[47]) num1=tagsMooshroom[46];
			}
			itemstack.stackTagCompound.setInteger("spring", num1);
			
			num1=rand.nextInt(tagsMooshroom[48]);
			if (num1!=tagsMooshroom[49]){
				if(rand.nextInt(10)<tagsMooshroom[50]) num1=tagsMooshroom[49];
			}
			itemstack.stackTagCompound.setInteger("sugar", num1);
			
			num1=rand.nextInt(tagsMooshroom[51]);
			if (num1!=tagsMooshroom[52]){
				if(rand.nextInt(10)<tagsMooshroom[53]) num1=tagsMooshroom[52];
			}
			itemstack.stackTagCompound.setInteger("sustenance", num1);
			
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}	
		else if(itemstack.getItem().itemID==Items.bloodBagOcelot.itemID){
			int num1;
			
			num1=rand.nextInt(tagsOcelot[0]);
			if (num1!=tagsOcelot[1]){
				if(rand.nextInt(10)<tagsOcelot[2]) num1=tagsOcelot[1];
			}
			itemstack.stackTagCompound.setInteger("aqua", num1);
			
			num1=rand.nextInt(tagsOcelot[3]);
			if (num1!=tagsOcelot[4]){
				if(rand.nextInt(10)<tagsOcelot[5]) num1=tagsOcelot[4];
			}
			itemstack.stackTagCompound.setInteger("archier", num1);
			
			num1=rand.nextInt(tagsOcelot[6]);
			if (num1!=tagsOcelot[7]){
				if(rand.nextInt(10)<tagsOcelot[8]) num1=tagsOcelot[7];
			}
			itemstack.stackTagCompound.setInteger("darkness", num1);
			
			num1=rand.nextInt(tagsOcelot[9]);
			if (num1!=tagsOcelot[10]){
				if(rand.nextInt(10)<tagsOcelot[11]) num1=tagsOcelot[10];
			}
			itemstack.stackTagCompound.setInteger("day", num1);
			
			num1=rand.nextInt(tagsOcelot[12]);
			if (num1!=tagsOcelot[13]){
				if(rand.nextInt(10)<tagsOcelot[14]) num1=tagsOcelot[13];
			}
			itemstack.stackTagCompound.setInteger("death", num1);
			
			num1=rand.nextInt(tagsOcelot[15]);
			if (num1!=tagsOcelot[16]){
				if(rand.nextInt(10)<tagsOcelot[17]) num1=tagsOcelot[16];
			}
			itemstack.stackTagCompound.setInteger("diamond", num1);
			
			num1=rand.nextInt(tagsOcelot[18]);
			if (num1!=tagsOcelot[19]){
				if(rand.nextInt(10)<tagsOcelot[20]) num1=tagsOcelot[19];
			}
			itemstack.stackTagCompound.setInteger("echo", num1);
			
			num1=rand.nextInt(tagsOcelot[21]);
			if (num1!=tagsOcelot[22]){
				if(rand.nextInt(10)<tagsOcelot[23]) num1=tagsOcelot[22];
			}
			itemstack.stackTagCompound.setInteger("end", num1);
			
			num1=rand.nextInt(tagsOcelot[24]);
			if (num1!=tagsOcelot[25]){
				if(rand.nextInt(10)<tagsOcelot[26]) num1=tagsOcelot[25];
			}
			itemstack.stackTagCompound.setInteger("fear", num1);
			
			num1=rand.nextInt(tagsOcelot[27]);
			if (num1!=tagsOcelot[28]){
				if(rand.nextInt(10)<tagsOcelot[29]) num1=tagsOcelot[28];
			}
			itemstack.stackTagCompound.setInteger("feather", num1);
			
			num1=rand.nextInt(tagsOcelot[30]);
			if (num1!=tagsOcelot[31]){
				if(rand.nextInt(10)<tagsOcelot[32]) num1=tagsOcelot[31];
			}
			itemstack.stackTagCompound.setInteger("flame", num1);
			
			num1=rand.nextInt(tagsOcelot[33]);
			if (num1!=tagsOcelot[34]){
				if(rand.nextInt(10)<tagsOcelot[35]) num1=tagsOcelot[34];
			}
			itemstack.stackTagCompound.setInteger("gunpowder", num1);
			
			num1=rand.nextInt(tagsOcelot[36]);
			if (num1!=tagsOcelot[37]){
				if(rand.nextInt(10)<tagsOcelot[38]) num1=tagsOcelot[37];
			}
			itemstack.stackTagCompound.setInteger("iron", num1);
			
			num1=rand.nextInt(tagsOcelot[39]);
			if (num1!=tagsOcelot[40]){
				if(rand.nextInt(10)<tagsOcelot[41]) num1=tagsOcelot[40];
			}
			itemstack.stackTagCompound.setInteger("light", num1);
			
			num1=rand.nextInt(tagsOcelot[42]);
			if (num1!=tagsOcelot[43]){
				if(rand.nextInt(10)<tagsOcelot[44]) num1=tagsOcelot[43];
			}
			itemstack.stackTagCompound.setInteger("race", num1);
			
			num1=rand.nextInt(tagsOcelot[45]);
			if (num1!=tagsOcelot[46]){
				if(rand.nextInt(10)<tagsOcelot[47]) num1=tagsOcelot[46];
			}
			itemstack.stackTagCompound.setInteger("spring", num1);
			
			num1=rand.nextInt(tagsOcelot[48]);
			if (num1!=tagsOcelot[49]){
				if(rand.nextInt(10)<tagsOcelot[50]) num1=tagsOcelot[49];
			}
			itemstack.stackTagCompound.setInteger("sugar", num1);
			
			num1=rand.nextInt(tagsOcelot[51]);
			if (num1!=tagsOcelot[52]){
				if(rand.nextInt(10)<tagsOcelot[53]) num1=tagsOcelot[52];
			}
			itemstack.stackTagCompound.setInteger("sustenance", num1);
			
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}	
		else if(itemstack.getItem().itemID==Items.bloodBagPig.itemID){
			int num1;
			
			num1=rand.nextInt(tagsPig[0]);
			if (num1!=tagsPig[1]){
				if(rand.nextInt(10)<tagsPig[2]) num1=tagsPig[1];
			}
			itemstack.stackTagCompound.setInteger("aqua", num1);
			
			num1=rand.nextInt(tagsPig[3]);
			if (num1!=tagsPig[4]){
				if(rand.nextInt(10)<tagsPig[5]) num1=tagsPig[4];
			}
			itemstack.stackTagCompound.setInteger("archier", num1);
			
			num1=rand.nextInt(tagsPig[6]);
			if (num1!=tagsPig[7]){
				if(rand.nextInt(10)<tagsPig[8]) num1=tagsPig[7];
			}
			itemstack.stackTagCompound.setInteger("darkness", num1);
			
			num1=rand.nextInt(tagsPig[9]);
			if (num1!=tagsPig[10]){
				if(rand.nextInt(10)<tagsPig[11]) num1=tagsPig[10];
			}
			itemstack.stackTagCompound.setInteger("day", num1);
			
			num1=rand.nextInt(tagsPig[12]);
			if (num1!=tagsPig[13]){
				if(rand.nextInt(10)<tagsPig[14]) num1=tagsPig[13];
			}
			itemstack.stackTagCompound.setInteger("death", num1);
			
			num1=rand.nextInt(tagsPig[15]);
			if (num1!=tagsPig[16]){
				if(rand.nextInt(10)<tagsPig[17]) num1=tagsPig[16];
			}
			itemstack.stackTagCompound.setInteger("diamond", num1);
			
			num1=rand.nextInt(tagsPig[18]);
			if (num1!=tagsPig[19]){
				if(rand.nextInt(10)<tagsPig[20]) num1=tagsPig[19];
			}
			itemstack.stackTagCompound.setInteger("echo", num1);
			
			num1=rand.nextInt(tagsPig[21]);
			if (num1!=tagsPig[22]){
				if(rand.nextInt(10)<tagsPig[23]) num1=tagsPig[22];
			}
			itemstack.stackTagCompound.setInteger("end", num1);
			
			num1=rand.nextInt(tagsPig[24]);
			if (num1!=tagsPig[25]){
				if(rand.nextInt(10)<tagsPig[26]) num1=tagsPig[25];
			}
			itemstack.stackTagCompound.setInteger("fear", num1);
			
			num1=rand.nextInt(tagsPig[27]);
			if (num1!=tagsPig[28]){
				if(rand.nextInt(10)<tagsPig[29]) num1=tagsPig[28];
			}
			itemstack.stackTagCompound.setInteger("feather", num1);
			
			num1=rand.nextInt(tagsPig[30]);
			if (num1!=tagsPig[31]){
				if(rand.nextInt(10)<tagsPig[32]) num1=tagsPig[31];
			}
			itemstack.stackTagCompound.setInteger("flame", num1);
			
			num1=rand.nextInt(tagsPig[33]);
			if (num1!=tagsPig[34]){
				if(rand.nextInt(10)<tagsPig[35]) num1=tagsPig[34];
			}
			itemstack.stackTagCompound.setInteger("gunpowder", num1);
			
			num1=rand.nextInt(tagsPig[36]);
			if (num1!=tagsPig[37]){
				if(rand.nextInt(10)<tagsPig[38]) num1=tagsPig[37];
			}
			itemstack.stackTagCompound.setInteger("iron", num1);
			
			num1=rand.nextInt(tagsPig[39]);
			if (num1!=tagsPig[40]){
				if(rand.nextInt(10)<tagsPig[41]) num1=tagsPig[40];
			}
			itemstack.stackTagCompound.setInteger("light", num1);
			
			num1=rand.nextInt(tagsPig[42]);
			if (num1!=tagsPig[43]){
				if(rand.nextInt(10)<tagsPig[44]) num1=tagsPig[43];
			}
			itemstack.stackTagCompound.setInteger("race", num1);
			
			num1=rand.nextInt(tagsPig[45]);
			if (num1!=tagsPig[46]){
				if(rand.nextInt(10)<tagsPig[47]) num1=tagsPig[46];
			}
			itemstack.stackTagCompound.setInteger("spring", num1);
			
			num1=rand.nextInt(tagsPig[48]);
			if (num1!=tagsPig[49]){
				if(rand.nextInt(10)<tagsPig[50]) num1=tagsPig[49];
			}
			itemstack.stackTagCompound.setInteger("sugar", num1);
			
			num1=rand.nextInt(tagsPig[51]);
			if (num1!=tagsPig[52]){
				if(rand.nextInt(10)<tagsPig[53]) num1=tagsPig[52];
			}
			itemstack.stackTagCompound.setInteger("sustenance", num1);
			
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}	
		else if(itemstack.getItem().itemID==Items.bloodBagSheep.itemID){
			int num1;
			
			num1=rand.nextInt(tagsSheep[0]);
			if (num1!=tagsSheep[1]){
				if(rand.nextInt(10)<tagsSheep[2]) num1=tagsSheep[1];
			}
			itemstack.stackTagCompound.setInteger("aqua", num1);
			
			num1=rand.nextInt(tagsSheep[3]);
			if (num1!=tagsSheep[4]){
				if(rand.nextInt(10)<tagsSheep[5]) num1=tagsSheep[4];
			}
			itemstack.stackTagCompound.setInteger("archier", num1);
			
			num1=rand.nextInt(tagsSheep[6]);
			if (num1!=tagsSheep[7]){
				if(rand.nextInt(10)<tagsSheep[8]) num1=tagsSheep[7];
			}
			itemstack.stackTagCompound.setInteger("darkness", num1);
			
			num1=rand.nextInt(tagsSheep[9]);
			if (num1!=tagsSheep[10]){
				if(rand.nextInt(10)<tagsSheep[11]) num1=tagsSheep[10];
			}
			itemstack.stackTagCompound.setInteger("day", num1);
			
			num1=rand.nextInt(tagsSheep[12]);
			if (num1!=tagsSheep[13]){
				if(rand.nextInt(10)<tagsSheep[14]) num1=tagsSheep[13];
			}
			itemstack.stackTagCompound.setInteger("death", num1);
			
			num1=rand.nextInt(tagsSheep[15]);
			if (num1!=tagsSheep[16]){
				if(rand.nextInt(10)<tagsSheep[17]) num1=tagsSheep[16];
			}
			itemstack.stackTagCompound.setInteger("diamond", num1);
			
			num1=rand.nextInt(tagsSheep[18]);
			if (num1!=tagsSheep[19]){
				if(rand.nextInt(10)<tagsSheep[20]) num1=tagsSheep[19];
			}
			itemstack.stackTagCompound.setInteger("echo", num1);
			
			num1=rand.nextInt(tagsSheep[21]);
			if (num1!=tagsSheep[22]){
				if(rand.nextInt(10)<tagsSheep[23]) num1=tagsSheep[22];
			}
			itemstack.stackTagCompound.setInteger("end", num1);
			
			num1=rand.nextInt(tagsSheep[24]);
			if (num1!=tagsSheep[25]){
				if(rand.nextInt(10)<tagsSheep[26]) num1=tagsSheep[25];
			}
			itemstack.stackTagCompound.setInteger("fear", num1);
			
			num1=rand.nextInt(tagsSheep[27]);
			if (num1!=tagsSheep[28]){
				if(rand.nextInt(10)<tagsSheep[29]) num1=tagsSheep[28];
			}
			itemstack.stackTagCompound.setInteger("feather", num1);
			
			num1=rand.nextInt(tagsSheep[30]);
			if (num1!=tagsSheep[31]){
				if(rand.nextInt(10)<tagsSheep[32]) num1=tagsSheep[31];
			}
			itemstack.stackTagCompound.setInteger("flame", num1);
			
			num1=rand.nextInt(tagsSheep[33]);
			if (num1!=tagsSheep[34]){
				if(rand.nextInt(10)<tagsSheep[35]) num1=tagsSheep[34];
			}
			itemstack.stackTagCompound.setInteger("gunpowder", num1);
			
			num1=rand.nextInt(tagsSheep[36]);
			if (num1!=tagsSheep[37]){
				if(rand.nextInt(10)<tagsSheep[38]) num1=tagsSheep[37];
			}
			itemstack.stackTagCompound.setInteger("iron", num1);
			
			num1=rand.nextInt(tagsSheep[39]);
			if (num1!=tagsSheep[40]){
				if(rand.nextInt(10)<tagsSheep[41]) num1=tagsSheep[40];
			}
			itemstack.stackTagCompound.setInteger("light", num1);
			
			num1=rand.nextInt(tagsSheep[42]);
			if (num1!=tagsSheep[43]){
				if(rand.nextInt(10)<tagsSheep[44]) num1=tagsSheep[43];
			}
			itemstack.stackTagCompound.setInteger("race", num1);
			
			num1=rand.nextInt(tagsSheep[45]);
			if (num1!=tagsSheep[46]){
				if(rand.nextInt(10)<tagsSheep[47]) num1=tagsSheep[46];
			}
			itemstack.stackTagCompound.setInteger("spring", num1);
			
			num1=rand.nextInt(tagsSheep[48]);
			if (num1!=tagsSheep[49]){
				if(rand.nextInt(10)<tagsSheep[50]) num1=tagsSheep[49];
			}
			itemstack.stackTagCompound.setInteger("sugar", num1);
			
			num1=rand.nextInt(tagsSheep[51]);
			if (num1!=tagsSheep[52]){
				if(rand.nextInt(10)<tagsSheep[53]) num1=tagsSheep[52];
			}
			itemstack.stackTagCompound.setInteger("sustenance", num1);
			
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}	
		else if(itemstack.getItem().itemID==Items.bloodBagSilverfish.itemID){
			int num1;
			
			num1=rand.nextInt(tagsSilverfish[0]);
			if (num1!=tagsSilverfish[1]){
				if(rand.nextInt(10)<tagsSilverfish[2]) num1=tagsSilverfish[1];
			}
			itemstack.stackTagCompound.setInteger("aqua", num1);
			
			num1=rand.nextInt(tagsSilverfish[3]);
			if (num1!=tagsSilverfish[4]){
				if(rand.nextInt(10)<tagsSilverfish[5]) num1=tagsSilverfish[4];
			}
			itemstack.stackTagCompound.setInteger("archier", num1);
			
			num1=rand.nextInt(tagsSilverfish[6]);
			if (num1!=tagsSilverfish[7]){
				if(rand.nextInt(10)<tagsSilverfish[8]) num1=tagsSilverfish[7];
			}
			itemstack.stackTagCompound.setInteger("darkness", num1);
			
			num1=rand.nextInt(tagsSilverfish[9]);
			if (num1!=tagsSilverfish[10]){
				if(rand.nextInt(10)<tagsSilverfish[11]) num1=tagsSilverfish[10];
			}
			itemstack.stackTagCompound.setInteger("day", num1);
			
			num1=rand.nextInt(tagsSilverfish[12]);
			if (num1!=tagsSilverfish[13]){
				if(rand.nextInt(10)<tagsSilverfish[14]) num1=tagsSilverfish[13];
			}
			itemstack.stackTagCompound.setInteger("death", num1);
			
			num1=rand.nextInt(tagsSilverfish[15]);
			if (num1!=tagsSilverfish[16]){
				if(rand.nextInt(10)<tagsSilverfish[17]) num1=tagsSilverfish[16];
			}
			itemstack.stackTagCompound.setInteger("diamond", num1);
			
			num1=rand.nextInt(tagsSilverfish[18]);
			if (num1!=tagsSilverfish[19]){
				if(rand.nextInt(10)<tagsSilverfish[20]) num1=tagsSilverfish[19];
			}
			itemstack.stackTagCompound.setInteger("echo", num1);
			
			num1=rand.nextInt(tagsSilverfish[21]);
			if (num1!=tagsSilverfish[22]){
				if(rand.nextInt(10)<tagsSilverfish[23]) num1=tagsSilverfish[22];
			}
			itemstack.stackTagCompound.setInteger("end", num1);
			
			num1=rand.nextInt(tagsSilverfish[24]);
			if (num1!=tagsSilverfish[25]){
				if(rand.nextInt(10)<tagsSilverfish[26]) num1=tagsSilverfish[25];
			}
			itemstack.stackTagCompound.setInteger("fear", num1);
			
			num1=rand.nextInt(tagsSilverfish[27]);
			if (num1!=tagsSilverfish[28]){
				if(rand.nextInt(10)<tagsSilverfish[29]) num1=tagsSilverfish[28];
			}
			itemstack.stackTagCompound.setInteger("feather", num1);
			
			num1=rand.nextInt(tagsSilverfish[30]);
			if (num1!=tagsSilverfish[31]){
				if(rand.nextInt(10)<tagsSilverfish[32]) num1=tagsSilverfish[31];
			}
			itemstack.stackTagCompound.setInteger("flame", num1);
			
			num1=rand.nextInt(tagsSilverfish[33]);
			if (num1!=tagsSilverfish[34]){
				if(rand.nextInt(10)<tagsSilverfish[35]) num1=tagsSilverfish[34];
			}
			itemstack.stackTagCompound.setInteger("gunpowder", num1);
			
			num1=rand.nextInt(tagsSilverfish[36]);
			if (num1!=tagsSilverfish[37]){
				if(rand.nextInt(10)<tagsSilverfish[38]) num1=tagsSilverfish[37];
			}
			itemstack.stackTagCompound.setInteger("iron", num1);
			
			num1=rand.nextInt(tagsSilverfish[39]);
			if (num1!=tagsSilverfish[40]){
				if(rand.nextInt(10)<tagsSilverfish[41]) num1=tagsSilverfish[40];
			}
			itemstack.stackTagCompound.setInteger("light", num1);
			
			num1=rand.nextInt(tagsSilverfish[42]);
			if (num1!=tagsSilverfish[43]){
				if(rand.nextInt(10)<tagsSilverfish[44]) num1=tagsSilverfish[43];
			}
			itemstack.stackTagCompound.setInteger("race", num1);
			
			num1=rand.nextInt(tagsSilverfish[45]);
			if (num1!=tagsSilverfish[46]){
				if(rand.nextInt(10)<tagsSilverfish[47]) num1=tagsSilverfish[46];
			}
			itemstack.stackTagCompound.setInteger("spring", num1);
			
			num1=rand.nextInt(tagsSilverfish[48]);
			if (num1!=tagsSilverfish[49]){
				if(rand.nextInt(10)<tagsSilverfish[50]) num1=tagsSilverfish[49];
			}
			itemstack.stackTagCompound.setInteger("sugar", num1);
			
			num1=rand.nextInt(tagsSilverfish[51]);
			if (num1!=tagsSilverfish[52]){
				if(rand.nextInt(10)<tagsSilverfish[53]) num1=tagsSilverfish[52];
			}
			itemstack.stackTagCompound.setInteger("sustenance", num1);
			
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}	
		else if(itemstack.getItem().itemID==Items.bloodBagSkeleton.itemID){
			int num1;
			
			num1=rand.nextInt(tagsSkeleton[0]);
			if (num1!=tagsSkeleton[1]){
				if(rand.nextInt(10)<tagsSkeleton[2]) num1=tagsSkeleton[1];
			}
			itemstack.stackTagCompound.setInteger("aqua", num1);
			
			num1=rand.nextInt(tagsSkeleton[3]);
			if (num1!=tagsSkeleton[4]){
				if(rand.nextInt(10)<tagsSkeleton[5]) num1=tagsSkeleton[4];
			}
			itemstack.stackTagCompound.setInteger("archier", num1);
			
			num1=rand.nextInt(tagsSkeleton[6]);
			if (num1!=tagsSkeleton[7]){
				if(rand.nextInt(10)<tagsSkeleton[8]) num1=tagsSkeleton[7];
			}
			itemstack.stackTagCompound.setInteger("darkness", num1);
			
			num1=rand.nextInt(tagsSkeleton[9]);
			if (num1!=tagsSkeleton[10]){
				if(rand.nextInt(10)<tagsSkeleton[11]) num1=tagsSkeleton[10];
			}
			itemstack.stackTagCompound.setInteger("day", num1);
			
			num1=rand.nextInt(tagsSkeleton[12]);
			if (num1!=tagsSkeleton[13]){
				if(rand.nextInt(10)<tagsSkeleton[14]) num1=tagsSkeleton[13];
			}
			itemstack.stackTagCompound.setInteger("death", num1);
			
			num1=rand.nextInt(tagsSkeleton[15]);
			if (num1!=tagsSkeleton[16]){
				if(rand.nextInt(10)<tagsSkeleton[17]) num1=tagsSkeleton[16];
			}
			itemstack.stackTagCompound.setInteger("diamond", num1);
			
			num1=rand.nextInt(tagsSkeleton[18]);
			if (num1!=tagsSkeleton[19]){
				if(rand.nextInt(10)<tagsSkeleton[20]) num1=tagsSkeleton[19];
			}
			itemstack.stackTagCompound.setInteger("echo", num1);
			
			num1=rand.nextInt(tagsSkeleton[21]);
			if (num1!=tagsSkeleton[22]){
				if(rand.nextInt(10)<tagsSkeleton[23]) num1=tagsSkeleton[22];
			}
			itemstack.stackTagCompound.setInteger("end", num1);
			
			num1=rand.nextInt(tagsSkeleton[24]);
			if (num1!=tagsSkeleton[25]){
				if(rand.nextInt(10)<tagsSkeleton[26]) num1=tagsSkeleton[25];
			}
			itemstack.stackTagCompound.setInteger("fear", num1);
			
			num1=rand.nextInt(tagsSkeleton[27]);
			if (num1!=tagsSkeleton[28]){
				if(rand.nextInt(10)<tagsSkeleton[29]) num1=tagsSkeleton[28];
			}
			itemstack.stackTagCompound.setInteger("feather", num1);
			
			num1=rand.nextInt(tagsSkeleton[30]);
			if (num1!=tagsSkeleton[31]){
				if(rand.nextInt(10)<tagsSkeleton[32]) num1=tagsSkeleton[31];
			}
			itemstack.stackTagCompound.setInteger("flame", num1);
			
			num1=rand.nextInt(tagsSkeleton[33]);
			if (num1!=tagsSkeleton[34]){
				if(rand.nextInt(10)<tagsSkeleton[35]) num1=tagsSkeleton[34];
			}
			itemstack.stackTagCompound.setInteger("gunpowder", num1);
			
			num1=rand.nextInt(tagsSkeleton[36]);
			if (num1!=tagsSkeleton[37]){
				if(rand.nextInt(10)<tagsSkeleton[38]) num1=tagsSkeleton[37];
			}
			itemstack.stackTagCompound.setInteger("iron", num1);
			
			num1=rand.nextInt(tagsSkeleton[39]);
			if (num1!=tagsSkeleton[40]){
				if(rand.nextInt(10)<tagsSkeleton[41]) num1=tagsSkeleton[40];
			}
			itemstack.stackTagCompound.setInteger("light", num1);
			
			num1=rand.nextInt(tagsSkeleton[42]);
			if (num1!=tagsSkeleton[43]){
				if(rand.nextInt(10)<tagsSkeleton[44]) num1=tagsSkeleton[43];
			}
			itemstack.stackTagCompound.setInteger("race", num1);
			
			num1=rand.nextInt(tagsSkeleton[45]);
			if (num1!=tagsSkeleton[46]){
				if(rand.nextInt(10)<tagsSkeleton[47]) num1=tagsSkeleton[46];
			}
			itemstack.stackTagCompound.setInteger("spring", num1);
			
			num1=rand.nextInt(tagsSkeleton[48]);
			if (num1!=tagsSkeleton[49]){
				if(rand.nextInt(10)<tagsSkeleton[50]) num1=tagsSkeleton[49];
			}
			itemstack.stackTagCompound.setInteger("sugar", num1);
			
			num1=rand.nextInt(tagsSkeleton[51]);
			if (num1!=tagsSkeleton[52]){
				if(rand.nextInt(10)<tagsSkeleton[53]) num1=tagsSkeleton[52];
			}
			itemstack.stackTagCompound.setInteger("sustenance", num1);
			
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}	
		else if(itemstack.getItem().itemID==Items.bloodBagSlime.itemID){
			int num1;
			
			num1=rand.nextInt(tagsSlime[0]);
			if (num1!=tagsSlime[1]){
				if(rand.nextInt(10)<tagsSlime[2]) num1=tagsSlime[1];
			}
			itemstack.stackTagCompound.setInteger("aqua", num1);
			
			num1=rand.nextInt(tagsSlime[3]);
			if (num1!=tagsSlime[4]){
				if(rand.nextInt(10)<tagsSlime[5]) num1=tagsSlime[4];
			}
			itemstack.stackTagCompound.setInteger("archier", num1);
			
			num1=rand.nextInt(tagsSlime[6]);
			if (num1!=tagsSlime[7]){
				if(rand.nextInt(10)<tagsSlime[8]) num1=tagsSlime[7];
			}
			itemstack.stackTagCompound.setInteger("darkness", num1);
			
			num1=rand.nextInt(tagsSlime[9]);
			if (num1!=tagsSlime[10]){
				if(rand.nextInt(10)<tagsSlime[11]) num1=tagsSlime[10];
			}
			itemstack.stackTagCompound.setInteger("day", num1);
			
			num1=rand.nextInt(tagsSlime[12]);
			if (num1!=tagsSlime[13]){
				if(rand.nextInt(10)<tagsSlime[14]) num1=tagsSlime[13];
			}
			itemstack.stackTagCompound.setInteger("death", num1);
			
			num1=rand.nextInt(tagsSlime[15]);
			if (num1!=tagsSlime[16]){
				if(rand.nextInt(10)<tagsSlime[17]) num1=tagsSlime[16];
			}
			itemstack.stackTagCompound.setInteger("diamond", num1);
			
			num1=rand.nextInt(tagsSlime[18]);
			if (num1!=tagsSlime[19]){
				if(rand.nextInt(10)<tagsSlime[20]) num1=tagsSlime[19];
			}
			itemstack.stackTagCompound.setInteger("echo", num1);
			
			num1=rand.nextInt(tagsSlime[21]);
			if (num1!=tagsSlime[22]){
				if(rand.nextInt(10)<tagsSlime[23]) num1=tagsSlime[22];
			}
			itemstack.stackTagCompound.setInteger("end", num1);
			
			num1=rand.nextInt(tagsSlime[24]);
			if (num1!=tagsSlime[25]){
				if(rand.nextInt(10)<tagsSlime[26]) num1=tagsSlime[25];
			}
			itemstack.stackTagCompound.setInteger("fear", num1);
			
			num1=rand.nextInt(tagsSlime[27]);
			if (num1!=tagsSlime[28]){
				if(rand.nextInt(10)<tagsSlime[29]) num1=tagsSlime[28];
			}
			itemstack.stackTagCompound.setInteger("feather", num1);
			
			num1=rand.nextInt(tagsSlime[30]);
			if (num1!=tagsSlime[31]){
				if(rand.nextInt(10)<tagsSlime[32]) num1=tagsSlime[31];
			}
			itemstack.stackTagCompound.setInteger("flame", num1);
			
			num1=rand.nextInt(tagsSlime[33]);
			if (num1!=tagsSlime[34]){
				if(rand.nextInt(10)<tagsSlime[35]) num1=tagsSlime[34];
			}
			itemstack.stackTagCompound.setInteger("gunpowder", num1);
			
			num1=rand.nextInt(tagsSlime[36]);
			if (num1!=tagsSlime[37]){
				if(rand.nextInt(10)<tagsSlime[38]) num1=tagsSlime[37];
			}
			itemstack.stackTagCompound.setInteger("iron", num1);
			
			num1=rand.nextInt(tagsSlime[39]);
			if (num1!=tagsSlime[40]){
				if(rand.nextInt(10)<tagsSlime[41]) num1=tagsSlime[40];
			}
			itemstack.stackTagCompound.setInteger("light", num1);
			
			num1=rand.nextInt(tagsSlime[42]);
			if (num1!=tagsSlime[43]){
				if(rand.nextInt(10)<tagsSlime[44]) num1=tagsSlime[43];
			}
			itemstack.stackTagCompound.setInteger("race", num1);
			
			num1=rand.nextInt(tagsSlime[45]);
			if (num1!=tagsSlime[46]){
				if(rand.nextInt(10)<tagsSlime[47]) num1=tagsSlime[46];
			}
			itemstack.stackTagCompound.setInteger("spring", num1);
			
			num1=rand.nextInt(tagsSlime[48]);
			if (num1!=tagsSlime[49]){
				if(rand.nextInt(10)<tagsSlime[50]) num1=tagsSlime[49];
			}
			itemstack.stackTagCompound.setInteger("sugar", num1);
			
			num1=rand.nextInt(tagsSlime[51]);
			if (num1!=tagsSlime[52]){
				if(rand.nextInt(10)<tagsSlime[53]) num1=tagsSlime[52];
			}
			itemstack.stackTagCompound.setInteger("sustenance", num1);
			
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}	
		else if(itemstack.getItem().itemID==Items.bloodBagSnowGolem.itemID){
			int num1;
			
			num1=rand.nextInt(tagsSnowGolem[0]);
			if (num1!=tagsSnowGolem[1]){
				if(rand.nextInt(10)<tagsSnowGolem[2]) num1=tagsSnowGolem[1];
			}
			itemstack.stackTagCompound.setInteger("aqua", num1);
			
			num1=rand.nextInt(tagsSnowGolem[3]);
			if (num1!=tagsSnowGolem[4]){
				if(rand.nextInt(10)<tagsSnowGolem[5]) num1=tagsSnowGolem[4];
			}
			itemstack.stackTagCompound.setInteger("archier", num1);
			
			num1=rand.nextInt(tagsSnowGolem[6]);
			if (num1!=tagsSnowGolem[7]){
				if(rand.nextInt(10)<tagsSnowGolem[8]) num1=tagsSnowGolem[7];
			}
			itemstack.stackTagCompound.setInteger("darkness", num1);
			
			num1=rand.nextInt(tagsSnowGolem[9]);
			if (num1!=tagsSnowGolem[10]){
				if(rand.nextInt(10)<tagsSnowGolem[11]) num1=tagsSnowGolem[10];
			}
			itemstack.stackTagCompound.setInteger("day", num1);
			
			num1=rand.nextInt(tagsSnowGolem[12]);
			if (num1!=tagsSnowGolem[13]){
				if(rand.nextInt(10)<tagsSnowGolem[14]) num1=tagsSnowGolem[13];
			}
			itemstack.stackTagCompound.setInteger("death", num1);
			
			num1=rand.nextInt(tagsSnowGolem[15]);
			if (num1!=tagsSnowGolem[16]){
				if(rand.nextInt(10)<tagsSnowGolem[17]) num1=tagsSnowGolem[16];
			}
			itemstack.stackTagCompound.setInteger("diamond", num1);
			
			num1=rand.nextInt(tagsSnowGolem[18]);
			if (num1!=tagsSnowGolem[19]){
				if(rand.nextInt(10)<tagsSnowGolem[20]) num1=tagsSnowGolem[19];
			}
			itemstack.stackTagCompound.setInteger("echo", num1);
			
			num1=rand.nextInt(tagsSnowGolem[21]);
			if (num1!=tagsSnowGolem[22]){
				if(rand.nextInt(10)<tagsSnowGolem[23]) num1=tagsSnowGolem[22];
			}
			itemstack.stackTagCompound.setInteger("end", num1);
			
			num1=rand.nextInt(tagsSnowGolem[24]);
			if (num1!=tagsSnowGolem[25]){
				if(rand.nextInt(10)<tagsSnowGolem[26]) num1=tagsSnowGolem[25];
			}
			itemstack.stackTagCompound.setInteger("fear", num1);
			
			num1=rand.nextInt(tagsSnowGolem[27]);
			if (num1!=tagsSnowGolem[28]){
				if(rand.nextInt(10)<tagsSnowGolem[29]) num1=tagsSnowGolem[28];
			}
			itemstack.stackTagCompound.setInteger("feather", num1);
			
			num1=rand.nextInt(tagsSnowGolem[30]);
			if (num1!=tagsSnowGolem[31]){
				if(rand.nextInt(10)<tagsSnowGolem[32]) num1=tagsSnowGolem[31];
			}
			itemstack.stackTagCompound.setInteger("flame", num1);
			
			num1=rand.nextInt(tagsSnowGolem[33]);
			if (num1!=tagsSnowGolem[34]){
				if(rand.nextInt(10)<tagsSnowGolem[35]) num1=tagsSnowGolem[34];
			}
			itemstack.stackTagCompound.setInteger("gunpowder", num1);
			
			num1=rand.nextInt(tagsSnowGolem[36]);
			if (num1!=tagsSnowGolem[37]){
				if(rand.nextInt(10)<tagsSnowGolem[38]) num1=tagsSnowGolem[37];
			}
			itemstack.stackTagCompound.setInteger("iron", num1);
			
			num1=rand.nextInt(tagsSnowGolem[39]);
			if (num1!=tagsSnowGolem[40]){
				if(rand.nextInt(10)<tagsSnowGolem[41]) num1=tagsSnowGolem[40];
			}
			itemstack.stackTagCompound.setInteger("light", num1);
			
			num1=rand.nextInt(tagsSnowGolem[42]);
			if (num1!=tagsSnowGolem[43]){
				if(rand.nextInt(10)<tagsSnowGolem[44]) num1=tagsSnowGolem[43];
			}
			itemstack.stackTagCompound.setInteger("race", num1);
			
			num1=rand.nextInt(tagsSnowGolem[45]);
			if (num1!=tagsSnowGolem[46]){
				if(rand.nextInt(10)<tagsSnowGolem[47]) num1=tagsSnowGolem[46];
			}
			itemstack.stackTagCompound.setInteger("spring", num1);
			
			num1=rand.nextInt(tagsSnowGolem[48]);
			if (num1!=tagsSnowGolem[49]){
				if(rand.nextInt(10)<tagsSnowGolem[50]) num1=tagsSnowGolem[49];
			}
			itemstack.stackTagCompound.setInteger("sugar", num1);
			
			num1=rand.nextInt(tagsSnowGolem[51]);
			if (num1!=tagsSnowGolem[52]){
				if(rand.nextInt(10)<tagsSnowGolem[53]) num1=tagsSnowGolem[52];
			}
			itemstack.stackTagCompound.setInteger("sustenance", num1);
			
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}	
		else if(itemstack.getItem().itemID==Items.bloodBagSpider.itemID){
			int num1;
			
			num1=rand.nextInt(tagsSpider[0]);
			if (num1!=tagsSpider[1]){
				if(rand.nextInt(10)<tagsSpider[2]) num1=tagsSpider[1];
			}
			itemstack.stackTagCompound.setInteger("aqua", num1);
			
			num1=rand.nextInt(tagsSpider[3]);
			if (num1!=tagsSpider[4]){
				if(rand.nextInt(10)<tagsSpider[5]) num1=tagsSpider[4];
			}
			itemstack.stackTagCompound.setInteger("archier", num1);
			
			num1=rand.nextInt(tagsSpider[6]);
			if (num1!=tagsSpider[7]){
				if(rand.nextInt(10)<tagsSpider[8]) num1=tagsSpider[7];
			}
			itemstack.stackTagCompound.setInteger("darkness", num1);
			
			num1=rand.nextInt(tagsSpider[9]);
			if (num1!=tagsSpider[10]){
				if(rand.nextInt(10)<tagsSpider[11]) num1=tagsSpider[10];
			}
			itemstack.stackTagCompound.setInteger("day", num1);
			
			num1=rand.nextInt(tagsSpider[12]);
			if (num1!=tagsSpider[13]){
				if(rand.nextInt(10)<tagsSpider[14]) num1=tagsSpider[13];
			}
			itemstack.stackTagCompound.setInteger("death", num1);
			
			num1=rand.nextInt(tagsSpider[15]);
			if (num1!=tagsSpider[16]){
				if(rand.nextInt(10)<tagsSpider[17]) num1=tagsSpider[16];
			}
			itemstack.stackTagCompound.setInteger("diamond", num1);
			
			num1=rand.nextInt(tagsSpider[18]);
			if (num1!=tagsSpider[19]){
				if(rand.nextInt(10)<tagsSpider[20]) num1=tagsSpider[19];
			}
			itemstack.stackTagCompound.setInteger("echo", num1);
			
			num1=rand.nextInt(tagsSpider[21]);
			if (num1!=tagsSpider[22]){
				if(rand.nextInt(10)<tagsSpider[23]) num1=tagsSpider[22];
			}
			itemstack.stackTagCompound.setInteger("end", num1);
			
			num1=rand.nextInt(tagsSpider[24]);
			if (num1!=tagsSpider[25]){
				if(rand.nextInt(10)<tagsSpider[26]) num1=tagsSpider[25];
			}
			itemstack.stackTagCompound.setInteger("fear", num1);
			
			num1=rand.nextInt(tagsSpider[27]);
			if (num1!=tagsSpider[28]){
				if(rand.nextInt(10)<tagsSpider[29]) num1=tagsSpider[28];
			}
			itemstack.stackTagCompound.setInteger("feather", num1);
			
			num1=rand.nextInt(tagsSpider[30]);
			if (num1!=tagsSpider[31]){
				if(rand.nextInt(10)<tagsSpider[32]) num1=tagsSpider[31];
			}
			itemstack.stackTagCompound.setInteger("flame", num1);
			
			num1=rand.nextInt(tagsSpider[33]);
			if (num1!=tagsSpider[34]){
				if(rand.nextInt(10)<tagsSpider[35]) num1=tagsSpider[34];
			}
			itemstack.stackTagCompound.setInteger("gunpowder", num1);
			
			num1=rand.nextInt(tagsSpider[36]);
			if (num1!=tagsSpider[37]){
				if(rand.nextInt(10)<tagsSpider[38]) num1=tagsSpider[37];
			}
			itemstack.stackTagCompound.setInteger("iron", num1);
			
			num1=rand.nextInt(tagsSpider[39]);
			if (num1!=tagsSpider[40]){
				if(rand.nextInt(10)<tagsSpider[41]) num1=tagsSpider[40];
			}
			itemstack.stackTagCompound.setInteger("light", num1);
			
			num1=rand.nextInt(tagsSpider[42]);
			if (num1!=tagsSpider[43]){
				if(rand.nextInt(10)<tagsSpider[44]) num1=tagsSpider[43];
			}
			itemstack.stackTagCompound.setInteger("race", num1);
			
			num1=rand.nextInt(tagsSpider[45]);
			if (num1!=tagsSpider[46]){
				if(rand.nextInt(10)<tagsSpider[47]) num1=tagsSpider[46];
			}
			itemstack.stackTagCompound.setInteger("spring", num1);
			
			num1=rand.nextInt(tagsSpider[48]);
			if (num1!=tagsSpider[49]){
				if(rand.nextInt(10)<tagsSpider[50]) num1=tagsSpider[49];
			}
			itemstack.stackTagCompound.setInteger("sugar", num1);
			
			num1=rand.nextInt(tagsSpider[51]);
			if (num1!=tagsSpider[52]){
				if(rand.nextInt(10)<tagsSpider[53]) num1=tagsSpider[52];
			}
			itemstack.stackTagCompound.setInteger("sustenance", num1);
			
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}	
		else if(itemstack.getItem().itemID==Items.bloodBagSquid.itemID){
			int num1;
			
			num1=rand.nextInt(tagsSquid[0]);
			if (num1!=tagsSquid[1]){
				if(rand.nextInt(10)<tagsSquid[2]) num1=tagsSquid[1];
			}
			itemstack.stackTagCompound.setInteger("aqua", num1);
			
			num1=rand.nextInt(tagsSquid[3]);
			if (num1!=tagsSquid[4]){
				if(rand.nextInt(10)<tagsSquid[5]) num1=tagsSquid[4];
			}
			itemstack.stackTagCompound.setInteger("archier", num1);
			
			num1=rand.nextInt(tagsSquid[6]);
			if (num1!=tagsSquid[7]){
				if(rand.nextInt(10)<tagsSquid[8]) num1=tagsSquid[7];
			}
			itemstack.stackTagCompound.setInteger("darkness", num1);
			
			num1=rand.nextInt(tagsSquid[9]);
			if (num1!=tagsSquid[10]){
				if(rand.nextInt(10)<tagsSquid[11]) num1=tagsSquid[10];
			}
			itemstack.stackTagCompound.setInteger("day", num1);
			
			num1=rand.nextInt(tagsSquid[12]);
			if (num1!=tagsSquid[13]){
				if(rand.nextInt(10)<tagsSquid[14]) num1=tagsSquid[13];
			}
			itemstack.stackTagCompound.setInteger("death", num1);
			
			num1=rand.nextInt(tagsSquid[15]);
			if (num1!=tagsSquid[16]){
				if(rand.nextInt(10)<tagsSquid[17]) num1=tagsSquid[16];
			}
			itemstack.stackTagCompound.setInteger("diamond", num1);
			
			num1=rand.nextInt(tagsSquid[18]);
			if (num1!=tagsSquid[19]){
				if(rand.nextInt(10)<tagsSquid[20]) num1=tagsSquid[19];
			}
			itemstack.stackTagCompound.setInteger("echo", num1);
			
			num1=rand.nextInt(tagsSquid[21]);
			if (num1!=tagsSquid[22]){
				if(rand.nextInt(10)<tagsSquid[23]) num1=tagsSquid[22];
			}
			itemstack.stackTagCompound.setInteger("end", num1);
			
			num1=rand.nextInt(tagsSquid[24]);
			if (num1!=tagsSquid[25]){
				if(rand.nextInt(10)<tagsSquid[26]) num1=tagsSquid[25];
			}
			itemstack.stackTagCompound.setInteger("fear", num1);
			
			num1=rand.nextInt(tagsSquid[27]);
			if (num1!=tagsSquid[28]){
				if(rand.nextInt(10)<tagsSquid[29]) num1=tagsSquid[28];
			}
			itemstack.stackTagCompound.setInteger("feather", num1);
			
			num1=rand.nextInt(tagsSquid[30]);
			if (num1!=tagsSquid[31]){
				if(rand.nextInt(10)<tagsSquid[32]) num1=tagsSquid[31];
			}
			itemstack.stackTagCompound.setInteger("flame", num1);
			
			num1=rand.nextInt(tagsSquid[33]);
			if (num1!=tagsSquid[34]){
				if(rand.nextInt(10)<tagsSquid[35]) num1=tagsSquid[34];
			}
			itemstack.stackTagCompound.setInteger("gunpowder", num1);
			
			num1=rand.nextInt(tagsSquid[36]);
			if (num1!=tagsSquid[37]){
				if(rand.nextInt(10)<tagsSquid[38]) num1=tagsSquid[37];
			}
			itemstack.stackTagCompound.setInteger("iron", num1);
			
			num1=rand.nextInt(tagsSquid[39]);
			if (num1!=tagsSquid[40]){
				if(rand.nextInt(10)<tagsSquid[41]) num1=tagsSquid[40];
			}
			itemstack.stackTagCompound.setInteger("light", num1);
			
			num1=rand.nextInt(tagsSquid[42]);
			if (num1!=tagsSquid[43]){
				if(rand.nextInt(10)<tagsSquid[44]) num1=tagsSquid[43];
			}
			itemstack.stackTagCompound.setInteger("race", num1);
			
			num1=rand.nextInt(tagsSquid[45]);
			if (num1!=tagsSquid[46]){
				if(rand.nextInt(10)<tagsSquid[47]) num1=tagsSquid[46];
			}
			itemstack.stackTagCompound.setInteger("spring", num1);
			
			num1=rand.nextInt(tagsSquid[48]);
			if (num1!=tagsSquid[49]){
				if(rand.nextInt(10)<tagsSquid[50]) num1=tagsSquid[49];
			}
			itemstack.stackTagCompound.setInteger("sugar", num1);
			
			num1=rand.nextInt(tagsSquid[51]);
			if (num1!=tagsSquid[52]){
				if(rand.nextInt(10)<tagsSquid[53]) num1=tagsSquid[52];
			}
			itemstack.stackTagCompound.setInteger("sustenance", num1);
			
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}	
		else if(itemstack.getItem().itemID==Items.bloodBagVillager.itemID){
			int num1;
			
			num1=rand.nextInt(tagsVillager[0]);
			if (num1!=tagsVillager[1]){
				if(rand.nextInt(10)<tagsVillager[2]) num1=tagsVillager[1];
			}
			itemstack.stackTagCompound.setInteger("aqua", num1);
			
			num1=rand.nextInt(tagsVillager[3]);
			if (num1!=tagsVillager[4]){
				if(rand.nextInt(10)<tagsVillager[5]) num1=tagsVillager[4];
			}
			itemstack.stackTagCompound.setInteger("archier", num1);
			
			num1=rand.nextInt(tagsVillager[6]);
			if (num1!=tagsVillager[7]){
				if(rand.nextInt(10)<tagsVillager[8]) num1=tagsVillager[7];
			}
			itemstack.stackTagCompound.setInteger("darkness", num1);
			
			num1=rand.nextInt(tagsVillager[9]);
			if (num1!=tagsVillager[10]){
				if(rand.nextInt(10)<tagsVillager[11]) num1=tagsVillager[10];
			}
			itemstack.stackTagCompound.setInteger("day", num1);
			
			num1=rand.nextInt(tagsVillager[12]);
			if (num1!=tagsVillager[13]){
				if(rand.nextInt(10)<tagsVillager[14]) num1=tagsVillager[13];
			}
			itemstack.stackTagCompound.setInteger("death", num1);
			
			num1=rand.nextInt(tagsVillager[15]);
			if (num1!=tagsVillager[16]){
				if(rand.nextInt(10)<tagsVillager[17]) num1=tagsVillager[16];
			}
			itemstack.stackTagCompound.setInteger("diamond", num1);
			
			num1=rand.nextInt(tagsVillager[18]);
			if (num1!=tagsVillager[19]){
				if(rand.nextInt(10)<tagsVillager[20]) num1=tagsVillager[19];
			}
			itemstack.stackTagCompound.setInteger("echo", num1);
			
			num1=rand.nextInt(tagsVillager[21]);
			if (num1!=tagsVillager[22]){
				if(rand.nextInt(10)<tagsVillager[23]) num1=tagsVillager[22];
			}
			itemstack.stackTagCompound.setInteger("end", num1);
			
			num1=rand.nextInt(tagsVillager[24]);
			if (num1!=tagsVillager[25]){
				if(rand.nextInt(10)<tagsVillager[26]) num1=tagsVillager[25];
			}
			itemstack.stackTagCompound.setInteger("fear", num1);
			
			num1=rand.nextInt(tagsVillager[27]);
			if (num1!=tagsVillager[28]){
				if(rand.nextInt(10)<tagsVillager[29]) num1=tagsVillager[28];
			}
			itemstack.stackTagCompound.setInteger("feather", num1);
			
			num1=rand.nextInt(tagsVillager[30]);
			if (num1!=tagsVillager[31]){
				if(rand.nextInt(10)<tagsVillager[32]) num1=tagsVillager[31];
			}
			itemstack.stackTagCompound.setInteger("flame", num1);
			
			num1=rand.nextInt(tagsVillager[33]);
			if (num1!=tagsVillager[34]){
				if(rand.nextInt(10)<tagsVillager[35]) num1=tagsVillager[34];
			}
			itemstack.stackTagCompound.setInteger("gunpowder", num1);
			
			num1=rand.nextInt(tagsVillager[36]);
			if (num1!=tagsVillager[37]){
				if(rand.nextInt(10)<tagsVillager[38]) num1=tagsVillager[37];
			}
			itemstack.stackTagCompound.setInteger("iron", num1);
			
			num1=rand.nextInt(tagsVillager[39]);
			if (num1!=tagsVillager[40]){
				if(rand.nextInt(10)<tagsVillager[41]) num1=tagsVillager[40];
			}
			itemstack.stackTagCompound.setInteger("light", num1);
			
			num1=rand.nextInt(tagsVillager[42]);
			if (num1!=tagsVillager[43]){
				if(rand.nextInt(10)<tagsVillager[44]) num1=tagsVillager[43];
			}
			itemstack.stackTagCompound.setInteger("race", num1);
			
			num1=rand.nextInt(tagsVillager[45]);
			if (num1!=tagsVillager[46]){
				if(rand.nextInt(10)<tagsVillager[47]) num1=tagsVillager[46];
			}
			itemstack.stackTagCompound.setInteger("spring", num1);
			
			num1=rand.nextInt(tagsVillager[48]);
			if (num1!=tagsVillager[49]){
				if(rand.nextInt(10)<tagsVillager[50]) num1=tagsVillager[49];
			}
			itemstack.stackTagCompound.setInteger("sugar", num1);
			
			num1=rand.nextInt(tagsVillager[51]);
			if (num1!=tagsVillager[52]){
				if(rand.nextInt(10)<tagsVillager[53]) num1=tagsVillager[52];
			}
			itemstack.stackTagCompound.setInteger("sustenance", num1);
			
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}	
		else if(itemstack.getItem().itemID==Items.bloodBagWitch.itemID){
			int num1;
			
			num1=rand.nextInt(tagsWitch[0]);
			if (num1!=tagsWitch[1]){
				if(rand.nextInt(10)<tagsWitch[2]) num1=tagsWitch[1];
			}
			itemstack.stackTagCompound.setInteger("aqua", num1);
			
			num1=rand.nextInt(tagsVillager[3]);
			if (num1!=tagsWitch[4]){
				if(rand.nextInt(10)<tagsWitch[5]) num1=tagsWitch[4];
			}
			itemstack.stackTagCompound.setInteger("archier", num1);
			
			num1=rand.nextInt(tagsWitch[6]);
			if (num1!=tagsWitch[7]){
				if(rand.nextInt(10)<tagsWitch[8]) num1=tagsWitch[7];
			}
			itemstack.stackTagCompound.setInteger("darkness", num1);
			
			num1=rand.nextInt(tagsWitch[9]);
			if (num1!=tagsWitch[10]){
				if(rand.nextInt(10)<tagsWitch[11]) num1=tagsWitch[10];
			}
			itemstack.stackTagCompound.setInteger("day", num1);
			
			num1=rand.nextInt(tagsWitch[12]);
			if (num1!=tagsWitch[13]){
				if(rand.nextInt(10)<tagsWitch[14]) num1=tagsWitch[13];
			}
			itemstack.stackTagCompound.setInteger("death", num1);
			
			num1=rand.nextInt(tagsWitch[15]);
			if (num1!=tagsWitch[16]){
				if(rand.nextInt(10)<tagsWitch[17]) num1=tagsWitch[16];
			}
			itemstack.stackTagCompound.setInteger("diamond", num1);
			
			num1=rand.nextInt(tagsWitch[18]);
			if (num1!=tagsWitch[19]){
				if(rand.nextInt(10)<tagsWitch[20]) num1=tagsWitch[19];
			}
			itemstack.stackTagCompound.setInteger("echo", num1);
			
			num1=rand.nextInt(tagsWitch[21]);
			if (num1!=tagsWitch[22]){
				if(rand.nextInt(10)<tagsWitch[23]) num1=tagsWitch[22];
			}
			itemstack.stackTagCompound.setInteger("end", num1);
			
			num1=rand.nextInt(tagsWitch[24]);
			if (num1!=tagsWitch[25]){
				if(rand.nextInt(10)<tagsWitch[26]) num1=tagsWitch[25];
			}
			itemstack.stackTagCompound.setInteger("fear", num1);
			
			num1=rand.nextInt(tagsWitch[27]);
			if (num1!=tagsWitch[28]){
				if(rand.nextInt(10)<tagsWitch[29]) num1=tagsWitch[28];
			}
			itemstack.stackTagCompound.setInteger("feather", num1);
			
			num1=rand.nextInt(tagsWitch[30]);
			if (num1!=tagsWitch[31]){
				if(rand.nextInt(10)<tagsWitch[32]) num1=tagsWitch[31];
			}
			itemstack.stackTagCompound.setInteger("flame", num1);
			
			num1=rand.nextInt(tagsWitch[33]);
			if (num1!=tagsWitch[34]){
				if(rand.nextInt(10)<tagsWitch[35]) num1=tagsWitch[34];
			}
			itemstack.stackTagCompound.setInteger("gunpowder", num1);
			
			num1=rand.nextInt(tagsWitch[36]);
			if (num1!=tagsWitch[37]){
				if(rand.nextInt(10)<tagsWitch[38]) num1=tagsWitch[37];
			}
			itemstack.stackTagCompound.setInteger("iron", num1);
			
			num1=rand.nextInt(tagsWitch[39]);
			if (num1!=tagsWitch[40]){
				if(rand.nextInt(10)<tagsWitch[41]) num1=tagsWitch[40];
			}
			itemstack.stackTagCompound.setInteger("light", num1);
			
			num1=rand.nextInt(tagsWitch[42]);
			if (num1!=tagsWitch[43]){
				if(rand.nextInt(10)<tagsWitch[44]) num1=tagsWitch[43];
			}
			itemstack.stackTagCompound.setInteger("race", num1);
			
			num1=rand.nextInt(tagsWitch[45]);
			if (num1!=tagsWitch[46]){
				if(rand.nextInt(10)<tagsWitch[47]) num1=tagsWitch[46];
			}
			itemstack.stackTagCompound.setInteger("spring", num1);
			
			num1=rand.nextInt(tagsWitch[48]);
			if (num1!=tagsWitch[49]){
				if(rand.nextInt(10)<tagsWitch[50]) num1=tagsWitch[49];
			}
			itemstack.stackTagCompound.setInteger("sugar", num1);
			
			num1=rand.nextInt(tagsWitch[51]);
			if (num1!=tagsWitch[52]){
				if(rand.nextInt(10)<tagsWitch[53]) num1=tagsWitch[52];
			}
			itemstack.stackTagCompound.setInteger("sustenance", num1);
			
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}	
		else if(itemstack.getItem().itemID==Items.bloodBagWither.itemID){
			int num1;
			
			num1=rand.nextInt(tagsWither[0]);
			if (num1!=tagsWither[1]){
				if(rand.nextInt(10)<tagsWither[2]) num1=tagsWither[1];
			}
			itemstack.stackTagCompound.setInteger("aqua", num1);
			
			num1=rand.nextInt(tagsWither[3]);
			if (num1!=tagsWither[4]){
				if(rand.nextInt(10)<tagsWither[5]) num1=tagsWither[4];
			}
			itemstack.stackTagCompound.setInteger("archier", num1);
			
			num1=rand.nextInt(tagsWither[6]);
			if (num1!=tagsWither[7]){
				if(rand.nextInt(10)<tagsWither[8]) num1=tagsWither[7];
			}
			itemstack.stackTagCompound.setInteger("darkness", num1);
			
			num1=rand.nextInt(tagsWither[9]);
			if (num1!=tagsWither[10]){
				if(rand.nextInt(10)<tagsWither[11]) num1=tagsWither[10];
			}
			itemstack.stackTagCompound.setInteger("day", num1);
			
			num1=rand.nextInt(tagsWither[12]);
			if (num1!=tagsWither[13]){
				if(rand.nextInt(10)<tagsWither[14]) num1=tagsWither[13];
			}
			itemstack.stackTagCompound.setInteger("death", num1);
			
			num1=rand.nextInt(tagsWither[15]);
			if (num1!=tagsWither[16]){
				if(rand.nextInt(10)<tagsWither[17]) num1=tagsWither[16];
			}
			itemstack.stackTagCompound.setInteger("diamond", num1);
			
			num1=rand.nextInt(tagsWither[18]);
			if (num1!=tagsWither[19]){
				if(rand.nextInt(10)<tagsWither[20]) num1=tagsWither[19];
			}
			itemstack.stackTagCompound.setInteger("echo", num1);
			
			num1=rand.nextInt(tagsWither[21]);
			if (num1!=tagsWither[22]){
				if(rand.nextInt(10)<tagsWither[23]) num1=tagsWither[22];
			}
			itemstack.stackTagCompound.setInteger("end", num1);
			
			num1=rand.nextInt(tagsWither[24]);
			if (num1!=tagsWither[25]){
				if(rand.nextInt(10)<tagsWither[26]) num1=tagsWither[25];
			}
			itemstack.stackTagCompound.setInteger("fear", num1);
			
			num1=rand.nextInt(tagsWither[27]);
			if (num1!=tagsWither[28]){
				if(rand.nextInt(10)<tagsWither[29]) num1=tagsWither[28];
			}
			itemstack.stackTagCompound.setInteger("feather", num1);
			
			num1=rand.nextInt(tagsWither[30]);
			if (num1!=tagsWither[31]){
				if(rand.nextInt(10)<tagsWither[32]) num1=tagsWither[31];
			}
			itemstack.stackTagCompound.setInteger("flame", num1);
			
			num1=rand.nextInt(tagsWither[33]);
			if (num1!=tagsWither[34]){
				if(rand.nextInt(10)<tagsWither[35]) num1=tagsWither[34];
			}
			itemstack.stackTagCompound.setInteger("gunpowder", num1);
			
			num1=rand.nextInt(tagsWither[36]);
			if (num1!=tagsWither[37]){
				if(rand.nextInt(10)<tagsWither[38]) num1=tagsWither[37];
			}
			itemstack.stackTagCompound.setInteger("iron", num1);
			
			num1=rand.nextInt(tagsWither[39]);
			if (num1!=tagsWither[40]){
				if(rand.nextInt(10)<tagsWither[41]) num1=tagsWither[40];
			}
			itemstack.stackTagCompound.setInteger("light", num1);
			
			num1=rand.nextInt(tagsWither[42]);
			if (num1!=tagsWither[43]){
				if(rand.nextInt(10)<tagsWither[44]) num1=tagsWither[43];
			}
			itemstack.stackTagCompound.setInteger("race", num1);
			
			num1=rand.nextInt(tagsWither[45]);
			if (num1!=tagsWither[46]){
				if(rand.nextInt(10)<tagsWither[47]) num1=tagsWither[46];
			}
			itemstack.stackTagCompound.setInteger("spring", num1);
			
			num1=rand.nextInt(tagsWither[48]);
			if (num1!=tagsWither[49]){
				if(rand.nextInt(10)<tagsWither[50]) num1=tagsWither[49];
			}
			itemstack.stackTagCompound.setInteger("sugar", num1);
			
			num1=rand.nextInt(tagsWither[51]);
			if (num1!=tagsWither[52]){
				if(rand.nextInt(10)<tagsWither[53]) num1=tagsWither[52];
			}
			itemstack.stackTagCompound.setInteger("sustenance", num1);
			
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}	
		else if(itemstack.getItem().itemID==Items.bloodBagWitherSkeleton.itemID){
			int num1;
			
			num1=rand.nextInt(tagsWitherSkeleton[0]);
			if (num1!=tagsWitherSkeleton[1]){
				if(rand.nextInt(10)<tagsWitherSkeleton[2]) num1=tagsWitherSkeleton[1];
			}
			itemstack.stackTagCompound.setInteger("aqua", num1);
			
			num1=rand.nextInt(tagsWitherSkeleton[3]);
			if (num1!=tagsWitherSkeleton[4]){
				if(rand.nextInt(10)<tagsWitherSkeleton[5]) num1=tagsWitherSkeleton[4];
			}
			itemstack.stackTagCompound.setInteger("archier", num1);
			
			num1=rand.nextInt(tagsWitherSkeleton[6]);
			if (num1!=tagsWitherSkeleton[7]){
				if(rand.nextInt(10)<tagsWitherSkeleton[8]) num1=tagsWitherSkeleton[7];
			}
			itemstack.stackTagCompound.setInteger("darkness", num1);
			
			num1=rand.nextInt(tagsWitherSkeleton[9]);
			if (num1!=tagsWitherSkeleton[10]){
				if(rand.nextInt(10)<tagsWitherSkeleton[11]) num1=tagsWitherSkeleton[10];
			}
			itemstack.stackTagCompound.setInteger("day", num1);
			
			num1=rand.nextInt(tagsWitherSkeleton[12]);
			if (num1!=tagsWitherSkeleton[13]){
				if(rand.nextInt(10)<tagsWitherSkeleton[14]) num1=tagsWitherSkeleton[13];
			}
			itemstack.stackTagCompound.setInteger("death", num1);
			
			num1=rand.nextInt(tagsWitherSkeleton[15]);
			if (num1!=tagsWitherSkeleton[16]){
				if(rand.nextInt(10)<tagsWitherSkeleton[17]) num1=tagsWitherSkeleton[16];
			}
			itemstack.stackTagCompound.setInteger("diamond", num1);
			
			num1=rand.nextInt(tagsWitherSkeleton[18]);
			if (num1!=tagsWitherSkeleton[19]){
				if(rand.nextInt(10)<tagsWitherSkeleton[20]) num1=tagsWitherSkeleton[19];
			}
			itemstack.stackTagCompound.setInteger("echo", num1);
			
			num1=rand.nextInt(tagsWitherSkeleton[21]);
			if (num1!=tagsWitherSkeleton[22]){
				if(rand.nextInt(10)<tagsWitherSkeleton[23]) num1=tagsWitherSkeleton[22];
			}
			itemstack.stackTagCompound.setInteger("end", num1);
			
			num1=rand.nextInt(tagsWitherSkeleton[24]);
			if (num1!=tagsWitherSkeleton[25]){
				if(rand.nextInt(10)<tagsWitherSkeleton[26]) num1=tagsWitherSkeleton[25];
			}
			itemstack.stackTagCompound.setInteger("fear", num1);
			
			num1=rand.nextInt(tagsWitherSkeleton[27]);
			if (num1!=tagsWitherSkeleton[28]){
				if(rand.nextInt(10)<tagsWitherSkeleton[29]) num1=tagsWitherSkeleton[28];
			}
			itemstack.stackTagCompound.setInteger("feather", num1);
			
			num1=rand.nextInt(tagsWitherSkeleton[30]);
			if (num1!=tagsWitherSkeleton[31]){
				if(rand.nextInt(10)<tagsWitherSkeleton[32]) num1=tagsWitherSkeleton[31];
			}
			itemstack.stackTagCompound.setInteger("flame", num1);
			
			num1=rand.nextInt(tagsWitherSkeleton[33]);
			if (num1!=tagsWitherSkeleton[34]){
				if(rand.nextInt(10)<tagsWitherSkeleton[35]) num1=tagsWitherSkeleton[34];
			}
			itemstack.stackTagCompound.setInteger("gunpowder", num1);
			
			num1=rand.nextInt(tagsWitherSkeleton[36]);
			if (num1!=tagsWitherSkeleton[37]){
				if(rand.nextInt(10)<tagsWitherSkeleton[38]) num1=tagsWitherSkeleton[37];
			}
			itemstack.stackTagCompound.setInteger("iron", num1);
			
			num1=rand.nextInt(tagsWitherSkeleton[39]);
			if (num1!=tagsWitherSkeleton[40]){
				if(rand.nextInt(10)<tagsWitherSkeleton[41]) num1=tagsWitherSkeleton[40];
			}
			itemstack.stackTagCompound.setInteger("light", num1);
			
			num1=rand.nextInt(tagsWitherSkeleton[42]);
			if (num1!=tagsWitherSkeleton[43]){
				if(rand.nextInt(10)<tagsWitherSkeleton[44]) num1=tagsWitherSkeleton[43];
			}
			itemstack.stackTagCompound.setInteger("race", num1);
			
			num1=rand.nextInt(tagsWitherSkeleton[45]);
			if (num1!=tagsWitherSkeleton[46]){
				if(rand.nextInt(10)<tagsWitherSkeleton[47]) num1=tagsWitherSkeleton[46];
			}
			itemstack.stackTagCompound.setInteger("spring", num1);
			
			num1=rand.nextInt(tagsWitherSkeleton[48]);
			if (num1!=tagsWitherSkeleton[49]){
				if(rand.nextInt(10)<tagsWitherSkeleton[50]) num1=tagsWitherSkeleton[49];
			}
			itemstack.stackTagCompound.setInteger("sugar", num1);
			
			num1=rand.nextInt(tagsWitherSkeleton[51]);
			if (num1!=tagsWitherSkeleton[52]){
				if(rand.nextInt(10)<tagsWitherSkeleton[53]) num1=tagsWitherSkeleton[52];
			}
			itemstack.stackTagCompound.setInteger("sustenance", num1);
			
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}	
		else if(itemstack.getItem().itemID==Items.bloodBagWolf.itemID){
			int num1;
			
			num1=rand.nextInt(tagsWolf[0]);
			if (num1!=tagsWolf[1]){
				if(rand.nextInt(10)<tagsWolf[2]) num1=tagsWolf[1];
			}
			itemstack.stackTagCompound.setInteger("aqua", num1);
			
			num1=rand.nextInt(tagsWolf[3]);
			if (num1!=tagsWolf[4]){
				if(rand.nextInt(10)<tagsWolf[5]) num1=tagsWolf[4];
			}
			itemstack.stackTagCompound.setInteger("archier", num1);
			
			num1=rand.nextInt(tagsWolf[6]);
			if (num1!=tagsWolf[7]){
				if(rand.nextInt(10)<tagsWolf[8]) num1=tagsWolf[7];
			}
			itemstack.stackTagCompound.setInteger("darkness", num1);
			
			num1=rand.nextInt(tagsWolf[9]);
			if (num1!=tagsWolf[10]){
				if(rand.nextInt(10)<tagsWolf[11]) num1=tagsWolf[10];
			}
			itemstack.stackTagCompound.setInteger("day", num1);
			
			num1=rand.nextInt(tagsWolf[12]);
			if (num1!=tagsWolf[13]){
				if(rand.nextInt(10)<tagsWolf[14]) num1=tagsWolf[13];
			}
			itemstack.stackTagCompound.setInteger("death", num1);
			
			num1=rand.nextInt(tagsWolf[15]);
			if (num1!=tagsWolf[16]){
				if(rand.nextInt(10)<tagsWolf[17]) num1=tagsWolf[16];
			}
			itemstack.stackTagCompound.setInteger("diamond", num1);
			
			num1=rand.nextInt(tagsWolf[18]);
			if (num1!=tagsWolf[19]){
				if(rand.nextInt(10)<tagsWolf[20]) num1=tagsWolf[19];
			}
			itemstack.stackTagCompound.setInteger("echo", num1);
			
			num1=rand.nextInt(tagsWolf[21]);
			if (num1!=tagsWolf[22]){
				if(rand.nextInt(10)<tagsWolf[23]) num1=tagsWolf[22];
			}
			itemstack.stackTagCompound.setInteger("end", num1);
			
			num1=rand.nextInt(tagsWolf[24]);
			if (num1!=tagsWolf[25]){
				if(rand.nextInt(10)<tagsWolf[26]) num1=tagsWolf[25];
			}
			itemstack.stackTagCompound.setInteger("fear", num1);
			
			num1=rand.nextInt(tagsWolf[27]);
			if (num1!=tagsWolf[28]){
				if(rand.nextInt(10)<tagsWolf[29]) num1=tagsWolf[28];
			}
			itemstack.stackTagCompound.setInteger("feather", num1);
			
			num1=rand.nextInt(tagsWolf[30]);
			if (num1!=tagsWolf[31]){
				if(rand.nextInt(10)<tagsWolf[32]) num1=tagsWolf[31];
			}
			itemstack.stackTagCompound.setInteger("flame", num1);
			
			num1=rand.nextInt(tagsWolf[33]);
			if (num1!=tagsWolf[34]){
				if(rand.nextInt(10)<tagsWolf[35]) num1=tagsWolf[34];
			}
			itemstack.stackTagCompound.setInteger("gunpowder", num1);
			
			num1=rand.nextInt(tagsWolf[36]);
			if (num1!=tagsWolf[37]){
				if(rand.nextInt(10)<tagsWolf[38]) num1=tagsWolf[37];
			}
			itemstack.stackTagCompound.setInteger("iron", num1);
			
			num1=rand.nextInt(tagsWolf[39]);
			if (num1!=tagsWolf[40]){
				if(rand.nextInt(10)<tagsWolf[41]) num1=tagsWolf[40];
			}
			itemstack.stackTagCompound.setInteger("light", num1);
			
			num1=rand.nextInt(tagsWolf[42]);
			if (num1!=tagsWolf[43]){
				if(rand.nextInt(10)<tagsWolf[44]) num1=tagsWolf[43];
			}
			itemstack.stackTagCompound.setInteger("race", num1);
			
			num1=rand.nextInt(tagsWolf[45]);
			if (num1!=tagsWolf[46]){
				if(rand.nextInt(10)<tagsWolf[47]) num1=tagsWolf[46];
			}
			itemstack.stackTagCompound.setInteger("spring", num1);
			
			num1=rand.nextInt(tagsWolf[48]);
			if (num1!=tagsWolf[49]){
				if(rand.nextInt(10)<tagsWolf[50]) num1=tagsWolf[49];
			}
			itemstack.stackTagCompound.setInteger("sugar", num1);
			
			num1=rand.nextInt(tagsWolf[51]);
			if (num1!=tagsWolf[52]){
				if(rand.nextInt(10)<tagsWolf[53]) num1=tagsWolf[52];
			}
			itemstack.stackTagCompound.setInteger("sustenance", num1);
			
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}	
		else if(itemstack.getItem().itemID==Items.bloodBagZombie.itemID){
			int num1;
			
			num1=rand.nextInt(tagsZombie[0]);
			if (num1!=tagsZombie[1]){
				if(rand.nextInt(10)<tagsZombie[2]) num1=tagsZombie[1];
			}
			itemstack.stackTagCompound.setInteger("aqua", num1);
			
			num1=rand.nextInt(tagsZombie[3]);
			if (num1!=tagsZombie[4]){
				if(rand.nextInt(10)<tagsZombie[5]) num1=tagsZombie[4];
			}
			itemstack.stackTagCompound.setInteger("archier", num1);
			
			num1=rand.nextInt(tagsZombie[6]);
			if (num1!=tagsZombie[7]){
				if(rand.nextInt(10)<tagsZombie[8]) num1=tagsZombie[7];
			}
			itemstack.stackTagCompound.setInteger("darkness", num1);
			
			num1=rand.nextInt(tagsZombie[9]);
			if (num1!=tagsZombie[10]){
				if(rand.nextInt(10)<tagsZombie[11]) num1=tagsZombie[10];
			}
			itemstack.stackTagCompound.setInteger("day", num1);
			
			num1=rand.nextInt(tagsZombie[12]);
			if (num1!=tagsZombie[13]){
				if(rand.nextInt(10)<tagsZombie[14]) num1=tagsZombie[13];
			}
			itemstack.stackTagCompound.setInteger("death", num1);
			
			num1=rand.nextInt(tagsZombie[15]);
			if (num1!=tagsZombie[16]){
				if(rand.nextInt(10)<tagsZombie[17]) num1=tagsZombie[16];
			}
			itemstack.stackTagCompound.setInteger("diamond", num1);
			
			num1=rand.nextInt(tagsZombie[18]);
			if (num1!=tagsZombie[19]){
				if(rand.nextInt(10)<tagsZombie[20]) num1=tagsZombie[19];
			}
			itemstack.stackTagCompound.setInteger("echo", num1);
			
			num1=rand.nextInt(tagsZombie[21]);
			if (num1!=tagsZombie[22]){
				if(rand.nextInt(10)<tagsZombie[23]) num1=tagsZombie[22];
			}
			itemstack.stackTagCompound.setInteger("end", num1);
			
			num1=rand.nextInt(tagsZombie[24]);
			if (num1!=tagsZombie[25]){
				if(rand.nextInt(10)<tagsZombie[26]) num1=tagsZombie[25];
			}
			itemstack.stackTagCompound.setInteger("fear", num1);
			
			num1=rand.nextInt(tagsZombie[27]);
			if (num1!=tagsZombie[28]){
				if(rand.nextInt(10)<tagsZombie[29]) num1=tagsZombie[28];
			}
			itemstack.stackTagCompound.setInteger("feather", num1);
			
			num1=rand.nextInt(tagsZombie[30]);
			if (num1!=tagsZombie[31]){
				if(rand.nextInt(10)<tagsZombie[32]) num1=tagsZombie[31];
			}
			itemstack.stackTagCompound.setInteger("flame", num1);
			
			num1=rand.nextInt(tagsZombie[33]);
			if (num1!=tagsZombie[34]){
				if(rand.nextInt(10)<tagsZombie[35]) num1=tagsZombie[34];
			}
			itemstack.stackTagCompound.setInteger("gunpowder", num1);
			
			num1=rand.nextInt(tagsZombie[36]);
			if (num1!=tagsZombie[37]){
				if(rand.nextInt(10)<tagsZombie[38]) num1=tagsZombie[37];
			}
			itemstack.stackTagCompound.setInteger("iron", num1);
			
			num1=rand.nextInt(tagsZombie[39]);
			if (num1!=tagsZombie[40]){
				if(rand.nextInt(10)<tagsZombie[41]) num1=tagsZombie[40];
			}
			itemstack.stackTagCompound.setInteger("light", num1);
			
			num1=rand.nextInt(tagsZombie[42]);
			if (num1!=tagsZombie[43]){
				if(rand.nextInt(10)<tagsZombie[44]) num1=tagsZombie[43];
			}
			itemstack.stackTagCompound.setInteger("race", num1);
			
			num1=rand.nextInt(tagsZombie[45]);
			if (num1!=tagsZombie[46]){
				if(rand.nextInt(10)<tagsZombie[47]) num1=tagsZombie[46];
			}
			itemstack.stackTagCompound.setInteger("spring", num1);
			
			num1=rand.nextInt(tagsZombie[48]);
			if (num1!=tagsZombie[49]){
				if(rand.nextInt(10)<tagsZombie[50]) num1=tagsZombie[49];
			}
			itemstack.stackTagCompound.setInteger("sugar", num1);
			
			num1=rand.nextInt(tagsZombie[51]);
			if (num1!=tagsZombie[52]){
				if(rand.nextInt(10)<tagsZombie[53]) num1=tagsZombie[52];
			}
			itemstack.stackTagCompound.setInteger("sustenance", num1);
			
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}	
		else if(itemstack.getItem().itemID==Items.bloodBagZombiePigman.itemID){
			int num1;
			
			num1=rand.nextInt(tagsZombiePigman[0]);
			if (num1!=tagsZombiePigman[1]){
				if(rand.nextInt(10)<tagsZombiePigman[2]) num1=tagsZombiePigman[1];
			}
			itemstack.stackTagCompound.setInteger("aqua", num1);
			
			num1=rand.nextInt(tagsZombiePigman[3]);
			if (num1!=tagsZombiePigman[4]){
				if(rand.nextInt(10)<tagsZombiePigman[5]) num1=tagsZombiePigman[4];
			}
			itemstack.stackTagCompound.setInteger("archier", num1);
			
			num1=rand.nextInt(tagsZombiePigman[6]);
			if (num1!=tagsZombiePigman[7]){
				if(rand.nextInt(10)<tagsZombiePigman[8]) num1=tagsZombiePigman[7];
			}
			itemstack.stackTagCompound.setInteger("darkness", num1);
			
			num1=rand.nextInt(tagsZombiePigman[9]);
			if (num1!=tagsZombiePigman[10]){
				if(rand.nextInt(10)<tagsZombiePigman[11]) num1=tagsZombiePigman[10];
			}
			itemstack.stackTagCompound.setInteger("day", num1);
			
			num1=rand.nextInt(tagsZombiePigman[12]);
			if (num1!=tagsZombiePigman[13]){
				if(rand.nextInt(10)<tagsZombiePigman[14]) num1=tagsZombiePigman[13];
			}
			itemstack.stackTagCompound.setInteger("death", num1);
			
			num1=rand.nextInt(tagsZombiePigman[15]);
			if (num1!=tagsZombiePigman[16]){
				if(rand.nextInt(10)<tagsZombiePigman[17]) num1=tagsZombiePigman[16];
			}
			itemstack.stackTagCompound.setInteger("diamond", num1);
			
			num1=rand.nextInt(tagsZombiePigman[18]);
			if (num1!=tagsZombiePigman[19]){
				if(rand.nextInt(10)<tagsZombiePigman[20]) num1=tagsZombiePigman[19];
			}
			itemstack.stackTagCompound.setInteger("echo", num1);
			
			num1=rand.nextInt(tagsZombiePigman[21]);
			if (num1!=tagsZombiePigman[22]){
				if(rand.nextInt(10)<tagsZombiePigman[23]) num1=tagsZombiePigman[22];
			}
			itemstack.stackTagCompound.setInteger("end", num1);
			
			num1=rand.nextInt(tagsZombiePigman[24]);
			if (num1!=tagsZombiePigman[25]){
				if(rand.nextInt(10)<tagsZombiePigman[26]) num1=tagsZombiePigman[25];
			}
			itemstack.stackTagCompound.setInteger("fear", num1);
			
			num1=rand.nextInt(tagsZombiePigman[27]);
			if (num1!=tagsZombiePigman[28]){
				if(rand.nextInt(10)<tagsZombiePigman[29]) num1=tagsZombiePigman[28];
			}
			itemstack.stackTagCompound.setInteger("feather", num1);
			
			num1=rand.nextInt(tagsZombiePigman[30]);
			if (num1!=tagsZombiePigman[31]){
				if(rand.nextInt(10)<tagsZombiePigman[32]) num1=tagsZombiePigman[31];
			}
			itemstack.stackTagCompound.setInteger("flame", num1);
			
			num1=rand.nextInt(tagsZombiePigman[33]);
			if (num1!=tagsZombiePigman[34]){
				if(rand.nextInt(10)<tagsZombiePigman[35]) num1=tagsZombiePigman[34];
			}
			itemstack.stackTagCompound.setInteger("gunpowder", num1);
			
			num1=rand.nextInt(tagsZombiePigman[36]);
			if (num1!=tagsZombiePigman[37]){
				if(rand.nextInt(10)<tagsZombiePigman[38]) num1=tagsZombiePigman[37];
			}
			itemstack.stackTagCompound.setInteger("iron", num1);
			
			num1=rand.nextInt(tagsZombiePigman[39]);
			if (num1!=tagsZombiePigman[40]){
				if(rand.nextInt(10)<tagsZombiePigman[41]) num1=tagsZombiePigman[40];
			}
			itemstack.stackTagCompound.setInteger("light", num1);
			
			num1=rand.nextInt(tagsZombiePigman[42]);
			if (num1!=tagsZombiePigman[43]){
				if(rand.nextInt(10)<tagsZombiePigman[44]) num1=tagsZombiePigman[43];
			}
			itemstack.stackTagCompound.setInteger("race", num1);
			
			num1=rand.nextInt(tagsZombiePigman[45]);
			if (num1!=tagsZombiePigman[46]){
				if(rand.nextInt(10)<tagsZombiePigman[47]) num1=tagsZombiePigman[46];
			}
			itemstack.stackTagCompound.setInteger("spring", num1);
			
			num1=rand.nextInt(tagsZombiePigman[48]);
			if (num1!=tagsZombiePigman[49]){
				if(rand.nextInt(10)<tagsZombiePigman[50]) num1=tagsZombiePigman[49];
			}
			itemstack.stackTagCompound.setInteger("sugar", num1);
			
			num1=rand.nextInt(tagsZombiePigman[51]);
			if (num1!=tagsZombiePigman[52]){
				if(rand.nextInt(10)<tagsZombiePigman[53]) num1=tagsZombiePigman[52];
			}
			itemstack.stackTagCompound.setInteger("sustenance", num1);
			
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}	
		else if(itemstack.getItem().itemID==Items.bloodBagZombieVillager.itemID){
			int num1;
			
			num1=rand.nextInt(tagsZombieVillager[0]);
			if (num1!=tagsZombieVillager[1]){
				if(rand.nextInt(10)<tagsZombieVillager[2]) num1=tagsZombieVillager[1];
			}
			itemstack.stackTagCompound.setInteger("aqua", num1);
			
			num1=rand.nextInt(tagsZombieVillager[3]);
			if (num1!=tagsZombieVillager[4]){
				if(rand.nextInt(10)<tagsZombieVillager[5]) num1=tagsZombieVillager[4];
			}
			itemstack.stackTagCompound.setInteger("archier", num1);
			
			num1=rand.nextInt(tagsZombieVillager[6]);
			if (num1!=tagsZombieVillager[7]){
				if(rand.nextInt(10)<tagsZombieVillager[8]) num1=tagsZombieVillager[7];
			}
			itemstack.stackTagCompound.setInteger("darkness", num1);
			
			num1=rand.nextInt(tagsZombieVillager[9]);
			if (num1!=tagsZombieVillager[10]){
				if(rand.nextInt(10)<tagsZombieVillager[11]) num1=tagsZombieVillager[10];
			}
			itemstack.stackTagCompound.setInteger("day", num1);
			
			num1=rand.nextInt(tagsZombieVillager[12]);
			if (num1!=tagsZombieVillager[13]){
				if(rand.nextInt(10)<tagsZombieVillager[14]) num1=tagsZombieVillager[13];
			}
			itemstack.stackTagCompound.setInteger("death", num1);
			
			num1=rand.nextInt(tagsZombieVillager[15]);
			if (num1!=tagsZombieVillager[16]){
				if(rand.nextInt(10)<tagsZombieVillager[17]) num1=tagsZombieVillager[16];
			}
			itemstack.stackTagCompound.setInteger("diamond", num1);
			
			num1=rand.nextInt(tagsZombieVillager[18]);
			if (num1!=tagsZombieVillager[19]){
				if(rand.nextInt(10)<tagsZombieVillager[20]) num1=tagsZombieVillager[19];
			}
			itemstack.stackTagCompound.setInteger("echo", num1);
			
			num1=rand.nextInt(tagsZombieVillager[21]);
			if (num1!=tagsZombieVillager[22]){
				if(rand.nextInt(10)<tagsZombieVillager[23]) num1=tagsZombieVillager[22];
			}
			itemstack.stackTagCompound.setInteger("end", num1);
			
			num1=rand.nextInt(tagsZombieVillager[24]);
			if (num1!=tagsZombieVillager[25]){
				if(rand.nextInt(10)<tagsZombieVillager[26]) num1=tagsZombieVillager[25];
			}
			itemstack.stackTagCompound.setInteger("fear", num1);
			
			num1=rand.nextInt(tagsZombieVillager[27]);
			if (num1!=tagsZombieVillager[28]){
				if(rand.nextInt(10)<tagsZombieVillager[29]) num1=tagsZombieVillager[28];
			}
			itemstack.stackTagCompound.setInteger("feather", num1);
			
			num1=rand.nextInt(tagsZombieVillager[30]);
			if (num1!=tagsZombieVillager[31]){
				if(rand.nextInt(10)<tagsZombieVillager[32]) num1=tagsZombieVillager[31];
			}
			itemstack.stackTagCompound.setInteger("flame", num1);
			
			num1=rand.nextInt(tagsZombieVillager[33]);
			if (num1!=tagsZombieVillager[34]){
				if(rand.nextInt(10)<tagsZombieVillager[35]) num1=tagsZombieVillager[34];
			}
			itemstack.stackTagCompound.setInteger("gunpowder", num1);
			
			num1=rand.nextInt(tagsZombieVillager[36]);
			if (num1!=tagsZombieVillager[37]){
				if(rand.nextInt(10)<tagsZombieVillager[38]) num1=tagsZombieVillager[37];
			}
			itemstack.stackTagCompound.setInteger("iron", num1);
			
			num1=rand.nextInt(tagsZombieVillager[39]);
			if (num1!=tagsZombieVillager[40]){
				if(rand.nextInt(10)<tagsZombieVillager[41]) num1=tagsZombieVillager[40];
			}
			itemstack.stackTagCompound.setInteger("light", num1);
			
			num1=rand.nextInt(tagsZombieVillager[42]);
			if (num1!=tagsZombieVillager[43]){
				if(rand.nextInt(10)<tagsZombieVillager[44]) num1=tagsZombieVillager[43];
			}
			itemstack.stackTagCompound.setInteger("race", num1);
			
			num1=rand.nextInt(tagsZombieVillager[45]);
			if (num1!=tagsZombieVillager[46]){
				if(rand.nextInt(10)<tagsZombieVillager[47]) num1=tagsZombieVillager[46];
			}
			itemstack.stackTagCompound.setInteger("spring", num1);
			
			num1=rand.nextInt(tagsZombieVillager[48]);
			if (num1!=tagsZombieVillager[49]){
				if(rand.nextInt(10)<tagsZombieVillager[50]) num1=tagsZombieVillager[49];
			}
			itemstack.stackTagCompound.setInteger("sugar", num1);
			
			num1=rand.nextInt(tagsZombieVillager[51]);
			if (num1!=tagsZombieVillager[52]){
				if(rand.nextInt(10)<tagsZombieVillager[53]) num1=tagsZombieVillager[52];
			}
			itemstack.stackTagCompound.setInteger("sustenance", num1);
			
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}
	}
}
}
