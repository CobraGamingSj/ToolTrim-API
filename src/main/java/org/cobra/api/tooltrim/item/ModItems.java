package org.cobra.api.tooltrim.item;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.SmithingTemplateItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import java.util.function.Function;

public class ModItems {

    public static final Item ITEM = registerItem("item", SmithingTemplateItem::of, new Item.Settings().rarity(Rarity.RARE));

    private static Item registerItem(String id, Function<Item.Settings, Item> factory, Item.Settings settings) {
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, Identifier.ofVanilla(id));

        return Items.register(Items.keyOf(id), factory, settings.registryKey(key));
    }

    public static void register() {

    }

}
