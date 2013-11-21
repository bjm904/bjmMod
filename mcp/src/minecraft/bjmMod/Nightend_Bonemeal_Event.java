package bjmMod;

import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.BonemealEvent;
import bjmMod.blocks.Blocks;
import bjmMod.blocks.NightendSapling;

public class Nightend_Bonemeal_Event {
@ForgeSubscribe
public void usedBonemeal(BonemealEvent event){
	if (event.ID == Blocks.nightendSapling.blockID){
		if (!event.world.isRemote){
			((NightendSapling)Blocks.nightendSapling).growTree(event.world, event.X, event.Y, event.Z, event.world.rand);
		}
	}
}
}
