package net.jonson.modhorror.datagen;

import net.jonson.modhorror.ModHorror;
import net.jonson.modhorror.blocks.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ModHorror.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        customBloodySapphireBlock(ModBlocks.BLOODY_SAPPHIRE_BLOCK);
        blockWithItem(ModBlocks.SAPPHIRE_BLOCK);
        blockWithItem(ModBlocks.GALAXY_BLOCK);
        blockWithItem(ModBlocks.RAW_SAPPHIRE_BLOCK);

        blockWithItem(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
        blockWithItem(ModBlocks.END_STONE_SAPPHIRE_ORE);
        blockWithItem(ModBlocks.NETHER_SAPPHIRE_ORE);
        blockWithItem(ModBlocks.SAPPHIRE_ORE);

        stairsBlock(((StairBlock) ModBlocks.SAPPHIRE_STAIRS.get()),blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        slabBlock(((SlabBlock)  ModBlocks.SAPPHIRE_SLAB.get()),blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()),
                blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));


        buttonBlock(((ButtonBlock) ModBlocks.SAPPHIRE_BUTTON.get()), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.SAPPHIRE_PRESSURE_PLATE.get()),
                blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));

        fenceBlock(((FenceBlock) ModBlocks.SAPPHIRE_FENCE.get()), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.SAPPHIRE_FENCE_GATE.get()),
                blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        wallBlock(((WallBlock) ModBlocks.SAPPHIRE_WALL.get()), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));

        doorBlockWithRenderType(((DoorBlock) ModBlocks.SAPPHIRE_DOOR.get()),
                modLoc("block/sapphire_door_bottom"),
                modLoc("block/sapphire_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.SAPPHIRE_TRAPDOOR.get()),
                modLoc("block/sapphire_trapdoor"), true, "cutout");


    }

    private void customBloodySapphireBlock(RegistryObject<Block> blockRegistryObject) {
        this.horizontalBlock(blockRegistryObject.get(),
                models().cube(blockRegistryObject.getId().getPath(),
                                modLoc("block/sapphire_block"),
                                modLoc("block/bloody_sapphire_up_block"),
                                modLoc("block/bloody_sapphire_north_block"),
                                modLoc("block/bloody_sapphire_sew_block"),
                                modLoc("block/bloody_sapphire_sew_block"),
                                modLoc("block/bloody_sapphire_sew_block")

                        )
                        .texture("particle", modLoc("block/bloody_sapphire_sew_block"))
        );

        this.itemModels().getBuilder(blockRegistryObject.getId().getPath())
                .parent(models().getExistingFile(blockRegistryObject.getId()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(),cubeAll(blockRegistryObject.get()));

    }
}

