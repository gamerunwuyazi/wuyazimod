package name.modid;

import name.modid.block.ModBlocks;
import name.modid.item.ModItemGrop;
import name.modid.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WuyaziMod implements ModInitializer {
	public static final String MOD_ID = "wuyazimod";
	/**
	 * This logger is used to write text to the console and the log file.
	 * It is considered best practice to use your mod id as the logger's name.
	 * That way, it's clear which mod wrote info, warnings, and errors.
	 * <p>
	 *{@code hyggy}
	 *<p>
	 *This code runs as soon as Minecraft is in a mod-load-ready state.
	 *However, some things (like resources) may still be uninitialized.
	 *Proceed with mild caution.
	 */
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        LOGGER.info("Hello Fabric world!");
		ModItems.registerModItems();
		ModItemGrop.registerModItemGroup();
		ModBlocks.registerModBlocks();

		FuelRegistry.INSTANCE.add(ModItems.GAMETEST,32767);
	}
}