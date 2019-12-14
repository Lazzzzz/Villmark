package laz.villmark.content.dimension;

import laz.villmark.VillMark;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.dimension.DimensionType;
import net.minecraftforge.common.ModDimension;
import net.minecraftforge.registries.ObjectHolder;

public class ModDimensions {

    public static final ResourceLocation DIMENSION_ID = new ResourceLocation(VillMark.MOD_ID, "vmdimension");

    @ObjectHolder("villmark:vmdimension")
    public static ModDimension DIMENSION;

    public static DimensionType DIMENSION_TYPE;
}