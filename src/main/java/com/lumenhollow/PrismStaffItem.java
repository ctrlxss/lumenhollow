package com.lumenhollow;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class PrismStaffItem extends Item {
    public PrismStaffItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        if (!level.isClientSide) {
            player.getCooldowns().addCooldown(this, 20);
            player.getInventory().placeItemBackInInventory(new ItemStack(ModItems.ASTRAL_SHARD));
        }
        return InteractionResultHolder.sidedSuccess(stack, level.isClientSide);
    }
}
