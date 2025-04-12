package net.hardcorechallenge;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HardcoreChallengeMod implements ModInitializer {
    public static final String MOD_ID = "hardcore_challenge";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Hardcore Challenge Mod loaded!");
        // Init quests, events, day tracking etc.
    }

    public static Identifier id(String path) {
        return new Identifier(MOD_ID, path);
    }
}
