package org.cobra.api.tooltrim.item.trim;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import org.cobra.api.tooltrim.util.ModRegistryKeys;

public class ToolTrimMaterials {

    public static final RegistryKey<ToolTrimMaterial> AMETHYST = of("amethyst");

    public static void bootstrap(Registerable<ToolTrimMaterial> context) {
        register(context, AMETHYST, Items.AMETHYST_SHARD, Style.EMPTY.withColor(14931140));
    }

    private static void register(Registerable<ToolTrimMaterial> registry, RegistryKey<ToolTrimMaterial> key, Item ingredient, Style style) {
        ToolTrimMaterial toolTrimMaterial = ToolTrimMaterial.of(key.getValue().getPath(), ingredient, Text.translatable(Util.createTranslationKey("trim_material", key.getValue())).fillStyle(style));
        registry.register(key, toolTrimMaterial);
    }

    public static RegistryKey<ToolTrimMaterial> of(String id) {
        return RegistryKey.of(ModRegistryKeys.TRIM_MATERIAL, Identifier.ofVanilla(id));
    }
}
