package net.jonson.modhorror.entity.animations;

import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.AnimationState;

public class DreadhoofAnimationHelper {

    public static void updateIdleState(
            AnimationState idleAnimationState,
            boolean isMoving,
            int tickCount,
            RandomSource random,
            int idleAnimationTimeout
    ) {
        if (isMoving) {
            idleAnimationState.stop();
        } else if (!idleAnimationState.isStarted() && idleAnimationTimeout <= 0) {
            idleAnimationTimeout = random.nextInt(40) + 80;
            idleAnimationState.start(tickCount);
        } else {
            idleAnimationTimeout--;
        }
    }

    public static int updateAttackState(
            boolean isAttacking,
            AnimationState attackAnimationState,
            int attackAnimationTimeout,
            int tickCount
    ) {
        if (isAttacking && attackAnimationTimeout <= 0) {
            attackAnimationState.start(tickCount);
            return 25;
        } else {
            attackAnimationTimeout--;
        }

        if (!isAttacking) {
            attackAnimationState.stop();
        }

        return attackAnimationTimeout;
    }
}