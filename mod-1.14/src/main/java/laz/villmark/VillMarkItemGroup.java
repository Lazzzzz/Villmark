package laz.villmark;

import laz.villmark.content.VillMarkBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import static laz.villmark.VillMark.MOD_ID;
import static laz.villmark.content.VillMarkBlocks.VILLSTONE;

public class VillMarkItemGroup extends ItemGroup{

	public VillMarkItemGroup() {
		super(MOD_ID);
	
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(VILLSTONE.get());
	}

}
