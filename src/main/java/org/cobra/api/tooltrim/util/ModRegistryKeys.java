package org.cobra.api.tooltrim.util;

import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import org.cobra.api.tooltrim.ToolTrimAPI;
import org.cobra.api.tooltrim.item.trim.ToolTrimMaterial;
import org.cobra.api.tooltrim.item.trim.ToolTrimPattern;

public class ModRegistryKeys {
    public static final RegistryKey<Registry<String>> STRING = RegistryKeys.of("string");
    public static final RegistryKey<Registry<ToolTrimMaterial>> TRIM_MATERIAL = RegistryKeys.of("trim_material");
    public static final RegistryKey<Registry<ToolTrimPattern>> TRIM_PATTERN = RegistryKeys.of("trim_pattern");

    public static void register() {
        ToolTrimAPI.LOGGER.info("Loaded Registry Keys!");
    }
}
