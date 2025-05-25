package name.modid.datagen;

import name.modid.block.ModBlocks;
import name.modid.block.ModBlocksFamilis;
import name.modid.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.family.BlockFamily;

public class ModModlesProvider extends FabricModelProvider {
    public ModModlesProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        ModBlocksFamilis.getFamilies()
                .filter(BlockFamily::shouldGenerateModels)
                .forEach(family ->
                        blockStateModelGenerator.registerCubeAllModelTexturePool(family.getBaseBlock()).family(family));

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WUYAZI_BLOCK);
        //blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TEST_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PRO_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WOOD_TEST);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.TEST, Models.GENERATED);
        itemModelGenerator.register(ModItems.CORN, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHESS, Models.GENERATED);
        itemModelGenerator.register(ModItems.STRAWBERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.WUYAZI, Models.GENERATED);
        itemModelGenerator.register(ModItems.PROITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.GAMETEST, Models.GENERATED);

        itemModelGenerator.register(ModItems.TEST_TOOL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TEST_TOOL1, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TEST_TOOL2, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TEST_TOOL3, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TEST_TOOL4, Models.HANDHELD);
    }
}
