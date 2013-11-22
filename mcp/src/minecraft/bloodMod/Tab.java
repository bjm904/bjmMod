package bloodMod;

import bloodMod.items.Items;
import net.minecraft.creativetab.CreativeTabs;

public class Tab extends CreativeTabs{

	public Tab(int id, String name) {
		super(id, name);
		
	}
	@Override
	public int getTabIconItemIndex() {
		return Items.bloodBagBat.itemID; 
	}
}
