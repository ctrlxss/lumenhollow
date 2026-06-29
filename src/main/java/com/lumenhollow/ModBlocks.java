package com.lumenhollow;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public final class ModBlocks {
    public static final Block LUMEN_CRYSTAL_BLOCK = registerBlock("lumen_crystal_block",
            new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_BLUE)
                    .strength(3.0f, 6.0f)
                    .sound(SoundType.AMETHYST)
                    .lightLevel(state -> 12)));

    public static final Block LUMEN_PORTAL_BLOCK = registerBlock("lumen_portal",
            new LumenPortalBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_PURPLE)
                    .strength(2.0f)
                    .sound(SoundType.GLASS)
                    .noOcclusion()
                    .lightLevel(state -> 10)));

    private static Block registerBlock(String name, Block block) {
        return Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(LumenHollowMod.MOD_ID, name), block);
    }

    public static void register() {
    }
}
