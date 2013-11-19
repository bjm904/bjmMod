package bjm904;

import bjm904.items.Items;
import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabBjmMod extends CreativeTabs{

	public CreativeTabBjmMod(int id, String name) {
		super(id, name);
		
	}
	@Override
	public int getTabIconItemIndex() {
		return Items.macuahuitlDiamond.itemID; 
	}
}
