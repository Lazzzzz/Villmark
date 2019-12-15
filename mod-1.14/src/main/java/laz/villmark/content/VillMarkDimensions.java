package laz.villmark.content;

import laz.villmark.VillMark;
import laz.villmark.dimension.BetterBiomeProvider;
import laz.villmark.dimension.VillMarkDim;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraft.world.biome.provider.BiomeProviderType;
import net.minecraft.world.biome.provider.OverworldBiomeProviderSettings;
import net.minecraft.world.dimension.Dimension;
import net.minecraft.world.dimension.DimensionType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.ModDimension;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.world.RegisterDimensionsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.BiFunction;

import static laz.villmark.VillMark.MOD_ID;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class VillMarkDimensions {
    private static final DeferredRegister<ModDimension> DIMENSION = new DeferredRegister<>(ForgeRegistries.MOD_DIMENSIONS, MOD_ID);
    private static final DeferredRegister<BiomeProviderType<?, ?>> BIOMEPROVIDER = new DeferredRegister<>(ForgeRegistries.BIOME_PROVIDER_TYPES, MOD_ID);


    public static final ResourceLocation Villmark_Dimension = new ResourceLocation(MOD_ID + ":villmark_world");
    public static ModDimension VillMark_ModDimension = new ModDimension() {
        @Override
        public BiFunction<World, DimensionType, ? extends Dimension> getFactory() {
            return VillMarkDim::new;
        }
    };

    public static final RegistryObject<BiomeProviderType<OverworldBiomeProviderSettings, BetterBiomeProvider>> VILLMARK_PROVIDER = BIOMEPROVIDER.register(
            "villmark_provider", () -> new BiomeProviderType<>(BetterBiomeProvider::new, OverworldBiomeProviderSettings::new));


    public static final RegistryObject<ModDimension> VILLMARK_WORLD = DIMENSION.register("villmark_world", () -> VillMark_ModDimension);

    public static DimensionType getVillMarkDimensionType() {
        return DimensionType.byName(Villmark_Dimension);
    }

    @SubscribeEvent
    public static void onDimensionModRegistry(final RegistryEvent.Register<ModDimension> event) {
        DimensionManager.registerDimension(Villmark_Dimension, VillMark_ModDimension, null, true);
    }

    public static void register(IEventBus bus) {
        DIMENSION.register(bus);
        BIOMEPROVIDER.register(bus);
    }
}
