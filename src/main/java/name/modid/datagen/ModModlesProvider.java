package name.modid.datagen;

import name.modid.block.ModBlocks;
import name.modid.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModlesProvider extends FabricModelProvider {
    public ModModlesProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WUYAZI_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TEST_BLOCK);
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
    }
}
