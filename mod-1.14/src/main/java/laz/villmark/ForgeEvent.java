package laz.villmark;

import laz.villmark.content.dimension.ModDimensions;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.event.world.RegisterDimensionsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ForgeEvent {
    
    @SubscribeEvent
    public void onDimensionRegistry(RegisterDimensionsEvent event) {
        ModDimensions.DIMENSION_TYPE = DimensionManager.registerOrGetDimension(ModDimensions.DIMENSION_ID, ModDimensions.DIMENSION, null, true);
    }
}
