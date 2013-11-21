package bloodMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Tab extends CreativeTabs{

	public Tab(int id, String name) {
		super(id, name);
		
	}
	@Override
	public int getTabIconItemIndex() {
		return Item.appleGold.itemID; 
	}
}
