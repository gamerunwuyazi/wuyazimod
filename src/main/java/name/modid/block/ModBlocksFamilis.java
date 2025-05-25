package name.modid.block;

import com.google.common.collect.Maps;
import net.minecraft.block.Block;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.registry.Registries;

import java.util.Map;
import java.util.stream.Stream;

public class ModBlocksFamilis {
    private static final Map<Block, BlockFamily> BASE_BLOCKS_TO_FAMILIES = Maps.<Block, BlockFamily>newHashMap();

    public static final BlockFamily TEST = register(ModBlocks.TEST_BLOCK)
            .stairs(ModBlocks.BUILD)
            .slab(ModBlocks.BUILD1)
            .button(ModBlocks.BUILD2)
            .pressurePlate(ModBlocks.BUILD3)
            .fence(ModBlocks.BUILD4)
            .fenceGate(ModBlocks.BUILD5)
            .wall(ModBlocks.BUILD6)
            .door(ModBlocks.BUILD7)
            .trapdoor(ModBlocks.BUILD8)
            .build();

    public static BlockFamily.Builder register(Block baseBlock) {
        BlockFamily.Builder builder = new BlockFamily.Builder(baseBlock);
        BlockFamily blockFamily = (BlockFamily)BASE_BLOCKS_TO_FAMILIES.put(baseBlock, builder.build());
        if (blockFamily != null) {
            throw new IllegalStateException("Duplicate family definition for " + Registries.BLOCK.getId(baseBlock));
        } else {
            return builder;
        }
    }
    public static Stream<BlockFamily> getFamilies() {
        return BASE_BLOCKS_TO_FAMILIES.values().stream();
    }
}
