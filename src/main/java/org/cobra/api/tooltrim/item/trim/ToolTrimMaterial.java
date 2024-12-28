package org.cobra.api.tooltrim.item.trim;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.entry.RegistryElementCodec;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Text;
import net.minecraft.text.TextCodecs;
import net.minecraft.util.dynamic.Codecs;
import org.cobra.api.tooltrim.util.ModRegistryKeys;

import java.util.Map;

public record ToolTrimMaterial(
        String assetName,
        RegistryEntry<Item> ingredient,
        Text description
) {
    // Codec for serializing and deserializing TrimMaterial
    public static final Codec<ToolTrimMaterial> CODEC = RecordCodecBuilder.create(
            instance -> instance.group(
                            Codecs.IDENTIFIER_PATH.fieldOf("asset_name").forGetter(ToolTrimMaterial::assetName),
                            Item.ENTRY_CODEC.fieldOf("ingredient").forGetter(ToolTrimMaterial::ingredient),
                            TextCodecs.CODEC.fieldOf("description").forGetter(ToolTrimMaterial::description)
                    )
                    .apply(instance, ToolTrimMaterial::new)
    );

    public static final Codec<RegistryEntry<ToolTrimMaterial>> ENTRY_CODEC = RegistryElementCodec.of(
            ModRegistryKeys.TRIM_MATERIAL, CODEC
    );

    // Factory method for creating TrimMaterial
    public static ToolTrimMaterial of(
            String assetName,
            Item ingredient,
            Text description
    ) {
        return new ToolTrimMaterial(
                assetName,
                Registries.ITEM.getEntry(ingredient),
                description
        );
    }
}


