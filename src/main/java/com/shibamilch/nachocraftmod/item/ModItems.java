package com.shibamilch.nachocraftmod.item;

import com.shibamilch.nachocraftmod.NachoCraftMod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(NachoCraftMod.MOD_ID);

    public static final DeferredItem<Item> TACO = ITEMS.register("taco",
            () -> new Item(new Item.Properties().food(ModFoodProperties.TACO)));

    public static final DeferredItem<Item> BURRITO = ITEMS.register("burrito",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BURRITO)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
