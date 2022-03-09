package olivermakesco.de.mcdoom;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger'mcdoom.s name.
	// That way, it'mcdoom.s clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {
		Thread thread = new DoomThread();
		thread.start();
		LOGGER.info("Hello Fabric world!");
	}
}
