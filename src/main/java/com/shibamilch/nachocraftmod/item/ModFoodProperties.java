package com.shibamilch.nachocraftmod.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties TACO = new FoodProperties.Builder().nutrition(5).saturationModifier(0.3f)
            .build();
    public static final FoodProperties BURRITO = new FoodProperties.Builder().nutrition(7).saturationModifier(0.4f)
            .build();

}
