package org.cobra.api.tooltrim.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.registry.RegistryWrapper;
import org.cobra.api.tooltrim.util.ModRegistryKeys;

import java.util.concurrent.CompletableFuture;

public class DynamicRegistryGen extends FabricDynamicRegistryProvider {
    public DynamicRegistryGen(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup registries, Entries entries) {
//        entries.addAll(registries.getOrThrow(ModRegistryKeys.TRIM_PATTERN));
//        entries.addAll(registries.getOrThrow(ModRegistryKeys.TRIM_MATERIAL));
    }

    @Override
    public String getName() {
        return "null";
    }
}
