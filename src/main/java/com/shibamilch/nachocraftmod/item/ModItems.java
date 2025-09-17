package com.shibamilch.nachocraftmod.item;

import com.shibamilch.nachocraftmod.NachoCraftMod;
import com.shibamilch.nachocraftmod.block.ModBlocks;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(NachoCraftMod.MOD_ID);

    public static final DeferredItem<Item> TACO = ITEMS.register("taco",
            () -> new Item(new Item.Properties().food(ModFoodProperties.TACO)));

    public static final DeferredItem<Item> BURRITO = ITEMS.register("burrito",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BURRITO)));

    public static final DeferredItem<Item> TORTILLA = ITEMS.register("tortilla",
            () -> new Item(new Item.Properties().food(ModFoodProperties.TORTILLA)));

    public static final DeferredItem<Item> CHEESE = ITEMS.register("cheese",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CHEESE)));

    public static final DeferredItem<Item> CORN_SEEDS = ITEMS.register("corn_seeds",
            () -> new ItemNameBlockItem(ModBlocks.CORN_CROP.get(), new Item.Properties()));

    public static final DeferredItem<Item> BEAN_SEEDS = ITEMS.register("bean_seeds",
            () -> new ItemNameBlockItem(ModBlocks.BEAN_CROP.get(), new Item.Properties()));

    public static final DeferredItem<Item> CORN = ITEMS.register("corn",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CORN)));

    public static final DeferredItem<Item> BEANS = ITEMS.register("beans",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BEANS)));

    public static final DeferredItem<Item> CORN_FLOUR = ITEMS.register("corn_flour",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> TACO_SHELL = ITEMS.register("taco_shell",
            () -> new Item(new Item.Properties().food(ModFoodProperties.TACO_SHELL)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
