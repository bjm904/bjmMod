package bjm904.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import bjm904.Ids;
import bjm904.Names;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;

public class Items {
	public static Item item;
	public static void init() {
		item = new MacuahuitlDiamond(Ids.macuahuitlDiamond, EnumToolMaterial.EMERALD);
	}
	public static void addNames() {
		LanguageRegistry.addName(item, Names.macuahuitlDiamond_name);
	}
}
