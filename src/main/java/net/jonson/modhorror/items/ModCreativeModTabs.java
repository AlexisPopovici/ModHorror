package net.jonson.modhorror.items;

import net.jonson.modhorror.ModHorror;
import net.jonson.modhorror.blocks.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ModHorror.MOD_ID);

    public static final RegistryObject<CreativeModeTab> HORROR_TAB = CREATIVE_MODE_TABS.register("horror_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.horror_tab"))
                    .displayItems((itemDisplayParameters, output) -> {

                        /// ITEMS
                        output.accept(ModItems.SAPPHIRE.get());
                        output.accept(ModItems.RAW_SAPPHIRE.get());
                        output.accept(ModItems.BLOODY_SAPPHIRE.get());
                        output.accept(ModItems.SAPPHIRE_DETECTOR.get());
                        output.accept(ModItems.METAL_DETECTOR.get());
                        output.accept(ModItems.PINE_CONE.get());

                        /// FOODS
                        output.accept(ModItems.STRAWBERRY.get());

                        /// BLOCK-URI
                        output.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        output.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
                        output.accept(ModBlocks.GALAXY_BLOCK.get());
                        output.accept(ModBlocks.BLOODY_SAPPHIRE_BLOCK.get());

                        ///  ORE-URI
                        output.accept(ModBlocks.SAPPHIRE_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
                        output.accept(ModBlocks.NETHER_SAPPHIRE_ORE.get());
                        output.accept(ModBlocks.END_STONE_SAPPHIRE_ORE.get());

                        
                        /// SAPPHIRE STAIRS DOORS ETC
                        output.accept(ModBlocks.SAPPHIRE_STAIRS.get());
                        output.accept(ModBlocks.SAPPHIRE_SLAB.get());
                        output.accept(ModBlocks.SAPPHIRE_BUTTON.get());
                        output.accept(ModBlocks.SAPPHIRE_PRESSURE_PLATE.get());

                        output.accept(ModBlocks.SAPPHIRE_FENCE.get());
                        output.accept(ModBlocks.SAPPHIRE_FENCE_GATE.get());
                        output.accept(ModBlocks.SAPPHIRE_WALL.get());

                        output.accept(ModBlocks.SAPPHIRE_DOOR.get());
                        output.accept(ModBlocks.SAPPHIRE_TRAPDOOR.get());

                        output.accept(ModBlocks.HORROR_DOOR.get());

                        /// STAFF AND TOOLS
                        output.accept(ModItems.SAPPHIRE_STAFF.get());
                        output.accept(ModItems.SAPPHIRE_SHOVEL.get());
                        output.accept(ModItems.SAPPHIRE_SWORD.get());
                        output.accept(ModItems.SAPPHIRE_AXE.get());
                        output.accept(ModItems.SAPPHIRE_PICKAXE.get());
                        output.accept(ModItems.SAPPHIRE_HOE.get());

                        /// DREADHOOF EGG
                        output.accept(ModItems.DREADHOOF_SPAWN_EGG.get());

                        ///  ARMURA

                        output.accept(ModItems.SAPPHIRE_HELMET.get());
                        output.accept(ModItems.SAPPHIRE_CHESTPLATE.get());
                        output.accept(ModItems.SAPPHIRE_LEGGINGS.get());
                        output.accept(ModItems.SAPPHIRE_BOOTS.get());


                        ///  COPAC
                        output.accept(ModBlocks.PINE_LOG.get());
                        output.accept(ModBlocks.PINE_WOOD.get());
                        output.accept(ModBlocks.STRIPPED_PINE_WOOD.get());
                        output.accept(ModBlocks.STRIPPED_PINE_LOG.get());

                        output.accept(ModBlocks.PINE_PLANKS.get());
                        output.accept(ModBlocks.PINE_LEAVES.get());
                        output.accept(ModBlocks.PINE_SAPLING.get());





                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
