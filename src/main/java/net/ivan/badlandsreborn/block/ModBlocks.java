package net.ivan.badlandsreborn.block;
import net.ivan.badlandsreborn.BadlandsReborn;
import net.ivan.badlandsreborn.BadlandsReborn;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
public class ModBlocks {
    public static final Block CACTUS_PLANKS = registerBlock("cactus_planks",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.BAMBOO_WOOD).burnable()
                    .strength(2.0f, 2.0f)));

    public static final Block CACTUS_WOOD = registerBlock("cactus_wood",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.BAMBOO_WOOD).burnable()
                    .strength(2.0f, 2.0f)));

    public static final Block CACTUS_LOG = registerBlock("cactus_log",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.BAMBOO_WOOD).burnable()
                    .strength(2.0f, 2.0f)));

    public static final Block STRIPPED_CACTUS_WOOD = registerBlock("stripped_cactus_wood",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.BAMBOO_WOOD).burnable()
                    .strength(2.0f, 2.0f)));

    public static final Block STRIPPED_CACTUS_LOG = registerBlock("stripped_cactus_log",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.BAMBOO_WOOD).burnable()
                    .strength(2.0f, 2.0f)));

    public static final Block AMBER_BLOCK = registerBlock("amber_block",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.AMETHYST_BLOCK).luminance(state -> 7)
                    .strength(3.0f, 6.0f).requiresTool()));

    public static final Block CRACKED_CRIMSON_SHALE_BRICKS = registerBlock("cracked_crimson_shale_bricks",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .strength(1.5f, 6.0f).requiresTool()));

    public static final Block CRIMSON_SHALE = registerBlock("crimson_shale",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE)
                    .strength(1.5f, 6.0f).requiresTool()));

    public static final Block CRIMSON_SHALE_BRICKS = registerBlock("crimson_shale_bricks",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .strength(1.5f, 6.0f).requiresTool()));

    public static final Block POLISHED_CRIMSON_SHALE = registerBlock("polished_crimson_shale",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.POLISHED_DEEPSLATE)
                    .strength(1.5f, 6.0f).requiresTool()));

        public static final Block OBSIDIAN_FRAGMENT_BLOCK = registerBlock("obsidian_fragment_block",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.AMETHYST_CLUSTER)
                    .strength(50f, 1200f).requiresTool()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(BadlandsReborn.MOD_ID, name), block);
    }
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(BadlandsReborn.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
    public static void registerModBlocks() {
        BadlandsReborn.LOGGER.info("Registering Mod Blocks for " + BadlandsReborn.MOD_ID);
    }
}