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
			20,1,10, //Aqua
			20,1,10, //Archier
			20,1,10, //Darkness
			20,1,10, //Day / Night
			20,1,10, //Death
			20,1,10, //Diamond
			20,1,10, //Echo
			20,1,10, //End
			20,1,10, //Fear
			20,1,10, //Feather
			20,1,10, //Flame
			20,1,10, //Gunpowder
			20,1,10, //Iron
			20,1,10, //Light
			20,1,10, //Race
			20,1,10, //Spring
			20,1,10, //Sugar
			20,1,10 //Sustenance
			};	
	int[] tagsBlaze = {
			//Max (0 to this) , Influence to, % of influence 0-10
			20,0,3, //Aqua
			20,0,3, //Archier
			20,0,3, //Darkness
			20,0,3, //Day / Night
			20,0,3, //Death
			20,0,3, //Diamond
			20,0,3, //Echo
			20,0,3, //End
			20,0,3, //Fear
			20,0,3, //Feather
			20,0,3, //Flame
			20,0,3, //Gunpowder
			20,0,3, //Iron
			20,0,3, //Light
			20,0,3, //Race
			20,0,3, //Spring
			20,0,3, //Sugar
			20,0,3 //Sustenance
			};	
	int[] tagsCaveSpider = {
			//Max (0 to this) , Influence to, % of influence 0-10
			20,0,3, //Aqua
			20,0,3, //Archier
			20,0,3, //Darkness
			20,0,3, //Day / Night
			20,0,3, //Death
			20,0,3, //Diamond
			20,0,3, //Echo
			20,0,3, //End
			20,0,3, //Fear
			20,0,3, //Feather
			20,0,3, //Flame
			20,0,3, //Gunpowder
			20,0,3, //Iron
			20,0,3, //Light
			20,0,3, //Race
			20,0,3, //Spring
			20,0,3, //Sugar
			20,0,3 //Sustenance
			};	
	int[] tagsChicken = {
			//Max (0 to this) , Influence to, % of influence 0-10
			20,0,3, //Aqua
			20,0,3, //Archier
			20,0,3, //Darkness
			20,0,3, //Day / Night
			20,0,3, //Death
			20,0,3, //Diamond
			20,0,3, //Echo
			20,0,3, //End
			20,0,3, //Fear
			20,0,3, //Feather
			20,0,3, //Flame
			20,0,3, //Gunpowder
			20,0,3, //Iron
			20,0,3, //Light
			20,0,3, //Race
			20,0,3, //Spring
			20,0,3, //Sugar
			20,0,3 //Sustenance
			};	
	int[] tagsCow = {
			//Max (0 to this) , Influence to, % of influence 0-10
			20,0,3, //Aqua
			20,0,3, //Archier
			20,0,3, //Darkness
			20,0,3, //Day / Night
			20,0,3, //Death
			20,0,3, //Diamond
			20,0,3, //Echo
			20,0,3, //End
			20,0,3, //Fear
			20,0,3, //Feather
			20,0,3, //Flame
			20,0,3, //Gunpowder
			20,0,3, //Iron
			20,0,3, //Light
			20,0,3, //Race
			20,0,3, //Spring
			20,0,3, //Sugar
			20,0,3 //Sustenance
			};	
	int[] tagsCreeper = {
			//Max (0 to this) , Influence to, % of influence 0-10
			20,0,3, //Aqua
			20,0,3, //Archier
			20,0,3, //Darkness
			20,0,3, //Day / Night
			20,0,3, //Death
			20,0,3, //Diamond
			20,0,3, //Echo
			20,0,3, //End
			20,0,3, //Fear
			20,0,3, //Feather
			20,0,3, //Flame
			20,0,3, //Gunpowder
			20,0,3, //Iron
			20,0,3, //Light
			20,0,3, //Race
			20,0,3, //Spring
			20,0,3, //Sugar
			20,0,3 //Sustenance
			};	
	int[] tagsEnderDragon = {
			//Max (0 to this) , Influence to, % of influence 0-10
			20,0,3, //Aqua
			20,0,3, //Archier
			20,0,3, //Darkness
			20,0,3, //Day / Night
			20,0,3, //Death
			20,0,3, //Diamond
			20,0,3, //Echo
			20,0,3, //End
			20,0,3, //Fear
			20,0,3, //Feather
			20,0,3, //Flame
			20,0,3, //Gunpowder
			20,0,3, //Iron
			20,0,3, //Light
			20,0,3, //Race
			20,0,3, //Spring
			20,0,3, //Sugar
			20,0,3 //Sustenance
			};	
	int[] tagsEnderman = {
			//Max (0 to this) , Influence to, % of influence 0-10
			20,0,3, //Aqua
			20,0,3, //Archier
			20,0,3, //Darkness
			20,0,3, //Day / Night
			20,0,3, //Death
			20,0,3, //Diamond
			20,0,3, //Echo
			20,0,3, //End
			20,0,3, //Fear
			20,0,3, //Feather
			20,0,3, //Flame
			20,0,3, //Gunpowder
			20,0,3, //Iron
			20,0,3, //Light
			20,0,3, //Race
			20,0,3, //Spring
			20,0,3, //Sugar
			20,0,3 //Sustenance
			};	
	int[] tagsGhast = {
			//Max (0 to this) , Influence to, % of influence 0-10
			20,0,3, //Aqua
			20,0,3, //Archier
			20,0,3, //Darkness
			20,0,3, //Day / Night
			20,0,3, //Death
			20,0,3, //Diamond
			20,0,3, //Echo
			20,0,3, //End
			20,0,3, //Fear
			20,0,3, //Feather
			20,0,3, //Flame
			20,0,3, //Gunpowder
			20,0,3, //Iron
			20,0,3, //Light
			20,0,3, //Race
			20,0,3, //Spring
			20,0,3, //Sugar
			20,0,3 //Sustenance
			};	
	int[] tagsHorse = {
			//Max (0 to this) , Influence to, % of influence 0-10
			20,0,3, //Aqua
			20,0,3, //Archier
			20,0,3, //Darkness
			20,0,3, //Day / Night
			20,0,3, //Death
			20,0,3, //Diamond
			20,0,3, //Echo
			20,0,3, //End
			20,0,3, //Fear
			20,0,3, //Feather
			20,0,3, //Flame
			20,0,3, //Gunpowder
			20,0,3, //Iron
			20,0,3, //Light
			20,0,3, //Race
			20,0,3, //Spring
			20,0,3, //Sugar
			20,0,3 //Sustenance
			};	
	int[] tagsIronGolem = {
			//Max (0 to this) , Influence to, % of influence 0-10
			20,0,3, //Aqua
			20,0,3, //Archier
			20,0,3, //Darkness
			20,0,3, //Day / Night
			20,0,3, //Death
			20,0,3, //Diamond
			20,0,3, //Echo
			20,0,3, //End
			20,0,3, //Fear
			20,0,3, //Feather
			20,0,3, //Flame
			20,0,3, //Gunpowder
			20,0,3, //Iron
			20,0,3, //Light
			20,0,3, //Race
			20,0,3, //Spring
			20,0,3, //Sugar
			20,0,3 //Sustenance
			};	
	int[] tagsMagmaCube = {
			//Max (0 to this) , Influence to, % of influence 0-10
			20,0,3, //Aqua
			20,0,3, //Archier
			20,0,3, //Darkness
			20,0,3, //Day / Night
			20,0,3, //Death
			20,0,3, //Diamond
			20,0,3, //Echo
			20,0,3, //End
			20,0,3, //Fear
			20,0,3, //Feather
			20,0,3, //Flame
			20,0,3, //Gunpowder
			20,0,3, //Iron
			20,0,3, //Light
			20,0,3, //Race
			20,0,3, //Spring
			20,0,3, //Sugar
			20,0,3 //Sustenance
			};	
	int[] tagsMooshroom = {
			//Max (0 to this) , Influence to, % of influence 0-10
			20,0,3, //Aqua
			20,0,3, //Archier
			20,0,3, //Darkness
			20,0,3, //Day / Night
			20,0,3, //Death
			20,0,3, //Diamond
			20,0,3, //Echo
			20,0,3, //End
			20,0,3, //Fear
			20,0,3, //Feather
			20,0,3, //Flame
			20,0,3, //Gunpowder
			20,0,3, //Iron
			20,0,3, //Light
			20,0,3, //Race
			20,0,3, //Spring
			20,0,3, //Sugar
			20,0,3 //Sustenance
			};	
	int[] tagsOcelot = {
			//Max (0 to this) , Influence to, % of influence 0-10
			20,0,3, //Aqua
			20,0,3, //Archier
			20,0,3, //Darkness
			20,0,3, //Day / Night
			20,0,3, //Death
			20,0,3, //Diamond
			20,0,3, //Echo
			20,0,3, //End
			20,0,3, //Fear
			20,0,3, //Feather
			20,0,3, //Flame
			20,0,3, //Gunpowder
			20,0,3, //Iron
			20,0,3, //Light
			20,0,3, //Race
			20,0,3, //Spring
			20,0,3, //Sugar
			20,0,3 //Sustenance
			};	
	int[] tagsPig = {
			//Max (0 to this) , Influence to, % of influence 0-10
			20,0,3, //Aqua
			20,0,3, //Archier
			20,0,3, //Darkness
			20,0,3, //Day / Night
			20,0,3, //Death
			20,0,3, //Diamond
			20,0,3, //Echo
			20,0,3, //End
			20,0,3, //Fear
			20,0,3, //Feather
			20,0,3, //Flame
			20,0,3, //Gunpowder
			20,0,3, //Iron
			20,0,3, //Light
			20,0,3, //Race
			20,0,3, //Spring
			20,0,3, //Sugar
			20,0,3 //Sustenance
			};	
	int[] tagsSheep = {
			//Max (0 to this) , Influence to, % of influence 0-10
			20,0,3, //Aqua
			20,0,3, //Archier
			20,0,3, //Darkness
			20,0,3, //Day / Night
			20,0,3, //Death
			20,0,3, //Diamond
			20,0,3, //Echo
			20,0,3, //End
			20,0,3, //Fear
			20,0,3, //Feather
			20,0,3, //Flame
			20,0,3, //Gunpowder
			20,0,3, //Iron
			20,0,3, //Light
			20,0,3, //Race
			20,0,3, //Spring
			20,0,3, //Sugar
			20,0,3 //Sustenance
			};	
	int[] tagsSilverfish = {
			//Max (0 to this) , Influence to, % of influence 0-10
			20,0,3, //Aqua
			20,0,3, //Archier
			20,0,3, //Darkness
			20,0,3, //Day / Night
			20,0,3, //Death
			20,0,3, //Diamond
			20,0,3, //Echo
			20,0,3, //End
			20,0,3, //Fear
			20,0,3, //Feather
			20,0,3, //Flame
			20,0,3, //Gunpowder
			20,0,3, //Iron
			20,0,3, //Light
			20,0,3, //Race
			20,0,3, //Spring
			20,0,3, //Sugar
			20,0,3 //Sustenance
			};	
	int[] tagsSkeleton = {
			//Max (0 to this) , Influence to, % of influence 0-10
			20,0,3, //Aqua
			20,0,3, //Archier
			20,0,3, //Darkness
			20,0,3, //Day / Night
			20,0,3, //Death
			20,0,3, //Diamond
			20,0,3, //Echo
			20,0,3, //End
			20,0,3, //Fear
			20,0,3, //Feather
			20,0,3, //Flame
			20,0,3, //Gunpowder
			20,0,3, //Iron
			20,0,3, //Light
			20,0,3, //Race
			20,0,3, //Spring
			20,0,3, //Sugar
			20,0,3 //Sustenance
			};	
	int[] tagsSlime = {
			//Max (0 to this) , Influence to, % of influence 0-10
			20,0,3, //Aqua
			20,0,3, //Archier
			20,0,3, //Darkness
			20,0,3, //Day / Night
			20,0,3, //Death
			20,0,3, //Diamond
			20,0,3, //Echo
			20,0,3, //End
			20,0,3, //Fear
			20,0,3, //Feather
			20,0,3, //Flame
			20,0,3, //Gunpowder
			20,0,3, //Iron
			20,0,3, //Light
			20,0,3, //Race
			20,0,3, //Spring
			20,0,3, //Sugar
			20,0,3 //Sustenance
			};	
	int[] tagsSnowGolem = {
			//Max (0 to this) , Influence to, % of influence 0-10
			20,0,3, //Aqua
			20,0,3, //Archier
			20,0,3, //Darkness
			20,0,3, //Day / Night
			20,0,3, //Death
			20,0,3, //Diamond
			20,0,3, //Echo
			20,0,3, //End
			20,0,3, //Fear
			20,0,3, //Feather
			20,0,3, //Flame
			20,0,3, //Gunpowder
			20,0,3, //Iron
			20,0,3, //Light
			20,0,3, //Race
			20,0,3, //Spring
			20,0,3, //Sugar
			20,0,3 //Sustenance
			};	
	int[] tagsSpider = {
			//Max (0 to this) , Influence to, % of influence 0-10
			20,0,3, //Aqua
			20,0,3, //Archier
			20,0,3, //Darkness
			20,0,3, //Day / Night
			20,0,3, //Death
			20,0,3, //Diamond
			20,0,3, //Echo
			20,0,3, //End
			20,0,3, //Fear
			20,0,3, //Feather
			20,0,3, //Flame
			20,0,3, //Gunpowder
			20,0,3, //Iron
			20,0,3, //Light
			20,0,3, //Race
			20,0,3, //Spring
			20,0,3, //Sugar
			20,0,3 //Sustenance
			};	
	int[] tagsSquid = {
			//Max (0 to this) , Influence to, % of influence 0-10
			20,0,3, //Aqua
			20,0,3, //Archier
			20,0,3, //Darkness
			20,0,3, //Day / Night
			20,0,3, //Death
			20,0,3, //Diamond
			20,0,3, //Echo
			20,0,3, //End
			20,0,3, //Fear
			20,0,3, //Feather
			20,0,3, //Flame
			20,0,3, //Gunpowder
			20,0,3, //Iron
			20,0,3, //Light
			20,0,3, //Race
			20,0,3, //Spring
			20,0,3, //Sugar
			20,0,3 //Sustenance
			};	
	int[] tagsVillager = {
			//Max (0 to this) , Influence to, % of influence 0-10
			20,0,3, //Aqua
			20,0,3, //Archier
			20,0,3, //Darkness
			20,0,3, //Day / Night
			20,0,3, //Death
			20,0,3, //Diamond
			20,0,3, //Echo
			20,0,3, //End
			20,0,3, //Fear
			20,0,3, //Feather
			20,0,3, //Flame
			20,0,3, //Gunpowder
			20,0,3, //Iron
			20,0,3, //Light
			20,0,3, //Race
			20,0,3, //Spring
			20,0,3, //Sugar
			20,0,3 //Sustenance
			};	
	int[] tagsWitch = {
			//Max (0 to this) , Influence to, % of influence 0-10
			20,0,3, //Aqua
			20,0,3, //Archier
			20,0,3, //Darkness
			20,0,3, //Day / Night
			20,0,3, //Death
			20,0,3, //Diamond
			20,0,3, //Echo
			20,0,3, //End
			20,0,3, //Fear
			20,0,3, //Feather
			20,0,3, //Flame
			20,0,3, //Gunpowder
			20,0,3, //Iron
			20,0,3, //Light
			20,0,3, //Race
			20,0,3, //Spring
			20,0,3, //Sugar
			20,0,3 //Sustenance
			};	
	int[] tagsWither = {
			//Max (0 to this) , Influence to, % of influence 0-10
			20,0,3, //Aqua
			20,0,3, //Archier
			20,0,3, //Darkness
			20,0,3, //Day / Night
			20,0,3, //Death
			20,0,3, //Diamond
			20,0,3, //Echo
			20,0,3, //End
			20,0,3, //Fear
			20,0,3, //Feather
			20,0,3, //Flame
			20,0,3, //Gunpowder
			20,0,3, //Iron
			20,0,3, //Light
			20,0,3, //Race
			20,0,3, //Spring
			20,0,3, //Sugar
			20,0,3 //Sustenance
			};	
	int[] tagsWitherSkeleton = {
			//Max (0 to this) , Influence to, % of influence 0-10
			20,0,3, //Aqua
			20,0,3, //Archier
			20,0,3, //Darkness
			20,0,3, //Day / Night
			20,0,3, //Death
			20,0,3, //Diamond
			20,0,3, //Echo
			20,0,3, //End
			20,0,3, //Fear
			20,0,3, //Feather
			20,0,3, //Flame
			20,0,3, //Gunpowder
			20,0,3, //Iron
			20,0,3, //Light
			20,0,3, //Race
			20,0,3, //Spring
			20,0,3, //Sugar
			20,0,3 //Sustenance
			};	
	int[] tagsWolf = {
			//Max (0 to this) , Influence to, % of influence 0-10
			20,0,3, //Aqua
			20,0,3, //Archier
			20,0,3, //Darkness
			20,0,3, //Day / Night
			20,0,3, //Death
			20,0,3, //Diamond
			20,0,3, //Echo
			20,0,3, //End
			20,0,3, //Fear
			20,0,3, //Feather
			20,0,3, //Flame
			20,0,3, //Gunpowder
			20,0,3, //Iron
			20,0,3, //Light
			20,0,3, //Race
			20,0,3, //Spring
			20,0,3, //Sugar
			20,0,3 //Sustenance
			};
	int[] tagsZombie = {
			//Max (0 to this) , Influence to, % of influence 0-10
			20,0,3, //Aqua
			20,0,3, //Archier
			20,0,3, //Darkness
			20,0,3, //Day / Night
			20,0,3, //Death
			20,0,3, //Diamond
			20,0,3, //Echo
			20,0,3, //End
			20,0,3, //Fear
			20,0,3, //Feather
			20,0,3, //Flame
			20,0,3, //Gunpowder
			20,0,3, //Iron
			20,0,3, //Light
			20,0,3, //Race
			20,0,3, //Spring
			20,0,3, //Sugar
			20,0,3 //Sustenance
			};
	int[] tagsZombiePigman = {
			//Max (0 to this) , Influence to, % of influence 0-10
			20,0,3, //Aqua
			20,0,3, //Archier
			20,0,3, //Darkness
			20,0,3, //Day / Night
			20,0,3, //Death
			20,0,3, //Diamond
			20,0,3, //Echo
			20,0,3, //End
			20,0,3, //Fear
			20,0,3, //Feather
			20,0,3, //Flame
			20,0,3, //Gunpowder
			20,0,3, //Iron
			20,0,3, //Light
			20,0,3, //Race
			20,0,3, //Spring
			20,0,3, //Sugar
			20,0,3 //Sustenance
			};
	int[] tagsZombieVillager = {
			//Max (0 to this) , Influence to, % of influence 0-10
			20,0,3, //Aqua
			20,0,3, //Archier
			20,0,3, //Darkness
			20,0,3, //Day / Night
			20,0,3, //Death
			20,0,3, //Diamond
			20,0,3, //Echo
			20,0,3, //End
			20,0,3, //Fear
			20,0,3, //Feather
			20,0,3, //Flame
			20,0,3, //Gunpowder
			20,0,3, //Iron
			20,0,3, //Light
			20,0,3, //Race
			20,0,3, //Spring
			20,0,3, //Sugar
			20,0,3 //Sustenance
			};
	
		
		if(itemstack.getItem().itemID==Items.bloodBagBat.itemID){
			int num1;
			int[] tags=tagsBat;
			for(int o=1;o<=itemstack.getItemDamage();o++){
				for(int i=0;i<18;i++){
					num1=rand.nextInt(tags[i*3]);
					if (num1!=tags[i*3+1]){
						if(rand.nextInt(10)<tags[i*3+2]) num1=tags[i*3+1];
					}
					itemstack.stackTagCompound.setInteger(o+"particle"+i, num1);
				}
			}
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}
		else if(itemstack.getItem().itemID==Items.bloodBagBlaze.itemID){
			int num1;
			int[] tags=tagsBlaze;
			for(int o=1;o<=itemstack.getItemDamage();o++){
				for(int i=0;i<18;i++){
					num1=rand.nextInt(tags[i*3]);
					if (num1!=tags[i*3+1]){
						if(rand.nextInt(10)<tags[i*3+2]) num1=tags[i*3+1];
					}
					itemstack.stackTagCompound.setInteger(o+"particle"+i, num1);
				}
			}
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}
		else if(itemstack.getItem().itemID==Items.bloodBagCaveSpider.itemID){
			int num1;
			int[] tags=tagsCaveSpider;
			for(int o=1;o<=itemstack.getItemDamage();o++){
				for(int i=0;i<18;i++){
					num1=rand.nextInt(tags[i*3]);
					if (num1!=tags[i*3+1]){
						if(rand.nextInt(10)<tags[i*3+2]) num1=tags[i*3+1];
					}
					itemstack.stackTagCompound.setInteger(o+"particle"+i, num1);
				}
			}
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}
		else if(itemstack.getItem().itemID==Items.bloodBagChicken.itemID){
			int num1;
			int[] tags=tagsChicken;
			for(int o=1;o<=itemstack.getItemDamage();o++){
				for(int i=0;i<18;i++){
					num1=rand.nextInt(tags[i*3]);
					if (num1!=tags[i*3+1]){
						if(rand.nextInt(10)<tags[i*3+2]) num1=tags[i*3+1];
					}
					itemstack.stackTagCompound.setInteger(o+"particle"+i, num1);
				}
			}
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}
		else if(itemstack.getItem().itemID==Items.bloodBagCow.itemID){
			int num1;
			int[] tags=tagsCow;
			for(int o=1;o<=itemstack.getItemDamage();o++){
				for(int i=0;i<18;i++){
					num1=rand.nextInt(tags[i*3]);
					if (num1!=tags[i*3+1]){
						if(rand.nextInt(10)<tags[i*3+2]) num1=tags[i*3+1];
					}
					itemstack.stackTagCompound.setInteger(o+"particle"+i, num1);
				}
			}
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}
		else if(itemstack.getItem().itemID==Items.bloodBagCreeper.itemID){
			int num1;
			int[] tags=tagsCreeper;
			for(int o=1;o<=itemstack.getItemDamage();o++){
				for(int i=0;i<18;i++){
					num1=rand.nextInt(tags[i*3]);
					if (num1!=tags[i*3+1]){
						if(rand.nextInt(10)<tags[i*3+2]) num1=tags[i*3+1];
					}
					itemstack.stackTagCompound.setInteger(o+"particle"+i, num1);
				}
			}
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}
		else if(itemstack.getItem().itemID==Items.bloodBagEnderDragon.itemID){
			int num1;
			int[] tags=tagsEnderDragon;
			for(int o=1;o<=itemstack.getItemDamage();o++){
				for(int i=0;i<18;i++){
					num1=rand.nextInt(tags[i*3]);
					if (num1!=tags[i*3+1]){
						if(rand.nextInt(10)<tags[i*3+2]) num1=tags[i*3+1];
					}
					itemstack.stackTagCompound.setInteger(o+"particle"+i, num1);
				}
			}
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}
		else if(itemstack.getItem().itemID==Items.bloodBagEnderman.itemID){
			int num1;
			int[] tags=tagsEnderman;
			for(int o=1;o<=itemstack.getItemDamage();o++){
				for(int i=0;i<18;i++){
					num1=rand.nextInt(tags[i*3]);
					if (num1!=tags[i*3+1]){
						if(rand.nextInt(10)<tags[i*3+2]) num1=tags[i*3+1];
					}
					itemstack.stackTagCompound.setInteger(o+"particle"+i, num1);
				}
			}
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}
		else if(itemstack.getItem().itemID==Items.bloodBagGhast.itemID){
			int num1;
			int[] tags=tagsGhast;
			for(int o=1;o<=itemstack.getItemDamage();o++){
				for(int i=0;i<18;i++){
					num1=rand.nextInt(tags[i*3]);
					if (num1!=tags[i*3+1]){
						if(rand.nextInt(10)<tags[i*3+2]) num1=tags[i*3+1];
					}
					itemstack.stackTagCompound.setInteger(o+"particle"+i, num1);
				}
			}
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}
		else if(itemstack.getItem().itemID==Items.bloodBagHorse.itemID){
			int num1;
			int[] tags=tagsHorse;
			for(int o=1;o<=itemstack.getItemDamage();o++){
				for(int i=0;i<18;i++){
					num1=rand.nextInt(tags[i*3]);
					if (num1!=tags[i*3+1]){
						if(rand.nextInt(10)<tags[i*3+2]) num1=tags[i*3+1];
					}
					itemstack.stackTagCompound.setInteger(o+"particle"+i, num1);
				}
			}
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}
		else if(itemstack.getItem().itemID==Items.bloodBagIronGolem.itemID){
			int num1;
			int[] tags=tagsIronGolem;
			for(int o=1;o<=itemstack.getItemDamage();o++){
				for(int i=0;i<18;i++){
					num1=rand.nextInt(tags[i*3]);
					if (num1!=tags[i*3+1]){
						if(rand.nextInt(10)<tags[i*3+2]) num1=tags[i*3+1];
					}
					itemstack.stackTagCompound.setInteger(o+"particle"+i, num1);
				}
			}
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}
		else if(itemstack.getItem().itemID==Items.bloodBagMagmaCube.itemID){
			int num1;
			int[] tags=tagsMagmaCube;
			for(int o=1;o<=itemstack.getItemDamage();o++){
				for(int i=0;i<18;i++){
					num1=rand.nextInt(tags[i*3]);
					if (num1!=tags[i*3+1]){
						if(rand.nextInt(10)<tags[i*3+2]) num1=tags[i*3+1];
					}
					itemstack.stackTagCompound.setInteger(o+"particle"+i, num1);
				}
			}
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}
		else if(itemstack.getItem().itemID==Items.bloodBagMooshroom.itemID){
			int num1;
			int[] tags=tagsMooshroom;
			for(int o=1;o<=itemstack.getItemDamage();o++){
				for(int i=0;i<18;i++){
					num1=rand.nextInt(tags[i*3]);
					if (num1!=tags[i*3+1]){
						if(rand.nextInt(10)<tags[i*3+2]) num1=tags[i*3+1];
					}
					itemstack.stackTagCompound.setInteger(o+"particle"+i, num1);
				}
			}
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}
		else if(itemstack.getItem().itemID==Items.bloodBagOcelot.itemID){
			int num1;
			int[] tags=tagsOcelot;
			for(int o=1;o<=itemstack.getItemDamage();o++){
				for(int i=0;i<18;i++){
					num1=rand.nextInt(tags[i*3]);
					if (num1!=tags[i*3+1]){
						if(rand.nextInt(10)<tags[i*3+2]) num1=tags[i*3+1];
					}
					itemstack.stackTagCompound.setInteger(o+"particle"+i, num1);
				}
			}
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}
		else if(itemstack.getItem().itemID==Items.bloodBagPig.itemID){
			int num1;
			int[] tags=tagsPig;
			for(int o=1;o<=itemstack.getItemDamage();o++){
				for(int i=0;i<18;i++){
					num1=rand.nextInt(tags[i*3]);
					if (num1!=tags[i*3+1]){
						if(rand.nextInt(10)<tags[i*3+2]) num1=tags[i*3+1];
					}
					itemstack.stackTagCompound.setInteger(o+"particle"+i, num1);
				}
			}
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}
		else if(itemstack.getItem().itemID==Items.bloodBagSheep.itemID){
			int num1;
			int[] tags=tagsSheep;
			for(int o=1;o<=itemstack.getItemDamage();o++){
				for(int i=0;i<18;i++){
					num1=rand.nextInt(tags[i*3]);
					if (num1!=tags[i*3+1]){
						if(rand.nextInt(10)<tags[i*3+2]) num1=tags[i*3+1];
					}
					itemstack.stackTagCompound.setInteger(o+"particle"+i, num1);
				}
			}
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}
		else if(itemstack.getItem().itemID==Items.bloodBagSilverfish.itemID){
			int num1;
			int[] tags=tagsSilverfish;
			for(int o=1;o<=itemstack.getItemDamage();o++){
				for(int i=0;i<18;i++){
					num1=rand.nextInt(tags[i*3]);
					if (num1!=tags[i*3+1]){
						if(rand.nextInt(10)<tags[i*3+2]) num1=tags[i*3+1];
					}
					itemstack.stackTagCompound.setInteger(o+"particle"+i, num1);
				}
			}
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}
		else if(itemstack.getItem().itemID==Items.bloodBagSkeleton.itemID){
			int num1;
			int[] tags=tagsSkeleton;
			for(int o=1;o<=itemstack.getItemDamage();o++){
				for(int i=0;i<18;i++){
					num1=rand.nextInt(tags[i*3]);
					if (num1!=tags[i*3+1]){
						if(rand.nextInt(10)<tags[i*3+2]) num1=tags[i*3+1];
					}
					itemstack.stackTagCompound.setInteger(o+"particle"+i, num1);
				}
			}
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}
		else if(itemstack.getItem().itemID==Items.bloodBagSlime.itemID){
			int num1;
			int[] tags=tagsSlime;
			for(int o=1;o<=itemstack.getItemDamage();o++){
				for(int i=0;i<18;i++){
					num1=rand.nextInt(tags[i*3]);
					if (num1!=tags[i*3+1]){
						if(rand.nextInt(10)<tags[i*3+2]) num1=tags[i*3+1];
					}
					itemstack.stackTagCompound.setInteger(o+"particle"+i, num1);
				}
			}
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}
		else if(itemstack.getItem().itemID==Items.bloodBagSnowGolem.itemID){
			int num1;
			int[] tags=tagsSnowGolem;
			for(int o=1;o<=itemstack.getItemDamage();o++){
				for(int i=0;i<18;i++){
					num1=rand.nextInt(tags[i*3]);
					if (num1!=tags[i*3+1]){
						if(rand.nextInt(10)<tags[i*3+2]) num1=tags[i*3+1];
					}
					itemstack.stackTagCompound.setInteger(o+"particle"+i, num1);
				}
			}
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}
		else if(itemstack.getItem().itemID==Items.bloodBagSpider.itemID){
			int num1;
			int[] tags=tagsSpider;
			for(int o=1;o<=itemstack.getItemDamage();o++){
				for(int i=0;i<18;i++){
					num1=rand.nextInt(tags[i*3]);
					if (num1!=tags[i*3+1]){
						if(rand.nextInt(10)<tags[i*3+2]) num1=tags[i*3+1];
					}
					itemstack.stackTagCompound.setInteger(o+"particle"+i, num1);
				}
			}
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}
		else if(itemstack.getItem().itemID==Items.bloodBagSquid.itemID){
			int num1;
			int[] tags=tagsSquid;
			for(int o=1;o<=itemstack.getItemDamage();o++){
				for(int i=0;i<18;i++){
					num1=rand.nextInt(tags[i*3]);
					if (num1!=tags[i*3+1]){
						if(rand.nextInt(10)<tags[i*3+2]) num1=tags[i*3+1];
					}
					itemstack.stackTagCompound.setInteger(o+"particle"+i, num1);
				}
			}
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}
		else if(itemstack.getItem().itemID==Items.bloodBagVillager.itemID){
			int num1;
			int[] tags=tagsVillager;
			for(int o=1;o<=itemstack.getItemDamage();o++){
				for(int i=0;i<18;i++){
					num1=rand.nextInt(tags[i*3]);
					if (num1!=tags[i*3+1]){
						if(rand.nextInt(10)<tags[i*3+2]) num1=tags[i*3+1];
					}
					itemstack.stackTagCompound.setInteger(o+"particle"+i, num1);
				}
			}
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}
		else if(itemstack.getItem().itemID==Items.bloodBagWitch.itemID){
			int num1;
			int[] tags=tagsWitch;
			for(int o=1;o<=itemstack.getItemDamage();o++){
				for(int i=0;i<18;i++){
					num1=rand.nextInt(tags[i*3]);
					if (num1!=tags[i*3+1]){
						if(rand.nextInt(10)<tags[i*3+2]) num1=tags[i*3+1];
					}
					itemstack.stackTagCompound.setInteger(o+"particle"+i, num1);
				}
			}
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}
		else if(itemstack.getItem().itemID==Items.bloodBagWither.itemID){
			int num1;
			int[] tags=tagsWither;
			for(int o=1;o<=itemstack.getItemDamage();o++){
				for(int i=0;i<18;i++){
					num1=rand.nextInt(tags[i*3]);
					if (num1!=tags[i*3+1]){
						if(rand.nextInt(10)<tags[i*3+2]) num1=tags[i*3+1];
					}
					itemstack.stackTagCompound.setInteger(o+"particle"+i, num1);
				}
			}
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}
		else if(itemstack.getItem().itemID==Items.bloodBagWitherSkeleton.itemID){
			int num1;
			int[] tags=tagsWitherSkeleton;
			for(int o=1;o<=itemstack.getItemDamage();o++){
				for(int i=0;i<18;i++){
					num1=rand.nextInt(tags[i*3]);
					if (num1!=tags[i*3+1]){
						if(rand.nextInt(10)<tags[i*3+2]) num1=tags[i*3+1];
					}
					itemstack.stackTagCompound.setInteger(o+"particle"+i, num1);
				}
			}
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}
		else if(itemstack.getItem().itemID==Items.bloodBagWolf.itemID){
			int num1;
			int[] tags=tagsWolf;
			for(int o=1;o<=itemstack.getItemDamage();o++){
				for(int i=0;i<18;i++){
					num1=rand.nextInt(tags[i*3]);
					if (num1!=tags[i*3+1]){
						if(rand.nextInt(10)<tags[i*3+2]) num1=tags[i*3+1];
					}
					itemstack.stackTagCompound.setInteger(o+"particle"+i, num1);
				}
			}
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}
		else if(itemstack.getItem().itemID==Items.bloodBagZombie.itemID){
			int num1;
			int[] tags=tagsZombie;
			for(int o=1;o<=itemstack.getItemDamage();o++){
				for(int i=0;i<18;i++){
					num1=rand.nextInt(tags[i*3]);
					if (num1!=tags[i*3+1]){
						if(rand.nextInt(10)<tags[i*3+2]) num1=tags[i*3+1];
					}
					itemstack.stackTagCompound.setInteger(o+"particle"+i, num1);
				}
			}
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}
		else if(itemstack.getItem().itemID==Items.bloodBagZombiePigman.itemID){
			int num1;
			int[] tags=tagsZombiePigman;
			for(int o=1;o<=itemstack.getItemDamage();o++){
				for(int i=0;i<18;i++){
					num1=rand.nextInt(tags[i*3]);
					if (num1!=tags[i*3+1]){
						if(rand.nextInt(10)<tags[i*3+2]) num1=tags[i*3+1];
					}
					itemstack.stackTagCompound.setInteger(o+"particle"+i, num1);
				}
			}
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}
		else if(itemstack.getItem().itemID==Items.bloodBagZombieVillager.itemID){
			int num1;
			int[] tags=tagsZombieVillager;
			for(int o=1;o<=itemstack.getItemDamage();o++){
				for(int i=0;i<18;i++){
					num1=rand.nextInt(tags[i*3]);
					if (num1!=tags[i*3+1]){
						if(rand.nextInt(10)<tags[i*3+2]) num1=tags[i*3+1];
					}
					itemstack.stackTagCompound.setInteger(o+"particle"+i, num1);
				}
			}
			itemstack.stackTagCompound.setBoolean("analyzed", true);
		}
	}
}
}
