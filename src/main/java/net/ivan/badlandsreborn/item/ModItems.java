package net.ivan.badlandsreborn.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.ivan.badlandsreborn.BadlandsReborn;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item AMBER = registerItem("amber", new Item(new Item.Settings()));
    public static final Item CRIMSON_DUST = registerItem("crimson_dust", new Item(new Item.Settings()));
    public static final Item FOSSILISED_ARTEFACT = registerItem("fossilised_artefact", new Item(new Item.Settings()));
    public static final Item INSTANT_GUNPOWDER = registerItem("instant_gunpowder", new Item(new Item.Settings()));
    public static final Item LAVA_ESSENCE = registerItem("lava_essence", new Item(new Item.Settings()));
    public static final Item OBSIDIAN_FRAMGMENT = registerItem("obsidian_fragment", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BadlandsReborn.MOD_ID, name), item);

    }

    public static void registerModItems() {
        BadlandsReborn.LOGGER.info("Registering Mod Items for " + BadlandsReborn.MOD_ID);
    }

}
