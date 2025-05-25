package name.modid.datagen;

import name.modid.block.ModBlocks;
import name.modid.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ModZhCnLangProvider extends FabricLanguageProvider {
    public ModZhCnLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "zh_cn");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.CORN, "玉米");
        translationBuilder.add(ModItems.TEST, "测试");
        translationBuilder.add(ModItems.CHESS, "国际象棋");
        translationBuilder.add(ModItems.STRAWBERRY, "草莓");
        translationBuilder.add(ModItems.WUYAZI, "无崖子");
        translationBuilder.add(ModItems.PROITEM, "高级物品 探矿器");
        translationBuilder.add(ModItems.GAMETEST, "超级燃料");

        translationBuilder.add(ModBlocks.PRO_BLOCK, "高级方块");
        translationBuilder.add(ModBlocks.TEST_BLOCK, "测试方块");
        translationBuilder.add(ModBlocks.WUYAZI_BLOCK, "无崖子方块");
        translationBuilder.add(ModBlocks.WOOD_TEST, "木镐可挖掘");

        translationBuilder.add("itemGroup.wuyazimod_group", "物品组");
    }
}
