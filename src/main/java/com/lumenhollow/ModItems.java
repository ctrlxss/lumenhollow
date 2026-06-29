package com.lumenhollow;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

public final class ModItems {
    public static final Item LUMEN_CRYSTAL = registerItem("lumen_crystal", new Item(new Item.Properties()));
    public static final Item MOONFRUIT = registerItem("moonfruit", new Item(new Item.Properties().food(ModFoodComponents.MOONFRUIT)));
    public static final Item ASTRAL_SHARD = registerItem("astral_shard", new Item(new Item.Properties()));
    public static final Item DUSKSTEEL_INGOT = registerItem("dusksteel_ingot", new Item(new Item.Properties()));
    public static final Item STARFIRE_CORE = registerItem("starfire_core", new Item(new Item.Properties()));
    public static final Item PRISM_STAFF = registerItem("prism_staff", new PrismStaffItem(new Item.Properties().stacksTo(1).durability(256)));
    public static final Item DUSKSTEEL_SWORD = registerItem("dusksteel_sword", new DusksteelSwordItem(new Item.Properties().stacksTo(1).durability(1024)));

    public static final BlockItem LUMEN_CRYSTAL_BLOCK_ITEM = registerBlockItem("lumen_crystal_block", ModBlocks.LUMEN_CRYSTAL_BLOCK);
    public static final BlockItem LUMEN_PORTAL_ITEM = registerBlockItem("lumen_portal", ModBlocks.LUMEN_PORTAL_BLOCK);
    public static final BlockItem LUMEN_CRYSTAL_ORE_ITEM = registerBlockItem("lumen_crystal_ore", ModBlocks.LUMEN_CRYSTAL_ORE);
    public static final BlockItem LUMEN_LANTERN_ITEM = registerBlockItem("lumen_lantern", ModBlocks.LUMEN_LANTERN);

    private static Item registerItem(String name, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(LumenHollowMod.MOD_ID, name), item);
    }

    private static BlockItem registerBlockItem(String name, net.minecraft.world.level.block.Block block) {
        return Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(LumenHollowMod.MOD_ID, name), new BlockItem(block, new Item.Properties()));
    }

    public static void register() {
    }
}
