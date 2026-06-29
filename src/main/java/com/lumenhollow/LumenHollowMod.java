package com.lumenhollow;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LumenHollowMod implements ModInitializer {
    public static final String MOD_ID = "lumenhollow";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.register();
        ModBlocks.register();
        ModDimensions.register();
        LOGGER.info("Lumen Hollow initialized");
    }
}
