package bjmMod.blocks.help;

import bjmMod.Names;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class AerobreezeLogMeta extends ItemBlock {

	public AerobreezeLogMeta(int par1) {
		super(par1);
		setHasSubtypes(true);
	}
	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
	return Names.aerobreezeLog_unlocalizedName[itemstack.getItemDamage()];
	}
	@Override
	public int getMetadata(int damage) {
	return damage;
	}
}
