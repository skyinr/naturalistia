package com.NuclearFusion.block.tileentity;

import com.NuclearFusion.block.BlockRegistry;
import com.NuclearFusion.Naturalistia;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityRegistry {
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_REGISTRY = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, Naturalistia.MOD_ID);

    public static final RegistryObject<TileEntityType<TileEntityBotanicCrucible>> TILE_ENTITY_BOTANIC_CRUCIBLE = TILE_ENTITY_REGISTRY.register("crucible_made_of_plants_tile_entity", () -> TileEntityType.Builder.create(TileEntityBotanicCrucible::new, BlockRegistry.botanicCrucible.get()).build(null));
}
