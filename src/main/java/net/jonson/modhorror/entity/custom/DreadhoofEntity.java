    package net.jonson.modhorror.entity.custom;


    import net.jonson.modhorror.entity.ai.DreadhoofAttackGoal;
    import net.jonson.modhorror.entity.animations.DreadhoofAnimationHelper;
    import net.jonson.modhorror.items.ModItems;
    import net.minecraft.network.syncher.EntityDataAccessor;
    import net.minecraft.network.syncher.EntityDataSerializers;
    import net.minecraft.network.syncher.SynchedEntityData;
    import net.minecraft.sounds.SoundEvent;
    import net.minecraft.sounds.SoundEvents;
    import net.minecraft.world.damagesource.DamageSource;
    import net.minecraft.world.entity.AnimationState;
    import net.minecraft.world.entity.EntityType;
    import net.minecraft.world.entity.Pose;
    import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
    import net.minecraft.world.entity.ai.attributes.Attributes;
    import net.minecraft.world.entity.ai.goal.FloatGoal;
    import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
    import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
    import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
    import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
    import net.minecraft.world.entity.monster.Monster;
    import net.minecraft.world.entity.player.Player;
    import net.minecraft.world.level.Level;
    import org.jetbrains.annotations.Nullable;

    public class DreadhoofEntity extends Monster {
        private static final EntityDataAccessor<Boolean> ATTACKING =
                SynchedEntityData.defineId(DreadhoofEntity.class, EntityDataSerializers.BOOLEAN);

        public DreadhoofEntity(EntityType<? extends Monster> pEntityType, Level pLevel) {
            super(pEntityType, pLevel);
        }


        public final AnimationState idleAnimationState = new AnimationState();
        private int idleAnimationTimeout = 0;


        public final AnimationState attackAnimationState = new AnimationState();
        public int attackAnimationTimeout = 0;

        @Override
        protected void defineSynchedData() {
            super.defineSynchedData();
            this.entityData.define(ATTACKING, false);
        }

        public void setAttacking(boolean attacking){
            this.entityData.set(ATTACKING, attacking);
        }

        public boolean isAttacking(){
            return this.entityData.get(ATTACKING);
        }

        @Override
        public void tick() {
            super.tick();

            if (this.level().isClientSide()) {
                setupAnimationStates();
            }
        }

        public boolean isMoving() {
            return this.getDeltaMovement().horizontalDistanceSqr() > 1.0E-6;
        }

        private void setupAnimationStates() {
            DreadhoofAnimationHelper.updateIdleState(idleAnimationState, isMoving(), tickCount, random, idleAnimationTimeout);
            attackAnimationTimeout = DreadhoofAnimationHelper.updateAttackState(isAttacking(), attackAnimationState, attackAnimationTimeout, tickCount);
        }


        @Override
        protected void updateWalkAnimation(float pPartialTick) {
            float f;
            if(this.getPose() == Pose.STANDING)
            {
                f = Math.min(pPartialTick * 6f, 1f);
            } else {
                f = 0f;
            }
            this.walkAnimation.update(f,0.2f);
        }


        /// AI ul MOBULUI
        @Override
        protected void registerGoals() {
            this.goalSelector.addGoal(0,new DreadhoofAttackGoal(this, 1.0D,
                    true));

            this.goalSelector.addGoal(0,new FloatGoal(this));
            this.goalSelector.addGoal(2, new WaterAvoidingRandomStrollGoal(this, 0.8D));
            this.goalSelector.addGoal(3, new LookAtPlayerGoal(this, Player.class, 8.0F));
            this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));

            this.targetSelector.addGoal(0, new NearestAttackableTargetGoal<>(this, Player.class,
                    false));



        }

        @Override
        protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHit) {
            super.dropCustomDeathLoot(source, looting, recentlyHit);

            if (source.getEntity() instanceof Player) {
                this.spawnAtLocation(ModItems.BLOODY_SAPPHIRE.get(), 1);
            }
        }



        public static AttributeSupplier.Builder createAttributes(){
            return Monster.createMonsterAttributes().add(Attributes.MAX_HEALTH, 35D)
                    .add(Attributes.MOVEMENT_SPEED, 0.5D)
                    .add(Attributes.ARMOR_TOUGHNESS, 0.1f)
                    .add(Attributes.ATTACK_KNOCKBACK,0.5f)
                    .add(Attributes.FOLLOW_RANGE, 24D)
                    .add(Attributes.ATTACK_DAMAGE, 10f);
        }


        @Override
        protected @Nullable SoundEvent getAmbientSound() {
            return SoundEvents.HOGLIN_AMBIENT;
        }

        @Override
        protected SoundEvent getHurtSound(DamageSource pDamageSource) {
            return SoundEvents.HOGLIN_AMBIENT;
        }


        @Override
        protected SoundEvent getDeathSound() {
            return SoundEvents.HOGLIN_DEATH;
        }



    }

