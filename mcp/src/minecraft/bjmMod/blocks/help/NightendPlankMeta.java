package bjmMod.blocks.help;

import bjmMod.Names;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class NightendPlankMeta extends ItemBlock {

	public NightendPlankMeta(int par1) {
		super(par1);
		setHasSubtypes(true);
	}
	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
	return Names.nightendPlank_unlocalizedName[itemstack.getItemDamage()];
	
	}
	@Override
	public int getMetadata(int damage) {
	return damage;
	}
}
