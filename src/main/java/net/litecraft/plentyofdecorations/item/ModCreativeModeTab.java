package net.litecraft.plentyofdecorations.item;

import net.litecraft.plentyofdecorations.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab POD_TAB = new CreativeModeTab("plentyofdecorations") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.NETHERITE_BLOCK_STAIRS.get().asItem());
        }
    };
}