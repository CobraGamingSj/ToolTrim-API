package org.cobra.api.tooltrim.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import org.cobra.api.tooltrim.item.trim.ToolTrimMaterials;
import org.cobra.api.tooltrim.item.trim.ToolTrimPatterns;

public class ModTrimProviders extends TrimProvider {
    public ModTrimProviders(FabricDataOutput output) {
        super(output);
    }

    @Override
    protected void generateTrimMaterial() {
        this.registerTrimMaterial("amethyst", Items.AMETHYST_SHARD, ToolTrimMaterials.AMETHYST, "tooltrim.minecraft.amethyst", "minecraft");
    }

    @Override
    protected void generateTrimPattern() {
        this.registerTrimPattern("amethyst", Items.DIAMOND, "tooltrim.minecraft.guardian", false, ToolTrimPatterns.GUARDIAN, "minecraft");
    }
}
