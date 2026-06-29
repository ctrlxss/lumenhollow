package com.lumenhollow;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;

public class DusksteelSwordItem extends SwordItem {
    public DusksteelSwordItem(Properties properties) {
        super(Tiers.NETHERITE, properties);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.setRemainingFireTicks(40);
        return super.hurtEnemy(stack, target, attacker);
    }
}
