package org.cobra.api.tooltrim.item.trim;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.item.Item;
import net.minecraft.registry.entry.RegistryElementCodec;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Text;
import net.minecraft.text.TextCodecs;
import net.minecraft.util.Identifier;
import org.cobra.api.tooltrim.util.ModRegistryKeys;

public record ToolTrimPattern(
        Identifier assetId,
        RegistryEntry<Item> templateItem,
        Text description,
        boolean decal
) {
    public static final Codec<ToolTrimPattern> CODEC = RecordCodecBuilder.create(
            instance -> instance.group(
                            Identifier.CODEC.fieldOf("asset_id").forGetter(ToolTrimPattern::assetId),
                            Item.ENTRY_CODEC.fieldOf("template_item").forGetter(ToolTrimPattern::templateItem),
                            TextCodecs.CODEC.fieldOf("description").forGetter(ToolTrimPattern::description),
                            Codec.BOOL.fieldOf("decal").orElse(false).forGetter(ToolTrimPattern::decal)
                    )
                    .apply(instance, ToolTrimPattern::new)
    );

    public static final Codec<RegistryEntry<ToolTrimPattern>> ENTRY_CODEC = RegistryElementCodec.of(
            ModRegistryKeys.TRIM_PATTERN, CODEC
    );

    public Text getDescription(RegistryEntry<ToolTrimPattern> material) {
        return this.description.copy().fillStyle(material.value().description().getStyle());
    }
}

