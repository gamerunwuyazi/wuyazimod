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
    }
}
