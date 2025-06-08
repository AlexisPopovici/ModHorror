package net.jonson.modhorror.entity;

import net.jonson.modhorror.ModHorror;
import net.jonson.modhorror.entity.custom.DreadhoofEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ModHorror.MOD_ID);


    public static final RegistryObject<EntityType<DreadhoofEntity>> DREADHOOF =
            ENTITY_TPES.register("dreadhoof", () -> EntityType.Builder.of(DreadhoofEntity::new,
                    MobCategory.MONSTER)
                            .sized(2.5f,2.5f).build("dreadhoof"));





    public static void register(IEventBus eventBus){

        ENTITY_TPES.register(eventBus);
    }

    public static void setupSpawnPlacements() {
        SpawnPlacements.register(
                DREADHOOF.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Monster::checkMonsterSpawnRules
        );


    }}
