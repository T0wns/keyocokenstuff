
package net.cringeco.keyocokenstuff.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class TomatoSeedsItem extends Item {
	public TomatoSeedsItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
