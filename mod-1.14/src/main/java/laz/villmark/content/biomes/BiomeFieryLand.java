package laz.villmark.content.biomes;

import static laz.villmark.VillMark.MOD_ID;

import net.minecraft.block.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class BiomeFieryLand extends Biome{

	public BiomeFieryLand() {
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

}
