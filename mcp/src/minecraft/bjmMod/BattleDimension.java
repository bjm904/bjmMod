
package bjmMod;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenOcean;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.ChunkProviderHell;

public class BattleDimension extends WorldProvider {

	
	public boolean isHellWorld = true;
	public boolean hasNoSky = true;
	
	@Override
	public String getDimensionName() {
		
		return "Battle Place";
	}
	
	public void registerWorldChunkManager()
	{
	       this.worldChunkMgr = new WorldChunkManagerHell(new BattleBiome(0), 0.8F, 0.1F);
	       this.dimensionId = bjmMod.battleDimensionId;
	}
	public IChunkProvider createChunkGenerator()
	{
	       return new ChunkProviderBattle(worldObj, worldObj.getSeed(), false);
	}
}
