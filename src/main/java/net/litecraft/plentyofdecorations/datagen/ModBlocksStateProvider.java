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

        buttonBlock((ButtonBlock)ModBlocks.BEDROCK_BUTTON.get(), blockTexture(Blocks.BEDROCK));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.BEDROCK_PRESSURE_PLATE.get(), blockTexture(Blocks.BEDROCK));
        wallBlock((WallBlock) ModBlocks.BEDROCK_WALL.get(), blockTexture(Blocks.BEDROCK));
        fenceBlock((FenceBlock) ModBlocks.BEDROCK_FENCE.get(), blockTexture(Blocks.BEDROCK));

        fenceGateBlock((FenceGateBlock) ModBlocks.BEDROCK_FENCE_GATE.get(), blockTexture(Blocks.BEDROCK));
        slabBlock((SlabBlock) ModBlocks.BEDROCK_SLAB.get(), blockTexture(Blocks.BEDROCK), blockTexture(Blocks.BEDROCK));
        stairsBlock((StairBlock) ModBlocks.BEDROCK_STAIRS.get(), blockTexture(Blocks.BEDROCK));
        buttonBlock((ButtonBlock)ModBlocks.COAL_ORE_BUTTON.get(), blockTexture(Blocks.COAL_ORE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.COAL_ORE_PRESSURE_PLATE.get(), blockTexture(Blocks.COAL_ORE));
        wallBlock((WallBlock) ModBlocks.COAL_ORE_WALL.get(), blockTexture(Blocks.COAL_ORE));
        fenceBlock((FenceBlock) ModBlocks.COAL_ORE_FENCE.get(), blockTexture(Blocks.COAL_ORE));

        fenceGateBlock((FenceGateBlock) ModBlocks.COAL_ORE_FENCE_GATE.get(), blockTexture(Blocks.COAL_ORE));
        slabBlock((SlabBlock) ModBlocks.COAL_ORE_SLAB.get(), blockTexture(Blocks.COAL_ORE), blockTexture(Blocks.COAL_ORE));
        stairsBlock((StairBlock) ModBlocks.COAL_ORE_STAIRS.get(), blockTexture(Blocks.COAL_ORE));
        buttonBlock((ButtonBlock)ModBlocks.LAPIS_ORE_BUTTON.get(), blockTexture(Blocks.LAPIS_ORE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.LAPIS_ORE_PRESSURE_PLATE.get(), blockTexture(Blocks.LAPIS_ORE));
        wallBlock((WallBlock) ModBlocks.LAPIS_ORE_WALL.get(), blockTexture(Blocks.LAPIS_ORE));
        fenceBlock((FenceBlock) ModBlocks.LAPIS_ORE_FENCE.get(), blockTexture(Blocks.LAPIS_ORE));

        fenceGateBlock((FenceGateBlock) ModBlocks.LAPIS_ORE_FENCE_GATE.get(), blockTexture(Blocks.LAPIS_ORE));
        slabBlock((SlabBlock) ModBlocks.LAPIS_ORE_SLAB.get(), blockTexture(Blocks.LAPIS_ORE), blockTexture(Blocks.LAPIS_ORE));
        stairsBlock((StairBlock) ModBlocks.LAPIS_ORE_STAIRS.get(), blockTexture(Blocks.LAPIS_ORE));
        buttonBlock((ButtonBlock)ModBlocks.IRON_ORE_BUTTON.get(), blockTexture(Blocks.IRON_ORE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.IRON_ORE_PRESSURE_PLATE.get(), blockTexture(Blocks.IRON_ORE));
        wallBlock((WallBlock) ModBlocks.IRON_ORE_WALL.get(), blockTexture(Blocks.IRON_ORE));
        fenceBlock((FenceBlock) ModBlocks.IRON_ORE_FENCE.get(), blockTexture(Blocks.IRON_ORE));

        fenceGateBlock((FenceGateBlock) ModBlocks.IRON_ORE_FENCE_GATE.get(), blockTexture(Blocks.IRON_ORE));
        slabBlock((SlabBlock) ModBlocks.IRON_ORE_SLAB.get(), blockTexture(Blocks.IRON_ORE), blockTexture(Blocks.IRON_ORE));
        stairsBlock((StairBlock) ModBlocks.IRON_ORE_STAIRS.get(), blockTexture(Blocks.IRON_ORE));
        buttonBlock((ButtonBlock)ModBlocks.COPPER_ORE_BUTTON.get(), blockTexture(Blocks.COPPER_ORE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.COPPER_ORE_PRESSURE_PLATE.get(), blockTexture(Blocks.COPPER_ORE));
        wallBlock((WallBlock) ModBlocks.COPPER_ORE_WALL.get(), blockTexture(Blocks.COPPER_ORE));
        fenceBlock((FenceBlock) ModBlocks.COPPER_ORE_FENCE.get(), blockTexture(Blocks.COPPER_ORE));

        fenceGateBlock((FenceGateBlock) ModBlocks.COPPER_ORE_FENCE_GATE.get(), blockTexture(Blocks.COPPER_ORE));
        slabBlock((SlabBlock) ModBlocks.COPPER_ORE_SLAB.get(), blockTexture(Blocks.COPPER_ORE), blockTexture(Blocks.COPPER_ORE));
        stairsBlock((StairBlock) ModBlocks.COPPER_ORE_STAIRS.get(), blockTexture(Blocks.COPPER_ORE));
        buttonBlock((ButtonBlock)ModBlocks.GOLD_ORE_BUTTON.get(), blockTexture(Blocks.GOLD_ORE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.GOLD_ORE_PRESSURE_PLATE.get(), blockTexture(Blocks.GOLD_ORE));
        wallBlock((WallBlock) ModBlocks.GOLD_ORE_WALL.get(), blockTexture(Blocks.GOLD_ORE));
        fenceBlock((FenceBlock) ModBlocks.GOLD_ORE_FENCE.get(), blockTexture(Blocks.GOLD_ORE));

        fenceGateBlock((FenceGateBlock) ModBlocks.GOLD_ORE_FENCE_GATE.get(), blockTexture(Blocks.GOLD_ORE));
        slabBlock((SlabBlock) ModBlocks.GOLD_ORE_SLAB.get(), blockTexture(Blocks.GOLD_ORE), blockTexture(Blocks.GOLD_ORE));
        stairsBlock((StairBlock) ModBlocks.GOLD_ORE_STAIRS.get(), blockTexture(Blocks.GOLD_ORE));
        buttonBlock((ButtonBlock)ModBlocks.DIAMOND_ORE_BUTTON.get(), blockTexture(Blocks.DIAMOND_ORE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.DIAMOND_ORE_PRESSURE_PLATE.get(), blockTexture(Blocks.DIAMOND_ORE));
        wallBlock((WallBlock) ModBlocks.DIAMOND_ORE_WALL.get(), blockTexture(Blocks.DIAMOND_ORE));
        fenceBlock((FenceBlock) ModBlocks.DIAMOND_ORE_FENCE.get(), blockTexture(Blocks.DIAMOND_ORE));

        fenceGateBlock((FenceGateBlock) ModBlocks.DIAMOND_ORE_FENCE_GATE.get(), blockTexture(Blocks.DIAMOND_ORE));
        slabBlock((SlabBlock) ModBlocks.DIAMOND_ORE_SLAB.get(), blockTexture(Blocks.DIAMOND_ORE), blockTexture(Blocks.DIAMOND_ORE));
        stairsBlock((StairBlock) ModBlocks.DIAMOND_ORE_STAIRS.get(), blockTexture(Blocks.DIAMOND_ORE));
        buttonBlock((ButtonBlock)ModBlocks.EMERALD_ORE_BUTTON.get(), blockTexture(Blocks.EMERALD_ORE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.EMERALD_ORE_PRESSURE_PLATE.get(), blockTexture(Blocks.EMERALD_ORE));
        wallBlock((WallBlock) ModBlocks.EMERALD_ORE_WALL.get(), blockTexture(Blocks.EMERALD_ORE));
        fenceBlock((FenceBlock) ModBlocks.EMERALD_ORE_FENCE.get(), blockTexture(Blocks.EMERALD_ORE));

        fenceGateBlock((FenceGateBlock) ModBlocks.EMERALD_ORE_FENCE_GATE.get(), blockTexture(Blocks.EMERALD_ORE));
        slabBlock((SlabBlock) ModBlocks.EMERALD_ORE_SLAB.get(), blockTexture(Blocks.EMERALD_ORE), blockTexture(Blocks.EMERALD_ORE));
        stairsBlock((StairBlock) ModBlocks.EMERALD_ORE_STAIRS.get(), blockTexture(Blocks.EMERALD_ORE));
        buttonBlock((ButtonBlock)ModBlocks.DEEPSLATE_COAL_ORE_BUTTON.get(), blockTexture(Blocks.DEEPSLATE_COAL_ORE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.DEEPSLATE_COAL_ORE_PRESSURE_PLATE.get(), blockTexture(Blocks.DEEPSLATE_COAL_ORE));
        wallBlock((WallBlock) ModBlocks.DEEPSLATE_COAL_ORE_WALL.get(), blockTexture(Blocks.DEEPSLATE_COAL_ORE));
        fenceBlock((FenceBlock) ModBlocks.DEEPSLATE_COAL_ORE_FENCE.get(), blockTexture(Blocks.DEEPSLATE_COAL_ORE));

        fenceGateBlock((FenceGateBlock) ModBlocks.DEEPSLATE_COAL_ORE_FENCE_GATE.get(), blockTexture(Blocks.DEEPSLATE_COAL_ORE));
        slabBlock((SlabBlock) ModBlocks.DEEPSLATE_COAL_ORE_SLAB.get(), blockTexture(Blocks.DEEPSLATE_COAL_ORE), blockTexture(Blocks.DEEPSLATE_COAL_ORE));
        stairsBlock((StairBlock) ModBlocks.DEEPSLATE_COAL_ORE_STAIRS.get(), blockTexture(Blocks.DEEPSLATE_COAL_ORE));
        buttonBlock((ButtonBlock)ModBlocks.DEEPSLATE_LAPIS_ORE_BUTTON.get(), blockTexture(Blocks.DEEPSLATE_LAPIS_ORE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.DEEPSLATE_LAPIS_ORE_PRESSURE_PLATE.get(), blockTexture(Blocks.DEEPSLATE_LAPIS_ORE));
        wallBlock((WallBlock) ModBlocks.DEEPSLATE_LAPIS_ORE_WALL.get(), blockTexture(Blocks.DEEPSLATE_LAPIS_ORE));
        fenceBlock((FenceBlock) ModBlocks.DEEPSLATE_LAPIS_ORE_FENCE.get(), blockTexture(Blocks.DEEPSLATE_LAPIS_ORE));

        fenceGateBlock((FenceGateBlock) ModBlocks.DEEPSLATE_LAPIS_ORE_FENCE_GATE.get(), blockTexture(Blocks.DEEPSLATE_LAPIS_ORE));
        slabBlock((SlabBlock) ModBlocks.DEEPSLATE_LAPIS_ORE_SLAB.get(), blockTexture(Blocks.DEEPSLATE_LAPIS_ORE), blockTexture(Blocks.DEEPSLATE_LAPIS_ORE));
        stairsBlock((StairBlock) ModBlocks.DEEPSLATE_LAPIS_ORE_STAIRS.get(), blockTexture(Blocks.DEEPSLATE_LAPIS_ORE));
        buttonBlock((ButtonBlock)ModBlocks.DEEPSLATE_IRON_ORE_BUTTON.get(), blockTexture(Blocks.DEEPSLATE_IRON_ORE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.DEEPSLATE_IRON_ORE_PRESSURE_PLATE.get(), blockTexture(Blocks.DEEPSLATE_IRON_ORE));
        wallBlock((WallBlock) ModBlocks.DEEPSLATE_IRON_ORE_WALL.get(), blockTexture(Blocks.DEEPSLATE_IRON_ORE));
        fenceBlock((FenceBlock) ModBlocks.DEEPSLATE_IRON_ORE_FENCE.get(), blockTexture(Blocks.DEEPSLATE_IRON_ORE));

        fenceGateBlock((FenceGateBlock) ModBlocks.DEEPSLATE_IRON_ORE_FENCE_GATE.get(), blockTexture(Blocks.DEEPSLATE_IRON_ORE));
        slabBlock((SlabBlock) ModBlocks.DEEPSLATE_IRON_ORE_SLAB.get(), blockTexture(Blocks.DEEPSLATE_IRON_ORE), blockTexture(Blocks.DEEPSLATE_IRON_ORE));
        stairsBlock((StairBlock) ModBlocks.DEEPSLATE_IRON_ORE_STAIRS.get(), blockTexture(Blocks.DEEPSLATE_IRON_ORE));
        buttonBlock((ButtonBlock)ModBlocks.DEEPSLATE_COPPER_ORE_BUTTON.get(), blockTexture(Blocks.DEEPSLATE_COPPER_ORE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.DEEPSLATE_COPPER_ORE_PRESSURE_PLATE.get(), blockTexture(Blocks.DEEPSLATE_COPPER_ORE));
        wallBlock((WallBlock) ModBlocks.DEEPSLATE_COPPER_ORE_WALL.get(), blockTexture(Blocks.DEEPSLATE_COPPER_ORE));
        fenceBlock((FenceBlock) ModBlocks.DEEPSLATE_COPPER_ORE_FENCE.get(), blockTexture(Blocks.DEEPSLATE_COPPER_ORE));

        fenceGateBlock((FenceGateBlock) ModBlocks.DEEPSLATE_COPPER_ORE_FENCE_GATE.get(), blockTexture(Blocks.DEEPSLATE_COPPER_ORE));
        slabBlock((SlabBlock) ModBlocks.DEEPSLATE_COPPER_ORE_SLAB.get(), blockTexture(Blocks.DEEPSLATE_COPPER_ORE), blockTexture(Blocks.DEEPSLATE_COPPER_ORE));
        stairsBlock((StairBlock) ModBlocks.DEEPSLATE_COPPER_ORE_STAIRS.get(), blockTexture(Blocks.DEEPSLATE_COPPER_ORE));
        buttonBlock((ButtonBlock)ModBlocks.DEEPSLATE_GOLD_ORE_BUTTON.get(), blockTexture(Blocks.DEEPSLATE_GOLD_ORE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.DEEPSLATE_GOLD_ORE_PRESSURE_PLATE.get(), blockTexture(Blocks.DEEPSLATE_GOLD_ORE));
        wallBlock((WallBlock) ModBlocks.DEEPSLATE_GOLD_ORE_WALL.get(), blockTexture(Blocks.DEEPSLATE_GOLD_ORE));
        fenceBlock((FenceBlock) ModBlocks.DEEPSLATE_GOLD_ORE_FENCE.get(), blockTexture(Blocks.DEEPSLATE_GOLD_ORE));

        fenceGateBlock((FenceGateBlock) ModBlocks.DEEPSLATE_GOLD_ORE_FENCE_GATE.get(), blockTexture(Blocks.DEEPSLATE_GOLD_ORE));
        slabBlock((SlabBlock) ModBlocks.DEEPSLATE_GOLD_ORE_SLAB.get(), blockTexture(Blocks.DEEPSLATE_GOLD_ORE), blockTexture(Blocks.DEEPSLATE_GOLD_ORE));
        stairsBlock((StairBlock) ModBlocks.DEEPSLATE_GOLD_ORE_STAIRS.get(), blockTexture(Blocks.DEEPSLATE_GOLD_ORE));
        buttonBlock((ButtonBlock)ModBlocks.DEEPSLATE_DIAMOND_ORE_BUTTON.get(), blockTexture(Blocks.DEEPSLATE_DIAMOND_ORE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.DEEPSLATE_DIAMOND_ORE_PRESSURE_PLATE.get(), blockTexture(Blocks.DEEPSLATE_DIAMOND_ORE));
        wallBlock((WallBlock) ModBlocks.DEEPSLATE_DIAMOND_ORE_WALL.get(), blockTexture(Blocks.DEEPSLATE_DIAMOND_ORE));
        fenceBlock((FenceBlock) ModBlocks.DEEPSLATE_DIAMOND_ORE_FENCE.get(), blockTexture(Blocks.DEEPSLATE_DIAMOND_ORE));

        fenceGateBlock((FenceGateBlock) ModBlocks.DEEPSLATE_DIAMOND_ORE_FENCE_GATE.get(), blockTexture(Blocks.DEEPSLATE_DIAMOND_ORE));
        slabBlock((SlabBlock) ModBlocks.DEEPSLATE_DIAMOND_ORE_SLAB.get(), blockTexture(Blocks.DEEPSLATE_DIAMOND_ORE), blockTexture(Blocks.DEEPSLATE_DIAMOND_ORE));
        stairsBlock((StairBlock) ModBlocks.DEEPSLATE_DIAMOND_ORE_STAIRS.get(), blockTexture(Blocks.DEEPSLATE_DIAMOND_ORE));
        buttonBlock((ButtonBlock)ModBlocks.DEEPSLATE_EMERALD_ORE_BUTTON.get(), blockTexture(Blocks.DEEPSLATE_EMERALD_ORE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.DEEPSLATE_EMERALD_ORE_PRESSURE_PLATE.get(), blockTexture(Blocks.DEEPSLATE_EMERALD_ORE));
        wallBlock((WallBlock) ModBlocks.DEEPSLATE_EMERALD_ORE_WALL.get(), blockTexture(Blocks.DEEPSLATE_EMERALD_ORE));
        fenceBlock((FenceBlock) ModBlocks.DEEPSLATE_EMERALD_ORE_FENCE.get(), blockTexture(Blocks.DEEPSLATE_EMERALD_ORE));

        fenceGateBlock((FenceGateBlock) ModBlocks.DEEPSLATE_EMERALD_ORE_FENCE_GATE.get(), blockTexture(Blocks.DEEPSLATE_EMERALD_ORE));
        slabBlock((SlabBlock) ModBlocks.DEEPSLATE_EMERALD_ORE_SLAB.get(), blockTexture(Blocks.DEEPSLATE_EMERALD_ORE), blockTexture(Blocks.DEEPSLATE_EMERALD_ORE));
        stairsBlock((StairBlock) ModBlocks.DEEPSLATE_EMERALD_ORE_STAIRS.get(), blockTexture(Blocks.DEEPSLATE_EMERALD_ORE));
        buttonBlock((ButtonBlock)ModBlocks.COAL_BLOCK_BUTTON.get(), blockTexture(Blocks.COAL_BLOCK));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.COAL_BLOCK_PRESSURE_PLATE.get(), blockTexture(Blocks.COAL_BLOCK));
        wallBlock((WallBlock) ModBlocks.COAL_BLOCK_WALL.get(), blockTexture(Blocks.COAL_BLOCK));
        fenceBlock((FenceBlock) ModBlocks.COAL_BLOCK_FENCE.get(), blockTexture(Blocks.COAL_BLOCK));

        fenceGateBlock((FenceGateBlock) ModBlocks.COAL_BLOCK_FENCE_GATE.get(), blockTexture(Blocks.COAL_BLOCK));
        slabBlock((SlabBlock) ModBlocks.COAL_BLOCK_SLAB.get(), blockTexture(Blocks.COAL_BLOCK), blockTexture(Blocks.COAL_BLOCK));
        stairsBlock((StairBlock) ModBlocks.COAL_BLOCK_STAIRS.get(), blockTexture(Blocks.COAL_BLOCK));
        buttonBlock((ButtonBlock)ModBlocks.LAPIS_BLOCK_BUTTON.get(), blockTexture(Blocks.LAPIS_BLOCK));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.LAPIS_BLOCK_PRESSURE_PLATE.get(), blockTexture(Blocks.LAPIS_BLOCK));
        wallBlock((WallBlock) ModBlocks.LAPIS_BLOCK_WALL.get(), blockTexture(Blocks.LAPIS_BLOCK));
        fenceBlock((FenceBlock) ModBlocks.LAPIS_BLOCK_FENCE.get(), blockTexture(Blocks.LAPIS_BLOCK));

        fenceGateBlock((FenceGateBlock) ModBlocks.LAPIS_BLOCK_FENCE_GATE.get(), blockTexture(Blocks.LAPIS_BLOCK));
        slabBlock((SlabBlock) ModBlocks.LAPIS_BLOCK_SLAB.get(), blockTexture(Blocks.LAPIS_BLOCK), blockTexture(Blocks.LAPIS_BLOCK));
        stairsBlock((StairBlock) ModBlocks.LAPIS_BLOCK_STAIRS.get(), blockTexture(Blocks.LAPIS_BLOCK));
        buttonBlock((ButtonBlock)ModBlocks.RAW_IRON_BLOCK_BUTTON.get(), blockTexture(Blocks.RAW_IRON_BLOCK));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.RAW_IRON_BLOCK_PRESSURE_PLATE.get(), blockTexture(Blocks.RAW_IRON_BLOCK));
        wallBlock((WallBlock) ModBlocks.RAW_IRON_BLOCK_WALL.get(), blockTexture(Blocks.RAW_IRON_BLOCK));
        fenceBlock((FenceBlock) ModBlocks.RAW_IRON_BLOCK_FENCE.get(), blockTexture(Blocks.RAW_IRON_BLOCK));

        fenceGateBlock((FenceGateBlock) ModBlocks.RAW_IRON_BLOCK_FENCE_GATE.get(), blockTexture(Blocks.RAW_IRON_BLOCK));
        slabBlock((SlabBlock) ModBlocks.RAW_IRON_BLOCK_SLAB.get(), blockTexture(Blocks.RAW_IRON_BLOCK), blockTexture(Blocks.RAW_IRON_BLOCK));
        stairsBlock((StairBlock) ModBlocks.RAW_IRON_BLOCK_STAIRS.get(), blockTexture(Blocks.RAW_IRON_BLOCK));
        buttonBlock((ButtonBlock)ModBlocks.RAW_COPPER_BLOCK_BUTTON.get(), blockTexture(Blocks.RAW_COPPER_BLOCK));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.RAW_COPPER_BLOCK_PRESSURE_PLATE.get(), blockTexture(Blocks.RAW_COPPER_BLOCK));
        wallBlock((WallBlock) ModBlocks.RAW_COPPER_BLOCK_WALL.get(), blockTexture(Blocks.RAW_COPPER_BLOCK));
        fenceBlock((FenceBlock) ModBlocks.RAW_COPPER_BLOCK_FENCE.get(), blockTexture(Blocks.RAW_COPPER_BLOCK));

        fenceGateBlock((FenceGateBlock) ModBlocks.RAW_COPPER_BLOCK_FENCE_GATE.get(), blockTexture(Blocks.RAW_COPPER_BLOCK));
        slabBlock((SlabBlock) ModBlocks.RAW_COPPER_BLOCK_SLAB.get(), blockTexture(Blocks.RAW_COPPER_BLOCK), blockTexture(Blocks.RAW_COPPER_BLOCK));
        stairsBlock((StairBlock) ModBlocks.RAW_COPPER_BLOCK_STAIRS.get(), blockTexture(Blocks.RAW_COPPER_BLOCK));
        buttonBlock((ButtonBlock)ModBlocks.RAW_GOLD_BLOCK_BUTTON.get(), blockTexture(Blocks.RAW_GOLD_BLOCK));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.RAW_GOLD_BLOCK_PRESSURE_PLATE.get(), blockTexture(Blocks.RAW_GOLD_BLOCK));
        wallBlock((WallBlock) ModBlocks.RAW_GOLD_BLOCK_WALL.get(), blockTexture(Blocks.RAW_GOLD_BLOCK));
        fenceBlock((FenceBlock) ModBlocks.RAW_GOLD_BLOCK_FENCE.get(), blockTexture(Blocks.RAW_GOLD_BLOCK));

        fenceGateBlock((FenceGateBlock) ModBlocks.RAW_GOLD_BLOCK_FENCE_GATE.get(), blockTexture(Blocks.RAW_GOLD_BLOCK));
        slabBlock((SlabBlock) ModBlocks.RAW_GOLD_BLOCK_SLAB.get(), blockTexture(Blocks.RAW_GOLD_BLOCK), blockTexture(Blocks.RAW_GOLD_BLOCK));
        stairsBlock((StairBlock) ModBlocks.RAW_GOLD_BLOCK_STAIRS.get(), blockTexture(Blocks.RAW_GOLD_BLOCK));
        buttonBlock((ButtonBlock)ModBlocks.AMETHYST_BLOCK_BUTTON.get(), blockTexture(Blocks.AMETHYST_BLOCK));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.AMETHYST_BLOCK_PRESSURE_PLATE.get(), blockTexture(Blocks.AMETHYST_BLOCK));
        wallBlock((WallBlock) ModBlocks.AMETHYST_BLOCK_WALL.get(), blockTexture(Blocks.AMETHYST_BLOCK));
        fenceBlock((FenceBlock) ModBlocks.AMETHYST_BLOCK_FENCE.get(), blockTexture(Blocks.AMETHYST_BLOCK));

        fenceGateBlock((FenceGateBlock) ModBlocks.AMETHYST_BLOCK_FENCE_GATE.get(), blockTexture(Blocks.AMETHYST_BLOCK));
        slabBlock((SlabBlock) ModBlocks.AMETHYST_BLOCK_SLAB.get(), blockTexture(Blocks.AMETHYST_BLOCK), blockTexture(Blocks.AMETHYST_BLOCK));
        stairsBlock((StairBlock) ModBlocks.AMETHYST_BLOCK_STAIRS.get(), blockTexture(Blocks.AMETHYST_BLOCK));
        buttonBlock((ButtonBlock)ModBlocks.IRON_BLOCK_BUTTON.get(), blockTexture(Blocks.IRON_BLOCK));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.IRON_BLOCK_PRESSURE_PLATE.get(), blockTexture(Blocks.IRON_BLOCK));
        wallBlock((WallBlock) ModBlocks.IRON_BLOCK_WALL.get(), blockTexture(Blocks.IRON_BLOCK));
        fenceBlock((FenceBlock) ModBlocks.IRON_BLOCK_FENCE.get(), blockTexture(Blocks.IRON_BLOCK));

        fenceGateBlock((FenceGateBlock) ModBlocks.IRON_BLOCK_FENCE_GATE.get(), blockTexture(Blocks.IRON_BLOCK));
        slabBlock((SlabBlock) ModBlocks.IRON_BLOCK_SLAB.get(), blockTexture(Blocks.IRON_BLOCK), blockTexture(Blocks.IRON_BLOCK));
        stairsBlock((StairBlock) ModBlocks.IRON_BLOCK_STAIRS.get(), blockTexture(Blocks.IRON_BLOCK));
        buttonBlock((ButtonBlock)ModBlocks.COPPER_BLOCK_BUTTON.get(), blockTexture(Blocks.COPPER_BLOCK));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.COPPER_BLOCK_PRESSURE_PLATE.get(), blockTexture(Blocks.COPPER_BLOCK));
        wallBlock((WallBlock) ModBlocks.COPPER_BLOCK_WALL.get(), blockTexture(Blocks.COPPER_BLOCK));
        fenceBlock((FenceBlock) ModBlocks.COPPER_BLOCK_FENCE.get(), blockTexture(Blocks.COPPER_BLOCK));

        fenceGateBlock((FenceGateBlock) ModBlocks.COPPER_BLOCK_FENCE_GATE.get(), blockTexture(Blocks.COPPER_BLOCK));
        slabBlock((SlabBlock) ModBlocks.COPPER_BLOCK_SLAB.get(), blockTexture(Blocks.COPPER_BLOCK), blockTexture(Blocks.COPPER_BLOCK));
        stairsBlock((StairBlock) ModBlocks.COPPER_BLOCK_STAIRS.get(), blockTexture(Blocks.COPPER_BLOCK));
        buttonBlock((ButtonBlock)ModBlocks.GOLD_BLOCK_BUTTON.get(), blockTexture(Blocks.GOLD_BLOCK));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.GOLD_BLOCK_PRESSURE_PLATE.get(), blockTexture(Blocks.GOLD_BLOCK));
        wallBlock((WallBlock) ModBlocks.GOLD_BLOCK_WALL.get(), blockTexture(Blocks.GOLD_BLOCK));
        fenceBlock((FenceBlock) ModBlocks.GOLD_BLOCK_FENCE.get(), blockTexture(Blocks.GOLD_BLOCK));

        fenceGateBlock((FenceGateBlock) ModBlocks.GOLD_BLOCK_FENCE_GATE.get(), blockTexture(Blocks.GOLD_BLOCK));
        slabBlock((SlabBlock) ModBlocks.GOLD_BLOCK_SLAB.get(), blockTexture(Blocks.GOLD_BLOCK), blockTexture(Blocks.GOLD_BLOCK));
        stairsBlock((StairBlock) ModBlocks.GOLD_BLOCK_STAIRS.get(), blockTexture(Blocks.GOLD_BLOCK));
        buttonBlock((ButtonBlock)ModBlocks.DIAMOND_BLOCK_BUTTON.get(), blockTexture(Blocks.DIAMOND_BLOCK));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.DIAMOND_BLOCK_PRESSURE_PLATE.get(), blockTexture(Blocks.DIAMOND_BLOCK));
        wallBlock((WallBlock) ModBlocks.DIAMOND_BLOCK_WALL.get(), blockTexture(Blocks.DIAMOND_BLOCK));
        fenceBlock((FenceBlock) ModBlocks.DIAMOND_BLOCK_FENCE.get(), blockTexture(Blocks.DIAMOND_BLOCK));

        fenceGateBlock((FenceGateBlock) ModBlocks.DIAMOND_BLOCK_FENCE_GATE.get(), blockTexture(Blocks.DIAMOND_BLOCK));
        slabBlock((SlabBlock) ModBlocks.DIAMOND_BLOCK_SLAB.get(), blockTexture(Blocks.DIAMOND_BLOCK), blockTexture(Blocks.DIAMOND_BLOCK));
        stairsBlock((StairBlock) ModBlocks.DIAMOND_BLOCK_STAIRS.get(), blockTexture(Blocks.DIAMOND_BLOCK));
        buttonBlock((ButtonBlock)ModBlocks.NETHERITE_BLOCK_BUTTON.get(), blockTexture(Blocks.NETHERITE_BLOCK));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.NETHERITE_BLOCK_PRESSURE_PLATE.get(), blockTexture(Blocks.NETHERITE_BLOCK));
        wallBlock((WallBlock) ModBlocks.NETHERITE_BLOCK_WALL.get(), blockTexture(Blocks.NETHERITE_BLOCK));
        fenceBlock((FenceBlock) ModBlocks.NETHERITE_BLOCK_FENCE.get(), blockTexture(Blocks.NETHERITE_BLOCK));

        fenceGateBlock((FenceGateBlock) ModBlocks.NETHERITE_BLOCK_FENCE_GATE.get(), blockTexture(Blocks.NETHERITE_BLOCK));
        slabBlock((SlabBlock) ModBlocks.NETHERITE_BLOCK_SLAB.get(), blockTexture(Blocks.NETHERITE_BLOCK), blockTexture(Blocks.NETHERITE_BLOCK));
        stairsBlock((StairBlock) ModBlocks.NETHERITE_BLOCK_STAIRS.get(), blockTexture(Blocks.NETHERITE_BLOCK));
        buttonBlock((ButtonBlock)ModBlocks.MOSS_BLOCK_BUTTON.get(), blockTexture(Blocks.MOSS_BLOCK));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.MOSS_BLOCK_PRESSURE_PLATE.get(), blockTexture(Blocks.MOSS_BLOCK));
        wallBlock((WallBlock) ModBlocks.MOSS_BLOCK_WALL.get(), blockTexture(Blocks.MOSS_BLOCK));
        fenceBlock((FenceBlock) ModBlocks.MOSS_BLOCK_FENCE.get(), blockTexture(Blocks.MOSS_BLOCK));

        fenceGateBlock((FenceGateBlock) ModBlocks.MOSS_BLOCK_FENCE_GATE.get(), blockTexture(Blocks.MOSS_BLOCK));
        slabBlock((SlabBlock) ModBlocks.MOSS_BLOCK_SLAB.get(), blockTexture(Blocks.MOSS_BLOCK), blockTexture(Blocks.MOSS_BLOCK));
        stairsBlock((StairBlock) ModBlocks.MOSS_BLOCK_STAIRS.get(), blockTexture(Blocks.MOSS_BLOCK));
        buttonBlock((ButtonBlock)ModBlocks.DRIPSTONE_BLOCK_BUTTON.get(), blockTexture(Blocks.DRIPSTONE_BLOCK));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.DRIPSTONE_BLOCK_PRESSURE_PLATE.get(), blockTexture(Blocks.DRIPSTONE_BLOCK));
        wallBlock((WallBlock) ModBlocks.DRIPSTONE_BLOCK_WALL.get(), blockTexture(Blocks.DRIPSTONE_BLOCK));
        fenceBlock((FenceBlock) ModBlocks.DRIPSTONE_BLOCK_FENCE.get(), blockTexture(Blocks.DRIPSTONE_BLOCK));

        fenceGateBlock((FenceGateBlock) ModBlocks.DRIPSTONE_BLOCK_FENCE_GATE.get(), blockTexture(Blocks.DRIPSTONE_BLOCK));
        slabBlock((SlabBlock) ModBlocks.DRIPSTONE_BLOCK_SLAB.get(), blockTexture(Blocks.DRIPSTONE_BLOCK), blockTexture(Blocks.DRIPSTONE_BLOCK));
        stairsBlock((StairBlock) ModBlocks.DRIPSTONE_BLOCK_STAIRS.get(), blockTexture(Blocks.DRIPSTONE_BLOCK));
        buttonBlock((ButtonBlock)ModBlocks.PURPUR_BLOCK_BUTTON.get(), blockTexture(Blocks.PURPUR_BLOCK));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.PURPUR_BLOCK_PRESSURE_PLATE.get(), blockTexture(Blocks.PURPUR_BLOCK));
        wallBlock((WallBlock) ModBlocks.PURPUR_BLOCK_WALL.get(), blockTexture(Blocks.PURPUR_BLOCK));
        fenceBlock((FenceBlock) ModBlocks.PURPUR_BLOCK_FENCE.get(), blockTexture(Blocks.PURPUR_BLOCK));

        fenceGateBlock((FenceGateBlock) ModBlocks.PURPUR_BLOCK_FENCE_GATE.get(), blockTexture(Blocks.PURPUR_BLOCK));
        slabBlock((SlabBlock) ModBlocks.PURPUR_BLOCK_SLAB.get(), blockTexture(Blocks.PURPUR_BLOCK), blockTexture(Blocks.PURPUR_BLOCK));
        stairsBlock((StairBlock) ModBlocks.PURPUR_BLOCK_STAIRS.get(), blockTexture(Blocks.PURPUR_BLOCK));
        buttonBlock((ButtonBlock)ModBlocks.BROWN_MUSHROOM_BLOCK_BUTTON.get(), blockTexture(Blocks.BROWN_MUSHROOM_BLOCK));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.BROWN_MUSHROOM_BLOCK_PRESSURE_PLATE.get(), blockTexture(Blocks.BROWN_MUSHROOM_BLOCK));
        wallBlock((WallBlock) ModBlocks.BROWN_MUSHROOM_BLOCK_WALL.get(), blockTexture(Blocks.BROWN_MUSHROOM_BLOCK));
        fenceBlock((FenceBlock) ModBlocks.BROWN_MUSHROOM_BLOCK_FENCE.get(), blockTexture(Blocks.BROWN_MUSHROOM_BLOCK));

        fenceGateBlock((FenceGateBlock) ModBlocks.BROWN_MUSHROOM_BLOCK_FENCE_GATE.get(), blockTexture(Blocks.BROWN_MUSHROOM_BLOCK));
        slabBlock((SlabBlock) ModBlocks.BROWN_MUSHROOM_BLOCK_SLAB.get(), blockTexture(Blocks.BROWN_MUSHROOM_BLOCK), blockTexture(Blocks.BROWN_MUSHROOM_BLOCK));
        stairsBlock((StairBlock) ModBlocks.BROWN_MUSHROOM_BLOCK_STAIRS.get(), blockTexture(Blocks.BROWN_MUSHROOM_BLOCK));
        buttonBlock((ButtonBlock)ModBlocks.RED_MUSHROOM_BLOCK_BUTTON.get(), blockTexture(Blocks.RED_MUSHROOM_BLOCK));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.RED_MUSHROOM_BLOCK_PRESSURE_PLATE.get(), blockTexture(Blocks.RED_MUSHROOM_BLOCK));
        wallBlock((WallBlock) ModBlocks.RED_MUSHROOM_BLOCK_WALL.get(), blockTexture(Blocks.RED_MUSHROOM_BLOCK));
        fenceBlock((FenceBlock) ModBlocks.RED_MUSHROOM_BLOCK_FENCE.get(), blockTexture(Blocks.RED_MUSHROOM_BLOCK));

        fenceGateBlock((FenceGateBlock) ModBlocks.RED_MUSHROOM_BLOCK_FENCE_GATE.get(), blockTexture(Blocks.RED_MUSHROOM_BLOCK));
        slabBlock((SlabBlock) ModBlocks.RED_MUSHROOM_BLOCK_SLAB.get(), blockTexture(Blocks.RED_MUSHROOM_BLOCK), blockTexture(Blocks.RED_MUSHROOM_BLOCK));
        stairsBlock((StairBlock) ModBlocks.RED_MUSHROOM_BLOCK_STAIRS.get(), blockTexture(Blocks.RED_MUSHROOM_BLOCK));
        buttonBlock((ButtonBlock)ModBlocks.EMERALD_BLOCK_BUTTON.get(), blockTexture(Blocks.EMERALD_BLOCK));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.EMERALD_BLOCK_PRESSURE_PLATE.get(), blockTexture(Blocks.EMERALD_BLOCK));
        wallBlock((WallBlock) ModBlocks.EMERALD_BLOCK_WALL.get(), blockTexture(Blocks.EMERALD_BLOCK));
        fenceBlock((FenceBlock) ModBlocks.EMERALD_BLOCK_FENCE.get(), blockTexture(Blocks.EMERALD_BLOCK));

        fenceGateBlock((FenceGateBlock) ModBlocks.EMERALD_BLOCK_FENCE_GATE.get(), blockTexture(Blocks.EMERALD_BLOCK));
        slabBlock((SlabBlock) ModBlocks.EMERALD_BLOCK_SLAB.get(), blockTexture(Blocks.EMERALD_BLOCK), blockTexture(Blocks.EMERALD_BLOCK));
        stairsBlock((StairBlock) ModBlocks.EMERALD_BLOCK_STAIRS.get(), blockTexture(Blocks.EMERALD_BLOCK));
        buttonBlock((ButtonBlock)ModBlocks.STONE_BUTTON.get(), blockTexture(Blocks.STONE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.STONE_PRESSURE_PLATE.get(), blockTexture(Blocks.STONE));
        wallBlock((WallBlock) ModBlocks.STONE_WALL.get(), blockTexture(Blocks.STONE));
        fenceBlock((FenceBlock) ModBlocks.STONE_FENCE.get(), blockTexture(Blocks.STONE));

        fenceGateBlock((FenceGateBlock) ModBlocks.STONE_FENCE_GATE.get(), blockTexture(Blocks.STONE));
        slabBlock((SlabBlock) ModBlocks.STONE_SLAB.get(), blockTexture(Blocks.STONE), blockTexture(Blocks.STONE));
        stairsBlock((StairBlock) ModBlocks.STONE_STAIRS.get(), blockTexture(Blocks.STONE));
        buttonBlock((ButtonBlock)ModBlocks.GRANITE_BUTTON.get(), blockTexture(Blocks.GRANITE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.GRANITE_PRESSURE_PLATE.get(), blockTexture(Blocks.GRANITE));
        wallBlock((WallBlock) ModBlocks.GRANITE_WALL.get(), blockTexture(Blocks.GRANITE));
        fenceBlock((FenceBlock) ModBlocks.GRANITE_FENCE.get(), blockTexture(Blocks.GRANITE));

        fenceGateBlock((FenceGateBlock) ModBlocks.GRANITE_FENCE_GATE.get(), blockTexture(Blocks.GRANITE));
        slabBlock((SlabBlock) ModBlocks.GRANITE_SLAB.get(), blockTexture(Blocks.GRANITE), blockTexture(Blocks.GRANITE));
        stairsBlock((StairBlock) ModBlocks.GRANITE_STAIRS.get(), blockTexture(Blocks.GRANITE));
        buttonBlock((ButtonBlock)ModBlocks.POLISHED_GRANITE_BUTTON.get(), blockTexture(Blocks.POLISHED_GRANITE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.POLISHED_GRANITE_PRESSURE_PLATE.get(), blockTexture(Blocks.POLISHED_GRANITE));
        wallBlock((WallBlock) ModBlocks.POLISHED_GRANITE_WALL.get(), blockTexture(Blocks.POLISHED_GRANITE));
        fenceBlock((FenceBlock) ModBlocks.POLISHED_GRANITE_FENCE.get(), blockTexture(Blocks.POLISHED_GRANITE));

        fenceGateBlock((FenceGateBlock) ModBlocks.POLISHED_GRANITE_FENCE_GATE.get(), blockTexture(Blocks.POLISHED_GRANITE));
        slabBlock((SlabBlock) ModBlocks.POLISHED_GRANITE_SLAB.get(), blockTexture(Blocks.POLISHED_GRANITE), blockTexture(Blocks.POLISHED_GRANITE));
        stairsBlock((StairBlock) ModBlocks.POLISHED_GRANITE_STAIRS.get(), blockTexture(Blocks.POLISHED_GRANITE));
        buttonBlock((ButtonBlock)ModBlocks.DIORITE_BUTTON.get(), blockTexture(Blocks.DIORITE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.DIORITE_PRESSURE_PLATE.get(), blockTexture(Blocks.DIORITE));
        wallBlock((WallBlock) ModBlocks.DIORITE_WALL.get(), blockTexture(Blocks.DIORITE));
        fenceBlock((FenceBlock) ModBlocks.DIORITE_FENCE.get(), blockTexture(Blocks.DIORITE));

        fenceGateBlock((FenceGateBlock) ModBlocks.DIORITE_FENCE_GATE.get(), blockTexture(Blocks.DIORITE));
        slabBlock((SlabBlock) ModBlocks.DIORITE_SLAB.get(), blockTexture(Blocks.DIORITE), blockTexture(Blocks.DIORITE));
        stairsBlock((StairBlock) ModBlocks.DIORITE_STAIRS.get(), blockTexture(Blocks.DIORITE));
        buttonBlock((ButtonBlock)ModBlocks.POLISHED_DIORITE_BUTTON.get(), blockTexture(Blocks.POLISHED_DIORITE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.POLISHED_DIORITE_PRESSURE_PLATE.get(), blockTexture(Blocks.POLISHED_DIORITE));
        wallBlock((WallBlock) ModBlocks.POLISHED_DIORITE_WALL.get(), blockTexture(Blocks.POLISHED_DIORITE));
        fenceBlock((FenceBlock) ModBlocks.POLISHED_DIORITE_FENCE.get(), blockTexture(Blocks.POLISHED_DIORITE));

        fenceGateBlock((FenceGateBlock) ModBlocks.POLISHED_DIORITE_FENCE_GATE.get(), blockTexture(Blocks.POLISHED_DIORITE));
        slabBlock((SlabBlock) ModBlocks.POLISHED_DIORITE_SLAB.get(), blockTexture(Blocks.POLISHED_DIORITE), blockTexture(Blocks.POLISHED_DIORITE));
        stairsBlock((StairBlock) ModBlocks.POLISHED_DIORITE_STAIRS.get(), blockTexture(Blocks.POLISHED_DIORITE));
        buttonBlock((ButtonBlock)ModBlocks.ANDESITE_BUTTON.get(), blockTexture(Blocks.ANDESITE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.ANDESITE_PRESSURE_PLATE.get(), blockTexture(Blocks.ANDESITE));
        wallBlock((WallBlock) ModBlocks.ANDESITE_WALL.get(), blockTexture(Blocks.ANDESITE));
        fenceBlock((FenceBlock) ModBlocks.ANDESITE_FENCE.get(), blockTexture(Blocks.ANDESITE));

        fenceGateBlock((FenceGateBlock) ModBlocks.ANDESITE_FENCE_GATE.get(), blockTexture(Blocks.ANDESITE));
        slabBlock((SlabBlock) ModBlocks.ANDESITE_SLAB.get(), blockTexture(Blocks.ANDESITE), blockTexture(Blocks.ANDESITE));
        stairsBlock((StairBlock) ModBlocks.ANDESITE_STAIRS.get(), blockTexture(Blocks.ANDESITE));
        buttonBlock((ButtonBlock)ModBlocks.POLISHED_ANDESITE_BUTTON.get(), blockTexture(Blocks.POLISHED_ANDESITE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.POLISHED_ANDESITE_PRESSURE_PLATE.get(), blockTexture(Blocks.POLISHED_ANDESITE));
        wallBlock((WallBlock) ModBlocks.POLISHED_ANDESITE_WALL.get(), blockTexture(Blocks.POLISHED_ANDESITE));
        fenceBlock((FenceBlock) ModBlocks.POLISHED_ANDESITE_FENCE.get(), blockTexture(Blocks.POLISHED_ANDESITE));

        fenceGateBlock((FenceGateBlock) ModBlocks.POLISHED_ANDESITE_FENCE_GATE.get(), blockTexture(Blocks.POLISHED_ANDESITE));
        slabBlock((SlabBlock) ModBlocks.POLISHED_ANDESITE_SLAB.get(), blockTexture(Blocks.POLISHED_ANDESITE), blockTexture(Blocks.POLISHED_ANDESITE));
        stairsBlock((StairBlock) ModBlocks.POLISHED_ANDESITE_STAIRS.get(), blockTexture(Blocks.POLISHED_ANDESITE));
        buttonBlock((ButtonBlock)ModBlocks.COBBLED_DEEPSLATE_BUTTON.get(), blockTexture(Blocks.COBBLED_DEEPSLATE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.COBBLED_DEEPSLATE_PRESSURE_PLATE.get(), blockTexture(Blocks.COBBLED_DEEPSLATE));
        wallBlock((WallBlock) ModBlocks.COBBLED_DEEPSLATE_WALL.get(), blockTexture(Blocks.COBBLED_DEEPSLATE));
        fenceBlock((FenceBlock) ModBlocks.COBBLED_DEEPSLATE_FENCE.get(), blockTexture(Blocks.COBBLED_DEEPSLATE));

        fenceGateBlock((FenceGateBlock) ModBlocks.COBBLED_DEEPSLATE_FENCE_GATE.get(), blockTexture(Blocks.COBBLED_DEEPSLATE));
        slabBlock((SlabBlock) ModBlocks.COBBLED_DEEPSLATE_SLAB.get(), blockTexture(Blocks.COBBLED_DEEPSLATE), blockTexture(Blocks.COBBLED_DEEPSLATE));
        stairsBlock((StairBlock) ModBlocks.COBBLED_DEEPSLATE_STAIRS.get(), blockTexture(Blocks.COBBLED_DEEPSLATE));
        buttonBlock((ButtonBlock)ModBlocks.POLISHED_DEEPSLATE_BUTTON.get(), blockTexture(Blocks.POLISHED_DEEPSLATE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE.get(), blockTexture(Blocks.POLISHED_DEEPSLATE));
        wallBlock((WallBlock) ModBlocks.POLISHED_DEEPSLATE_WALL.get(), blockTexture(Blocks.POLISHED_DEEPSLATE));
        fenceBlock((FenceBlock) ModBlocks.POLISHED_DEEPSLATE_FENCE.get(), blockTexture(Blocks.POLISHED_DEEPSLATE));

        fenceGateBlock((FenceGateBlock) ModBlocks.POLISHED_DEEPSLATE_FENCE_GATE.get(), blockTexture(Blocks.POLISHED_DEEPSLATE));
        slabBlock((SlabBlock) ModBlocks.POLISHED_DEEPSLATE_SLAB.get(), blockTexture(Blocks.POLISHED_DEEPSLATE), blockTexture(Blocks.POLISHED_DEEPSLATE));
        stairsBlock((StairBlock) ModBlocks.POLISHED_DEEPSLATE_STAIRS.get(), blockTexture(Blocks.POLISHED_DEEPSLATE));
        buttonBlock((ButtonBlock)ModBlocks.CALCITE_BUTTON.get(), blockTexture(Blocks.CALCITE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.CALCITE_PRESSURE_PLATE.get(), blockTexture(Blocks.CALCITE));
        wallBlock((WallBlock) ModBlocks.CALCITE_WALL.get(), blockTexture(Blocks.CALCITE));
        fenceBlock((FenceBlock) ModBlocks.CALCITE_FENCE.get(), blockTexture(Blocks.CALCITE));

        fenceGateBlock((FenceGateBlock) ModBlocks.CALCITE_FENCE_GATE.get(), blockTexture(Blocks.CALCITE));
        slabBlock((SlabBlock) ModBlocks.CALCITE_SLAB.get(), blockTexture(Blocks.CALCITE), blockTexture(Blocks.CALCITE));
        stairsBlock((StairBlock) ModBlocks.CALCITE_STAIRS.get(), blockTexture(Blocks.CALCITE));
        buttonBlock((ButtonBlock)ModBlocks.TUFF_BUTTON.get(), blockTexture(Blocks.TUFF));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.TUFF_PRESSURE_PLATE.get(), blockTexture(Blocks.TUFF));
        wallBlock((WallBlock) ModBlocks.TUFF_WALL.get(), blockTexture(Blocks.TUFF));
        fenceBlock((FenceBlock) ModBlocks.TUFF_FENCE.get(), blockTexture(Blocks.TUFF));

        fenceGateBlock((FenceGateBlock) ModBlocks.TUFF_FENCE_GATE.get(), blockTexture(Blocks.TUFF));
        slabBlock((SlabBlock) ModBlocks.TUFF_SLAB.get(), blockTexture(Blocks.TUFF), blockTexture(Blocks.TUFF));
        stairsBlock((StairBlock) ModBlocks.TUFF_STAIRS.get(), blockTexture(Blocks.TUFF));
        buttonBlock((ButtonBlock)ModBlocks.DIRT_BUTTON.get(), blockTexture(Blocks.DIRT));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.DIRT_PRESSURE_PLATE.get(), blockTexture(Blocks.DIRT));
        wallBlock((WallBlock) ModBlocks.DIRT_WALL.get(), blockTexture(Blocks.DIRT));
        fenceBlock((FenceBlock) ModBlocks.DIRT_FENCE.get(), blockTexture(Blocks.DIRT));

        fenceGateBlock((FenceGateBlock) ModBlocks.DIRT_FENCE_GATE.get(), blockTexture(Blocks.DIRT));
        slabBlock((SlabBlock) ModBlocks.DIRT_SLAB.get(), blockTexture(Blocks.DIRT), blockTexture(Blocks.DIRT));
        stairsBlock((StairBlock) ModBlocks.DIRT_STAIRS.get(), blockTexture(Blocks.DIRT));
        buttonBlock((ButtonBlock)ModBlocks.COARSE_DIRT_BUTTON.get(), blockTexture(Blocks.COARSE_DIRT));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.COARSE_DIRT_PRESSURE_PLATE.get(), blockTexture(Blocks.COARSE_DIRT));
        wallBlock((WallBlock) ModBlocks.COARSE_DIRT_WALL.get(), blockTexture(Blocks.COARSE_DIRT));
        fenceBlock((FenceBlock) ModBlocks.COARSE_DIRT_FENCE.get(), blockTexture(Blocks.COARSE_DIRT));

        fenceGateBlock((FenceGateBlock) ModBlocks.COARSE_DIRT_FENCE_GATE.get(), blockTexture(Blocks.COARSE_DIRT));
        slabBlock((SlabBlock) ModBlocks.COARSE_DIRT_SLAB.get(), blockTexture(Blocks.COARSE_DIRT), blockTexture(Blocks.COARSE_DIRT));
        stairsBlock((StairBlock) ModBlocks.COARSE_DIRT_STAIRS.get(), blockTexture(Blocks.COARSE_DIRT));
        buttonBlock((ButtonBlock)ModBlocks.ROOTED_DIRT_BUTTON.get(), blockTexture(Blocks.ROOTED_DIRT));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.ROOTED_DIRT_PRESSURE_PLATE.get(), blockTexture(Blocks.ROOTED_DIRT));
        wallBlock((WallBlock) ModBlocks.ROOTED_DIRT_WALL.get(), blockTexture(Blocks.ROOTED_DIRT));
        fenceBlock((FenceBlock) ModBlocks.ROOTED_DIRT_FENCE.get(), blockTexture(Blocks.ROOTED_DIRT));

        fenceGateBlock((FenceGateBlock) ModBlocks.ROOTED_DIRT_FENCE_GATE.get(), blockTexture(Blocks.ROOTED_DIRT));
        slabBlock((SlabBlock) ModBlocks.ROOTED_DIRT_SLAB.get(), blockTexture(Blocks.ROOTED_DIRT), blockTexture(Blocks.ROOTED_DIRT));
        stairsBlock((StairBlock) ModBlocks.ROOTED_DIRT_STAIRS.get(), blockTexture(Blocks.ROOTED_DIRT));
        buttonBlock((ButtonBlock)ModBlocks.MUD_BUTTON.get(), blockTexture(Blocks.MUD));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.MUD_PRESSURE_PLATE.get(), blockTexture(Blocks.MUD));
        wallBlock((WallBlock) ModBlocks.MUD_WALL.get(), blockTexture(Blocks.MUD));
        fenceBlock((FenceBlock) ModBlocks.MUD_FENCE.get(), blockTexture(Blocks.MUD));

        fenceGateBlock((FenceGateBlock) ModBlocks.MUD_FENCE_GATE.get(), blockTexture(Blocks.MUD));
        slabBlock((SlabBlock) ModBlocks.MUD_SLAB.get(), blockTexture(Blocks.MUD), blockTexture(Blocks.MUD));
        stairsBlock((StairBlock) ModBlocks.MUD_STAIRS.get(), blockTexture(Blocks.MUD));
        buttonBlock((ButtonBlock)ModBlocks.COBBLESTONE_BUTTON.get(), blockTexture(Blocks.COBBLESTONE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.COBBLESTONE_PRESSURE_PLATE.get(), blockTexture(Blocks.COBBLESTONE));
        wallBlock((WallBlock) ModBlocks.COBBLESTONE_WALL.get(), blockTexture(Blocks.COBBLESTONE));
        fenceBlock((FenceBlock) ModBlocks.COBBLESTONE_FENCE.get(), blockTexture(Blocks.COBBLESTONE));

        fenceGateBlock((FenceGateBlock) ModBlocks.COBBLESTONE_FENCE_GATE.get(), blockTexture(Blocks.COBBLESTONE));
        slabBlock((SlabBlock) ModBlocks.COBBLESTONE_SLAB.get(), blockTexture(Blocks.COBBLESTONE), blockTexture(Blocks.COBBLESTONE));
        stairsBlock((StairBlock) ModBlocks.COBBLESTONE_STAIRS.get(), blockTexture(Blocks.COBBLESTONE));
        buttonBlock((ButtonBlock)ModBlocks.OAK_PLANKS_BUTTON.get(), blockTexture(Blocks.OAK_PLANKS));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.OAK_PLANKS_PRESSURE_PLATE.get(), blockTexture(Blocks.OAK_PLANKS));
        wallBlock((WallBlock) ModBlocks.OAK_PLANKS_WALL.get(), blockTexture(Blocks.OAK_PLANKS));
        fenceBlock((FenceBlock) ModBlocks.OAK_PLANKS_FENCE.get(), blockTexture(Blocks.OAK_PLANKS));

        fenceGateBlock((FenceGateBlock) ModBlocks.OAK_PLANKS_FENCE_GATE.get(), blockTexture(Blocks.OAK_PLANKS));
        slabBlock((SlabBlock) ModBlocks.OAK_PLANKS_SLAB.get(), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS));
        stairsBlock((StairBlock) ModBlocks.OAK_PLANKS_STAIRS.get(), blockTexture(Blocks.OAK_PLANKS));
        buttonBlock((ButtonBlock)ModBlocks.SPRUCE_PLANKS_BUTTON.get(), blockTexture(Blocks.SPRUCE_PLANKS));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.SPRUCE_PLANKS_PRESSURE_PLATE.get(), blockTexture(Blocks.SPRUCE_PLANKS));
        wallBlock((WallBlock) ModBlocks.SPRUCE_PLANKS_WALL.get(), blockTexture(Blocks.SPRUCE_PLANKS));
        fenceBlock((FenceBlock) ModBlocks.SPRUCE_PLANKS_FENCE.get(), blockTexture(Blocks.SPRUCE_PLANKS));

        fenceGateBlock((FenceGateBlock) ModBlocks.SPRUCE_PLANKS_FENCE_GATE.get(), blockTexture(Blocks.SPRUCE_PLANKS));
        slabBlock((SlabBlock) ModBlocks.SPRUCE_PLANKS_SLAB.get(), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS));
        stairsBlock((StairBlock) ModBlocks.SPRUCE_PLANKS_STAIRS.get(), blockTexture(Blocks.SPRUCE_PLANKS));
        buttonBlock((ButtonBlock)ModBlocks.BIRCH_PLANKS_BUTTON.get(), blockTexture(Blocks.BIRCH_PLANKS));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.BIRCH_PLANKS_PRESSURE_PLATE.get(), blockTexture(Blocks.BIRCH_PLANKS));
        wallBlock((WallBlock) ModBlocks.BIRCH_PLANKS_WALL.get(), blockTexture(Blocks.BIRCH_PLANKS));
        fenceBlock((FenceBlock) ModBlocks.BIRCH_PLANKS_FENCE.get(), blockTexture(Blocks.BIRCH_PLANKS));

        fenceGateBlock((FenceGateBlock) ModBlocks.BIRCH_PLANKS_FENCE_GATE.get(), blockTexture(Blocks.BIRCH_PLANKS));
        slabBlock((SlabBlock) ModBlocks.BIRCH_PLANKS_SLAB.get(), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS));
        stairsBlock((StairBlock) ModBlocks.BIRCH_PLANKS_STAIRS.get(), blockTexture(Blocks.BIRCH_PLANKS));
        buttonBlock((ButtonBlock)ModBlocks.JUNGLE_PLANKS_BUTTON.get(), blockTexture(Blocks.JUNGLE_PLANKS));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.JUNGLE_PLANKS_PRESSURE_PLATE.get(), blockTexture(Blocks.JUNGLE_PLANKS));
        wallBlock((WallBlock) ModBlocks.JUNGLE_PLANKS_WALL.get(), blockTexture(Blocks.JUNGLE_PLANKS));
        fenceBlock((FenceBlock) ModBlocks.JUNGLE_PLANKS_FENCE.get(), blockTexture(Blocks.JUNGLE_PLANKS));

        fenceGateBlock((FenceGateBlock) ModBlocks.JUNGLE_PLANKS_FENCE_GATE.get(), blockTexture(Blocks.JUNGLE_PLANKS));
        slabBlock((SlabBlock) ModBlocks.JUNGLE_PLANKS_SLAB.get(), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS));
        stairsBlock((StairBlock) ModBlocks.JUNGLE_PLANKS_STAIRS.get(), blockTexture(Blocks.JUNGLE_PLANKS));
        buttonBlock((ButtonBlock)ModBlocks.ACACIA_PLANKS_BUTTON.get(), blockTexture(Blocks.ACACIA_PLANKS));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.ACACIA_PLANKS_PRESSURE_PLATE.get(), blockTexture(Blocks.ACACIA_PLANKS));
        wallBlock((WallBlock) ModBlocks.ACACIA_PLANKS_WALL.get(), blockTexture(Blocks.ACACIA_PLANKS));
        fenceBlock((FenceBlock) ModBlocks.ACACIA_PLANKS_FENCE.get(), blockTexture(Blocks.ACACIA_PLANKS));

        fenceGateBlock((FenceGateBlock) ModBlocks.ACACIA_PLANKS_FENCE_GATE.get(), blockTexture(Blocks.ACACIA_PLANKS));
        slabBlock((SlabBlock) ModBlocks.ACACIA_PLANKS_SLAB.get(), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS));
        stairsBlock((StairBlock) ModBlocks.ACACIA_PLANKS_STAIRS.get(), blockTexture(Blocks.ACACIA_PLANKS));
        buttonBlock((ButtonBlock)ModBlocks.DARK_OAK_PLANKS_BUTTON.get(), blockTexture(Blocks.DARK_OAK_PLANKS));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.DARK_OAK_PLANKS_PRESSURE_PLATE.get(), blockTexture(Blocks.DARK_OAK_PLANKS));
        wallBlock((WallBlock) ModBlocks.DARK_OAK_PLANKS_WALL.get(), blockTexture(Blocks.DARK_OAK_PLANKS));
        fenceBlock((FenceBlock) ModBlocks.DARK_OAK_PLANKS_FENCE.get(), blockTexture(Blocks.DARK_OAK_PLANKS));

        fenceGateBlock((FenceGateBlock) ModBlocks.DARK_OAK_PLANKS_FENCE_GATE.get(), blockTexture(Blocks.DARK_OAK_PLANKS));
        slabBlock((SlabBlock) ModBlocks.DARK_OAK_PLANKS_SLAB.get(), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS));
        stairsBlock((StairBlock) ModBlocks.DARK_OAK_PLANKS_STAIRS.get(), blockTexture(Blocks.DARK_OAK_PLANKS));
        buttonBlock((ButtonBlock)ModBlocks.MANGROVE_PLANKS_BUTTON.get(), blockTexture(Blocks.MANGROVE_PLANKS));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.MANGROVE_PLANKS_PRESSURE_PLATE.get(), blockTexture(Blocks.MANGROVE_PLANKS));
        wallBlock((WallBlock) ModBlocks.MANGROVE_PLANKS_WALL.get(), blockTexture(Blocks.MANGROVE_PLANKS));
        fenceBlock((FenceBlock) ModBlocks.MANGROVE_PLANKS_FENCE.get(), blockTexture(Blocks.MANGROVE_PLANKS));

        fenceGateBlock((FenceGateBlock) ModBlocks.MANGROVE_PLANKS_FENCE_GATE.get(), blockTexture(Blocks.MANGROVE_PLANKS));
        slabBlock((SlabBlock) ModBlocks.MANGROVE_PLANKS_SLAB.get(), blockTexture(Blocks.MANGROVE_PLANKS), blockTexture(Blocks.MANGROVE_PLANKS));
        stairsBlock((StairBlock) ModBlocks.MANGROVE_PLANKS_STAIRS.get(), blockTexture(Blocks.MANGROVE_PLANKS));
        buttonBlock((ButtonBlock)ModBlocks.CRIMSON_PLANKS_BUTTON.get(), blockTexture(Blocks.CRIMSON_PLANKS));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.CRIMSON_PLANKS_PRESSURE_PLATE.get(), blockTexture(Blocks.CRIMSON_PLANKS));
        wallBlock((WallBlock) ModBlocks.CRIMSON_PLANKS_WALL.get(), blockTexture(Blocks.CRIMSON_PLANKS));
        fenceBlock((FenceBlock) ModBlocks.CRIMSON_PLANKS_FENCE.get(), blockTexture(Blocks.CRIMSON_PLANKS));

        fenceGateBlock((FenceGateBlock) ModBlocks.CRIMSON_PLANKS_FENCE_GATE.get(), blockTexture(Blocks.CRIMSON_PLANKS));
        slabBlock((SlabBlock) ModBlocks.CRIMSON_PLANKS_SLAB.get(), blockTexture(Blocks.CRIMSON_PLANKS), blockTexture(Blocks.CRIMSON_PLANKS));
        stairsBlock((StairBlock) ModBlocks.CRIMSON_PLANKS_STAIRS.get(), blockTexture(Blocks.CRIMSON_PLANKS));
        buttonBlock((ButtonBlock)ModBlocks.WARPED_PLANKS_BUTTON.get(), blockTexture(Blocks.WARPED_PLANKS));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.WARPED_PLANKS_PRESSURE_PLATE.get(), blockTexture(Blocks.WARPED_PLANKS));
        wallBlock((WallBlock) ModBlocks.WARPED_PLANKS_WALL.get(), blockTexture(Blocks.WARPED_PLANKS));
        fenceBlock((FenceBlock) ModBlocks.WARPED_PLANKS_FENCE.get(), blockTexture(Blocks.WARPED_PLANKS));

        fenceGateBlock((FenceGateBlock) ModBlocks.WARPED_PLANKS_FENCE_GATE.get(), blockTexture(Blocks.WARPED_PLANKS));
        slabBlock((SlabBlock) ModBlocks.WARPED_PLANKS_SLAB.get(), blockTexture(Blocks.WARPED_PLANKS), blockTexture(Blocks.WARPED_PLANKS));
        stairsBlock((StairBlock) ModBlocks.WARPED_PLANKS_STAIRS.get(), blockTexture(Blocks.WARPED_PLANKS));
        buttonBlock((ButtonBlock)ModBlocks.NETHER_GOLD_ORE_BUTTON.get(), blockTexture(Blocks.NETHER_GOLD_ORE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.NETHER_GOLD_ORE_PRESSURE_PLATE.get(), blockTexture(Blocks.NETHER_GOLD_ORE));
        wallBlock((WallBlock) ModBlocks.NETHER_GOLD_ORE_WALL.get(), blockTexture(Blocks.NETHER_GOLD_ORE));
        fenceBlock((FenceBlock) ModBlocks.NETHER_GOLD_ORE_FENCE.get(), blockTexture(Blocks.NETHER_GOLD_ORE));

        fenceGateBlock((FenceGateBlock) ModBlocks.NETHER_GOLD_ORE_FENCE_GATE.get(), blockTexture(Blocks.NETHER_GOLD_ORE));
        slabBlock((SlabBlock) ModBlocks.NETHER_GOLD_ORE_SLAB.get(), blockTexture(Blocks.NETHER_GOLD_ORE), blockTexture(Blocks.NETHER_GOLD_ORE));
        stairsBlock((StairBlock) ModBlocks.NETHER_GOLD_ORE_STAIRS.get(), blockTexture(Blocks.NETHER_GOLD_ORE));
        buttonBlock((ButtonBlock)ModBlocks.NETHER_QUARTZ_ORE_BUTTON.get(), blockTexture(Blocks.NETHER_QUARTZ_ORE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.NETHER_QUARTZ_ORE_PRESSURE_PLATE.get(), blockTexture(Blocks.NETHER_QUARTZ_ORE));
        wallBlock((WallBlock) ModBlocks.NETHER_QUARTZ_ORE_WALL.get(), blockTexture(Blocks.NETHER_QUARTZ_ORE));
        fenceBlock((FenceBlock) ModBlocks.NETHER_QUARTZ_ORE_FENCE.get(), blockTexture(Blocks.NETHER_QUARTZ_ORE));

        fenceGateBlock((FenceGateBlock) ModBlocks.NETHER_QUARTZ_ORE_FENCE_GATE.get(), blockTexture(Blocks.NETHER_QUARTZ_ORE));
        slabBlock((SlabBlock) ModBlocks.NETHER_QUARTZ_ORE_SLAB.get(), blockTexture(Blocks.NETHER_QUARTZ_ORE), blockTexture(Blocks.NETHER_QUARTZ_ORE));
        stairsBlock((StairBlock) ModBlocks.NETHER_QUARTZ_ORE_STAIRS.get(), blockTexture(Blocks.NETHER_QUARTZ_ORE));
        buttonBlock((ButtonBlock)ModBlocks.BUDDING_AMETHYST_BUTTON.get(), blockTexture(Blocks.BUDDING_AMETHYST));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.BUDDING_AMETHYST_PRESSURE_PLATE.get(), blockTexture(Blocks.BUDDING_AMETHYST));
        wallBlock((WallBlock) ModBlocks.BUDDING_AMETHYST_WALL.get(), blockTexture(Blocks.BUDDING_AMETHYST));
        fenceBlock((FenceBlock) ModBlocks.BUDDING_AMETHYST_FENCE.get(), blockTexture(Blocks.BUDDING_AMETHYST));

        fenceGateBlock((FenceGateBlock) ModBlocks.BUDDING_AMETHYST_FENCE_GATE.get(), blockTexture(Blocks.BUDDING_AMETHYST));
        slabBlock((SlabBlock) ModBlocks.BUDDING_AMETHYST_SLAB.get(), blockTexture(Blocks.BUDDING_AMETHYST), blockTexture(Blocks.BUDDING_AMETHYST));
        stairsBlock((StairBlock) ModBlocks.BUDDING_AMETHYST_STAIRS.get(), blockTexture(Blocks.BUDDING_AMETHYST));
        buttonBlock((ButtonBlock)ModBlocks.SPONGE_BUTTON.get(), blockTexture(Blocks.SPONGE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.SPONGE_PRESSURE_PLATE.get(), blockTexture(Blocks.SPONGE));
        wallBlock((WallBlock) ModBlocks.SPONGE_WALL.get(), blockTexture(Blocks.SPONGE));
        fenceBlock((FenceBlock) ModBlocks.SPONGE_FENCE.get(), blockTexture(Blocks.SPONGE));

        fenceGateBlock((FenceGateBlock) ModBlocks.SPONGE_FENCE_GATE.get(), blockTexture(Blocks.SPONGE));
        slabBlock((SlabBlock) ModBlocks.SPONGE_SLAB.get(), blockTexture(Blocks.SPONGE), blockTexture(Blocks.SPONGE));
        stairsBlock((StairBlock) ModBlocks.SPONGE_STAIRS.get(), blockTexture(Blocks.SPONGE));
        buttonBlock((ButtonBlock)ModBlocks.WET_SPONGE_BUTTON.get(), blockTexture(Blocks.WET_SPONGE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.WET_SPONGE_PRESSURE_PLATE.get(), blockTexture(Blocks.WET_SPONGE));
        wallBlock((WallBlock) ModBlocks.WET_SPONGE_WALL.get(), blockTexture(Blocks.WET_SPONGE));
        fenceBlock((FenceBlock) ModBlocks.WET_SPONGE_FENCE.get(), blockTexture(Blocks.WET_SPONGE));

        fenceGateBlock((FenceGateBlock) ModBlocks.WET_SPONGE_FENCE_GATE.get(), blockTexture(Blocks.WET_SPONGE));
        slabBlock((SlabBlock) ModBlocks.WET_SPONGE_SLAB.get(), blockTexture(Blocks.WET_SPONGE), blockTexture(Blocks.WET_SPONGE));
        stairsBlock((StairBlock) ModBlocks.WET_SPONGE_STAIRS.get(), blockTexture(Blocks.WET_SPONGE));
        buttonBlock((ButtonBlock)ModBlocks.WHITE_WOOL_BUTTON.get(), blockTexture(Blocks.WHITE_WOOL));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.WHITE_WOOL_PRESSURE_PLATE.get(), blockTexture(Blocks.WHITE_WOOL));
        wallBlock((WallBlock) ModBlocks.WHITE_WOOL_WALL.get(), blockTexture(Blocks.WHITE_WOOL));
        fenceBlock((FenceBlock) ModBlocks.WHITE_WOOL_FENCE.get(), blockTexture(Blocks.WHITE_WOOL));

        fenceGateBlock((FenceGateBlock) ModBlocks.WHITE_WOOL_FENCE_GATE.get(), blockTexture(Blocks.WHITE_WOOL));
        slabBlock((SlabBlock) ModBlocks.WHITE_WOOL_SLAB.get(), blockTexture(Blocks.WHITE_WOOL), blockTexture(Blocks.WHITE_WOOL));
        stairsBlock((StairBlock) ModBlocks.WHITE_WOOL_STAIRS.get(), blockTexture(Blocks.WHITE_WOOL));
        buttonBlock((ButtonBlock)ModBlocks.ORANGE_WOOL_BUTTON.get(), blockTexture(Blocks.ORANGE_WOOL));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.ORANGE_WOOL_PRESSURE_PLATE.get(), blockTexture(Blocks.ORANGE_WOOL));
        wallBlock((WallBlock) ModBlocks.ORANGE_WOOL_WALL.get(), blockTexture(Blocks.ORANGE_WOOL));
        fenceBlock((FenceBlock) ModBlocks.ORANGE_WOOL_FENCE.get(), blockTexture(Blocks.ORANGE_WOOL));

        fenceGateBlock((FenceGateBlock) ModBlocks.ORANGE_WOOL_FENCE_GATE.get(), blockTexture(Blocks.ORANGE_WOOL));
        slabBlock((SlabBlock) ModBlocks.ORANGE_WOOL_SLAB.get(), blockTexture(Blocks.ORANGE_WOOL), blockTexture(Blocks.ORANGE_WOOL));
        stairsBlock((StairBlock) ModBlocks.ORANGE_WOOL_STAIRS.get(), blockTexture(Blocks.ORANGE_WOOL));
        buttonBlock((ButtonBlock)ModBlocks.MAGENTA_WOOL_BUTTON.get(), blockTexture(Blocks.MAGENTA_WOOL));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.MAGENTA_WOOL_PRESSURE_PLATE.get(), blockTexture(Blocks.MAGENTA_WOOL));
        wallBlock((WallBlock) ModBlocks.MAGENTA_WOOL_WALL.get(), blockTexture(Blocks.MAGENTA_WOOL));
        fenceBlock((FenceBlock) ModBlocks.MAGENTA_WOOL_FENCE.get(), blockTexture(Blocks.MAGENTA_WOOL));

        fenceGateBlock((FenceGateBlock) ModBlocks.MAGENTA_WOOL_FENCE_GATE.get(), blockTexture(Blocks.MAGENTA_WOOL));
        slabBlock((SlabBlock) ModBlocks.MAGENTA_WOOL_SLAB.get(), blockTexture(Blocks.MAGENTA_WOOL), blockTexture(Blocks.MAGENTA_WOOL));
        stairsBlock((StairBlock) ModBlocks.MAGENTA_WOOL_STAIRS.get(), blockTexture(Blocks.MAGENTA_WOOL));
        buttonBlock((ButtonBlock)ModBlocks.LIGHT_BLUE_WOOL_BUTTON.get(), blockTexture(Blocks.LIGHT_BLUE_WOOL));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.LIGHT_BLUE_WOOL_PRESSURE_PLATE.get(), blockTexture(Blocks.LIGHT_BLUE_WOOL));
        wallBlock((WallBlock) ModBlocks.LIGHT_BLUE_WOOL_WALL.get(), blockTexture(Blocks.LIGHT_BLUE_WOOL));
        fenceBlock((FenceBlock) ModBlocks.LIGHT_BLUE_WOOL_FENCE.get(), blockTexture(Blocks.LIGHT_BLUE_WOOL));

        fenceGateBlock((FenceGateBlock) ModBlocks.LIGHT_BLUE_WOOL_FENCE_GATE.get(), blockTexture(Blocks.LIGHT_BLUE_WOOL));
        slabBlock((SlabBlock) ModBlocks.LIGHT_BLUE_WOOL_SLAB.get(), blockTexture(Blocks.LIGHT_BLUE_WOOL), blockTexture(Blocks.LIGHT_BLUE_WOOL));
        stairsBlock((StairBlock) ModBlocks.LIGHT_BLUE_WOOL_STAIRS.get(), blockTexture(Blocks.LIGHT_BLUE_WOOL));
        buttonBlock((ButtonBlock)ModBlocks.YELLOW_WOOL_BUTTON.get(), blockTexture(Blocks.YELLOW_WOOL));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.YELLOW_WOOL_PRESSURE_PLATE.get(), blockTexture(Blocks.YELLOW_WOOL));
        wallBlock((WallBlock) ModBlocks.YELLOW_WOOL_WALL.get(), blockTexture(Blocks.YELLOW_WOOL));
        fenceBlock((FenceBlock) ModBlocks.YELLOW_WOOL_FENCE.get(), blockTexture(Blocks.YELLOW_WOOL));

        fenceGateBlock((FenceGateBlock) ModBlocks.YELLOW_WOOL_FENCE_GATE.get(), blockTexture(Blocks.YELLOW_WOOL));
        slabBlock((SlabBlock) ModBlocks.YELLOW_WOOL_SLAB.get(), blockTexture(Blocks.YELLOW_WOOL), blockTexture(Blocks.YELLOW_WOOL));
        stairsBlock((StairBlock) ModBlocks.YELLOW_WOOL_STAIRS.get(), blockTexture(Blocks.YELLOW_WOOL));
        buttonBlock((ButtonBlock)ModBlocks.LIME_WOOL_BUTTON.get(), blockTexture(Blocks.LIME_WOOL));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.LIME_WOOL_PRESSURE_PLATE.get(), blockTexture(Blocks.LIME_WOOL));
        wallBlock((WallBlock) ModBlocks.LIME_WOOL_WALL.get(), blockTexture(Blocks.LIME_WOOL));
        fenceBlock((FenceBlock) ModBlocks.LIME_WOOL_FENCE.get(), blockTexture(Blocks.LIME_WOOL));

        fenceGateBlock((FenceGateBlock) ModBlocks.LIME_WOOL_FENCE_GATE.get(), blockTexture(Blocks.LIME_WOOL));
        slabBlock((SlabBlock) ModBlocks.LIME_WOOL_SLAB.get(), blockTexture(Blocks.LIME_WOOL), blockTexture(Blocks.LIME_WOOL));
        stairsBlock((StairBlock) ModBlocks.LIME_WOOL_STAIRS.get(), blockTexture(Blocks.LIME_WOOL));
        buttonBlock((ButtonBlock)ModBlocks.PINK_WOOL_BUTTON.get(), blockTexture(Blocks.PINK_WOOL));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.PINK_WOOL_PRESSURE_PLATE.get(), blockTexture(Blocks.PINK_WOOL));
        wallBlock((WallBlock) ModBlocks.PINK_WOOL_WALL.get(), blockTexture(Blocks.PINK_WOOL));
        fenceBlock((FenceBlock) ModBlocks.PINK_WOOL_FENCE.get(), blockTexture(Blocks.PINK_WOOL));

        fenceGateBlock((FenceGateBlock) ModBlocks.PINK_WOOL_FENCE_GATE.get(), blockTexture(Blocks.PINK_WOOL));
        slabBlock((SlabBlock) ModBlocks.PINK_WOOL_SLAB.get(), blockTexture(Blocks.PINK_WOOL), blockTexture(Blocks.PINK_WOOL));
        stairsBlock((StairBlock) ModBlocks.PINK_WOOL_STAIRS.get(), blockTexture(Blocks.PINK_WOOL));
        buttonBlock((ButtonBlock)ModBlocks.GRAY_WOOL_BUTTON.get(), blockTexture(Blocks.GRAY_WOOL));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.GRAY_WOOL_PRESSURE_PLATE.get(), blockTexture(Blocks.GRAY_WOOL));
        wallBlock((WallBlock) ModBlocks.GRAY_WOOL_WALL.get(), blockTexture(Blocks.GRAY_WOOL));
        fenceBlock((FenceBlock) ModBlocks.GRAY_WOOL_FENCE.get(), blockTexture(Blocks.GRAY_WOOL));

        fenceGateBlock((FenceGateBlock) ModBlocks.GRAY_WOOL_FENCE_GATE.get(), blockTexture(Blocks.GRAY_WOOL));
        slabBlock((SlabBlock) ModBlocks.GRAY_WOOL_SLAB.get(), blockTexture(Blocks.GRAY_WOOL), blockTexture(Blocks.GRAY_WOOL));
        stairsBlock((StairBlock) ModBlocks.GRAY_WOOL_STAIRS.get(), blockTexture(Blocks.GRAY_WOOL));
        buttonBlock((ButtonBlock)ModBlocks.LIGHT_GRAY_WOOL_BUTTON.get(), blockTexture(Blocks.LIGHT_GRAY_WOOL));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.LIGHT_GRAY_WOOL_PRESSURE_PLATE.get(), blockTexture(Blocks.LIGHT_GRAY_WOOL));
        wallBlock((WallBlock) ModBlocks.LIGHT_GRAY_WOOL_WALL.get(), blockTexture(Blocks.LIGHT_GRAY_WOOL));
        fenceBlock((FenceBlock) ModBlocks.LIGHT_GRAY_WOOL_FENCE.get(), blockTexture(Blocks.LIGHT_GRAY_WOOL));

        fenceGateBlock((FenceGateBlock) ModBlocks.LIGHT_GRAY_WOOL_FENCE_GATE.get(), blockTexture(Blocks.LIGHT_GRAY_WOOL));
        slabBlock((SlabBlock) ModBlocks.LIGHT_GRAY_WOOL_SLAB.get(), blockTexture(Blocks.LIGHT_GRAY_WOOL), blockTexture(Blocks.LIGHT_GRAY_WOOL));
        stairsBlock((StairBlock) ModBlocks.LIGHT_GRAY_WOOL_STAIRS.get(), blockTexture(Blocks.LIGHT_GRAY_WOOL));
        buttonBlock((ButtonBlock)ModBlocks.CYAN_WOOL_BUTTON.get(), blockTexture(Blocks.CYAN_WOOL));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.CYAN_WOOL_PRESSURE_PLATE.get(), blockTexture(Blocks.CYAN_WOOL));
        wallBlock((WallBlock) ModBlocks.CYAN_WOOL_WALL.get(), blockTexture(Blocks.CYAN_WOOL));
        fenceBlock((FenceBlock) ModBlocks.CYAN_WOOL_FENCE.get(), blockTexture(Blocks.CYAN_WOOL));

        fenceGateBlock((FenceGateBlock) ModBlocks.CYAN_WOOL_FENCE_GATE.get(), blockTexture(Blocks.CYAN_WOOL));
        slabBlock((SlabBlock) ModBlocks.CYAN_WOOL_SLAB.get(), blockTexture(Blocks.CYAN_WOOL), blockTexture(Blocks.CYAN_WOOL));
        stairsBlock((StairBlock) ModBlocks.CYAN_WOOL_STAIRS.get(), blockTexture(Blocks.CYAN_WOOL));
        buttonBlock((ButtonBlock)ModBlocks.PURPLE_WOOL_BUTTON.get(), blockTexture(Blocks.PURPLE_WOOL));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.PURPLE_WOOL_PRESSURE_PLATE.get(), blockTexture(Blocks.PURPLE_WOOL));
        wallBlock((WallBlock) ModBlocks.PURPLE_WOOL_WALL.get(), blockTexture(Blocks.PURPLE_WOOL));
        fenceBlock((FenceBlock) ModBlocks.PURPLE_WOOL_FENCE.get(), blockTexture(Blocks.PURPLE_WOOL));

        fenceGateBlock((FenceGateBlock) ModBlocks.PURPLE_WOOL_FENCE_GATE.get(), blockTexture(Blocks.PURPLE_WOOL));
        slabBlock((SlabBlock) ModBlocks.PURPLE_WOOL_SLAB.get(), blockTexture(Blocks.PURPLE_WOOL), blockTexture(Blocks.PURPLE_WOOL));
        stairsBlock((StairBlock) ModBlocks.PURPLE_WOOL_STAIRS.get(), blockTexture(Blocks.PURPLE_WOOL));
        buttonBlock((ButtonBlock)ModBlocks.BLUE_WOOL_BUTTON.get(), blockTexture(Blocks.BLUE_WOOL));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.BLUE_WOOL_PRESSURE_PLATE.get(), blockTexture(Blocks.BLUE_WOOL));
        wallBlock((WallBlock) ModBlocks.BLUE_WOOL_WALL.get(), blockTexture(Blocks.BLUE_WOOL));
        fenceBlock((FenceBlock) ModBlocks.BLUE_WOOL_FENCE.get(), blockTexture(Blocks.BLUE_WOOL));

        fenceGateBlock((FenceGateBlock) ModBlocks.BLUE_WOOL_FENCE_GATE.get(), blockTexture(Blocks.BLUE_WOOL));
        slabBlock((SlabBlock) ModBlocks.BLUE_WOOL_SLAB.get(), blockTexture(Blocks.BLUE_WOOL), blockTexture(Blocks.BLUE_WOOL));
        stairsBlock((StairBlock) ModBlocks.BLUE_WOOL_STAIRS.get(), blockTexture(Blocks.BLUE_WOOL));
        buttonBlock((ButtonBlock)ModBlocks.BROWN_WOOL_BUTTON.get(), blockTexture(Blocks.BROWN_WOOL));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.BROWN_WOOL_PRESSURE_PLATE.get(), blockTexture(Blocks.BROWN_WOOL));
        wallBlock((WallBlock) ModBlocks.BROWN_WOOL_WALL.get(), blockTexture(Blocks.BROWN_WOOL));
        fenceBlock((FenceBlock) ModBlocks.BROWN_WOOL_FENCE.get(), blockTexture(Blocks.BROWN_WOOL));

        fenceGateBlock((FenceGateBlock) ModBlocks.BROWN_WOOL_FENCE_GATE.get(), blockTexture(Blocks.BROWN_WOOL));
        slabBlock((SlabBlock) ModBlocks.BROWN_WOOL_SLAB.get(), blockTexture(Blocks.BROWN_WOOL), blockTexture(Blocks.BROWN_WOOL));
        stairsBlock((StairBlock) ModBlocks.BROWN_WOOL_STAIRS.get(), blockTexture(Blocks.BROWN_WOOL));
        buttonBlock((ButtonBlock)ModBlocks.GREEN_WOOL_BUTTON.get(), blockTexture(Blocks.GREEN_WOOL));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.GREEN_WOOL_PRESSURE_PLATE.get(), blockTexture(Blocks.GREEN_WOOL));
        wallBlock((WallBlock) ModBlocks.GREEN_WOOL_WALL.get(), blockTexture(Blocks.GREEN_WOOL));
        fenceBlock((FenceBlock) ModBlocks.GREEN_WOOL_FENCE.get(), blockTexture(Blocks.GREEN_WOOL));

        fenceGateBlock((FenceGateBlock) ModBlocks.GREEN_WOOL_FENCE_GATE.get(), blockTexture(Blocks.GREEN_WOOL));
        slabBlock((SlabBlock) ModBlocks.GREEN_WOOL_SLAB.get(), blockTexture(Blocks.GREEN_WOOL), blockTexture(Blocks.GREEN_WOOL));
        stairsBlock((StairBlock) ModBlocks.GREEN_WOOL_STAIRS.get(), blockTexture(Blocks.GREEN_WOOL));
        buttonBlock((ButtonBlock)ModBlocks.RED_WOOL_BUTTON.get(), blockTexture(Blocks.RED_WOOL));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.RED_WOOL_PRESSURE_PLATE.get(), blockTexture(Blocks.RED_WOOL));
        wallBlock((WallBlock) ModBlocks.RED_WOOL_WALL.get(), blockTexture(Blocks.RED_WOOL));
        fenceBlock((FenceBlock) ModBlocks.RED_WOOL_FENCE.get(), blockTexture(Blocks.RED_WOOL));

        fenceGateBlock((FenceGateBlock) ModBlocks.RED_WOOL_FENCE_GATE.get(), blockTexture(Blocks.RED_WOOL));
        slabBlock((SlabBlock) ModBlocks.RED_WOOL_SLAB.get(), blockTexture(Blocks.RED_WOOL), blockTexture(Blocks.RED_WOOL));
        stairsBlock((StairBlock) ModBlocks.RED_WOOL_STAIRS.get(), blockTexture(Blocks.RED_WOOL));
        buttonBlock((ButtonBlock)ModBlocks.BLACK_WOOL_BUTTON.get(), blockTexture(Blocks.BLACK_WOOL));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.BLACK_WOOL_PRESSURE_PLATE.get(), blockTexture(Blocks.BLACK_WOOL));
        wallBlock((WallBlock) ModBlocks.BLACK_WOOL_WALL.get(), blockTexture(Blocks.BLACK_WOOL));
        fenceBlock((FenceBlock) ModBlocks.BLACK_WOOL_FENCE.get(), blockTexture(Blocks.BLACK_WOOL));

        fenceGateBlock((FenceGateBlock) ModBlocks.BLACK_WOOL_FENCE_GATE.get(), blockTexture(Blocks.BLACK_WOOL));
        slabBlock((SlabBlock) ModBlocks.BLACK_WOOL_SLAB.get(), blockTexture(Blocks.BLACK_WOOL), blockTexture(Blocks.BLACK_WOOL));
        stairsBlock((StairBlock) ModBlocks.BLACK_WOOL_STAIRS.get(), blockTexture(Blocks.BLACK_WOOL));
        buttonBlock((ButtonBlock)ModBlocks.SMOOTH_STONE_BUTTON.get(), blockTexture(Blocks.SMOOTH_STONE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.SMOOTH_STONE_PRESSURE_PLATE.get(), blockTexture(Blocks.SMOOTH_STONE));
        wallBlock((WallBlock) ModBlocks.SMOOTH_STONE_WALL.get(), blockTexture(Blocks.SMOOTH_STONE));
        fenceBlock((FenceBlock) ModBlocks.SMOOTH_STONE_FENCE.get(), blockTexture(Blocks.SMOOTH_STONE));

        fenceGateBlock((FenceGateBlock) ModBlocks.SMOOTH_STONE_FENCE_GATE.get(), blockTexture(Blocks.SMOOTH_STONE));
        slabBlock((SlabBlock) ModBlocks.SMOOTH_STONE_SLAB.get(), blockTexture(Blocks.SMOOTH_STONE), blockTexture(Blocks.SMOOTH_STONE));
        stairsBlock((StairBlock) ModBlocks.SMOOTH_STONE_STAIRS.get(), blockTexture(Blocks.SMOOTH_STONE));
        buttonBlock((ButtonBlock)ModBlocks.BRICKS_BUTTON.get(), blockTexture(Blocks.BRICKS));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.BRICKS_PRESSURE_PLATE.get(), blockTexture(Blocks.BRICKS));
        wallBlock((WallBlock) ModBlocks.BRICKS_WALL.get(), blockTexture(Blocks.BRICKS));
        fenceBlock((FenceBlock) ModBlocks.BRICKS_FENCE.get(), blockTexture(Blocks.BRICKS));

        fenceGateBlock((FenceGateBlock) ModBlocks.BRICKS_FENCE_GATE.get(), blockTexture(Blocks.BRICKS));
        slabBlock((SlabBlock) ModBlocks.BRICKS_SLAB.get(), blockTexture(Blocks.BRICKS), blockTexture(Blocks.BRICKS));
        stairsBlock((StairBlock) ModBlocks.BRICKS_STAIRS.get(), blockTexture(Blocks.BRICKS));
        buttonBlock((ButtonBlock)ModBlocks.MOSSY_COBBLESTONE_BUTTON.get(), blockTexture(Blocks.MOSSY_COBBLESTONE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.MOSSY_COBBLESTONE_PRESSURE_PLATE.get(), blockTexture(Blocks.MOSSY_COBBLESTONE));
        wallBlock((WallBlock) ModBlocks.MOSSY_COBBLESTONE_WALL.get(), blockTexture(Blocks.MOSSY_COBBLESTONE));
        fenceBlock((FenceBlock) ModBlocks.MOSSY_COBBLESTONE_FENCE.get(), blockTexture(Blocks.MOSSY_COBBLESTONE));

        fenceGateBlock((FenceGateBlock) ModBlocks.MOSSY_COBBLESTONE_FENCE_GATE.get(), blockTexture(Blocks.MOSSY_COBBLESTONE));
        slabBlock((SlabBlock) ModBlocks.MOSSY_COBBLESTONE_SLAB.get(), blockTexture(Blocks.MOSSY_COBBLESTONE), blockTexture(Blocks.MOSSY_COBBLESTONE));
        stairsBlock((StairBlock) ModBlocks.MOSSY_COBBLESTONE_STAIRS.get(), blockTexture(Blocks.MOSSY_COBBLESTONE));
        buttonBlock((ButtonBlock)ModBlocks.OBSIDIAN_BUTTON.get(), blockTexture(Blocks.OBSIDIAN));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.OBSIDIAN_PRESSURE_PLATE.get(), blockTexture(Blocks.OBSIDIAN));
        wallBlock((WallBlock) ModBlocks.OBSIDIAN_WALL.get(), blockTexture(Blocks.OBSIDIAN));
        fenceBlock((FenceBlock) ModBlocks.OBSIDIAN_FENCE.get(), blockTexture(Blocks.OBSIDIAN));

        fenceGateBlock((FenceGateBlock) ModBlocks.OBSIDIAN_FENCE_GATE.get(), blockTexture(Blocks.OBSIDIAN));
        slabBlock((SlabBlock) ModBlocks.OBSIDIAN_SLAB.get(), blockTexture(Blocks.OBSIDIAN), blockTexture(Blocks.OBSIDIAN));
        stairsBlock((StairBlock) ModBlocks.OBSIDIAN_STAIRS.get(), blockTexture(Blocks.OBSIDIAN));
        buttonBlock((ButtonBlock)ModBlocks.CLAY_BUTTON.get(), blockTexture(Blocks.CLAY));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.CLAY_PRESSURE_PLATE.get(), blockTexture(Blocks.CLAY));
        wallBlock((WallBlock) ModBlocks.CLAY_WALL.get(), blockTexture(Blocks.CLAY));
        fenceBlock((FenceBlock) ModBlocks.CLAY_FENCE.get(), blockTexture(Blocks.CLAY));

        fenceGateBlock((FenceGateBlock) ModBlocks.CLAY_FENCE_GATE.get(), blockTexture(Blocks.CLAY));
        slabBlock((SlabBlock) ModBlocks.CLAY_SLAB.get(), blockTexture(Blocks.CLAY), blockTexture(Blocks.CLAY));
        stairsBlock((StairBlock) ModBlocks.CLAY_STAIRS.get(), blockTexture(Blocks.CLAY));
        buttonBlock((ButtonBlock)ModBlocks.SOUL_SAND_BUTTON.get(), blockTexture(Blocks.SOUL_SAND));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.SOUL_SAND_PRESSURE_PLATE.get(), blockTexture(Blocks.SOUL_SAND));
        wallBlock((WallBlock) ModBlocks.SOUL_SAND_WALL.get(), blockTexture(Blocks.SOUL_SAND));
        fenceBlock((FenceBlock) ModBlocks.SOUL_SAND_FENCE.get(), blockTexture(Blocks.SOUL_SAND));

        fenceGateBlock((FenceGateBlock) ModBlocks.SOUL_SAND_FENCE_GATE.get(), blockTexture(Blocks.SOUL_SAND));
        slabBlock((SlabBlock) ModBlocks.SOUL_SAND_SLAB.get(), blockTexture(Blocks.SOUL_SAND), blockTexture(Blocks.SOUL_SAND));
        stairsBlock((StairBlock) ModBlocks.SOUL_SAND_STAIRS.get(), blockTexture(Blocks.SOUL_SAND));
        buttonBlock((ButtonBlock)ModBlocks.SOUL_SOIL_BUTTON.get(), blockTexture(Blocks.SOUL_SOIL));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.SOUL_SOIL_PRESSURE_PLATE.get(), blockTexture(Blocks.SOUL_SOIL));
        wallBlock((WallBlock) ModBlocks.SOUL_SOIL_WALL.get(), blockTexture(Blocks.SOUL_SOIL));
        fenceBlock((FenceBlock) ModBlocks.SOUL_SOIL_FENCE.get(), blockTexture(Blocks.SOUL_SOIL));

        fenceGateBlock((FenceGateBlock) ModBlocks.SOUL_SOIL_FENCE_GATE.get(), blockTexture(Blocks.SOUL_SOIL));
        slabBlock((SlabBlock) ModBlocks.SOUL_SOIL_SLAB.get(), blockTexture(Blocks.SOUL_SOIL), blockTexture(Blocks.SOUL_SOIL));
        stairsBlock((StairBlock) ModBlocks.SOUL_SOIL_STAIRS.get(), blockTexture(Blocks.SOUL_SOIL));
        buttonBlock((ButtonBlock)ModBlocks.SMOOTH_BASALT_BUTTON.get(), blockTexture(Blocks.SMOOTH_BASALT));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.SMOOTH_BASALT_PRESSURE_PLATE.get(), blockTexture(Blocks.SMOOTH_BASALT));
        wallBlock((WallBlock) ModBlocks.SMOOTH_BASALT_WALL.get(), blockTexture(Blocks.SMOOTH_BASALT));
        fenceBlock((FenceBlock) ModBlocks.SMOOTH_BASALT_FENCE.get(), blockTexture(Blocks.SMOOTH_BASALT));

        fenceGateBlock((FenceGateBlock) ModBlocks.SMOOTH_BASALT_FENCE_GATE.get(), blockTexture(Blocks.SMOOTH_BASALT));
        slabBlock((SlabBlock) ModBlocks.SMOOTH_BASALT_SLAB.get(), blockTexture(Blocks.SMOOTH_BASALT), blockTexture(Blocks.SMOOTH_BASALT));
        stairsBlock((StairBlock) ModBlocks.SMOOTH_BASALT_STAIRS.get(), blockTexture(Blocks.SMOOTH_BASALT));
        buttonBlock((ButtonBlock)ModBlocks.STONE_BRICKS_BUTTON.get(), blockTexture(Blocks.STONE_BRICKS));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.STONE_BRICKS_PRESSURE_PLATE.get(), blockTexture(Blocks.STONE_BRICKS));
        wallBlock((WallBlock) ModBlocks.STONE_BRICKS_WALL.get(), blockTexture(Blocks.STONE_BRICKS));
        fenceBlock((FenceBlock) ModBlocks.STONE_BRICKS_FENCE.get(), blockTexture(Blocks.STONE_BRICKS));

        fenceGateBlock((FenceGateBlock) ModBlocks.STONE_BRICKS_FENCE_GATE.get(), blockTexture(Blocks.STONE_BRICKS));
        slabBlock((SlabBlock) ModBlocks.STONE_BRICKS_SLAB.get(), blockTexture(Blocks.STONE_BRICKS), blockTexture(Blocks.STONE_BRICKS));
        stairsBlock((StairBlock) ModBlocks.STONE_BRICKS_STAIRS.get(), blockTexture(Blocks.STONE_BRICKS));
        buttonBlock((ButtonBlock)ModBlocks.MOSSY_STONE_BRICKS_BUTTON.get(), blockTexture(Blocks.MOSSY_STONE_BRICKS));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.MOSSY_STONE_BRICKS_PRESSURE_PLATE.get(), blockTexture(Blocks.MOSSY_STONE_BRICKS));
        wallBlock((WallBlock) ModBlocks.MOSSY_STONE_BRICKS_WALL.get(), blockTexture(Blocks.MOSSY_STONE_BRICKS));
        fenceBlock((FenceBlock) ModBlocks.MOSSY_STONE_BRICKS_FENCE.get(), blockTexture(Blocks.MOSSY_STONE_BRICKS));

        fenceGateBlock((FenceGateBlock) ModBlocks.MOSSY_STONE_BRICKS_FENCE_GATE.get(), blockTexture(Blocks.MOSSY_STONE_BRICKS));
        slabBlock((SlabBlock) ModBlocks.MOSSY_STONE_BRICKS_SLAB.get(), blockTexture(Blocks.MOSSY_STONE_BRICKS), blockTexture(Blocks.MOSSY_STONE_BRICKS));
        stairsBlock((StairBlock) ModBlocks.MOSSY_STONE_BRICKS_STAIRS.get(), blockTexture(Blocks.MOSSY_STONE_BRICKS));
        buttonBlock((ButtonBlock)ModBlocks.CRACKED_STONE_BRICKS_BUTTON.get(), blockTexture(Blocks.CRACKED_STONE_BRICKS));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.CRACKED_STONE_BRICKS_PRESSURE_PLATE.get(), blockTexture(Blocks.CRACKED_STONE_BRICKS));
        wallBlock((WallBlock) ModBlocks.CRACKED_STONE_BRICKS_WALL.get(), blockTexture(Blocks.CRACKED_STONE_BRICKS));
        fenceBlock((FenceBlock) ModBlocks.CRACKED_STONE_BRICKS_FENCE.get(), blockTexture(Blocks.CRACKED_STONE_BRICKS));

        fenceGateBlock((FenceGateBlock) ModBlocks.CRACKED_STONE_BRICKS_FENCE_GATE.get(), blockTexture(Blocks.CRACKED_STONE_BRICKS));
        slabBlock((SlabBlock) ModBlocks.CRACKED_STONE_BRICKS_SLAB.get(), blockTexture(Blocks.CRACKED_STONE_BRICKS), blockTexture(Blocks.CRACKED_STONE_BRICKS));
        stairsBlock((StairBlock) ModBlocks.CRACKED_STONE_BRICKS_STAIRS.get(), blockTexture(Blocks.CRACKED_STONE_BRICKS));
        buttonBlock((ButtonBlock)ModBlocks.CHISELED_STONE_BRICKS_BUTTON.get(), blockTexture(Blocks.CHISELED_STONE_BRICKS));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.CHISELED_STONE_BRICKS_PRESSURE_PLATE.get(), blockTexture(Blocks.CHISELED_STONE_BRICKS));
        wallBlock((WallBlock) ModBlocks.CHISELED_STONE_BRICKS_WALL.get(), blockTexture(Blocks.CHISELED_STONE_BRICKS));
        fenceBlock((FenceBlock) ModBlocks.CHISELED_STONE_BRICKS_FENCE.get(), blockTexture(Blocks.CHISELED_STONE_BRICKS));

        fenceGateBlock((FenceGateBlock) ModBlocks.CHISELED_STONE_BRICKS_FENCE_GATE.get(), blockTexture(Blocks.CHISELED_STONE_BRICKS));
        slabBlock((SlabBlock) ModBlocks.CHISELED_STONE_BRICKS_SLAB.get(), blockTexture(Blocks.CHISELED_STONE_BRICKS), blockTexture(Blocks.CHISELED_STONE_BRICKS));
        stairsBlock((StairBlock) ModBlocks.CHISELED_STONE_BRICKS_STAIRS.get(), blockTexture(Blocks.CHISELED_STONE_BRICKS));
        buttonBlock((ButtonBlock)ModBlocks.PACKED_MUD_BUTTON.get(), blockTexture(Blocks.PACKED_MUD));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.PACKED_MUD_PRESSURE_PLATE.get(), blockTexture(Blocks.PACKED_MUD));
        wallBlock((WallBlock) ModBlocks.PACKED_MUD_WALL.get(), blockTexture(Blocks.PACKED_MUD));
        fenceBlock((FenceBlock) ModBlocks.PACKED_MUD_FENCE.get(), blockTexture(Blocks.PACKED_MUD));

        fenceGateBlock((FenceGateBlock) ModBlocks.PACKED_MUD_FENCE_GATE.get(), blockTexture(Blocks.PACKED_MUD));
        slabBlock((SlabBlock) ModBlocks.PACKED_MUD_SLAB.get(), blockTexture(Blocks.PACKED_MUD), blockTexture(Blocks.PACKED_MUD));
        stairsBlock((StairBlock) ModBlocks.PACKED_MUD_STAIRS.get(), blockTexture(Blocks.PACKED_MUD));
        buttonBlock((ButtonBlock)ModBlocks.MUD_BRICKS_BUTTON.get(), blockTexture(Blocks.MUD_BRICKS));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.MUD_BRICKS_PRESSURE_PLATE.get(), blockTexture(Blocks.MUD_BRICKS));
        wallBlock((WallBlock) ModBlocks.MUD_BRICKS_WALL.get(), blockTexture(Blocks.MUD_BRICKS));
        fenceBlock((FenceBlock) ModBlocks.MUD_BRICKS_FENCE.get(), blockTexture(Blocks.MUD_BRICKS));

        fenceGateBlock((FenceGateBlock) ModBlocks.MUD_BRICKS_FENCE_GATE.get(), blockTexture(Blocks.MUD_BRICKS));
        slabBlock((SlabBlock) ModBlocks.MUD_BRICKS_SLAB.get(), blockTexture(Blocks.MUD_BRICKS), blockTexture(Blocks.MUD_BRICKS));
        stairsBlock((StairBlock) ModBlocks.MUD_BRICKS_STAIRS.get(), blockTexture(Blocks.MUD_BRICKS));
        buttonBlock((ButtonBlock)ModBlocks.DEEPSLATE_BRICKS_BUTTON.get(), blockTexture(Blocks.DEEPSLATE_BRICKS));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.DEEPSLATE_BRICKS_PRESSURE_PLATE.get(), blockTexture(Blocks.DEEPSLATE_BRICKS));
        wallBlock((WallBlock) ModBlocks.DEEPSLATE_BRICKS_WALL.get(), blockTexture(Blocks.DEEPSLATE_BRICKS));
        fenceBlock((FenceBlock) ModBlocks.DEEPSLATE_BRICKS_FENCE.get(), blockTexture(Blocks.DEEPSLATE_BRICKS));

        fenceGateBlock((FenceGateBlock) ModBlocks.DEEPSLATE_BRICKS_FENCE_GATE.get(), blockTexture(Blocks.DEEPSLATE_BRICKS));
        slabBlock((SlabBlock) ModBlocks.DEEPSLATE_BRICKS_SLAB.get(), blockTexture(Blocks.DEEPSLATE_BRICKS), blockTexture(Blocks.DEEPSLATE_BRICKS));
        stairsBlock((StairBlock) ModBlocks.DEEPSLATE_BRICKS_STAIRS.get(), blockTexture(Blocks.DEEPSLATE_BRICKS));
        buttonBlock((ButtonBlock)ModBlocks.CRACKED_DEEPSLATE_BRICKS_BUTTON.get(), blockTexture(Blocks.CRACKED_DEEPSLATE_BRICKS));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.CRACKED_DEEPSLATE_BRICKS_PRESSURE_PLATE.get(), blockTexture(Blocks.CRACKED_DEEPSLATE_BRICKS));
        wallBlock((WallBlock) ModBlocks.CRACKED_DEEPSLATE_BRICKS_WALL.get(), blockTexture(Blocks.CRACKED_DEEPSLATE_BRICKS));
        fenceBlock((FenceBlock) ModBlocks.CRACKED_DEEPSLATE_BRICKS_FENCE.get(), blockTexture(Blocks.CRACKED_DEEPSLATE_BRICKS));

        fenceGateBlock((FenceGateBlock) ModBlocks.CRACKED_DEEPSLATE_BRICKS_FENCE_GATE.get(), blockTexture(Blocks.CRACKED_DEEPSLATE_BRICKS));
        slabBlock((SlabBlock) ModBlocks.CRACKED_DEEPSLATE_BRICKS_SLAB.get(), blockTexture(Blocks.CRACKED_DEEPSLATE_BRICKS), blockTexture(Blocks.CRACKED_DEEPSLATE_BRICKS));
        stairsBlock((StairBlock) ModBlocks.CRACKED_DEEPSLATE_BRICKS_STAIRS.get(), blockTexture(Blocks.CRACKED_DEEPSLATE_BRICKS));
        buttonBlock((ButtonBlock)ModBlocks.DEEPSLATE_TILES_BUTTON.get(), blockTexture(Blocks.DEEPSLATE_TILES));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.DEEPSLATE_TILES_PRESSURE_PLATE.get(), blockTexture(Blocks.DEEPSLATE_TILES));
        wallBlock((WallBlock) ModBlocks.DEEPSLATE_TILES_WALL.get(), blockTexture(Blocks.DEEPSLATE_TILES));
        fenceBlock((FenceBlock) ModBlocks.DEEPSLATE_TILES_FENCE.get(), blockTexture(Blocks.DEEPSLATE_TILES));

        fenceGateBlock((FenceGateBlock) ModBlocks.DEEPSLATE_TILES_FENCE_GATE.get(), blockTexture(Blocks.DEEPSLATE_TILES));
        slabBlock((SlabBlock) ModBlocks.DEEPSLATE_TILES_SLAB.get(), blockTexture(Blocks.DEEPSLATE_TILES), blockTexture(Blocks.DEEPSLATE_TILES));
        stairsBlock((StairBlock) ModBlocks.DEEPSLATE_TILES_STAIRS.get(), blockTexture(Blocks.DEEPSLATE_TILES));
        buttonBlock((ButtonBlock)ModBlocks.CRACKED_DEEPSLATE_TILES_BUTTON.get(), blockTexture(Blocks.CRACKED_DEEPSLATE_TILES));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.CRACKED_DEEPSLATE_TILES_PRESSURE_PLATE.get(), blockTexture(Blocks.CRACKED_DEEPSLATE_TILES));
        wallBlock((WallBlock) ModBlocks.CRACKED_DEEPSLATE_TILES_WALL.get(), blockTexture(Blocks.CRACKED_DEEPSLATE_TILES));
        fenceBlock((FenceBlock) ModBlocks.CRACKED_DEEPSLATE_TILES_FENCE.get(), blockTexture(Blocks.CRACKED_DEEPSLATE_TILES));

        fenceGateBlock((FenceGateBlock) ModBlocks.CRACKED_DEEPSLATE_TILES_FENCE_GATE.get(), blockTexture(Blocks.CRACKED_DEEPSLATE_TILES));
        slabBlock((SlabBlock) ModBlocks.CRACKED_DEEPSLATE_TILES_SLAB.get(), blockTexture(Blocks.CRACKED_DEEPSLATE_TILES), blockTexture(Blocks.CRACKED_DEEPSLATE_TILES));
        stairsBlock((StairBlock) ModBlocks.CRACKED_DEEPSLATE_TILES_STAIRS.get(), blockTexture(Blocks.CRACKED_DEEPSLATE_TILES));
        buttonBlock((ButtonBlock)ModBlocks.CHISELED_DEEPSLATE_BUTTON.get(), blockTexture(Blocks.CHISELED_DEEPSLATE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.CHISELED_DEEPSLATE_PRESSURE_PLATE.get(), blockTexture(Blocks.CHISELED_DEEPSLATE));
        wallBlock((WallBlock) ModBlocks.CHISELED_DEEPSLATE_WALL.get(), blockTexture(Blocks.CHISELED_DEEPSLATE));
        fenceBlock((FenceBlock) ModBlocks.CHISELED_DEEPSLATE_FENCE.get(), blockTexture(Blocks.CHISELED_DEEPSLATE));

        fenceGateBlock((FenceGateBlock) ModBlocks.CHISELED_DEEPSLATE_FENCE_GATE.get(), blockTexture(Blocks.CHISELED_DEEPSLATE));
        slabBlock((SlabBlock) ModBlocks.CHISELED_DEEPSLATE_SLAB.get(), blockTexture(Blocks.CHISELED_DEEPSLATE), blockTexture(Blocks.CHISELED_DEEPSLATE));
        stairsBlock((StairBlock) ModBlocks.CHISELED_DEEPSLATE_STAIRS.get(), blockTexture(Blocks.CHISELED_DEEPSLATE));
        buttonBlock((ButtonBlock)ModBlocks.MUSHROOM_STEM_BUTTON.get(), blockTexture(Blocks.MUSHROOM_STEM));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.MUSHROOM_STEM_PRESSURE_PLATE.get(), blockTexture(Blocks.MUSHROOM_STEM));
        wallBlock((WallBlock) ModBlocks.MUSHROOM_STEM_WALL.get(), blockTexture(Blocks.MUSHROOM_STEM));
        fenceBlock((FenceBlock) ModBlocks.MUSHROOM_STEM_FENCE.get(), blockTexture(Blocks.MUSHROOM_STEM));

        fenceGateBlock((FenceGateBlock) ModBlocks.MUSHROOM_STEM_FENCE_GATE.get(), blockTexture(Blocks.MUSHROOM_STEM));
        slabBlock((SlabBlock) ModBlocks.MUSHROOM_STEM_SLAB.get(), blockTexture(Blocks.MUSHROOM_STEM), blockTexture(Blocks.MUSHROOM_STEM));
        stairsBlock((StairBlock) ModBlocks.MUSHROOM_STEM_STAIRS.get(), blockTexture(Blocks.MUSHROOM_STEM));
        buttonBlock((ButtonBlock)ModBlocks.NETHER_BRICKS_BUTTON.get(), blockTexture(Blocks.NETHER_BRICKS));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.NETHER_BRICKS_PRESSURE_PLATE.get(), blockTexture(Blocks.NETHER_BRICKS));
        wallBlock((WallBlock) ModBlocks.NETHER_BRICKS_WALL.get(), blockTexture(Blocks.NETHER_BRICKS));
        fenceBlock((FenceBlock) ModBlocks.NETHER_BRICKS_FENCE.get(), blockTexture(Blocks.NETHER_BRICKS));

        fenceGateBlock((FenceGateBlock) ModBlocks.NETHER_BRICKS_FENCE_GATE.get(), blockTexture(Blocks.NETHER_BRICKS));
        slabBlock((SlabBlock) ModBlocks.NETHER_BRICKS_SLAB.get(), blockTexture(Blocks.NETHER_BRICKS), blockTexture(Blocks.NETHER_BRICKS));
        stairsBlock((StairBlock) ModBlocks.NETHER_BRICKS_STAIRS.get(), blockTexture(Blocks.NETHER_BRICKS));
        buttonBlock((ButtonBlock)ModBlocks.CRACKED_NETHER_BRICKS_BUTTON.get(), blockTexture(Blocks.CRACKED_NETHER_BRICKS));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.CRACKED_NETHER_BRICKS_PRESSURE_PLATE.get(), blockTexture(Blocks.CRACKED_NETHER_BRICKS));
        wallBlock((WallBlock) ModBlocks.CRACKED_NETHER_BRICKS_WALL.get(), blockTexture(Blocks.CRACKED_NETHER_BRICKS));
        fenceBlock((FenceBlock) ModBlocks.CRACKED_NETHER_BRICKS_FENCE.get(), blockTexture(Blocks.CRACKED_NETHER_BRICKS));

        fenceGateBlock((FenceGateBlock) ModBlocks.CRACKED_NETHER_BRICKS_FENCE_GATE.get(), blockTexture(Blocks.CRACKED_NETHER_BRICKS));
        slabBlock((SlabBlock) ModBlocks.CRACKED_NETHER_BRICKS_SLAB.get(), blockTexture(Blocks.CRACKED_NETHER_BRICKS), blockTexture(Blocks.CRACKED_NETHER_BRICKS));
        stairsBlock((StairBlock) ModBlocks.CRACKED_NETHER_BRICKS_STAIRS.get(), blockTexture(Blocks.CRACKED_NETHER_BRICKS));
        buttonBlock((ButtonBlock)ModBlocks.CHISELED_NETHER_BRICKS_BUTTON.get(), blockTexture(Blocks.CHISELED_NETHER_BRICKS));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.CHISELED_NETHER_BRICKS_PRESSURE_PLATE.get(), blockTexture(Blocks.CHISELED_NETHER_BRICKS));
        wallBlock((WallBlock) ModBlocks.CHISELED_NETHER_BRICKS_WALL.get(), blockTexture(Blocks.CHISELED_NETHER_BRICKS));
        fenceBlock((FenceBlock) ModBlocks.CHISELED_NETHER_BRICKS_FENCE.get(), blockTexture(Blocks.CHISELED_NETHER_BRICKS));

        fenceGateBlock((FenceGateBlock) ModBlocks.CHISELED_NETHER_BRICKS_FENCE_GATE.get(), blockTexture(Blocks.CHISELED_NETHER_BRICKS));
        slabBlock((SlabBlock) ModBlocks.CHISELED_NETHER_BRICKS_SLAB.get(), blockTexture(Blocks.CHISELED_NETHER_BRICKS), blockTexture(Blocks.CHISELED_NETHER_BRICKS));
        stairsBlock((StairBlock) ModBlocks.CHISELED_NETHER_BRICKS_STAIRS.get(), blockTexture(Blocks.CHISELED_NETHER_BRICKS));
        buttonBlock((ButtonBlock)ModBlocks.SCULK_BUTTON.get(), blockTexture(Blocks.SCULK));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.SCULK_PRESSURE_PLATE.get(), blockTexture(Blocks.SCULK));
        wallBlock((WallBlock) ModBlocks.SCULK_WALL.get(), blockTexture(Blocks.SCULK));
        fenceBlock((FenceBlock) ModBlocks.SCULK_FENCE.get(), blockTexture(Blocks.SCULK));

        fenceGateBlock((FenceGateBlock) ModBlocks.SCULK_FENCE_GATE.get(), blockTexture(Blocks.SCULK));
        slabBlock((SlabBlock) ModBlocks.SCULK_SLAB.get(), blockTexture(Blocks.SCULK), blockTexture(Blocks.SCULK));
        stairsBlock((StairBlock) ModBlocks.SCULK_STAIRS.get(), blockTexture(Blocks.SCULK));
        buttonBlock((ButtonBlock)ModBlocks.END_STONE_BUTTON.get(), blockTexture(Blocks.END_STONE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.END_STONE_PRESSURE_PLATE.get(), blockTexture(Blocks.END_STONE));
        wallBlock((WallBlock) ModBlocks.END_STONE_WALL.get(), blockTexture(Blocks.END_STONE));
        fenceBlock((FenceBlock) ModBlocks.END_STONE_FENCE.get(), blockTexture(Blocks.END_STONE));

        fenceGateBlock((FenceGateBlock) ModBlocks.END_STONE_FENCE_GATE.get(), blockTexture(Blocks.END_STONE));
        slabBlock((SlabBlock) ModBlocks.END_STONE_SLAB.get(), blockTexture(Blocks.END_STONE), blockTexture(Blocks.END_STONE));
        stairsBlock((StairBlock) ModBlocks.END_STONE_STAIRS.get(), blockTexture(Blocks.END_STONE));
        buttonBlock((ButtonBlock)ModBlocks.END_STONE_BRICKS_BUTTON.get(), blockTexture(Blocks.END_STONE_BRICKS));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.END_STONE_BRICKS_PRESSURE_PLATE.get(), blockTexture(Blocks.END_STONE_BRICKS));
        wallBlock((WallBlock) ModBlocks.END_STONE_BRICKS_WALL.get(), blockTexture(Blocks.END_STONE_BRICKS));
        fenceBlock((FenceBlock) ModBlocks.END_STONE_BRICKS_FENCE.get(), blockTexture(Blocks.END_STONE_BRICKS));

        fenceGateBlock((FenceGateBlock) ModBlocks.END_STONE_BRICKS_FENCE_GATE.get(), blockTexture(Blocks.END_STONE_BRICKS));
        slabBlock((SlabBlock) ModBlocks.END_STONE_BRICKS_SLAB.get(), blockTexture(Blocks.END_STONE_BRICKS), blockTexture(Blocks.END_STONE_BRICKS));
        stairsBlock((StairBlock) ModBlocks.END_STONE_BRICKS_STAIRS.get(), blockTexture(Blocks.END_STONE_BRICKS));
        buttonBlock((ButtonBlock)ModBlocks.QUARTZ_BRICKS_BUTTON.get(), blockTexture(Blocks.QUARTZ_BRICKS));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.QUARTZ_BRICKS_PRESSURE_PLATE.get(), blockTexture(Blocks.QUARTZ_BRICKS));
        wallBlock((WallBlock) ModBlocks.QUARTZ_BRICKS_WALL.get(), blockTexture(Blocks.QUARTZ_BRICKS));
        fenceBlock((FenceBlock) ModBlocks.QUARTZ_BRICKS_FENCE.get(), blockTexture(Blocks.QUARTZ_BRICKS));

        fenceGateBlock((FenceGateBlock) ModBlocks.QUARTZ_BRICKS_FENCE_GATE.get(), blockTexture(Blocks.QUARTZ_BRICKS));
        slabBlock((SlabBlock) ModBlocks.QUARTZ_BRICKS_SLAB.get(), blockTexture(Blocks.QUARTZ_BRICKS), blockTexture(Blocks.QUARTZ_BRICKS));
        stairsBlock((StairBlock) ModBlocks.QUARTZ_BRICKS_STAIRS.get(), blockTexture(Blocks.QUARTZ_BRICKS));
        buttonBlock((ButtonBlock)ModBlocks.WHITE_TERRACOTTA_BUTTON.get(), blockTexture(Blocks.WHITE_TERRACOTTA));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.WHITE_TERRACOTTA_PRESSURE_PLATE.get(), blockTexture(Blocks.WHITE_TERRACOTTA));
        wallBlock((WallBlock) ModBlocks.WHITE_TERRACOTTA_WALL.get(), blockTexture(Blocks.WHITE_TERRACOTTA));
        fenceBlock((FenceBlock) ModBlocks.WHITE_TERRACOTTA_FENCE.get(), blockTexture(Blocks.WHITE_TERRACOTTA));

        fenceGateBlock((FenceGateBlock) ModBlocks.WHITE_TERRACOTTA_FENCE_GATE.get(), blockTexture(Blocks.WHITE_TERRACOTTA));
        slabBlock((SlabBlock) ModBlocks.WHITE_TERRACOTTA_SLAB.get(), blockTexture(Blocks.WHITE_TERRACOTTA), blockTexture(Blocks.WHITE_TERRACOTTA));
        stairsBlock((StairBlock) ModBlocks.WHITE_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.WHITE_TERRACOTTA));
        buttonBlock((ButtonBlock)ModBlocks.ORANGE_TERRACOTTA_BUTTON.get(), blockTexture(Blocks.ORANGE_TERRACOTTA));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.ORANGE_TERRACOTTA_PRESSURE_PLATE.get(), blockTexture(Blocks.ORANGE_TERRACOTTA));
        wallBlock((WallBlock) ModBlocks.ORANGE_TERRACOTTA_WALL.get(), blockTexture(Blocks.ORANGE_TERRACOTTA));
        fenceBlock((FenceBlock) ModBlocks.ORANGE_TERRACOTTA_FENCE.get(), blockTexture(Blocks.ORANGE_TERRACOTTA));

        fenceGateBlock((FenceGateBlock) ModBlocks.ORANGE_TERRACOTTA_FENCE_GATE.get(), blockTexture(Blocks.ORANGE_TERRACOTTA));
        slabBlock((SlabBlock) ModBlocks.ORANGE_TERRACOTTA_SLAB.get(), blockTexture(Blocks.ORANGE_TERRACOTTA), blockTexture(Blocks.ORANGE_TERRACOTTA));
        stairsBlock((StairBlock) ModBlocks.ORANGE_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.ORANGE_TERRACOTTA));
        buttonBlock((ButtonBlock)ModBlocks.MAGENTA_TERRACOTTA_BUTTON.get(), blockTexture(Blocks.MAGENTA_TERRACOTTA));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.MAGENTA_TERRACOTTA_PRESSURE_PLATE.get(), blockTexture(Blocks.MAGENTA_TERRACOTTA));
        wallBlock((WallBlock) ModBlocks.MAGENTA_TERRACOTTA_WALL.get(), blockTexture(Blocks.MAGENTA_TERRACOTTA));
        fenceBlock((FenceBlock) ModBlocks.MAGENTA_TERRACOTTA_FENCE.get(), blockTexture(Blocks.MAGENTA_TERRACOTTA));

        fenceGateBlock((FenceGateBlock) ModBlocks.MAGENTA_TERRACOTTA_FENCE_GATE.get(), blockTexture(Blocks.MAGENTA_TERRACOTTA));
        slabBlock((SlabBlock) ModBlocks.MAGENTA_TERRACOTTA_SLAB.get(), blockTexture(Blocks.MAGENTA_TERRACOTTA), blockTexture(Blocks.MAGENTA_TERRACOTTA));
        stairsBlock((StairBlock) ModBlocks.MAGENTA_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.MAGENTA_TERRACOTTA));
        buttonBlock((ButtonBlock)ModBlocks.LIGHT_BLUE_TERRACOTTA_BUTTON.get(), blockTexture(Blocks.LIGHT_BLUE_TERRACOTTA));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.LIGHT_BLUE_TERRACOTTA_PRESSURE_PLATE.get(), blockTexture(Blocks.LIGHT_BLUE_TERRACOTTA));
        wallBlock((WallBlock) ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get(), blockTexture(Blocks.LIGHT_BLUE_TERRACOTTA));
        fenceBlock((FenceBlock) ModBlocks.LIGHT_BLUE_TERRACOTTA_FENCE.get(), blockTexture(Blocks.LIGHT_BLUE_TERRACOTTA));

        fenceGateBlock((FenceGateBlock) ModBlocks.LIGHT_BLUE_TERRACOTTA_FENCE_GATE.get(), blockTexture(Blocks.LIGHT_BLUE_TERRACOTTA));
        slabBlock((SlabBlock) ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get(), blockTexture(Blocks.LIGHT_BLUE_TERRACOTTA), blockTexture(Blocks.LIGHT_BLUE_TERRACOTTA));
        stairsBlock((StairBlock) ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.LIGHT_BLUE_TERRACOTTA));
        buttonBlock((ButtonBlock)ModBlocks.YELLOW_TERRACOTTA_BUTTON.get(), blockTexture(Blocks.YELLOW_TERRACOTTA));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.YELLOW_TERRACOTTA_PRESSURE_PLATE.get(), blockTexture(Blocks.YELLOW_TERRACOTTA));
        wallBlock((WallBlock) ModBlocks.YELLOW_TERRACOTTA_WALL.get(), blockTexture(Blocks.YELLOW_TERRACOTTA));
        fenceBlock((FenceBlock) ModBlocks.YELLOW_TERRACOTTA_FENCE.get(), blockTexture(Blocks.YELLOW_TERRACOTTA));

        fenceGateBlock((FenceGateBlock) ModBlocks.YELLOW_TERRACOTTA_FENCE_GATE.get(), blockTexture(Blocks.YELLOW_TERRACOTTA));
        slabBlock((SlabBlock) ModBlocks.YELLOW_TERRACOTTA_SLAB.get(), blockTexture(Blocks.YELLOW_TERRACOTTA), blockTexture(Blocks.YELLOW_TERRACOTTA));
        stairsBlock((StairBlock) ModBlocks.YELLOW_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.YELLOW_TERRACOTTA));
        buttonBlock((ButtonBlock)ModBlocks.LIME_TERRACOTTA_BUTTON.get(), blockTexture(Blocks.LIME_TERRACOTTA));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.LIME_TERRACOTTA_PRESSURE_PLATE.get(), blockTexture(Blocks.LIME_TERRACOTTA));
        wallBlock((WallBlock) ModBlocks.LIME_TERRACOTTA_WALL.get(), blockTexture(Blocks.LIME_TERRACOTTA));
        fenceBlock((FenceBlock) ModBlocks.LIME_TERRACOTTA_FENCE.get(), blockTexture(Blocks.LIME_TERRACOTTA));

        fenceGateBlock((FenceGateBlock) ModBlocks.LIME_TERRACOTTA_FENCE_GATE.get(), blockTexture(Blocks.LIME_TERRACOTTA));
        slabBlock((SlabBlock) ModBlocks.LIME_TERRACOTTA_SLAB.get(), blockTexture(Blocks.LIME_TERRACOTTA), blockTexture(Blocks.LIME_TERRACOTTA));
        stairsBlock((StairBlock) ModBlocks.LIME_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.LIME_TERRACOTTA));
        buttonBlock((ButtonBlock)ModBlocks.PINK_TERRACOTTA_BUTTON.get(), blockTexture(Blocks.PINK_TERRACOTTA));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.PINK_TERRACOTTA_PRESSURE_PLATE.get(), blockTexture(Blocks.PINK_TERRACOTTA));
        wallBlock((WallBlock) ModBlocks.PINK_TERRACOTTA_WALL.get(), blockTexture(Blocks.PINK_TERRACOTTA));
        fenceBlock((FenceBlock) ModBlocks.PINK_TERRACOTTA_FENCE.get(), blockTexture(Blocks.PINK_TERRACOTTA));

        fenceGateBlock((FenceGateBlock) ModBlocks.PINK_TERRACOTTA_FENCE_GATE.get(), blockTexture(Blocks.PINK_TERRACOTTA));
        slabBlock((SlabBlock) ModBlocks.PINK_TERRACOTTA_SLAB.get(), blockTexture(Blocks.PINK_TERRACOTTA), blockTexture(Blocks.PINK_TERRACOTTA));
        stairsBlock((StairBlock) ModBlocks.PINK_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.PINK_TERRACOTTA));
        buttonBlock((ButtonBlock)ModBlocks.GRAY_TERRACOTTA_BUTTON.get(), blockTexture(Blocks.GRAY_TERRACOTTA));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.GRAY_TERRACOTTA_PRESSURE_PLATE.get(), blockTexture(Blocks.GRAY_TERRACOTTA));
        wallBlock((WallBlock) ModBlocks.GRAY_TERRACOTTA_WALL.get(), blockTexture(Blocks.GRAY_TERRACOTTA));
        fenceBlock((FenceBlock) ModBlocks.GRAY_TERRACOTTA_FENCE.get(), blockTexture(Blocks.GRAY_TERRACOTTA));

        fenceGateBlock((FenceGateBlock) ModBlocks.GRAY_TERRACOTTA_FENCE_GATE.get(), blockTexture(Blocks.GRAY_TERRACOTTA));
        slabBlock((SlabBlock) ModBlocks.GRAY_TERRACOTTA_SLAB.get(), blockTexture(Blocks.GRAY_TERRACOTTA), blockTexture(Blocks.GRAY_TERRACOTTA));
        stairsBlock((StairBlock) ModBlocks.GRAY_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.GRAY_TERRACOTTA));
        buttonBlock((ButtonBlock)ModBlocks.LIGHT_GRAY_TERRACOTTA_BUTTON.get(), blockTexture(Blocks.LIGHT_GRAY_TERRACOTTA));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.LIGHT_GRAY_TERRACOTTA_PRESSURE_PLATE.get(), blockTexture(Blocks.LIGHT_GRAY_TERRACOTTA));
        wallBlock((WallBlock) ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get(), blockTexture(Blocks.LIGHT_GRAY_TERRACOTTA));
        fenceBlock((FenceBlock) ModBlocks.LIGHT_GRAY_TERRACOTTA_FENCE.get(), blockTexture(Blocks.LIGHT_GRAY_TERRACOTTA));

        fenceGateBlock((FenceGateBlock) ModBlocks.LIGHT_GRAY_TERRACOTTA_FENCE_GATE.get(), blockTexture(Blocks.LIGHT_GRAY_TERRACOTTA));
        slabBlock((SlabBlock) ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get(), blockTexture(Blocks.LIGHT_GRAY_TERRACOTTA), blockTexture(Blocks.LIGHT_GRAY_TERRACOTTA));
        stairsBlock((StairBlock) ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.LIGHT_GRAY_TERRACOTTA));
        buttonBlock((ButtonBlock)ModBlocks.CYAN_TERRACOTTA_BUTTON.get(), blockTexture(Blocks.CYAN_TERRACOTTA));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.CYAN_TERRACOTTA_PRESSURE_PLATE.get(), blockTexture(Blocks.CYAN_TERRACOTTA));
        wallBlock((WallBlock) ModBlocks.CYAN_TERRACOTTA_WALL.get(), blockTexture(Blocks.CYAN_TERRACOTTA));
        fenceBlock((FenceBlock) ModBlocks.CYAN_TERRACOTTA_FENCE.get(), blockTexture(Blocks.CYAN_TERRACOTTA));

        fenceGateBlock((FenceGateBlock) ModBlocks.CYAN_TERRACOTTA_FENCE_GATE.get(), blockTexture(Blocks.CYAN_TERRACOTTA));
        slabBlock((SlabBlock) ModBlocks.CYAN_TERRACOTTA_SLAB.get(), blockTexture(Blocks.CYAN_TERRACOTTA), blockTexture(Blocks.CYAN_TERRACOTTA));
        stairsBlock((StairBlock) ModBlocks.CYAN_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.CYAN_TERRACOTTA));
        buttonBlock((ButtonBlock)ModBlocks.PURPLE_TERRACOTTA_BUTTON.get(), blockTexture(Blocks.PURPLE_TERRACOTTA));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.PURPLE_TERRACOTTA_PRESSURE_PLATE.get(), blockTexture(Blocks.PURPLE_TERRACOTTA));
        wallBlock((WallBlock) ModBlocks.PURPLE_TERRACOTTA_WALL.get(), blockTexture(Blocks.PURPLE_TERRACOTTA));
        fenceBlock((FenceBlock) ModBlocks.PURPLE_TERRACOTTA_FENCE.get(), blockTexture(Blocks.PURPLE_TERRACOTTA));

        fenceGateBlock((FenceGateBlock) ModBlocks.PURPLE_TERRACOTTA_FENCE_GATE.get(), blockTexture(Blocks.PURPLE_TERRACOTTA));
        slabBlock((SlabBlock) ModBlocks.PURPLE_TERRACOTTA_SLAB.get(), blockTexture(Blocks.PURPLE_TERRACOTTA), blockTexture(Blocks.PURPLE_TERRACOTTA));
        stairsBlock((StairBlock) ModBlocks.PURPLE_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.PURPLE_TERRACOTTA));
        buttonBlock((ButtonBlock)ModBlocks.BLUE_TERRACOTTA_BUTTON.get(), blockTexture(Blocks.BLUE_TERRACOTTA));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.BLUE_TERRACOTTA_PRESSURE_PLATE.get(), blockTexture(Blocks.BLUE_TERRACOTTA));
        wallBlock((WallBlock) ModBlocks.BLUE_TERRACOTTA_WALL.get(), blockTexture(Blocks.BLUE_TERRACOTTA));
        fenceBlock((FenceBlock) ModBlocks.BLUE_TERRACOTTA_FENCE.get(), blockTexture(Blocks.BLUE_TERRACOTTA));

        fenceGateBlock((FenceGateBlock) ModBlocks.BLUE_TERRACOTTA_FENCE_GATE.get(), blockTexture(Blocks.BLUE_TERRACOTTA));
        slabBlock((SlabBlock) ModBlocks.BLUE_TERRACOTTA_SLAB.get(), blockTexture(Blocks.BLUE_TERRACOTTA), blockTexture(Blocks.BLUE_TERRACOTTA));
        stairsBlock((StairBlock) ModBlocks.BLUE_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.BLUE_TERRACOTTA));
        buttonBlock((ButtonBlock)ModBlocks.BROWN_TERRACOTTA_BUTTON.get(), blockTexture(Blocks.BROWN_TERRACOTTA));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.BROWN_TERRACOTTA_PRESSURE_PLATE.get(), blockTexture(Blocks.BROWN_TERRACOTTA));
        wallBlock((WallBlock) ModBlocks.BROWN_TERRACOTTA_WALL.get(), blockTexture(Blocks.BROWN_TERRACOTTA));
        fenceBlock((FenceBlock) ModBlocks.BROWN_TERRACOTTA_FENCE.get(), blockTexture(Blocks.BROWN_TERRACOTTA));

        fenceGateBlock((FenceGateBlock) ModBlocks.BROWN_TERRACOTTA_FENCE_GATE.get(), blockTexture(Blocks.BROWN_TERRACOTTA));
        slabBlock((SlabBlock) ModBlocks.BROWN_TERRACOTTA_SLAB.get(), blockTexture(Blocks.BROWN_TERRACOTTA), blockTexture(Blocks.BROWN_TERRACOTTA));
        stairsBlock((StairBlock) ModBlocks.BROWN_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.BROWN_TERRACOTTA));
        buttonBlock((ButtonBlock)ModBlocks.GREEN_TERRACOTTA_BUTTON.get(), blockTexture(Blocks.GREEN_TERRACOTTA));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.GREEN_TERRACOTTA_PRESSURE_PLATE.get(), blockTexture(Blocks.GREEN_TERRACOTTA));
        wallBlock((WallBlock) ModBlocks.GREEN_TERRACOTTA_WALL.get(), blockTexture(Blocks.GREEN_TERRACOTTA));
        fenceBlock((FenceBlock) ModBlocks.GREEN_TERRACOTTA_FENCE.get(), blockTexture(Blocks.GREEN_TERRACOTTA));

        fenceGateBlock((FenceGateBlock) ModBlocks.GREEN_TERRACOTTA_FENCE_GATE.get(), blockTexture(Blocks.GREEN_TERRACOTTA));
        slabBlock((SlabBlock) ModBlocks.GREEN_TERRACOTTA_SLAB.get(), blockTexture(Blocks.GREEN_TERRACOTTA), blockTexture(Blocks.GREEN_TERRACOTTA));
        stairsBlock((StairBlock) ModBlocks.GREEN_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.GREEN_TERRACOTTA));
        buttonBlock((ButtonBlock)ModBlocks.RED_TERRACOTTA_BUTTON.get(), blockTexture(Blocks.RED_TERRACOTTA));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.RED_TERRACOTTA_PRESSURE_PLATE.get(), blockTexture(Blocks.RED_TERRACOTTA));
        wallBlock((WallBlock) ModBlocks.RED_TERRACOTTA_WALL.get(), blockTexture(Blocks.RED_TERRACOTTA));
        fenceBlock((FenceBlock) ModBlocks.RED_TERRACOTTA_FENCE.get(), blockTexture(Blocks.RED_TERRACOTTA));

        fenceGateBlock((FenceGateBlock) ModBlocks.RED_TERRACOTTA_FENCE_GATE.get(), blockTexture(Blocks.RED_TERRACOTTA));
        slabBlock((SlabBlock) ModBlocks.RED_TERRACOTTA_SLAB.get(), blockTexture(Blocks.RED_TERRACOTTA), blockTexture(Blocks.RED_TERRACOTTA));
        stairsBlock((StairBlock) ModBlocks.RED_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.RED_TERRACOTTA));
        buttonBlock((ButtonBlock)ModBlocks.BLACK_TERRACOTTA_BUTTON.get(), blockTexture(Blocks.BLACK_TERRACOTTA));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.BLACK_TERRACOTTA_PRESSURE_PLATE.get(), blockTexture(Blocks.BLACK_TERRACOTTA));
        wallBlock((WallBlock) ModBlocks.BLACK_TERRACOTTA_WALL.get(), blockTexture(Blocks.BLACK_TERRACOTTA));
        fenceBlock((FenceBlock) ModBlocks.BLACK_TERRACOTTA_FENCE.get(), blockTexture(Blocks.BLACK_TERRACOTTA));

        fenceGateBlock((FenceGateBlock) ModBlocks.BLACK_TERRACOTTA_FENCE_GATE.get(), blockTexture(Blocks.BLACK_TERRACOTTA));
        slabBlock((SlabBlock) ModBlocks.BLACK_TERRACOTTA_SLAB.get(), blockTexture(Blocks.BLACK_TERRACOTTA), blockTexture(Blocks.BLACK_TERRACOTTA));
        stairsBlock((StairBlock) ModBlocks.BLACK_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.BLACK_TERRACOTTA));
        buttonBlock((ButtonBlock)ModBlocks.TERRACOTTA_BUTTON.get(), blockTexture(Blocks.TERRACOTTA));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.TERRACOTTA_PRESSURE_PLATE.get(), blockTexture(Blocks.TERRACOTTA));
        wallBlock((WallBlock) ModBlocks.TERRACOTTA_WALL.get(), blockTexture(Blocks.TERRACOTTA));
        fenceBlock((FenceBlock) ModBlocks.TERRACOTTA_FENCE.get(), blockTexture(Blocks.TERRACOTTA));

        fenceGateBlock((FenceGateBlock) ModBlocks.TERRACOTTA_FENCE_GATE.get(), blockTexture(Blocks.TERRACOTTA));
        slabBlock((SlabBlock) ModBlocks.TERRACOTTA_SLAB.get(), blockTexture(Blocks.TERRACOTTA), blockTexture(Blocks.TERRACOTTA));
        stairsBlock((StairBlock) ModBlocks.TERRACOTTA_STAIRS.get(), blockTexture(Blocks.TERRACOTTA));
        buttonBlock((ButtonBlock)ModBlocks.PRISMARINE_BUTTON.get(), blockTexture(Blocks.PRISMARINE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.PRISMARINE_PRESSURE_PLATE.get(), blockTexture(Blocks.PRISMARINE));
        wallBlock((WallBlock) ModBlocks.PRISMARINE_WALL.get(), blockTexture(Blocks.PRISMARINE));
        fenceBlock((FenceBlock) ModBlocks.PRISMARINE_FENCE.get(), blockTexture(Blocks.PRISMARINE));

        fenceGateBlock((FenceGateBlock) ModBlocks.PRISMARINE_FENCE_GATE.get(), blockTexture(Blocks.PRISMARINE));
        slabBlock((SlabBlock) ModBlocks.PRISMARINE_SLAB.get(), blockTexture(Blocks.PRISMARINE), blockTexture(Blocks.PRISMARINE));
        stairsBlock((StairBlock) ModBlocks.PRISMARINE_STAIRS.get(), blockTexture(Blocks.PRISMARINE));
        buttonBlock((ButtonBlock)ModBlocks.PRISMARINE_BRICKS_BUTTON.get(), blockTexture(Blocks.PRISMARINE_BRICKS));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.PRISMARINE_BRICKS_PRESSURE_PLATE.get(), blockTexture(Blocks.PRISMARINE_BRICKS));
        wallBlock((WallBlock) ModBlocks.PRISMARINE_BRICKS_WALL.get(), blockTexture(Blocks.PRISMARINE_BRICKS));
        fenceBlock((FenceBlock) ModBlocks.PRISMARINE_BRICKS_FENCE.get(), blockTexture(Blocks.PRISMARINE_BRICKS));

        fenceGateBlock((FenceGateBlock) ModBlocks.PRISMARINE_BRICKS_FENCE_GATE.get(), blockTexture(Blocks.PRISMARINE_BRICKS));
        slabBlock((SlabBlock) ModBlocks.PRISMARINE_BRICKS_SLAB.get(), blockTexture(Blocks.PRISMARINE_BRICKS), blockTexture(Blocks.PRISMARINE_BRICKS));
        stairsBlock((StairBlock) ModBlocks.PRISMARINE_BRICKS_STAIRS.get(), blockTexture(Blocks.PRISMARINE_BRICKS));
        buttonBlock((ButtonBlock)ModBlocks.DARK_PRISMARINE_BUTTON.get(), blockTexture(Blocks.DARK_PRISMARINE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.DARK_PRISMARINE_PRESSURE_PLATE.get(), blockTexture(Blocks.DARK_PRISMARINE));
        wallBlock((WallBlock) ModBlocks.DARK_PRISMARINE_WALL.get(), blockTexture(Blocks.DARK_PRISMARINE));
        fenceBlock((FenceBlock) ModBlocks.DARK_PRISMARINE_FENCE.get(), blockTexture(Blocks.DARK_PRISMARINE));

        fenceGateBlock((FenceGateBlock) ModBlocks.DARK_PRISMARINE_FENCE_GATE.get(), blockTexture(Blocks.DARK_PRISMARINE));
        slabBlock((SlabBlock) ModBlocks.DARK_PRISMARINE_SLAB.get(), blockTexture(Blocks.DARK_PRISMARINE), blockTexture(Blocks.DARK_PRISMARINE));
        stairsBlock((StairBlock) ModBlocks.DARK_PRISMARINE_STAIRS.get(), blockTexture(Blocks.DARK_PRISMARINE));
        buttonBlock((ButtonBlock)ModBlocks.NETHER_WART_BLOCK_BUTTON.get(), blockTexture(Blocks.NETHER_WART_BLOCK));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.NETHER_WART_BLOCK_PRESSURE_PLATE.get(), blockTexture(Blocks.NETHER_WART_BLOCK));
        wallBlock((WallBlock) ModBlocks.NETHER_WART_BLOCK_WALL.get(), blockTexture(Blocks.NETHER_WART_BLOCK));
        fenceBlock((FenceBlock) ModBlocks.NETHER_WART_BLOCK_FENCE.get(), blockTexture(Blocks.NETHER_WART_BLOCK));

        fenceGateBlock((FenceGateBlock) ModBlocks.NETHER_WART_BLOCK_FENCE_GATE.get(), blockTexture(Blocks.NETHER_WART_BLOCK));
        slabBlock((SlabBlock) ModBlocks.NETHER_WART_BLOCK_SLAB.get(), blockTexture(Blocks.NETHER_WART_BLOCK), blockTexture(Blocks.NETHER_WART_BLOCK));
        stairsBlock((StairBlock) ModBlocks.NETHER_WART_BLOCK_STAIRS.get(), blockTexture(Blocks.NETHER_WART_BLOCK));
        buttonBlock((ButtonBlock)ModBlocks.WARPED_WART_BLOCK_BUTTON.get(), blockTexture(Blocks.WARPED_WART_BLOCK));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.WARPED_WART_BLOCK_PRESSURE_PLATE.get(), blockTexture(Blocks.WARPED_WART_BLOCK));
        wallBlock((WallBlock) ModBlocks.WARPED_WART_BLOCK_WALL.get(), blockTexture(Blocks.WARPED_WART_BLOCK));
        fenceBlock((FenceBlock) ModBlocks.WARPED_WART_BLOCK_FENCE.get(), blockTexture(Blocks.WARPED_WART_BLOCK));

        fenceGateBlock((FenceGateBlock) ModBlocks.WARPED_WART_BLOCK_FENCE_GATE.get(), blockTexture(Blocks.WARPED_WART_BLOCK));
        slabBlock((SlabBlock) ModBlocks.WARPED_WART_BLOCK_SLAB.get(), blockTexture(Blocks.WARPED_WART_BLOCK), blockTexture(Blocks.WARPED_WART_BLOCK));
        stairsBlock((StairBlock) ModBlocks.WARPED_WART_BLOCK_STAIRS.get(), blockTexture(Blocks.WARPED_WART_BLOCK));
        buttonBlock((ButtonBlock)ModBlocks.RED_NETHER_BRICKS_BUTTON.get(), blockTexture(Blocks.RED_NETHER_BRICKS));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.RED_NETHER_BRICKS_PRESSURE_PLATE.get(), blockTexture(Blocks.RED_NETHER_BRICKS));
        wallBlock((WallBlock) ModBlocks.RED_NETHER_BRICKS_WALL.get(), blockTexture(Blocks.RED_NETHER_BRICKS));
        fenceBlock((FenceBlock) ModBlocks.RED_NETHER_BRICKS_FENCE.get(), blockTexture(Blocks.RED_NETHER_BRICKS));

        fenceGateBlock((FenceGateBlock) ModBlocks.RED_NETHER_BRICKS_FENCE_GATE.get(), blockTexture(Blocks.RED_NETHER_BRICKS));
        slabBlock((SlabBlock) ModBlocks.RED_NETHER_BRICKS_SLAB.get(), blockTexture(Blocks.RED_NETHER_BRICKS), blockTexture(Blocks.RED_NETHER_BRICKS));
        stairsBlock((StairBlock) ModBlocks.RED_NETHER_BRICKS_STAIRS.get(), blockTexture(Blocks.RED_NETHER_BRICKS));
        buttonBlock((ButtonBlock)ModBlocks.WHITE_CONCRETE_BUTTON.get(), blockTexture(Blocks.WHITE_CONCRETE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.WHITE_CONCRETE_PRESSURE_PLATE.get(), blockTexture(Blocks.WHITE_CONCRETE));
        wallBlock((WallBlock) ModBlocks.WHITE_CONCRETE_WALL.get(), blockTexture(Blocks.WHITE_CONCRETE));
        fenceBlock((FenceBlock) ModBlocks.WHITE_CONCRETE_FENCE.get(), blockTexture(Blocks.WHITE_CONCRETE));

        fenceGateBlock((FenceGateBlock) ModBlocks.WHITE_CONCRETE_FENCE_GATE.get(), blockTexture(Blocks.WHITE_CONCRETE));
        slabBlock((SlabBlock) ModBlocks.WHITE_CONCRETE_SLAB.get(), blockTexture(Blocks.WHITE_CONCRETE), blockTexture(Blocks.WHITE_CONCRETE));
        stairsBlock((StairBlock) ModBlocks.WHITE_CONCRETE_STAIRS.get(), blockTexture(Blocks.WHITE_CONCRETE));
        buttonBlock((ButtonBlock)ModBlocks.ORANGE_CONCRETE_BUTTON.get(), blockTexture(Blocks.ORANGE_CONCRETE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.ORANGE_CONCRETE_PRESSURE_PLATE.get(), blockTexture(Blocks.ORANGE_CONCRETE));
        wallBlock((WallBlock) ModBlocks.ORANGE_CONCRETE_WALL.get(), blockTexture(Blocks.ORANGE_CONCRETE));
        fenceBlock((FenceBlock) ModBlocks.ORANGE_CONCRETE_FENCE.get(), blockTexture(Blocks.ORANGE_CONCRETE));

        fenceGateBlock((FenceGateBlock) ModBlocks.ORANGE_CONCRETE_FENCE_GATE.get(), blockTexture(Blocks.ORANGE_CONCRETE));
        slabBlock((SlabBlock) ModBlocks.ORANGE_CONCRETE_SLAB.get(), blockTexture(Blocks.ORANGE_CONCRETE), blockTexture(Blocks.ORANGE_CONCRETE));
        stairsBlock((StairBlock) ModBlocks.ORANGE_CONCRETE_STAIRS.get(), blockTexture(Blocks.ORANGE_CONCRETE));
        buttonBlock((ButtonBlock)ModBlocks.MAGENTA_CONCRETE_BUTTON.get(), blockTexture(Blocks.MAGENTA_CONCRETE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE.get(), blockTexture(Blocks.MAGENTA_CONCRETE));
        wallBlock((WallBlock) ModBlocks.MAGENTA_CONCRETE_WALL.get(), blockTexture(Blocks.MAGENTA_CONCRETE));
        fenceBlock((FenceBlock) ModBlocks.MAGENTA_CONCRETE_FENCE.get(), blockTexture(Blocks.MAGENTA_CONCRETE));

        fenceGateBlock((FenceGateBlock) ModBlocks.MAGENTA_CONCRETE_FENCE_GATE.get(), blockTexture(Blocks.MAGENTA_CONCRETE));
        slabBlock((SlabBlock) ModBlocks.MAGENTA_CONCRETE_SLAB.get(), blockTexture(Blocks.MAGENTA_CONCRETE), blockTexture(Blocks.MAGENTA_CONCRETE));
        stairsBlock((StairBlock) ModBlocks.MAGENTA_CONCRETE_STAIRS.get(), blockTexture(Blocks.MAGENTA_CONCRETE));
        buttonBlock((ButtonBlock)ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON.get(), blockTexture(Blocks.LIGHT_BLUE_CONCRETE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE.get(), blockTexture(Blocks.LIGHT_BLUE_CONCRETE));
        wallBlock((WallBlock) ModBlocks.LIGHT_BLUE_CONCRETE_WALL.get(), blockTexture(Blocks.LIGHT_BLUE_CONCRETE));
        fenceBlock((FenceBlock) ModBlocks.LIGHT_BLUE_CONCRETE_FENCE.get(), blockTexture(Blocks.LIGHT_BLUE_CONCRETE));

        fenceGateBlock((FenceGateBlock) ModBlocks.LIGHT_BLUE_CONCRETE_FENCE_GATE.get(), blockTexture(Blocks.LIGHT_BLUE_CONCRETE));
        slabBlock((SlabBlock) ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), blockTexture(Blocks.LIGHT_BLUE_CONCRETE), blockTexture(Blocks.LIGHT_BLUE_CONCRETE));
        stairsBlock((StairBlock) ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get(), blockTexture(Blocks.LIGHT_BLUE_CONCRETE));
        buttonBlock((ButtonBlock)ModBlocks.YELLOW_CONCRETE_BUTTON.get(), blockTexture(Blocks.YELLOW_CONCRETE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.YELLOW_CONCRETE_PRESSURE_PLATE.get(), blockTexture(Blocks.YELLOW_CONCRETE));
        wallBlock((WallBlock) ModBlocks.YELLOW_CONCRETE_WALL.get(), blockTexture(Blocks.YELLOW_CONCRETE));
        fenceBlock((FenceBlock) ModBlocks.YELLOW_CONCRETE_FENCE.get(), blockTexture(Blocks.YELLOW_CONCRETE));

        fenceGateBlock((FenceGateBlock) ModBlocks.YELLOW_CONCRETE_FENCE_GATE.get(), blockTexture(Blocks.YELLOW_CONCRETE));
        slabBlock((SlabBlock) ModBlocks.YELLOW_CONCRETE_SLAB.get(), blockTexture(Blocks.YELLOW_CONCRETE), blockTexture(Blocks.YELLOW_CONCRETE));
        stairsBlock((StairBlock) ModBlocks.YELLOW_CONCRETE_STAIRS.get(), blockTexture(Blocks.YELLOW_CONCRETE));
        buttonBlock((ButtonBlock)ModBlocks.LIME_CONCRETE_BUTTON.get(), blockTexture(Blocks.LIME_CONCRETE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.LIME_CONCRETE_PRESSURE_PLATE.get(), blockTexture(Blocks.LIME_CONCRETE));
        wallBlock((WallBlock) ModBlocks.LIME_CONCRETE_WALL.get(), blockTexture(Blocks.LIME_CONCRETE));
        fenceBlock((FenceBlock) ModBlocks.LIME_CONCRETE_FENCE.get(), blockTexture(Blocks.LIME_CONCRETE));

        fenceGateBlock((FenceGateBlock) ModBlocks.LIME_CONCRETE_FENCE_GATE.get(), blockTexture(Blocks.LIME_CONCRETE));
        slabBlock((SlabBlock) ModBlocks.LIME_CONCRETE_SLAB.get(), blockTexture(Blocks.LIME_CONCRETE), blockTexture(Blocks.LIME_CONCRETE));
        stairsBlock((StairBlock) ModBlocks.LIME_CONCRETE_STAIRS.get(), blockTexture(Blocks.LIME_CONCRETE));
        buttonBlock((ButtonBlock)ModBlocks.PINK_CONCRETE_BUTTON.get(), blockTexture(Blocks.PINK_CONCRETE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.PINK_CONCRETE_PRESSURE_PLATE.get(), blockTexture(Blocks.PINK_CONCRETE));
        wallBlock((WallBlock) ModBlocks.PINK_CONCRETE_WALL.get(), blockTexture(Blocks.PINK_CONCRETE));
        fenceBlock((FenceBlock) ModBlocks.PINK_CONCRETE_FENCE.get(), blockTexture(Blocks.PINK_CONCRETE));

        fenceGateBlock((FenceGateBlock) ModBlocks.PINK_CONCRETE_FENCE_GATE.get(), blockTexture(Blocks.PINK_CONCRETE));
        slabBlock((SlabBlock) ModBlocks.PINK_CONCRETE_SLAB.get(), blockTexture(Blocks.PINK_CONCRETE), blockTexture(Blocks.PINK_CONCRETE));
        stairsBlock((StairBlock) ModBlocks.PINK_CONCRETE_STAIRS.get(), blockTexture(Blocks.PINK_CONCRETE));
        buttonBlock((ButtonBlock)ModBlocks.GRAY_CONCRETE_BUTTON.get(), blockTexture(Blocks.GRAY_CONCRETE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.GRAY_CONCRETE_PRESSURE_PLATE.get(), blockTexture(Blocks.GRAY_CONCRETE));
        wallBlock((WallBlock) ModBlocks.GRAY_CONCRETE_WALL.get(), blockTexture(Blocks.GRAY_CONCRETE));
        fenceBlock((FenceBlock) ModBlocks.GRAY_CONCRETE_FENCE.get(), blockTexture(Blocks.GRAY_CONCRETE));

        fenceGateBlock((FenceGateBlock) ModBlocks.GRAY_CONCRETE_FENCE_GATE.get(), blockTexture(Blocks.GRAY_CONCRETE));
        slabBlock((SlabBlock) ModBlocks.GRAY_CONCRETE_SLAB.get(), blockTexture(Blocks.GRAY_CONCRETE), blockTexture(Blocks.GRAY_CONCRETE));
        stairsBlock((StairBlock) ModBlocks.GRAY_CONCRETE_STAIRS.get(), blockTexture(Blocks.GRAY_CONCRETE));
        buttonBlock((ButtonBlock)ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON.get(), blockTexture(Blocks.LIGHT_GRAY_CONCRETE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE.get(), blockTexture(Blocks.LIGHT_GRAY_CONCRETE));
        wallBlock((WallBlock) ModBlocks.LIGHT_GRAY_CONCRETE_WALL.get(), blockTexture(Blocks.LIGHT_GRAY_CONCRETE));
        fenceBlock((FenceBlock) ModBlocks.LIGHT_GRAY_CONCRETE_FENCE.get(), blockTexture(Blocks.LIGHT_GRAY_CONCRETE));

        fenceGateBlock((FenceGateBlock) ModBlocks.LIGHT_GRAY_CONCRETE_FENCE_GATE.get(), blockTexture(Blocks.LIGHT_GRAY_CONCRETE));
        slabBlock((SlabBlock) ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), blockTexture(Blocks.LIGHT_GRAY_CONCRETE), blockTexture(Blocks.LIGHT_GRAY_CONCRETE));
        stairsBlock((StairBlock) ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get(), blockTexture(Blocks.LIGHT_GRAY_CONCRETE));
        buttonBlock((ButtonBlock)ModBlocks.CYAN_CONCRETE_BUTTON.get(), blockTexture(Blocks.CYAN_CONCRETE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.CYAN_CONCRETE_PRESSURE_PLATE.get(), blockTexture(Blocks.CYAN_CONCRETE));
        wallBlock((WallBlock) ModBlocks.CYAN_CONCRETE_WALL.get(), blockTexture(Blocks.CYAN_CONCRETE));
        fenceBlock((FenceBlock) ModBlocks.CYAN_CONCRETE_FENCE.get(), blockTexture(Blocks.CYAN_CONCRETE));

        fenceGateBlock((FenceGateBlock) ModBlocks.CYAN_CONCRETE_FENCE_GATE.get(), blockTexture(Blocks.CYAN_CONCRETE));
        slabBlock((SlabBlock) ModBlocks.CYAN_CONCRETE_SLAB.get(), blockTexture(Blocks.CYAN_CONCRETE), blockTexture(Blocks.CYAN_CONCRETE));
        stairsBlock((StairBlock) ModBlocks.CYAN_CONCRETE_STAIRS.get(), blockTexture(Blocks.CYAN_CONCRETE));
        buttonBlock((ButtonBlock)ModBlocks.PURPLE_CONCRETE_BUTTON.get(), blockTexture(Blocks.PURPLE_CONCRETE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.PURPLE_CONCRETE_PRESSURE_PLATE.get(), blockTexture(Blocks.PURPLE_CONCRETE));
        wallBlock((WallBlock) ModBlocks.PURPLE_CONCRETE_WALL.get(), blockTexture(Blocks.PURPLE_CONCRETE));
        fenceBlock((FenceBlock) ModBlocks.PURPLE_CONCRETE_FENCE.get(), blockTexture(Blocks.PURPLE_CONCRETE));

        fenceGateBlock((FenceGateBlock) ModBlocks.PURPLE_CONCRETE_FENCE_GATE.get(), blockTexture(Blocks.PURPLE_CONCRETE));
        slabBlock((SlabBlock) ModBlocks.PURPLE_CONCRETE_SLAB.get(), blockTexture(Blocks.PURPLE_CONCRETE), blockTexture(Blocks.PURPLE_CONCRETE));
        stairsBlock((StairBlock) ModBlocks.PURPLE_CONCRETE_STAIRS.get(), blockTexture(Blocks.PURPLE_CONCRETE));
        buttonBlock((ButtonBlock)ModBlocks.BLUE_CONCRETE_BUTTON.get(), blockTexture(Blocks.BLUE_CONCRETE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.BLUE_CONCRETE_PRESSURE_PLATE.get(), blockTexture(Blocks.BLUE_CONCRETE));
        wallBlock((WallBlock) ModBlocks.BLUE_CONCRETE_WALL.get(), blockTexture(Blocks.BLUE_CONCRETE));
        fenceBlock((FenceBlock) ModBlocks.BLUE_CONCRETE_FENCE.get(), blockTexture(Blocks.BLUE_CONCRETE));

        fenceGateBlock((FenceGateBlock) ModBlocks.BLUE_CONCRETE_FENCE_GATE.get(), blockTexture(Blocks.BLUE_CONCRETE));
        slabBlock((SlabBlock) ModBlocks.BLUE_CONCRETE_SLAB.get(), blockTexture(Blocks.BLUE_CONCRETE), blockTexture(Blocks.BLUE_CONCRETE));
        stairsBlock((StairBlock) ModBlocks.BLUE_CONCRETE_STAIRS.get(), blockTexture(Blocks.BLUE_CONCRETE));
        buttonBlock((ButtonBlock)ModBlocks.BROWN_CONCRETE_BUTTON.get(), blockTexture(Blocks.BROWN_CONCRETE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.BROWN_CONCRETE_PRESSURE_PLATE.get(), blockTexture(Blocks.BROWN_CONCRETE));
        wallBlock((WallBlock) ModBlocks.BROWN_CONCRETE_WALL.get(), blockTexture(Blocks.BROWN_CONCRETE));
        fenceBlock((FenceBlock) ModBlocks.BROWN_CONCRETE_FENCE.get(), blockTexture(Blocks.BROWN_CONCRETE));

        fenceGateBlock((FenceGateBlock) ModBlocks.BROWN_CONCRETE_FENCE_GATE.get(), blockTexture(Blocks.BROWN_CONCRETE));
        slabBlock((SlabBlock) ModBlocks.BROWN_CONCRETE_SLAB.get(), blockTexture(Blocks.BROWN_CONCRETE), blockTexture(Blocks.BROWN_CONCRETE));
        stairsBlock((StairBlock) ModBlocks.BROWN_CONCRETE_STAIRS.get(), blockTexture(Blocks.BROWN_CONCRETE));
        buttonBlock((ButtonBlock)ModBlocks.GREEN_CONCRETE_BUTTON.get(), blockTexture(Blocks.GREEN_CONCRETE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.GREEN_CONCRETE_PRESSURE_PLATE.get(), blockTexture(Blocks.GREEN_CONCRETE));
        wallBlock((WallBlock) ModBlocks.GREEN_CONCRETE_WALL.get(), blockTexture(Blocks.GREEN_CONCRETE));
        fenceBlock((FenceBlock) ModBlocks.GREEN_CONCRETE_FENCE.get(), blockTexture(Blocks.GREEN_CONCRETE));

        fenceGateBlock((FenceGateBlock) ModBlocks.GREEN_CONCRETE_FENCE_GATE.get(), blockTexture(Blocks.GREEN_CONCRETE));
        slabBlock((SlabBlock) ModBlocks.GREEN_CONCRETE_SLAB.get(), blockTexture(Blocks.GREEN_CONCRETE), blockTexture(Blocks.GREEN_CONCRETE));
        stairsBlock((StairBlock) ModBlocks.GREEN_CONCRETE_STAIRS.get(), blockTexture(Blocks.GREEN_CONCRETE));
        buttonBlock((ButtonBlock)ModBlocks.RED_CONCRETE_BUTTON.get(), blockTexture(Blocks.RED_CONCRETE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.RED_CONCRETE_PRESSURE_PLATE.get(), blockTexture(Blocks.RED_CONCRETE));
        wallBlock((WallBlock) ModBlocks.RED_CONCRETE_WALL.get(), blockTexture(Blocks.RED_CONCRETE));
        fenceBlock((FenceBlock) ModBlocks.RED_CONCRETE_FENCE.get(), blockTexture(Blocks.RED_CONCRETE));

        fenceGateBlock((FenceGateBlock) ModBlocks.RED_CONCRETE_FENCE_GATE.get(), blockTexture(Blocks.RED_CONCRETE));
        slabBlock((SlabBlock) ModBlocks.RED_CONCRETE_SLAB.get(), blockTexture(Blocks.RED_CONCRETE), blockTexture(Blocks.RED_CONCRETE));
        stairsBlock((StairBlock) ModBlocks.RED_CONCRETE_STAIRS.get(), blockTexture(Blocks.RED_CONCRETE));
        buttonBlock((ButtonBlock)ModBlocks.BLACK_CONCRETE_BUTTON.get(), blockTexture(Blocks.BLACK_CONCRETE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.BLACK_CONCRETE_PRESSURE_PLATE.get(), blockTexture(Blocks.BLACK_CONCRETE));
        wallBlock((WallBlock) ModBlocks.BLACK_CONCRETE_WALL.get(), blockTexture(Blocks.BLACK_CONCRETE));
        fenceBlock((FenceBlock) ModBlocks.BLACK_CONCRETE_FENCE.get(), blockTexture(Blocks.BLACK_CONCRETE));

        fenceGateBlock((FenceGateBlock) ModBlocks.BLACK_CONCRETE_FENCE_GATE.get(), blockTexture(Blocks.BLACK_CONCRETE));
        slabBlock((SlabBlock) ModBlocks.BLACK_CONCRETE_SLAB.get(), blockTexture(Blocks.BLACK_CONCRETE), blockTexture(Blocks.BLACK_CONCRETE));
        stairsBlock((StairBlock) ModBlocks.BLACK_CONCRETE_STAIRS.get(), blockTexture(Blocks.BLACK_CONCRETE));
        buttonBlock((ButtonBlock)ModBlocks.HONEYCOMB_BLOCK_BUTTON.get(), blockTexture(Blocks.HONEYCOMB_BLOCK));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.HONEYCOMB_BLOCK_PRESSURE_PLATE.get(), blockTexture(Blocks.HONEYCOMB_BLOCK));
        wallBlock((WallBlock) ModBlocks.HONEYCOMB_BLOCK_WALL.get(), blockTexture(Blocks.HONEYCOMB_BLOCK));
        fenceBlock((FenceBlock) ModBlocks.HONEYCOMB_BLOCK_FENCE.get(), blockTexture(Blocks.HONEYCOMB_BLOCK));

        fenceGateBlock((FenceGateBlock) ModBlocks.HONEYCOMB_BLOCK_FENCE_GATE.get(), blockTexture(Blocks.HONEYCOMB_BLOCK));
        slabBlock((SlabBlock) ModBlocks.HONEYCOMB_BLOCK_SLAB.get(), blockTexture(Blocks.HONEYCOMB_BLOCK), blockTexture(Blocks.HONEYCOMB_BLOCK));
        stairsBlock((StairBlock) ModBlocks.HONEYCOMB_BLOCK_STAIRS.get(), blockTexture(Blocks.HONEYCOMB_BLOCK));
        buttonBlock((ButtonBlock)ModBlocks.CRYING_OBSIDIAN_BUTTON.get(), blockTexture(Blocks.CRYING_OBSIDIAN));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.CRYING_OBSIDIAN_PRESSURE_PLATE.get(), blockTexture(Blocks.CRYING_OBSIDIAN));
        wallBlock((WallBlock) ModBlocks.CRYING_OBSIDIAN_WALL.get(), blockTexture(Blocks.CRYING_OBSIDIAN));
        fenceBlock((FenceBlock) ModBlocks.CRYING_OBSIDIAN_FENCE.get(), blockTexture(Blocks.CRYING_OBSIDIAN));

        fenceGateBlock((FenceGateBlock) ModBlocks.CRYING_OBSIDIAN_FENCE_GATE.get(), blockTexture(Blocks.CRYING_OBSIDIAN));
        slabBlock((SlabBlock) ModBlocks.CRYING_OBSIDIAN_SLAB.get(), blockTexture(Blocks.CRYING_OBSIDIAN), blockTexture(Blocks.CRYING_OBSIDIAN));
        stairsBlock((StairBlock) ModBlocks.CRYING_OBSIDIAN_STAIRS.get(), blockTexture(Blocks.CRYING_OBSIDIAN));
        buttonBlock((ButtonBlock)ModBlocks.BLACKSTONE_BUTTON.get(), blockTexture(Blocks.BLACKSTONE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.BLACKSTONE_PRESSURE_PLATE.get(), blockTexture(Blocks.BLACKSTONE));
        wallBlock((WallBlock) ModBlocks.BLACKSTONE_WALL.get(), blockTexture(Blocks.BLACKSTONE));
        fenceBlock((FenceBlock) ModBlocks.BLACKSTONE_FENCE.get(), blockTexture(Blocks.BLACKSTONE));

        fenceGateBlock((FenceGateBlock) ModBlocks.BLACKSTONE_FENCE_GATE.get(), blockTexture(Blocks.BLACKSTONE));
        slabBlock((SlabBlock) ModBlocks.BLACKSTONE_SLAB.get(), blockTexture(Blocks.BLACKSTONE), blockTexture(Blocks.BLACKSTONE));
        stairsBlock((StairBlock) ModBlocks.BLACKSTONE_STAIRS.get(), blockTexture(Blocks.BLACKSTONE));
        buttonBlock((ButtonBlock)ModBlocks.GILDED_BLACKSTONE_BUTTON.get(), blockTexture(Blocks.GILDED_BLACKSTONE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.GILDED_BLACKSTONE_PRESSURE_PLATE.get(), blockTexture(Blocks.GILDED_BLACKSTONE));
        wallBlock((WallBlock) ModBlocks.GILDED_BLACKSTONE_WALL.get(), blockTexture(Blocks.GILDED_BLACKSTONE));
        fenceBlock((FenceBlock) ModBlocks.GILDED_BLACKSTONE_FENCE.get(), blockTexture(Blocks.GILDED_BLACKSTONE));

        fenceGateBlock((FenceGateBlock) ModBlocks.GILDED_BLACKSTONE_FENCE_GATE.get(), blockTexture(Blocks.GILDED_BLACKSTONE));
        slabBlock((SlabBlock) ModBlocks.GILDED_BLACKSTONE_SLAB.get(), blockTexture(Blocks.GILDED_BLACKSTONE), blockTexture(Blocks.GILDED_BLACKSTONE));
        stairsBlock((StairBlock) ModBlocks.GILDED_BLACKSTONE_STAIRS.get(), blockTexture(Blocks.GILDED_BLACKSTONE));
        buttonBlock((ButtonBlock)ModBlocks.POLISHED_BLACKSTONE_BUTTON.get(), blockTexture(Blocks.POLISHED_BLACKSTONE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.POLISHED_BLACKSTONE_PRESSURE_PLATE.get(), blockTexture(Blocks.POLISHED_BLACKSTONE));
        wallBlock((WallBlock) ModBlocks.POLISHED_BLACKSTONE_WALL.get(), blockTexture(Blocks.POLISHED_BLACKSTONE));
        fenceBlock((FenceBlock) ModBlocks.POLISHED_BLACKSTONE_FENCE.get(), blockTexture(Blocks.POLISHED_BLACKSTONE));

        fenceGateBlock((FenceGateBlock) ModBlocks.POLISHED_BLACKSTONE_FENCE_GATE.get(), blockTexture(Blocks.POLISHED_BLACKSTONE));
        slabBlock((SlabBlock) ModBlocks.POLISHED_BLACKSTONE_SLAB.get(), blockTexture(Blocks.POLISHED_BLACKSTONE), blockTexture(Blocks.POLISHED_BLACKSTONE));
        stairsBlock((StairBlock) ModBlocks.POLISHED_BLACKSTONE_STAIRS.get(), blockTexture(Blocks.POLISHED_BLACKSTONE));
        buttonBlock((ButtonBlock)ModBlocks.CHISELED_POLISHED_BLACKSTONE_BUTTON.get(), blockTexture(Blocks.CHISELED_POLISHED_BLACKSTONE));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.CHISELED_POLISHED_BLACKSTONE_PRESSURE_PLATE.get(), blockTexture(Blocks.CHISELED_POLISHED_BLACKSTONE));
        wallBlock((WallBlock) ModBlocks.CHISELED_POLISHED_BLACKSTONE_WALL.get(), blockTexture(Blocks.CHISELED_POLISHED_BLACKSTONE));
        fenceBlock((FenceBlock) ModBlocks.CHISELED_POLISHED_BLACKSTONE_FENCE.get(), blockTexture(Blocks.CHISELED_POLISHED_BLACKSTONE));

        fenceGateBlock((FenceGateBlock) ModBlocks.CHISELED_POLISHED_BLACKSTONE_FENCE_GATE.get(), blockTexture(Blocks.CHISELED_POLISHED_BLACKSTONE));
        slabBlock((SlabBlock) ModBlocks.CHISELED_POLISHED_BLACKSTONE_SLAB.get(), blockTexture(Blocks.CHISELED_POLISHED_BLACKSTONE), blockTexture(Blocks.CHISELED_POLISHED_BLACKSTONE));
        stairsBlock((StairBlock) ModBlocks.CHISELED_POLISHED_BLACKSTONE_STAIRS.get(), blockTexture(Blocks.CHISELED_POLISHED_BLACKSTONE));
        buttonBlock((ButtonBlock)ModBlocks.POLISHED_BLACKSTONE_BRICKS_BUTTON.get(), blockTexture(Blocks.POLISHED_BLACKSTONE_BRICKS));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.POLISHED_BLACKSTONE_BRICKS_PRESSURE_PLATE.get(), blockTexture(Blocks.POLISHED_BLACKSTONE_BRICKS));
        wallBlock((WallBlock) ModBlocks.POLISHED_BLACKSTONE_BRICKS_WALL.get(), blockTexture(Blocks.POLISHED_BLACKSTONE_BRICKS));
        fenceBlock((FenceBlock) ModBlocks.POLISHED_BLACKSTONE_BRICKS_FENCE.get(), blockTexture(Blocks.POLISHED_BLACKSTONE_BRICKS));

        fenceGateBlock((FenceGateBlock) ModBlocks.POLISHED_BLACKSTONE_BRICKS_FENCE_GATE.get(), blockTexture(Blocks.POLISHED_BLACKSTONE_BRICKS));
        slabBlock((SlabBlock) ModBlocks.POLISHED_BLACKSTONE_BRICKS_SLAB.get(), blockTexture(Blocks.POLISHED_BLACKSTONE_BRICKS), blockTexture(Blocks.POLISHED_BLACKSTONE_BRICKS));
        stairsBlock((StairBlock) ModBlocks.POLISHED_BLACKSTONE_BRICKS_STAIRS.get(), blockTexture(Blocks.POLISHED_BLACKSTONE_BRICKS));
        buttonBlock((ButtonBlock)ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_BUTTON.get(), blockTexture(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS));
        pressurePlateBlock((PressurePlateBlock)ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_PRESSURE_PLATE.get(), blockTexture(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS));
        wallBlock((WallBlock) ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_WALL.get(), blockTexture(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS));
        fenceBlock((FenceBlock) ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_FENCE.get(), blockTexture(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS));

        fenceGateBlock((FenceGateBlock) ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_FENCE_GATE.get(), blockTexture(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS));
        slabBlock((SlabBlock) ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_SLAB.get(), blockTexture(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS), blockTexture(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS));
        stairsBlock((StairBlock) ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_STAIRS.get(), blockTexture(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS));
    }
}