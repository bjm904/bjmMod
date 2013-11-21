package bjm904.blocks.help;

import bjm904.Names;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class AquaPlankMeta extends ItemBlock {

	public AquaPlankMeta(int par1) {
		super(par1);
		setHasSubtypes(true);
	}
	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
	return Names.aquaPlank_unlocalizedName[itemstack.getItemDamage()];
	}
	@Override
	public int getMetadata(int damage) {
	return damage;
	}
}
