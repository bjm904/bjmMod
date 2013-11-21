package bjmMod;

import bjmMod.blocks.Blocks;
import net.minecraft.creativetab.CreativeTabs;

public class TabTree extends CreativeTabs{

	public TabTree(int id, String name) {
		super(id, name);
		
	}
	@Override
	public int getTabIconItemIndex() {
		return Blocks.daystarSapling.blockID; 
	}
}
