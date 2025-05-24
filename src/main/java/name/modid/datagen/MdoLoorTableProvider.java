package name.modid.datagen;

import name.modid.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class MdoLoorTableProvider extends FabricBlockLootTableProvider {
    public MdoLoorTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.TEST_BLOCK);
        addDrop(ModBlocks.PRO_BLOCK);
        addDrop(ModBlocks.WUYAZI_BLOCK);
        addDrop(ModBlocks.WOOD_TEST);
        addDrop(ModBlocks.BUILD, slabDrops(ModBlocks.BUILD));
        addDrop(ModBlocks.BUILD1);
        addDrop(ModBlocks.BUILD2);
        addDrop(ModBlocks.BUILD3);
        addDrop(ModBlocks.BUILD4);
        addDrop(ModBlocks.BUILD5);
        addDrop(ModBlocks.BUILD6);
        addDrop(ModBlocks.BUILd7, slabDrops(ModBlocks.BUILd7));
        addDrop(ModBlocks.BUILD8);
    }
}
