package net.ivan.badlandsreborn.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.ivan.badlandsreborn.BadlandsReborn;
import net.ivan.badlandsreborn.block.ModBlocks;
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
                        entries.add(ModBlocks.AMBER_BLOCK);
                        entries.add(ModBlocks.CACTUS_PLANKS);
                        entries.add(ModBlocks.CRACKED_CRIMSON_SHALE_BRICKS);
                        entries.add(ModBlocks.CRIMSON_SHALE);
                        entries.add(ModBlocks.CRIMSON_SHALE_BRICKS);
                        entries.add(ModBlocks.CACTUS_WOOD);
                        entries.add(ModBlocks.STRIPPED_CACTUS_WOOD);
                        entries.add(ModBlocks.POLISHED_CRIMSON_SHALE);
                        entries.add(ModBlocks.CACTUS_LOG);
                        entries.add(ModBlocks.STRIPPED_CACTUS_LOG);
                        entries.add(ModBlocks.OBSIDIAN_FRAGMENT_BLOCK);

                    })).build());

    public static void registerItemGroups() {
        BadlandsReborn.LOGGER.info("Registering Item Groups for " + BadlandsReborn.MOD_ID);
    }

}
