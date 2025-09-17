package com.shibamilch.nachocraftmod.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties TACO = new FoodProperties.Builder().nutrition(7).saturationModifier(0.6f)
            .build();
    public static final FoodProperties BURRITO = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8f)
            .build();
    public static final FoodProperties TORTILLA = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2f)
            .build();
    public static final FoodProperties CHEESE = new FoodProperties.Builder().nutrition(3).saturationModifier(0.3f)
            .build();
    public static final FoodProperties CORN = new FoodProperties.Builder().nutrition(3).saturationModifier(0.3f)
            .build();
    public static final FoodProperties BEANS = new FoodProperties.Builder().nutrition(3).saturationModifier(0.3f)
            .build();
    public static final FoodProperties TACO_SHELL = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1f)
            .build();


}
