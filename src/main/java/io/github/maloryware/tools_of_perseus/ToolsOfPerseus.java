package io.github.maloryware.tools_of_perseus;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ToolsOfPerseus implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("Tools of Perseus");

    @Override
    public void onInitialize(ModContainer mod) {
        LOGGER.info("Hello Quilt world from {}! Stay fresh!", mod.metadata().name());
    }
}