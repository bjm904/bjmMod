package bjm904.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import bjm904.Ids;
import bjm904.Names;
import net.minecraft.item.Item;

public class Items {
	public static Item item;
	public static void init() {
		item = new Macuahuitl(Ids.macuahuitl);
	}
	public static void addNames() {
		LanguageRegistry.addName(item, Names.macuahuitl_name);
	}
}
