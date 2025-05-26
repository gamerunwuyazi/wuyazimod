package name.modid.tag;

import name.modid.WuyaziMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModBlockTags {
    public static final TagKey<Block> TESTA_BLOCK = of("test1_block");

    public static final TagKey<Block> TEST_TOOL_PRO = of("test_tool_pro");
    private static TagKey<Block> of(String id) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier(WuyaziMod.MOD_ID,id));
    }
}
