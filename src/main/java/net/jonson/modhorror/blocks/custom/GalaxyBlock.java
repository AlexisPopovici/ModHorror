package net.jonson.modhorror.blocks.custom;

import net.jonson.modhorror.sounds.ModSounds;
import net.minecraft.core.BlockPos;

import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GalaxyBlock extends Block {
    public GalaxyBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player,
                                 InteractionHand hand, BlockHitResult hit) {
        if (!level.isClientSide) {
            level.playSound(null, pos, ModSounds.GALAXY_BLOCK_SOUND.get(), SoundSource.BLOCKS, 1.0f, 1.0f);
        }
        return InteractionResult.SUCCESS;
    }


    @Override
    public void onPlace(BlockState pState, Level pLevel, BlockPos pPos, BlockState pOldState, boolean pMovedByPiston) {

        if (!pLevel.isClientSide) { // Asigură-te că rulează doar pe server
            pLevel.playSound(null, pPos, SoundEvents.NOTE_BLOCK_FLUTE.get(), SoundSource.BLOCKS, 1.0f, 1.0f);
        }
    }

    @Override
    public void onRemove(BlockState pState, Level pLevel, BlockPos pPos, BlockState pNewState, boolean pMovedByPiston) {
        if (!pLevel.isClientSide) { // Asigură-te că rulează doar pe server
            pLevel.playSound(null, pPos, SoundEvents.NOTE_BLOCK_FLUTE.get(), SoundSource.BLOCKS, 1.0f, 1.0f);
        }
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable BlockGetter pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
        pTooltip.add(Component.translatable("tooltip.modhorror.galaxy_block.tooltip"));
        super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
    }
}
