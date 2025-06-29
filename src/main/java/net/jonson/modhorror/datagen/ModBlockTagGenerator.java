package net.jonson.modhorror.datagen;

import net.jonson.modhorror.ModHorror;
import net.jonson.modhorror.blocks.ModBlocks;
import net.jonson.modhorror.items.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
        public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ModHorror.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
            this.tag(ModTags.Blocks.METAL_DETECTOR_VALUABLES)
                    .add(ModBlocks.SAPPHIRE_ORE.get()).addTag(Tags.Blocks.ORES);

            this.tag(BlockTags.NEEDS_IRON_TOOL)
                    .add(ModBlocks.SAPPHIRE_BLOCK.get()) .add(ModBlocks.RAW_SAPPHIRE_BLOCK.get())
                    .add(ModBlocks.BLOODY_SAPPHIRE_BLOCK.get())
                    .add(ModBlocks.SAPPHIRE_ORE.get())
                    .add(ModBlocks.NETHER_SAPPHIRE_ORE.get())
                    .add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get())
                    .add(ModBlocks.END_STONE_SAPPHIRE_ORE.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL);


        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL);



        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.SAPPHIRE_BLOCK.get()) .add(ModBlocks.RAW_SAPPHIRE_BLOCK.get())
                .add(ModBlocks.BLOODY_SAPPHIRE_BLOCK.get())
                .add(ModBlocks.SAPPHIRE_ORE.get())
                .add(ModBlocks.NETHER_SAPPHIRE_ORE.get())
                .add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get())
                .add(ModBlocks.END_STONE_SAPPHIRE_ORE.get())
                .add(ModBlocks.GALAXY_BLOCK.get());

        this.tag(BlockTags.FENCES)
                .add(ModBlocks.SAPPHIRE_FENCE.get());
        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.SAPPHIRE_FENCE_GATE.get());
        this.tag(BlockTags.WALLS)
                .add(ModBlocks.SAPPHIRE_WALL.get());


        this.tag(ModTags.Blocks.NEEDS_SAPPHIRE_TOOL)
                .add(ModBlocks.GALAXY_BLOCK.get());

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.PINE_LOG.get())
                .add(ModBlocks.PINE_WOOD.get())
                .add(ModBlocks.STRIPPED_PINE_LOG.get())
                .add(ModBlocks.STRIPPED_PINE_WOOD.get());

        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.PINE_PLANKS.get());
    }

        }



