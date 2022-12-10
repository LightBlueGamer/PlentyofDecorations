package net.litecraft.plentyofdecorations.datagen;

import net.litecraft.plentyofdecorations.PlentyOfDecorations;
import net.litecraft.plentyofdecorations.block.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlocksStateProvider extends BlockStateProvider {
    public ModBlocksStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, PlentyOfDecorations.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        modStairsBlock("bedrock_stairs", ModBlocks.BEDROCK_STAIRS.get(), Blocks.BEDROCK);
        modSlabBlock("bedrock_slab", ModBlocks.BEDROCK_SLAB.get(), Blocks.BEDROCK);
        modFenceBlock("bedrock_fence", ModBlocks.BEDROCK_FENCE.get(), Blocks.BEDROCK);
        modFenceGateBlock("bedrock_fence_gate", ModBlocks.BEDROCK_FENCE_GATE.get(), Blocks.BEDROCK);
        modPressurePlateBlock("bedrock_pressure_plate", ModBlocks.BEDROCK_PRESSURE_PLATE.get(), Blocks.BEDROCK);
        modButtonBlock("bedrock_button", ModBlocks.BEDROCK_BUTTON.get(), Blocks.BEDROCK);
        modWallBlock("bedrock_wall", ModBlocks.BEDROCK_WALL.get(), Blocks.BEDROCK);

        modStairsBlock("coal_ore_stairs", ModBlocks.COAL_ORE_STAIRS.get(), Blocks.COAL_ORE);
        modSlabBlock("coal_ore_slab", ModBlocks.COAL_ORE_SLAB.get(), Blocks.COAL_ORE);
        modFenceBlock("coal_ore_fence", ModBlocks.COAL_ORE_FENCE.get(), Blocks.COAL_ORE);
        modFenceGateBlock("coal_ore_fence_gate", ModBlocks.COAL_ORE_FENCE_GATE.get(), Blocks.COAL_ORE);
        modPressurePlateBlock("coal_ore_pressure_plate", ModBlocks.COAL_ORE_PRESSURE_PLATE.get(), Blocks.COAL_ORE);
        modButtonBlock("coal_ore_button", ModBlocks.COAL_ORE_BUTTON.get(), Blocks.COAL_ORE);
        modWallBlock("coal_ore_wall", ModBlocks.COAL_ORE_WALL.get(), Blocks.COAL_ORE);

        modStairsBlock("lapis_ore_stairs", ModBlocks.LAPIS_ORE_STAIRS.get(), Blocks.LAPIS_ORE);
        modSlabBlock("lapis_ore_slab", ModBlocks.LAPIS_ORE_SLAB.get(), Blocks.LAPIS_ORE);
        modFenceBlock("lapis_ore_fence", ModBlocks.LAPIS_ORE_FENCE.get(), Blocks.LAPIS_ORE);
        modFenceGateBlock("lapis_ore_fence_gate", ModBlocks.LAPIS_ORE_FENCE_GATE.get(), Blocks.LAPIS_ORE);
        modPressurePlateBlock("lapis_ore_pressure_plate", ModBlocks.LAPIS_ORE_PRESSURE_PLATE.get(), Blocks.LAPIS_ORE);
        modButtonBlock("lapis_ore_button", ModBlocks.LAPIS_ORE_BUTTON.get(), Blocks.LAPIS_ORE);
        modWallBlock("lapis_ore_wall", ModBlocks.LAPIS_ORE_WALL.get(), Blocks.LAPIS_ORE);

        modStairsBlock("iron_ore_stairs", ModBlocks.IRON_ORE_STAIRS.get(), Blocks.IRON_ORE);
        modSlabBlock("iron_ore_slab", ModBlocks.IRON_ORE_SLAB.get(), Blocks.IRON_ORE);
        modFenceBlock("iron_ore_fence", ModBlocks.IRON_ORE_FENCE.get(), Blocks.IRON_ORE);
        modFenceGateBlock("iron_ore_fence_gate", ModBlocks.IRON_ORE_FENCE_GATE.get(), Blocks.IRON_ORE);
        modPressurePlateBlock("iron_ore_pressure_plate", ModBlocks.IRON_ORE_PRESSURE_PLATE.get(), Blocks.IRON_ORE);
        modButtonBlock("iron_ore_button", ModBlocks.IRON_ORE_BUTTON.get(), Blocks.IRON_ORE);
        modWallBlock("iron_ore_wall", ModBlocks.IRON_ORE_WALL.get(), Blocks.IRON_ORE);

        modStairsBlock("copper_ore_stairs", ModBlocks.COPPER_ORE_STAIRS.get(), Blocks.COPPER_ORE);
        modSlabBlock("copper_ore_slab", ModBlocks.COPPER_ORE_SLAB.get(), Blocks.COPPER_ORE);
        modFenceBlock("copper_ore_fence", ModBlocks.COPPER_ORE_FENCE.get(), Blocks.COPPER_ORE);
        modFenceGateBlock("copper_ore_fence_gate", ModBlocks.COPPER_ORE_FENCE_GATE.get(), Blocks.COPPER_ORE);
        modPressurePlateBlock("copper_ore_pressure_plate", ModBlocks.COPPER_ORE_PRESSURE_PLATE.get(), Blocks.COPPER_ORE);
        modButtonBlock("copper_ore_button", ModBlocks.COPPER_ORE_BUTTON.get(), Blocks.COPPER_ORE);
        modWallBlock("copper_ore_wall", ModBlocks.COPPER_ORE_WALL.get(), Blocks.COPPER_ORE);

        modStairsBlock("gold_ore_stairs", ModBlocks.GOLD_ORE_STAIRS.get(), Blocks.GOLD_ORE);
        modSlabBlock("gold_ore_slab", ModBlocks.GOLD_ORE_SLAB.get(), Blocks.GOLD_ORE);
        modFenceBlock("gold_ore_fence", ModBlocks.GOLD_ORE_FENCE.get(), Blocks.GOLD_ORE);
        modFenceGateBlock("gold_ore_fence_gate", ModBlocks.GOLD_ORE_FENCE_GATE.get(), Blocks.GOLD_ORE);
        modPressurePlateBlock("gold_ore_pressure_plate", ModBlocks.GOLD_ORE_PRESSURE_PLATE.get(), Blocks.GOLD_ORE);
        modButtonBlock("gold_ore_button", ModBlocks.GOLD_ORE_BUTTON.get(), Blocks.GOLD_ORE);
        modWallBlock("gold_ore_wall", ModBlocks.GOLD_ORE_WALL.get(), Blocks.GOLD_ORE);

        modStairsBlock("diamond_ore_stairs", ModBlocks.DIAMOND_ORE_STAIRS.get(), Blocks.DIAMOND_ORE);
        modSlabBlock("diamond_ore_slab", ModBlocks.DIAMOND_ORE_SLAB.get(), Blocks.DIAMOND_ORE);
        modFenceBlock("diamond_ore_fence", ModBlocks.DIAMOND_ORE_FENCE.get(), Blocks.DIAMOND_ORE);
        modFenceGateBlock("diamond_ore_fence_gate", ModBlocks.DIAMOND_ORE_FENCE_GATE.get(), Blocks.DIAMOND_ORE);
        modPressurePlateBlock("diamond_ore_pressure_plate", ModBlocks.DIAMOND_ORE_PRESSURE_PLATE.get(), Blocks.DIAMOND_ORE);
        modButtonBlock("diamond_ore_button", ModBlocks.DIAMOND_ORE_BUTTON.get(), Blocks.DIAMOND_ORE);
        modWallBlock("diamond_ore_wall", ModBlocks.DIAMOND_ORE_WALL.get(), Blocks.DIAMOND_ORE);

        modStairsBlock("emerald_ore_stairs", ModBlocks.EMERALD_ORE_STAIRS.get(), Blocks.EMERALD_ORE);
        modSlabBlock("emerald_ore_slab", ModBlocks.EMERALD_ORE_SLAB.get(), Blocks.EMERALD_ORE);
        modFenceBlock("emerald_ore_fence", ModBlocks.EMERALD_ORE_FENCE.get(), Blocks.EMERALD_ORE);
        modFenceGateBlock("emerald_ore_fence_gate", ModBlocks.EMERALD_ORE_FENCE_GATE.get(), Blocks.EMERALD_ORE);
        modPressurePlateBlock("emerald_ore_pressure_plate", ModBlocks.EMERALD_ORE_PRESSURE_PLATE.get(), Blocks.EMERALD_ORE);
        modButtonBlock("emerald_ore_button", ModBlocks.EMERALD_ORE_BUTTON.get(), Blocks.EMERALD_ORE);
        modWallBlock("emerald_ore_wall", ModBlocks.EMERALD_ORE_WALL.get(), Blocks.EMERALD_ORE);

        modStairsBlock("deepslate_coal_ore_stairs", ModBlocks.DEEPSLATE_COAL_ORE_STAIRS.get(), Blocks.DEEPSLATE_COAL_ORE);
        modSlabBlock("deepslate_coal_ore_slab", ModBlocks.DEEPSLATE_COAL_ORE_SLAB.get(), Blocks.DEEPSLATE_COAL_ORE);
        modFenceBlock("deepslate_coal_ore_fence", ModBlocks.DEEPSLATE_COAL_ORE_FENCE.get(), Blocks.DEEPSLATE_COAL_ORE);
        modFenceGateBlock("deepslate_coal_ore_fence_gate", ModBlocks.DEEPSLATE_COAL_ORE_FENCE_GATE.get(), Blocks.DEEPSLATE_COAL_ORE);
        modPressurePlateBlock("deepslate_coal_ore_pressure_plate", ModBlocks.DEEPSLATE_COAL_ORE_PRESSURE_PLATE.get(), Blocks.DEEPSLATE_COAL_ORE);
        modButtonBlock("deepslate_coal_ore_button", ModBlocks.DEEPSLATE_COAL_ORE_BUTTON.get(), Blocks.DEEPSLATE_COAL_ORE);
        modWallBlock("deepslate_coal_ore_wall", ModBlocks.DEEPSLATE_COAL_ORE_WALL.get(), Blocks.DEEPSLATE_COAL_ORE);

        modStairsBlock("deepslate_lapis_ore_stairs", ModBlocks.DEEPSLATE_LAPIS_ORE_STAIRS.get(), Blocks.DEEPSLATE_LAPIS_ORE);
        modSlabBlock("deepslate_lapis_ore_slab", ModBlocks.DEEPSLATE_LAPIS_ORE_SLAB.get(), Blocks.DEEPSLATE_LAPIS_ORE);
        modFenceBlock("deepslate_lapis_ore_fence", ModBlocks.DEEPSLATE_LAPIS_ORE_FENCE.get(), Blocks.DEEPSLATE_LAPIS_ORE);
        modFenceGateBlock("deepslate_lapis_ore_fence_gate", ModBlocks.DEEPSLATE_LAPIS_ORE_FENCE_GATE.get(), Blocks.DEEPSLATE_LAPIS_ORE);
        modPressurePlateBlock("deepslate_lapis_ore_pressure_plate", ModBlocks.DEEPSLATE_LAPIS_ORE_PRESSURE_PLATE.get(), Blocks.DEEPSLATE_LAPIS_ORE);
        modButtonBlock("deepslate_lapis_ore_button", ModBlocks.DEEPSLATE_LAPIS_ORE_BUTTON.get(), Blocks.DEEPSLATE_LAPIS_ORE);
        modWallBlock("deepslate_lapis_ore_wall", ModBlocks.DEEPSLATE_LAPIS_ORE_WALL.get(), Blocks.DEEPSLATE_LAPIS_ORE);

        modStairsBlock("deepslate_iron_ore_stairs", ModBlocks.DEEPSLATE_IRON_ORE_STAIRS.get(), Blocks.DEEPSLATE_IRON_ORE);
        modSlabBlock("deepslate_iron_ore_slab", ModBlocks.DEEPSLATE_IRON_ORE_SLAB.get(), Blocks.DEEPSLATE_IRON_ORE);
        modFenceBlock("deepslate_iron_ore_fence", ModBlocks.DEEPSLATE_IRON_ORE_FENCE.get(), Blocks.DEEPSLATE_IRON_ORE);
        modFenceGateBlock("deepslate_iron_ore_fence_gate", ModBlocks.DEEPSLATE_IRON_ORE_FENCE_GATE.get(), Blocks.DEEPSLATE_IRON_ORE);
        modPressurePlateBlock("deepslate_iron_ore_pressure_plate", ModBlocks.DEEPSLATE_IRON_ORE_PRESSURE_PLATE.get(), Blocks.DEEPSLATE_IRON_ORE);
        modButtonBlock("deepslate_iron_ore_button", ModBlocks.DEEPSLATE_IRON_ORE_BUTTON.get(), Blocks.DEEPSLATE_IRON_ORE);
        modWallBlock("deepslate_iron_ore_wall", ModBlocks.DEEPSLATE_IRON_ORE_WALL.get(), Blocks.DEEPSLATE_IRON_ORE);

        modStairsBlock("deepslate_copper_ore_stairs", ModBlocks.DEEPSLATE_COPPER_ORE_STAIRS.get(), Blocks.DEEPSLATE_COPPER_ORE);
        modSlabBlock("deepslate_copper_ore_slab", ModBlocks.DEEPSLATE_COPPER_ORE_SLAB.get(), Blocks.DEEPSLATE_COPPER_ORE);
        modFenceBlock("deepslate_copper_ore_fence", ModBlocks.DEEPSLATE_COPPER_ORE_FENCE.get(), Blocks.DEEPSLATE_COPPER_ORE);
        modFenceGateBlock("deepslate_copper_ore_fence_gate", ModBlocks.DEEPSLATE_COPPER_ORE_FENCE_GATE.get(), Blocks.DEEPSLATE_COPPER_ORE);
        modPressurePlateBlock("deepslate_copper_ore_pressure_plate", ModBlocks.DEEPSLATE_COPPER_ORE_PRESSURE_PLATE.get(), Blocks.DEEPSLATE_COPPER_ORE);
        modButtonBlock("deepslate_copper_ore_button", ModBlocks.DEEPSLATE_COPPER_ORE_BUTTON.get(), Blocks.DEEPSLATE_COPPER_ORE);
        modWallBlock("deepslate_copper_ore_wall", ModBlocks.DEEPSLATE_COPPER_ORE_WALL.get(), Blocks.DEEPSLATE_COPPER_ORE);

        modStairsBlock("deepslate_gold_ore_stairs", ModBlocks.DEEPSLATE_GOLD_ORE_STAIRS.get(), Blocks.DEEPSLATE_GOLD_ORE);
        modSlabBlock("deepslate_gold_ore_slab", ModBlocks.DEEPSLATE_GOLD_ORE_SLAB.get(), Blocks.DEEPSLATE_GOLD_ORE);
        modFenceBlock("deepslate_gold_ore_fence", ModBlocks.DEEPSLATE_GOLD_ORE_FENCE.get(), Blocks.DEEPSLATE_GOLD_ORE);
        modFenceGateBlock("deepslate_gold_ore_fence_gate", ModBlocks.DEEPSLATE_GOLD_ORE_FENCE_GATE.get(), Blocks.DEEPSLATE_GOLD_ORE);
        modPressurePlateBlock("deepslate_gold_ore_pressure_plate", ModBlocks.DEEPSLATE_GOLD_ORE_PRESSURE_PLATE.get(), Blocks.DEEPSLATE_GOLD_ORE);
        modButtonBlock("deepslate_gold_ore_button", ModBlocks.DEEPSLATE_GOLD_ORE_BUTTON.get(), Blocks.DEEPSLATE_GOLD_ORE);
        modWallBlock("deepslate_gold_ore_wall", ModBlocks.DEEPSLATE_GOLD_ORE_WALL.get(), Blocks.DEEPSLATE_GOLD_ORE);

        modStairsBlock("deepslate_diamond_ore_stairs", ModBlocks.DEEPSLATE_DIAMOND_ORE_STAIRS.get(), Blocks.DEEPSLATE_DIAMOND_ORE);
        modSlabBlock("deepslate_diamond_ore_slab", ModBlocks.DEEPSLATE_DIAMOND_ORE_SLAB.get(), Blocks.DEEPSLATE_DIAMOND_ORE);
        modFenceBlock("deepslate_diamond_ore_fence", ModBlocks.DEEPSLATE_DIAMOND_ORE_FENCE.get(), Blocks.DEEPSLATE_DIAMOND_ORE);
        modFenceGateBlock("deepslate_diamond_ore_fence_gate", ModBlocks.DEEPSLATE_DIAMOND_ORE_FENCE_GATE.get(), Blocks.DEEPSLATE_DIAMOND_ORE);
        modPressurePlateBlock("deepslate_diamond_ore_pressure_plate", ModBlocks.DEEPSLATE_DIAMOND_ORE_PRESSURE_PLATE.get(), Blocks.DEEPSLATE_DIAMOND_ORE);
        modButtonBlock("deepslate_diamond_ore_button", ModBlocks.DEEPSLATE_DIAMOND_ORE_BUTTON.get(), Blocks.DEEPSLATE_DIAMOND_ORE);
        modWallBlock("deepslate_diamond_ore_wall", ModBlocks.DEEPSLATE_DIAMOND_ORE_WALL.get(), Blocks.DEEPSLATE_DIAMOND_ORE);

        modStairsBlock("deepslate_emerald_ore_stairs", ModBlocks.DEEPSLATE_EMERALD_ORE_STAIRS.get(), Blocks.DEEPSLATE_EMERALD_ORE);
        modSlabBlock("deepslate_emerald_ore_slab", ModBlocks.DEEPSLATE_EMERALD_ORE_SLAB.get(), Blocks.DEEPSLATE_EMERALD_ORE);
        modFenceBlock("deepslate_emerald_ore_fence", ModBlocks.DEEPSLATE_EMERALD_ORE_FENCE.get(), Blocks.DEEPSLATE_EMERALD_ORE);
        modFenceGateBlock("deepslate_emerald_ore_fence_gate", ModBlocks.DEEPSLATE_EMERALD_ORE_FENCE_GATE.get(), Blocks.DEEPSLATE_EMERALD_ORE);
        modPressurePlateBlock("deepslate_emerald_ore_pressure_plate", ModBlocks.DEEPSLATE_EMERALD_ORE_PRESSURE_PLATE.get(), Blocks.DEEPSLATE_EMERALD_ORE);
        modButtonBlock("deepslate_emerald_ore_button", ModBlocks.DEEPSLATE_EMERALD_ORE_BUTTON.get(), Blocks.DEEPSLATE_EMERALD_ORE);
        modWallBlock("deepslate_emerald_ore_wall", ModBlocks.DEEPSLATE_EMERALD_ORE_WALL.get(), Blocks.DEEPSLATE_EMERALD_ORE);

        modStairsBlock("coal_block_stairs", ModBlocks.COAL_BLOCK_STAIRS.get(), Blocks.COAL_BLOCK);
        modSlabBlock("coal_block_slab", ModBlocks.COAL_BLOCK_SLAB.get(), Blocks.COAL_BLOCK);
        modFenceBlock("coal_block_fence", ModBlocks.COAL_BLOCK_FENCE.get(), Blocks.COAL_BLOCK);
        modFenceGateBlock("coal_block_fence_gate", ModBlocks.COAL_BLOCK_FENCE_GATE.get(), Blocks.COAL_BLOCK);
        modPressurePlateBlock("coal_block_pressure_plate", ModBlocks.COAL_BLOCK_PRESSURE_PLATE.get(), Blocks.COAL_BLOCK);
        modButtonBlock("coal_block_button", ModBlocks.COAL_BLOCK_BUTTON.get(), Blocks.COAL_BLOCK);
        modWallBlock("coal_block_wall", ModBlocks.COAL_BLOCK_WALL.get(), Blocks.COAL_BLOCK);

        modStairsBlock("lapis_block_stairs", ModBlocks.LAPIS_BLOCK_STAIRS.get(), Blocks.LAPIS_BLOCK);
        modSlabBlock("lapis_block_slab", ModBlocks.LAPIS_BLOCK_SLAB.get(), Blocks.LAPIS_BLOCK);
        modFenceBlock("lapis_block_fence", ModBlocks.LAPIS_BLOCK_FENCE.get(), Blocks.LAPIS_BLOCK);
        modFenceGateBlock("lapis_block_fence_gate", ModBlocks.LAPIS_BLOCK_FENCE_GATE.get(), Blocks.LAPIS_BLOCK);
        modPressurePlateBlock("lapis_block_pressure_plate", ModBlocks.LAPIS_BLOCK_PRESSURE_PLATE.get(), Blocks.LAPIS_BLOCK);
        modButtonBlock("lapis_block_button", ModBlocks.LAPIS_BLOCK_BUTTON.get(), Blocks.LAPIS_BLOCK);
        modWallBlock("lapis_block_wall", ModBlocks.LAPIS_BLOCK_WALL.get(), Blocks.LAPIS_BLOCK);

        modStairsBlock("raw_iron_block_stairs", ModBlocks.RAW_IRON_BLOCK_STAIRS.get(), Blocks.RAW_IRON_BLOCK);
        modSlabBlock("raw_iron_block_slab", ModBlocks.RAW_IRON_BLOCK_SLAB.get(), Blocks.RAW_IRON_BLOCK);
        modFenceBlock("raw_iron_block_fence", ModBlocks.RAW_IRON_BLOCK_FENCE.get(), Blocks.RAW_IRON_BLOCK);
        modFenceGateBlock("raw_iron_block_fence_gate", ModBlocks.RAW_IRON_BLOCK_FENCE_GATE.get(), Blocks.RAW_IRON_BLOCK);
        modPressurePlateBlock("raw_iron_block_pressure_plate", ModBlocks.RAW_IRON_BLOCK_PRESSURE_PLATE.get(), Blocks.RAW_IRON_BLOCK);
        modButtonBlock("raw_iron_block_button", ModBlocks.RAW_IRON_BLOCK_BUTTON.get(), Blocks.RAW_IRON_BLOCK);
        modWallBlock("raw_iron_block_wall", ModBlocks.RAW_IRON_BLOCK_WALL.get(), Blocks.RAW_IRON_BLOCK);

        modStairsBlock("raw_copper_block_stairs", ModBlocks.RAW_COPPER_BLOCK_STAIRS.get(), Blocks.RAW_COPPER_BLOCK);
        modSlabBlock("raw_copper_block_slab", ModBlocks.RAW_COPPER_BLOCK_SLAB.get(), Blocks.RAW_COPPER_BLOCK);
        modFenceBlock("raw_copper_block_fence", ModBlocks.RAW_COPPER_BLOCK_FENCE.get(), Blocks.RAW_COPPER_BLOCK);
        modFenceGateBlock("raw_copper_block_fence_gate", ModBlocks.RAW_COPPER_BLOCK_FENCE_GATE.get(), Blocks.RAW_COPPER_BLOCK);
        modPressurePlateBlock("raw_copper_block_pressure_plate", ModBlocks.RAW_COPPER_BLOCK_PRESSURE_PLATE.get(), Blocks.RAW_COPPER_BLOCK);
        modButtonBlock("raw_copper_block_button", ModBlocks.RAW_COPPER_BLOCK_BUTTON.get(), Blocks.RAW_COPPER_BLOCK);
        modWallBlock("raw_copper_block_wall", ModBlocks.RAW_COPPER_BLOCK_WALL.get(), Blocks.RAW_COPPER_BLOCK);

        modStairsBlock("raw_gold_block_stairs", ModBlocks.RAW_GOLD_BLOCK_STAIRS.get(), Blocks.RAW_GOLD_BLOCK);
        modSlabBlock("raw_gold_block_slab", ModBlocks.RAW_GOLD_BLOCK_SLAB.get(), Blocks.RAW_GOLD_BLOCK);
        modFenceBlock("raw_gold_block_fence", ModBlocks.RAW_GOLD_BLOCK_FENCE.get(), Blocks.RAW_GOLD_BLOCK);
        modFenceGateBlock("raw_gold_block_fence_gate", ModBlocks.RAW_GOLD_BLOCK_FENCE_GATE.get(), Blocks.RAW_GOLD_BLOCK);
        modPressurePlateBlock("raw_gold_block_pressure_plate", ModBlocks.RAW_GOLD_BLOCK_PRESSURE_PLATE.get(), Blocks.RAW_GOLD_BLOCK);
        modButtonBlock("raw_gold_block_button", ModBlocks.RAW_GOLD_BLOCK_BUTTON.get(), Blocks.RAW_GOLD_BLOCK);
        modWallBlock("raw_gold_block_wall", ModBlocks.RAW_GOLD_BLOCK_WALL.get(), Blocks.RAW_GOLD_BLOCK);

        modStairsBlock("amethyst_block_stairs", ModBlocks.AMETHYST_BLOCK_STAIRS.get(), Blocks.AMETHYST_BLOCK);
        modSlabBlock("amethyst_block_slab", ModBlocks.AMETHYST_BLOCK_SLAB.get(), Blocks.AMETHYST_BLOCK);
        modFenceBlock("amethyst_block_fence", ModBlocks.AMETHYST_BLOCK_FENCE.get(), Blocks.AMETHYST_BLOCK);
        modFenceGateBlock("amethyst_block_fence_gate", ModBlocks.AMETHYST_BLOCK_FENCE_GATE.get(), Blocks.AMETHYST_BLOCK);
        modPressurePlateBlock("amethyst_block_pressure_plate", ModBlocks.AMETHYST_BLOCK_PRESSURE_PLATE.get(), Blocks.AMETHYST_BLOCK);
        modButtonBlock("amethyst_block_button", ModBlocks.AMETHYST_BLOCK_BUTTON.get(), Blocks.AMETHYST_BLOCK);
        modWallBlock("amethyst_block_wall", ModBlocks.AMETHYST_BLOCK_WALL.get(), Blocks.AMETHYST_BLOCK);

        modStairsBlock("iron_block_stairs", ModBlocks.IRON_BLOCK_STAIRS.get(), Blocks.IRON_BLOCK);
        modSlabBlock("iron_block_slab", ModBlocks.IRON_BLOCK_SLAB.get(), Blocks.IRON_BLOCK);
        modFenceBlock("iron_block_fence", ModBlocks.IRON_BLOCK_FENCE.get(), Blocks.IRON_BLOCK);
        modFenceGateBlock("iron_block_fence_gate", ModBlocks.IRON_BLOCK_FENCE_GATE.get(), Blocks.IRON_BLOCK);
        modPressurePlateBlock("iron_block_pressure_plate", ModBlocks.IRON_BLOCK_PRESSURE_PLATE.get(), Blocks.IRON_BLOCK);
        modButtonBlock("iron_block_button", ModBlocks.IRON_BLOCK_BUTTON.get(), Blocks.IRON_BLOCK);
        modWallBlock("iron_block_wall", ModBlocks.IRON_BLOCK_WALL.get(), Blocks.IRON_BLOCK);

        modStairsBlock("copper_block_stairs", ModBlocks.COPPER_BLOCK_STAIRS.get(), Blocks.COPPER_BLOCK);
        modSlabBlock("copper_block_slab", ModBlocks.COPPER_BLOCK_SLAB.get(), Blocks.COPPER_BLOCK);
        modFenceBlock("copper_block_fence", ModBlocks.COPPER_BLOCK_FENCE.get(), Blocks.COPPER_BLOCK);
        modFenceGateBlock("copper_block_fence_gate", ModBlocks.COPPER_BLOCK_FENCE_GATE.get(), Blocks.COPPER_BLOCK);
        modPressurePlateBlock("copper_block_pressure_plate", ModBlocks.COPPER_BLOCK_PRESSURE_PLATE.get(), Blocks.COPPER_BLOCK);
        modButtonBlock("copper_block_button", ModBlocks.COPPER_BLOCK_BUTTON.get(), Blocks.COPPER_BLOCK);
        modWallBlock("copper_block_wall", ModBlocks.COPPER_BLOCK_WALL.get(), Blocks.COPPER_BLOCK);

        modStairsBlock("gold_block_stairs", ModBlocks.GOLD_BLOCK_STAIRS.get(), Blocks.GOLD_BLOCK);
        modSlabBlock("gold_block_slab", ModBlocks.GOLD_BLOCK_SLAB.get(), Blocks.GOLD_BLOCK);
        modFenceBlock("gold_block_fence", ModBlocks.GOLD_BLOCK_FENCE.get(), Blocks.GOLD_BLOCK);
        modFenceGateBlock("gold_block_fence_gate", ModBlocks.GOLD_BLOCK_FENCE_GATE.get(), Blocks.GOLD_BLOCK);
        modPressurePlateBlock("gold_block_pressure_plate", ModBlocks.GOLD_BLOCK_PRESSURE_PLATE.get(), Blocks.GOLD_BLOCK);
        modButtonBlock("gold_block_button", ModBlocks.GOLD_BLOCK_BUTTON.get(), Blocks.GOLD_BLOCK);
        modWallBlock("gold_block_wall", ModBlocks.GOLD_BLOCK_WALL.get(), Blocks.GOLD_BLOCK);

        modStairsBlock("diamond_block_stairs", ModBlocks.DIAMOND_BLOCK_STAIRS.get(), Blocks.DIAMOND_BLOCK);
        modSlabBlock("diamond_block_slab", ModBlocks.DIAMOND_BLOCK_SLAB.get(), Blocks.DIAMOND_BLOCK);
        modFenceBlock("diamond_block_fence", ModBlocks.DIAMOND_BLOCK_FENCE.get(), Blocks.DIAMOND_BLOCK);
        modFenceGateBlock("diamond_block_fence_gate", ModBlocks.DIAMOND_BLOCK_FENCE_GATE.get(), Blocks.DIAMOND_BLOCK);
        modPressurePlateBlock("diamond_block_pressure_plate", ModBlocks.DIAMOND_BLOCK_PRESSURE_PLATE.get(), Blocks.DIAMOND_BLOCK);
        modButtonBlock("diamond_block_button", ModBlocks.DIAMOND_BLOCK_BUTTON.get(), Blocks.DIAMOND_BLOCK);
        modWallBlock("diamond_block_wall", ModBlocks.DIAMOND_BLOCK_WALL.get(), Blocks.DIAMOND_BLOCK);

        modStairsBlock("netherite_block_stairs", ModBlocks.NETHERITE_BLOCK_STAIRS.get(), Blocks.NETHERITE_BLOCK);
        modSlabBlock("netherite_block_slab", ModBlocks.NETHERITE_BLOCK_SLAB.get(), Blocks.NETHERITE_BLOCK);
        modFenceBlock("netherite_block_fence", ModBlocks.NETHERITE_BLOCK_FENCE.get(), Blocks.NETHERITE_BLOCK);
        modFenceGateBlock("netherite_block_fence_gate", ModBlocks.NETHERITE_BLOCK_FENCE_GATE.get(), Blocks.NETHERITE_BLOCK);
        modPressurePlateBlock("netherite_block_pressure_plate", ModBlocks.NETHERITE_BLOCK_PRESSURE_PLATE.get(), Blocks.NETHERITE_BLOCK);
        modButtonBlock("netherite_block_button", ModBlocks.NETHERITE_BLOCK_BUTTON.get(), Blocks.NETHERITE_BLOCK);
        modWallBlock("netherite_block_wall", ModBlocks.NETHERITE_BLOCK_WALL.get(), Blocks.NETHERITE_BLOCK);

        modStairsBlock("moss_block_stairs", ModBlocks.MOSS_BLOCK_STAIRS.get(), Blocks.MOSS_BLOCK);
        modSlabBlock("moss_block_slab", ModBlocks.MOSS_BLOCK_SLAB.get(), Blocks.MOSS_BLOCK);
        modFenceBlock("moss_block_fence", ModBlocks.MOSS_BLOCK_FENCE.get(), Blocks.MOSS_BLOCK);
        modFenceGateBlock("moss_block_fence_gate", ModBlocks.MOSS_BLOCK_FENCE_GATE.get(), Blocks.MOSS_BLOCK);
        modPressurePlateBlock("moss_block_pressure_plate", ModBlocks.MOSS_BLOCK_PRESSURE_PLATE.get(), Blocks.MOSS_BLOCK);
        modButtonBlock("moss_block_button", ModBlocks.MOSS_BLOCK_BUTTON.get(), Blocks.MOSS_BLOCK);
        modWallBlock("moss_block_wall", ModBlocks.MOSS_BLOCK_WALL.get(), Blocks.MOSS_BLOCK);

        modStairsBlock("dripstone_block_stairs", ModBlocks.DRIPSTONE_BLOCK_STAIRS.get(), Blocks.DRIPSTONE_BLOCK);
        modSlabBlock("dripstone_block_slab", ModBlocks.DRIPSTONE_BLOCK_SLAB.get(), Blocks.DRIPSTONE_BLOCK);
        modFenceBlock("dripstone_block_fence", ModBlocks.DRIPSTONE_BLOCK_FENCE.get(), Blocks.DRIPSTONE_BLOCK);
        modFenceGateBlock("dripstone_block_fence_gate", ModBlocks.DRIPSTONE_BLOCK_FENCE_GATE.get(), Blocks.DRIPSTONE_BLOCK);
        modPressurePlateBlock("dripstone_block_pressure_plate", ModBlocks.DRIPSTONE_BLOCK_PRESSURE_PLATE.get(), Blocks.DRIPSTONE_BLOCK);
        modButtonBlock("dripstone_block_button", ModBlocks.DRIPSTONE_BLOCK_BUTTON.get(), Blocks.DRIPSTONE_BLOCK);
        modWallBlock("dripstone_block_wall", ModBlocks.DRIPSTONE_BLOCK_WALL.get(), Blocks.DRIPSTONE_BLOCK);

        modStairsBlock("purpur_block_stairs", ModBlocks.PURPUR_BLOCK_STAIRS.get(), Blocks.PURPUR_BLOCK);
        modSlabBlock("purpur_block_slab", ModBlocks.PURPUR_BLOCK_SLAB.get(), Blocks.PURPUR_BLOCK);
        modFenceBlock("purpur_block_fence", ModBlocks.PURPUR_BLOCK_FENCE.get(), Blocks.PURPUR_BLOCK);
        modFenceGateBlock("purpur_block_fence_gate", ModBlocks.PURPUR_BLOCK_FENCE_GATE.get(), Blocks.PURPUR_BLOCK);
        modPressurePlateBlock("purpur_block_pressure_plate", ModBlocks.PURPUR_BLOCK_PRESSURE_PLATE.get(), Blocks.PURPUR_BLOCK);
        modButtonBlock("purpur_block_button", ModBlocks.PURPUR_BLOCK_BUTTON.get(), Blocks.PURPUR_BLOCK);
        modWallBlock("purpur_block_wall", ModBlocks.PURPUR_BLOCK_WALL.get(), Blocks.PURPUR_BLOCK);

        modStairsBlock("brown_mushroom_block_stairs", ModBlocks.BROWN_MUSHROOM_BLOCK_STAIRS.get(), Blocks.BROWN_MUSHROOM_BLOCK);
        modSlabBlock("brown_mushroom_block_slab", ModBlocks.BROWN_MUSHROOM_BLOCK_SLAB.get(), Blocks.BROWN_MUSHROOM_BLOCK);
        modFenceBlock("brown_mushroom_block_fence", ModBlocks.BROWN_MUSHROOM_BLOCK_FENCE.get(), Blocks.BROWN_MUSHROOM_BLOCK);
        modFenceGateBlock("brown_mushroom_block_fence_gate", ModBlocks.BROWN_MUSHROOM_BLOCK_FENCE_GATE.get(), Blocks.BROWN_MUSHROOM_BLOCK);
        modPressurePlateBlock("brown_mushroom_block_pressure_plate", ModBlocks.BROWN_MUSHROOM_BLOCK_PRESSURE_PLATE.get(), Blocks.BROWN_MUSHROOM_BLOCK);
        modButtonBlock("brown_mushroom_block_button", ModBlocks.BROWN_MUSHROOM_BLOCK_BUTTON.get(), Blocks.BROWN_MUSHROOM_BLOCK);
        modWallBlock("brown_mushroom_block_wall", ModBlocks.BROWN_MUSHROOM_BLOCK_WALL.get(), Blocks.BROWN_MUSHROOM_BLOCK);

        modStairsBlock("red_mushroom_block_stairs", ModBlocks.RED_MUSHROOM_BLOCK_STAIRS.get(), Blocks.RED_MUSHROOM_BLOCK);
        modSlabBlock("red_mushroom_block_slab", ModBlocks.RED_MUSHROOM_BLOCK_SLAB.get(), Blocks.RED_MUSHROOM_BLOCK);
        modFenceBlock("red_mushroom_block_fence", ModBlocks.RED_MUSHROOM_BLOCK_FENCE.get(), Blocks.RED_MUSHROOM_BLOCK);
        modFenceGateBlock("red_mushroom_block_fence_gate", ModBlocks.RED_MUSHROOM_BLOCK_FENCE_GATE.get(), Blocks.RED_MUSHROOM_BLOCK);
        modPressurePlateBlock("red_mushroom_block_pressure_plate", ModBlocks.RED_MUSHROOM_BLOCK_PRESSURE_PLATE.get(), Blocks.RED_MUSHROOM_BLOCK);
        modButtonBlock("red_mushroom_block_button", ModBlocks.RED_MUSHROOM_BLOCK_BUTTON.get(), Blocks.RED_MUSHROOM_BLOCK);
        modWallBlock("red_mushroom_block_wall", ModBlocks.RED_MUSHROOM_BLOCK_WALL.get(), Blocks.RED_MUSHROOM_BLOCK);

        modStairsBlock("emerald_block_stairs", ModBlocks.EMERALD_BLOCK_STAIRS.get(), Blocks.EMERALD_BLOCK);
        modSlabBlock("emerald_block_slab", ModBlocks.EMERALD_BLOCK_SLAB.get(), Blocks.EMERALD_BLOCK);
        modFenceBlock("emerald_block_fence", ModBlocks.EMERALD_BLOCK_FENCE.get(), Blocks.EMERALD_BLOCK);
        modFenceGateBlock("emerald_block_fence_gate", ModBlocks.EMERALD_BLOCK_FENCE_GATE.get(), Blocks.EMERALD_BLOCK);
        modPressurePlateBlock("emerald_block_pressure_plate", ModBlocks.EMERALD_BLOCK_PRESSURE_PLATE.get(), Blocks.EMERALD_BLOCK);
        modButtonBlock("emerald_block_button", ModBlocks.EMERALD_BLOCK_BUTTON.get(), Blocks.EMERALD_BLOCK);
        modWallBlock("emerald_block_wall", ModBlocks.EMERALD_BLOCK_WALL.get(), Blocks.EMERALD_BLOCK);

        modStairsBlock("stone_stairs", ModBlocks.STONE_STAIRS.get(), Blocks.STONE);
        modSlabBlock("stone_slab", ModBlocks.STONE_SLAB.get(), Blocks.STONE);
        modFenceBlock("stone_fence", ModBlocks.STONE_FENCE.get(), Blocks.STONE);
        modFenceGateBlock("stone_fence_gate", ModBlocks.STONE_FENCE_GATE.get(), Blocks.STONE);
        modPressurePlateBlock("stone_pressure_plate", ModBlocks.STONE_PRESSURE_PLATE.get(), Blocks.STONE);
        modButtonBlock("stone_button", ModBlocks.STONE_BUTTON.get(), Blocks.STONE);
        modWallBlock("stone_wall", ModBlocks.STONE_WALL.get(), Blocks.STONE);

        modStairsBlock("granite_stairs", ModBlocks.GRANITE_STAIRS.get(), Blocks.GRANITE);
        modSlabBlock("granite_slab", ModBlocks.GRANITE_SLAB.get(), Blocks.GRANITE);
        modFenceBlock("granite_fence", ModBlocks.GRANITE_FENCE.get(), Blocks.GRANITE);
        modFenceGateBlock("granite_fence_gate", ModBlocks.GRANITE_FENCE_GATE.get(), Blocks.GRANITE);
        modPressurePlateBlock("granite_pressure_plate", ModBlocks.GRANITE_PRESSURE_PLATE.get(), Blocks.GRANITE);
        modButtonBlock("granite_button", ModBlocks.GRANITE_BUTTON.get(), Blocks.GRANITE);
        modWallBlock("granite_wall", ModBlocks.GRANITE_WALL.get(), Blocks.GRANITE);

        modStairsBlock("polished_granite_stairs", ModBlocks.POLISHED_GRANITE_STAIRS.get(), Blocks.POLISHED_GRANITE);
        modSlabBlock("polished_granite_slab", ModBlocks.POLISHED_GRANITE_SLAB.get(), Blocks.POLISHED_GRANITE);
        modFenceBlock("polished_granite_fence", ModBlocks.POLISHED_GRANITE_FENCE.get(), Blocks.POLISHED_GRANITE);
        modFenceGateBlock("polished_granite_fence_gate", ModBlocks.POLISHED_GRANITE_FENCE_GATE.get(), Blocks.POLISHED_GRANITE);
        modPressurePlateBlock("polished_granite_pressure_plate", ModBlocks.POLISHED_GRANITE_PRESSURE_PLATE.get(), Blocks.POLISHED_GRANITE);
        modButtonBlock("polished_granite_button", ModBlocks.POLISHED_GRANITE_BUTTON.get(), Blocks.POLISHED_GRANITE);
        modWallBlock("polished_granite_wall", ModBlocks.POLISHED_GRANITE_WALL.get(), Blocks.POLISHED_GRANITE);

        modStairsBlock("diorite_stairs", ModBlocks.DIORITE_STAIRS.get(), Blocks.DIORITE);
        modSlabBlock("diorite_slab", ModBlocks.DIORITE_SLAB.get(), Blocks.DIORITE);
        modFenceBlock("diorite_fence", ModBlocks.DIORITE_FENCE.get(), Blocks.DIORITE);
        modFenceGateBlock("diorite_fence_gate", ModBlocks.DIORITE_FENCE_GATE.get(), Blocks.DIORITE);
        modPressurePlateBlock("diorite_pressure_plate", ModBlocks.DIORITE_PRESSURE_PLATE.get(), Blocks.DIORITE);
        modButtonBlock("diorite_button", ModBlocks.DIORITE_BUTTON.get(), Blocks.DIORITE);
        modWallBlock("diorite_wall", ModBlocks.DIORITE_WALL.get(), Blocks.DIORITE);

        modStairsBlock("polished_diorite_stairs", ModBlocks.POLISHED_DIORITE_STAIRS.get(), Blocks.POLISHED_DIORITE);
        modSlabBlock("polished_diorite_slab", ModBlocks.POLISHED_DIORITE_SLAB.get(), Blocks.POLISHED_DIORITE);
        modFenceBlock("polished_diorite_fence", ModBlocks.POLISHED_DIORITE_FENCE.get(), Blocks.POLISHED_DIORITE);
        modFenceGateBlock("polished_diorite_fence_gate", ModBlocks.POLISHED_DIORITE_FENCE_GATE.get(), Blocks.POLISHED_DIORITE);
        modPressurePlateBlock("polished_diorite_pressure_plate", ModBlocks.POLISHED_DIORITE_PRESSURE_PLATE.get(), Blocks.POLISHED_DIORITE);
        modButtonBlock("polished_diorite_button", ModBlocks.POLISHED_DIORITE_BUTTON.get(), Blocks.POLISHED_DIORITE);
        modWallBlock("polished_diorite_wall", ModBlocks.POLISHED_DIORITE_WALL.get(), Blocks.POLISHED_DIORITE);

        modStairsBlock("andesite_stairs", ModBlocks.ANDESITE_STAIRS.get(), Blocks.ANDESITE);
        modSlabBlock("andesite_slab", ModBlocks.ANDESITE_SLAB.get(), Blocks.ANDESITE);
        modFenceBlock("andesite_fence", ModBlocks.ANDESITE_FENCE.get(), Blocks.ANDESITE);
        modFenceGateBlock("andesite_fence_gate", ModBlocks.ANDESITE_FENCE_GATE.get(), Blocks.ANDESITE);
        modPressurePlateBlock("andesite_pressure_plate", ModBlocks.ANDESITE_PRESSURE_PLATE.get(), Blocks.ANDESITE);
        modButtonBlock("andesite_button", ModBlocks.ANDESITE_BUTTON.get(), Blocks.ANDESITE);
        modWallBlock("andesite_wall", ModBlocks.ANDESITE_WALL.get(), Blocks.ANDESITE);

        modStairsBlock("polished_andesite_stairs", ModBlocks.POLISHED_ANDESITE_STAIRS.get(), Blocks.POLISHED_ANDESITE);
        modSlabBlock("polished_andesite_slab", ModBlocks.POLISHED_ANDESITE_SLAB.get(), Blocks.POLISHED_ANDESITE);
        modFenceBlock("polished_andesite_fence", ModBlocks.POLISHED_ANDESITE_FENCE.get(), Blocks.POLISHED_ANDESITE);
        modFenceGateBlock("polished_andesite_fence_gate", ModBlocks.POLISHED_ANDESITE_FENCE_GATE.get(), Blocks.POLISHED_ANDESITE);
        modPressurePlateBlock("polished_andesite_pressure_plate", ModBlocks.POLISHED_ANDESITE_PRESSURE_PLATE.get(), Blocks.POLISHED_ANDESITE);
        modButtonBlock("polished_andesite_button", ModBlocks.POLISHED_ANDESITE_BUTTON.get(), Blocks.POLISHED_ANDESITE);
        modWallBlock("polished_andesite_wall", ModBlocks.POLISHED_ANDESITE_WALL.get(), Blocks.POLISHED_ANDESITE);

        modStairsBlock("cobbled_deepslate_stairs", ModBlocks.COBBLED_DEEPSLATE_STAIRS.get(), Blocks.COBBLED_DEEPSLATE);
        modSlabBlock("cobbled_deepslate_slab", ModBlocks.COBBLED_DEEPSLATE_SLAB.get(), Blocks.COBBLED_DEEPSLATE);
        modFenceBlock("cobbled_deepslate_fence", ModBlocks.COBBLED_DEEPSLATE_FENCE.get(), Blocks.COBBLED_DEEPSLATE);
        modFenceGateBlock("cobbled_deepslate_fence_gate", ModBlocks.COBBLED_DEEPSLATE_FENCE_GATE.get(), Blocks.COBBLED_DEEPSLATE);
        modPressurePlateBlock("cobbled_deepslate_pressure_plate", ModBlocks.COBBLED_DEEPSLATE_PRESSURE_PLATE.get(), Blocks.COBBLED_DEEPSLATE);
        modButtonBlock("cobbled_deepslate_button", ModBlocks.COBBLED_DEEPSLATE_BUTTON.get(), Blocks.COBBLED_DEEPSLATE);
        modWallBlock("cobbled_deepslate_wall", ModBlocks.COBBLED_DEEPSLATE_WALL.get(), Blocks.COBBLED_DEEPSLATE);

        modStairsBlock("polished_deepslate_stairs", ModBlocks.POLISHED_DEEPSLATE_STAIRS.get(), Blocks.POLISHED_DEEPSLATE);
        modSlabBlock("polished_deepslate_slab", ModBlocks.POLISHED_DEEPSLATE_SLAB.get(), Blocks.POLISHED_DEEPSLATE);
        modFenceBlock("polished_deepslate_fence", ModBlocks.POLISHED_DEEPSLATE_FENCE.get(), Blocks.POLISHED_DEEPSLATE);
        modFenceGateBlock("polished_deepslate_fence_gate", ModBlocks.POLISHED_DEEPSLATE_FENCE_GATE.get(), Blocks.POLISHED_DEEPSLATE);
        modPressurePlateBlock("polished_deepslate_pressure_plate", ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE.get(), Blocks.POLISHED_DEEPSLATE);
        modButtonBlock("polished_deepslate_button", ModBlocks.POLISHED_DEEPSLATE_BUTTON.get(), Blocks.POLISHED_DEEPSLATE);
        modWallBlock("polished_deepslate_wall", ModBlocks.POLISHED_DEEPSLATE_WALL.get(), Blocks.POLISHED_DEEPSLATE);

        modStairsBlock("calcite_stairs", ModBlocks.CALCITE_STAIRS.get(), Blocks.CALCITE);
        modSlabBlock("calcite_slab", ModBlocks.CALCITE_SLAB.get(), Blocks.CALCITE);
        modFenceBlock("calcite_fence", ModBlocks.CALCITE_FENCE.get(), Blocks.CALCITE);
        modFenceGateBlock("calcite_fence_gate", ModBlocks.CALCITE_FENCE_GATE.get(), Blocks.CALCITE);
        modPressurePlateBlock("calcite_pressure_plate", ModBlocks.CALCITE_PRESSURE_PLATE.get(), Blocks.CALCITE);
        modButtonBlock("calcite_button", ModBlocks.CALCITE_BUTTON.get(), Blocks.CALCITE);
        modWallBlock("calcite_wall", ModBlocks.CALCITE_WALL.get(), Blocks.CALCITE);

        modStairsBlock("tuff_stairs", ModBlocks.TUFF_STAIRS.get(), Blocks.TUFF);
        modSlabBlock("tuff_slab", ModBlocks.TUFF_SLAB.get(), Blocks.TUFF);
        modFenceBlock("tuff_fence", ModBlocks.TUFF_FENCE.get(), Blocks.TUFF);
        modFenceGateBlock("tuff_fence_gate", ModBlocks.TUFF_FENCE_GATE.get(), Blocks.TUFF);
        modPressurePlateBlock("tuff_pressure_plate", ModBlocks.TUFF_PRESSURE_PLATE.get(), Blocks.TUFF);
        modButtonBlock("tuff_button", ModBlocks.TUFF_BUTTON.get(), Blocks.TUFF);
        modWallBlock("tuff_wall", ModBlocks.TUFF_WALL.get(), Blocks.TUFF);

        modStairsBlock("dirt_stairs", ModBlocks.DIRT_STAIRS.get(), Blocks.DIRT);
        modSlabBlock("dirt_slab", ModBlocks.DIRT_SLAB.get(), Blocks.DIRT);
        modFenceBlock("dirt_fence", ModBlocks.DIRT_FENCE.get(), Blocks.DIRT);
        modFenceGateBlock("dirt_fence_gate", ModBlocks.DIRT_FENCE_GATE.get(), Blocks.DIRT);
        modPressurePlateBlock("dirt_pressure_plate", ModBlocks.DIRT_PRESSURE_PLATE.get(), Blocks.DIRT);
        modButtonBlock("dirt_button", ModBlocks.DIRT_BUTTON.get(), Blocks.DIRT);
        modWallBlock("dirt_wall", ModBlocks.DIRT_WALL.get(), Blocks.DIRT);

        modStairsBlock("coarse_dirt_stairs", ModBlocks.COARSE_DIRT_STAIRS.get(), Blocks.COARSE_DIRT);
        modSlabBlock("coarse_dirt_slab", ModBlocks.COARSE_DIRT_SLAB.get(), Blocks.COARSE_DIRT);
        modFenceBlock("coarse_dirt_fence", ModBlocks.COARSE_DIRT_FENCE.get(), Blocks.COARSE_DIRT);
        modFenceGateBlock("coarse_dirt_fence_gate", ModBlocks.COARSE_DIRT_FENCE_GATE.get(), Blocks.COARSE_DIRT);
        modPressurePlateBlock("coarse_dirt_pressure_plate", ModBlocks.COARSE_DIRT_PRESSURE_PLATE.get(), Blocks.COARSE_DIRT);
        modButtonBlock("coarse_dirt_button", ModBlocks.COARSE_DIRT_BUTTON.get(), Blocks.COARSE_DIRT);
        modWallBlock("coarse_dirt_wall", ModBlocks.COARSE_DIRT_WALL.get(), Blocks.COARSE_DIRT);

        modStairsBlock("rooted_dirt_stairs", ModBlocks.ROOTED_DIRT_STAIRS.get(), Blocks.ROOTED_DIRT);
        modSlabBlock("rooted_dirt_slab", ModBlocks.ROOTED_DIRT_SLAB.get(), Blocks.ROOTED_DIRT);
        modFenceBlock("rooted_dirt_fence", ModBlocks.ROOTED_DIRT_FENCE.get(), Blocks.ROOTED_DIRT);
        modFenceGateBlock("rooted_dirt_fence_gate", ModBlocks.ROOTED_DIRT_FENCE_GATE.get(), Blocks.ROOTED_DIRT);
        modPressurePlateBlock("rooted_dirt_pressure_plate", ModBlocks.ROOTED_DIRT_PRESSURE_PLATE.get(), Blocks.ROOTED_DIRT);
        modButtonBlock("rooted_dirt_button", ModBlocks.ROOTED_DIRT_BUTTON.get(), Blocks.ROOTED_DIRT);
        modWallBlock("rooted_dirt_wall", ModBlocks.ROOTED_DIRT_WALL.get(), Blocks.ROOTED_DIRT);

        modStairsBlock("mud_stairs", ModBlocks.MUD_STAIRS.get(), Blocks.MUD);
        modSlabBlock("mud_slab", ModBlocks.MUD_SLAB.get(), Blocks.MUD);
        modFenceBlock("mud_fence", ModBlocks.MUD_FENCE.get(), Blocks.MUD);
        modFenceGateBlock("mud_fence_gate", ModBlocks.MUD_FENCE_GATE.get(), Blocks.MUD);
        modPressurePlateBlock("mud_pressure_plate", ModBlocks.MUD_PRESSURE_PLATE.get(), Blocks.MUD);
        modButtonBlock("mud_button", ModBlocks.MUD_BUTTON.get(), Blocks.MUD);
        modWallBlock("mud_wall", ModBlocks.MUD_WALL.get(), Blocks.MUD);

        modStairsBlock("cobblestone_stairs", ModBlocks.COBBLESTONE_STAIRS.get(), Blocks.COBBLESTONE);
        modSlabBlock("cobblestone_slab", ModBlocks.COBBLESTONE_SLAB.get(), Blocks.COBBLESTONE);
        modFenceBlock("cobblestone_fence", ModBlocks.COBBLESTONE_FENCE.get(), Blocks.COBBLESTONE);
        modFenceGateBlock("cobblestone_fence_gate", ModBlocks.COBBLESTONE_FENCE_GATE.get(), Blocks.COBBLESTONE);
        modPressurePlateBlock("cobblestone_pressure_plate", ModBlocks.COBBLESTONE_PRESSURE_PLATE.get(), Blocks.COBBLESTONE);
        modButtonBlock("cobblestone_button", ModBlocks.COBBLESTONE_BUTTON.get(), Blocks.COBBLESTONE);
        modWallBlock("cobblestone_wall", ModBlocks.COBBLESTONE_WALL.get(), Blocks.COBBLESTONE);

        modStairsBlock("oak_planks_stairs", ModBlocks.OAK_PLANKS_STAIRS.get(), Blocks.OAK_PLANKS);
        modSlabBlock("oak_planks_slab", ModBlocks.OAK_PLANKS_SLAB.get(), Blocks.OAK_PLANKS);
        modFenceBlock("oak_planks_fence", ModBlocks.OAK_PLANKS_FENCE.get(), Blocks.OAK_PLANKS);
        modFenceGateBlock("oak_planks_fence_gate", ModBlocks.OAK_PLANKS_FENCE_GATE.get(), Blocks.OAK_PLANKS);
        modPressurePlateBlock("oak_planks_pressure_plate", ModBlocks.OAK_PLANKS_PRESSURE_PLATE.get(), Blocks.OAK_PLANKS);
        modButtonBlock("oak_planks_button", ModBlocks.OAK_PLANKS_BUTTON.get(), Blocks.OAK_PLANKS);
        modWallBlock("oak_planks_wall", ModBlocks.OAK_PLANKS_WALL.get(), Blocks.OAK_PLANKS);

        modStairsBlock("spruce_planks_stairs", ModBlocks.SPRUCE_PLANKS_STAIRS.get(), Blocks.SPRUCE_PLANKS);
        modSlabBlock("spruce_planks_slab", ModBlocks.SPRUCE_PLANKS_SLAB.get(), Blocks.SPRUCE_PLANKS);
        modFenceBlock("spruce_planks_fence", ModBlocks.SPRUCE_PLANKS_FENCE.get(), Blocks.SPRUCE_PLANKS);
        modFenceGateBlock("spruce_planks_fence_gate", ModBlocks.SPRUCE_PLANKS_FENCE_GATE.get(), Blocks.SPRUCE_PLANKS);
        modPressurePlateBlock("spruce_planks_pressure_plate", ModBlocks.SPRUCE_PLANKS_PRESSURE_PLATE.get(), Blocks.SPRUCE_PLANKS);
        modButtonBlock("spruce_planks_button", ModBlocks.SPRUCE_PLANKS_BUTTON.get(), Blocks.SPRUCE_PLANKS);
        modWallBlock("spruce_planks_wall", ModBlocks.SPRUCE_PLANKS_WALL.get(), Blocks.SPRUCE_PLANKS);

        modStairsBlock("birch_planks_stairs", ModBlocks.BIRCH_PLANKS_STAIRS.get(), Blocks.BIRCH_PLANKS);
        modSlabBlock("birch_planks_slab", ModBlocks.BIRCH_PLANKS_SLAB.get(), Blocks.BIRCH_PLANKS);
        modFenceBlock("birch_planks_fence", ModBlocks.BIRCH_PLANKS_FENCE.get(), Blocks.BIRCH_PLANKS);
        modFenceGateBlock("birch_planks_fence_gate", ModBlocks.BIRCH_PLANKS_FENCE_GATE.get(), Blocks.BIRCH_PLANKS);
        modPressurePlateBlock("birch_planks_pressure_plate", ModBlocks.BIRCH_PLANKS_PRESSURE_PLATE.get(), Blocks.BIRCH_PLANKS);
        modButtonBlock("birch_planks_button", ModBlocks.BIRCH_PLANKS_BUTTON.get(), Blocks.BIRCH_PLANKS);
        modWallBlock("birch_planks_wall", ModBlocks.BIRCH_PLANKS_WALL.get(), Blocks.BIRCH_PLANKS);

        modStairsBlock("jungle_planks_stairs", ModBlocks.JUNGLE_PLANKS_STAIRS.get(), Blocks.JUNGLE_PLANKS);
        modSlabBlock("jungle_planks_slab", ModBlocks.JUNGLE_PLANKS_SLAB.get(), Blocks.JUNGLE_PLANKS);
        modFenceBlock("jungle_planks_fence", ModBlocks.JUNGLE_PLANKS_FENCE.get(), Blocks.JUNGLE_PLANKS);
        modFenceGateBlock("jungle_planks_fence_gate", ModBlocks.JUNGLE_PLANKS_FENCE_GATE.get(), Blocks.JUNGLE_PLANKS);
        modPressurePlateBlock("jungle_planks_pressure_plate", ModBlocks.JUNGLE_PLANKS_PRESSURE_PLATE.get(), Blocks.JUNGLE_PLANKS);
        modButtonBlock("jungle_planks_button", ModBlocks.JUNGLE_PLANKS_BUTTON.get(), Blocks.JUNGLE_PLANKS);
        modWallBlock("jungle_planks_wall", ModBlocks.JUNGLE_PLANKS_WALL.get(), Blocks.JUNGLE_PLANKS);

        modStairsBlock("acacia_planks_stairs", ModBlocks.ACACIA_PLANKS_STAIRS.get(), Blocks.ACACIA_PLANKS);
        modSlabBlock("acacia_planks_slab", ModBlocks.ACACIA_PLANKS_SLAB.get(), Blocks.ACACIA_PLANKS);
        modFenceBlock("acacia_planks_fence", ModBlocks.ACACIA_PLANKS_FENCE.get(), Blocks.ACACIA_PLANKS);
        modFenceGateBlock("acacia_planks_fence_gate", ModBlocks.ACACIA_PLANKS_FENCE_GATE.get(), Blocks.ACACIA_PLANKS);
        modPressurePlateBlock("acacia_planks_pressure_plate", ModBlocks.ACACIA_PLANKS_PRESSURE_PLATE.get(), Blocks.ACACIA_PLANKS);
        modButtonBlock("acacia_planks_button", ModBlocks.ACACIA_PLANKS_BUTTON.get(), Blocks.ACACIA_PLANKS);
        modWallBlock("acacia_planks_wall", ModBlocks.ACACIA_PLANKS_WALL.get(), Blocks.ACACIA_PLANKS);

        modStairsBlock("dark_oak_planks_stairs", ModBlocks.DARK_OAK_PLANKS_STAIRS.get(), Blocks.DARK_OAK_PLANKS);
        modSlabBlock("dark_oak_planks_slab", ModBlocks.DARK_OAK_PLANKS_SLAB.get(), Blocks.DARK_OAK_PLANKS);
        modFenceBlock("dark_oak_planks_fence", ModBlocks.DARK_OAK_PLANKS_FENCE.get(), Blocks.DARK_OAK_PLANKS);
        modFenceGateBlock("dark_oak_planks_fence_gate", ModBlocks.DARK_OAK_PLANKS_FENCE_GATE.get(), Blocks.DARK_OAK_PLANKS);
        modPressurePlateBlock("dark_oak_planks_pressure_plate", ModBlocks.DARK_OAK_PLANKS_PRESSURE_PLATE.get(), Blocks.DARK_OAK_PLANKS);
        modButtonBlock("dark_oak_planks_button", ModBlocks.DARK_OAK_PLANKS_BUTTON.get(), Blocks.DARK_OAK_PLANKS);
        modWallBlock("dark_oak_planks_wall", ModBlocks.DARK_OAK_PLANKS_WALL.get(), Blocks.DARK_OAK_PLANKS);

        modStairsBlock("mangrove_planks_stairs", ModBlocks.MANGROVE_PLANKS_STAIRS.get(), Blocks.MANGROVE_PLANKS);
        modSlabBlock("mangrove_planks_slab", ModBlocks.MANGROVE_PLANKS_SLAB.get(), Blocks.MANGROVE_PLANKS);
        modFenceBlock("mangrove_planks_fence", ModBlocks.MANGROVE_PLANKS_FENCE.get(), Blocks.MANGROVE_PLANKS);
        modFenceGateBlock("mangrove_planks_fence_gate", ModBlocks.MANGROVE_PLANKS_FENCE_GATE.get(), Blocks.MANGROVE_PLANKS);
        modPressurePlateBlock("mangrove_planks_pressure_plate", ModBlocks.MANGROVE_PLANKS_PRESSURE_PLATE.get(), Blocks.MANGROVE_PLANKS);
        modButtonBlock("mangrove_planks_button", ModBlocks.MANGROVE_PLANKS_BUTTON.get(), Blocks.MANGROVE_PLANKS);
        modWallBlock("mangrove_planks_wall", ModBlocks.MANGROVE_PLANKS_WALL.get(), Blocks.MANGROVE_PLANKS);

        modStairsBlock("crimson_planks_stairs", ModBlocks.CRIMSON_PLANKS_STAIRS.get(), Blocks.CRIMSON_PLANKS);
        modSlabBlock("crimson_planks_slab", ModBlocks.CRIMSON_PLANKS_SLAB.get(), Blocks.CRIMSON_PLANKS);
        modFenceBlock("crimson_planks_fence", ModBlocks.CRIMSON_PLANKS_FENCE.get(), Blocks.CRIMSON_PLANKS);
        modFenceGateBlock("crimson_planks_fence_gate", ModBlocks.CRIMSON_PLANKS_FENCE_GATE.get(), Blocks.CRIMSON_PLANKS);
        modPressurePlateBlock("crimson_planks_pressure_plate", ModBlocks.CRIMSON_PLANKS_PRESSURE_PLATE.get(), Blocks.CRIMSON_PLANKS);
        modButtonBlock("crimson_planks_button", ModBlocks.CRIMSON_PLANKS_BUTTON.get(), Blocks.CRIMSON_PLANKS);
        modWallBlock("crimson_planks_wall", ModBlocks.CRIMSON_PLANKS_WALL.get(), Blocks.CRIMSON_PLANKS);

        modStairsBlock("warped_planks_stairs", ModBlocks.WARPED_PLANKS_STAIRS.get(), Blocks.WARPED_PLANKS);
        modSlabBlock("warped_planks_slab", ModBlocks.WARPED_PLANKS_SLAB.get(), Blocks.WARPED_PLANKS);
        modFenceBlock("warped_planks_fence", ModBlocks.WARPED_PLANKS_FENCE.get(), Blocks.WARPED_PLANKS);
        modFenceGateBlock("warped_planks_fence_gate", ModBlocks.WARPED_PLANKS_FENCE_GATE.get(), Blocks.WARPED_PLANKS);
        modPressurePlateBlock("warped_planks_pressure_plate", ModBlocks.WARPED_PLANKS_PRESSURE_PLATE.get(), Blocks.WARPED_PLANKS);
        modButtonBlock("warped_planks_button", ModBlocks.WARPED_PLANKS_BUTTON.get(), Blocks.WARPED_PLANKS);
        modWallBlock("warped_planks_wall", ModBlocks.WARPED_PLANKS_WALL.get(), Blocks.WARPED_PLANKS);

        modStairsBlock("nether_gold_ore_stairs", ModBlocks.NETHER_GOLD_ORE_STAIRS.get(), Blocks.NETHER_GOLD_ORE);
        modSlabBlock("nether_gold_ore_slab", ModBlocks.NETHER_GOLD_ORE_SLAB.get(), Blocks.NETHER_GOLD_ORE);
        modFenceBlock("nether_gold_ore_fence", ModBlocks.NETHER_GOLD_ORE_FENCE.get(), Blocks.NETHER_GOLD_ORE);
        modFenceGateBlock("nether_gold_ore_fence_gate", ModBlocks.NETHER_GOLD_ORE_FENCE_GATE.get(), Blocks.NETHER_GOLD_ORE);
        modPressurePlateBlock("nether_gold_ore_pressure_plate", ModBlocks.NETHER_GOLD_ORE_PRESSURE_PLATE.get(), Blocks.NETHER_GOLD_ORE);
        modButtonBlock("nether_gold_ore_button", ModBlocks.NETHER_GOLD_ORE_BUTTON.get(), Blocks.NETHER_GOLD_ORE);
        modWallBlock("nether_gold_ore_wall", ModBlocks.NETHER_GOLD_ORE_WALL.get(), Blocks.NETHER_GOLD_ORE);

        modStairsBlock("nether_quartz_ore_stairs", ModBlocks.NETHER_QUARTZ_ORE_STAIRS.get(), Blocks.NETHER_QUARTZ_ORE);
        modSlabBlock("nether_quartz_ore_slab", ModBlocks.NETHER_QUARTZ_ORE_SLAB.get(), Blocks.NETHER_QUARTZ_ORE);
        modFenceBlock("nether_quartz_ore_fence", ModBlocks.NETHER_QUARTZ_ORE_FENCE.get(), Blocks.NETHER_QUARTZ_ORE);
        modFenceGateBlock("nether_quartz_ore_fence_gate", ModBlocks.NETHER_QUARTZ_ORE_FENCE_GATE.get(), Blocks.NETHER_QUARTZ_ORE);
        modPressurePlateBlock("nether_quartz_ore_pressure_plate", ModBlocks.NETHER_QUARTZ_ORE_PRESSURE_PLATE.get(), Blocks.NETHER_QUARTZ_ORE);
        modButtonBlock("nether_quartz_ore_button", ModBlocks.NETHER_QUARTZ_ORE_BUTTON.get(), Blocks.NETHER_QUARTZ_ORE);
        modWallBlock("nether_quartz_ore_wall", ModBlocks.NETHER_QUARTZ_ORE_WALL.get(), Blocks.NETHER_QUARTZ_ORE);

        modStairsBlock("budding_amethyst_stairs", ModBlocks.BUDDING_AMETHYST_STAIRS.get(), Blocks.BUDDING_AMETHYST);
        modSlabBlock("budding_amethyst_slab", ModBlocks.BUDDING_AMETHYST_SLAB.get(), Blocks.BUDDING_AMETHYST);
        modFenceBlock("budding_amethyst_fence", ModBlocks.BUDDING_AMETHYST_FENCE.get(), Blocks.BUDDING_AMETHYST);
        modFenceGateBlock("budding_amethyst_fence_gate", ModBlocks.BUDDING_AMETHYST_FENCE_GATE.get(), Blocks.BUDDING_AMETHYST);
        modPressurePlateBlock("budding_amethyst_pressure_plate", ModBlocks.BUDDING_AMETHYST_PRESSURE_PLATE.get(), Blocks.BUDDING_AMETHYST);
        modButtonBlock("budding_amethyst_button", ModBlocks.BUDDING_AMETHYST_BUTTON.get(), Blocks.BUDDING_AMETHYST);
        modWallBlock("budding_amethyst_wall", ModBlocks.BUDDING_AMETHYST_WALL.get(), Blocks.BUDDING_AMETHYST);

        modStairsBlock("sponge_stairs", ModBlocks.SPONGE_STAIRS.get(), Blocks.SPONGE);
        modSlabBlock("sponge_slab", ModBlocks.SPONGE_SLAB.get(), Blocks.SPONGE);
        modFenceBlock("sponge_fence", ModBlocks.SPONGE_FENCE.get(), Blocks.SPONGE);
        modFenceGateBlock("sponge_fence_gate", ModBlocks.SPONGE_FENCE_GATE.get(), Blocks.SPONGE);
        modPressurePlateBlock("sponge_pressure_plate", ModBlocks.SPONGE_PRESSURE_PLATE.get(), Blocks.SPONGE);
        modButtonBlock("sponge_button", ModBlocks.SPONGE_BUTTON.get(), Blocks.SPONGE);
        modWallBlock("sponge_wall", ModBlocks.SPONGE_WALL.get(), Blocks.SPONGE);

        modStairsBlock("wet_sponge_stairs", ModBlocks.WET_SPONGE_STAIRS.get(), Blocks.WET_SPONGE);
        modSlabBlock("wet_sponge_slab", ModBlocks.WET_SPONGE_SLAB.get(), Blocks.WET_SPONGE);
        modFenceBlock("wet_sponge_fence", ModBlocks.WET_SPONGE_FENCE.get(), Blocks.WET_SPONGE);
        modFenceGateBlock("wet_sponge_fence_gate", ModBlocks.WET_SPONGE_FENCE_GATE.get(), Blocks.WET_SPONGE);
        modPressurePlateBlock("wet_sponge_pressure_plate", ModBlocks.WET_SPONGE_PRESSURE_PLATE.get(), Blocks.WET_SPONGE);
        modButtonBlock("wet_sponge_button", ModBlocks.WET_SPONGE_BUTTON.get(), Blocks.WET_SPONGE);
        modWallBlock("wet_sponge_wall", ModBlocks.WET_SPONGE_WALL.get(), Blocks.WET_SPONGE);

        modStairsBlock("white_wool_stairs", ModBlocks.WHITE_WOOL_STAIRS.get(), Blocks.WHITE_WOOL);
        modSlabBlock("white_wool_slab", ModBlocks.WHITE_WOOL_SLAB.get(), Blocks.WHITE_WOOL);
        modFenceBlock("white_wool_fence", ModBlocks.WHITE_WOOL_FENCE.get(), Blocks.WHITE_WOOL);
        modFenceGateBlock("white_wool_fence_gate", ModBlocks.WHITE_WOOL_FENCE_GATE.get(), Blocks.WHITE_WOOL);
        modPressurePlateBlock("white_wool_pressure_plate", ModBlocks.WHITE_WOOL_PRESSURE_PLATE.get(), Blocks.WHITE_WOOL);
        modButtonBlock("white_wool_button", ModBlocks.WHITE_WOOL_BUTTON.get(), Blocks.WHITE_WOOL);
        modWallBlock("white_wool_wall", ModBlocks.WHITE_WOOL_WALL.get(), Blocks.WHITE_WOOL);

        modStairsBlock("orange_wool_stairs", ModBlocks.ORANGE_WOOL_STAIRS.get(), Blocks.ORANGE_WOOL);
        modSlabBlock("orange_wool_slab", ModBlocks.ORANGE_WOOL_SLAB.get(), Blocks.ORANGE_WOOL);
        modFenceBlock("orange_wool_fence", ModBlocks.ORANGE_WOOL_FENCE.get(), Blocks.ORANGE_WOOL);
        modFenceGateBlock("orange_wool_fence_gate", ModBlocks.ORANGE_WOOL_FENCE_GATE.get(), Blocks.ORANGE_WOOL);
        modPressurePlateBlock("orange_wool_pressure_plate", ModBlocks.ORANGE_WOOL_PRESSURE_PLATE.get(), Blocks.ORANGE_WOOL);
        modButtonBlock("orange_wool_button", ModBlocks.ORANGE_WOOL_BUTTON.get(), Blocks.ORANGE_WOOL);
        modWallBlock("orange_wool_wall", ModBlocks.ORANGE_WOOL_WALL.get(), Blocks.ORANGE_WOOL);

        modStairsBlock("magenta_wool_stairs", ModBlocks.MAGENTA_WOOL_STAIRS.get(), Blocks.MAGENTA_WOOL);
        modSlabBlock("magenta_wool_slab", ModBlocks.MAGENTA_WOOL_SLAB.get(), Blocks.MAGENTA_WOOL);
        modFenceBlock("magenta_wool_fence", ModBlocks.MAGENTA_WOOL_FENCE.get(), Blocks.MAGENTA_WOOL);
        modFenceGateBlock("magenta_wool_fence_gate", ModBlocks.MAGENTA_WOOL_FENCE_GATE.get(), Blocks.MAGENTA_WOOL);
        modPressurePlateBlock("magenta_wool_pressure_plate", ModBlocks.MAGENTA_WOOL_PRESSURE_PLATE.get(), Blocks.MAGENTA_WOOL);
        modButtonBlock("magenta_wool_button", ModBlocks.MAGENTA_WOOL_BUTTON.get(), Blocks.MAGENTA_WOOL);
        modWallBlock("magenta_wool_wall", ModBlocks.MAGENTA_WOOL_WALL.get(), Blocks.MAGENTA_WOOL);

        modStairsBlock("light_blue_wool_stairs", ModBlocks.LIGHT_BLUE_WOOL_STAIRS.get(), Blocks.LIGHT_BLUE_WOOL);
        modSlabBlock("light_blue_wool_slab", ModBlocks.LIGHT_BLUE_WOOL_SLAB.get(), Blocks.LIGHT_BLUE_WOOL);
        modFenceBlock("light_blue_wool_fence", ModBlocks.LIGHT_BLUE_WOOL_FENCE.get(), Blocks.LIGHT_BLUE_WOOL);
        modFenceGateBlock("light_blue_wool_fence_gate", ModBlocks.LIGHT_BLUE_WOOL_FENCE_GATE.get(), Blocks.LIGHT_BLUE_WOOL);
        modPressurePlateBlock("light_blue_wool_pressure_plate", ModBlocks.LIGHT_BLUE_WOOL_PRESSURE_PLATE.get(), Blocks.LIGHT_BLUE_WOOL);
        modButtonBlock("light_blue_wool_button", ModBlocks.LIGHT_BLUE_WOOL_BUTTON.get(), Blocks.LIGHT_BLUE_WOOL);
        modWallBlock("light_blue_wool_wall", ModBlocks.LIGHT_BLUE_WOOL_WALL.get(), Blocks.LIGHT_BLUE_WOOL);

        modStairsBlock("yellow_wool_stairs", ModBlocks.YELLOW_WOOL_STAIRS.get(), Blocks.YELLOW_WOOL);
        modSlabBlock("yellow_wool_slab", ModBlocks.YELLOW_WOOL_SLAB.get(), Blocks.YELLOW_WOOL);
        modFenceBlock("yellow_wool_fence", ModBlocks.YELLOW_WOOL_FENCE.get(), Blocks.YELLOW_WOOL);
        modFenceGateBlock("yellow_wool_fence_gate", ModBlocks.YELLOW_WOOL_FENCE_GATE.get(), Blocks.YELLOW_WOOL);
        modPressurePlateBlock("yellow_wool_pressure_plate", ModBlocks.YELLOW_WOOL_PRESSURE_PLATE.get(), Blocks.YELLOW_WOOL);
        modButtonBlock("yellow_wool_button", ModBlocks.YELLOW_WOOL_BUTTON.get(), Blocks.YELLOW_WOOL);
        modWallBlock("yellow_wool_wall", ModBlocks.YELLOW_WOOL_WALL.get(), Blocks.YELLOW_WOOL);

        modStairsBlock("lime_wool_stairs", ModBlocks.LIME_WOOL_STAIRS.get(), Blocks.LIME_WOOL);
        modSlabBlock("lime_wool_slab", ModBlocks.LIME_WOOL_SLAB.get(), Blocks.LIME_WOOL);
        modFenceBlock("lime_wool_fence", ModBlocks.LIME_WOOL_FENCE.get(), Blocks.LIME_WOOL);
        modFenceGateBlock("lime_wool_fence_gate", ModBlocks.LIME_WOOL_FENCE_GATE.get(), Blocks.LIME_WOOL);
        modPressurePlateBlock("lime_wool_pressure_plate", ModBlocks.LIME_WOOL_PRESSURE_PLATE.get(), Blocks.LIME_WOOL);
        modButtonBlock("lime_wool_button", ModBlocks.LIME_WOOL_BUTTON.get(), Blocks.LIME_WOOL);
        modWallBlock("lime_wool_wall", ModBlocks.LIME_WOOL_WALL.get(), Blocks.LIME_WOOL);

        modStairsBlock("pink_wool_stairs", ModBlocks.PINK_WOOL_STAIRS.get(), Blocks.PINK_WOOL);
        modSlabBlock("pink_wool_slab", ModBlocks.PINK_WOOL_SLAB.get(), Blocks.PINK_WOOL);
        modFenceBlock("pink_wool_fence", ModBlocks.PINK_WOOL_FENCE.get(), Blocks.PINK_WOOL);
        modFenceGateBlock("pink_wool_fence_gate", ModBlocks.PINK_WOOL_FENCE_GATE.get(), Blocks.PINK_WOOL);
        modPressurePlateBlock("pink_wool_pressure_plate", ModBlocks.PINK_WOOL_PRESSURE_PLATE.get(), Blocks.PINK_WOOL);
        modButtonBlock("pink_wool_button", ModBlocks.PINK_WOOL_BUTTON.get(), Blocks.PINK_WOOL);
        modWallBlock("pink_wool_wall", ModBlocks.PINK_WOOL_WALL.get(), Blocks.PINK_WOOL);

        modStairsBlock("gray_wool_stairs", ModBlocks.GRAY_WOOL_STAIRS.get(), Blocks.GRAY_WOOL);
        modSlabBlock("gray_wool_slab", ModBlocks.GRAY_WOOL_SLAB.get(), Blocks.GRAY_WOOL);
        modFenceBlock("gray_wool_fence", ModBlocks.GRAY_WOOL_FENCE.get(), Blocks.GRAY_WOOL);
        modFenceGateBlock("gray_wool_fence_gate", ModBlocks.GRAY_WOOL_FENCE_GATE.get(), Blocks.GRAY_WOOL);
        modPressurePlateBlock("gray_wool_pressure_plate", ModBlocks.GRAY_WOOL_PRESSURE_PLATE.get(), Blocks.GRAY_WOOL);
        modButtonBlock("gray_wool_button", ModBlocks.GRAY_WOOL_BUTTON.get(), Blocks.GRAY_WOOL);
        modWallBlock("gray_wool_wall", ModBlocks.GRAY_WOOL_WALL.get(), Blocks.GRAY_WOOL);

        modStairsBlock("light_gray_wool_stairs", ModBlocks.LIGHT_GRAY_WOOL_STAIRS.get(), Blocks.LIGHT_GRAY_WOOL);
        modSlabBlock("light_gray_wool_slab", ModBlocks.LIGHT_GRAY_WOOL_SLAB.get(), Blocks.LIGHT_GRAY_WOOL);
        modFenceBlock("light_gray_wool_fence", ModBlocks.LIGHT_GRAY_WOOL_FENCE.get(), Blocks.LIGHT_GRAY_WOOL);
        modFenceGateBlock("light_gray_wool_fence_gate", ModBlocks.LIGHT_GRAY_WOOL_FENCE_GATE.get(), Blocks.LIGHT_GRAY_WOOL);
        modPressurePlateBlock("light_gray_wool_pressure_plate", ModBlocks.LIGHT_GRAY_WOOL_PRESSURE_PLATE.get(), Blocks.LIGHT_GRAY_WOOL);
        modButtonBlock("light_gray_wool_button", ModBlocks.LIGHT_GRAY_WOOL_BUTTON.get(), Blocks.LIGHT_GRAY_WOOL);
        modWallBlock("light_gray_wool_wall", ModBlocks.LIGHT_GRAY_WOOL_WALL.get(), Blocks.LIGHT_GRAY_WOOL);

        modStairsBlock("cyan_wool_stairs", ModBlocks.CYAN_WOOL_STAIRS.get(), Blocks.CYAN_WOOL);
        modSlabBlock("cyan_wool_slab", ModBlocks.CYAN_WOOL_SLAB.get(), Blocks.CYAN_WOOL);
        modFenceBlock("cyan_wool_fence", ModBlocks.CYAN_WOOL_FENCE.get(), Blocks.CYAN_WOOL);
        modFenceGateBlock("cyan_wool_fence_gate", ModBlocks.CYAN_WOOL_FENCE_GATE.get(), Blocks.CYAN_WOOL);
        modPressurePlateBlock("cyan_wool_pressure_plate", ModBlocks.CYAN_WOOL_PRESSURE_PLATE.get(), Blocks.CYAN_WOOL);
        modButtonBlock("cyan_wool_button", ModBlocks.CYAN_WOOL_BUTTON.get(), Blocks.CYAN_WOOL);
        modWallBlock("cyan_wool_wall", ModBlocks.CYAN_WOOL_WALL.get(), Blocks.CYAN_WOOL);

        modStairsBlock("purple_wool_stairs", ModBlocks.PURPLE_WOOL_STAIRS.get(), Blocks.PURPLE_WOOL);
        modSlabBlock("purple_wool_slab", ModBlocks.PURPLE_WOOL_SLAB.get(), Blocks.PURPLE_WOOL);
        modFenceBlock("purple_wool_fence", ModBlocks.PURPLE_WOOL_FENCE.get(), Blocks.PURPLE_WOOL);
        modFenceGateBlock("purple_wool_fence_gate", ModBlocks.PURPLE_WOOL_FENCE_GATE.get(), Blocks.PURPLE_WOOL);
        modPressurePlateBlock("purple_wool_pressure_plate", ModBlocks.PURPLE_WOOL_PRESSURE_PLATE.get(), Blocks.PURPLE_WOOL);
        modButtonBlock("purple_wool_button", ModBlocks.PURPLE_WOOL_BUTTON.get(), Blocks.PURPLE_WOOL);
        modWallBlock("purple_wool_wall", ModBlocks.PURPLE_WOOL_WALL.get(), Blocks.PURPLE_WOOL);

        modStairsBlock("blue_wool_stairs", ModBlocks.BLUE_WOOL_STAIRS.get(), Blocks.BLUE_WOOL);
        modSlabBlock("blue_wool_slab", ModBlocks.BLUE_WOOL_SLAB.get(), Blocks.BLUE_WOOL);
        modFenceBlock("blue_wool_fence", ModBlocks.BLUE_WOOL_FENCE.get(), Blocks.BLUE_WOOL);
        modFenceGateBlock("blue_wool_fence_gate", ModBlocks.BLUE_WOOL_FENCE_GATE.get(), Blocks.BLUE_WOOL);
        modPressurePlateBlock("blue_wool_pressure_plate", ModBlocks.BLUE_WOOL_PRESSURE_PLATE.get(), Blocks.BLUE_WOOL);
        modButtonBlock("blue_wool_button", ModBlocks.BLUE_WOOL_BUTTON.get(), Blocks.BLUE_WOOL);
        modWallBlock("blue_wool_wall", ModBlocks.BLUE_WOOL_WALL.get(), Blocks.BLUE_WOOL);

        modStairsBlock("brown_wool_stairs", ModBlocks.BROWN_WOOL_STAIRS.get(), Blocks.BROWN_WOOL);
        modSlabBlock("brown_wool_slab", ModBlocks.BROWN_WOOL_SLAB.get(), Blocks.BROWN_WOOL);
        modFenceBlock("brown_wool_fence", ModBlocks.BROWN_WOOL_FENCE.get(), Blocks.BROWN_WOOL);
        modFenceGateBlock("brown_wool_fence_gate", ModBlocks.BROWN_WOOL_FENCE_GATE.get(), Blocks.BROWN_WOOL);
        modPressurePlateBlock("brown_wool_pressure_plate", ModBlocks.BROWN_WOOL_PRESSURE_PLATE.get(), Blocks.BROWN_WOOL);
        modButtonBlock("brown_wool_button", ModBlocks.BROWN_WOOL_BUTTON.get(), Blocks.BROWN_WOOL);
        modWallBlock("brown_wool_wall", ModBlocks.BROWN_WOOL_WALL.get(), Blocks.BROWN_WOOL);

        modStairsBlock("green_wool_stairs", ModBlocks.GREEN_WOOL_STAIRS.get(), Blocks.GREEN_WOOL);
        modSlabBlock("green_wool_slab", ModBlocks.GREEN_WOOL_SLAB.get(), Blocks.GREEN_WOOL);
        modFenceBlock("green_wool_fence", ModBlocks.GREEN_WOOL_FENCE.get(), Blocks.GREEN_WOOL);
        modFenceGateBlock("green_wool_fence_gate", ModBlocks.GREEN_WOOL_FENCE_GATE.get(), Blocks.GREEN_WOOL);
        modPressurePlateBlock("green_wool_pressure_plate", ModBlocks.GREEN_WOOL_PRESSURE_PLATE.get(), Blocks.GREEN_WOOL);
        modButtonBlock("green_wool_button", ModBlocks.GREEN_WOOL_BUTTON.get(), Blocks.GREEN_WOOL);
        modWallBlock("green_wool_wall", ModBlocks.GREEN_WOOL_WALL.get(), Blocks.GREEN_WOOL);

        modStairsBlock("red_wool_stairs", ModBlocks.RED_WOOL_STAIRS.get(), Blocks.RED_WOOL);
        modSlabBlock("red_wool_slab", ModBlocks.RED_WOOL_SLAB.get(), Blocks.RED_WOOL);
        modFenceBlock("red_wool_fence", ModBlocks.RED_WOOL_FENCE.get(), Blocks.RED_WOOL);
        modFenceGateBlock("red_wool_fence_gate", ModBlocks.RED_WOOL_FENCE_GATE.get(), Blocks.RED_WOOL);
        modPressurePlateBlock("red_wool_pressure_plate", ModBlocks.RED_WOOL_PRESSURE_PLATE.get(), Blocks.RED_WOOL);
        modButtonBlock("red_wool_button", ModBlocks.RED_WOOL_BUTTON.get(), Blocks.RED_WOOL);
        modWallBlock("red_wool_wall", ModBlocks.RED_WOOL_WALL.get(), Blocks.RED_WOOL);

        modStairsBlock("black_wool_stairs", ModBlocks.BLACK_WOOL_STAIRS.get(), Blocks.BLACK_WOOL);
        modSlabBlock("black_wool_slab", ModBlocks.BLACK_WOOL_SLAB.get(), Blocks.BLACK_WOOL);
        modFenceBlock("black_wool_fence", ModBlocks.BLACK_WOOL_FENCE.get(), Blocks.BLACK_WOOL);
        modFenceGateBlock("black_wool_fence_gate", ModBlocks.BLACK_WOOL_FENCE_GATE.get(), Blocks.BLACK_WOOL);
        modPressurePlateBlock("black_wool_pressure_plate", ModBlocks.BLACK_WOOL_PRESSURE_PLATE.get(), Blocks.BLACK_WOOL);
        modButtonBlock("black_wool_button", ModBlocks.BLACK_WOOL_BUTTON.get(), Blocks.BLACK_WOOL);
        modWallBlock("black_wool_wall", ModBlocks.BLACK_WOOL_WALL.get(), Blocks.BLACK_WOOL);

        modStairsBlock("smooth_stone_stairs", ModBlocks.SMOOTH_STONE_STAIRS.get(), Blocks.SMOOTH_STONE);
        modSlabBlock("smooth_stone_slab", ModBlocks.SMOOTH_STONE_SLAB.get(), Blocks.SMOOTH_STONE);
        modFenceBlock("smooth_stone_fence", ModBlocks.SMOOTH_STONE_FENCE.get(), Blocks.SMOOTH_STONE);
        modFenceGateBlock("smooth_stone_fence_gate", ModBlocks.SMOOTH_STONE_FENCE_GATE.get(), Blocks.SMOOTH_STONE);
        modPressurePlateBlock("smooth_stone_pressure_plate", ModBlocks.SMOOTH_STONE_PRESSURE_PLATE.get(), Blocks.SMOOTH_STONE);
        modButtonBlock("smooth_stone_button", ModBlocks.SMOOTH_STONE_BUTTON.get(), Blocks.SMOOTH_STONE);
        modWallBlock("smooth_stone_wall", ModBlocks.SMOOTH_STONE_WALL.get(), Blocks.SMOOTH_STONE);

        modStairsBlock("bricks_stairs", ModBlocks.BRICKS_STAIRS.get(), Blocks.BRICKS);
        modSlabBlock("bricks_slab", ModBlocks.BRICKS_SLAB.get(), Blocks.BRICKS);
        modFenceBlock("bricks_fence", ModBlocks.BRICKS_FENCE.get(), Blocks.BRICKS);
        modFenceGateBlock("bricks_fence_gate", ModBlocks.BRICKS_FENCE_GATE.get(), Blocks.BRICKS);
        modPressurePlateBlock("bricks_pressure_plate", ModBlocks.BRICKS_PRESSURE_PLATE.get(), Blocks.BRICKS);
        modButtonBlock("bricks_button", ModBlocks.BRICKS_BUTTON.get(), Blocks.BRICKS);
        modWallBlock("bricks_wall", ModBlocks.BRICKS_WALL.get(), Blocks.BRICKS);

        modStairsBlock("mossy_cobblestone_stairs", ModBlocks.MOSSY_COBBLESTONE_STAIRS.get(), Blocks.MOSSY_COBBLESTONE);
        modSlabBlock("mossy_cobblestone_slab", ModBlocks.MOSSY_COBBLESTONE_SLAB.get(), Blocks.MOSSY_COBBLESTONE);
        modFenceBlock("mossy_cobblestone_fence", ModBlocks.MOSSY_COBBLESTONE_FENCE.get(), Blocks.MOSSY_COBBLESTONE);
        modFenceGateBlock("mossy_cobblestone_fence_gate", ModBlocks.MOSSY_COBBLESTONE_FENCE_GATE.get(), Blocks.MOSSY_COBBLESTONE);
        modPressurePlateBlock("mossy_cobblestone_pressure_plate", ModBlocks.MOSSY_COBBLESTONE_PRESSURE_PLATE.get(), Blocks.MOSSY_COBBLESTONE);
        modButtonBlock("mossy_cobblestone_button", ModBlocks.MOSSY_COBBLESTONE_BUTTON.get(), Blocks.MOSSY_COBBLESTONE);
        modWallBlock("mossy_cobblestone_wall", ModBlocks.MOSSY_COBBLESTONE_WALL.get(), Blocks.MOSSY_COBBLESTONE);

        modStairsBlock("obsidian_stairs", ModBlocks.OBSIDIAN_STAIRS.get(), Blocks.OBSIDIAN);
        modSlabBlock("obsidian_slab", ModBlocks.OBSIDIAN_SLAB.get(), Blocks.OBSIDIAN);
        modFenceBlock("obsidian_fence", ModBlocks.OBSIDIAN_FENCE.get(), Blocks.OBSIDIAN);
        modFenceGateBlock("obsidian_fence_gate", ModBlocks.OBSIDIAN_FENCE_GATE.get(), Blocks.OBSIDIAN);
        modPressurePlateBlock("obsidian_pressure_plate", ModBlocks.OBSIDIAN_PRESSURE_PLATE.get(), Blocks.OBSIDIAN);
        modButtonBlock("obsidian_button", ModBlocks.OBSIDIAN_BUTTON.get(), Blocks.OBSIDIAN);
        modWallBlock("obsidian_wall", ModBlocks.OBSIDIAN_WALL.get(), Blocks.OBSIDIAN);

        modStairsBlock("clay_stairs", ModBlocks.CLAY_STAIRS.get(), Blocks.CLAY);
        modSlabBlock("clay_slab", ModBlocks.CLAY_SLAB.get(), Blocks.CLAY);
        modFenceBlock("clay_fence", ModBlocks.CLAY_FENCE.get(), Blocks.CLAY);
        modFenceGateBlock("clay_fence_gate", ModBlocks.CLAY_FENCE_GATE.get(), Blocks.CLAY);
        modPressurePlateBlock("clay_pressure_plate", ModBlocks.CLAY_PRESSURE_PLATE.get(), Blocks.CLAY);
        modButtonBlock("clay_button", ModBlocks.CLAY_BUTTON.get(), Blocks.CLAY);
        modWallBlock("clay_wall", ModBlocks.CLAY_WALL.get(), Blocks.CLAY);

        modStairsBlock("soul_sand_stairs", ModBlocks.SOUL_SAND_STAIRS.get(), Blocks.SOUL_SAND);
        modSlabBlock("soul_sand_slab", ModBlocks.SOUL_SAND_SLAB.get(), Blocks.SOUL_SAND);
        modFenceBlock("soul_sand_fence", ModBlocks.SOUL_SAND_FENCE.get(), Blocks.SOUL_SAND);
        modFenceGateBlock("soul_sand_fence_gate", ModBlocks.SOUL_SAND_FENCE_GATE.get(), Blocks.SOUL_SAND);
        modPressurePlateBlock("soul_sand_pressure_plate", ModBlocks.SOUL_SAND_PRESSURE_PLATE.get(), Blocks.SOUL_SAND);
        modButtonBlock("soul_sand_button", ModBlocks.SOUL_SAND_BUTTON.get(), Blocks.SOUL_SAND);
        modWallBlock("soul_sand_wall", ModBlocks.SOUL_SAND_WALL.get(), Blocks.SOUL_SAND);

        modStairsBlock("soul_soil_stairs", ModBlocks.SOUL_SOIL_STAIRS.get(), Blocks.SOUL_SOIL);
        modSlabBlock("soul_soil_slab", ModBlocks.SOUL_SOIL_SLAB.get(), Blocks.SOUL_SOIL);
        modFenceBlock("soul_soil_fence", ModBlocks.SOUL_SOIL_FENCE.get(), Blocks.SOUL_SOIL);
        modFenceGateBlock("soul_soil_fence_gate", ModBlocks.SOUL_SOIL_FENCE_GATE.get(), Blocks.SOUL_SOIL);
        modPressurePlateBlock("soul_soil_pressure_plate", ModBlocks.SOUL_SOIL_PRESSURE_PLATE.get(), Blocks.SOUL_SOIL);
        modButtonBlock("soul_soil_button", ModBlocks.SOUL_SOIL_BUTTON.get(), Blocks.SOUL_SOIL);
        modWallBlock("soul_soil_wall", ModBlocks.SOUL_SOIL_WALL.get(), Blocks.SOUL_SOIL);

        modStairsBlock("smooth_basalt_stairs", ModBlocks.SMOOTH_BASALT_STAIRS.get(), Blocks.SMOOTH_BASALT);
        modSlabBlock("smooth_basalt_slab", ModBlocks.SMOOTH_BASALT_SLAB.get(), Blocks.SMOOTH_BASALT);
        modFenceBlock("smooth_basalt_fence", ModBlocks.SMOOTH_BASALT_FENCE.get(), Blocks.SMOOTH_BASALT);
        modFenceGateBlock("smooth_basalt_fence_gate", ModBlocks.SMOOTH_BASALT_FENCE_GATE.get(), Blocks.SMOOTH_BASALT);
        modPressurePlateBlock("smooth_basalt_pressure_plate", ModBlocks.SMOOTH_BASALT_PRESSURE_PLATE.get(), Blocks.SMOOTH_BASALT);
        modButtonBlock("smooth_basalt_button", ModBlocks.SMOOTH_BASALT_BUTTON.get(), Blocks.SMOOTH_BASALT);
        modWallBlock("smooth_basalt_wall", ModBlocks.SMOOTH_BASALT_WALL.get(), Blocks.SMOOTH_BASALT);

        modStairsBlock("stone_bricks_stairs", ModBlocks.STONE_BRICKS_STAIRS.get(), Blocks.STONE_BRICKS);
        modSlabBlock("stone_bricks_slab", ModBlocks.STONE_BRICKS_SLAB.get(), Blocks.STONE_BRICKS);
        modFenceBlock("stone_bricks_fence", ModBlocks.STONE_BRICKS_FENCE.get(), Blocks.STONE_BRICKS);
        modFenceGateBlock("stone_bricks_fence_gate", ModBlocks.STONE_BRICKS_FENCE_GATE.get(), Blocks.STONE_BRICKS);
        modPressurePlateBlock("stone_bricks_pressure_plate", ModBlocks.STONE_BRICKS_PRESSURE_PLATE.get(), Blocks.STONE_BRICKS);
        modButtonBlock("stone_bricks_button", ModBlocks.STONE_BRICKS_BUTTON.get(), Blocks.STONE_BRICKS);
        modWallBlock("stone_bricks_wall", ModBlocks.STONE_BRICKS_WALL.get(), Blocks.STONE_BRICKS);

        modStairsBlock("mossy_stone_bricks_stairs", ModBlocks.MOSSY_STONE_BRICKS_STAIRS.get(), Blocks.MOSSY_STONE_BRICKS);
        modSlabBlock("mossy_stone_bricks_slab", ModBlocks.MOSSY_STONE_BRICKS_SLAB.get(), Blocks.MOSSY_STONE_BRICKS);
        modFenceBlock("mossy_stone_bricks_fence", ModBlocks.MOSSY_STONE_BRICKS_FENCE.get(), Blocks.MOSSY_STONE_BRICKS);
        modFenceGateBlock("mossy_stone_bricks_fence_gate", ModBlocks.MOSSY_STONE_BRICKS_FENCE_GATE.get(), Blocks.MOSSY_STONE_BRICKS);
        modPressurePlateBlock("mossy_stone_bricks_pressure_plate", ModBlocks.MOSSY_STONE_BRICKS_PRESSURE_PLATE.get(), Blocks.MOSSY_STONE_BRICKS);
        modButtonBlock("mossy_stone_bricks_button", ModBlocks.MOSSY_STONE_BRICKS_BUTTON.get(), Blocks.MOSSY_STONE_BRICKS);
        modWallBlock("mossy_stone_bricks_wall", ModBlocks.MOSSY_STONE_BRICKS_WALL.get(), Blocks.MOSSY_STONE_BRICKS);

        modStairsBlock("cracked_stone_bricks_stairs", ModBlocks.CRACKED_STONE_BRICKS_STAIRS.get(), Blocks.CRACKED_STONE_BRICKS);
        modSlabBlock("cracked_stone_bricks_slab", ModBlocks.CRACKED_STONE_BRICKS_SLAB.get(), Blocks.CRACKED_STONE_BRICKS);
        modFenceBlock("cracked_stone_bricks_fence", ModBlocks.CRACKED_STONE_BRICKS_FENCE.get(), Blocks.CRACKED_STONE_BRICKS);
        modFenceGateBlock("cracked_stone_bricks_fence_gate", ModBlocks.CRACKED_STONE_BRICKS_FENCE_GATE.get(), Blocks.CRACKED_STONE_BRICKS);
        modPressurePlateBlock("cracked_stone_bricks_pressure_plate", ModBlocks.CRACKED_STONE_BRICKS_PRESSURE_PLATE.get(), Blocks.CRACKED_STONE_BRICKS);
        modButtonBlock("cracked_stone_bricks_button", ModBlocks.CRACKED_STONE_BRICKS_BUTTON.get(), Blocks.CRACKED_STONE_BRICKS);
        modWallBlock("cracked_stone_bricks_wall", ModBlocks.CRACKED_STONE_BRICKS_WALL.get(), Blocks.CRACKED_STONE_BRICKS);

        modStairsBlock("chiseled_stone_bricks_stairs", ModBlocks.CHISELED_STONE_BRICKS_STAIRS.get(), Blocks.CHISELED_STONE_BRICKS);
        modSlabBlock("chiseled_stone_bricks_slab", ModBlocks.CHISELED_STONE_BRICKS_SLAB.get(), Blocks.CHISELED_STONE_BRICKS);
        modFenceBlock("chiseled_stone_bricks_fence", ModBlocks.CHISELED_STONE_BRICKS_FENCE.get(), Blocks.CHISELED_STONE_BRICKS);
        modFenceGateBlock("chiseled_stone_bricks_fence_gate", ModBlocks.CHISELED_STONE_BRICKS_FENCE_GATE.get(), Blocks.CHISELED_STONE_BRICKS);
        modPressurePlateBlock("chiseled_stone_bricks_pressure_plate", ModBlocks.CHISELED_STONE_BRICKS_PRESSURE_PLATE.get(), Blocks.CHISELED_STONE_BRICKS);
        modButtonBlock("chiseled_stone_bricks_button", ModBlocks.CHISELED_STONE_BRICKS_BUTTON.get(), Blocks.CHISELED_STONE_BRICKS);
        modWallBlock("chiseled_stone_bricks_wall", ModBlocks.CHISELED_STONE_BRICKS_WALL.get(), Blocks.CHISELED_STONE_BRICKS);

        modStairsBlock("packed_mud_stairs", ModBlocks.PACKED_MUD_STAIRS.get(), Blocks.PACKED_MUD);
        modSlabBlock("packed_mud_slab", ModBlocks.PACKED_MUD_SLAB.get(), Blocks.PACKED_MUD);
        modFenceBlock("packed_mud_fence", ModBlocks.PACKED_MUD_FENCE.get(), Blocks.PACKED_MUD);
        modFenceGateBlock("packed_mud_fence_gate", ModBlocks.PACKED_MUD_FENCE_GATE.get(), Blocks.PACKED_MUD);
        modPressurePlateBlock("packed_mud_pressure_plate", ModBlocks.PACKED_MUD_PRESSURE_PLATE.get(), Blocks.PACKED_MUD);
        modButtonBlock("packed_mud_button", ModBlocks.PACKED_MUD_BUTTON.get(), Blocks.PACKED_MUD);
        modWallBlock("packed_mud_wall", ModBlocks.PACKED_MUD_WALL.get(), Blocks.PACKED_MUD);

        modStairsBlock("mud_bricks_stairs", ModBlocks.MUD_BRICKS_STAIRS.get(), Blocks.MUD_BRICKS);
        modSlabBlock("mud_bricks_slab", ModBlocks.MUD_BRICKS_SLAB.get(), Blocks.MUD_BRICKS);
        modFenceBlock("mud_bricks_fence", ModBlocks.MUD_BRICKS_FENCE.get(), Blocks.MUD_BRICKS);
        modFenceGateBlock("mud_bricks_fence_gate", ModBlocks.MUD_BRICKS_FENCE_GATE.get(), Blocks.MUD_BRICKS);
        modPressurePlateBlock("mud_bricks_pressure_plate", ModBlocks.MUD_BRICKS_PRESSURE_PLATE.get(), Blocks.MUD_BRICKS);
        modButtonBlock("mud_bricks_button", ModBlocks.MUD_BRICKS_BUTTON.get(), Blocks.MUD_BRICKS);
        modWallBlock("mud_bricks_wall", ModBlocks.MUD_BRICKS_WALL.get(), Blocks.MUD_BRICKS);

        modStairsBlock("deepslate_bricks_stairs", ModBlocks.DEEPSLATE_BRICKS_STAIRS.get(), Blocks.DEEPSLATE_BRICKS);
        modSlabBlock("deepslate_bricks_slab", ModBlocks.DEEPSLATE_BRICKS_SLAB.get(), Blocks.DEEPSLATE_BRICKS);
        modFenceBlock("deepslate_bricks_fence", ModBlocks.DEEPSLATE_BRICKS_FENCE.get(), Blocks.DEEPSLATE_BRICKS);
        modFenceGateBlock("deepslate_bricks_fence_gate", ModBlocks.DEEPSLATE_BRICKS_FENCE_GATE.get(), Blocks.DEEPSLATE_BRICKS);
        modPressurePlateBlock("deepslate_bricks_pressure_plate", ModBlocks.DEEPSLATE_BRICKS_PRESSURE_PLATE.get(), Blocks.DEEPSLATE_BRICKS);
        modButtonBlock("deepslate_bricks_button", ModBlocks.DEEPSLATE_BRICKS_BUTTON.get(), Blocks.DEEPSLATE_BRICKS);
        modWallBlock("deepslate_bricks_wall", ModBlocks.DEEPSLATE_BRICKS_WALL.get(), Blocks.DEEPSLATE_BRICKS);

        modStairsBlock("cracked_deepslate_bricks_stairs", ModBlocks.CRACKED_DEEPSLATE_BRICKS_STAIRS.get(), Blocks.CRACKED_DEEPSLATE_BRICKS);
        modSlabBlock("cracked_deepslate_bricks_slab", ModBlocks.CRACKED_DEEPSLATE_BRICKS_SLAB.get(), Blocks.CRACKED_DEEPSLATE_BRICKS);
        modFenceBlock("cracked_deepslate_bricks_fence", ModBlocks.CRACKED_DEEPSLATE_BRICKS_FENCE.get(), Blocks.CRACKED_DEEPSLATE_BRICKS);
        modFenceGateBlock("cracked_deepslate_bricks_fence_gate", ModBlocks.CRACKED_DEEPSLATE_BRICKS_FENCE_GATE.get(), Blocks.CRACKED_DEEPSLATE_BRICKS);
        modPressurePlateBlock("cracked_deepslate_bricks_pressure_plate", ModBlocks.CRACKED_DEEPSLATE_BRICKS_PRESSURE_PLATE.get(), Blocks.CRACKED_DEEPSLATE_BRICKS);
        modButtonBlock("cracked_deepslate_bricks_button", ModBlocks.CRACKED_DEEPSLATE_BRICKS_BUTTON.get(), Blocks.CRACKED_DEEPSLATE_BRICKS);
        modWallBlock("cracked_deepslate_bricks_wall", ModBlocks.CRACKED_DEEPSLATE_BRICKS_WALL.get(), Blocks.CRACKED_DEEPSLATE_BRICKS);

        modStairsBlock("deepslate_tiles_stairs", ModBlocks.DEEPSLATE_TILES_STAIRS.get(), Blocks.DEEPSLATE_TILES);
        modSlabBlock("deepslate_tiles_slab", ModBlocks.DEEPSLATE_TILES_SLAB.get(), Blocks.DEEPSLATE_TILES);
        modFenceBlock("deepslate_tiles_fence", ModBlocks.DEEPSLATE_TILES_FENCE.get(), Blocks.DEEPSLATE_TILES);
        modFenceGateBlock("deepslate_tiles_fence_gate", ModBlocks.DEEPSLATE_TILES_FENCE_GATE.get(), Blocks.DEEPSLATE_TILES);
        modPressurePlateBlock("deepslate_tiles_pressure_plate", ModBlocks.DEEPSLATE_TILES_PRESSURE_PLATE.get(), Blocks.DEEPSLATE_TILES);
        modButtonBlock("deepslate_tiles_button", ModBlocks.DEEPSLATE_TILES_BUTTON.get(), Blocks.DEEPSLATE_TILES);
        modWallBlock("deepslate_tiles_wall", ModBlocks.DEEPSLATE_TILES_WALL.get(), Blocks.DEEPSLATE_TILES);

        modStairsBlock("cracked_deepslate_tiles_stairs", ModBlocks.CRACKED_DEEPSLATE_TILES_STAIRS.get(), Blocks.CRACKED_DEEPSLATE_TILES);
        modSlabBlock("cracked_deepslate_tiles_slab", ModBlocks.CRACKED_DEEPSLATE_TILES_SLAB.get(), Blocks.CRACKED_DEEPSLATE_TILES);
        modFenceBlock("cracked_deepslate_tiles_fence", ModBlocks.CRACKED_DEEPSLATE_TILES_FENCE.get(), Blocks.CRACKED_DEEPSLATE_TILES);
        modFenceGateBlock("cracked_deepslate_tiles_fence_gate", ModBlocks.CRACKED_DEEPSLATE_TILES_FENCE_GATE.get(), Blocks.CRACKED_DEEPSLATE_TILES);
        modPressurePlateBlock("cracked_deepslate_tiles_pressure_plate", ModBlocks.CRACKED_DEEPSLATE_TILES_PRESSURE_PLATE.get(), Blocks.CRACKED_DEEPSLATE_TILES);
        modButtonBlock("cracked_deepslate_tiles_button", ModBlocks.CRACKED_DEEPSLATE_TILES_BUTTON.get(), Blocks.CRACKED_DEEPSLATE_TILES);
        modWallBlock("cracked_deepslate_tiles_wall", ModBlocks.CRACKED_DEEPSLATE_TILES_WALL.get(), Blocks.CRACKED_DEEPSLATE_TILES);

        modStairsBlock("chiseled_deepslate_stairs", ModBlocks.CHISELED_DEEPSLATE_STAIRS.get(), Blocks.CHISELED_DEEPSLATE);
        modSlabBlock("chiseled_deepslate_slab", ModBlocks.CHISELED_DEEPSLATE_SLAB.get(), Blocks.CHISELED_DEEPSLATE);
        modFenceBlock("chiseled_deepslate_fence", ModBlocks.CHISELED_DEEPSLATE_FENCE.get(), Blocks.CHISELED_DEEPSLATE);
        modFenceGateBlock("chiseled_deepslate_fence_gate", ModBlocks.CHISELED_DEEPSLATE_FENCE_GATE.get(), Blocks.CHISELED_DEEPSLATE);
        modPressurePlateBlock("chiseled_deepslate_pressure_plate", ModBlocks.CHISELED_DEEPSLATE_PRESSURE_PLATE.get(), Blocks.CHISELED_DEEPSLATE);
        modButtonBlock("chiseled_deepslate_button", ModBlocks.CHISELED_DEEPSLATE_BUTTON.get(), Blocks.CHISELED_DEEPSLATE);
        modWallBlock("chiseled_deepslate_wall", ModBlocks.CHISELED_DEEPSLATE_WALL.get(), Blocks.CHISELED_DEEPSLATE);

        modStairsBlock("mushroom_stem_stairs", ModBlocks.MUSHROOM_STEM_STAIRS.get(), Blocks.MUSHROOM_STEM);
        modSlabBlock("mushroom_stem_slab", ModBlocks.MUSHROOM_STEM_SLAB.get(), Blocks.MUSHROOM_STEM);
        modFenceBlock("mushroom_stem_fence", ModBlocks.MUSHROOM_STEM_FENCE.get(), Blocks.MUSHROOM_STEM);
        modFenceGateBlock("mushroom_stem_fence_gate", ModBlocks.MUSHROOM_STEM_FENCE_GATE.get(), Blocks.MUSHROOM_STEM);
        modPressurePlateBlock("mushroom_stem_pressure_plate", ModBlocks.MUSHROOM_STEM_PRESSURE_PLATE.get(), Blocks.MUSHROOM_STEM);
        modButtonBlock("mushroom_stem_button", ModBlocks.MUSHROOM_STEM_BUTTON.get(), Blocks.MUSHROOM_STEM);
        modWallBlock("mushroom_stem_wall", ModBlocks.MUSHROOM_STEM_WALL.get(), Blocks.MUSHROOM_STEM);

        modStairsBlock("nether_bricks_stairs", ModBlocks.NETHER_BRICKS_STAIRS.get(), Blocks.NETHER_BRICKS);
        modSlabBlock("nether_bricks_slab", ModBlocks.NETHER_BRICKS_SLAB.get(), Blocks.NETHER_BRICKS);
        modFenceBlock("nether_bricks_fence", ModBlocks.NETHER_BRICKS_FENCE.get(), Blocks.NETHER_BRICKS);
        modFenceGateBlock("nether_bricks_fence_gate", ModBlocks.NETHER_BRICKS_FENCE_GATE.get(), Blocks.NETHER_BRICKS);
        modPressurePlateBlock("nether_bricks_pressure_plate", ModBlocks.NETHER_BRICKS_PRESSURE_PLATE.get(), Blocks.NETHER_BRICKS);
        modButtonBlock("nether_bricks_button", ModBlocks.NETHER_BRICKS_BUTTON.get(), Blocks.NETHER_BRICKS);
        modWallBlock("nether_bricks_wall", ModBlocks.NETHER_BRICKS_WALL.get(), Blocks.NETHER_BRICKS);

        modStairsBlock("cracked_nether_bricks_stairs", ModBlocks.CRACKED_NETHER_BRICKS_STAIRS.get(), Blocks.CRACKED_NETHER_BRICKS);
        modSlabBlock("cracked_nether_bricks_slab", ModBlocks.CRACKED_NETHER_BRICKS_SLAB.get(), Blocks.CRACKED_NETHER_BRICKS);
        modFenceBlock("cracked_nether_bricks_fence", ModBlocks.CRACKED_NETHER_BRICKS_FENCE.get(), Blocks.CRACKED_NETHER_BRICKS);
        modFenceGateBlock("cracked_nether_bricks_fence_gate", ModBlocks.CRACKED_NETHER_BRICKS_FENCE_GATE.get(), Blocks.CRACKED_NETHER_BRICKS);
        modPressurePlateBlock("cracked_nether_bricks_pressure_plate", ModBlocks.CRACKED_NETHER_BRICKS_PRESSURE_PLATE.get(), Blocks.CRACKED_NETHER_BRICKS);
        modButtonBlock("cracked_nether_bricks_button", ModBlocks.CRACKED_NETHER_BRICKS_BUTTON.get(), Blocks.CRACKED_NETHER_BRICKS);
        modWallBlock("cracked_nether_bricks_wall", ModBlocks.CRACKED_NETHER_BRICKS_WALL.get(), Blocks.CRACKED_NETHER_BRICKS);

        modStairsBlock("chiseled_nether_bricks_stairs", ModBlocks.CHISELED_NETHER_BRICKS_STAIRS.get(), Blocks.CHISELED_NETHER_BRICKS);
        modSlabBlock("chiseled_nether_bricks_slab", ModBlocks.CHISELED_NETHER_BRICKS_SLAB.get(), Blocks.CHISELED_NETHER_BRICKS);
        modFenceBlock("chiseled_nether_bricks_fence", ModBlocks.CHISELED_NETHER_BRICKS_FENCE.get(), Blocks.CHISELED_NETHER_BRICKS);
        modFenceGateBlock("chiseled_nether_bricks_fence_gate", ModBlocks.CHISELED_NETHER_BRICKS_FENCE_GATE.get(), Blocks.CHISELED_NETHER_BRICKS);
        modPressurePlateBlock("chiseled_nether_bricks_pressure_plate", ModBlocks.CHISELED_NETHER_BRICKS_PRESSURE_PLATE.get(), Blocks.CHISELED_NETHER_BRICKS);
        modButtonBlock("chiseled_nether_bricks_button", ModBlocks.CHISELED_NETHER_BRICKS_BUTTON.get(), Blocks.CHISELED_NETHER_BRICKS);
        modWallBlock("chiseled_nether_bricks_wall", ModBlocks.CHISELED_NETHER_BRICKS_WALL.get(), Blocks.CHISELED_NETHER_BRICKS);

        modStairsBlock("sculk_stairs", ModBlocks.SCULK_STAIRS.get(), Blocks.SCULK);
        modSlabBlock("sculk_slab", ModBlocks.SCULK_SLAB.get(), Blocks.SCULK);
        modFenceBlock("sculk_fence", ModBlocks.SCULK_FENCE.get(), Blocks.SCULK);
        modFenceGateBlock("sculk_fence_gate", ModBlocks.SCULK_FENCE_GATE.get(), Blocks.SCULK);
        modPressurePlateBlock("sculk_pressure_plate", ModBlocks.SCULK_PRESSURE_PLATE.get(), Blocks.SCULK);
        modButtonBlock("sculk_button", ModBlocks.SCULK_BUTTON.get(), Blocks.SCULK);
        modWallBlock("sculk_wall", ModBlocks.SCULK_WALL.get(), Blocks.SCULK);

        modStairsBlock("end_stone_stairs", ModBlocks.END_STONE_STAIRS.get(), Blocks.END_STONE);
        modSlabBlock("end_stone_slab", ModBlocks.END_STONE_SLAB.get(), Blocks.END_STONE);
        modFenceBlock("end_stone_fence", ModBlocks.END_STONE_FENCE.get(), Blocks.END_STONE);
        modFenceGateBlock("end_stone_fence_gate", ModBlocks.END_STONE_FENCE_GATE.get(), Blocks.END_STONE);
        modPressurePlateBlock("end_stone_pressure_plate", ModBlocks.END_STONE_PRESSURE_PLATE.get(), Blocks.END_STONE);
        modButtonBlock("end_stone_button", ModBlocks.END_STONE_BUTTON.get(), Blocks.END_STONE);
        modWallBlock("end_stone_wall", ModBlocks.END_STONE_WALL.get(), Blocks.END_STONE);

        modStairsBlock("end_stone_bricks_stairs", ModBlocks.END_STONE_BRICKS_STAIRS.get(), Blocks.END_STONE_BRICKS);
        modSlabBlock("end_stone_bricks_slab", ModBlocks.END_STONE_BRICKS_SLAB.get(), Blocks.END_STONE_BRICKS);
        modFenceBlock("end_stone_bricks_fence", ModBlocks.END_STONE_BRICKS_FENCE.get(), Blocks.END_STONE_BRICKS);
        modFenceGateBlock("end_stone_bricks_fence_gate", ModBlocks.END_STONE_BRICKS_FENCE_GATE.get(), Blocks.END_STONE_BRICKS);
        modPressurePlateBlock("end_stone_bricks_pressure_plate", ModBlocks.END_STONE_BRICKS_PRESSURE_PLATE.get(), Blocks.END_STONE_BRICKS);
        modButtonBlock("end_stone_bricks_button", ModBlocks.END_STONE_BRICKS_BUTTON.get(), Blocks.END_STONE_BRICKS);
        modWallBlock("end_stone_bricks_wall", ModBlocks.END_STONE_BRICKS_WALL.get(), Blocks.END_STONE_BRICKS);

        modStairsBlock("quartz_bricks_stairs", ModBlocks.QUARTZ_BRICKS_STAIRS.get(), Blocks.QUARTZ_BRICKS);
        modSlabBlock("quartz_bricks_slab", ModBlocks.QUARTZ_BRICKS_SLAB.get(), Blocks.QUARTZ_BRICKS);
        modFenceBlock("quartz_bricks_fence", ModBlocks.QUARTZ_BRICKS_FENCE.get(), Blocks.QUARTZ_BRICKS);
        modFenceGateBlock("quartz_bricks_fence_gate", ModBlocks.QUARTZ_BRICKS_FENCE_GATE.get(), Blocks.QUARTZ_BRICKS);
        modPressurePlateBlock("quartz_bricks_pressure_plate", ModBlocks.QUARTZ_BRICKS_PRESSURE_PLATE.get(), Blocks.QUARTZ_BRICKS);
        modButtonBlock("quartz_bricks_button", ModBlocks.QUARTZ_BRICKS_BUTTON.get(), Blocks.QUARTZ_BRICKS);
        modWallBlock("quartz_bricks_wall", ModBlocks.QUARTZ_BRICKS_WALL.get(), Blocks.QUARTZ_BRICKS);

        modStairsBlock("white_terracotta_stairs", ModBlocks.WHITE_TERRACOTTA_STAIRS.get(), Blocks.WHITE_TERRACOTTA);
        modSlabBlock("white_terracotta_slab", ModBlocks.WHITE_TERRACOTTA_SLAB.get(), Blocks.WHITE_TERRACOTTA);
        modFenceBlock("white_terracotta_fence", ModBlocks.WHITE_TERRACOTTA_FENCE.get(), Blocks.WHITE_TERRACOTTA);
        modFenceGateBlock("white_terracotta_fence_gate", ModBlocks.WHITE_TERRACOTTA_FENCE_GATE.get(), Blocks.WHITE_TERRACOTTA);
        modPressurePlateBlock("white_terracotta_pressure_plate", ModBlocks.WHITE_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.WHITE_TERRACOTTA);
        modButtonBlock("white_terracotta_button", ModBlocks.WHITE_TERRACOTTA_BUTTON.get(), Blocks.WHITE_TERRACOTTA);
        modWallBlock("white_terracotta_wall", ModBlocks.WHITE_TERRACOTTA_WALL.get(), Blocks.WHITE_TERRACOTTA);

        modStairsBlock("orange_terracotta_stairs", ModBlocks.ORANGE_TERRACOTTA_STAIRS.get(), Blocks.ORANGE_TERRACOTTA);
        modSlabBlock("orange_terracotta_slab", ModBlocks.ORANGE_TERRACOTTA_SLAB.get(), Blocks.ORANGE_TERRACOTTA);
        modFenceBlock("orange_terracotta_fence", ModBlocks.ORANGE_TERRACOTTA_FENCE.get(), Blocks.ORANGE_TERRACOTTA);
        modFenceGateBlock("orange_terracotta_fence_gate", ModBlocks.ORANGE_TERRACOTTA_FENCE_GATE.get(), Blocks.ORANGE_TERRACOTTA);
        modPressurePlateBlock("orange_terracotta_pressure_plate", ModBlocks.ORANGE_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.ORANGE_TERRACOTTA);
        modButtonBlock("orange_terracotta_button", ModBlocks.ORANGE_TERRACOTTA_BUTTON.get(), Blocks.ORANGE_TERRACOTTA);
        modWallBlock("orange_terracotta_wall", ModBlocks.ORANGE_TERRACOTTA_WALL.get(), Blocks.ORANGE_TERRACOTTA);

        modStairsBlock("magenta_terracotta_stairs", ModBlocks.MAGENTA_TERRACOTTA_STAIRS.get(), Blocks.MAGENTA_TERRACOTTA);
        modSlabBlock("magenta_terracotta_slab", ModBlocks.MAGENTA_TERRACOTTA_SLAB.get(), Blocks.MAGENTA_TERRACOTTA);
        modFenceBlock("magenta_terracotta_fence", ModBlocks.MAGENTA_TERRACOTTA_FENCE.get(), Blocks.MAGENTA_TERRACOTTA);
        modFenceGateBlock("magenta_terracotta_fence_gate", ModBlocks.MAGENTA_TERRACOTTA_FENCE_GATE.get(), Blocks.MAGENTA_TERRACOTTA);
        modPressurePlateBlock("magenta_terracotta_pressure_plate", ModBlocks.MAGENTA_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.MAGENTA_TERRACOTTA);
        modButtonBlock("magenta_terracotta_button", ModBlocks.MAGENTA_TERRACOTTA_BUTTON.get(), Blocks.MAGENTA_TERRACOTTA);
        modWallBlock("magenta_terracotta_wall", ModBlocks.MAGENTA_TERRACOTTA_WALL.get(), Blocks.MAGENTA_TERRACOTTA);

        modStairsBlock("light_blue_terracotta_stairs", ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get(), Blocks.LIGHT_BLUE_TERRACOTTA);
        modSlabBlock("light_blue_terracotta_slab", ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get(), Blocks.LIGHT_BLUE_TERRACOTTA);
        modFenceBlock("light_blue_terracotta_fence", ModBlocks.LIGHT_BLUE_TERRACOTTA_FENCE.get(), Blocks.LIGHT_BLUE_TERRACOTTA);
        modFenceGateBlock("light_blue_terracotta_fence_gate", ModBlocks.LIGHT_BLUE_TERRACOTTA_FENCE_GATE.get(), Blocks.LIGHT_BLUE_TERRACOTTA);
        modPressurePlateBlock("light_blue_terracotta_pressure_plate", ModBlocks.LIGHT_BLUE_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.LIGHT_BLUE_TERRACOTTA);
        modButtonBlock("light_blue_terracotta_button", ModBlocks.LIGHT_BLUE_TERRACOTTA_BUTTON.get(), Blocks.LIGHT_BLUE_TERRACOTTA);
        modWallBlock("light_blue_terracotta_wall", ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get(), Blocks.LIGHT_BLUE_TERRACOTTA);

        modStairsBlock("yellow_terracotta_stairs", ModBlocks.YELLOW_TERRACOTTA_STAIRS.get(), Blocks.YELLOW_TERRACOTTA);
        modSlabBlock("yellow_terracotta_slab", ModBlocks.YELLOW_TERRACOTTA_SLAB.get(), Blocks.YELLOW_TERRACOTTA);
        modFenceBlock("yellow_terracotta_fence", ModBlocks.YELLOW_TERRACOTTA_FENCE.get(), Blocks.YELLOW_TERRACOTTA);
        modFenceGateBlock("yellow_terracotta_fence_gate", ModBlocks.YELLOW_TERRACOTTA_FENCE_GATE.get(), Blocks.YELLOW_TERRACOTTA);
        modPressurePlateBlock("yellow_terracotta_pressure_plate", ModBlocks.YELLOW_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.YELLOW_TERRACOTTA);
        modButtonBlock("yellow_terracotta_button", ModBlocks.YELLOW_TERRACOTTA_BUTTON.get(), Blocks.YELLOW_TERRACOTTA);
        modWallBlock("yellow_terracotta_wall", ModBlocks.YELLOW_TERRACOTTA_WALL.get(), Blocks.YELLOW_TERRACOTTA);

        modStairsBlock("lime_terracotta_stairs", ModBlocks.LIME_TERRACOTTA_STAIRS.get(), Blocks.LIME_TERRACOTTA);
        modSlabBlock("lime_terracotta_slab", ModBlocks.LIME_TERRACOTTA_SLAB.get(), Blocks.LIME_TERRACOTTA);
        modFenceBlock("lime_terracotta_fence", ModBlocks.LIME_TERRACOTTA_FENCE.get(), Blocks.LIME_TERRACOTTA);
        modFenceGateBlock("lime_terracotta_fence_gate", ModBlocks.LIME_TERRACOTTA_FENCE_GATE.get(), Blocks.LIME_TERRACOTTA);
        modPressurePlateBlock("lime_terracotta_pressure_plate", ModBlocks.LIME_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.LIME_TERRACOTTA);
        modButtonBlock("lime_terracotta_button", ModBlocks.LIME_TERRACOTTA_BUTTON.get(), Blocks.LIME_TERRACOTTA);
        modWallBlock("lime_terracotta_wall", ModBlocks.LIME_TERRACOTTA_WALL.get(), Blocks.LIME_TERRACOTTA);

        modStairsBlock("pink_terracotta_stairs", ModBlocks.PINK_TERRACOTTA_STAIRS.get(), Blocks.PINK_TERRACOTTA);
        modSlabBlock("pink_terracotta_slab", ModBlocks.PINK_TERRACOTTA_SLAB.get(), Blocks.PINK_TERRACOTTA);
        modFenceBlock("pink_terracotta_fence", ModBlocks.PINK_TERRACOTTA_FENCE.get(), Blocks.PINK_TERRACOTTA);
        modFenceGateBlock("pink_terracotta_fence_gate", ModBlocks.PINK_TERRACOTTA_FENCE_GATE.get(), Blocks.PINK_TERRACOTTA);
        modPressurePlateBlock("pink_terracotta_pressure_plate", ModBlocks.PINK_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.PINK_TERRACOTTA);
        modButtonBlock("pink_terracotta_button", ModBlocks.PINK_TERRACOTTA_BUTTON.get(), Blocks.PINK_TERRACOTTA);
        modWallBlock("pink_terracotta_wall", ModBlocks.PINK_TERRACOTTA_WALL.get(), Blocks.PINK_TERRACOTTA);

        modStairsBlock("gray_terracotta_stairs", ModBlocks.GRAY_TERRACOTTA_STAIRS.get(), Blocks.GRAY_TERRACOTTA);
        modSlabBlock("gray_terracotta_slab", ModBlocks.GRAY_TERRACOTTA_SLAB.get(), Blocks.GRAY_TERRACOTTA);
        modFenceBlock("gray_terracotta_fence", ModBlocks.GRAY_TERRACOTTA_FENCE.get(), Blocks.GRAY_TERRACOTTA);
        modFenceGateBlock("gray_terracotta_fence_gate", ModBlocks.GRAY_TERRACOTTA_FENCE_GATE.get(), Blocks.GRAY_TERRACOTTA);
        modPressurePlateBlock("gray_terracotta_pressure_plate", ModBlocks.GRAY_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.GRAY_TERRACOTTA);
        modButtonBlock("gray_terracotta_button", ModBlocks.GRAY_TERRACOTTA_BUTTON.get(), Blocks.GRAY_TERRACOTTA);
        modWallBlock("gray_terracotta_wall", ModBlocks.GRAY_TERRACOTTA_WALL.get(), Blocks.GRAY_TERRACOTTA);

        modStairsBlock("light_gray_terracotta_stairs", ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get(), Blocks.LIGHT_GRAY_TERRACOTTA);
        modSlabBlock("light_gray_terracotta_slab", ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get(), Blocks.LIGHT_GRAY_TERRACOTTA);
        modFenceBlock("light_gray_terracotta_fence", ModBlocks.LIGHT_GRAY_TERRACOTTA_FENCE.get(), Blocks.LIGHT_GRAY_TERRACOTTA);
        modFenceGateBlock("light_gray_terracotta_fence_gate", ModBlocks.LIGHT_GRAY_TERRACOTTA_FENCE_GATE.get(), Blocks.LIGHT_GRAY_TERRACOTTA);
        modPressurePlateBlock("light_gray_terracotta_pressure_plate", ModBlocks.LIGHT_GRAY_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.LIGHT_GRAY_TERRACOTTA);
        modButtonBlock("light_gray_terracotta_button", ModBlocks.LIGHT_GRAY_TERRACOTTA_BUTTON.get(), Blocks.LIGHT_GRAY_TERRACOTTA);
        modWallBlock("light_gray_terracotta_wall", ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get(), Blocks.LIGHT_GRAY_TERRACOTTA);

        modStairsBlock("cyan_terracotta_stairs", ModBlocks.CYAN_TERRACOTTA_STAIRS.get(), Blocks.CYAN_TERRACOTTA);
        modSlabBlock("cyan_terracotta_slab", ModBlocks.CYAN_TERRACOTTA_SLAB.get(), Blocks.CYAN_TERRACOTTA);
        modFenceBlock("cyan_terracotta_fence", ModBlocks.CYAN_TERRACOTTA_FENCE.get(), Blocks.CYAN_TERRACOTTA);
        modFenceGateBlock("cyan_terracotta_fence_gate", ModBlocks.CYAN_TERRACOTTA_FENCE_GATE.get(), Blocks.CYAN_TERRACOTTA);
        modPressurePlateBlock("cyan_terracotta_pressure_plate", ModBlocks.CYAN_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.CYAN_TERRACOTTA);
        modButtonBlock("cyan_terracotta_button", ModBlocks.CYAN_TERRACOTTA_BUTTON.get(), Blocks.CYAN_TERRACOTTA);
        modWallBlock("cyan_terracotta_wall", ModBlocks.CYAN_TERRACOTTA_WALL.get(), Blocks.CYAN_TERRACOTTA);

        modStairsBlock("purple_terracotta_stairs", ModBlocks.PURPLE_TERRACOTTA_STAIRS.get(), Blocks.PURPLE_TERRACOTTA);
        modSlabBlock("purple_terracotta_slab", ModBlocks.PURPLE_TERRACOTTA_SLAB.get(), Blocks.PURPLE_TERRACOTTA);
        modFenceBlock("purple_terracotta_fence", ModBlocks.PURPLE_TERRACOTTA_FENCE.get(), Blocks.PURPLE_TERRACOTTA);
        modFenceGateBlock("purple_terracotta_fence_gate", ModBlocks.PURPLE_TERRACOTTA_FENCE_GATE.get(), Blocks.PURPLE_TERRACOTTA);
        modPressurePlateBlock("purple_terracotta_pressure_plate", ModBlocks.PURPLE_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.PURPLE_TERRACOTTA);
        modButtonBlock("purple_terracotta_button", ModBlocks.PURPLE_TERRACOTTA_BUTTON.get(), Blocks.PURPLE_TERRACOTTA);
        modWallBlock("purple_terracotta_wall", ModBlocks.PURPLE_TERRACOTTA_WALL.get(), Blocks.PURPLE_TERRACOTTA);

        modStairsBlock("blue_terracotta_stairs", ModBlocks.BLUE_TERRACOTTA_STAIRS.get(), Blocks.BLUE_TERRACOTTA);
        modSlabBlock("blue_terracotta_slab", ModBlocks.BLUE_TERRACOTTA_SLAB.get(), Blocks.BLUE_TERRACOTTA);
        modFenceBlock("blue_terracotta_fence", ModBlocks.BLUE_TERRACOTTA_FENCE.get(), Blocks.BLUE_TERRACOTTA);
        modFenceGateBlock("blue_terracotta_fence_gate", ModBlocks.BLUE_TERRACOTTA_FENCE_GATE.get(), Blocks.BLUE_TERRACOTTA);
        modPressurePlateBlock("blue_terracotta_pressure_plate", ModBlocks.BLUE_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.BLUE_TERRACOTTA);
        modButtonBlock("blue_terracotta_button", ModBlocks.BLUE_TERRACOTTA_BUTTON.get(), Blocks.BLUE_TERRACOTTA);
        modWallBlock("blue_terracotta_wall", ModBlocks.BLUE_TERRACOTTA_WALL.get(), Blocks.BLUE_TERRACOTTA);

        modStairsBlock("brown_terracotta_stairs", ModBlocks.BROWN_TERRACOTTA_STAIRS.get(), Blocks.BROWN_TERRACOTTA);
        modSlabBlock("brown_terracotta_slab", ModBlocks.BROWN_TERRACOTTA_SLAB.get(), Blocks.BROWN_TERRACOTTA);
        modFenceBlock("brown_terracotta_fence", ModBlocks.BROWN_TERRACOTTA_FENCE.get(), Blocks.BROWN_TERRACOTTA);
        modFenceGateBlock("brown_terracotta_fence_gate", ModBlocks.BROWN_TERRACOTTA_FENCE_GATE.get(), Blocks.BROWN_TERRACOTTA);
        modPressurePlateBlock("brown_terracotta_pressure_plate", ModBlocks.BROWN_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.BROWN_TERRACOTTA);
        modButtonBlock("brown_terracotta_button", ModBlocks.BROWN_TERRACOTTA_BUTTON.get(), Blocks.BROWN_TERRACOTTA);
        modWallBlock("brown_terracotta_wall", ModBlocks.BROWN_TERRACOTTA_WALL.get(), Blocks.BROWN_TERRACOTTA);

        modStairsBlock("green_terracotta_stairs", ModBlocks.GREEN_TERRACOTTA_STAIRS.get(), Blocks.GREEN_TERRACOTTA);
        modSlabBlock("green_terracotta_slab", ModBlocks.GREEN_TERRACOTTA_SLAB.get(), Blocks.GREEN_TERRACOTTA);
        modFenceBlock("green_terracotta_fence", ModBlocks.GREEN_TERRACOTTA_FENCE.get(), Blocks.GREEN_TERRACOTTA);
        modFenceGateBlock("green_terracotta_fence_gate", ModBlocks.GREEN_TERRACOTTA_FENCE_GATE.get(), Blocks.GREEN_TERRACOTTA);
        modPressurePlateBlock("green_terracotta_pressure_plate", ModBlocks.GREEN_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.GREEN_TERRACOTTA);
        modButtonBlock("green_terracotta_button", ModBlocks.GREEN_TERRACOTTA_BUTTON.get(), Blocks.GREEN_TERRACOTTA);
        modWallBlock("green_terracotta_wall", ModBlocks.GREEN_TERRACOTTA_WALL.get(), Blocks.GREEN_TERRACOTTA);

        modStairsBlock("red_terracotta_stairs", ModBlocks.RED_TERRACOTTA_STAIRS.get(), Blocks.RED_TERRACOTTA);
        modSlabBlock("red_terracotta_slab", ModBlocks.RED_TERRACOTTA_SLAB.get(), Blocks.RED_TERRACOTTA);
        modFenceBlock("red_terracotta_fence", ModBlocks.RED_TERRACOTTA_FENCE.get(), Blocks.RED_TERRACOTTA);
        modFenceGateBlock("red_terracotta_fence_gate", ModBlocks.RED_TERRACOTTA_FENCE_GATE.get(), Blocks.RED_TERRACOTTA);
        modPressurePlateBlock("red_terracotta_pressure_plate", ModBlocks.RED_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.RED_TERRACOTTA);
        modButtonBlock("red_terracotta_button", ModBlocks.RED_TERRACOTTA_BUTTON.get(), Blocks.RED_TERRACOTTA);
        modWallBlock("red_terracotta_wall", ModBlocks.RED_TERRACOTTA_WALL.get(), Blocks.RED_TERRACOTTA);

        modStairsBlock("black_terracotta_stairs", ModBlocks.BLACK_TERRACOTTA_STAIRS.get(), Blocks.BLACK_TERRACOTTA);
        modSlabBlock("black_terracotta_slab", ModBlocks.BLACK_TERRACOTTA_SLAB.get(), Blocks.BLACK_TERRACOTTA);
        modFenceBlock("black_terracotta_fence", ModBlocks.BLACK_TERRACOTTA_FENCE.get(), Blocks.BLACK_TERRACOTTA);
        modFenceGateBlock("black_terracotta_fence_gate", ModBlocks.BLACK_TERRACOTTA_FENCE_GATE.get(), Blocks.BLACK_TERRACOTTA);
        modPressurePlateBlock("black_terracotta_pressure_plate", ModBlocks.BLACK_TERRACOTTA_PRESSURE_PLATE.get(), Blocks.BLACK_TERRACOTTA);
        modButtonBlock("black_terracotta_button", ModBlocks.BLACK_TERRACOTTA_BUTTON.get(), Blocks.BLACK_TERRACOTTA);
        modWallBlock("black_terracotta_wall", ModBlocks.BLACK_TERRACOTTA_WALL.get(), Blocks.BLACK_TERRACOTTA);

        modStairsBlock("terracotta_stairs", ModBlocks.TERRACOTTA_STAIRS.get(), Blocks.TERRACOTTA);
        modSlabBlock("terracotta_slab", ModBlocks.TERRACOTTA_SLAB.get(), Blocks.TERRACOTTA);
        modFenceBlock("terracotta_fence", ModBlocks.TERRACOTTA_FENCE.get(), Blocks.TERRACOTTA);
        modFenceGateBlock("terracotta_fence_gate", ModBlocks.TERRACOTTA_FENCE_GATE.get(), Blocks.TERRACOTTA);
        modPressurePlateBlock("terracotta_pressure_plate", ModBlocks.TERRACOTTA_PRESSURE_PLATE.get(), Blocks.TERRACOTTA);
        modButtonBlock("terracotta_button", ModBlocks.TERRACOTTA_BUTTON.get(), Blocks.TERRACOTTA);
        modWallBlock("terracotta_wall", ModBlocks.TERRACOTTA_WALL.get(), Blocks.TERRACOTTA);

        modStairsBlock("prismarine_stairs", ModBlocks.PRISMARINE_STAIRS.get(), Blocks.PRISMARINE);
        modSlabBlock("prismarine_slab", ModBlocks.PRISMARINE_SLAB.get(), Blocks.PRISMARINE);
        modFenceBlock("prismarine_fence", ModBlocks.PRISMARINE_FENCE.get(), Blocks.PRISMARINE);
        modFenceGateBlock("prismarine_fence_gate", ModBlocks.PRISMARINE_FENCE_GATE.get(), Blocks.PRISMARINE);
        modPressurePlateBlock("prismarine_pressure_plate", ModBlocks.PRISMARINE_PRESSURE_PLATE.get(), Blocks.PRISMARINE);
        modButtonBlock("prismarine_button", ModBlocks.PRISMARINE_BUTTON.get(), Blocks.PRISMARINE);
        modWallBlock("prismarine_wall", ModBlocks.PRISMARINE_WALL.get(), Blocks.PRISMARINE);

        modStairsBlock("prismarine_bricks_stairs", ModBlocks.PRISMARINE_BRICKS_STAIRS.get(), Blocks.PRISMARINE_BRICKS);
        modSlabBlock("prismarine_bricks_slab", ModBlocks.PRISMARINE_BRICKS_SLAB.get(), Blocks.PRISMARINE_BRICKS);
        modFenceBlock("prismarine_bricks_fence", ModBlocks.PRISMARINE_BRICKS_FENCE.get(), Blocks.PRISMARINE_BRICKS);
        modFenceGateBlock("prismarine_bricks_fence_gate", ModBlocks.PRISMARINE_BRICKS_FENCE_GATE.get(), Blocks.PRISMARINE_BRICKS);
        modPressurePlateBlock("prismarine_bricks_pressure_plate", ModBlocks.PRISMARINE_BRICKS_PRESSURE_PLATE.get(), Blocks.PRISMARINE_BRICKS);
        modButtonBlock("prismarine_bricks_button", ModBlocks.PRISMARINE_BRICKS_BUTTON.get(), Blocks.PRISMARINE_BRICKS);
        modWallBlock("prismarine_bricks_wall", ModBlocks.PRISMARINE_BRICKS_WALL.get(), Blocks.PRISMARINE_BRICKS);

        modStairsBlock("dark_prismarine_stairs", ModBlocks.DARK_PRISMARINE_STAIRS.get(), Blocks.DARK_PRISMARINE);
        modSlabBlock("dark_prismarine_slab", ModBlocks.DARK_PRISMARINE_SLAB.get(), Blocks.DARK_PRISMARINE);
        modFenceBlock("dark_prismarine_fence", ModBlocks.DARK_PRISMARINE_FENCE.get(), Blocks.DARK_PRISMARINE);
        modFenceGateBlock("dark_prismarine_fence_gate", ModBlocks.DARK_PRISMARINE_FENCE_GATE.get(), Blocks.DARK_PRISMARINE);
        modPressurePlateBlock("dark_prismarine_pressure_plate", ModBlocks.DARK_PRISMARINE_PRESSURE_PLATE.get(), Blocks.DARK_PRISMARINE);
        modButtonBlock("dark_prismarine_button", ModBlocks.DARK_PRISMARINE_BUTTON.get(), Blocks.DARK_PRISMARINE);
        modWallBlock("dark_prismarine_wall", ModBlocks.DARK_PRISMARINE_WALL.get(), Blocks.DARK_PRISMARINE);

        modStairsBlock("nether_wart_block_stairs", ModBlocks.NETHER_WART_BLOCK_STAIRS.get(), Blocks.NETHER_WART_BLOCK);
        modSlabBlock("nether_wart_block_slab", ModBlocks.NETHER_WART_BLOCK_SLAB.get(), Blocks.NETHER_WART_BLOCK);
        modFenceBlock("nether_wart_block_fence", ModBlocks.NETHER_WART_BLOCK_FENCE.get(), Blocks.NETHER_WART_BLOCK);
        modFenceGateBlock("nether_wart_block_fence_gate", ModBlocks.NETHER_WART_BLOCK_FENCE_GATE.get(), Blocks.NETHER_WART_BLOCK);
        modPressurePlateBlock("nether_wart_block_pressure_plate", ModBlocks.NETHER_WART_BLOCK_PRESSURE_PLATE.get(), Blocks.NETHER_WART_BLOCK);
        modButtonBlock("nether_wart_block_button", ModBlocks.NETHER_WART_BLOCK_BUTTON.get(), Blocks.NETHER_WART_BLOCK);
        modWallBlock("nether_wart_block_wall", ModBlocks.NETHER_WART_BLOCK_WALL.get(), Blocks.NETHER_WART_BLOCK);

        modStairsBlock("warped_wart_block_stairs", ModBlocks.WARPED_WART_BLOCK_STAIRS.get(), Blocks.WARPED_WART_BLOCK);
        modSlabBlock("warped_wart_block_slab", ModBlocks.WARPED_WART_BLOCK_SLAB.get(), Blocks.WARPED_WART_BLOCK);
        modFenceBlock("warped_wart_block_fence", ModBlocks.WARPED_WART_BLOCK_FENCE.get(), Blocks.WARPED_WART_BLOCK);
        modFenceGateBlock("warped_wart_block_fence_gate", ModBlocks.WARPED_WART_BLOCK_FENCE_GATE.get(), Blocks.WARPED_WART_BLOCK);
        modPressurePlateBlock("warped_wart_block_pressure_plate", ModBlocks.WARPED_WART_BLOCK_PRESSURE_PLATE.get(), Blocks.WARPED_WART_BLOCK);
        modButtonBlock("warped_wart_block_button", ModBlocks.WARPED_WART_BLOCK_BUTTON.get(), Blocks.WARPED_WART_BLOCK);
        modWallBlock("warped_wart_block_wall", ModBlocks.WARPED_WART_BLOCK_WALL.get(), Blocks.WARPED_WART_BLOCK);

        modStairsBlock("red_nether_bricks_stairs", ModBlocks.RED_NETHER_BRICKS_STAIRS.get(), Blocks.RED_NETHER_BRICKS);
        modSlabBlock("red_nether_bricks_slab", ModBlocks.RED_NETHER_BRICKS_SLAB.get(), Blocks.RED_NETHER_BRICKS);
        modFenceBlock("red_nether_bricks_fence", ModBlocks.RED_NETHER_BRICKS_FENCE.get(), Blocks.RED_NETHER_BRICKS);
        modFenceGateBlock("red_nether_bricks_fence_gate", ModBlocks.RED_NETHER_BRICKS_FENCE_GATE.get(), Blocks.RED_NETHER_BRICKS);
        modPressurePlateBlock("red_nether_bricks_pressure_plate", ModBlocks.RED_NETHER_BRICKS_PRESSURE_PLATE.get(), Blocks.RED_NETHER_BRICKS);
        modButtonBlock("red_nether_bricks_button", ModBlocks.RED_NETHER_BRICKS_BUTTON.get(), Blocks.RED_NETHER_BRICKS);
        modWallBlock("red_nether_bricks_wall", ModBlocks.RED_NETHER_BRICKS_WALL.get(), Blocks.RED_NETHER_BRICKS);

        modStairsBlock("white_concrete_stairs", ModBlocks.WHITE_CONCRETE_STAIRS.get(), Blocks.WHITE_CONCRETE);
        modSlabBlock("white_concrete_slab", ModBlocks.WHITE_CONCRETE_SLAB.get(), Blocks.WHITE_CONCRETE);
        modFenceBlock("white_concrete_fence", ModBlocks.WHITE_CONCRETE_FENCE.get(), Blocks.WHITE_CONCRETE);
        modFenceGateBlock("white_concrete_fence_gate", ModBlocks.WHITE_CONCRETE_FENCE_GATE.get(), Blocks.WHITE_CONCRETE);
        modPressurePlateBlock("white_concrete_pressure_plate", ModBlocks.WHITE_CONCRETE_PRESSURE_PLATE.get(), Blocks.WHITE_CONCRETE);
        modButtonBlock("white_concrete_button", ModBlocks.WHITE_CONCRETE_BUTTON.get(), Blocks.WHITE_CONCRETE);
        modWallBlock("white_concrete_wall", ModBlocks.WHITE_CONCRETE_WALL.get(), Blocks.WHITE_CONCRETE);

        modStairsBlock("orange_concrete_stairs", ModBlocks.ORANGE_CONCRETE_STAIRS.get(), Blocks.ORANGE_CONCRETE);
        modSlabBlock("orange_concrete_slab", ModBlocks.ORANGE_CONCRETE_SLAB.get(), Blocks.ORANGE_CONCRETE);
        modFenceBlock("orange_concrete_fence", ModBlocks.ORANGE_CONCRETE_FENCE.get(), Blocks.ORANGE_CONCRETE);
        modFenceGateBlock("orange_concrete_fence_gate", ModBlocks.ORANGE_CONCRETE_FENCE_GATE.get(), Blocks.ORANGE_CONCRETE);
        modPressurePlateBlock("orange_concrete_pressure_plate", ModBlocks.ORANGE_CONCRETE_PRESSURE_PLATE.get(), Blocks.ORANGE_CONCRETE);
        modButtonBlock("orange_concrete_button", ModBlocks.ORANGE_CONCRETE_BUTTON.get(), Blocks.ORANGE_CONCRETE);
        modWallBlock("orange_concrete_wall", ModBlocks.ORANGE_CONCRETE_WALL.get(), Blocks.ORANGE_CONCRETE);

        modStairsBlock("magenta_concrete_stairs", ModBlocks.MAGENTA_CONCRETE_STAIRS.get(), Blocks.MAGENTA_CONCRETE);
        modSlabBlock("magenta_concrete_slab", ModBlocks.MAGENTA_CONCRETE_SLAB.get(), Blocks.MAGENTA_CONCRETE);
        modFenceBlock("magenta_concrete_fence", ModBlocks.MAGENTA_CONCRETE_FENCE.get(), Blocks.MAGENTA_CONCRETE);
        modFenceGateBlock("magenta_concrete_fence_gate", ModBlocks.MAGENTA_CONCRETE_FENCE_GATE.get(), Blocks.MAGENTA_CONCRETE);
        modPressurePlateBlock("magenta_concrete_pressure_plate", ModBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE.get(), Blocks.MAGENTA_CONCRETE);
        modButtonBlock("magenta_concrete_button", ModBlocks.MAGENTA_CONCRETE_BUTTON.get(), Blocks.MAGENTA_CONCRETE);
        modWallBlock("magenta_concrete_wall", ModBlocks.MAGENTA_CONCRETE_WALL.get(), Blocks.MAGENTA_CONCRETE);

        modStairsBlock("light_blue_concrete_stairs", ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get(), Blocks.LIGHT_BLUE_CONCRETE);
        modSlabBlock("light_blue_concrete_slab", ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), Blocks.LIGHT_BLUE_CONCRETE);
        modFenceBlock("light_blue_concrete_fence", ModBlocks.LIGHT_BLUE_CONCRETE_FENCE.get(), Blocks.LIGHT_BLUE_CONCRETE);
        modFenceGateBlock("light_blue_concrete_fence_gate", ModBlocks.LIGHT_BLUE_CONCRETE_FENCE_GATE.get(), Blocks.LIGHT_BLUE_CONCRETE);
        modPressurePlateBlock("light_blue_concrete_pressure_plate", ModBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE.get(), Blocks.LIGHT_BLUE_CONCRETE);
        modButtonBlock("light_blue_concrete_button", ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON.get(), Blocks.LIGHT_BLUE_CONCRETE);
        modWallBlock("light_blue_concrete_wall", ModBlocks.LIGHT_BLUE_CONCRETE_WALL.get(), Blocks.LIGHT_BLUE_CONCRETE);

        modStairsBlock("yellow_concrete_stairs", ModBlocks.YELLOW_CONCRETE_STAIRS.get(), Blocks.YELLOW_CONCRETE);
        modSlabBlock("yellow_concrete_slab", ModBlocks.YELLOW_CONCRETE_SLAB.get(), Blocks.YELLOW_CONCRETE);
        modFenceBlock("yellow_concrete_fence", ModBlocks.YELLOW_CONCRETE_FENCE.get(), Blocks.YELLOW_CONCRETE);
        modFenceGateBlock("yellow_concrete_fence_gate", ModBlocks.YELLOW_CONCRETE_FENCE_GATE.get(), Blocks.YELLOW_CONCRETE);
        modPressurePlateBlock("yellow_concrete_pressure_plate", ModBlocks.YELLOW_CONCRETE_PRESSURE_PLATE.get(), Blocks.YELLOW_CONCRETE);
        modButtonBlock("yellow_concrete_button", ModBlocks.YELLOW_CONCRETE_BUTTON.get(), Blocks.YELLOW_CONCRETE);
        modWallBlock("yellow_concrete_wall", ModBlocks.YELLOW_CONCRETE_WALL.get(), Blocks.YELLOW_CONCRETE);

        modStairsBlock("lime_concrete_stairs", ModBlocks.LIME_CONCRETE_STAIRS.get(), Blocks.LIME_CONCRETE);
        modSlabBlock("lime_concrete_slab", ModBlocks.LIME_CONCRETE_SLAB.get(), Blocks.LIME_CONCRETE);
        modFenceBlock("lime_concrete_fence", ModBlocks.LIME_CONCRETE_FENCE.get(), Blocks.LIME_CONCRETE);
        modFenceGateBlock("lime_concrete_fence_gate", ModBlocks.LIME_CONCRETE_FENCE_GATE.get(), Blocks.LIME_CONCRETE);
        modPressurePlateBlock("lime_concrete_pressure_plate", ModBlocks.LIME_CONCRETE_PRESSURE_PLATE.get(), Blocks.LIME_CONCRETE);
        modButtonBlock("lime_concrete_button", ModBlocks.LIME_CONCRETE_BUTTON.get(), Blocks.LIME_CONCRETE);
        modWallBlock("lime_concrete_wall", ModBlocks.LIME_CONCRETE_WALL.get(), Blocks.LIME_CONCRETE);

        modStairsBlock("pink_concrete_stairs", ModBlocks.PINK_CONCRETE_STAIRS.get(), Blocks.PINK_CONCRETE);
        modSlabBlock("pink_concrete_slab", ModBlocks.PINK_CONCRETE_SLAB.get(), Blocks.PINK_CONCRETE);
        modFenceBlock("pink_concrete_fence", ModBlocks.PINK_CONCRETE_FENCE.get(), Blocks.PINK_CONCRETE);
        modFenceGateBlock("pink_concrete_fence_gate", ModBlocks.PINK_CONCRETE_FENCE_GATE.get(), Blocks.PINK_CONCRETE);
        modPressurePlateBlock("pink_concrete_pressure_plate", ModBlocks.PINK_CONCRETE_PRESSURE_PLATE.get(), Blocks.PINK_CONCRETE);
        modButtonBlock("pink_concrete_button", ModBlocks.PINK_CONCRETE_BUTTON.get(), Blocks.PINK_CONCRETE);
        modWallBlock("pink_concrete_wall", ModBlocks.PINK_CONCRETE_WALL.get(), Blocks.PINK_CONCRETE);

        modStairsBlock("gray_concrete_stairs", ModBlocks.GRAY_CONCRETE_STAIRS.get(), Blocks.GRAY_CONCRETE);
        modSlabBlock("gray_concrete_slab", ModBlocks.GRAY_CONCRETE_SLAB.get(), Blocks.GRAY_CONCRETE);
        modFenceBlock("gray_concrete_fence", ModBlocks.GRAY_CONCRETE_FENCE.get(), Blocks.GRAY_CONCRETE);
        modFenceGateBlock("gray_concrete_fence_gate", ModBlocks.GRAY_CONCRETE_FENCE_GATE.get(), Blocks.GRAY_CONCRETE);
        modPressurePlateBlock("gray_concrete_pressure_plate", ModBlocks.GRAY_CONCRETE_PRESSURE_PLATE.get(), Blocks.GRAY_CONCRETE);
        modButtonBlock("gray_concrete_button", ModBlocks.GRAY_CONCRETE_BUTTON.get(), Blocks.GRAY_CONCRETE);
        modWallBlock("gray_concrete_wall", ModBlocks.GRAY_CONCRETE_WALL.get(), Blocks.GRAY_CONCRETE);

        modStairsBlock("light_gray_concrete_stairs", ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get(), Blocks.LIGHT_GRAY_CONCRETE);
        modSlabBlock("light_gray_concrete_slab", ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), Blocks.LIGHT_GRAY_CONCRETE);
        modFenceBlock("light_gray_concrete_fence", ModBlocks.LIGHT_GRAY_CONCRETE_FENCE.get(), Blocks.LIGHT_GRAY_CONCRETE);
        modFenceGateBlock("light_gray_concrete_fence_gate", ModBlocks.LIGHT_GRAY_CONCRETE_FENCE_GATE.get(), Blocks.LIGHT_GRAY_CONCRETE);
        modPressurePlateBlock("light_gray_concrete_pressure_plate", ModBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE.get(), Blocks.LIGHT_GRAY_CONCRETE);
        modButtonBlock("light_gray_concrete_button", ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON.get(), Blocks.LIGHT_GRAY_CONCRETE);
        modWallBlock("light_gray_concrete_wall", ModBlocks.LIGHT_GRAY_CONCRETE_WALL.get(), Blocks.LIGHT_GRAY_CONCRETE);

        modStairsBlock("cyan_concrete_stairs", ModBlocks.CYAN_CONCRETE_STAIRS.get(), Blocks.CYAN_CONCRETE);
        modSlabBlock("cyan_concrete_slab", ModBlocks.CYAN_CONCRETE_SLAB.get(), Blocks.CYAN_CONCRETE);
        modFenceBlock("cyan_concrete_fence", ModBlocks.CYAN_CONCRETE_FENCE.get(), Blocks.CYAN_CONCRETE);
        modFenceGateBlock("cyan_concrete_fence_gate", ModBlocks.CYAN_CONCRETE_FENCE_GATE.get(), Blocks.CYAN_CONCRETE);
        modPressurePlateBlock("cyan_concrete_pressure_plate", ModBlocks.CYAN_CONCRETE_PRESSURE_PLATE.get(), Blocks.CYAN_CONCRETE);
        modButtonBlock("cyan_concrete_button", ModBlocks.CYAN_CONCRETE_BUTTON.get(), Blocks.CYAN_CONCRETE);
        modWallBlock("cyan_concrete_wall", ModBlocks.CYAN_CONCRETE_WALL.get(), Blocks.CYAN_CONCRETE);

        modStairsBlock("purple_concrete_stairs", ModBlocks.PURPLE_CONCRETE_STAIRS.get(), Blocks.PURPLE_CONCRETE);
        modSlabBlock("purple_concrete_slab", ModBlocks.PURPLE_CONCRETE_SLAB.get(), Blocks.PURPLE_CONCRETE);
        modFenceBlock("purple_concrete_fence", ModBlocks.PURPLE_CONCRETE_FENCE.get(), Blocks.PURPLE_CONCRETE);
        modFenceGateBlock("purple_concrete_fence_gate", ModBlocks.PURPLE_CONCRETE_FENCE_GATE.get(), Blocks.PURPLE_CONCRETE);
        modPressurePlateBlock("purple_concrete_pressure_plate", ModBlocks.PURPLE_CONCRETE_PRESSURE_PLATE.get(), Blocks.PURPLE_CONCRETE);
        modButtonBlock("purple_concrete_button", ModBlocks.PURPLE_CONCRETE_BUTTON.get(), Blocks.PURPLE_CONCRETE);
        modWallBlock("purple_concrete_wall", ModBlocks.PURPLE_CONCRETE_WALL.get(), Blocks.PURPLE_CONCRETE);

        modStairsBlock("blue_concrete_stairs", ModBlocks.BLUE_CONCRETE_STAIRS.get(), Blocks.BLUE_CONCRETE);
        modSlabBlock("blue_concrete_slab", ModBlocks.BLUE_CONCRETE_SLAB.get(), Blocks.BLUE_CONCRETE);
        modFenceBlock("blue_concrete_fence", ModBlocks.BLUE_CONCRETE_FENCE.get(), Blocks.BLUE_CONCRETE);
        modFenceGateBlock("blue_concrete_fence_gate", ModBlocks.BLUE_CONCRETE_FENCE_GATE.get(), Blocks.BLUE_CONCRETE);
        modPressurePlateBlock("blue_concrete_pressure_plate", ModBlocks.BLUE_CONCRETE_PRESSURE_PLATE.get(), Blocks.BLUE_CONCRETE);
        modButtonBlock("blue_concrete_button", ModBlocks.BLUE_CONCRETE_BUTTON.get(), Blocks.BLUE_CONCRETE);
        modWallBlock("blue_concrete_wall", ModBlocks.BLUE_CONCRETE_WALL.get(), Blocks.BLUE_CONCRETE);

        modStairsBlock("brown_concrete_stairs", ModBlocks.BROWN_CONCRETE_STAIRS.get(), Blocks.BROWN_CONCRETE);
        modSlabBlock("brown_concrete_slab", ModBlocks.BROWN_CONCRETE_SLAB.get(), Blocks.BROWN_CONCRETE);
        modFenceBlock("brown_concrete_fence", ModBlocks.BROWN_CONCRETE_FENCE.get(), Blocks.BROWN_CONCRETE);
        modFenceGateBlock("brown_concrete_fence_gate", ModBlocks.BROWN_CONCRETE_FENCE_GATE.get(), Blocks.BROWN_CONCRETE);
        modPressurePlateBlock("brown_concrete_pressure_plate", ModBlocks.BROWN_CONCRETE_PRESSURE_PLATE.get(), Blocks.BROWN_CONCRETE);
        modButtonBlock("brown_concrete_button", ModBlocks.BROWN_CONCRETE_BUTTON.get(), Blocks.BROWN_CONCRETE);
        modWallBlock("brown_concrete_wall", ModBlocks.BROWN_CONCRETE_WALL.get(), Blocks.BROWN_CONCRETE);

        modStairsBlock("green_concrete_stairs", ModBlocks.GREEN_CONCRETE_STAIRS.get(), Blocks.GREEN_CONCRETE);
        modSlabBlock("green_concrete_slab", ModBlocks.GREEN_CONCRETE_SLAB.get(), Blocks.GREEN_CONCRETE);
        modFenceBlock("green_concrete_fence", ModBlocks.GREEN_CONCRETE_FENCE.get(), Blocks.GREEN_CONCRETE);
        modFenceGateBlock("green_concrete_fence_gate", ModBlocks.GREEN_CONCRETE_FENCE_GATE.get(), Blocks.GREEN_CONCRETE);
        modPressurePlateBlock("green_concrete_pressure_plate", ModBlocks.GREEN_CONCRETE_PRESSURE_PLATE.get(), Blocks.GREEN_CONCRETE);
        modButtonBlock("green_concrete_button", ModBlocks.GREEN_CONCRETE_BUTTON.get(), Blocks.GREEN_CONCRETE);
        modWallBlock("green_concrete_wall", ModBlocks.GREEN_CONCRETE_WALL.get(), Blocks.GREEN_CONCRETE);

        modStairsBlock("red_concrete_stairs", ModBlocks.RED_CONCRETE_STAIRS.get(), Blocks.RED_CONCRETE);
        modSlabBlock("red_concrete_slab", ModBlocks.RED_CONCRETE_SLAB.get(), Blocks.RED_CONCRETE);
        modFenceBlock("red_concrete_fence", ModBlocks.RED_CONCRETE_FENCE.get(), Blocks.RED_CONCRETE);
        modFenceGateBlock("red_concrete_fence_gate", ModBlocks.RED_CONCRETE_FENCE_GATE.get(), Blocks.RED_CONCRETE);
        modPressurePlateBlock("red_concrete_pressure_plate", ModBlocks.RED_CONCRETE_PRESSURE_PLATE.get(), Blocks.RED_CONCRETE);
        modButtonBlock("red_concrete_button", ModBlocks.RED_CONCRETE_BUTTON.get(), Blocks.RED_CONCRETE);
        modWallBlock("red_concrete_wall", ModBlocks.RED_CONCRETE_WALL.get(), Blocks.RED_CONCRETE);

        modStairsBlock("black_concrete_stairs", ModBlocks.BLACK_CONCRETE_STAIRS.get(), Blocks.BLACK_CONCRETE);
        modSlabBlock("black_concrete_slab", ModBlocks.BLACK_CONCRETE_SLAB.get(), Blocks.BLACK_CONCRETE);
        modFenceBlock("black_concrete_fence", ModBlocks.BLACK_CONCRETE_FENCE.get(), Blocks.BLACK_CONCRETE);
        modFenceGateBlock("black_concrete_fence_gate", ModBlocks.BLACK_CONCRETE_FENCE_GATE.get(), Blocks.BLACK_CONCRETE);
        modPressurePlateBlock("black_concrete_pressure_plate", ModBlocks.BLACK_CONCRETE_PRESSURE_PLATE.get(), Blocks.BLACK_CONCRETE);
        modButtonBlock("black_concrete_button", ModBlocks.BLACK_CONCRETE_BUTTON.get(), Blocks.BLACK_CONCRETE);
        modWallBlock("black_concrete_wall", ModBlocks.BLACK_CONCRETE_WALL.get(), Blocks.BLACK_CONCRETE);

        modStairsBlock("honeycomb_block_stairs", ModBlocks.HONEYCOMB_BLOCK_STAIRS.get(), Blocks.HONEYCOMB_BLOCK);
        modSlabBlock("honeycomb_block_slab", ModBlocks.HONEYCOMB_BLOCK_SLAB.get(), Blocks.HONEYCOMB_BLOCK);
        modFenceBlock("honeycomb_block_fence", ModBlocks.HONEYCOMB_BLOCK_FENCE.get(), Blocks.HONEYCOMB_BLOCK);
        modFenceGateBlock("honeycomb_block_fence_gate", ModBlocks.HONEYCOMB_BLOCK_FENCE_GATE.get(), Blocks.HONEYCOMB_BLOCK);
        modPressurePlateBlock("honeycomb_block_pressure_plate", ModBlocks.HONEYCOMB_BLOCK_PRESSURE_PLATE.get(), Blocks.HONEYCOMB_BLOCK);
        modButtonBlock("honeycomb_block_button", ModBlocks.HONEYCOMB_BLOCK_BUTTON.get(), Blocks.HONEYCOMB_BLOCK);
        modWallBlock("honeycomb_block_wall", ModBlocks.HONEYCOMB_BLOCK_WALL.get(), Blocks.HONEYCOMB_BLOCK);

        modStairsBlock("crying_obsidian_stairs", ModBlocks.CRYING_OBSIDIAN_STAIRS.get(), Blocks.CRYING_OBSIDIAN);
        modSlabBlock("crying_obsidian_slab", ModBlocks.CRYING_OBSIDIAN_SLAB.get(), Blocks.CRYING_OBSIDIAN);
        modFenceBlock("crying_obsidian_fence", ModBlocks.CRYING_OBSIDIAN_FENCE.get(), Blocks.CRYING_OBSIDIAN);
        modFenceGateBlock("crying_obsidian_fence_gate", ModBlocks.CRYING_OBSIDIAN_FENCE_GATE.get(), Blocks.CRYING_OBSIDIAN);
        modPressurePlateBlock("crying_obsidian_pressure_plate", ModBlocks.CRYING_OBSIDIAN_PRESSURE_PLATE.get(), Blocks.CRYING_OBSIDIAN);
        modButtonBlock("crying_obsidian_button", ModBlocks.CRYING_OBSIDIAN_BUTTON.get(), Blocks.CRYING_OBSIDIAN);
        modWallBlock("crying_obsidian_wall", ModBlocks.CRYING_OBSIDIAN_WALL.get(), Blocks.CRYING_OBSIDIAN);

        modStairsBlock("blackstone_stairs", ModBlocks.BLACKSTONE_STAIRS.get(), Blocks.BLACKSTONE);
        modSlabBlock("blackstone_slab", ModBlocks.BLACKSTONE_SLAB.get(), Blocks.BLACKSTONE);
        modFenceBlock("blackstone_fence", ModBlocks.BLACKSTONE_FENCE.get(), Blocks.BLACKSTONE);
        modFenceGateBlock("blackstone_fence_gate", ModBlocks.BLACKSTONE_FENCE_GATE.get(), Blocks.BLACKSTONE);
        modPressurePlateBlock("blackstone_pressure_plate", ModBlocks.BLACKSTONE_PRESSURE_PLATE.get(), Blocks.BLACKSTONE);
        modButtonBlock("blackstone_button", ModBlocks.BLACKSTONE_BUTTON.get(), Blocks.BLACKSTONE);
        modWallBlock("blackstone_wall", ModBlocks.BLACKSTONE_WALL.get(), Blocks.BLACKSTONE);

        modStairsBlock("gilded_blackstone_stairs", ModBlocks.GILDED_BLACKSTONE_STAIRS.get(), Blocks.GILDED_BLACKSTONE);
        modSlabBlock("gilded_blackstone_slab", ModBlocks.GILDED_BLACKSTONE_SLAB.get(), Blocks.GILDED_BLACKSTONE);
        modFenceBlock("gilded_blackstone_fence", ModBlocks.GILDED_BLACKSTONE_FENCE.get(), Blocks.GILDED_BLACKSTONE);
        modFenceGateBlock("gilded_blackstone_fence_gate", ModBlocks.GILDED_BLACKSTONE_FENCE_GATE.get(), Blocks.GILDED_BLACKSTONE);
        modPressurePlateBlock("gilded_blackstone_pressure_plate", ModBlocks.GILDED_BLACKSTONE_PRESSURE_PLATE.get(), Blocks.GILDED_BLACKSTONE);
        modButtonBlock("gilded_blackstone_button", ModBlocks.GILDED_BLACKSTONE_BUTTON.get(), Blocks.GILDED_BLACKSTONE);
        modWallBlock("gilded_blackstone_wall", ModBlocks.GILDED_BLACKSTONE_WALL.get(), Blocks.GILDED_BLACKSTONE);

        modStairsBlock("polished_blackstone_stairs", ModBlocks.POLISHED_BLACKSTONE_STAIRS.get(), Blocks.POLISHED_BLACKSTONE);
        modSlabBlock("polished_blackstone_slab", ModBlocks.POLISHED_BLACKSTONE_SLAB.get(), Blocks.POLISHED_BLACKSTONE);
        modFenceBlock("polished_blackstone_fence", ModBlocks.POLISHED_BLACKSTONE_FENCE.get(), Blocks.POLISHED_BLACKSTONE);
        modFenceGateBlock("polished_blackstone_fence_gate", ModBlocks.POLISHED_BLACKSTONE_FENCE_GATE.get(), Blocks.POLISHED_BLACKSTONE);
        modPressurePlateBlock("polished_blackstone_pressure_plate", ModBlocks.POLISHED_BLACKSTONE_PRESSURE_PLATE.get(), Blocks.POLISHED_BLACKSTONE);
        modButtonBlock("polished_blackstone_button", ModBlocks.POLISHED_BLACKSTONE_BUTTON.get(), Blocks.POLISHED_BLACKSTONE);
        modWallBlock("polished_blackstone_wall", ModBlocks.POLISHED_BLACKSTONE_WALL.get(), Blocks.POLISHED_BLACKSTONE);

        modStairsBlock("chiseled_polished_blackstone_stairs", ModBlocks.CHISELED_POLISHED_BLACKSTONE_STAIRS.get(), Blocks.CHISELED_POLISHED_BLACKSTONE);
        modSlabBlock("chiseled_polished_blackstone_slab", ModBlocks.CHISELED_POLISHED_BLACKSTONE_SLAB.get(), Blocks.CHISELED_POLISHED_BLACKSTONE);
        modFenceBlock("chiseled_polished_blackstone_fence", ModBlocks.CHISELED_POLISHED_BLACKSTONE_FENCE.get(), Blocks.CHISELED_POLISHED_BLACKSTONE);
        modFenceGateBlock("chiseled_polished_blackstone_fence_gate", ModBlocks.CHISELED_POLISHED_BLACKSTONE_FENCE_GATE.get(), Blocks.CHISELED_POLISHED_BLACKSTONE);
        modPressurePlateBlock("chiseled_polished_blackstone_pressure_plate", ModBlocks.CHISELED_POLISHED_BLACKSTONE_PRESSURE_PLATE.get(), Blocks.CHISELED_POLISHED_BLACKSTONE);
        modButtonBlock("chiseled_polished_blackstone_button", ModBlocks.CHISELED_POLISHED_BLACKSTONE_BUTTON.get(), Blocks.CHISELED_POLISHED_BLACKSTONE);
        modWallBlock("chiseled_polished_blackstone_wall", ModBlocks.CHISELED_POLISHED_BLACKSTONE_WALL.get(), Blocks.CHISELED_POLISHED_BLACKSTONE);

        modStairsBlock("polished_blackstone_bricks_stairs", ModBlocks.POLISHED_BLACKSTONE_BRICKS_STAIRS.get(), Blocks.POLISHED_BLACKSTONE_BRICKS);
        modSlabBlock("polished_blackstone_bricks_slab", ModBlocks.POLISHED_BLACKSTONE_BRICKS_SLAB.get(), Blocks.POLISHED_BLACKSTONE_BRICKS);
        modFenceBlock("polished_blackstone_bricks_fence", ModBlocks.POLISHED_BLACKSTONE_BRICKS_FENCE.get(), Blocks.POLISHED_BLACKSTONE_BRICKS);
        modFenceGateBlock("polished_blackstone_bricks_fence_gate", ModBlocks.POLISHED_BLACKSTONE_BRICKS_FENCE_GATE.get(), Blocks.POLISHED_BLACKSTONE_BRICKS);
        modPressurePlateBlock("polished_blackstone_bricks_pressure_plate", ModBlocks.POLISHED_BLACKSTONE_BRICKS_PRESSURE_PLATE.get(), Blocks.POLISHED_BLACKSTONE_BRICKS);
        modButtonBlock("polished_blackstone_bricks_button", ModBlocks.POLISHED_BLACKSTONE_BRICKS_BUTTON.get(), Blocks.POLISHED_BLACKSTONE_BRICKS);
        modWallBlock("polished_blackstone_bricks_wall", ModBlocks.POLISHED_BLACKSTONE_BRICKS_WALL.get(), Blocks.POLISHED_BLACKSTONE_BRICKS);

        modStairsBlock("cracked_polished_blackstone_bricks_stairs", ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_STAIRS.get(), Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
        modSlabBlock("cracked_polished_blackstone_bricks_slab", ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_SLAB.get(), Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
        modFenceBlock("cracked_polished_blackstone_bricks_fence", ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_FENCE.get(), Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
        modFenceGateBlock("cracked_polished_blackstone_bricks_fence_gate", ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_FENCE_GATE.get(), Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
        modPressurePlateBlock("cracked_polished_blackstone_bricks_pressure_plate", ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_PRESSURE_PLATE.get(), Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
        modButtonBlock("cracked_polished_blackstone_bricks_button", ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_BUTTON.get(), Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
        modWallBlock("cracked_polished_blackstone_bricks_wall", ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_WALL.get(), Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);

        modStairsBlock("glass_stairs", ModBlocks.GLASS_STAIRS.get(), Blocks.GLASS);
        modSlabBlock("glass_slab", ModBlocks.GLASS_SLAB.get(), Blocks.GLASS);
        modFenceBlock("glass_fence", ModBlocks.GLASS_FENCE.get(), Blocks.GLASS);
        modFenceGateBlock("glass_fence_gate", ModBlocks.GLASS_FENCE_GATE.get(), Blocks.GLASS);
        modPressurePlateBlock("glass_pressure_plate", ModBlocks.GLASS_PRESSURE_PLATE.get(), Blocks.GLASS);
        modButtonBlock("glass_button", ModBlocks.GLASS_BUTTON.get(), Blocks.GLASS);
        modWallBlock("glass_wall", ModBlocks.GLASS_WALL.get(), Blocks.GLASS);

        modStairsBlock("tinted_glass_stairs", ModBlocks.TINTED_GLASS_STAIRS.get(), Blocks.TINTED_GLASS);
        modSlabBlock("tinted_glass_slab", ModBlocks.TINTED_GLASS_SLAB.get(), Blocks.TINTED_GLASS);
        modFenceBlock("tinted_glass_fence", ModBlocks.TINTED_GLASS_FENCE.get(), Blocks.TINTED_GLASS);
        modFenceGateBlock("tinted_glass_fence_gate", ModBlocks.TINTED_GLASS_FENCE_GATE.get(), Blocks.TINTED_GLASS);
        modPressurePlateBlock("tinted_glass_pressure_plate", ModBlocks.TINTED_GLASS_PRESSURE_PLATE.get(), Blocks.TINTED_GLASS);
        modButtonBlock("tinted_glass_button", ModBlocks.TINTED_GLASS_BUTTON.get(), Blocks.TINTED_GLASS);
        modWallBlock("tinted_glass_wall", ModBlocks.TINTED_GLASS_WALL.get(), Blocks.TINTED_GLASS);

        modStairsBlock("white_stained_glass_stairs", ModBlocks.WHITE_STAINED_GLASS_STAIRS.get(), Blocks.WHITE_STAINED_GLASS);
        modSlabBlock("white_stained_glass_slab", ModBlocks.WHITE_STAINED_GLASS_SLAB.get(), Blocks.WHITE_STAINED_GLASS);
        modFenceBlock("white_stained_glass_fence", ModBlocks.WHITE_STAINED_GLASS_FENCE.get(), Blocks.WHITE_STAINED_GLASS);
        modFenceGateBlock("white_stained_glass_fence_gate", ModBlocks.WHITE_STAINED_GLASS_FENCE_GATE.get(), Blocks.WHITE_STAINED_GLASS);
        modPressurePlateBlock("white_stained_glass_pressure_plate", ModBlocks.WHITE_STAINED_GLASS_PRESSURE_PLATE.get(), Blocks.WHITE_STAINED_GLASS);
        modButtonBlock("white_stained_glass_button", ModBlocks.WHITE_STAINED_GLASS_BUTTON.get(), Blocks.WHITE_STAINED_GLASS);
        modWallBlock("white_stained_glass_wall", ModBlocks.WHITE_STAINED_GLASS_WALL.get(), Blocks.WHITE_STAINED_GLASS);

        modStairsBlock("orange_stained_glass_stairs", ModBlocks.ORANGE_STAINED_GLASS_STAIRS.get(), Blocks.ORANGE_STAINED_GLASS);
        modSlabBlock("orange_stained_glass_slab", ModBlocks.ORANGE_STAINED_GLASS_SLAB.get(), Blocks.ORANGE_STAINED_GLASS);
        modFenceBlock("orange_stained_glass_fence", ModBlocks.ORANGE_STAINED_GLASS_FENCE.get(), Blocks.ORANGE_STAINED_GLASS);
        modFenceGateBlock("orange_stained_glass_fence_gate", ModBlocks.ORANGE_STAINED_GLASS_FENCE_GATE.get(), Blocks.ORANGE_STAINED_GLASS);
        modPressurePlateBlock("orange_stained_glass_pressure_plate", ModBlocks.ORANGE_STAINED_GLASS_PRESSURE_PLATE.get(), Blocks.ORANGE_STAINED_GLASS);
        modButtonBlock("orange_stained_glass_button", ModBlocks.ORANGE_STAINED_GLASS_BUTTON.get(), Blocks.ORANGE_STAINED_GLASS);
        modWallBlock("orange_stained_glass_wall", ModBlocks.ORANGE_STAINED_GLASS_WALL.get(), Blocks.ORANGE_STAINED_GLASS);

        modStairsBlock("magenta_stained_glass_stairs", ModBlocks.MAGENTA_STAINED_GLASS_STAIRS.get(), Blocks.MAGENTA_STAINED_GLASS);
        modSlabBlock("magenta_stained_glass_slab", ModBlocks.MAGENTA_STAINED_GLASS_SLAB.get(), Blocks.MAGENTA_STAINED_GLASS);
        modFenceBlock("magenta_stained_glass_fence", ModBlocks.MAGENTA_STAINED_GLASS_FENCE.get(), Blocks.MAGENTA_STAINED_GLASS);
        modFenceGateBlock("magenta_stained_glass_fence_gate", ModBlocks.MAGENTA_STAINED_GLASS_FENCE_GATE.get(), Blocks.MAGENTA_STAINED_GLASS);
        modPressurePlateBlock("magenta_stained_glass_pressure_plate", ModBlocks.MAGENTA_STAINED_GLASS_PRESSURE_PLATE.get(), Blocks.MAGENTA_STAINED_GLASS);
        modButtonBlock("magenta_stained_glass_button", ModBlocks.MAGENTA_STAINED_GLASS_BUTTON.get(), Blocks.MAGENTA_STAINED_GLASS);
        modWallBlock("magenta_stained_glass_wall", ModBlocks.MAGENTA_STAINED_GLASS_WALL.get(), Blocks.MAGENTA_STAINED_GLASS);

        modStairsBlock("light_blue_stained_glass_stairs", ModBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS.get(), Blocks.LIGHT_BLUE_STAINED_GLASS);
        modSlabBlock("light_blue_stained_glass_slab", ModBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB.get(), Blocks.LIGHT_BLUE_STAINED_GLASS);
        modFenceBlock("light_blue_stained_glass_fence", ModBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE.get(), Blocks.LIGHT_BLUE_STAINED_GLASS);
        modFenceGateBlock("light_blue_stained_glass_fence_gate", ModBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE_GATE.get(), Blocks.LIGHT_BLUE_STAINED_GLASS);
        modPressurePlateBlock("light_blue_stained_glass_pressure_plate", ModBlocks.LIGHT_BLUE_STAINED_GLASS_PRESSURE_PLATE.get(), Blocks.LIGHT_BLUE_STAINED_GLASS);
        modButtonBlock("light_blue_stained_glass_button", ModBlocks.LIGHT_BLUE_STAINED_GLASS_BUTTON.get(), Blocks.LIGHT_BLUE_STAINED_GLASS);
        modWallBlock("light_blue_stained_glass_wall", ModBlocks.LIGHT_BLUE_STAINED_GLASS_WALL.get(), Blocks.LIGHT_BLUE_STAINED_GLASS);

        modStairsBlock("yellow_stained_glass_stairs", ModBlocks.YELLOW_STAINED_GLASS_STAIRS.get(), Blocks.YELLOW_STAINED_GLASS);
        modSlabBlock("yellow_stained_glass_slab", ModBlocks.YELLOW_STAINED_GLASS_SLAB.get(), Blocks.YELLOW_STAINED_GLASS);
        modFenceBlock("yellow_stained_glass_fence", ModBlocks.YELLOW_STAINED_GLASS_FENCE.get(), Blocks.YELLOW_STAINED_GLASS);
        modFenceGateBlock("yellow_stained_glass_fence_gate", ModBlocks.YELLOW_STAINED_GLASS_FENCE_GATE.get(), Blocks.YELLOW_STAINED_GLASS);
        modPressurePlateBlock("yellow_stained_glass_pressure_plate", ModBlocks.YELLOW_STAINED_GLASS_PRESSURE_PLATE.get(), Blocks.YELLOW_STAINED_GLASS);
        modButtonBlock("yellow_stained_glass_button", ModBlocks.YELLOW_STAINED_GLASS_BUTTON.get(), Blocks.YELLOW_STAINED_GLASS);
        modWallBlock("yellow_stained_glass_wall", ModBlocks.YELLOW_STAINED_GLASS_WALL.get(), Blocks.YELLOW_STAINED_GLASS);

        modStairsBlock("lime_stained_glass_stairs", ModBlocks.LIME_STAINED_GLASS_STAIRS.get(), Blocks.LIME_STAINED_GLASS);
        modSlabBlock("lime_stained_glass_slab", ModBlocks.LIME_STAINED_GLASS_SLAB.get(), Blocks.LIME_STAINED_GLASS);
        modFenceBlock("lime_stained_glass_fence", ModBlocks.LIME_STAINED_GLASS_FENCE.get(), Blocks.LIME_STAINED_GLASS);
        modFenceGateBlock("lime_stained_glass_fence_gate", ModBlocks.LIME_STAINED_GLASS_FENCE_GATE.get(), Blocks.LIME_STAINED_GLASS);
        modPressurePlateBlock("lime_stained_glass_pressure_plate", ModBlocks.LIME_STAINED_GLASS_PRESSURE_PLATE.get(), Blocks.LIME_STAINED_GLASS);
        modButtonBlock("lime_stained_glass_button", ModBlocks.LIME_STAINED_GLASS_BUTTON.get(), Blocks.LIME_STAINED_GLASS);
        modWallBlock("lime_stained_glass_wall", ModBlocks.LIME_STAINED_GLASS_WALL.get(), Blocks.LIME_STAINED_GLASS);

        modStairsBlock("pink_stained_glass_stairs", ModBlocks.PINK_STAINED_GLASS_STAIRS.get(), Blocks.PINK_STAINED_GLASS);
        modSlabBlock("pink_stained_glass_slab", ModBlocks.PINK_STAINED_GLASS_SLAB.get(), Blocks.PINK_STAINED_GLASS);
        modFenceBlock("pink_stained_glass_fence", ModBlocks.PINK_STAINED_GLASS_FENCE.get(), Blocks.PINK_STAINED_GLASS);
        modFenceGateBlock("pink_stained_glass_fence_gate", ModBlocks.PINK_STAINED_GLASS_FENCE_GATE.get(), Blocks.PINK_STAINED_GLASS);
        modPressurePlateBlock("pink_stained_glass_pressure_plate", ModBlocks.PINK_STAINED_GLASS_PRESSURE_PLATE.get(), Blocks.PINK_STAINED_GLASS);
        modButtonBlock("pink_stained_glass_button", ModBlocks.PINK_STAINED_GLASS_BUTTON.get(), Blocks.PINK_STAINED_GLASS);
        modWallBlock("pink_stained_glass_wall", ModBlocks.PINK_STAINED_GLASS_WALL.get(), Blocks.PINK_STAINED_GLASS);

        modStairsBlock("gray_stained_glass_stairs", ModBlocks.GRAY_STAINED_GLASS_STAIRS.get(), Blocks.GRAY_STAINED_GLASS);
        modSlabBlock("gray_stained_glass_slab", ModBlocks.GRAY_STAINED_GLASS_SLAB.get(), Blocks.GRAY_STAINED_GLASS);
        modFenceBlock("gray_stained_glass_fence", ModBlocks.GRAY_STAINED_GLASS_FENCE.get(), Blocks.GRAY_STAINED_GLASS);
        modFenceGateBlock("gray_stained_glass_fence_gate", ModBlocks.GRAY_STAINED_GLASS_FENCE_GATE.get(), Blocks.GRAY_STAINED_GLASS);
        modPressurePlateBlock("gray_stained_glass_pressure_plate", ModBlocks.GRAY_STAINED_GLASS_PRESSURE_PLATE.get(), Blocks.GRAY_STAINED_GLASS);
        modButtonBlock("gray_stained_glass_button", ModBlocks.GRAY_STAINED_GLASS_BUTTON.get(), Blocks.GRAY_STAINED_GLASS);
        modWallBlock("gray_stained_glass_wall", ModBlocks.GRAY_STAINED_GLASS_WALL.get(), Blocks.GRAY_STAINED_GLASS);

        modStairsBlock("light_gray_stained_glass_stairs", ModBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS.get(), Blocks.LIGHT_GRAY_STAINED_GLASS);
        modSlabBlock("light_gray_stained_glass_slab", ModBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB.get(), Blocks.LIGHT_GRAY_STAINED_GLASS);
        modFenceBlock("light_gray_stained_glass_fence", ModBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE.get(), Blocks.LIGHT_GRAY_STAINED_GLASS);
        modFenceGateBlock("light_gray_stained_glass_fence_gate", ModBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE_GATE.get(), Blocks.LIGHT_GRAY_STAINED_GLASS);
        modPressurePlateBlock("light_gray_stained_glass_pressure_plate", ModBlocks.LIGHT_GRAY_STAINED_GLASS_PRESSURE_PLATE.get(), Blocks.LIGHT_GRAY_STAINED_GLASS);
        modButtonBlock("light_gray_stained_glass_button", ModBlocks.LIGHT_GRAY_STAINED_GLASS_BUTTON.get(), Blocks.LIGHT_GRAY_STAINED_GLASS);
        modWallBlock("light_gray_stained_glass_wall", ModBlocks.LIGHT_GRAY_STAINED_GLASS_WALL.get(), Blocks.LIGHT_GRAY_STAINED_GLASS);

        modStairsBlock("cyan_stained_glass_stairs", ModBlocks.CYAN_STAINED_GLASS_STAIRS.get(), Blocks.CYAN_STAINED_GLASS);
        modSlabBlock("cyan_stained_glass_slab", ModBlocks.CYAN_STAINED_GLASS_SLAB.get(), Blocks.CYAN_STAINED_GLASS);
        modFenceBlock("cyan_stained_glass_fence", ModBlocks.CYAN_STAINED_GLASS_FENCE.get(), Blocks.CYAN_STAINED_GLASS);
        modFenceGateBlock("cyan_stained_glass_fence_gate", ModBlocks.CYAN_STAINED_GLASS_FENCE_GATE.get(), Blocks.CYAN_STAINED_GLASS);
        modPressurePlateBlock("cyan_stained_glass_pressure_plate", ModBlocks.CYAN_STAINED_GLASS_PRESSURE_PLATE.get(), Blocks.CYAN_STAINED_GLASS);
        modButtonBlock("cyan_stained_glass_button", ModBlocks.CYAN_STAINED_GLASS_BUTTON.get(), Blocks.CYAN_STAINED_GLASS);
        modWallBlock("cyan_stained_glass_wall", ModBlocks.CYAN_STAINED_GLASS_WALL.get(), Blocks.CYAN_STAINED_GLASS);

        modStairsBlock("purple_stained_glass_stairs", ModBlocks.PURPLE_STAINED_GLASS_STAIRS.get(), Blocks.PURPLE_STAINED_GLASS);
        modSlabBlock("purple_stained_glass_slab", ModBlocks.PURPLE_STAINED_GLASS_SLAB.get(), Blocks.PURPLE_STAINED_GLASS);
        modFenceBlock("purple_stained_glass_fence", ModBlocks.PURPLE_STAINED_GLASS_FENCE.get(), Blocks.PURPLE_STAINED_GLASS);
        modFenceGateBlock("purple_stained_glass_fence_gate", ModBlocks.PURPLE_STAINED_GLASS_FENCE_GATE.get(), Blocks.PURPLE_STAINED_GLASS);
        modPressurePlateBlock("purple_stained_glass_pressure_plate", ModBlocks.PURPLE_STAINED_GLASS_PRESSURE_PLATE.get(), Blocks.PURPLE_STAINED_GLASS);
        modButtonBlock("purple_stained_glass_button", ModBlocks.PURPLE_STAINED_GLASS_BUTTON.get(), Blocks.PURPLE_STAINED_GLASS);
        modWallBlock("purple_stained_glass_wall", ModBlocks.PURPLE_STAINED_GLASS_WALL.get(), Blocks.PURPLE_STAINED_GLASS);

        modStairsBlock("blue_stained_glass_stairs", ModBlocks.BLUE_STAINED_GLASS_STAIRS.get(), Blocks.BLUE_STAINED_GLASS);
        modSlabBlock("blue_stained_glass_slab", ModBlocks.BLUE_STAINED_GLASS_SLAB.get(), Blocks.BLUE_STAINED_GLASS);
        modFenceBlock("blue_stained_glass_fence", ModBlocks.BLUE_STAINED_GLASS_FENCE.get(), Blocks.BLUE_STAINED_GLASS);
        modFenceGateBlock("blue_stained_glass_fence_gate", ModBlocks.BLUE_STAINED_GLASS_FENCE_GATE.get(), Blocks.BLUE_STAINED_GLASS);
        modPressurePlateBlock("blue_stained_glass_pressure_plate", ModBlocks.BLUE_STAINED_GLASS_PRESSURE_PLATE.get(), Blocks.BLUE_STAINED_GLASS);
        modButtonBlock("blue_stained_glass_button", ModBlocks.BLUE_STAINED_GLASS_BUTTON.get(), Blocks.BLUE_STAINED_GLASS);
        modWallBlock("blue_stained_glass_wall", ModBlocks.BLUE_STAINED_GLASS_WALL.get(), Blocks.BLUE_STAINED_GLASS);

        modStairsBlock("brown_stained_glass_stairs", ModBlocks.BROWN_STAINED_GLASS_STAIRS.get(), Blocks.BROWN_STAINED_GLASS);
        modSlabBlock("brown_stained_glass_slab", ModBlocks.BROWN_STAINED_GLASS_SLAB.get(), Blocks.BROWN_STAINED_GLASS);
        modFenceBlock("brown_stained_glass_fence", ModBlocks.BROWN_STAINED_GLASS_FENCE.get(), Blocks.BROWN_STAINED_GLASS);
        modFenceGateBlock("brown_stained_glass_fence_gate", ModBlocks.BROWN_STAINED_GLASS_FENCE_GATE.get(), Blocks.BROWN_STAINED_GLASS);
        modPressurePlateBlock("brown_stained_glass_pressure_plate", ModBlocks.BROWN_STAINED_GLASS_PRESSURE_PLATE.get(), Blocks.BROWN_STAINED_GLASS);
        modButtonBlock("brown_stained_glass_button", ModBlocks.BROWN_STAINED_GLASS_BUTTON.get(), Blocks.BROWN_STAINED_GLASS);
        modWallBlock("brown_stained_glass_wall", ModBlocks.BROWN_STAINED_GLASS_WALL.get(), Blocks.BROWN_STAINED_GLASS);

        modStairsBlock("green_stained_glass_stairs", ModBlocks.GREEN_STAINED_GLASS_STAIRS.get(), Blocks.GREEN_STAINED_GLASS);
        modSlabBlock("green_stained_glass_slab", ModBlocks.GREEN_STAINED_GLASS_SLAB.get(), Blocks.GREEN_STAINED_GLASS);
        modFenceBlock("green_stained_glass_fence", ModBlocks.GREEN_STAINED_GLASS_FENCE.get(), Blocks.GREEN_STAINED_GLASS);
        modFenceGateBlock("green_stained_glass_fence_gate", ModBlocks.GREEN_STAINED_GLASS_FENCE_GATE.get(), Blocks.GREEN_STAINED_GLASS);
        modPressurePlateBlock("green_stained_glass_pressure_plate", ModBlocks.GREEN_STAINED_GLASS_PRESSURE_PLATE.get(), Blocks.GREEN_STAINED_GLASS);
        modButtonBlock("green_stained_glass_button", ModBlocks.GREEN_STAINED_GLASS_BUTTON.get(), Blocks.GREEN_STAINED_GLASS);
        modWallBlock("green_stained_glass_wall", ModBlocks.GREEN_STAINED_GLASS_WALL.get(), Blocks.GREEN_STAINED_GLASS);

        modStairsBlock("red_stained_glass_stairs", ModBlocks.RED_STAINED_GLASS_STAIRS.get(), Blocks.RED_STAINED_GLASS);
        modSlabBlock("red_stained_glass_slab", ModBlocks.RED_STAINED_GLASS_SLAB.get(), Blocks.RED_STAINED_GLASS);
        modFenceBlock("red_stained_glass_fence", ModBlocks.RED_STAINED_GLASS_FENCE.get(), Blocks.RED_STAINED_GLASS);
        modFenceGateBlock("red_stained_glass_fence_gate", ModBlocks.RED_STAINED_GLASS_FENCE_GATE.get(), Blocks.RED_STAINED_GLASS);
        modPressurePlateBlock("red_stained_glass_pressure_plate", ModBlocks.RED_STAINED_GLASS_PRESSURE_PLATE.get(), Blocks.RED_STAINED_GLASS);
        modButtonBlock("red_stained_glass_button", ModBlocks.RED_STAINED_GLASS_BUTTON.get(), Blocks.RED_STAINED_GLASS);
        modWallBlock("red_stained_glass_wall", ModBlocks.RED_STAINED_GLASS_WALL.get(), Blocks.RED_STAINED_GLASS);

        modStairsBlock("black_stained_glass_stairs", ModBlocks.BLACK_STAINED_GLASS_STAIRS.get(), Blocks.BLACK_STAINED_GLASS);
        modSlabBlock("black_stained_glass_slab", ModBlocks.BLACK_STAINED_GLASS_SLAB.get(), Blocks.BLACK_STAINED_GLASS);
        modFenceBlock("black_stained_glass_fence", ModBlocks.BLACK_STAINED_GLASS_FENCE.get(), Blocks.BLACK_STAINED_GLASS);
        modFenceGateBlock("black_stained_glass_fence_gate", ModBlocks.BLACK_STAINED_GLASS_FENCE_GATE.get(), Blocks.BLACK_STAINED_GLASS);
        modPressurePlateBlock("black_stained_glass_pressure_plate", ModBlocks.BLACK_STAINED_GLASS_PRESSURE_PLATE.get(), Blocks.BLACK_STAINED_GLASS);
        modButtonBlock("black_stained_glass_button", ModBlocks.BLACK_STAINED_GLASS_BUTTON.get(), Blocks.BLACK_STAINED_GLASS);
        modWallBlock("black_stained_glass_wall", ModBlocks.BLACK_STAINED_GLASS_WALL.get(), Blocks.BLACK_STAINED_GLASS);

        modStairsBlock("flowering_azalea_leaves_stairs", ModBlocks.FLOWERING_AZALEA_LEAVES_STAIRS.get(), Blocks.FLOWERING_AZALEA_LEAVES);
        modSlabBlock("flowering_azalea_leaves_slab", ModBlocks.FLOWERING_AZALEA_LEAVES_SLAB.get(), Blocks.FLOWERING_AZALEA_LEAVES);
        modFenceBlock("flowering_azalea_leaves_fence", ModBlocks.FLOWERING_AZALEA_LEAVES_FENCE.get(), Blocks.FLOWERING_AZALEA_LEAVES);
        modFenceGateBlock("flowering_azalea_leaves_fence_gate", ModBlocks.FLOWERING_AZALEA_LEAVES_FENCE_GATE.get(), Blocks.FLOWERING_AZALEA_LEAVES);
        modPressurePlateBlock("flowering_azalea_leaves_pressure_plate", ModBlocks.FLOWERING_AZALEA_LEAVES_PRESSURE_PLATE.get(), Blocks.FLOWERING_AZALEA_LEAVES);
        modButtonBlock("flowering_azalea_leaves_button", ModBlocks.FLOWERING_AZALEA_LEAVES_BUTTON.get(), Blocks.FLOWERING_AZALEA_LEAVES);
        modWallBlock("flowering_azalea_leaves_wall", ModBlocks.FLOWERING_AZALEA_LEAVES_WALL.get(), Blocks.FLOWERING_AZALEA_LEAVES);

        modStairsBlock("azalea_leaves_stairs", ModBlocks.AZALEA_LEAVES_STAIRS.get(), Blocks.AZALEA_LEAVES);
        modSlabBlock("azalea_leaves_slab", ModBlocks.AZALEA_LEAVES_SLAB.get(), Blocks.AZALEA_LEAVES);
        modFenceBlock("azalea_leaves_fence", ModBlocks.AZALEA_LEAVES_FENCE.get(), Blocks.AZALEA_LEAVES);
        modFenceGateBlock("azalea_leaves_fence_gate", ModBlocks.AZALEA_LEAVES_FENCE_GATE.get(), Blocks.AZALEA_LEAVES);
        modPressurePlateBlock("azalea_leaves_pressure_plate", ModBlocks.AZALEA_LEAVES_PRESSURE_PLATE.get(), Blocks.AZALEA_LEAVES);
        modButtonBlock("azalea_leaves_button", ModBlocks.AZALEA_LEAVES_BUTTON.get(), Blocks.AZALEA_LEAVES);
        modWallBlock("azalea_leaves_wall", ModBlocks.AZALEA_LEAVES_WALL.get(), Blocks.AZALEA_LEAVES);

    }
    
    public void modStairsBlock(String name, Block modBlock, Block block) {
        stairsBlock((StairBlock) modBlock, blockTexture(block));
        simpleBlockItem(modBlock, models().stairs(name, blockTexture(block), blockTexture(block), blockTexture(block)));
    }

    public void modSlabBlock(String name, Block modBlock, Block block) {
        slabBlock((SlabBlock) modBlock, blockTexture(block), blockTexture(block));
        simpleBlockItem(modBlock, models().slab(name, blockTexture(block), blockTexture(block), blockTexture(block)));
    }

    public void modFenceBlock(String name, Block modBlock, Block block) {
        fenceBlock((FenceBlock) modBlock, blockTexture(block));
        simpleBlockItem(modBlock, models().fenceInventory(name, blockTexture(block)));
    }

    public void modFenceGateBlock(String name, Block modBlock, Block block) {
        fenceGateBlock((FenceGateBlock) modBlock, blockTexture(block));
        simpleBlockItem(modBlock, models().fenceGate(name, blockTexture(block)));
    }

    public void modPressurePlateBlock(String name, Block modBlock, Block block) {
        pressurePlateBlock((PressurePlateBlock) modBlock, blockTexture(block));
        simpleBlockItem(modBlock, models().pressurePlate(name, blockTexture(block)));
    }

    public void modButtonBlock(String name, Block modBlock, Block block) {
        buttonBlock((ButtonBlock) modBlock, blockTexture(block));
        simpleBlockItem(modBlock, models().buttonInventory(name, blockTexture(block)));
    }

    public void modWallBlock(String name, Block modBlock, Block block) {
        wallBlock((WallBlock) modBlock, blockTexture(block));
        simpleBlockItem(modBlock, models().wallInventory(name, blockTexture(block)));
    }
}