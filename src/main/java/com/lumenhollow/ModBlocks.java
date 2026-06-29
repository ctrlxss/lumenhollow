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

    public static final Block LUMEN_CRYSTAL_ORE = registerBlock("lumen_crystal_ore",
            new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_CYAN)
                    .strength(4.5f, 8.0f)
                    .sound(SoundType.STONE)
                    .lightLevel(state -> 4)));

    public static final Block LUMEN_LANTERN = registerBlock("lumen_lantern",
            new LumenLanternBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_YELLOW)
                    .strength(1.5f)
                    .sound(SoundType.GLASS)
                    .noOcclusion()
                    .lightLevel(state -> 15)));

    private static Block registerBlock(String name, Block block) {
        return Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(LumenHollowMod.MOD_ID, name), block);
    }

    public static void register() {
    }
}
