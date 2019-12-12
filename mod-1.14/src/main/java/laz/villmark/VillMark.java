package laz.villmark;

import static laz.villmark.VillMark.MOD_ID;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import laz.villmark.content.VillMarkBlocks;
import laz.villmark.content.VillMarkItems;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MOD_ID)
public class VillMark {
	
	public static VillMark instance;
	public static final String MOD_ID = "villmark";
	public static final Logger logger = LogManager.getLogger(MOD_ID);
	
	public static final ItemGroup villMarkItemGroup = new VillMarkItemGroup();
	
	public VillMark() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		VillMarkItems.register(bus);
		VillMarkBlocks.register(bus);
		MinecraftForge.EVENT_BUS.register(this);
	}

	
}


