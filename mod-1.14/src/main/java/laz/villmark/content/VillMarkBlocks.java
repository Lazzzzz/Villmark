package laz.villmark.content;

import static laz.villmark.VillMark.MOD_ID;
import static net.minecraft.block.material.Material.ORGANIC;
import static net.minecraft.block.material.Material.ROCK;
import static net.minecraft.block.material.Material.SAND;
import static net.minecraft.block.material.Material.WOOD;

import java.util.Map;

import com.google.common.collect.Maps;

import laz.villmark.VillMark;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class VillMarkBlocks {

	private static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, MOD_ID);
	private static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MOD_ID);
	public static Map<RegistryObject<Block>, String> blocklist = Maps.newHashMap();

	//VillStone
	public static final RegistryObject<Block> VILLSTONE = BLOCKS.register("villstone", () -> new Block(Block.Properties.create(ROCK)
			.sound(SoundType.STONE)
			.hardnessAndResistance(1.5f, 30f)
	));
	public static final RegistryObject<Block> VILLMARK_BEDROCK = BLOCKS.register("villmark_bedrock", () -> new Block(Block.Properties.create(ROCK)
			.sound(SoundType.STONE)
			.hardnessAndResistance(1.5f, 30f)
	));
	public static final RegistryObject<Block> VILLSAND = BLOCKS.register("villsand", () -> new Block(Block.Properties.create(SAND)
			.sound(SoundType.SAND)
			.hardnessAndResistance(0.5f, 10f)
	));
	public static final RegistryObject<Block> VILLSANDROCK = BLOCKS.register("villsandrock", () -> new Block(Block.Properties.create(ROCK)
			.sound(SoundType.STONE)
			.hardnessAndResistance(1.5f, 30f)
	));


	public static final RegistryObject<Block> DRYROCK = BLOCKS.register("dryrock", () -> new Block(Block.Properties.create(ROCK)
			.sound(SoundType.STONE)
			.hardnessAndResistance(1f, 20f)
	));
	public static final RegistryObject<Block> DRYROCK_BRICKS = BLOCKS.register("dryrock_bricks", () -> new Block(Block.Properties.create(ROCK)
			.sound(SoundType.STONE)
			.hardnessAndResistance(1f, 20f)
	));

	//FleshStone
	public static final RegistryObject<Block> FLESHSTONE = BLOCKS.register("fleshstone", () -> new Block(Block.Properties.create(ORGANIC)
			.sound(SoundType.STONE)
			.hardnessAndResistance(1f, 10f)
	));
	public static final RegistryObject<Block> FLESHSTONE_BRICKS = BLOCKS.register("fleshstone_bricks", () -> new Block(Block.Properties.create(ORGANIC)
			.sound(SoundType.STONE)
			.hardnessAndResistance(1f, 10f)
	));

	//Tastone Blocks
	public static final RegistryObject<Block> TASTONE = BLOCKS.register("tastone", () -> new Block(Block.Properties.create(ROCK)
			.sound(SoundType.STONE)
			.hardnessAndResistance(2f, 40f)
	));
	public static final RegistryObject<Block> TASTONE_BRICKS = BLOCKS.register("tastone_bricks", () -> new Block(Block.Properties.create(ROCK)
			.sound(SoundType.STONE)
			.hardnessAndResistance(2f, 40f)
	));

	//DeadBone
	public static final RegistryObject<Block> DREADBONE = BLOCKS.register("dreadbone", () -> new Block(Block.Properties.create(ORGANIC)
			.sound(SoundType.STONE)
			.hardnessAndResistance(1f, 10f)
	));
	public static final RegistryObject<Block> DREADBONE_BLOCK = BLOCKS.register("dreadbone_block", () -> new Block(Block.Properties.create(ORGANIC)
			.sound(SoundType.STONE)
			.hardnessAndResistance(1f, 10f)
	));
	public static final RegistryObject<Block> DREADBONE_BRICKS = BLOCKS.register("dreadbone_bricks", () -> new Block(Block.Properties.create(ORGANIC)
			.sound(SoundType.STONE)
			.hardnessAndResistance(1f, 10f)
	));
	public static final RegistryObject<Block> DREADBONE_BRICKS_SMOOTH = BLOCKS.register("dreadbone_bricks_smooth", () -> new Block(Block.Properties.create(ORGANIC)
			.sound(SoundType.STONE)
			.hardnessAndResistance(1f, 10f)
	));

	//HellStone Blocks
	public static final RegistryObject<Block> HELLSTONE = BLOCKS.register("hellstone", () -> new Block(Block.Properties.create(ROCK)
			.sound(SoundType.STONE)
			.hardnessAndResistance(1.5f, 30f)
	));
	public static final RegistryObject<Block> HELLSTONEFLESHED = BLOCKS.register("hellstonefleshed", () -> new Block(Block.Properties.create(ROCK)
			.sound(SoundType.STONE)
			.hardnessAndResistance(1.5f, 30f)
	));
	public static final RegistryObject<Block> HELLSTONE_BRICKS = BLOCKS.register("hellstone_bricks", () -> new Block(Block.Properties.create(ROCK)
			.sound(SoundType.STONE)
			.hardnessAndResistance(1.5f, 30f)
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

	//ORES

	public static final RegistryObject<Block> BORELEC_ORE = BLOCKS.register("borelec_ore", () -> new Block(Block.Properties.create(ROCK)
			.sound(SoundType.STONE)
			.hardnessAndResistance(1.5f, 30f)
	));
	public static final RegistryObject<Block> MIRRORIS_ORE = BLOCKS.register("mirroris_ore", () -> new Block(Block.Properties.create(ROCK)
			.sound(SoundType.STONE)
			.hardnessAndResistance(1.5f, 30f)
	));

	//MetalBlocks
	public static final RegistryObject<Block> MIRRORIS_BLOCK = BLOCKS.register("mirroris_block", () -> new Block(Block.Properties.create(ROCK)
			.sound(SoundType.STONE)
			.hardnessAndResistance(1.5f, 30f)
	));
	public static final RegistryObject<Block> BORELEC_BLOCK = BLOCKS.register("borelec_block", () -> new Block(Block.Properties.create(ROCK)
			.sound(SoundType.STONE)
			.hardnessAndResistance(1.5f, 30f)
	));

	//Plants
	//DeadBone
	public static final RegistryObject<Block> DESERT_GRASS = BLOCKS.register("desert_grass", () -> new Block(Block.Properties.create(ORGANIC)
			.sound(SoundType.STONE)
			.hardnessAndResistance(0f, 0f)
	));


	public static void register(IEventBus bus) {
		blocklist.put(VILLSTONE, "villstone");
		blocklist.put(DEADWOOD, "deadwood");
		blocklist.put(DEADPLANKS, "deadplanks");
		blocklist.put(HELLSTONEFLESHED, "hellstonefleshed");
		blocklist.put(HELLSTONE, "hellstone");
		blocklist.put(FLESHSTONE,"fleshstone");
		blocklist.put(DREADBONE, "deadbone");
		blocklist.put(DRYROCK, "dryrock");
		blocklist.put(BORELEC_BLOCK, "borelec_block");
		blocklist.put(MIRRORIS_BLOCK, "mirroris_block");
		blocklist.put(MIRRORIS_ORE, "mirroris_ore");
		blocklist.put(BORELEC_ORE, "borelec_ore");
		blocklist.put(VILLSANDROCK, "villsandrock");
		blocklist.put(VILLSAND, "villsand");
		blocklist.put(TASTONE, "tastone");
		blocklist.put(SHIVAL_FLOOR, "shival_floor");
		blocklist.put(SHIVAL_FLOOR_COLORED, "shival_floor_colored");
		blocklist.put(SHIVAL_BRICKS, "shival_bricks");
		blocklist.put(SHIVAL_BRICKS_COLORED, "shival_bricks_colored");
		blocklist.put(SHIVAL_PILLAR, "shival_pillar");
		blocklist.put(HELLSTONE_BRICKS, "hellstone_bricks");
		blocklist.put(DREADBONE_BLOCK, "dreadbone_block");
		blocklist.put(DREADBONE_BRICKS_SMOOTH, "deadbone_bricks_smooth");
		blocklist.put(DREADBONE_BRICKS, "dreadbone_bricks");
		blocklist.put(TASTONE_BRICKS, "tastone_bricks");
		blocklist.put(FLESHSTONE_BRICKS, "fleshstone_bricks");
		blocklist.put(DRYROCK_BRICKS, "drystone_bricks");
		blocklist.put(VILLMARK_BEDROCK, "villmark_bedrock");
		blocklist.put(DESERT_GRASS, "desert_grass");


		for(RegistryObject<Block> block: blocklist.keySet()){
			ITEMS.register(blocklist.get(block),() -> new BlockItem(block.get(), new Item.Properties().group(VillMark.villMarkItemGroup)));
		}

		BLOCKS.register(bus);
		ITEMS.register(bus);
	}
	
}

