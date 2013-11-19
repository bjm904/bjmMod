package bjm904.items;

import bjm904.Names;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Macuahuitl extends Item {

	public Macuahuitl(int id) {
		super(id);
		this.setCreativeTab(CreativeTabs.tabFood);
		this.setUnlocalizedName(Names.macuahuitl_unlocalizedName);
	}

}
