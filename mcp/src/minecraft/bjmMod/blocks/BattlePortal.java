package bjmMod.blocks;

import bjmMod.BattleDimension;
import net.minecraft.block.BlockPortal;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.src.ModLoader;
import net.minecraft.world.World;
import bjmMod.bjmMod;

public class BattlePortal extends BlockPortal{

	public BattlePortal(int par1) {
		super(par1);
		
	}
	public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
    {
           if ((par5Entity.ridingEntity == null) && (par5Entity.riddenByEntity == null) && ((par5Entity instanceof EntityPlayerMP)))
           {
                  EntityPlayerMP player = (EntityPlayerMP) par5Entity;
                  ModLoader.getMinecraftServerInstance();
                  MinecraftServer mServer = MinecraftServer.getServer();
                  if (player.timeUntilPortal > 0)
                  {
                        player.timeUntilPortal = 10;
                  }
                  else if (player.dimension != bjmMod.battleDimensionId)
                  {
                        player.timeUntilPortal = 10;
                        player.mcServer.getConfigurationManager().transferPlayerToDimension(player, bjmMod.battleDimensionId, new TeleporterBattleDimension(mServer.worldServerForDimension(bjmMod.battleDimensionId)));
                  }
                  else
                  {
                        player.timeUntilPortal = 10;
                        player.mcServer.getConfigurationManager().transferPlayerToDimension(player, 0, new TeleporterBattleDimension(mServer.worldServerForDimension(1)));
                  }
           }
    }
}
