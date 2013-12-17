package bjmMod;

import net.minecraft.block.Block;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.world.biome.BiomeEndDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenOcean;
import net.minecraft.world.biome.SpawnListEntry;

public class BattleBiome extends BiomeGenBase{

	public BattleBiome(int par1) {
		super(par1);
		this.setBiomeName("Fuck This Shit");
		this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
        this.spawnableMonsterList.add(new SpawnListEntry(EntityEnderman.class, 10, 4, 4));
        
        this.topBlock = (byte)Block.glass.blockID;
        this.fillerBlock = (byte)Block.glass.blockID;
        this.setMinMaxHeight(-0.9F, 0.0F);
        this.setColor(16711680);
        this.setTemperatureRainfall(2.0F, 0.0F);
        this.theBiomeDecorator.treesPerChunk = -999;
        this.theBiomeDecorator.flowersPerChunk = -999;
        this.theBiomeDecorator.generateLakes = false;
        this.waterColorMultiplier = 14999999;
	}

}
