package bjm904;

import bjm904.blocks.Blocks;
import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabBjmModTree extends CreativeTabs{

	public CreativeTabBjmModTree(int id, String name) {
		super(id, name);
		
	}
	@Override
	public int getTabIconItemIndex() {
		return Blocks.daystarSapling.blockID; 
	}
}
