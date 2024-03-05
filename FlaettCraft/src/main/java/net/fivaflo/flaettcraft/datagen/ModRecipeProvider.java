package net.fivaflo.flaettcraft.datagen;

import net.fivaflo.flaettcraft.FlaettCraft;
import net.fivaflo.flaettcraft.block.ModBlocks;
import net.fivaflo.flaettcraft.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> Vibranium_Smeltables = List.of(ModItems.Raw_Vibranium.get(),
            ModBlocks.Vibranium_Ore.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreSmelting(pWriter, Vibranium_Smeltables, RecipeCategory.MISC, ModItems.Vibranium.get(), 1f, 300, "vibranium");
        oreBlasting(pWriter, Vibranium_Smeltables, RecipeCategory.MISC, ModItems.Vibranium.get(), 1f, 150, "vibranium");

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.Vibranium_Sword.get())
                .pattern(" V ")
                .pattern(" V ")
                .pattern(" S ")
                .define('V', ModItems.Vibranium.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.Vibranium.get()), has(ModItems.Vibranium.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.Vibranium_Pickaxe.get())
                .pattern("VVV")
                .pattern(" S ")
                .pattern(" S ")
                .define('V', ModItems.Vibranium.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.Vibranium.get()), has(ModItems.Vibranium.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.Vibranium_Axe.get())
                .pattern(" VV")
                .pattern(" SV")
                .pattern(" S ")
                .define('V', ModItems.Vibranium.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.Vibranium.get()), has(ModItems.Vibranium.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.Vibranium_Shovel.get())
                .pattern(" V ")
                .pattern(" S ")
                .pattern(" S ")
                .define('V', ModItems.Vibranium.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.Vibranium.get()), has(ModItems.Vibranium.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.Vibranium_Hoe.get())
                .pattern("VV ")
                .pattern(" S ")
                .pattern(" S ")
                .define('V', ModItems.Vibranium.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.Vibranium.get()), has(ModItems.Vibranium.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.Vibranium_Helmet.get())
                .pattern("VVV")
                .pattern("V V")
                .pattern("   ")
                .define('V', ModItems.Vibranium.get())
                .unlockedBy(getHasName(ModItems.Vibranium.get()), has(ModItems.Vibranium.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.Vibranium_Chestplate.get())
                .pattern("V V")
                .pattern("VVV")
                .pattern("VVV")
                .define('V', ModItems.Vibranium.get())
                .unlockedBy(getHasName(ModItems.Vibranium.get()), has(ModItems.Vibranium.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.Vibranium_Leggings.get())
                .pattern("VVV")
                .pattern("V V")
                .pattern("V V")
                .define('V', ModItems.Vibranium.get())
                .unlockedBy(getHasName(ModItems.Vibranium.get()), has(ModItems.Vibranium.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.Vibranium_Boots.get())
                .pattern("   ")
                .pattern("V V")
                .pattern("V V")
                .define('V', ModItems.Vibranium.get())
                .unlockedBy(getHasName(ModItems.Vibranium.get()), has(ModItems.Vibranium.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.FlaettBlock.get())
                .pattern("VVV")
                .pattern("VVV")
                .pattern("VVV")
                .define('V', ModItems.Vibranium.get())
                .unlockedBy(getHasName(ModItems.Vibranium.get()), has(ModItems.Vibranium.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ValeBlock.get())
                .pattern("GBR")
                .pattern(" F ")
                .pattern("GBR")
                .define('F', ModBlocks.FlaettBlock.get())
                .define('G', Items.GREEN_DYE)
                .define('B', Items.BONE_MEAL)
                .define('R', Items.RED_DYE)
                .unlockedBy(getHasName(ModBlocks.FlaettBlock.get()), has(ModBlocks.FlaettBlock.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.FinnBlock.get())
                .pattern("LLL")
                .pattern("LFL")
                .pattern("LLL")
                .define('F', ModBlocks.FlaettBlock.get())
                .define('L', Items.LIME_DYE)
                .unlockedBy(getHasName(ModBlocks.FlaettBlock.get()), has(ModBlocks.FlaettBlock.get()))
                .save(pWriter);

    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                            pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,  FlaettCraft.MODID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
