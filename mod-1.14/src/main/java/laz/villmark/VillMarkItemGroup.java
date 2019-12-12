package laz.villmark;

import laz.villmark.lists.BlockList;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class VillMarkItemGroup extends ItemGroup{

	public VillMarkItemGroup() {
		super("VillMark");
	
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(BlockList.villstone);
	}

}
