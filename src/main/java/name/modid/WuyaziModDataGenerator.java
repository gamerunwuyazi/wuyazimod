package name.modid;

import name.modid.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class WuyaziModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(MdoLoorTableProvider::new);
		pack.addProvider(ModBlockTagsProvider::new);
		pack.addProvider(ModEnUsLangProvider::new);
		pack.addProvider(ModItemTagsProvider::new);
		pack.addProvider(ModModlesProvider::new);
		pack.addProvider(ModRecipesProvider::new);
		pack.addProvider(ModZhCnLangProvider::new);
	}
}
