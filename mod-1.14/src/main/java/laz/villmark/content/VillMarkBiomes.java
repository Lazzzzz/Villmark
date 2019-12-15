package laz.villmark.content;

import static laz.villmark.VillMark.MOD_ID;

import java.util.Map;

import com.google.common.collect.Maps;

import laz.villmark.content.biomes.BiomeCanyon;
import laz.villmark.content.biomes.BiomeDeadBushForest;
import laz.villmark.content.biomes.BiomeDeadplains;
import laz.villmark.content.biomes.BiomeFieryLand;
import laz.villmark.content.biomes.BiomeQSMangrove;
import laz.villmark.content.biomes.BiomeQSSea;
import laz.villmark.content.biomes.BiomeRootLying;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class VillMarkBiomes {

	private static final DeferredRegister<Biome> BIOMES = new DeferredRegister<>(ForgeRegistries.BIOMES, MOD_ID);
	public static Map<RegistryObject<Biome>, String> biomelist = Maps.newHashMap();
	
	public static final RegistryObject<Biome> FIERY_LAND		 = BIOMES.register("fieryland",			 () -> new BiomeFieryLand());
	public static final RegistryObject<Biome> CANYON    		 = BIOMES.register("canyon", 			 () -> new BiomeCanyon());
	public static final RegistryObject<Biome> QUICKSAND_SEA 	 = BIOMES.register("quicksand_sea", 	 () -> new BiomeQSSea());
	public static final RegistryObject<Biome> QUICKSAND_MANGROVE = BIOMES.register("quicksand_mangrove", () -> new BiomeQSMangrove());
	public static final RegistryObject<Biome> DEADBUSH_FOREST	 = BIOMES.register("deadbush_forest",	 () -> new BiomeDeadBushForest());
	public static final RegistryObject<Biome> DEADPLAINS 		 = BIOMES.register("deadplains", 		 () -> new BiomeDeadplains());
	public static final RegistryObject<Biome> ROOTLYNG			 = BIOMES.register("rootlyng",			 () -> new BiomeRootLying());
	
	public static void register(IEventBus bus) {
		biomelist.put(FIERY_LAND, 		  "fieryland");		
		biomelist.put(CANYON, 	  		  "canyon");		
		biomelist.put(QUICKSAND_SEA,	  "quicksand_sea");
		biomelist.put(QUICKSAND_MANGROVE, "quicksand_mangrove");		
		biomelist.put(DEADBUSH_FOREST,	  "deadbush_forest");		
		biomelist.put(DEADPLAINS, 		  "deadplains");
		biomelist.put(ROOTLYNG, 		  "rootlyng");
		BIOMES.register(bus);

	}
	
}

