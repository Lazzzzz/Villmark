package laz.villmark.content.dimension;

import net.minecraft.world.biome.provider.IBiomeProviderSettings;
import net.minecraft.world.storage.WorldInfo;

public class VMBiomeProviderSettings implements IBiomeProviderSettings {
	   private WorldInfo worldInfo;
	   private VMGenSettings generatorSettings;

	   public VMBiomeProviderSettings setWorldInfo(WorldInfo info) {
	      this.worldInfo = info;
	      return this;
	   }

	   public VMBiomeProviderSettings setGeneratorSettings(VMGenSettings p_205441_1_) {
	      this.generatorSettings = p_205441_1_;
	      return this;
	   }

	   public WorldInfo getWorldInfo() {
	      return this.worldInfo;
	   }

	   public VMGenSettings getGeneratorSettings() {
	      return this.generatorSettings;
	   }
	}