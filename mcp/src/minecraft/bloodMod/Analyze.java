package bloodMod;

import java.lang.reflect.Array;
import java.util.Random;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import bloodMod.items.Items;

public class Analyze {
	
	public static int GetTickness(ItemStack itemstack, int level){
		int value = 0;
		int[] thickness = {
			0, //aqua,
			0, //archier,
			0, //darkness,
			0, //time,
			0, //death,
			0, //diamond,
			0, //echo,
			0, //end,
			0, //fear,
			0, //feather,
			0, //flame,
			0, //gunpowder,
			0, //iron,
			0, //light,
			0, //race,
			0, //spring,
			0, //sugar,
			0, //sustenance
		};
		String[] names = {"aqua","archier","darkness","time","death","diamond","echo","end","fear","feather","flame","gunpowder","iron","light","race","spring","sugar","sustenance"};
		
		for(int i=0;i<names.length;i++){
			value += itemstack.getTagCompound().getInteger(names[i])*thickness[i];
		}
		return value;
	}
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
				0,0,0, //Aqua
				1,0,0, //Archier
				0,0,0, //Darkness
				0,0,0, //Time
				0,0,0, //Death
				0,0,0, //Diamond
				5,4,4, //Echo
				0,0,0, //End
				1,0,6, //Fear
				2,2,4, //Feather
				1,0,2, //Flame
				0,0,0, //Gunpowder
				1,0,0, //Iron
				0,0,0, //Light
				1,0,0, //Race
				0,0,0, //Spring
				2,0,0, //Sugar
				1,0,6 //Sustenance
				};	
		int[] tagsBlaze = {
				//Max (0 to this) , Influence to, % of influence 0-10
				0,0,0, //Aqua
				2,1,5, //Archier
				0,0,0, //Darkness
				2,0,0, //Time
				0,0,0, //Death
				0,0,0, //Diamond
				0,0,0, //Echo
				0,0,0, //End
				1,0,0, //Fear
				0,0,0, //Feather
				3,2,6, //Flame
				2,1,2, //Gunpowder
				1,0,0, //Iron
				0,0,0, //Light
				1,0,2, //Race
				1,0,0, //Spring
				1,0,0, //Sugar
				0,0,0 //Sustenance
				};	
		int[] tagsCaveSpider = {
				//Max (0 to this) , Influence to, % of influence 0-10
				0,0,0, //Aqua
				0,0,0, //Archier
				0,0,0, //Darkness
				0,0,0, //Time
				0,0,0, //Death
				0,0,0, //Diamond
				0,0,0, //Echo
				0,0,0, //End
				1,0,0, //Fear
				0,0,0, //Feather
				0,0,0, //Flame
				0,0,0, //Gunpowder
				1,0,0, //Iron
				0,0,0, //Light
				2,1,5, //Race
				2,0,0, //Spring
				1,0,0, //Sugar
				0,0,0 //Sustenance
				};	
		int[] tagsChicken = {
				//Max (0 to this) , Influence to, % of influence 0-10
				0,0,0, //Aqua
				0,0,0, //Archier
				0,0,0, //Darkness
				0,0,0, //Time
				0,0,0, //Death
				0,0,0, //Diamond
				0,0,0, //Echo
				0,0,0, //End
				0,0,0, //Fear
				2,1,5, //Feather
				0,0,0, //Flame
				0,0,0, //Gunpowder
				1,0,0, //Iron
				0,0,0, //Light
				1,0,0, //Race
				1,0,0, //Spring
				2,0,0, //Sugar
				2,1,2 //Sustenance
				};	
		int[] tagsCow = {
				//Max (0 to this) , Influence to, % of influence 0-10
				1,0,6, //Aqua
				0,0,0, //Archier
				0,0,0, //Darkness
				0,0,0, //Time
				0,0,0, //Death
				0,0,0, //Diamond
				0,0,0, //Echo
				0,0,0, //End
				0,0,0, //Fear
				0,0,0, //Feather
				0,0,0, //Flame
				0,0,0, //Gunpowder
				1,0,0, //Iron
				0,0,0, //Light
				0,0,0, //Race
				0,0,0, //Spring
				2,1,5, //Sugar
				3,3,7 //Sustenance
				};	
		int[] tagsCreeper = {
				//Max (0 to this) , Influence to, % of influence 0-10
				0,0,0, //Aqua
				0,0,0, //Archier
				0,0,0, //Darkness
				0,0,0, //Time
				1,0,7, //Death
				0,0,0, //Diamond
				0,0,0, //Echo
				0,0,0, //End
				2,0,0, //Fear
				0,0,0, //Feather
				0,0,0, //Flame
				3,2,2, //Gunpowder
				1,0,0, //Iron
				0,0,0, //Light
				0,0,0, //Race
				0,0,0, //Spring
				1,0,0, //Sugar
				0,0,0 //Sustenance
				};	
		int[] tagsEnderDragon = {
				//Max (0 to this) , Influence to, % of influence 0-10
				3,1,5, //Aqua
				3,1,5, //Archier
				3,3,5, //Darkness
				5,3,5, //Time
				3,1,5, //Death
				2,2,10,//(leave)Diamond
				2,0,0, //Echo
				5,3,6, //End
				3,2,5, //Fear
				3,2,3, //Feather
				2,0,0, //Flame
				2,0,0, //Gunpowder
				2,0,0, //Iron
				2,0,0, //Light
				3,0,0, //Race
				2,0,0, //Spring
				3,0,0, //Sugar
				2,0,0 //Sustenance
				};	
		int[] tagsEnderman = {
				//Max (0 to this) , Influence to, % of influence 0-10
				0,0,0, //Aqua
				0,0,0, //Archier
				0,0,0, //Darkness
				0,0,0, //Time
				0,0,0, //Death
				0,0,0, //Diamond
				0,0,0, //Echo
				3,2,5, //End
				1,0,0, //Fear
				0,0,0, //Feather
				0,0,0, //Flame
				0,0,0, //Gunpowder
				1,0,0, //Iron
				0,0,0, //Light
				3,2,3, //Race
				1,0,0, //Spring
				1,0,0, //Sugar
				0,0,0 //Sustenance
				};	
		int[] tagsGhast = {
				//Max (0 to this) , Influence to, % of influence 0-10
				0,0,0, //Aqua
				5,4,5, //Archier
				0,0,0, //Darkness
				2,0,0, //Time
				0,0,0, //Death
				0,0,0, //Diamond
				2,0,0, //Echo
				0,0,0, //End
				2,0,0, //Fear
				3,2,6, //Feather
				3,2,5, //Flame
				3,0,0, //Gunpowder
				1,0,0, //Iron
				0,0,0, //Light
				1,0,0, //Race
				0,0,0, //Spring
				1,0,0, //Sugar
				2,0,0 //Sustenance
				};	
		int[] tagsHorse = {
				//Max (0 to this) , Influence to, % of influence 0-10
				0,0,0, //Aqua
				0,0,0, //Archier
				0,0,0, //Darkness
				0,0,0, //Time
				0,0,0, //Death
				0,0,0, //Diamond
				0,0,0, //Echo
				0,0,0, //End
				0,0,0, //Fear
				1,0,0, //Feather
				0,0,0, //Flame
				0,0,0, //Gunpowder
				1,0,0, //Iron
				0,0,0, //Light
				4,2,3, //Race
				2,0,0, //Spring
				2,0,0, //Sugar
				2,2,3 //Sustenance
				};	
		int[] tagsIronGolem = {
				//Max (0 to this) , Influence to, % of influence 0-10
				0,0,0, //Aqua
				0,0,0, //Archier
				0,0,0, //Darkness
				0,0,0, //Time
				0,0,0, //Death
				0,0,0, //Diamond
				0,0,0, //Echo
				0,0,0, //End
				0,0,0, //Fear
				0,0,0, //Feather
				0,0,0, //Flame
				2,1,1, //Gunpowder
				4,3,5, //Iron
				0,0,0, //Light
				0,0,0, //Race
				0,0,0, //Spring
				1,0,0, //Sugar
				1,0,0 //Sustenance
				};	
		int[] tagsMagmaCube = {
				//Max (0 to this) , Influence to, % of influence 0-10
				0,0,0, //Aqua
				0,0,0, //Archier
				0,0,0, //Darkness
				2,0,0, //Time
				0,0,0, //Death
				0,0,0, //Diamond
				0,0,0, //Echo
				0,0,0, //End
				1,0,0, //Fear
				0,0,0, //Feather
				2,2,2, //Flame
				0,0,0, //Gunpowder
				1,0,0, //Iron
				0,0,0, //Light
				0,0,0, //Race
				1,0,0, //Spring
				1,0,0, //Sugar
				0,0,0 //Sustenance
				};	
		int[] tagsMooshroom = {
				//Max (0 to this) , Influence to, % of influence 0-10
				1,0,0, //Aqua
				0,0,0, //Archier
				0,0,0, //Darkness
				0,0,0, //Time
				0,0,0, //Death
				0,0,0, //Diamond
				0,0,0, //Echo
				0,0,0, //End
				0,0,0, //Fear
				0,0,0, //Feather
				0,0,0, //Flame
				0,0,0, //Gunpowder
				1,0,0, //Iron
				0,0,0, //Light
				0,0,0, //Race
				0,0,0, //Spring
				3,0,0, //Sugar
				4,3,2 //Sustenance
				};	
		int[] tagsOcelot = {
				//Max (0 to this) , Influence to, % of influence 0-10
				0,0,0, //Aqua
				0,0,0, //Archier
				0,0,0, //Darkness
				0,0,0, //Time
				0,0,0, //Death
				0,0,0, //Diamond
				0,0,0, //Echo
				0,0,0, //End
				0,0,0, //Fear
				0,0,0, //Feather
				0,0,0, //Flame
				0,0,0, //Gunpowder
				1,0,0, //Iron
				0,0,0, //Light
				2,0,0, //Race
				1,0,0, //Spring
				2,0,0, //Sugar
				0,0,0 //Sustenance
				};	
		int[] tagsPig = {
				//Max (0 to this) , Influence to, % of influence 0-10
				0,0,0, //Aqua
				0,0,0, //Archier
				0,0,0, //Darkness
				0,0,0, //Time
				0,0,0, //Death
				0,0,0, //Diamond
				0,0,0, //Echo
				0,0,0, //End
				0,0,0, //Fear
				0,0,0, //Feather
				0,0,0, //Flame
				0,0,0, //Gunpowder
				1,0,0, //Iron
				0,0,0, //Light
				0,0,0, //Race
				0,0,0, //Spring
				2,0,0, //Sugar
				3,1,1 //Sustenance
				};	
		int[] tagsSheep = {
				//Max (0 to this) , Influence to, % of influence 0-10
				0,0,0, //Aqua
				0,0,0, //Archier
				0,0,0, //Darkness
				2,0,2, //Time
				0,0,0, //Death
				0,0,0, //Diamond
				0,0,0, //Echo
				0,0,0, //End
				0,0,0, //Fear
				0,0,0, //Feather
				0,0,0, //Flame
				0,0,0, //Gunpowder
				1,0,0, //Iron
				0,0,0, //Light
				0,0,0, //Race
				0,0,0, //Spring
				2,0,0, //Sugar
				2,0,0 //Sustenance
				};	
		int[] tagsSilverfish = {
				//Max (0 to this) , Influence to, % of influence 0-10
				2,0,0, //Aqua
				0,0,0, //Archier
				0,0,0, //Darkness
				1,0,0, //Time
				2,1,5, //Death
				0,0,0, //Diamond
				0,0,0, //Echo
				3,2,5, //End
				2,0,0, //Fear
				0,0,0, //Feather
				0,0,0, //Flame
				0,0,0, //Gunpowder
				1,0,0, //Iron
				0,0,0, //Light
				0,0,0, //Race
				0,0,0, //Spring
				1,0,0, //Sugar
				0,0,0 //Sustenance
				};	
		int[] tagsSkeleton = {
				//Max (0 to this) , Influence to, % of influence 0-10
				0,0,0, //Aqua
				4,2,7, //Archier
				0,0,0, //Darkness
				0,0,0, //Time
				0,0,0, //Death
				0,0,0, //Diamond
				0,0,0, //Echo
				0,0,0, //End
				1,0,0, //Fear
				0,0,0, //Feather
				0,0,0, //Flame
				0,0,0, //Gunpowder
				1,0,0, //Iron
				0,0,0, //Light
				0,0,0, //Race
				0,0,0, //Spring
				1,0,0, //Sugar
				0,0,0 //Sustenance
				};	
		int[] tagsSlime = {
				//Max (0 to this) , Influence to, % of influence 0-10
				2,0,0, //Aqua
				0,0,0, //Archier
				0,0,0, //Darkness
				0,0,0, //Time
				0,0,0, //Death
				0,0,0, //Diamond
				0,0,0, //Echo
				0,0,0, //End
				0,0,0, //Fear
				0,0,0, //Feather
				0,0,0, //Flame
				0,0,0, //Gunpowder
				1,0,0, //Iron
				0,0,0, //Light
				0,0,0, //Race
				1,0,0, //Spring
				1,0,0, //Sugar
				0,0,0 //Sustenance
				};	
		int[] tagsSnowGolem = {
				//Max (0 to this) , Influence to, % of influence 0-10
				1,0,6, //Aqua
				2,0,0, //Archier
				0,0,0, //Darkness
				0,0,0, //Time
				0,0,0, //Death
				0,0,0, //Diamond
				0,0,0, //Echo
				0,0,0, //End
				0,0,0, //Fear
				0,0,0, //Feather
				0,0,0, //Flame
				0,0,0, //Gunpowder
				1,0,0, //Iron
				0,0,0, //Light
				0,0,0, //Race
				0,0,0, //Spring
				1,0,0, //Sugar
				0,0,0 //Sustenance
				};	
		int[] tagsSpider = {
				//Max (0 to this) , Influence to, % of influence 0-10
				0,0,0, //Aqua
				0,0,0, //Archier
				0,0,0, //Darkness
				0,0,0, //Time
				0,0,0, //Death
				0,0,0, //Diamond
				1,1,7, //Echo
				0,0,0, //End
				1,0,0, //Fear
				0,0,0, //Feather
				0,0,0, //Flame
				0,0,0, //Gunpowder
				1,0,0, //Iron
				0,0,0, //Light
				1,0,0, //Race
				2,0,0, //Spring
				1,0,0, //Sugar
				0,0,0 //Sustenance
				};	
		int[] tagsSquid = {
				//Max (0 to this) , Influence to, % of influence 0-10
				3,2,7, //Aqua
				0,0,0, //Archier
				0,0,0, //Darkness
				0,0,0, //Time
				0,0,0, //Death
				0,0,0, //Diamond
				0,0,0, //Echo
				0,0,0, //End
				0,0,0, //Fear
				0,0,0, //Feather
				0,0,0, //Flame
				0,0,0, //Gunpowder
				1,0,0, //Iron
				0,0,0, //Light
				1,0,0, //Race
				0,0,0, //Spring
				1,0,0, //Sugar
				0,0,0 //Sustenance
				};	
		int[] tagsVillager = {
				//Max (0 to this) , Influence to, % of influence 0-10
				1,0,8, //Aqua
				1,0,8, //Archier
				0,0,0, //Darkness
				0,0,0, //Time
				0,0,0, //Death
				0,0,0, //Diamond
				0,0,0, //Echo
				0,0,0, //End
				0,0,0, //Fear
				1,0,5, //Feather
				0,0,0, //Flame
				0,0,0, //Gunpowder
				1,0,0, //Iron
				0,0,0, //Light
				0,0,0, //Race
				0,0,0, //Spring
				2,1,5, //Sugar
				1,0,0 //Sustenance
				};	
		int[] tagsWitch = {
				//Max (0 to this) , Influence to, % of influence 0-10
				0,0,0, //Aqua
				3,2,4, //Archier
				0,0,0, //Darkness
				2,0,0, //Time
				0,0,0, //Death
				0,0,0, //Diamond
				0,0,0, //Echo
				0,0,0, //End
				2,0,0, //Fear
				0,0,0, //Feather
				0,0,0, //Flame
				0,0,0, //Gunpowder
				1,0,0, //Iron
				0,0,0, //Light
				0,0,0, //Race
				0,0,0, //Spring
				1,0,0, //Sugar
				0,0,0 //Sustenance
				};	
		int[] tagsWither = {
				//Max (0 to this) , Influence to, % of influence 0-10
				1,0,0, //Aqua
				0,0,0, //Archier
				3,2,5, //Darkness
				3,2,3, //Time
				4,0,0, //Death
				2,1,9, //Diamond
				2,0,0, //Echo
				0,0,0, //End
				3,1,6, //Fear
				0,0,0, //Feather
				2,0,0, //Flame
				2,0,0, //Gunpowder
				2,0,0, //Iron
				1,0,0, //Light
				2,0,0, //Race
				2,0,0, //Spring
				1,0,0, //Sugar
				0,0,0 //Sustenance
				};	
		int[] tagsWitherSkeleton = {
				//Max (0 to this) , Influence to, % of influence 0-10
				0,0,0, //Aqua
				5,4,6, //Archier
				1,0,0, //Darkness
				3,2,5, //Time
				3,0,0, //Death
				1,0,0, //Diamond
				0,0,0, //Echo
				0,0,0, //End
				1,0,0, //Fear
				0,0,0, //Feather
				0,0,0, //Flame
				0,0,0, //Gunpowder
				1,0,0, //Iron
				1,0,3, //Light
				1,0,0, //Race
				0,0,0, //Spring
				1,0,0, //Sugar
				0,0,0 //Sustenance
				};	
		int[] tagsWolf = {
				//Max (0 to this) , Influence to, % of influence 0-10
				0,0,0, //Aqua
				0,0,0, //Archier
				0,0,0, //Darkness
				0,0,0, //Time
				0,0,0, //Death
				0,0,0, //Diamond
				0,0,0, //Echo
				0,0,0, //End
				0,0,0, //Fear
				2,0,3, //Feather
				0,0,0, //Flame
				0,0,0, //Gunpowder
				1,0,0, //Iron
				0,0,0, //Light
				1,0,0, //Race
				0,0,0, //Spring
				1,0,0, //Sugar
				0,0,0 //Sustenance
				};
		int[] tagsZombie = {
				//Max (0 to this) , Influence to, % of influence 0-10
				0,0,0, //Aqua
				0,0,0, //Archier
				0,0,0, //Darkness
				0,0,0, //Time
				0,0,0, //Death
				0,0,0, //Diamond
				0,0,0, //Echo
				0,0,0, //End
				1,0,0, //Fear
				0,0,0, //Feather
				0,0,0, //Flame
				0,0,0, //Gunpowder
				1,0,0, //Iron
				0,0,0, //Light
				0,0,0, //Race
				0,0,0, //Spring
				1,0,0, //Sugar
				0,0,0 //Sustenance
				};
		int[] tagsZombiePigman = {
				//Max (0 to this) , Influence to, % of influence 0-10
				0,0,0, //Aqua
				0,0,0, //Archier
				1,0,6, //Darkness
				2,0,0, //Time
				0,0,0, //Death
				0,0,0, //Diamond
				0,0,0, //Echo
				0,0,0, //End
				1,0,0, //Fear
				0,0,0, //Feather
				2,0,0, //Flame
				0,0,0, //Gunpowder
				1,0,0, //Iron
				0,0,0, //Light
				0,0,0, //Race
				0,0,0, //Spring
				1,0,0, //Sugar
				0,0,0 //Sustenance
				};
		int[] tagsZombieVillager = {
				//Max (0 to this) , Influence to, % of influence 0-10
				0,0,0, //Aqua
				0,0,0, //Archier
				0,0,0, //Darkness
				0,0,0, //Time
				0,0,0, //Death
				0,0,0, //Diamond
				0,0,0, //Echo
				0,0,0, //End
				1,0,0, //Fear
				0,0,0, //Feather
				0,0,0, //Flame
				0,0,0, //Gunpowder
				1,0,0, //Iron
				0,0,0, //Light
				0,0,0, //Race
				0,0,0, //Spring
				1,0,0, //Sugar
				0,0,0 //Sustenance
				};
		
			
			if(itemstack.getItem().itemID==Items.bloodBagBat.itemID){
				int num1;
				int[] tags=tagsBat;
				for(int o=1;o<=itemstack.getItemDamage();o++){
					for(int i=0;i<18;i++){
						if(tags[i*3]>0) num1 = rand.nextInt(tags[i*3]);
						else num1=0;
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
						if(tags[i*3]>0) num1 = rand.nextInt(tags[i*3]);
						else num1=0;
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
						if(tags[i*3]>0) num1 = rand.nextInt(tags[i*3]);
						else num1=0;
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
						if(tags[i*3]>0) num1 = rand.nextInt(tags[i*3]);
						else num1=0;
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
						if(tags[i*3]>0) num1 = rand.nextInt(tags[i*3]);
						else num1=0;
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
						if(tags[i*3]>0) num1 = rand.nextInt(tags[i*3]);
						else num1=0;
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
						if(tags[i*3]>0) num1 = rand.nextInt(tags[i*3]);
						else num1=0;
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
						if(tags[i*3]>0) num1 = rand.nextInt(tags[i*3]);
						else num1=0;
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
						if(tags[i*3]>0) num1 = rand.nextInt(tags[i*3]);
						else num1=0;
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
						if(tags[i*3]>0) num1 = rand.nextInt(tags[i*3]);
						else num1=0;
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
						if(tags[i*3]>0) num1 = rand.nextInt(tags[i*3]);
						else num1=0;
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
						if(tags[i*3]>0) num1 = rand.nextInt(tags[i*3]);
						else num1=0;
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
						if(tags[i*3]>0) num1 = rand.nextInt(tags[i*3]);
						else num1=0;
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
						if(tags[i*3]>0) num1 = rand.nextInt(tags[i*3]);
						else num1=0;
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
						if(tags[i*3]>0) num1 = rand.nextInt(tags[i*3]);
						else num1=0;
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
						if(tags[i*3]>0) num1 = rand.nextInt(tags[i*3]);
						else num1=0;
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
						if(tags[i*3]>0) num1 = rand.nextInt(tags[i*3]);
						else num1=0;
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
						if(tags[i*3]>0) num1 = rand.nextInt(tags[i*3]);
						else num1=0;
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
						if(tags[i*3]>0) num1 = rand.nextInt(tags[i*3]);
						else num1=0;
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
						if(tags[i*3]>0) num1 = rand.nextInt(tags[i*3]);
						else num1=0;
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
						if(tags[i*3]>0) num1 = rand.nextInt(tags[i*3]);
						else num1=0;
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
						if(tags[i*3]>0) num1 = rand.nextInt(tags[i*3]);
						else num1=0;
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
						if(tags[i*3]>0) num1 = rand.nextInt(tags[i*3]);
						else num1=0;
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
						if(tags[i*3]>0) num1 = rand.nextInt(tags[i*3]);
						else num1=0;
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
						if(tags[i*3]>0) num1 = rand.nextInt(tags[i*3]);
						else num1=0;
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
						if(tags[i*3]>0) num1 = rand.nextInt(tags[i*3]);
						else num1=0;
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
						if(tags[i*3]>0) num1 = rand.nextInt(tags[i*3]);
						else num1=0;
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
						if(tags[i*3]>0) num1 = rand.nextInt(tags[i*3]);
						else num1=0;
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
						if(tags[i*3]>0) num1 = rand.nextInt(tags[i*3]);
						else num1=0;
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
						if(tags[i*3]>0) num1 = rand.nextInt(tags[i*3]);
						else num1=0;
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
