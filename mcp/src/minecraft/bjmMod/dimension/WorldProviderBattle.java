
package bjmMod.dimension;

import bjmMod.bjmMod;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenOcean;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.ChunkProviderHell;

public class WorldProviderBattle extends WorldProvider {

	
	public String getDimensionName() {
		
		return "Battle Place";
	}
	
	public void registerWorldChunkManager()
	{
	       this.worldChunkMgr = new WorldChunkManagerHell(bjmMod.biomeBattle, 0.8F, 1.0F);
	       this.dimensionId = bjmMod.battleDimensionId;
	}
	public IChunkProvider createChunkGenerator()
	{
	       return new ChunkProviderBattle(worldObj, worldObj.getSeed(), true);
	}
}
