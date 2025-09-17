package com.shibamilch.nachocraftmod.block;

import com.shibamilch.nachocraftmod.NachoCraftMod;
import com.shibamilch.nachocraftmod.block.custom.BeanCropBlock;
import com.shibamilch.nachocraftmod.block.custom.CornCropBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import static net.minecraft.world.item.Items.registerBlock;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(NachoCraftMod.MOD_ID);

    public static final DeferredBlock<Block> CORN_CROP = BLOCKS.register("corn_crop", () -> new CornCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT)));
    public static final DeferredBlock<Block> BEAN_CROP = BLOCKS.register("bean_crop", () -> new BeanCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT)));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
