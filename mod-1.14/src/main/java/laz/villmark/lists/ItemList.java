package laz.villmark.lists;

import java.util.ArrayList;
import java.util.List;

import laz.villmark.VillMark;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class ItemList {

	public static List<Item> itemlist = new ArrayList<Item>(); 
	
	public static Item deadstick = createItem("deadstick"); 
	
	public static void createItemFromBlock(Block block) {
		Item item = new BlockItem(block, new Item.Properties().group(VillMark.villMarkItemGroup)).setRegistryName(block.getRegistryName());
		itemlist.add(item);
		
	}
	
	public static Item createItem(String name) {
		Item item = new Item(new Item.Properties().group(VillMark.villMarkItemGroup)).setRegistryName(VillMark.location(name));
		itemlist.add(item);
		return item;
	}
}
