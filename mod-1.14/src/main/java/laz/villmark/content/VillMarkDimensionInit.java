package laz.villmark.content;

import java.util.function.BiFunction;

import laz.villmark.VillMark;
import laz.villmark.content.biomes.VMBiomeProvider;
import laz.villmark.content.biomes.VMBiomeProviderSettings;
import laz.villmark.content.dimension.VMDimension;
import laz.villmark.content.world.gen.VMChunkGenerator;
import laz.villmark.content.world.gen.VMGenSettings;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraft.world.biome.provider.BiomeProviderType;
import net.minecraft.world.dimension.Dimension;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.gen.ChunkGeneratorType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.ModDimension;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class VillMarkDimensionInit {
    public static final ResourceLocation VILLMARK = new ResourceLocation(VillMark.MOD_ID + ":" + "villmark_dim");
    public static ModDimension villmark = new ModDimension() {
        @Override
        public BiFunction<World, DimensionType, ? extends Dimension> getFactory() {
            return VMDimension::new;
        }
    }.setRegistryName("villmark:villmark_dim");

    public static ChunkGeneratorType<VMGenSettings, VMChunkGenerator> generatorType = new ChunkGeneratorType<>(VMChunkGenerator::new, false, VMGenSettings::new);

    public static BiomeProviderType<VMBiomeProviderSettings, VMBiomeProvider> biomeProviderType = new BiomeProviderType<>(VMBiomeProvider::new, VMBiomeProviderSettings::new);

    @SubscribeEvent
    public static void onDimensionModRegistry(final RegistryEvent.Register<ModDimension> event) {
        event.getRegistry().register(VillMarkDimensionInit.villmark);
        DimensionManager.registerDimension(new ResourceLocation(VillMark.MOD_ID, "villmark_dim"), VillMarkDimensionInit.villmark, null, true);
        VillMark.logger.info("Dimension done");
    
    }

}