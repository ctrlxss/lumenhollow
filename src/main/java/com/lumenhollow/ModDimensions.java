package com.lumenhollow;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;

public final class ModDimensions {
    public static final ResourceKey<Level> LUMEN_HOLLOW = ResourceKey.create(Registries.DIMENSION, ResourceLocation.fromNamespaceAndPath(LumenHollowMod.MOD_ID, "lumen_hollow"));

    public static void register() {
    }
}
