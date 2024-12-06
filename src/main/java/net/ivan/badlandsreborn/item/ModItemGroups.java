package net.ivan.badlandsreborn.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.ivan.badlandsreborn.BadlandsReborn;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BADLANDS_REBORN = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(BadlandsReborn.MOD_ID, "amber"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.amber"))
                    .icon(() -> new ItemStack(ModItems.AMBER)).entries(((displayContext, entries) -> {
                        entries.add(ModItems.AMBER);
                        entries.add(ModItems.CRIMSON_DUST);
                        entries.add(ModItems.FOSSILISED_ARTEFACT);
                        entries.add(ModItems.LAVA_ESSENCE);
                        entries.add(ModItems.INSTANT_GUNPOWDER);
                        entries.add(ModItems.OBSIDIAN_FRAMGMENT);

                    })).build());

    public static void registerItemGroups() {
        BadlandsReborn.LOGGER.info("Registering Item Groups for " + BadlandsReborn.MOD_ID);
    }

}
