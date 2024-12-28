package org.cobra.api.tooltrim;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import org.cobra.api.tooltrim.data.ModTrimProviders;
import org.cobra.api.tooltrim.data.TrimProvider;

public class ToolTrimAPIDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

//		pack.addProvider(DynamicRegistryGen::new);
		pack.addProvider(ModTrimProviders::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
//		registryBuilder.addRegistry(ModRegistryKeys.TRIM_PATTERN, ToolTrimPatterns::bootstrap);
//		registryBuilder.addRegistry(ModRegistryKeys.TRIM_MATERIAL, ToolTrimMaterials::bootstrap);
	}
}
