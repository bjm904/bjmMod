package bjmMod;

import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.BonemealEvent;
import bjmMod.blocks.Blocks;
import bjmMod.blocks.DaystarSapling;

public class Daystar_Bonemeal_Event {
@ForgeSubscribe
public void usedBonemeal(BonemealEvent event){
	if (event.ID == Blocks.daystarSapling.blockID){
		if (!event.world.isRemote){
			((DaystarSapling)Blocks.daystarSapling).growTree(event.world, event.X, event.Y, event.Z, event.world.rand);
		}
	}
}
}
