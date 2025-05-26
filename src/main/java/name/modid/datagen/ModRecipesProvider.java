package name.modid.datagen;

import name.modid.WuyaziMod;
import name.modid.block.ModBlocks;
import name.modid.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.block.RedstoneBlock;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;


public class ModRecipesProvider extends FabricRecipeProvider {
    public ModRecipesProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.TEST, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TEST_BLOCK);


        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PROITEM, 1)
                .pattern("121")
                .pattern("141")
                .pattern("131")
                .input('1', Items.REDSTONE)
                .input('2', Items.OCHRE_FROGLIGHT)
                .input('3', Items.IRON_BLOCK)
                .input('4', Items.DIAMOND)
                .criterion(hasItem(Items.IRON_PICKAXE), conditionsFromItem(Items.IRON_PICKAXE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WUYAZI, 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#',Items.STONE)
                .criterion(hasItem(Items.STONE), conditionsFromItem(Items.STONE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GAMETEST, 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#',ModItems.WUYAZI)
                .criterion(hasItem(ModItems.WUYAZI), conditionsFromItem(ModItems.WUYAZI))
                .offerTo(exporter);
    }
}
