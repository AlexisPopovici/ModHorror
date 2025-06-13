package net.jonson.modhorror.datagen;

import net.jonson.modhorror.ModHorror;
import net.jonson.modhorror.blocks.ModBlocks;
import net.jonson.modhorror.items.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    private static final List<ItemLike> SAPPHIRE_SMELTABLES = List.of(ModItems.RAW_SAPPHIRE.get(),
            ModBlocks.SAPPHIRE_ORE.get(), ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), ModBlocks.NETHER_SAPPHIRE_ORE.get(),
            ModBlocks.END_STONE_SAPPHIRE_ORE.get());


    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreSmelting(pWriter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 0.25f,
                200, "sapphire");
        oreBlasting(pWriter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 0.25f,
                100, "sapphire");

        // blocks:
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GALAXY_BLOCK.get())
                .pattern("OOO")
                .pattern("ONO")
                .pattern("OOO")
                .define('O', Items.OBSIDIAN)
                .define('N', Items.NETHER_STAR)
                .unlockedBy(getHasName(Items.NETHER_STAR), has(Items.NETHER_STAR))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SAPPHIRE_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.SAPPHIRE.get())
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 9)
                .requires(ModBlocks.SAPPHIRE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.SAPPHIRE_BLOCK.get()), has(ModBlocks.SAPPHIRE_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_SAPPHIRE_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.RAW_SAPPHIRE.get())
                .unlockedBy(getHasName(ModItems.RAW_SAPPHIRE.get()), has(ModItems.RAW_SAPPHIRE.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_SAPPHIRE.get(), 9)
                .requires(ModBlocks.RAW_SAPPHIRE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_SAPPHIRE_BLOCK.get()), has(ModBlocks.RAW_SAPPHIRE_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLOODY_SAPPHIRE_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.BLOODY_SAPPHIRE.get())
                .unlockedBy(getHasName(ModItems.BLOODY_SAPPHIRE.get()), has(ModItems.BLOODY_SAPPHIRE.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BLOODY_SAPPHIRE.get(), 9)
                .requires(ModBlocks.BLOODY_SAPPHIRE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.BLOODY_SAPPHIRE_BLOCK.get()), has(ModBlocks.BLOODY_SAPPHIRE_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SAPPHIRE_STAIRS.get(), 4)
                .pattern("  S")
                .pattern(" SS")
                .pattern("SSS")
                .define('S', ModBlocks.SAPPHIRE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.SAPPHIRE_BLOCK.get()), has(ModBlocks.SAPPHIRE_BLOCK.get()))
                .save(pWriter); // default name

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SAPPHIRE_STAIRS.get(), 4)
                .pattern("S  ")
                .pattern("SS ")
                .pattern("SSS")
                .define('S', ModBlocks.SAPPHIRE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.SAPPHIRE_BLOCK.get()), has(ModBlocks.SAPPHIRE_BLOCK.get()))
                .save(pWriter, new ResourceLocation(ModHorror.MOD_ID, "sapphire_stairs_alt"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SAPPHIRE_SLAB.get(), 6)
                .pattern("SSS")
                .define('S', ModBlocks.SAPPHIRE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.SAPPHIRE_BLOCK.get()), has(ModBlocks.SAPPHIRE_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SAPPHIRE_WALL.get(), 6)
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModBlocks.SAPPHIRE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.SAPPHIRE_BLOCK.get()), has(ModBlocks.SAPPHIRE_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SAPPHIRE_FENCE.get(), 6)
                .pattern("SRS")
                .pattern("SRS")
                .define('S', ModBlocks.SAPPHIRE_BLOCK.get())
                .define('R', Items.STICK)
                .unlockedBy(getHasName(ModBlocks.SAPPHIRE_BLOCK.get()), has(ModBlocks.SAPPHIRE_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SAPPHIRE_FENCE_GATE.get())
                .pattern("RSR")
                .pattern("RSR")
                .define('S', ModBlocks.SAPPHIRE_BLOCK.get())
                .define('R', Items.STICK)
                .unlockedBy(getHasName(ModBlocks.SAPPHIRE_BLOCK.get()), has(ModBlocks.SAPPHIRE_BLOCK.get()))
                .save(pWriter);

        // wood blocks
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINE_WOOD.get(), 3)
                .pattern("LL")
                .pattern("LL")
                .define('L', ModBlocks.PINE_LOG.get())
                .unlockedBy(getHasName(ModBlocks.PINE_LOG.get()), has(ModBlocks.PINE_LOG.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_PINE_WOOD.get(), 3)
                .pattern("LL")
                .pattern("LL")
                .define('L', ModBlocks.STRIPPED_PINE_LOG.get())
                .unlockedBy(getHasName(ModBlocks.PINE_LOG.get()), has(ModBlocks.PINE_LOG.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINE_PLANKS.get(), 4)
                .requires(ModBlocks.PINE_LOG.get())
                .unlockedBy(getHasName(ModBlocks.PINE_LOG.get()), has(ModBlocks.PINE_LOG.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINE_PLANKS.get(), 4)
                .requires(ModBlocks.PINE_WOOD.get())
                .unlockedBy(getHasName(ModBlocks.PINE_LOG.get()), has(ModBlocks.PINE_LOG.get()))
                .save(pWriter, new ResourceLocation(ModHorror.MOD_ID, "pine_planks_alt1"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINE_PLANKS.get(), 4)
                .requires(ModBlocks.STRIPPED_PINE_LOG.get())
                .unlockedBy(getHasName(ModBlocks.PINE_LOG.get()), has(ModBlocks.PINE_LOG.get()))
                .save(pWriter, new ResourceLocation(ModHorror.MOD_ID, "pine_planks_alt2"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINE_PLANKS.get(), 4)
                .requires(ModBlocks.STRIPPED_PINE_WOOD.get())
                .unlockedBy(getHasName(ModBlocks.PINE_LOG.get()), has(ModBlocks.PINE_LOG.get()))
                .save(pWriter, new ResourceLocation(ModHorror.MOD_ID, "pine_planks_alt3"));

        // redstone related blocks
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, ModBlocks.SAPPHIRE_BUTTON.get())
                .requires(ModItems.SAPPHIRE.get())
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, ModBlocks.SAPPHIRE_PRESSURE_PLATE.get())
                .pattern("SS")
                .define('S', ModItems.SAPPHIRE.get())
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, ModBlocks.SAPPHIRE_DOOR.get(), 3)
                .pattern("SS")
                .pattern("SS")
                .pattern("SS")
                .define('S', ModItems.SAPPHIRE.get())
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, ModBlocks.SAPPHIRE_TRAPDOOR.get())
                .pattern("SS")
                .pattern("SS")
                .define('S', ModItems.SAPPHIRE.get())
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        // tools and weapons
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.SAPPHIRE_HOE.get())
                .pattern("SS")
                .pattern("A ")
                .pattern("A ")
                .define('S', ModItems.SAPPHIRE.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.SAPPHIRE_HOE.get())
                .pattern("SS")
                .pattern(" A")
                .pattern(" A")
                .define('S', ModItems.SAPPHIRE.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter, new ResourceLocation(ModHorror.MOD_ID, "sapphire_hoe_alt"));

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.SAPPHIRE_AXE.get())
                .pattern("SB")
                .pattern("AS")
                .pattern("A ")
                .define('S', ModItems.SAPPHIRE.get())
                .define('B', ModItems.BLOODY_SAPPHIRE.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.BLOODY_SAPPHIRE.get()), has(ModItems.BLOODY_SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.SAPPHIRE_AXE.get())
                .pattern("BS")
                .pattern("SA")
                .pattern(" A")
                .define('S', ModItems.SAPPHIRE.get())
                .define('B', ModItems.BLOODY_SAPPHIRE.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter, new ResourceLocation(ModHorror.MOD_ID, "sapphire_axe_alt"));

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.SAPPHIRE_PICKAXE.get())
                .pattern("SSS")
                .pattern(" A ")
                .pattern(" A ")
                .define('S', ModItems.SAPPHIRE.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.SAPPHIRE_SHOVEL.get())
                .pattern("S")
                .pattern("A")
                .pattern("A")
                .define('S', ModItems.SAPPHIRE.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SAPPHIRE_DETECTOR.get())
                .pattern(" AS")
                .pattern(" S ")
                .pattern("AA ")
                .define('S', Items.STICK)
                .define('A', ModItems.SAPPHIRE.get())
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.METAL_DETECTOR.get())
                .pattern(" AS")
                .pattern(" S ")
                .pattern("AA ")
                .define('S', Items.STICK)
                .define('A', Items.IRON_INGOT)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .save(pWriter);

        // weapons
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.SAPPHIRE_SWORD.get())
                .pattern("S")
                .pattern("B")
                .pattern("A")
                .define('S', ModItems.SAPPHIRE.get())
                .define('B', ModItems.BLOODY_SAPPHIRE.get())
                .define('A', Items.STICK)
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        // to be implemented: STAFF
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.SAPPHIRE_STAFF.get())
                .pattern("NSN")
                .pattern(" B ")
                .pattern(" B ")
                .define('S', ModItems.BLOODY_SAPPHIRE.get())
                .define('N', Items.NETHER_STAR)
                .define('B', Items.BLAZE_ROD)
                .unlockedBy(getHasName(ModItems.BLOODY_SAPPHIRE.get()), has(ModItems.BLOODY_SAPPHIRE.get()))
                .save(pWriter);

        // armour
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.SAPPHIRE_HELMET.get())
                .pattern("SSS")
                .pattern("S S")
                .define('S', ModItems.SAPPHIRE.get())
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.SAPPHIRE_BOOTS.get())
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.SAPPHIRE.get())
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.SAPPHIRE_CHESTPLATE.get())
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.SAPPHIRE.get())
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.SAPPHIRE_LEGGINGS.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.SAPPHIRE.get())
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients,
                                      RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme,
                                      String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients,
                                      RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime,
                                      String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends
            AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory,
                                     ItemLike pResult, float pExperience, int pCookingTime, String pGroup,
                                     String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                            pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,  ModHorror.MOD_ID + ":" + getItemName(pResult)
                            + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
