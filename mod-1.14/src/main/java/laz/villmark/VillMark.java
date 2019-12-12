package laz.villmark;

import laz.villmark.content.VillMarkBlocks;
import net.minecraftforge.eventbus.api.IEventBus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import laz.villmark.content.VillMarkItems;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import static laz.villmark.VillMark.MOD_ID;

@Mod(MOD_ID)
public class VillMark {
	
	public static VillMark instance;
	public static final String MOD_ID = "villmark";
	private static final Logger logger = LogManager.getLogger(MOD_ID);
	
	public static final ItemGroup villMarkItemGroup = new VillMarkItemGroup();
	
	public VillMark() {
		IEventBus bus =FMLJavaModLoadingContext.get().getModEventBus();
		VillMarkItems.register(bus);
		VillMarkBlocks.register(bus);
		MinecraftForge.EVENT_BUS.register(this);
	}

	
}


