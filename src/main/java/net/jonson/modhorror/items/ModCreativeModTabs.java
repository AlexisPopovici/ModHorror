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

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
