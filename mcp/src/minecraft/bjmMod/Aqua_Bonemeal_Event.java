package bjmMod;

import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.BonemealEvent;
import bjmMod.blocks.AquaSapling;
import bjmMod.blocks.Blocks;

public class Aqua_Bonemeal_Event {
@ForgeSubscribe
public void usedBonemeal(BonemealEvent event){
	if (event.ID == Blocks.aquaSapling.blockID){
		if (!event.world.isRemote){
			((AquaSapling)Blocks.aquaSapling).growTree(event.world, event.X, event.Y, event.Z, event.world.rand);
		}
	}
}
}
