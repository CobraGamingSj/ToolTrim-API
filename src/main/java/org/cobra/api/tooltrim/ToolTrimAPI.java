package org.cobra.api.tooltrim;

import net.fabricmc.api.ModInitializer;

import org.cobra.api.tooltrim.item.ModItems;
import org.cobra.api.tooltrim.util.ModRegistryKeys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ToolTrimAPI implements ModInitializer {
	public static final String MOD_ID = "tooltrim";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModRegistryKeys.register();
		ModItems.register();
	}
}