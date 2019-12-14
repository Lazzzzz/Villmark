package laz.villmark;

import static laz.villmark.VillMark.MOD_ID;
import static laz.villmark.content.VillMarkBlocks.VILLSTONE;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class VillMarkItemGroup extends ItemGroup{

	public VillMarkItemGroup() {
		super(MOD_ID);
	
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(VILLSTONE.get());
	}

}
