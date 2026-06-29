package com.lumenhollow;

import net.minecraft.world.food.FoodProperties;

public final class ModFoodComponents {
    public static final FoodProperties MOONFRUIT = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(1.2f)
            .build();

    private ModFoodComponents() {
    }
}
