package laz.villmark;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import laz.villmark.lists.BlockList;
import laz.villmark.lists.ItemList;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("villmark")
public class VillMark {
	
	public static VillMark instance;
	public static final String modid = "villmark";
	private static final Logger logger = LogManager.getLogger(modid);
	
	public static final ItemGroup villMarkItemGroup = new VillMarkItemGroup();
	
	public VillMark() {
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
		
		
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	private void setup(final FMLCommonSetupEvent event) {
		
	}

	private void clientRegistries(final FMLClientSetupEvent event) {
		
	}

	@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents{
		
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {
			for (int i = 0; i < ItemList.itemlist.size(); i++) {
				event.getRegistry().register(ItemList.itemlist.get(i));					
			}
			
			logger.info("Items done");
		}
		
		@SubscribeEvent
		public static void registerBlocks(final RegistryEvent.Register<Block> event) {
				for (int i = 0; i < BlockList.blocklist.size(); i++) {
					event.getRegistry().register(BlockList.blocklist.get(i));					
				}
			
			logger.info("Blocks done");
		}
	
	}
	
	public static ResourceLocation location(String name) {
		return new ResourceLocation(modid, name);
	}
	
}


