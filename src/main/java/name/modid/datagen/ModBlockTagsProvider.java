package name.modid.datagen;

import name.modid.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.TEST_BLOCK)
                .add(ModBlocks.WUYAZI_BLOCK)
                .add(ModBlocks.PRO_BLOCK)
                .add(ModBlocks.WOOD_TEST)
                .add(ModBlocks.BUILD1)
                .add(ModBlocks.BUILD2)
                .add(ModBlocks.BUILD3)
                .add(ModBlocks.BUILD4)
                .add(ModBlocks.BUILD5)
                .add(ModBlocks.BUILD6)
                .add(ModBlocks.BUILD7)
                .add(ModBlocks.BUILD8);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.TEST_BLOCK)
                .add(ModBlocks.PRO_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.WUYAZI_BLOCK);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.BUILD4);
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.BUILD6);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.BUILD5);
    }
}
