package name.modid.tag;

import name.modid.WuyaziMod;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModBlockTags {
    public static final TagKey<Block> TESTA_BLOCK = of("test1_block");
    private static TagKey<Block> of(String id) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier(WuyaziMod.MOD_ID,id));
    }
}
