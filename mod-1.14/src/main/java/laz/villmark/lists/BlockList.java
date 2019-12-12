package laz.villmark.lists;

import java.util.ArrayList;
import java.util.List;

import laz.villmark.VillMark;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockList {
	
	public static List<Block> blocklist = new ArrayList<Block>(); 
	
	public static Block villstone = createBlock(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 30f).lightValue(0).sound(SoundType.STONE)).setRegistryName(VillMark.location("villstone")));
	public static Block deadwood = createBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5f, 8f).lightValue(0).sound(SoundType.WOOD)).setRegistryName(VillMark.location("deadwood")));
	public static Block deadplanks = createBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5f, 12f).lightValue(0).sound(SoundType.WOOD)).setRegistryName(VillMark.location("deadplanks")));
	public static Block dryrock = createBlock(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1f, 20f).lightValue(0).sound(SoundType.SAND)).setRegistryName(VillMark.location("dryrock")));
	public static Block dreadbone = createBlock(new Block(Block.Properties.create(Material.ORGANIC).hardnessAndResistance(1f, 10f).lightValue(0).sound(SoundType.STONE)).setRegistryName(VillMark.location("dreadbone")));
	public static Block fleshstone = createBlock(new Block(Block.Properties.create(Material.ORGANIC).hardnessAndResistance(1f, 10f).lightValue(0).sound(SoundType.STONE)).setRegistryName(VillMark.location("fleshstone")));
	public static Block hellstone = createBlock(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 30f).lightValue(0).sound(SoundType.STONE)).setRegistryName(VillMark.location("hellstone")));
	public static Block hellstonefleshed = createBlock(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 30f).lightValue(0).sound(SoundType.STONE)).setRegistryName(VillMark.location("hellstonefleshed")));
	public static Block villsand = createBlock(new Block(Block.Properties.create(Material.SAND).hardnessAndResistance(0.5f, 10f).lightValue(0).sound(SoundType.SAND)).setRegistryName(VillMark.location("villsand")));
	public static Block villsandrock = createBlock(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 30f).lightValue(0).sound(SoundType.STONE)).setRegistryName(VillMark.location("villsandrock")));
	public static Block tastone = createBlock(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2f, 40f).lightValue(0).sound(SoundType.STONE)).setRegistryName(VillMark.location("tastone")));
	public static Block oreborelec;
	public static Block oremirroris;
	public static Block blockborelec;
	public static Block blockmirroris;

	public static Block createBlock(Block block) {
		blocklist.add(block);
		ItemList.createItemFromBlock(block);
		return block;
		
	}
	
}

