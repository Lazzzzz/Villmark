package laz.villmark.content.dimension;

import java.util.function.BiFunction;

import laz.villmark.VillMark;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraft.world.dimension.Dimension;
import net.minecraft.world.dimension.DimensionType;
import net.minecraftforge.common.ModDimension;

public class VMDimensionType extends ModDimension
{
	public VMDimensionType(final ResourceLocation registryName) 
	{
		this.setRegistryName(registryName);
	}

	public static DimensionType getDimensionType() 
	{
		return DimensionType.byName(new ResourceLocation(VillMark.MOD_ID, "vm_dimension"));
	}
	
	@Override
	public BiFunction<World, DimensionType, ? extends Dimension> getFactory() 
	{
		return VMDimension::new;
	}
}