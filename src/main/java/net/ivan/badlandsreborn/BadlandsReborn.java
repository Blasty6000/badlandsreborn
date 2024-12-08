package net.ivan.badlandsreborn;

import net.fabricmc.api.ModInitializer;

import net.ivan.badlandsreborn.block.ModBlocks;
import net.ivan.badlandsreborn.item.ModItemGroups;
import net.ivan.badlandsreborn.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BadlandsReborn implements ModInitializer {
	public static final String MOD_ID = "badlandsreborn";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}