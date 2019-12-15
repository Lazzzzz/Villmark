package laz.villmark.content;

import laz.villmark.VillMark;
import laz.villmark.items.TeleporterItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static laz.villmark.VillMark.MOD_ID;


public class VillMarkItems {

	private static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MOD_ID);

	public static final RegistryObject<Item> DEADSTICK = ITEMS.register("deadstick", () -> new Item(new Item.Properties().group(VillMark.villMarkItemGroup)));

	public static final RegistryObject<Item> DIMENSIONALTELEPORT = ITEMS.register("teleporting_item", () -> new TeleporterItem(new Item.Properties().group(VillMark.villMarkItemGroup)));


	public static void register(IEventBus bus) {
		ITEMS.register(bus);
	}
}
