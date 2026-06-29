package com.lumenhollow;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

public final class ModItems {
    public static final Item LUMEN_CRYSTAL = registerItem("lumen_crystal", new Item(new Item.Properties()));
    public static final Item MOONFRUIT = registerItem("moonfruit", new Item(new Item.Properties()));
    public static final BlockItem LUMEN_CRYSTAL_BLOCK_ITEM = registerBlockItem("lumen_crystal_block", ModBlocks.LUMEN_CRYSTAL_BLOCK);
    public static final BlockItem LUMEN_PORTAL_ITEM = registerBlockItem("lumen_portal", ModBlocks.LUMEN_PORTAL_BLOCK);

    private static Item registerItem(String name, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(LumenHollowMod.MOD_ID, name), item);
    }

    private static BlockItem registerBlockItem(String name, net.minecraft.world.level.block.Block block) {
        return Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(LumenHollowMod.MOD_ID, name), new BlockItem(block, new Item.Properties()));
    }

    public static void register() {
    }
}
