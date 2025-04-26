package net.jonson.modhorror.datagen;

import net.jonson.modhorror.ModHorror;
import net.jonson.modhorror.blocks.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
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

