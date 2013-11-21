package bjmMod;

import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.BonemealEvent;
import bjmMod.blocks.AerobreezeSapling;
import bjmMod.blocks.Blocks;

public class Aerobreeze_Bonemeal_Event {
@ForgeSubscribe
public void usedBonemeal(BonemealEvent event){
	if (event.ID == Blocks.aerobreezeSapling.blockID){
		if (!event.world.isRemote){
			((AerobreezeSapling)Blocks.aerobreezeSapling).growTree(event.world, event.X, event.Y, event.Z, event.world.rand);
		}
	}
}
}
