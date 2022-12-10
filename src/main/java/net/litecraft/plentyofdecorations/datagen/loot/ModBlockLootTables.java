package net.litecraft.plentyofdecorations.datagen.loot;

import net.litecraft.plentyofdecorations.block.ModBlocks;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockLootTables extends BlockLoot {
    
    @Override
    protected void addTables() {
        this.dropSelf(ModBlocks.BEDROCK_STAIRS.get());
        this.add(ModBlocks.BEDROCK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.BEDROCK_FENCE.get());
        this.dropSelf(ModBlocks.BEDROCK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.BEDROCK_WALL.get());
        this.dropSelf(ModBlocks.BEDROCK_BUTTON.get());
        this.dropSelf(ModBlocks.BEDROCK_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.COAL_ORE_STAIRS.get());
        this.add(ModBlocks.COAL_ORE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.COAL_ORE_FENCE.get());
        this.dropSelf(ModBlocks.COAL_ORE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.COAL_ORE_WALL.get());
        this.dropSelf(ModBlocks.COAL_ORE_BUTTON.get());
        this.dropSelf(ModBlocks.COAL_ORE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.LAPIS_ORE_STAIRS.get());
        this.add(ModBlocks.LAPIS_ORE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.LAPIS_ORE_FENCE.get());
        this.dropSelf(ModBlocks.LAPIS_ORE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.LAPIS_ORE_WALL.get());
        this.dropSelf(ModBlocks.LAPIS_ORE_BUTTON.get());
        this.dropSelf(ModBlocks.LAPIS_ORE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.IRON_ORE_STAIRS.get());
        this.add(ModBlocks.IRON_ORE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.IRON_ORE_FENCE.get());
        this.dropSelf(ModBlocks.IRON_ORE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.IRON_ORE_WALL.get());
        this.dropSelf(ModBlocks.IRON_ORE_BUTTON.get());
        this.dropSelf(ModBlocks.IRON_ORE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.COPPER_ORE_STAIRS.get());
        this.add(ModBlocks.COPPER_ORE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.COPPER_ORE_FENCE.get());
        this.dropSelf(ModBlocks.COPPER_ORE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.COPPER_ORE_WALL.get());
        this.dropSelf(ModBlocks.COPPER_ORE_BUTTON.get());
        this.dropSelf(ModBlocks.COPPER_ORE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.GOLD_ORE_STAIRS.get());
        this.add(ModBlocks.GOLD_ORE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.GOLD_ORE_FENCE.get());
        this.dropSelf(ModBlocks.GOLD_ORE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.GOLD_ORE_WALL.get());
        this.dropSelf(ModBlocks.GOLD_ORE_BUTTON.get());
        this.dropSelf(ModBlocks.GOLD_ORE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.DIAMOND_ORE_STAIRS.get());
        this.add(ModBlocks.DIAMOND_ORE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.DIAMOND_ORE_FENCE.get());
        this.dropSelf(ModBlocks.DIAMOND_ORE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.DIAMOND_ORE_WALL.get());
        this.dropSelf(ModBlocks.DIAMOND_ORE_BUTTON.get());
        this.dropSelf(ModBlocks.DIAMOND_ORE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.EMERALD_ORE_STAIRS.get());
        this.add(ModBlocks.EMERALD_ORE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.EMERALD_ORE_FENCE.get());
        this.dropSelf(ModBlocks.EMERALD_ORE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.EMERALD_ORE_WALL.get());
        this.dropSelf(ModBlocks.EMERALD_ORE_BUTTON.get());
        this.dropSelf(ModBlocks.EMERALD_ORE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.DEEPSLATE_COAL_ORE_STAIRS.get());
        this.add(ModBlocks.DEEPSLATE_COAL_ORE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.DEEPSLATE_COAL_ORE_FENCE.get());
        this.dropSelf(ModBlocks.DEEPSLATE_COAL_ORE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.DEEPSLATE_COAL_ORE_WALL.get());
        this.dropSelf(ModBlocks.DEEPSLATE_COAL_ORE_BUTTON.get());
        this.dropSelf(ModBlocks.DEEPSLATE_COAL_ORE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.DEEPSLATE_LAPIS_ORE_STAIRS.get());
        this.add(ModBlocks.DEEPSLATE_LAPIS_ORE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.DEEPSLATE_LAPIS_ORE_FENCE.get());
        this.dropSelf(ModBlocks.DEEPSLATE_LAPIS_ORE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.DEEPSLATE_LAPIS_ORE_WALL.get());
        this.dropSelf(ModBlocks.DEEPSLATE_LAPIS_ORE_BUTTON.get());
        this.dropSelf(ModBlocks.DEEPSLATE_LAPIS_ORE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.DEEPSLATE_IRON_ORE_STAIRS.get());
        this.add(ModBlocks.DEEPSLATE_IRON_ORE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.DEEPSLATE_IRON_ORE_FENCE.get());
        this.dropSelf(ModBlocks.DEEPSLATE_IRON_ORE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.DEEPSLATE_IRON_ORE_WALL.get());
        this.dropSelf(ModBlocks.DEEPSLATE_IRON_ORE_BUTTON.get());
        this.dropSelf(ModBlocks.DEEPSLATE_IRON_ORE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.DEEPSLATE_COPPER_ORE_STAIRS.get());
        this.add(ModBlocks.DEEPSLATE_COPPER_ORE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.DEEPSLATE_COPPER_ORE_FENCE.get());
        this.dropSelf(ModBlocks.DEEPSLATE_COPPER_ORE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.DEEPSLATE_COPPER_ORE_WALL.get());
        this.dropSelf(ModBlocks.DEEPSLATE_COPPER_ORE_BUTTON.get());
        this.dropSelf(ModBlocks.DEEPSLATE_COPPER_ORE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.DEEPSLATE_GOLD_ORE_STAIRS.get());
        this.add(ModBlocks.DEEPSLATE_GOLD_ORE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.DEEPSLATE_GOLD_ORE_FENCE.get());
        this.dropSelf(ModBlocks.DEEPSLATE_GOLD_ORE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.DEEPSLATE_GOLD_ORE_WALL.get());
        this.dropSelf(ModBlocks.DEEPSLATE_GOLD_ORE_BUTTON.get());
        this.dropSelf(ModBlocks.DEEPSLATE_GOLD_ORE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.DEEPSLATE_DIAMOND_ORE_STAIRS.get());
        this.add(ModBlocks.DEEPSLATE_DIAMOND_ORE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.DEEPSLATE_DIAMOND_ORE_FENCE.get());
        this.dropSelf(ModBlocks.DEEPSLATE_DIAMOND_ORE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.DEEPSLATE_DIAMOND_ORE_WALL.get());
        this.dropSelf(ModBlocks.DEEPSLATE_DIAMOND_ORE_BUTTON.get());
        this.dropSelf(ModBlocks.DEEPSLATE_DIAMOND_ORE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.DEEPSLATE_EMERALD_ORE_STAIRS.get());
        this.add(ModBlocks.DEEPSLATE_EMERALD_ORE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.DEEPSLATE_EMERALD_ORE_FENCE.get());
        this.dropSelf(ModBlocks.DEEPSLATE_EMERALD_ORE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.DEEPSLATE_EMERALD_ORE_WALL.get());
        this.dropSelf(ModBlocks.DEEPSLATE_EMERALD_ORE_BUTTON.get());
        this.dropSelf(ModBlocks.DEEPSLATE_EMERALD_ORE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.COAL_BLOCK_STAIRS.get());
        this.add(ModBlocks.COAL_BLOCK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.COAL_BLOCK_FENCE.get());
        this.dropSelf(ModBlocks.COAL_BLOCK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.COAL_BLOCK_WALL.get());
        this.dropSelf(ModBlocks.COAL_BLOCK_BUTTON.get());
        this.dropSelf(ModBlocks.COAL_BLOCK_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.LAPIS_BLOCK_STAIRS.get());
        this.add(ModBlocks.LAPIS_BLOCK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.LAPIS_BLOCK_FENCE.get());
        this.dropSelf(ModBlocks.LAPIS_BLOCK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.LAPIS_BLOCK_WALL.get());
        this.dropSelf(ModBlocks.LAPIS_BLOCK_BUTTON.get());
        this.dropSelf(ModBlocks.LAPIS_BLOCK_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.RAW_IRON_BLOCK_STAIRS.get());
        this.add(ModBlocks.RAW_IRON_BLOCK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.RAW_IRON_BLOCK_FENCE.get());
        this.dropSelf(ModBlocks.RAW_IRON_BLOCK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.RAW_IRON_BLOCK_WALL.get());
        this.dropSelf(ModBlocks.RAW_IRON_BLOCK_BUTTON.get());
        this.dropSelf(ModBlocks.RAW_IRON_BLOCK_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.RAW_COPPER_BLOCK_STAIRS.get());
        this.add(ModBlocks.RAW_COPPER_BLOCK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.RAW_COPPER_BLOCK_FENCE.get());
        this.dropSelf(ModBlocks.RAW_COPPER_BLOCK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.RAW_COPPER_BLOCK_WALL.get());
        this.dropSelf(ModBlocks.RAW_COPPER_BLOCK_BUTTON.get());
        this.dropSelf(ModBlocks.RAW_COPPER_BLOCK_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.RAW_GOLD_BLOCK_STAIRS.get());
        this.add(ModBlocks.RAW_GOLD_BLOCK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.RAW_GOLD_BLOCK_FENCE.get());
        this.dropSelf(ModBlocks.RAW_GOLD_BLOCK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.RAW_GOLD_BLOCK_WALL.get());
        this.dropSelf(ModBlocks.RAW_GOLD_BLOCK_BUTTON.get());
        this.dropSelf(ModBlocks.RAW_GOLD_BLOCK_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.AMETHYST_BLOCK_STAIRS.get());
        this.add(ModBlocks.AMETHYST_BLOCK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.AMETHYST_BLOCK_FENCE.get());
        this.dropSelf(ModBlocks.AMETHYST_BLOCK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.AMETHYST_BLOCK_WALL.get());
        this.dropSelf(ModBlocks.AMETHYST_BLOCK_BUTTON.get());
        this.dropSelf(ModBlocks.AMETHYST_BLOCK_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.IRON_BLOCK_STAIRS.get());
        this.add(ModBlocks.IRON_BLOCK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.IRON_BLOCK_FENCE.get());
        this.dropSelf(ModBlocks.IRON_BLOCK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.IRON_BLOCK_WALL.get());
        this.dropSelf(ModBlocks.IRON_BLOCK_BUTTON.get());
        this.dropSelf(ModBlocks.IRON_BLOCK_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.COPPER_BLOCK_STAIRS.get());
        this.add(ModBlocks.COPPER_BLOCK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.COPPER_BLOCK_FENCE.get());
        this.dropSelf(ModBlocks.COPPER_BLOCK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.COPPER_BLOCK_WALL.get());
        this.dropSelf(ModBlocks.COPPER_BLOCK_BUTTON.get());
        this.dropSelf(ModBlocks.COPPER_BLOCK_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.GOLD_BLOCK_STAIRS.get());
        this.add(ModBlocks.GOLD_BLOCK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.GOLD_BLOCK_FENCE.get());
        this.dropSelf(ModBlocks.GOLD_BLOCK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.GOLD_BLOCK_WALL.get());
        this.dropSelf(ModBlocks.GOLD_BLOCK_BUTTON.get());
        this.dropSelf(ModBlocks.GOLD_BLOCK_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.DIAMOND_BLOCK_STAIRS.get());
        this.add(ModBlocks.DIAMOND_BLOCK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.DIAMOND_BLOCK_FENCE.get());
        this.dropSelf(ModBlocks.DIAMOND_BLOCK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.DIAMOND_BLOCK_WALL.get());
        this.dropSelf(ModBlocks.DIAMOND_BLOCK_BUTTON.get());
        this.dropSelf(ModBlocks.DIAMOND_BLOCK_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.NETHERITE_BLOCK_STAIRS.get());
        this.add(ModBlocks.NETHERITE_BLOCK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.NETHERITE_BLOCK_FENCE.get());
        this.dropSelf(ModBlocks.NETHERITE_BLOCK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.NETHERITE_BLOCK_WALL.get());
        this.dropSelf(ModBlocks.NETHERITE_BLOCK_BUTTON.get());
        this.dropSelf(ModBlocks.NETHERITE_BLOCK_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.MOSS_BLOCK_STAIRS.get());
        this.add(ModBlocks.MOSS_BLOCK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.MOSS_BLOCK_FENCE.get());
        this.dropSelf(ModBlocks.MOSS_BLOCK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.MOSS_BLOCK_WALL.get());
        this.dropSelf(ModBlocks.MOSS_BLOCK_BUTTON.get());
        this.dropSelf(ModBlocks.MOSS_BLOCK_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.DRIPSTONE_BLOCK_STAIRS.get());
        this.add(ModBlocks.DRIPSTONE_BLOCK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.DRIPSTONE_BLOCK_FENCE.get());
        this.dropSelf(ModBlocks.DRIPSTONE_BLOCK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.DRIPSTONE_BLOCK_WALL.get());
        this.dropSelf(ModBlocks.DRIPSTONE_BLOCK_BUTTON.get());
        this.dropSelf(ModBlocks.DRIPSTONE_BLOCK_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.PURPUR_BLOCK_STAIRS.get());
        this.add(ModBlocks.PURPUR_BLOCK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.PURPUR_BLOCK_FENCE.get());
        this.dropSelf(ModBlocks.PURPUR_BLOCK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.PURPUR_BLOCK_WALL.get());
        this.dropSelf(ModBlocks.PURPUR_BLOCK_BUTTON.get());
        this.dropSelf(ModBlocks.PURPUR_BLOCK_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.BROWN_MUSHROOM_BLOCK_STAIRS.get());
        this.add(ModBlocks.BROWN_MUSHROOM_BLOCK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.BROWN_MUSHROOM_BLOCK_FENCE.get());
        this.dropSelf(ModBlocks.BROWN_MUSHROOM_BLOCK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.BROWN_MUSHROOM_BLOCK_WALL.get());
        this.dropSelf(ModBlocks.BROWN_MUSHROOM_BLOCK_BUTTON.get());
        this.dropSelf(ModBlocks.BROWN_MUSHROOM_BLOCK_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.RED_MUSHROOM_BLOCK_STAIRS.get());
        this.add(ModBlocks.RED_MUSHROOM_BLOCK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.RED_MUSHROOM_BLOCK_FENCE.get());
        this.dropSelf(ModBlocks.RED_MUSHROOM_BLOCK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.RED_MUSHROOM_BLOCK_WALL.get());
        this.dropSelf(ModBlocks.RED_MUSHROOM_BLOCK_BUTTON.get());
        this.dropSelf(ModBlocks.RED_MUSHROOM_BLOCK_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.EMERALD_BLOCK_STAIRS.get());
        this.add(ModBlocks.EMERALD_BLOCK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.EMERALD_BLOCK_FENCE.get());
        this.dropSelf(ModBlocks.EMERALD_BLOCK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.EMERALD_BLOCK_WALL.get());
        this.dropSelf(ModBlocks.EMERALD_BLOCK_BUTTON.get());
        this.dropSelf(ModBlocks.EMERALD_BLOCK_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.STONE_STAIRS.get());
        this.add(ModBlocks.STONE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.STONE_FENCE.get());
        this.dropSelf(ModBlocks.STONE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.STONE_WALL.get());
        this.dropSelf(ModBlocks.STONE_BUTTON.get());
        this.dropSelf(ModBlocks.STONE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.GRANITE_STAIRS.get());
        this.add(ModBlocks.GRANITE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.GRANITE_FENCE.get());
        this.dropSelf(ModBlocks.GRANITE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.GRANITE_WALL.get());
        this.dropSelf(ModBlocks.GRANITE_BUTTON.get());
        this.dropSelf(ModBlocks.GRANITE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.POLISHED_GRANITE_STAIRS.get());
        this.add(ModBlocks.POLISHED_GRANITE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.POLISHED_GRANITE_FENCE.get());
        this.dropSelf(ModBlocks.POLISHED_GRANITE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.POLISHED_GRANITE_WALL.get());
        this.dropSelf(ModBlocks.POLISHED_GRANITE_BUTTON.get());
        this.dropSelf(ModBlocks.POLISHED_GRANITE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.DIORITE_STAIRS.get());
        this.add(ModBlocks.DIORITE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.DIORITE_FENCE.get());
        this.dropSelf(ModBlocks.DIORITE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.DIORITE_WALL.get());
        this.dropSelf(ModBlocks.DIORITE_BUTTON.get());
        this.dropSelf(ModBlocks.DIORITE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.POLISHED_DIORITE_STAIRS.get());
        this.add(ModBlocks.POLISHED_DIORITE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.POLISHED_DIORITE_FENCE.get());
        this.dropSelf(ModBlocks.POLISHED_DIORITE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.POLISHED_DIORITE_WALL.get());
        this.dropSelf(ModBlocks.POLISHED_DIORITE_BUTTON.get());
        this.dropSelf(ModBlocks.POLISHED_DIORITE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.ANDESITE_STAIRS.get());
        this.add(ModBlocks.ANDESITE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.ANDESITE_FENCE.get());
        this.dropSelf(ModBlocks.ANDESITE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.ANDESITE_WALL.get());
        this.dropSelf(ModBlocks.ANDESITE_BUTTON.get());
        this.dropSelf(ModBlocks.ANDESITE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.POLISHED_ANDESITE_STAIRS.get());
        this.add(ModBlocks.POLISHED_ANDESITE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.POLISHED_ANDESITE_FENCE.get());
        this.dropSelf(ModBlocks.POLISHED_ANDESITE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.POLISHED_ANDESITE_WALL.get());
        this.dropSelf(ModBlocks.POLISHED_ANDESITE_BUTTON.get());
        this.dropSelf(ModBlocks.POLISHED_ANDESITE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.COBBLED_DEEPSLATE_STAIRS.get());
        this.add(ModBlocks.COBBLED_DEEPSLATE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.COBBLED_DEEPSLATE_FENCE.get());
        this.dropSelf(ModBlocks.COBBLED_DEEPSLATE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.COBBLED_DEEPSLATE_WALL.get());
        this.dropSelf(ModBlocks.COBBLED_DEEPSLATE_BUTTON.get());
        this.dropSelf(ModBlocks.COBBLED_DEEPSLATE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.POLISHED_DEEPSLATE_STAIRS.get());
        this.add(ModBlocks.POLISHED_DEEPSLATE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.POLISHED_DEEPSLATE_FENCE.get());
        this.dropSelf(ModBlocks.POLISHED_DEEPSLATE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.POLISHED_DEEPSLATE_WALL.get());
        this.dropSelf(ModBlocks.POLISHED_DEEPSLATE_BUTTON.get());
        this.dropSelf(ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.CALCITE_STAIRS.get());
        this.add(ModBlocks.CALCITE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.CALCITE_FENCE.get());
        this.dropSelf(ModBlocks.CALCITE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.CALCITE_WALL.get());
        this.dropSelf(ModBlocks.CALCITE_BUTTON.get());
        this.dropSelf(ModBlocks.CALCITE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.TUFF_STAIRS.get());
        this.add(ModBlocks.TUFF_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.TUFF_FENCE.get());
        this.dropSelf(ModBlocks.TUFF_FENCE_GATE.get());
        this.dropSelf(ModBlocks.TUFF_WALL.get());
        this.dropSelf(ModBlocks.TUFF_BUTTON.get());
        this.dropSelf(ModBlocks.TUFF_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.DIRT_STAIRS.get());
        this.add(ModBlocks.DIRT_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.DIRT_FENCE.get());
        this.dropSelf(ModBlocks.DIRT_FENCE_GATE.get());
        this.dropSelf(ModBlocks.DIRT_WALL.get());
        this.dropSelf(ModBlocks.DIRT_BUTTON.get());
        this.dropSelf(ModBlocks.DIRT_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.COARSE_DIRT_STAIRS.get());
        this.add(ModBlocks.COARSE_DIRT_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.COARSE_DIRT_FENCE.get());
        this.dropSelf(ModBlocks.COARSE_DIRT_FENCE_GATE.get());
        this.dropSelf(ModBlocks.COARSE_DIRT_WALL.get());
        this.dropSelf(ModBlocks.COARSE_DIRT_BUTTON.get());
        this.dropSelf(ModBlocks.COARSE_DIRT_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.ROOTED_DIRT_STAIRS.get());
        this.add(ModBlocks.ROOTED_DIRT_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.ROOTED_DIRT_FENCE.get());
        this.dropSelf(ModBlocks.ROOTED_DIRT_FENCE_GATE.get());
        this.dropSelf(ModBlocks.ROOTED_DIRT_WALL.get());
        this.dropSelf(ModBlocks.ROOTED_DIRT_BUTTON.get());
        this.dropSelf(ModBlocks.ROOTED_DIRT_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.MUD_STAIRS.get());
        this.add(ModBlocks.MUD_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.MUD_FENCE.get());
        this.dropSelf(ModBlocks.MUD_FENCE_GATE.get());
        this.dropSelf(ModBlocks.MUD_WALL.get());
        this.dropSelf(ModBlocks.MUD_BUTTON.get());
        this.dropSelf(ModBlocks.MUD_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.COBBLESTONE_STAIRS.get());
        this.add(ModBlocks.COBBLESTONE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.COBBLESTONE_FENCE.get());
        this.dropSelf(ModBlocks.COBBLESTONE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.COBBLESTONE_WALL.get());
        this.dropSelf(ModBlocks.COBBLESTONE_BUTTON.get());
        this.dropSelf(ModBlocks.COBBLESTONE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.OAK_PLANKS_STAIRS.get());
        this.add(ModBlocks.OAK_PLANKS_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.OAK_PLANKS_FENCE.get());
        this.dropSelf(ModBlocks.OAK_PLANKS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.OAK_PLANKS_WALL.get());
        this.dropSelf(ModBlocks.OAK_PLANKS_BUTTON.get());
        this.dropSelf(ModBlocks.OAK_PLANKS_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.SPRUCE_PLANKS_STAIRS.get());
        this.add(ModBlocks.SPRUCE_PLANKS_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.SPRUCE_PLANKS_FENCE.get());
        this.dropSelf(ModBlocks.SPRUCE_PLANKS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.SPRUCE_PLANKS_WALL.get());
        this.dropSelf(ModBlocks.SPRUCE_PLANKS_BUTTON.get());
        this.dropSelf(ModBlocks.SPRUCE_PLANKS_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.BIRCH_PLANKS_STAIRS.get());
        this.add(ModBlocks.BIRCH_PLANKS_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.BIRCH_PLANKS_FENCE.get());
        this.dropSelf(ModBlocks.BIRCH_PLANKS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.BIRCH_PLANKS_WALL.get());
        this.dropSelf(ModBlocks.BIRCH_PLANKS_BUTTON.get());
        this.dropSelf(ModBlocks.BIRCH_PLANKS_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.JUNGLE_PLANKS_STAIRS.get());
        this.add(ModBlocks.JUNGLE_PLANKS_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.JUNGLE_PLANKS_FENCE.get());
        this.dropSelf(ModBlocks.JUNGLE_PLANKS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.JUNGLE_PLANKS_WALL.get());
        this.dropSelf(ModBlocks.JUNGLE_PLANKS_BUTTON.get());
        this.dropSelf(ModBlocks.JUNGLE_PLANKS_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.ACACIA_PLANKS_STAIRS.get());
        this.add(ModBlocks.ACACIA_PLANKS_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.ACACIA_PLANKS_FENCE.get());
        this.dropSelf(ModBlocks.ACACIA_PLANKS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.ACACIA_PLANKS_WALL.get());
        this.dropSelf(ModBlocks.ACACIA_PLANKS_BUTTON.get());
        this.dropSelf(ModBlocks.ACACIA_PLANKS_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.DARK_OAK_PLANKS_STAIRS.get());
        this.add(ModBlocks.DARK_OAK_PLANKS_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.DARK_OAK_PLANKS_FENCE.get());
        this.dropSelf(ModBlocks.DARK_OAK_PLANKS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.DARK_OAK_PLANKS_WALL.get());
        this.dropSelf(ModBlocks.DARK_OAK_PLANKS_BUTTON.get());
        this.dropSelf(ModBlocks.DARK_OAK_PLANKS_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.MANGROVE_PLANKS_STAIRS.get());
        this.add(ModBlocks.MANGROVE_PLANKS_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.MANGROVE_PLANKS_FENCE.get());
        this.dropSelf(ModBlocks.MANGROVE_PLANKS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.MANGROVE_PLANKS_WALL.get());
        this.dropSelf(ModBlocks.MANGROVE_PLANKS_BUTTON.get());
        this.dropSelf(ModBlocks.MANGROVE_PLANKS_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.CRIMSON_PLANKS_STAIRS.get());
        this.add(ModBlocks.CRIMSON_PLANKS_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.CRIMSON_PLANKS_FENCE.get());
        this.dropSelf(ModBlocks.CRIMSON_PLANKS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.CRIMSON_PLANKS_WALL.get());
        this.dropSelf(ModBlocks.CRIMSON_PLANKS_BUTTON.get());
        this.dropSelf(ModBlocks.CRIMSON_PLANKS_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.WARPED_PLANKS_STAIRS.get());
        this.add(ModBlocks.WARPED_PLANKS_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.WARPED_PLANKS_FENCE.get());
        this.dropSelf(ModBlocks.WARPED_PLANKS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.WARPED_PLANKS_WALL.get());
        this.dropSelf(ModBlocks.WARPED_PLANKS_BUTTON.get());
        this.dropSelf(ModBlocks.WARPED_PLANKS_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.NETHER_GOLD_ORE_STAIRS.get());
        this.add(ModBlocks.NETHER_GOLD_ORE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.NETHER_GOLD_ORE_FENCE.get());
        this.dropSelf(ModBlocks.NETHER_GOLD_ORE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.NETHER_GOLD_ORE_WALL.get());
        this.dropSelf(ModBlocks.NETHER_GOLD_ORE_BUTTON.get());
        this.dropSelf(ModBlocks.NETHER_GOLD_ORE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.NETHER_QUARTZ_ORE_STAIRS.get());
        this.add(ModBlocks.NETHER_QUARTZ_ORE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.NETHER_QUARTZ_ORE_FENCE.get());
        this.dropSelf(ModBlocks.NETHER_QUARTZ_ORE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.NETHER_QUARTZ_ORE_WALL.get());
        this.dropSelf(ModBlocks.NETHER_QUARTZ_ORE_BUTTON.get());
        this.dropSelf(ModBlocks.NETHER_QUARTZ_ORE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.BUDDING_AMETHYST_STAIRS.get());
        this.add(ModBlocks.BUDDING_AMETHYST_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.BUDDING_AMETHYST_FENCE.get());
        this.dropSelf(ModBlocks.BUDDING_AMETHYST_FENCE_GATE.get());
        this.dropSelf(ModBlocks.BUDDING_AMETHYST_WALL.get());
        this.dropSelf(ModBlocks.BUDDING_AMETHYST_BUTTON.get());
        this.dropSelf(ModBlocks.BUDDING_AMETHYST_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.SPONGE_STAIRS.get());
        this.add(ModBlocks.SPONGE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.SPONGE_FENCE.get());
        this.dropSelf(ModBlocks.SPONGE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.SPONGE_WALL.get());
        this.dropSelf(ModBlocks.SPONGE_BUTTON.get());
        this.dropSelf(ModBlocks.SPONGE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.WET_SPONGE_STAIRS.get());
        this.add(ModBlocks.WET_SPONGE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.WET_SPONGE_FENCE.get());
        this.dropSelf(ModBlocks.WET_SPONGE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.WET_SPONGE_WALL.get());
        this.dropSelf(ModBlocks.WET_SPONGE_BUTTON.get());
        this.dropSelf(ModBlocks.WET_SPONGE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.WHITE_WOOL_STAIRS.get());
        this.add(ModBlocks.WHITE_WOOL_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.WHITE_WOOL_FENCE.get());
        this.dropSelf(ModBlocks.WHITE_WOOL_FENCE_GATE.get());
        this.dropSelf(ModBlocks.WHITE_WOOL_WALL.get());
        this.dropSelf(ModBlocks.WHITE_WOOL_BUTTON.get());
        this.dropSelf(ModBlocks.WHITE_WOOL_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.ORANGE_WOOL_STAIRS.get());
        this.add(ModBlocks.ORANGE_WOOL_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.ORANGE_WOOL_FENCE.get());
        this.dropSelf(ModBlocks.ORANGE_WOOL_FENCE_GATE.get());
        this.dropSelf(ModBlocks.ORANGE_WOOL_WALL.get());
        this.dropSelf(ModBlocks.ORANGE_WOOL_BUTTON.get());
        this.dropSelf(ModBlocks.ORANGE_WOOL_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.MAGENTA_WOOL_STAIRS.get());
        this.add(ModBlocks.MAGENTA_WOOL_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.MAGENTA_WOOL_FENCE.get());
        this.dropSelf(ModBlocks.MAGENTA_WOOL_FENCE_GATE.get());
        this.dropSelf(ModBlocks.MAGENTA_WOOL_WALL.get());
        this.dropSelf(ModBlocks.MAGENTA_WOOL_BUTTON.get());
        this.dropSelf(ModBlocks.MAGENTA_WOOL_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.LIGHT_BLUE_WOOL_STAIRS.get());
        this.add(ModBlocks.LIGHT_BLUE_WOOL_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.LIGHT_BLUE_WOOL_FENCE.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_WOOL_FENCE_GATE.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_WOOL_WALL.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_WOOL_BUTTON.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_WOOL_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.YELLOW_WOOL_STAIRS.get());
        this.add(ModBlocks.YELLOW_WOOL_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.YELLOW_WOOL_FENCE.get());
        this.dropSelf(ModBlocks.YELLOW_WOOL_FENCE_GATE.get());
        this.dropSelf(ModBlocks.YELLOW_WOOL_WALL.get());
        this.dropSelf(ModBlocks.YELLOW_WOOL_BUTTON.get());
        this.dropSelf(ModBlocks.YELLOW_WOOL_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.LIME_WOOL_STAIRS.get());
        this.add(ModBlocks.LIME_WOOL_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.LIME_WOOL_FENCE.get());
        this.dropSelf(ModBlocks.LIME_WOOL_FENCE_GATE.get());
        this.dropSelf(ModBlocks.LIME_WOOL_WALL.get());
        this.dropSelf(ModBlocks.LIME_WOOL_BUTTON.get());
        this.dropSelf(ModBlocks.LIME_WOOL_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.PINK_WOOL_STAIRS.get());
        this.add(ModBlocks.PINK_WOOL_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.PINK_WOOL_FENCE.get());
        this.dropSelf(ModBlocks.PINK_WOOL_FENCE_GATE.get());
        this.dropSelf(ModBlocks.PINK_WOOL_WALL.get());
        this.dropSelf(ModBlocks.PINK_WOOL_BUTTON.get());
        this.dropSelf(ModBlocks.PINK_WOOL_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.GRAY_WOOL_STAIRS.get());
        this.add(ModBlocks.GRAY_WOOL_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.GRAY_WOOL_FENCE.get());
        this.dropSelf(ModBlocks.GRAY_WOOL_FENCE_GATE.get());
        this.dropSelf(ModBlocks.GRAY_WOOL_WALL.get());
        this.dropSelf(ModBlocks.GRAY_WOOL_BUTTON.get());
        this.dropSelf(ModBlocks.GRAY_WOOL_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.LIGHT_GRAY_WOOL_STAIRS.get());
        this.add(ModBlocks.LIGHT_GRAY_WOOL_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.LIGHT_GRAY_WOOL_FENCE.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_WOOL_FENCE_GATE.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_WOOL_WALL.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_WOOL_BUTTON.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_WOOL_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.CYAN_WOOL_STAIRS.get());
        this.add(ModBlocks.CYAN_WOOL_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.CYAN_WOOL_FENCE.get());
        this.dropSelf(ModBlocks.CYAN_WOOL_FENCE_GATE.get());
        this.dropSelf(ModBlocks.CYAN_WOOL_WALL.get());
        this.dropSelf(ModBlocks.CYAN_WOOL_BUTTON.get());
        this.dropSelf(ModBlocks.CYAN_WOOL_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.PURPLE_WOOL_STAIRS.get());
        this.add(ModBlocks.PURPLE_WOOL_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.PURPLE_WOOL_FENCE.get());
        this.dropSelf(ModBlocks.PURPLE_WOOL_FENCE_GATE.get());
        this.dropSelf(ModBlocks.PURPLE_WOOL_WALL.get());
        this.dropSelf(ModBlocks.PURPLE_WOOL_BUTTON.get());
        this.dropSelf(ModBlocks.PURPLE_WOOL_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.BLUE_WOOL_STAIRS.get());
        this.add(ModBlocks.BLUE_WOOL_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.BLUE_WOOL_FENCE.get());
        this.dropSelf(ModBlocks.BLUE_WOOL_FENCE_GATE.get());
        this.dropSelf(ModBlocks.BLUE_WOOL_WALL.get());
        this.dropSelf(ModBlocks.BLUE_WOOL_BUTTON.get());
        this.dropSelf(ModBlocks.BLUE_WOOL_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.BROWN_WOOL_STAIRS.get());
        this.add(ModBlocks.BROWN_WOOL_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.BROWN_WOOL_FENCE.get());
        this.dropSelf(ModBlocks.BROWN_WOOL_FENCE_GATE.get());
        this.dropSelf(ModBlocks.BROWN_WOOL_WALL.get());
        this.dropSelf(ModBlocks.BROWN_WOOL_BUTTON.get());
        this.dropSelf(ModBlocks.BROWN_WOOL_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.GREEN_WOOL_STAIRS.get());
        this.add(ModBlocks.GREEN_WOOL_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.GREEN_WOOL_FENCE.get());
        this.dropSelf(ModBlocks.GREEN_WOOL_FENCE_GATE.get());
        this.dropSelf(ModBlocks.GREEN_WOOL_WALL.get());
        this.dropSelf(ModBlocks.GREEN_WOOL_BUTTON.get());
        this.dropSelf(ModBlocks.GREEN_WOOL_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.RED_WOOL_STAIRS.get());
        this.add(ModBlocks.RED_WOOL_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.RED_WOOL_FENCE.get());
        this.dropSelf(ModBlocks.RED_WOOL_FENCE_GATE.get());
        this.dropSelf(ModBlocks.RED_WOOL_WALL.get());
        this.dropSelf(ModBlocks.RED_WOOL_BUTTON.get());
        this.dropSelf(ModBlocks.RED_WOOL_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.BLACK_WOOL_STAIRS.get());
        this.add(ModBlocks.BLACK_WOOL_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.BLACK_WOOL_FENCE.get());
        this.dropSelf(ModBlocks.BLACK_WOOL_FENCE_GATE.get());
        this.dropSelf(ModBlocks.BLACK_WOOL_WALL.get());
        this.dropSelf(ModBlocks.BLACK_WOOL_BUTTON.get());
        this.dropSelf(ModBlocks.BLACK_WOOL_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.SMOOTH_STONE_STAIRS.get());
        this.add(ModBlocks.SMOOTH_STONE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.SMOOTH_STONE_FENCE.get());
        this.dropSelf(ModBlocks.SMOOTH_STONE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.SMOOTH_STONE_WALL.get());
        this.dropSelf(ModBlocks.SMOOTH_STONE_BUTTON.get());
        this.dropSelf(ModBlocks.SMOOTH_STONE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.BRICKS_STAIRS.get());
        this.add(ModBlocks.BRICKS_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.BRICKS_FENCE.get());
        this.dropSelf(ModBlocks.BRICKS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.BRICKS_WALL.get());
        this.dropSelf(ModBlocks.BRICKS_BUTTON.get());
        this.dropSelf(ModBlocks.BRICKS_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.MOSSY_COBBLESTONE_STAIRS.get());
        this.add(ModBlocks.MOSSY_COBBLESTONE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.MOSSY_COBBLESTONE_FENCE.get());
        this.dropSelf(ModBlocks.MOSSY_COBBLESTONE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.MOSSY_COBBLESTONE_WALL.get());
        this.dropSelf(ModBlocks.MOSSY_COBBLESTONE_BUTTON.get());
        this.dropSelf(ModBlocks.MOSSY_COBBLESTONE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.OBSIDIAN_STAIRS.get());
        this.add(ModBlocks.OBSIDIAN_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.OBSIDIAN_FENCE.get());
        this.dropSelf(ModBlocks.OBSIDIAN_FENCE_GATE.get());
        this.dropSelf(ModBlocks.OBSIDIAN_WALL.get());
        this.dropSelf(ModBlocks.OBSIDIAN_BUTTON.get());
        this.dropSelf(ModBlocks.OBSIDIAN_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.CLAY_STAIRS.get());
        this.add(ModBlocks.CLAY_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.CLAY_FENCE.get());
        this.dropSelf(ModBlocks.CLAY_FENCE_GATE.get());
        this.dropSelf(ModBlocks.CLAY_WALL.get());
        this.dropSelf(ModBlocks.CLAY_BUTTON.get());
        this.dropSelf(ModBlocks.CLAY_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.SOUL_SAND_STAIRS.get());
        this.add(ModBlocks.SOUL_SAND_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.SOUL_SAND_FENCE.get());
        this.dropSelf(ModBlocks.SOUL_SAND_FENCE_GATE.get());
        this.dropSelf(ModBlocks.SOUL_SAND_WALL.get());
        this.dropSelf(ModBlocks.SOUL_SAND_BUTTON.get());
        this.dropSelf(ModBlocks.SOUL_SAND_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.SOUL_SOIL_STAIRS.get());
        this.add(ModBlocks.SOUL_SOIL_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.SOUL_SOIL_FENCE.get());
        this.dropSelf(ModBlocks.SOUL_SOIL_FENCE_GATE.get());
        this.dropSelf(ModBlocks.SOUL_SOIL_WALL.get());
        this.dropSelf(ModBlocks.SOUL_SOIL_BUTTON.get());
        this.dropSelf(ModBlocks.SOUL_SOIL_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.SMOOTH_BASALT_STAIRS.get());
        this.add(ModBlocks.SMOOTH_BASALT_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.SMOOTH_BASALT_FENCE.get());
        this.dropSelf(ModBlocks.SMOOTH_BASALT_FENCE_GATE.get());
        this.dropSelf(ModBlocks.SMOOTH_BASALT_WALL.get());
        this.dropSelf(ModBlocks.SMOOTH_BASALT_BUTTON.get());
        this.dropSelf(ModBlocks.SMOOTH_BASALT_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.STONE_BRICKS_STAIRS.get());
        this.add(ModBlocks.STONE_BRICKS_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.STONE_BRICKS_FENCE.get());
        this.dropSelf(ModBlocks.STONE_BRICKS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.STONE_BRICKS_WALL.get());
        this.dropSelf(ModBlocks.STONE_BRICKS_BUTTON.get());
        this.dropSelf(ModBlocks.STONE_BRICKS_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.MOSSY_STONE_BRICKS_STAIRS.get());
        this.add(ModBlocks.MOSSY_STONE_BRICKS_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.MOSSY_STONE_BRICKS_FENCE.get());
        this.dropSelf(ModBlocks.MOSSY_STONE_BRICKS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.MOSSY_STONE_BRICKS_WALL.get());
        this.dropSelf(ModBlocks.MOSSY_STONE_BRICKS_BUTTON.get());
        this.dropSelf(ModBlocks.MOSSY_STONE_BRICKS_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.CRACKED_STONE_BRICKS_STAIRS.get());
        this.add(ModBlocks.CRACKED_STONE_BRICKS_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.CRACKED_STONE_BRICKS_FENCE.get());
        this.dropSelf(ModBlocks.CRACKED_STONE_BRICKS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.CRACKED_STONE_BRICKS_WALL.get());
        this.dropSelf(ModBlocks.CRACKED_STONE_BRICKS_BUTTON.get());
        this.dropSelf(ModBlocks.CRACKED_STONE_BRICKS_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.CHISELED_STONE_BRICKS_STAIRS.get());
        this.add(ModBlocks.CHISELED_STONE_BRICKS_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.CHISELED_STONE_BRICKS_FENCE.get());
        this.dropSelf(ModBlocks.CHISELED_STONE_BRICKS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.CHISELED_STONE_BRICKS_WALL.get());
        this.dropSelf(ModBlocks.CHISELED_STONE_BRICKS_BUTTON.get());
        this.dropSelf(ModBlocks.CHISELED_STONE_BRICKS_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.PACKED_MUD_STAIRS.get());
        this.add(ModBlocks.PACKED_MUD_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.PACKED_MUD_FENCE.get());
        this.dropSelf(ModBlocks.PACKED_MUD_FENCE_GATE.get());
        this.dropSelf(ModBlocks.PACKED_MUD_WALL.get());
        this.dropSelf(ModBlocks.PACKED_MUD_BUTTON.get());
        this.dropSelf(ModBlocks.PACKED_MUD_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.MUD_BRICKS_STAIRS.get());
        this.add(ModBlocks.MUD_BRICKS_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.MUD_BRICKS_FENCE.get());
        this.dropSelf(ModBlocks.MUD_BRICKS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.MUD_BRICKS_WALL.get());
        this.dropSelf(ModBlocks.MUD_BRICKS_BUTTON.get());
        this.dropSelf(ModBlocks.MUD_BRICKS_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.DEEPSLATE_BRICKS_STAIRS.get());
        this.add(ModBlocks.DEEPSLATE_BRICKS_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.DEEPSLATE_BRICKS_FENCE.get());
        this.dropSelf(ModBlocks.DEEPSLATE_BRICKS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.DEEPSLATE_BRICKS_WALL.get());
        this.dropSelf(ModBlocks.DEEPSLATE_BRICKS_BUTTON.get());
        this.dropSelf(ModBlocks.DEEPSLATE_BRICKS_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.CRACKED_DEEPSLATE_BRICKS_STAIRS.get());
        this.add(ModBlocks.CRACKED_DEEPSLATE_BRICKS_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.CRACKED_DEEPSLATE_BRICKS_FENCE.get());
        this.dropSelf(ModBlocks.CRACKED_DEEPSLATE_BRICKS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.CRACKED_DEEPSLATE_BRICKS_WALL.get());
        this.dropSelf(ModBlocks.CRACKED_DEEPSLATE_BRICKS_BUTTON.get());
        this.dropSelf(ModBlocks.CRACKED_DEEPSLATE_BRICKS_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.DEEPSLATE_TILES_STAIRS.get());
        this.add(ModBlocks.DEEPSLATE_TILES_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.DEEPSLATE_TILES_FENCE.get());
        this.dropSelf(ModBlocks.DEEPSLATE_TILES_FENCE_GATE.get());
        this.dropSelf(ModBlocks.DEEPSLATE_TILES_WALL.get());
        this.dropSelf(ModBlocks.DEEPSLATE_TILES_BUTTON.get());
        this.dropSelf(ModBlocks.DEEPSLATE_TILES_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.CRACKED_DEEPSLATE_TILES_STAIRS.get());
        this.add(ModBlocks.CRACKED_DEEPSLATE_TILES_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.CRACKED_DEEPSLATE_TILES_FENCE.get());
        this.dropSelf(ModBlocks.CRACKED_DEEPSLATE_TILES_FENCE_GATE.get());
        this.dropSelf(ModBlocks.CRACKED_DEEPSLATE_TILES_WALL.get());
        this.dropSelf(ModBlocks.CRACKED_DEEPSLATE_TILES_BUTTON.get());
        this.dropSelf(ModBlocks.CRACKED_DEEPSLATE_TILES_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.CHISELED_DEEPSLATE_STAIRS.get());
        this.add(ModBlocks.CHISELED_DEEPSLATE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.CHISELED_DEEPSLATE_FENCE.get());
        this.dropSelf(ModBlocks.CHISELED_DEEPSLATE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.CHISELED_DEEPSLATE_WALL.get());
        this.dropSelf(ModBlocks.CHISELED_DEEPSLATE_BUTTON.get());
        this.dropSelf(ModBlocks.CHISELED_DEEPSLATE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.MUSHROOM_STEM_STAIRS.get());
        this.add(ModBlocks.MUSHROOM_STEM_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.MUSHROOM_STEM_FENCE.get());
        this.dropSelf(ModBlocks.MUSHROOM_STEM_FENCE_GATE.get());
        this.dropSelf(ModBlocks.MUSHROOM_STEM_WALL.get());
        this.dropSelf(ModBlocks.MUSHROOM_STEM_BUTTON.get());
        this.dropSelf(ModBlocks.MUSHROOM_STEM_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.NETHER_BRICKS_STAIRS.get());
        this.add(ModBlocks.NETHER_BRICKS_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.NETHER_BRICKS_FENCE.get());
        this.dropSelf(ModBlocks.NETHER_BRICKS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.NETHER_BRICKS_WALL.get());
        this.dropSelf(ModBlocks.NETHER_BRICKS_BUTTON.get());
        this.dropSelf(ModBlocks.NETHER_BRICKS_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.CRACKED_NETHER_BRICKS_STAIRS.get());
        this.add(ModBlocks.CRACKED_NETHER_BRICKS_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.CRACKED_NETHER_BRICKS_FENCE.get());
        this.dropSelf(ModBlocks.CRACKED_NETHER_BRICKS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.CRACKED_NETHER_BRICKS_WALL.get());
        this.dropSelf(ModBlocks.CRACKED_NETHER_BRICKS_BUTTON.get());
        this.dropSelf(ModBlocks.CRACKED_NETHER_BRICKS_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.CHISELED_NETHER_BRICKS_STAIRS.get());
        this.add(ModBlocks.CHISELED_NETHER_BRICKS_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.CHISELED_NETHER_BRICKS_FENCE.get());
        this.dropSelf(ModBlocks.CHISELED_NETHER_BRICKS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.CHISELED_NETHER_BRICKS_WALL.get());
        this.dropSelf(ModBlocks.CHISELED_NETHER_BRICKS_BUTTON.get());
        this.dropSelf(ModBlocks.CHISELED_NETHER_BRICKS_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.SCULK_STAIRS.get());
        this.add(ModBlocks.SCULK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.SCULK_FENCE.get());
        this.dropSelf(ModBlocks.SCULK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.SCULK_WALL.get());
        this.dropSelf(ModBlocks.SCULK_BUTTON.get());
        this.dropSelf(ModBlocks.SCULK_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.END_STONE_STAIRS.get());
        this.add(ModBlocks.END_STONE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.END_STONE_FENCE.get());
        this.dropSelf(ModBlocks.END_STONE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.END_STONE_WALL.get());
        this.dropSelf(ModBlocks.END_STONE_BUTTON.get());
        this.dropSelf(ModBlocks.END_STONE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.END_STONE_BRICKS_STAIRS.get());
        this.add(ModBlocks.END_STONE_BRICKS_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.END_STONE_BRICKS_FENCE.get());
        this.dropSelf(ModBlocks.END_STONE_BRICKS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.END_STONE_BRICKS_WALL.get());
        this.dropSelf(ModBlocks.END_STONE_BRICKS_BUTTON.get());
        this.dropSelf(ModBlocks.END_STONE_BRICKS_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.QUARTZ_BRICKS_STAIRS.get());
        this.add(ModBlocks.QUARTZ_BRICKS_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.QUARTZ_BRICKS_FENCE.get());
        this.dropSelf(ModBlocks.QUARTZ_BRICKS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.QUARTZ_BRICKS_WALL.get());
        this.dropSelf(ModBlocks.QUARTZ_BRICKS_BUTTON.get());
        this.dropSelf(ModBlocks.QUARTZ_BRICKS_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.WHITE_TERRACOTTA_STAIRS.get());
        this.add(ModBlocks.WHITE_TERRACOTTA_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.WHITE_TERRACOTTA_FENCE.get());
        this.dropSelf(ModBlocks.WHITE_TERRACOTTA_FENCE_GATE.get());
        this.dropSelf(ModBlocks.WHITE_TERRACOTTA_WALL.get());
        this.dropSelf(ModBlocks.WHITE_TERRACOTTA_BUTTON.get());
        this.dropSelf(ModBlocks.WHITE_TERRACOTTA_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.ORANGE_TERRACOTTA_STAIRS.get());
        this.add(ModBlocks.ORANGE_TERRACOTTA_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.ORANGE_TERRACOTTA_FENCE.get());
        this.dropSelf(ModBlocks.ORANGE_TERRACOTTA_FENCE_GATE.get());
        this.dropSelf(ModBlocks.ORANGE_TERRACOTTA_WALL.get());
        this.dropSelf(ModBlocks.ORANGE_TERRACOTTA_BUTTON.get());
        this.dropSelf(ModBlocks.ORANGE_TERRACOTTA_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.MAGENTA_TERRACOTTA_STAIRS.get());
        this.add(ModBlocks.MAGENTA_TERRACOTTA_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.MAGENTA_TERRACOTTA_FENCE.get());
        this.dropSelf(ModBlocks.MAGENTA_TERRACOTTA_FENCE_GATE.get());
        this.dropSelf(ModBlocks.MAGENTA_TERRACOTTA_WALL.get());
        this.dropSelf(ModBlocks.MAGENTA_TERRACOTTA_BUTTON.get());
        this.dropSelf(ModBlocks.MAGENTA_TERRACOTTA_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get());
        this.add(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.LIGHT_BLUE_TERRACOTTA_FENCE.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_TERRACOTTA_FENCE_GATE.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_TERRACOTTA_BUTTON.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_TERRACOTTA_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.YELLOW_TERRACOTTA_STAIRS.get());
        this.add(ModBlocks.YELLOW_TERRACOTTA_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.YELLOW_TERRACOTTA_FENCE.get());
        this.dropSelf(ModBlocks.YELLOW_TERRACOTTA_FENCE_GATE.get());
        this.dropSelf(ModBlocks.YELLOW_TERRACOTTA_WALL.get());
        this.dropSelf(ModBlocks.YELLOW_TERRACOTTA_BUTTON.get());
        this.dropSelf(ModBlocks.YELLOW_TERRACOTTA_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.LIME_TERRACOTTA_STAIRS.get());
        this.add(ModBlocks.LIME_TERRACOTTA_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.LIME_TERRACOTTA_FENCE.get());
        this.dropSelf(ModBlocks.LIME_TERRACOTTA_FENCE_GATE.get());
        this.dropSelf(ModBlocks.LIME_TERRACOTTA_WALL.get());
        this.dropSelf(ModBlocks.LIME_TERRACOTTA_BUTTON.get());
        this.dropSelf(ModBlocks.LIME_TERRACOTTA_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.PINK_TERRACOTTA_STAIRS.get());
        this.add(ModBlocks.PINK_TERRACOTTA_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.PINK_TERRACOTTA_FENCE.get());
        this.dropSelf(ModBlocks.PINK_TERRACOTTA_FENCE_GATE.get());
        this.dropSelf(ModBlocks.PINK_TERRACOTTA_WALL.get());
        this.dropSelf(ModBlocks.PINK_TERRACOTTA_BUTTON.get());
        this.dropSelf(ModBlocks.PINK_TERRACOTTA_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.GRAY_TERRACOTTA_STAIRS.get());
        this.add(ModBlocks.GRAY_TERRACOTTA_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.GRAY_TERRACOTTA_FENCE.get());
        this.dropSelf(ModBlocks.GRAY_TERRACOTTA_FENCE_GATE.get());
        this.dropSelf(ModBlocks.GRAY_TERRACOTTA_WALL.get());
        this.dropSelf(ModBlocks.GRAY_TERRACOTTA_BUTTON.get());
        this.dropSelf(ModBlocks.GRAY_TERRACOTTA_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get());
        this.add(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.LIGHT_GRAY_TERRACOTTA_FENCE.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_TERRACOTTA_FENCE_GATE.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_TERRACOTTA_BUTTON.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_TERRACOTTA_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.CYAN_TERRACOTTA_STAIRS.get());
        this.add(ModBlocks.CYAN_TERRACOTTA_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.CYAN_TERRACOTTA_FENCE.get());
        this.dropSelf(ModBlocks.CYAN_TERRACOTTA_FENCE_GATE.get());
        this.dropSelf(ModBlocks.CYAN_TERRACOTTA_WALL.get());
        this.dropSelf(ModBlocks.CYAN_TERRACOTTA_BUTTON.get());
        this.dropSelf(ModBlocks.CYAN_TERRACOTTA_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.PURPLE_TERRACOTTA_STAIRS.get());
        this.add(ModBlocks.PURPLE_TERRACOTTA_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.PURPLE_TERRACOTTA_FENCE.get());
        this.dropSelf(ModBlocks.PURPLE_TERRACOTTA_FENCE_GATE.get());
        this.dropSelf(ModBlocks.PURPLE_TERRACOTTA_WALL.get());
        this.dropSelf(ModBlocks.PURPLE_TERRACOTTA_BUTTON.get());
        this.dropSelf(ModBlocks.PURPLE_TERRACOTTA_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.BLUE_TERRACOTTA_STAIRS.get());
        this.add(ModBlocks.BLUE_TERRACOTTA_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.BLUE_TERRACOTTA_FENCE.get());
        this.dropSelf(ModBlocks.BLUE_TERRACOTTA_FENCE_GATE.get());
        this.dropSelf(ModBlocks.BLUE_TERRACOTTA_WALL.get());
        this.dropSelf(ModBlocks.BLUE_TERRACOTTA_BUTTON.get());
        this.dropSelf(ModBlocks.BLUE_TERRACOTTA_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.BROWN_TERRACOTTA_STAIRS.get());
        this.add(ModBlocks.BROWN_TERRACOTTA_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.BROWN_TERRACOTTA_FENCE.get());
        this.dropSelf(ModBlocks.BROWN_TERRACOTTA_FENCE_GATE.get());
        this.dropSelf(ModBlocks.BROWN_TERRACOTTA_WALL.get());
        this.dropSelf(ModBlocks.BROWN_TERRACOTTA_BUTTON.get());
        this.dropSelf(ModBlocks.BROWN_TERRACOTTA_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.GREEN_TERRACOTTA_STAIRS.get());
        this.add(ModBlocks.GREEN_TERRACOTTA_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.GREEN_TERRACOTTA_FENCE.get());
        this.dropSelf(ModBlocks.GREEN_TERRACOTTA_FENCE_GATE.get());
        this.dropSelf(ModBlocks.GREEN_TERRACOTTA_WALL.get());
        this.dropSelf(ModBlocks.GREEN_TERRACOTTA_BUTTON.get());
        this.dropSelf(ModBlocks.GREEN_TERRACOTTA_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.RED_TERRACOTTA_STAIRS.get());
        this.add(ModBlocks.RED_TERRACOTTA_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.RED_TERRACOTTA_FENCE.get());
        this.dropSelf(ModBlocks.RED_TERRACOTTA_FENCE_GATE.get());
        this.dropSelf(ModBlocks.RED_TERRACOTTA_WALL.get());
        this.dropSelf(ModBlocks.RED_TERRACOTTA_BUTTON.get());
        this.dropSelf(ModBlocks.RED_TERRACOTTA_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.BLACK_TERRACOTTA_STAIRS.get());
        this.add(ModBlocks.BLACK_TERRACOTTA_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.BLACK_TERRACOTTA_FENCE.get());
        this.dropSelf(ModBlocks.BLACK_TERRACOTTA_FENCE_GATE.get());
        this.dropSelf(ModBlocks.BLACK_TERRACOTTA_WALL.get());
        this.dropSelf(ModBlocks.BLACK_TERRACOTTA_BUTTON.get());
        this.dropSelf(ModBlocks.BLACK_TERRACOTTA_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.TERRACOTTA_STAIRS.get());
        this.add(ModBlocks.TERRACOTTA_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.TERRACOTTA_FENCE.get());
        this.dropSelf(ModBlocks.TERRACOTTA_FENCE_GATE.get());
        this.dropSelf(ModBlocks.TERRACOTTA_WALL.get());
        this.dropSelf(ModBlocks.TERRACOTTA_BUTTON.get());
        this.dropSelf(ModBlocks.TERRACOTTA_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.PRISMARINE_STAIRS.get());
        this.add(ModBlocks.PRISMARINE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.PRISMARINE_FENCE.get());
        this.dropSelf(ModBlocks.PRISMARINE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.PRISMARINE_WALL.get());
        this.dropSelf(ModBlocks.PRISMARINE_BUTTON.get());
        this.dropSelf(ModBlocks.PRISMARINE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.PRISMARINE_BRICKS_STAIRS.get());
        this.add(ModBlocks.PRISMARINE_BRICKS_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.PRISMARINE_BRICKS_FENCE.get());
        this.dropSelf(ModBlocks.PRISMARINE_BRICKS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.PRISMARINE_BRICKS_WALL.get());
        this.dropSelf(ModBlocks.PRISMARINE_BRICKS_BUTTON.get());
        this.dropSelf(ModBlocks.PRISMARINE_BRICKS_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.DARK_PRISMARINE_STAIRS.get());
        this.add(ModBlocks.DARK_PRISMARINE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.DARK_PRISMARINE_FENCE.get());
        this.dropSelf(ModBlocks.DARK_PRISMARINE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.DARK_PRISMARINE_WALL.get());
        this.dropSelf(ModBlocks.DARK_PRISMARINE_BUTTON.get());
        this.dropSelf(ModBlocks.DARK_PRISMARINE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.NETHER_WART_BLOCK_STAIRS.get());
        this.add(ModBlocks.NETHER_WART_BLOCK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.NETHER_WART_BLOCK_FENCE.get());
        this.dropSelf(ModBlocks.NETHER_WART_BLOCK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.NETHER_WART_BLOCK_WALL.get());
        this.dropSelf(ModBlocks.NETHER_WART_BLOCK_BUTTON.get());
        this.dropSelf(ModBlocks.NETHER_WART_BLOCK_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.WARPED_WART_BLOCK_STAIRS.get());
        this.add(ModBlocks.WARPED_WART_BLOCK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.WARPED_WART_BLOCK_FENCE.get());
        this.dropSelf(ModBlocks.WARPED_WART_BLOCK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.WARPED_WART_BLOCK_WALL.get());
        this.dropSelf(ModBlocks.WARPED_WART_BLOCK_BUTTON.get());
        this.dropSelf(ModBlocks.WARPED_WART_BLOCK_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.RED_NETHER_BRICKS_STAIRS.get());
        this.add(ModBlocks.RED_NETHER_BRICKS_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.RED_NETHER_BRICKS_FENCE.get());
        this.dropSelf(ModBlocks.RED_NETHER_BRICKS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.RED_NETHER_BRICKS_WALL.get());
        this.dropSelf(ModBlocks.RED_NETHER_BRICKS_BUTTON.get());
        this.dropSelf(ModBlocks.RED_NETHER_BRICKS_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.WHITE_CONCRETE_STAIRS.get());
        this.add(ModBlocks.WHITE_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.WHITE_CONCRETE_FENCE.get());
        this.dropSelf(ModBlocks.WHITE_CONCRETE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.WHITE_CONCRETE_WALL.get());
        this.dropSelf(ModBlocks.WHITE_CONCRETE_BUTTON.get());
        this.dropSelf(ModBlocks.WHITE_CONCRETE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.ORANGE_CONCRETE_STAIRS.get());
        this.add(ModBlocks.ORANGE_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.ORANGE_CONCRETE_FENCE.get());
        this.dropSelf(ModBlocks.ORANGE_CONCRETE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.ORANGE_CONCRETE_WALL.get());
        this.dropSelf(ModBlocks.ORANGE_CONCRETE_BUTTON.get());
        this.dropSelf(ModBlocks.ORANGE_CONCRETE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.MAGENTA_CONCRETE_STAIRS.get());
        this.add(ModBlocks.MAGENTA_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.MAGENTA_CONCRETE_FENCE.get());
        this.dropSelf(ModBlocks.MAGENTA_CONCRETE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.MAGENTA_CONCRETE_WALL.get());
        this.dropSelf(ModBlocks.MAGENTA_CONCRETE_BUTTON.get());
        this.dropSelf(ModBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get());
        this.add(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.LIGHT_BLUE_CONCRETE_FENCE.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_CONCRETE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_CONCRETE_WALL.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.YELLOW_CONCRETE_STAIRS.get());
        this.add(ModBlocks.YELLOW_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.YELLOW_CONCRETE_FENCE.get());
        this.dropSelf(ModBlocks.YELLOW_CONCRETE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.YELLOW_CONCRETE_WALL.get());
        this.dropSelf(ModBlocks.YELLOW_CONCRETE_BUTTON.get());
        this.dropSelf(ModBlocks.YELLOW_CONCRETE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.LIME_CONCRETE_STAIRS.get());
        this.add(ModBlocks.LIME_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.LIME_CONCRETE_FENCE.get());
        this.dropSelf(ModBlocks.LIME_CONCRETE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.LIME_CONCRETE_WALL.get());
        this.dropSelf(ModBlocks.LIME_CONCRETE_BUTTON.get());
        this.dropSelf(ModBlocks.LIME_CONCRETE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.PINK_CONCRETE_STAIRS.get());
        this.add(ModBlocks.PINK_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.PINK_CONCRETE_FENCE.get());
        this.dropSelf(ModBlocks.PINK_CONCRETE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.PINK_CONCRETE_WALL.get());
        this.dropSelf(ModBlocks.PINK_CONCRETE_BUTTON.get());
        this.dropSelf(ModBlocks.PINK_CONCRETE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.GRAY_CONCRETE_STAIRS.get());
        this.add(ModBlocks.GRAY_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.GRAY_CONCRETE_FENCE.get());
        this.dropSelf(ModBlocks.GRAY_CONCRETE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.GRAY_CONCRETE_WALL.get());
        this.dropSelf(ModBlocks.GRAY_CONCRETE_BUTTON.get());
        this.dropSelf(ModBlocks.GRAY_CONCRETE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get());
        this.add(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.LIGHT_GRAY_CONCRETE_FENCE.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_CONCRETE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_CONCRETE_WALL.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.CYAN_CONCRETE_STAIRS.get());
        this.add(ModBlocks.CYAN_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.CYAN_CONCRETE_FENCE.get());
        this.dropSelf(ModBlocks.CYAN_CONCRETE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.CYAN_CONCRETE_WALL.get());
        this.dropSelf(ModBlocks.CYAN_CONCRETE_BUTTON.get());
        this.dropSelf(ModBlocks.CYAN_CONCRETE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.PURPLE_CONCRETE_STAIRS.get());
        this.add(ModBlocks.PURPLE_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.PURPLE_CONCRETE_FENCE.get());
        this.dropSelf(ModBlocks.PURPLE_CONCRETE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.PURPLE_CONCRETE_WALL.get());
        this.dropSelf(ModBlocks.PURPLE_CONCRETE_BUTTON.get());
        this.dropSelf(ModBlocks.PURPLE_CONCRETE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.BLUE_CONCRETE_STAIRS.get());
        this.add(ModBlocks.BLUE_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.BLUE_CONCRETE_FENCE.get());
        this.dropSelf(ModBlocks.BLUE_CONCRETE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.BLUE_CONCRETE_WALL.get());
        this.dropSelf(ModBlocks.BLUE_CONCRETE_BUTTON.get());
        this.dropSelf(ModBlocks.BLUE_CONCRETE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.BROWN_CONCRETE_STAIRS.get());
        this.add(ModBlocks.BROWN_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.BROWN_CONCRETE_FENCE.get());
        this.dropSelf(ModBlocks.BROWN_CONCRETE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.BROWN_CONCRETE_WALL.get());
        this.dropSelf(ModBlocks.BROWN_CONCRETE_BUTTON.get());
        this.dropSelf(ModBlocks.BROWN_CONCRETE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.GREEN_CONCRETE_STAIRS.get());
        this.add(ModBlocks.GREEN_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.GREEN_CONCRETE_FENCE.get());
        this.dropSelf(ModBlocks.GREEN_CONCRETE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.GREEN_CONCRETE_WALL.get());
        this.dropSelf(ModBlocks.GREEN_CONCRETE_BUTTON.get());
        this.dropSelf(ModBlocks.GREEN_CONCRETE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.RED_CONCRETE_STAIRS.get());
        this.add(ModBlocks.RED_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.RED_CONCRETE_FENCE.get());
        this.dropSelf(ModBlocks.RED_CONCRETE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.RED_CONCRETE_WALL.get());
        this.dropSelf(ModBlocks.RED_CONCRETE_BUTTON.get());
        this.dropSelf(ModBlocks.RED_CONCRETE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.BLACK_CONCRETE_STAIRS.get());
        this.add(ModBlocks.BLACK_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.BLACK_CONCRETE_FENCE.get());
        this.dropSelf(ModBlocks.BLACK_CONCRETE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.BLACK_CONCRETE_WALL.get());
        this.dropSelf(ModBlocks.BLACK_CONCRETE_BUTTON.get());
        this.dropSelf(ModBlocks.BLACK_CONCRETE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.HONEYCOMB_BLOCK_STAIRS.get());
        this.add(ModBlocks.HONEYCOMB_BLOCK_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.HONEYCOMB_BLOCK_FENCE.get());
        this.dropSelf(ModBlocks.HONEYCOMB_BLOCK_FENCE_GATE.get());
        this.dropSelf(ModBlocks.HONEYCOMB_BLOCK_WALL.get());
        this.dropSelf(ModBlocks.HONEYCOMB_BLOCK_BUTTON.get());
        this.dropSelf(ModBlocks.HONEYCOMB_BLOCK_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.CRYING_OBSIDIAN_STAIRS.get());
        this.add(ModBlocks.CRYING_OBSIDIAN_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.CRYING_OBSIDIAN_FENCE.get());
        this.dropSelf(ModBlocks.CRYING_OBSIDIAN_FENCE_GATE.get());
        this.dropSelf(ModBlocks.CRYING_OBSIDIAN_WALL.get());
        this.dropSelf(ModBlocks.CRYING_OBSIDIAN_BUTTON.get());
        this.dropSelf(ModBlocks.CRYING_OBSIDIAN_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.BLACKSTONE_STAIRS.get());
        this.add(ModBlocks.BLACKSTONE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.BLACKSTONE_FENCE.get());
        this.dropSelf(ModBlocks.BLACKSTONE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.BLACKSTONE_WALL.get());
        this.dropSelf(ModBlocks.BLACKSTONE_BUTTON.get());
        this.dropSelf(ModBlocks.BLACKSTONE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.GILDED_BLACKSTONE_STAIRS.get());
        this.add(ModBlocks.GILDED_BLACKSTONE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.GILDED_BLACKSTONE_FENCE.get());
        this.dropSelf(ModBlocks.GILDED_BLACKSTONE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.GILDED_BLACKSTONE_WALL.get());
        this.dropSelf(ModBlocks.GILDED_BLACKSTONE_BUTTON.get());
        this.dropSelf(ModBlocks.GILDED_BLACKSTONE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.POLISHED_BLACKSTONE_STAIRS.get());
        this.add(ModBlocks.POLISHED_BLACKSTONE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.POLISHED_BLACKSTONE_FENCE.get());
        this.dropSelf(ModBlocks.POLISHED_BLACKSTONE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.POLISHED_BLACKSTONE_WALL.get());
        this.dropSelf(ModBlocks.POLISHED_BLACKSTONE_BUTTON.get());
        this.dropSelf(ModBlocks.POLISHED_BLACKSTONE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.CHISELED_POLISHED_BLACKSTONE_STAIRS.get());
        this.add(ModBlocks.CHISELED_POLISHED_BLACKSTONE_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.CHISELED_POLISHED_BLACKSTONE_FENCE.get());
        this.dropSelf(ModBlocks.CHISELED_POLISHED_BLACKSTONE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.CHISELED_POLISHED_BLACKSTONE_WALL.get());
        this.dropSelf(ModBlocks.CHISELED_POLISHED_BLACKSTONE_BUTTON.get());
        this.dropSelf(ModBlocks.CHISELED_POLISHED_BLACKSTONE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.POLISHED_BLACKSTONE_BRICKS_STAIRS.get());
        this.add(ModBlocks.POLISHED_BLACKSTONE_BRICKS_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.POLISHED_BLACKSTONE_BRICKS_FENCE.get());
        this.dropSelf(ModBlocks.POLISHED_BLACKSTONE_BRICKS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.POLISHED_BLACKSTONE_BRICKS_WALL.get());
        this.dropSelf(ModBlocks.POLISHED_BLACKSTONE_BRICKS_BUTTON.get());
        this.dropSelf(ModBlocks.POLISHED_BLACKSTONE_BRICKS_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_STAIRS.get());
        this.add(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_FENCE.get());
        this.dropSelf(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_WALL.get());
        this.dropSelf(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_BUTTON.get());
        this.dropSelf(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.GLASS_STAIRS.get());
        this.add(ModBlocks.GLASS_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.GLASS_FENCE.get());
        this.dropSelf(ModBlocks.GLASS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.GLASS_WALL.get());
        this.dropSelf(ModBlocks.GLASS_BUTTON.get());
        this.dropSelf(ModBlocks.GLASS_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.TINTED_GLASS_STAIRS.get());
        this.add(ModBlocks.TINTED_GLASS_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.TINTED_GLASS_FENCE.get());
        this.dropSelf(ModBlocks.TINTED_GLASS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.TINTED_GLASS_WALL.get());
        this.dropSelf(ModBlocks.TINTED_GLASS_BUTTON.get());
        this.dropSelf(ModBlocks.TINTED_GLASS_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.WHITE_STAINED_GLASS_STAIRS.get());
        this.add(ModBlocks.WHITE_STAINED_GLASS_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.WHITE_STAINED_GLASS_FENCE.get());
        this.dropSelf(ModBlocks.WHITE_STAINED_GLASS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.WHITE_STAINED_GLASS_WALL.get());
        this.dropSelf(ModBlocks.WHITE_STAINED_GLASS_BUTTON.get());
        this.dropSelf(ModBlocks.WHITE_STAINED_GLASS_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.ORANGE_STAINED_GLASS_STAIRS.get());
        this.add(ModBlocks.ORANGE_STAINED_GLASS_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.ORANGE_STAINED_GLASS_FENCE.get());
        this.dropSelf(ModBlocks.ORANGE_STAINED_GLASS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.ORANGE_STAINED_GLASS_WALL.get());
        this.dropSelf(ModBlocks.ORANGE_STAINED_GLASS_BUTTON.get());
        this.dropSelf(ModBlocks.ORANGE_STAINED_GLASS_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.MAGENTA_STAINED_GLASS_STAIRS.get());
        this.add(ModBlocks.MAGENTA_STAINED_GLASS_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.MAGENTA_STAINED_GLASS_FENCE.get());
        this.dropSelf(ModBlocks.MAGENTA_STAINED_GLASS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.MAGENTA_STAINED_GLASS_WALL.get());
        this.dropSelf(ModBlocks.MAGENTA_STAINED_GLASS_BUTTON.get());
        this.dropSelf(ModBlocks.MAGENTA_STAINED_GLASS_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS.get());
        this.add(ModBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_STAINED_GLASS_WALL.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_STAINED_GLASS_BUTTON.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_STAINED_GLASS_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.YELLOW_STAINED_GLASS_STAIRS.get());
        this.add(ModBlocks.YELLOW_STAINED_GLASS_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.YELLOW_STAINED_GLASS_FENCE.get());
        this.dropSelf(ModBlocks.YELLOW_STAINED_GLASS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.YELLOW_STAINED_GLASS_WALL.get());
        this.dropSelf(ModBlocks.YELLOW_STAINED_GLASS_BUTTON.get());
        this.dropSelf(ModBlocks.YELLOW_STAINED_GLASS_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.LIME_STAINED_GLASS_STAIRS.get());
        this.add(ModBlocks.LIME_STAINED_GLASS_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.LIME_STAINED_GLASS_FENCE.get());
        this.dropSelf(ModBlocks.LIME_STAINED_GLASS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.LIME_STAINED_GLASS_WALL.get());
        this.dropSelf(ModBlocks.LIME_STAINED_GLASS_BUTTON.get());
        this.dropSelf(ModBlocks.LIME_STAINED_GLASS_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.PINK_STAINED_GLASS_STAIRS.get());
        this.add(ModBlocks.PINK_STAINED_GLASS_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.PINK_STAINED_GLASS_FENCE.get());
        this.dropSelf(ModBlocks.PINK_STAINED_GLASS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.PINK_STAINED_GLASS_WALL.get());
        this.dropSelf(ModBlocks.PINK_STAINED_GLASS_BUTTON.get());
        this.dropSelf(ModBlocks.PINK_STAINED_GLASS_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.GRAY_STAINED_GLASS_STAIRS.get());
        this.add(ModBlocks.GRAY_STAINED_GLASS_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.GRAY_STAINED_GLASS_FENCE.get());
        this.dropSelf(ModBlocks.GRAY_STAINED_GLASS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.GRAY_STAINED_GLASS_WALL.get());
        this.dropSelf(ModBlocks.GRAY_STAINED_GLASS_BUTTON.get());
        this.dropSelf(ModBlocks.GRAY_STAINED_GLASS_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS.get());
        this.add(ModBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_STAINED_GLASS_WALL.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_STAINED_GLASS_BUTTON.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_STAINED_GLASS_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.CYAN_STAINED_GLASS_STAIRS.get());
        this.add(ModBlocks.CYAN_STAINED_GLASS_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.CYAN_STAINED_GLASS_FENCE.get());
        this.dropSelf(ModBlocks.CYAN_STAINED_GLASS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.CYAN_STAINED_GLASS_WALL.get());
        this.dropSelf(ModBlocks.CYAN_STAINED_GLASS_BUTTON.get());
        this.dropSelf(ModBlocks.CYAN_STAINED_GLASS_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.PURPLE_STAINED_GLASS_STAIRS.get());
        this.add(ModBlocks.PURPLE_STAINED_GLASS_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.PURPLE_STAINED_GLASS_FENCE.get());
        this.dropSelf(ModBlocks.PURPLE_STAINED_GLASS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.PURPLE_STAINED_GLASS_WALL.get());
        this.dropSelf(ModBlocks.PURPLE_STAINED_GLASS_BUTTON.get());
        this.dropSelf(ModBlocks.PURPLE_STAINED_GLASS_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.BLUE_STAINED_GLASS_STAIRS.get());
        this.add(ModBlocks.BLUE_STAINED_GLASS_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.BLUE_STAINED_GLASS_FENCE.get());
        this.dropSelf(ModBlocks.BLUE_STAINED_GLASS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.BLUE_STAINED_GLASS_WALL.get());
        this.dropSelf(ModBlocks.BLUE_STAINED_GLASS_BUTTON.get());
        this.dropSelf(ModBlocks.BLUE_STAINED_GLASS_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.BROWN_STAINED_GLASS_STAIRS.get());
        this.add(ModBlocks.BROWN_STAINED_GLASS_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.BROWN_STAINED_GLASS_FENCE.get());
        this.dropSelf(ModBlocks.BROWN_STAINED_GLASS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.BROWN_STAINED_GLASS_WALL.get());
        this.dropSelf(ModBlocks.BROWN_STAINED_GLASS_BUTTON.get());
        this.dropSelf(ModBlocks.BROWN_STAINED_GLASS_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.GREEN_STAINED_GLASS_STAIRS.get());
        this.add(ModBlocks.GREEN_STAINED_GLASS_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.GREEN_STAINED_GLASS_FENCE.get());
        this.dropSelf(ModBlocks.GREEN_STAINED_GLASS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.GREEN_STAINED_GLASS_WALL.get());
        this.dropSelf(ModBlocks.GREEN_STAINED_GLASS_BUTTON.get());
        this.dropSelf(ModBlocks.GREEN_STAINED_GLASS_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.RED_STAINED_GLASS_STAIRS.get());
        this.add(ModBlocks.RED_STAINED_GLASS_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.RED_STAINED_GLASS_FENCE.get());
        this.dropSelf(ModBlocks.RED_STAINED_GLASS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.RED_STAINED_GLASS_WALL.get());
        this.dropSelf(ModBlocks.RED_STAINED_GLASS_BUTTON.get());
        this.dropSelf(ModBlocks.RED_STAINED_GLASS_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.BLACK_STAINED_GLASS_STAIRS.get());
        this.add(ModBlocks.BLACK_STAINED_GLASS_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.BLACK_STAINED_GLASS_FENCE.get());
        this.dropSelf(ModBlocks.BLACK_STAINED_GLASS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.BLACK_STAINED_GLASS_WALL.get());
        this.dropSelf(ModBlocks.BLACK_STAINED_GLASS_BUTTON.get());
        this.dropSelf(ModBlocks.BLACK_STAINED_GLASS_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.FLOWERING_AZALEA_LEAVES_STAIRS.get());
        this.add(ModBlocks.FLOWERING_AZALEA_LEAVES_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.FLOWERING_AZALEA_LEAVES_FENCE.get());
        this.dropSelf(ModBlocks.FLOWERING_AZALEA_LEAVES_FENCE_GATE.get());
        this.dropSelf(ModBlocks.FLOWERING_AZALEA_LEAVES_WALL.get());
        this.dropSelf(ModBlocks.FLOWERING_AZALEA_LEAVES_BUTTON.get());
        this.dropSelf(ModBlocks.FLOWERING_AZALEA_LEAVES_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.AZALEA_LEAVES_STAIRS.get());
        this.add(ModBlocks.AZALEA_LEAVES_SLAB.get(), BlockLoot::createSlabItemTable);
        this.dropSelf(ModBlocks.AZALEA_LEAVES_FENCE.get());
        this.dropSelf(ModBlocks.AZALEA_LEAVES_FENCE_GATE.get());
        this.dropSelf(ModBlocks.AZALEA_LEAVES_WALL.get());
        this.dropSelf(ModBlocks.AZALEA_LEAVES_BUTTON.get());
        this.dropSelf(ModBlocks.AZALEA_LEAVES_PRESSURE_PLATE.get());

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}