package net.jonson.modhorror.blocks;

import net.jonson.modhorror.sounds.ModSounds;
import net.minecraft.core.BlockPos;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.BlockHitResult;

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
}
