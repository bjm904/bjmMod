package bjm904.blocks.help;

import bjm904.Names;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class NightendLeavesMeta extends ItemBlock {

	public NightendLeavesMeta(int par1) {
		super(par1);
		setHasSubtypes(true);
	}
	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
	return Names.nightendLeaves_unlocalizedName[itemstack.getItemDamage()];
	}
	@Override
	public int getMetadata(int damage) {
	return damage;
	}
}
