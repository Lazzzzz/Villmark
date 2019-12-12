package laz.villmark.content.biomes;

import laz.villmark.content.world.gen.VMGenSettings;
import laz.villmark.content.world.gen.VMWorldType;
import net.minecraft.world.biome.provider.IBiomeProviderSettings;
import net.minecraft.world.storage.WorldInfo;

public class VMBiomeProviderSettings implements IBiomeProviderSettings
{
	private WorldInfo worldInfo;
    private VMGenSettings genSettings;

    public VMBiomeProviderSettings setWorldInfo(WorldInfo worldInfo) 
    {
    	worldInfo.setGenerator(new VMWorldType());
        this.worldInfo = worldInfo;
        return this;
    }

    public VMBiomeProviderSettings setGeneratorSettings(VMGenSettings genSettings) 
    {
        this.genSettings = genSettings;
        return this;
    }

    public WorldInfo getWorldInfo() 
    {
    	worldInfo.setGenerator(new VMWorldType());
        return worldInfo;
    }

    public VMGenSettings getGeneratorSettings() 
    {
        return genSettings;
    }
    
    
}