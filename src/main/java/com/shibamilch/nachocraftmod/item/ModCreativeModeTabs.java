package com.shibamilch.nachocraftmod.item;

import com.shibamilch.nachocraftmod.NachoCraftMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NachoCraftMod.MOD_ID);

    public static final Supplier<CreativeModeTab> TACO_ITEMS_TAB = CREATIVE_MODE_TAB.register("taco_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TACO.get()))
                    .title(Component.translatable("creativetab.nachocraftmod.taco_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.TACO);
                        output.accept(ModItems.BURRITO);
                        output.accept(ModItems.TORTILLA);
                        output.accept(ModItems.CHEESE);
                        output.accept(ModItems.TACO_SHELL);
                        output.accept(ModItems.CORN);
                        output.accept(ModItems.BEANS);
                        output.accept(ModItems.CORN_SEEDS);
                        output.accept(ModItems.BEAN_SEEDS);
                        output.accept(ModItems.CORN_FLOUR);
                    }).build());




    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }


}
