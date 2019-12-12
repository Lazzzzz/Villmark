package laz.villmark.content.world.gen;

import java.util.function.LongFunction;

import laz.villmark.content.biomes.VMBiomeLayer;
import laz.villmark.content.biomes.VMLayerUtil;
import net.minecraft.world.WorldType;
import net.minecraft.world.gen.IExtendedNoiseRandom;
import net.minecraft.world.gen.OverworldGenSettings;
import net.minecraft.world.gen.area.IArea;
import net.minecraft.world.gen.area.IAreaFactory;
import net.minecraft.world.gen.layer.EdgeBiomeLayer;
import net.minecraft.world.gen.layer.ZoomLayer;

public class VMWorldType extends WorldType
{
	public VMWorldType() 
	{
		super("vm_type");
	}

	@Override
	public <T extends IArea, C extends IExtendedNoiseRandom<T>> IAreaFactory<T> getBiomeLayer(IAreaFactory<T> parentLayer, OverworldGenSettings chunkSettings, LongFunction<C> contextFactory) 
	{
        parentLayer = (new VMBiomeLayer(getWorldType(), (VMGenSettings) chunkSettings)).apply(contextFactory.apply(200L), parentLayer);
        parentLayer = VMLayerUtil.repeat(1000L, ZoomLayer.NORMAL, parentLayer, 2, contextFactory);
        parentLayer = EdgeBiomeLayer.INSTANCE.apply(contextFactory.apply(1000L), parentLayer);
        return parentLayer;
    }
}