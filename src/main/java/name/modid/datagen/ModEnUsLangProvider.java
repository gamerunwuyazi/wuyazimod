package name.modid.datagen;

import name.modid.block.ModBlocks;
import name.modid.item.ModFoodComponents;
import name.modid.item.ModItemGrop;
import name.modid.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryWrapper;

import javax.print.MultiDoc;
import java.util.concurrent.CompletableFuture;

public class ModEnUsLangProvider extends FabricLanguageProvider {
    public ModEnUsLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.CORN, "corn");
        translationBuilder.add(ModItems.TEST, "test");
        translationBuilder.add(ModItems.CHESS, "chess");
        translationBuilder.add(ModItems.STRAWBERRY, "dtrawberry");
        translationBuilder.add(ModItems.WUYAZI, "wuyazi");
        translationBuilder.add(ModItems.PROITEM, "pro item");
        translationBuilder.add(ModItems.GAMETEST, "gametest");

        translationBuilder.add(ModBlocks.PRO_BLOCK, "pro block");
        translationBuilder.add(ModBlocks.TEST_BLOCK, "test block");
        translationBuilder.add(ModBlocks.WUYAZI_BLOCK, "wuyazi block");
        translationBuilder.add(ModBlocks.WOOD_TEST, "wood test");

        translationBuilder.add("itemGroup.wuyazimod_group", "item group");
    }
}
