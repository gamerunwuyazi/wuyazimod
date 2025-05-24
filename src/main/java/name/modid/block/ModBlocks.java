package name.modid.block;

import name.modid.WuyaziMod;
import name.modid.block.problock.problock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
//import net.minecraft.block.AbstractBlock;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
//import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public  static Block TEST_BLOCK = registerBlocks("test_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public  static Block WUYAZI_BLOCK = registerBlocks("wuyazi_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)
                    .strength(0.1f,0.1f)));
    public static Block PRO_BLOCK = registerBlocks("pro_block",
            new problock(FabricBlockSettings.copyOf(Blocks.STONE)
                    .strength(0.5f,0.5f)));
    public static Block WOOD_TEST = registerBlocks("wood_test",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)
                    .strength(0.7f,0.7f)));
    public static Block BUILD = registerBlocks("build",
            new StairsBlock(TEST_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(TEST_BLOCK)));
    public static Block BUILD1 = registerBlocks("build1",
            new SlabBlock(AbstractBlock.Settings.copy(TEST_BLOCK)));
    public static final Block BUILD2 = registerBlocks("build2",
            new ButtonBlock(AbstractBlock.Settings.copy(TEST_BLOCK), BlockSetType.STONE, 100, false));
    public static final Block BUILD3 = registerBlocks("build3",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, AbstractBlock.Settings.copy(TEST_BLOCK),
                    BlockSetType.STONE));
    public static final Block BUILD4 = registerBlocks("build4",
            new FenceBlock(AbstractBlock.Settings.copy(TEST_BLOCK)));
    public static final Block BUILD5 = registerBlocks("build5",
            new FenceGateBlock(AbstractBlock.Settings.copy(TEST_BLOCK),WoodType.OAK));
    public static final Block BUILD6 = registerBlocks("build6",
            new WallBlock(AbstractBlock.Settings.copy(TEST_BLOCK)));
    public static final Block BUILd7 = registerBlocks("build7",
            new DoorBlock(AbstractBlock.Settings.copy(TEST_BLOCK),BlockSetType.IRON));
    public static final Block BUILD8 = registerBlocks("build8",
            new TrapdoorBlock(AbstractBlock.Settings.copy(TEST_BLOCK).nonOpaque(),BlockSetType.STONE));

    private static Block registerBlocks(String name,Block block){
        registerBlockItems(name,block);
        return Registry.register(Registries.BLOCK,new Identifier(WuyaziMod.MOD_ID,name),block);
    }

    private static Item registerBlockItems(String name, Block block){
        return Registry.register(Registries.ITEM,new Identifier(WuyaziMod.MOD_ID,name),
                new BlockItem(block,new FabricItemSettings()));
    }

    public static void registerModBlocks(){

    }
}
