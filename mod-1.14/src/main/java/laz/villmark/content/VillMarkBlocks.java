package laz.villmark.content;

import java.util.ArrayList;
import java.util.List;

import laz.villmark.VillMark;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static laz.villmark.VillMark.MOD_ID;
import static net.minecraft.block.material.Material.*;

public class VillMarkBlocks {

	private static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, MOD_ID);
	private static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MOD_ID);
	public static List<RegistryObject<Block>> blocklist = new ArrayList<RegistryObject<Block>>();

	//Stone
	public static final RegistryObject<Block> VILLSTONE = BLOCKS.register("villstone", () -> new Block(Block.Properties.create(ROCK)
			.sound(SoundType.STONE)
			.hardnessAndResistance(1.5f, 30f)
	));
	public static final RegistryObject<Block> DRYROCK = BLOCKS.register("dryrock", () -> new Block(Block.Properties.create(ROCK)
			.sound(SoundType.STONE)
			.hardnessAndResistance(1f, 20f)
	));
	public static final RegistryObject<Block> DREADBONE = BLOCKS.register("dreadbone", () -> new Block(Block.Properties.create(ORGANIC)
			.sound(SoundType.STONE)
			.hardnessAndResistance(1f, 10f)
	));
	public static final RegistryObject<Block> FLESHSTONE = BLOCKS.register("fleshstone", () -> new Block(Block.Properties.create(ORGANIC)
			.sound(SoundType.STONE)
			.hardnessAndResistance(1f, 10f)
	));
	public static final RegistryObject<Block> HELLSTONE = BLOCKS.register("hellstone", () -> new Block(Block.Properties.create(ROCK)
			.sound(SoundType.STONE)
			.hardnessAndResistance(1.5f, 30f)
	));
	public static final RegistryObject<Block> HELLSTONEFLESHED = BLOCKS.register("hellstonefleshed", () -> new Block(Block.Properties.create(ROCK)
			.sound(SoundType.STONE)
			.hardnessAndResistance(1.5f, 30f)
	));
	public static final RegistryObject<Block> TASTONE = BLOCKS.register("tastone", () -> new Block(Block.Properties.create(ROCK)
			.sound(SoundType.STONE)
			.hardnessAndResistance(2f, 40f)
	));

	//Shival Blocks
	public static final RegistryObject<Block> SHIVAL_FLOOR = BLOCKS.register("shival_floor", () -> new Block(Block.Properties.create(ROCK)
			.sound(SoundType.STONE)
			.hardnessAndResistance(2f, 40f)
	));
	public static final RegistryObject<Block> SHIVAL_FLOOR_COLORED = BLOCKS.register("shival_floor_colored", () -> new Block(Block.Properties.create(ROCK)
			.sound(SoundType.STONE)
			.hardnessAndResistance(2f, 40f)
	));
	public static final RegistryObject<Block> SHIVAL_BRICKS = BLOCKS.register("shival_bricks", () -> new Block(Block.Properties.create(ROCK)
			.sound(SoundType.STONE)
			.hardnessAndResistance(2f, 40f)
	));
	public static final RegistryObject<Block> SHIVAL_BRICKS_COLORED = BLOCKS.register("shival_bricks_colored", () -> new Block(Block.Properties.create(ROCK)
			.sound(SoundType.STONE)
			.hardnessAndResistance(2f, 40f)
	));
	public static final RegistryObject<Block> SHIVAL_PILLAR = BLOCKS.register("shival_pillar", () -> new Block(Block.Properties.create(ROCK)
			.sound(SoundType.STONE)
			.hardnessAndResistance(2f, 40f)
	));

	//Wood

	public static final RegistryObject<Block> DEADWOOD = BLOCKS.register("deadwood", () -> new Block(Block.Properties.create(WOOD)
			.sound(SoundType.WOOD)
			.hardnessAndResistance(1.5f, 8f)
	));
	public static final RegistryObject<Block> DEADPLANKS = BLOCKS.register("deadplanks", () -> new Block(Block.Properties.create(WOOD)
			.sound(SoundType.WOOD)
			.hardnessAndResistance(1.5f, 12f)
	));

	//SAND

	public static final RegistryObject<Block> VILLSAND = BLOCKS.register("villsand", () -> new Block(Block.Properties.create(SAND)
			.sound(SoundType.SAND)
			.hardnessAndResistance(0.5f, 10f)
	));
	public static final RegistryObject<Block> VILLSANDROCK = BLOCKS.register("villsandrock", () -> new Block(Block.Properties.create(ROCK)
			.sound(SoundType.STONE)
			.hardnessAndResistance(1.5f, 30f)
	));

	//ORES

	public static final RegistryObject<Block> OREBORELEC = BLOCKS.register("oreborelec", () -> new Block(Block.Properties.create(ROCK)
			.sound(SoundType.STONE)
			.hardnessAndResistance(1.5f, 30f)
	));
	public static final RegistryObject<Block> OREMIRRORIS = BLOCKS.register("oremirroris", () -> new Block(Block.Properties.create(ROCK)
			.sound(SoundType.STONE)
			.hardnessAndResistance(1.5f, 30f)
	));

	//MetalBlocks
	public static final RegistryObject<Block> BLOCKMIRRORIS = BLOCKS.register("blockmirroris", () -> new Block(Block.Properties.create(ROCK)
			.sound(SoundType.STONE)
			.hardnessAndResistance(1.5f, 30f)
	));
	public static final RegistryObject<Block> BLOCKBORELEC = BLOCKS.register("blockborelec", () -> new Block(Block.Properties.create(ROCK)
			.sound(SoundType.STONE)
			.hardnessAndResistance(1.5f, 30f)
	));


	public static void register(IEventBus bus) {
		blocklist.add(VILLSTONE);
		blocklist.add(DEADWOOD);
		blocklist.add(DEADPLANKS);
		blocklist.add(HELLSTONEFLESHED);
		blocklist.add(HELLSTONE);
		blocklist.add(FLESHSTONE);
		blocklist.add(DREADBONE);
		blocklist.add(DRYROCK);
		blocklist.add(BLOCKBORELEC);
		blocklist.add(BLOCKMIRRORIS);
		blocklist.add(OREMIRRORIS);
		blocklist.add(OREBORELEC);
		blocklist.add(VILLSANDROCK);
		blocklist.add(VILLSAND);
		blocklist.add(TASTONE);
		blocklist.add(SHIVAL_FLOOR);
		blocklist.add(SHIVAL_FLOOR_COLORED);
		blocklist.add(SHIVAL_BRICKS);
		blocklist.add(SHIVAL_BRICKS_COLORED);
		blocklist.add(SHIVAL_PILLAR);







		int blocks = blocklist.size();
		for(RegistryObject<Block> block: blocklist.subList(0, blocks)){
			ITEMS.register(block.toString(),() -> new BlockItem(block.get(), new Item.Properties().group(VillMark.villMarkItemGroup)));
		}

		BLOCKS.register(bus);
		ITEMS.register(bus);
	}
	
}

