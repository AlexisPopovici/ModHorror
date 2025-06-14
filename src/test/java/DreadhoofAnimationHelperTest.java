import net.jonson.modhorror.entity.animations.DreadhoofAnimationHelper;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.AnimationState;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class DreadhoofAnimationHelperTest {

    private AnimationState idleAnimationState;
    private AnimationState attackAnimationState;
    private RandomSource random;

    @BeforeEach
    public void setUp() {
        idleAnimationState = mock(AnimationState.class);
        attackAnimationState = mock(AnimationState.class);
        random = mock(RandomSource.class);
    }

    @Test
    public void testUpdateIdleState_WhenMoving_StopsIdleAnimation() {
        DreadhoofAnimationHelper.updateIdleState(idleAnimationState, true, 0, random, 0);
        verify(idleAnimationState).stop();
    }

    @Test
    public void testUpdateIdleState_WhenIdle_StartsIdleAnimation() {
        when(idleAnimationState.isStarted()).thenReturn(false);
        when(random.nextInt(40)).thenReturn(20);
        DreadhoofAnimationHelper.updateIdleState(idleAnimationState, false, 100, random, 0);
        verify(idleAnimationState).start(100);
    }

    @Test
    public void testUpdateAttackState_WhenAttackingAndTimeoutZero_StartsAttackAnimation() {
        int result = DreadhoofAnimationHelper.updateAttackState(true, attackAnimationState, 0, 50);
        verify(attackAnimationState).start(50);
        assert result == 25;
    }

    @Test
    public void testUpdateAttackState_WhenNotAttacking_StopsAttackAnimation() {
        DreadhoofAnimationHelper.updateAttackState(false, attackAnimationState, 5, 50);
        verify(attackAnimationState).stop();
    }
}