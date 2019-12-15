package laz.villmark.content.biomes;

import net.minecraft.block.Blocks;
import net.minecraft.util.SharedSeedRandom;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.GenerationSettings;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class BiomeQSMangrove extends Biome{

	public BiomeQSMangrove() {
		super((new Biome.Builder())
			.surfaceBuilder(new ConfiguredSurfaceBuilder<SurfaceBuilderConfig>(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(Blocks.SAND.getDefaultState(), Blocks.SANDSTONE.getDefaultState(), Blocks.AIR.getDefaultState())))
			.precipitation(RainType.NONE)
			.category(Category.DESERT)
			.downfall(0f)
			.depth(0.2f)
			.temperature(1f)
			.scale(0.5f)
			.parent(null)
			.waterColor(0)
			.waterFogColor(0)
		);
		DefaultBiomeFeatures.addDeadBushes(this);
		
	
	}
	
	@Override
	public void decorate(Decoration stage, ChunkGenerator<? extends GenerationSettings> chunkGenerator, IWorld worldIn,
			long seed, SharedSeedRandom random, BlockPos pos) {
		super.decorate(stage, chunkGenerator, worldIn, seed, random, pos);
	}
	

}
