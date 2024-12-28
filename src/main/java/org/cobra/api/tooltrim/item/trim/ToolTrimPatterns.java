package org.cobra.api.tooltrim.item.trim;

import net.minecraft.item.Item;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import org.cobra.api.tooltrim.item.ModItems;
import org.cobra.api.tooltrim.util.ModRegistryKeys;

public class ToolTrimPatterns {

    public static final RegistryKey<ToolTrimPattern> GUARDIAN = of("guardian");

    public static void bootstrap(Registerable<ToolTrimPattern> context) {
        register(context, ModItems.ITEM, GUARDIAN);
    }

    public static void register(Registerable<ToolTrimPattern> registry, Item template, RegistryKey<ToolTrimPattern> key) {
        ToolTrimPattern toolTrimPattern = new ToolTrimPattern(
                key.getValue(), Registries.ITEM.getEntry(template), Text.translatable(Util.createTranslationKey("trim_pattern", key.getValue())), false
        );
        registry.register(key, toolTrimPattern);
    }

    public static RegistryKey<ToolTrimPattern> of(String id) {
        return RegistryKey.of(ModRegistryKeys.TRIM_PATTERN, Identifier.ofVanilla(id));
    }
}
