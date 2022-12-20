package net.litecraft.plentyofdecorations.block;

import net.litecraft.plentyofdecorations.PlentyOfDecorations;
import net.litecraft.plentyofdecorations.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.litecraft.plentyofdecorations.item.ModCreativeModeTab;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, PlentyOfDecorations.MOD_ID);

        public static final RegistryObject<Block> BEDROCK_STAIRS = registerBlock("bedrock_stairs",
            () -> new StairBlock(
                () -> Blocks.BEDROCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BEDROCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BEDROCK_SLAB = registerBlock("bedrock_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BEDROCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BEDROCK_CARPET = registerBlock("bedrock_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.BEDROCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BEDROCK_FENCE = registerBlock("bedrock_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.BEDROCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BEDROCK_FENCE_GATE = registerBlock("bedrock_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.BEDROCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BEDROCK_WALL = registerBlock("bedrock_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BEDROCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BEDROCK_BUTTON = registerBlock("bedrock_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.BEDROCK).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BEDROCK_PRESSURE_PLATE = registerBlock("bedrock_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.BEDROCK)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> BEDROCK_TRAPDOOR = registerBlock("bedrock_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.BEDROCK)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> BEDROCK_DOOR = registerBlock("bedrock_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.BEDROCK)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> COAL_ORE_STAIRS = registerBlock("coal_ore_stairs",
            () -> new StairBlock(
                () -> Blocks.COAL_ORE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COAL_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> COAL_ORE_SLAB = registerBlock("coal_ore_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> COAL_ORE_FENCE = registerBlock("coal_ore_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> COAL_ORE_FENCE_GATE = registerBlock("coal_ore_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> COAL_ORE_WALL = registerBlock("coal_ore_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> COAL_ORE_BUTTON = registerBlock("coal_ore_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> COAL_ORE_PRESSURE_PLATE = registerBlock("coal_ore_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.COAL_ORE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> COAL_ORE_TRAPDOOR = registerBlock("coal_ore_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> COAL_ORE_DOOR = registerBlock("coal_ore_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> LAPIS_ORE_STAIRS = registerBlock("lapis_ore_stairs",
            () -> new StairBlock(
                () -> Blocks.LAPIS_ORE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LAPIS_ORE_SLAB = registerBlock("lapis_ore_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LAPIS_ORE_FENCE = registerBlock("lapis_ore_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LAPIS_ORE_FENCE_GATE = registerBlock("lapis_ore_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LAPIS_ORE_WALL = registerBlock("lapis_ore_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LAPIS_ORE_BUTTON = registerBlock("lapis_ore_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LAPIS_ORE_PRESSURE_PLATE = registerBlock("lapis_ore_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> LAPIS_ORE_TRAPDOOR = registerBlock("lapis_ore_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> LAPIS_ORE_DOOR = registerBlock("lapis_ore_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> IRON_ORE_STAIRS = registerBlock("iron_ore_stairs",
            () -> new StairBlock(
                () -> Blocks.IRON_ORE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.IRON_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> IRON_ORE_SLAB = registerBlock("iron_ore_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> IRON_ORE_FENCE = registerBlock("iron_ore_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> IRON_ORE_FENCE_GATE = registerBlock("iron_ore_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> IRON_ORE_WALL = registerBlock("iron_ore_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> IRON_ORE_BUTTON = registerBlock("iron_ore_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> IRON_ORE_PRESSURE_PLATE = registerBlock("iron_ore_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.IRON_ORE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> IRON_ORE_TRAPDOOR = registerBlock("iron_ore_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> IRON_ORE_DOOR = registerBlock("iron_ore_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> COPPER_ORE_STAIRS = registerBlock("copper_ore_stairs",
            () -> new StairBlock(
                () -> Blocks.COPPER_ORE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COPPER_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> COPPER_ORE_SLAB = registerBlock("copper_ore_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> COPPER_ORE_FENCE = registerBlock("copper_ore_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> COPPER_ORE_FENCE_GATE = registerBlock("copper_ore_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> COPPER_ORE_WALL = registerBlock("copper_ore_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> COPPER_ORE_BUTTON = registerBlock("copper_ore_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> COPPER_ORE_PRESSURE_PLATE = registerBlock("copper_ore_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.COPPER_ORE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> COPPER_ORE_TRAPDOOR = registerBlock("copper_ore_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> COPPER_ORE_DOOR = registerBlock("copper_ore_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> GOLD_ORE_STAIRS = registerBlock("gold_ore_stairs",
            () -> new StairBlock(
                () -> Blocks.GOLD_ORE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GOLD_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GOLD_ORE_SLAB = registerBlock("gold_ore_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GOLD_ORE_FENCE = registerBlock("gold_ore_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GOLD_ORE_FENCE_GATE = registerBlock("gold_ore_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GOLD_ORE_WALL = registerBlock("gold_ore_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GOLD_ORE_BUTTON = registerBlock("gold_ore_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GOLD_ORE_PRESSURE_PLATE = registerBlock("gold_ore_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.GOLD_ORE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> GOLD_ORE_TRAPDOOR = registerBlock("gold_ore_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> GOLD_ORE_DOOR = registerBlock("gold_ore_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> DIAMOND_ORE_STAIRS = registerBlock("diamond_ore_stairs",
            () -> new StairBlock(
                () -> Blocks.DIAMOND_ORE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DIAMOND_ORE_SLAB = registerBlock("diamond_ore_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DIAMOND_ORE_FENCE = registerBlock("diamond_ore_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DIAMOND_ORE_FENCE_GATE = registerBlock("diamond_ore_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DIAMOND_ORE_WALL = registerBlock("diamond_ore_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DIAMOND_ORE_BUTTON = registerBlock("diamond_ore_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DIAMOND_ORE_PRESSURE_PLATE = registerBlock("diamond_ore_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> DIAMOND_ORE_TRAPDOOR = registerBlock("diamond_ore_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> DIAMOND_ORE_DOOR = registerBlock("diamond_ore_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> EMERALD_ORE_STAIRS = registerBlock("emerald_ore_stairs",
            () -> new StairBlock(
                () -> Blocks.EMERALD_ORE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.EMERALD_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> EMERALD_ORE_SLAB = registerBlock("emerald_ore_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> EMERALD_ORE_FENCE = registerBlock("emerald_ore_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> EMERALD_ORE_FENCE_GATE = registerBlock("emerald_ore_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> EMERALD_ORE_WALL = registerBlock("emerald_ore_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> EMERALD_ORE_BUTTON = registerBlock("emerald_ore_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_ORE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> EMERALD_ORE_PRESSURE_PLATE = registerBlock("emerald_ore_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.EMERALD_ORE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> EMERALD_ORE_TRAPDOOR = registerBlock("emerald_ore_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_ORE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> EMERALD_ORE_DOOR = registerBlock("emerald_ore_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_ORE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> DEEPSLATE_COAL_ORE_STAIRS = registerBlock("deepslate_coal_ore_stairs",
            () -> new StairBlock(
                () -> Blocks.DEEPSLATE_COAL_ORE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_COAL_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_COAL_ORE_SLAB = registerBlock("deepslate_coal_ore_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_COAL_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_COAL_ORE_FENCE = registerBlock("deepslate_coal_ore_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_COAL_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_COAL_ORE_FENCE_GATE = registerBlock("deepslate_coal_ore_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_COAL_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_COAL_ORE_WALL = registerBlock("deepslate_coal_ore_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_COAL_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_COAL_ORE_BUTTON = registerBlock("deepslate_coal_ore_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_COAL_ORE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_COAL_ORE_PRESSURE_PLATE = registerBlock("deepslate_coal_ore_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_COAL_ORE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> DEEPSLATE_COAL_ORE_TRAPDOOR = registerBlock("deepslate_coal_ore_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_COAL_ORE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> DEEPSLATE_COAL_ORE_DOOR = registerBlock("deepslate_coal_ore_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_COAL_ORE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> DEEPSLATE_LAPIS_ORE_STAIRS = registerBlock("deepslate_lapis_ore_stairs",
            () -> new StairBlock(
                () -> Blocks.DEEPSLATE_LAPIS_ORE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_LAPIS_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_LAPIS_ORE_SLAB = registerBlock("deepslate_lapis_ore_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_LAPIS_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_LAPIS_ORE_FENCE = registerBlock("deepslate_lapis_ore_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_LAPIS_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_LAPIS_ORE_FENCE_GATE = registerBlock("deepslate_lapis_ore_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_LAPIS_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_LAPIS_ORE_WALL = registerBlock("deepslate_lapis_ore_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_LAPIS_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_LAPIS_ORE_BUTTON = registerBlock("deepslate_lapis_ore_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_LAPIS_ORE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_LAPIS_ORE_PRESSURE_PLATE = registerBlock("deepslate_lapis_ore_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_LAPIS_ORE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> DEEPSLATE_LAPIS_ORE_TRAPDOOR = registerBlock("deepslate_lapis_ore_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_LAPIS_ORE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> DEEPSLATE_LAPIS_ORE_DOOR = registerBlock("deepslate_lapis_ore_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_LAPIS_ORE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> DEEPSLATE_IRON_ORE_STAIRS = registerBlock("deepslate_iron_ore_stairs",
            () -> new StairBlock(
                () -> Blocks.DEEPSLATE_IRON_ORE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_IRON_ORE_SLAB = registerBlock("deepslate_iron_ore_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_IRON_ORE_FENCE = registerBlock("deepslate_iron_ore_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_IRON_ORE_FENCE_GATE = registerBlock("deepslate_iron_ore_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_IRON_ORE_WALL = registerBlock("deepslate_iron_ore_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_IRON_ORE_BUTTON = registerBlock("deepslate_iron_ore_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_IRON_ORE_PRESSURE_PLATE = registerBlock("deepslate_iron_ore_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> DEEPSLATE_IRON_ORE_TRAPDOOR = registerBlock("deepslate_iron_ore_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> DEEPSLATE_IRON_ORE_DOOR = registerBlock("deepslate_iron_ore_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> DEEPSLATE_COPPER_ORE_STAIRS = registerBlock("deepslate_copper_ore_stairs",
            () -> new StairBlock(
                () -> Blocks.DEEPSLATE_COPPER_ORE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_COPPER_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_COPPER_ORE_SLAB = registerBlock("deepslate_copper_ore_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_COPPER_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_COPPER_ORE_FENCE = registerBlock("deepslate_copper_ore_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_COPPER_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_COPPER_ORE_FENCE_GATE = registerBlock("deepslate_copper_ore_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_COPPER_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_COPPER_ORE_WALL = registerBlock("deepslate_copper_ore_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_COPPER_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_COPPER_ORE_BUTTON = registerBlock("deepslate_copper_ore_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_COPPER_ORE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_COPPER_ORE_PRESSURE_PLATE = registerBlock("deepslate_copper_ore_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_COPPER_ORE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> DEEPSLATE_COPPER_ORE_TRAPDOOR = registerBlock("deepslate_copper_ore_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_COPPER_ORE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> DEEPSLATE_COPPER_ORE_DOOR = registerBlock("deepslate_copper_ore_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_COPPER_ORE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> DEEPSLATE_GOLD_ORE_STAIRS = registerBlock("deepslate_gold_ore_stairs",
            () -> new StairBlock(
                () -> Blocks.DEEPSLATE_GOLD_ORE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_GOLD_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_GOLD_ORE_SLAB = registerBlock("deepslate_gold_ore_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_GOLD_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_GOLD_ORE_FENCE = registerBlock("deepslate_gold_ore_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_GOLD_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_GOLD_ORE_FENCE_GATE = registerBlock("deepslate_gold_ore_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_GOLD_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_GOLD_ORE_WALL = registerBlock("deepslate_gold_ore_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_GOLD_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_GOLD_ORE_BUTTON = registerBlock("deepslate_gold_ore_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_GOLD_ORE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_GOLD_ORE_PRESSURE_PLATE = registerBlock("deepslate_gold_ore_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_GOLD_ORE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> DEEPSLATE_GOLD_ORE_TRAPDOOR = registerBlock("deepslate_gold_ore_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_GOLD_ORE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> DEEPSLATE_GOLD_ORE_DOOR = registerBlock("deepslate_gold_ore_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_GOLD_ORE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> DEEPSLATE_DIAMOND_ORE_STAIRS = registerBlock("deepslate_diamond_ore_stairs",
            () -> new StairBlock(
                () -> Blocks.DEEPSLATE_DIAMOND_ORE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_DIAMOND_ORE_SLAB = registerBlock("deepslate_diamond_ore_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_DIAMOND_ORE_FENCE = registerBlock("deepslate_diamond_ore_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_DIAMOND_ORE_FENCE_GATE = registerBlock("deepslate_diamond_ore_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_DIAMOND_ORE_WALL = registerBlock("deepslate_diamond_ore_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_DIAMOND_ORE_BUTTON = registerBlock("deepslate_diamond_ore_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_DIAMOND_ORE_PRESSURE_PLATE = registerBlock("deepslate_diamond_ore_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> DEEPSLATE_DIAMOND_ORE_TRAPDOOR = registerBlock("deepslate_diamond_ore_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> DEEPSLATE_DIAMOND_ORE_DOOR = registerBlock("deepslate_diamond_ore_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> DEEPSLATE_EMERALD_ORE_STAIRS = registerBlock("deepslate_emerald_ore_stairs",
            () -> new StairBlock(
                () -> Blocks.DEEPSLATE_EMERALD_ORE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_EMERALD_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_EMERALD_ORE_SLAB = registerBlock("deepslate_emerald_ore_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_EMERALD_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_EMERALD_ORE_FENCE = registerBlock("deepslate_emerald_ore_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_EMERALD_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_EMERALD_ORE_FENCE_GATE = registerBlock("deepslate_emerald_ore_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_EMERALD_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_EMERALD_ORE_WALL = registerBlock("deepslate_emerald_ore_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_EMERALD_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_EMERALD_ORE_BUTTON = registerBlock("deepslate_emerald_ore_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_EMERALD_ORE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_EMERALD_ORE_PRESSURE_PLATE = registerBlock("deepslate_emerald_ore_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_EMERALD_ORE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> DEEPSLATE_EMERALD_ORE_TRAPDOOR = registerBlock("deepslate_emerald_ore_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_EMERALD_ORE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> DEEPSLATE_EMERALD_ORE_DOOR = registerBlock("deepslate_emerald_ore_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_EMERALD_ORE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> COAL_BLOCK_STAIRS = registerBlock("coal_block_stairs",
            () -> new StairBlock(
                () -> Blocks.COAL_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> COAL_BLOCK_SLAB = registerBlock("coal_block_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> COAL_BLOCK_FENCE = registerBlock("coal_block_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> COAL_BLOCK_FENCE_GATE = registerBlock("coal_block_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> COAL_BLOCK_WALL = registerBlock("coal_block_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> COAL_BLOCK_BUTTON = registerBlock("coal_block_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> COAL_BLOCK_PRESSURE_PLATE = registerBlock("coal_block_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> COAL_BLOCK_TRAPDOOR = registerBlock("coal_block_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> COAL_BLOCK_DOOR = registerBlock("coal_block_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> LAPIS_BLOCK_STAIRS = registerBlock("lapis_block_stairs",
            () -> new StairBlock(
                () -> Blocks.LAPIS_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LAPIS_BLOCK_SLAB = registerBlock("lapis_block_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LAPIS_BLOCK_FENCE = registerBlock("lapis_block_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LAPIS_BLOCK_FENCE_GATE = registerBlock("lapis_block_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LAPIS_BLOCK_WALL = registerBlock("lapis_block_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LAPIS_BLOCK_BUTTON = registerBlock("lapis_block_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LAPIS_BLOCK_PRESSURE_PLATE = registerBlock("lapis_block_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> LAPIS_BLOCK_TRAPDOOR = registerBlock("lapis_block_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> LAPIS_BLOCK_DOOR = registerBlock("lapis_block_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> RAW_IRON_BLOCK_STAIRS = registerBlock("raw_iron_block_stairs",
            () -> new StairBlock(
                () -> Blocks.RAW_IRON_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RAW_IRON_BLOCK_SLAB = registerBlock("raw_iron_block_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RAW_IRON_BLOCK_FENCE = registerBlock("raw_iron_block_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RAW_IRON_BLOCK_FENCE_GATE = registerBlock("raw_iron_block_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RAW_IRON_BLOCK_WALL = registerBlock("raw_iron_block_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RAW_IRON_BLOCK_BUTTON = registerBlock("raw_iron_block_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RAW_IRON_BLOCK_PRESSURE_PLATE = registerBlock("raw_iron_block_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> RAW_IRON_BLOCK_TRAPDOOR = registerBlock("raw_iron_block_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> RAW_IRON_BLOCK_DOOR = registerBlock("raw_iron_block_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> RAW_COPPER_BLOCK_STAIRS = registerBlock("raw_copper_block_stairs",
            () -> new StairBlock(
                () -> Blocks.RAW_COPPER_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.RAW_COPPER_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RAW_COPPER_BLOCK_SLAB = registerBlock("raw_copper_block_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RAW_COPPER_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RAW_COPPER_BLOCK_FENCE = registerBlock("raw_copper_block_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.RAW_COPPER_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RAW_COPPER_BLOCK_FENCE_GATE = registerBlock("raw_copper_block_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.RAW_COPPER_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RAW_COPPER_BLOCK_WALL = registerBlock("raw_copper_block_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.RAW_COPPER_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RAW_COPPER_BLOCK_BUTTON = registerBlock("raw_copper_block_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.RAW_COPPER_BLOCK).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RAW_COPPER_BLOCK_PRESSURE_PLATE = registerBlock("raw_copper_block_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.RAW_COPPER_BLOCK)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> RAW_COPPER_BLOCK_TRAPDOOR = registerBlock("raw_copper_block_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.RAW_COPPER_BLOCK)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> RAW_COPPER_BLOCK_DOOR = registerBlock("raw_copper_block_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.RAW_COPPER_BLOCK)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> RAW_GOLD_BLOCK_STAIRS = registerBlock("raw_gold_block_stairs",
            () -> new StairBlock(
                () -> Blocks.RAW_GOLD_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.RAW_GOLD_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RAW_GOLD_BLOCK_SLAB = registerBlock("raw_gold_block_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RAW_GOLD_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RAW_GOLD_BLOCK_FENCE = registerBlock("raw_gold_block_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.RAW_GOLD_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RAW_GOLD_BLOCK_FENCE_GATE = registerBlock("raw_gold_block_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.RAW_GOLD_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RAW_GOLD_BLOCK_WALL = registerBlock("raw_gold_block_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.RAW_GOLD_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RAW_GOLD_BLOCK_BUTTON = registerBlock("raw_gold_block_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.RAW_GOLD_BLOCK).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RAW_GOLD_BLOCK_PRESSURE_PLATE = registerBlock("raw_gold_block_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.RAW_GOLD_BLOCK)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> RAW_GOLD_BLOCK_TRAPDOOR = registerBlock("raw_gold_block_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.RAW_GOLD_BLOCK)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> RAW_GOLD_BLOCK_DOOR = registerBlock("raw_gold_block_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.RAW_GOLD_BLOCK)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> AMETHYST_BLOCK_STAIRS = registerBlock("amethyst_block_stairs",
            () -> new StairBlock(
                () -> Blocks.AMETHYST_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> AMETHYST_BLOCK_SLAB = registerBlock("amethyst_block_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> AMETHYST_BLOCK_FENCE = registerBlock("amethyst_block_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> AMETHYST_BLOCK_FENCE_GATE = registerBlock("amethyst_block_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> AMETHYST_BLOCK_WALL = registerBlock("amethyst_block_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> AMETHYST_BLOCK_BUTTON = registerBlock("amethyst_block_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> AMETHYST_BLOCK_PRESSURE_PLATE = registerBlock("amethyst_block_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> AMETHYST_BLOCK_TRAPDOOR = registerBlock("amethyst_block_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> AMETHYST_BLOCK_DOOR = registerBlock("amethyst_block_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> IRON_BLOCK_STAIRS = registerBlock("iron_block_stairs",
            () -> new StairBlock(
                () -> Blocks.IRON_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> IRON_BLOCK_SLAB = registerBlock("iron_block_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> IRON_BLOCK_FENCE = registerBlock("iron_block_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> IRON_BLOCK_FENCE_GATE = registerBlock("iron_block_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> IRON_BLOCK_WALL = registerBlock("iron_block_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> IRON_BLOCK_BUTTON = registerBlock("iron_block_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> IRON_BLOCK_PRESSURE_PLATE = registerBlock("iron_block_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> IRON_BLOCK_TRAPDOOR = registerBlock("iron_block_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> IRON_BLOCK_DOOR = registerBlock("iron_block_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> COPPER_BLOCK_STAIRS = registerBlock("copper_block_stairs",
            () -> new StairBlock(
                () -> Blocks.COPPER_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> COPPER_BLOCK_SLAB = registerBlock("copper_block_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> COPPER_BLOCK_FENCE = registerBlock("copper_block_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> COPPER_BLOCK_FENCE_GATE = registerBlock("copper_block_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> COPPER_BLOCK_WALL = registerBlock("copper_block_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> COPPER_BLOCK_BUTTON = registerBlock("copper_block_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> COPPER_BLOCK_PRESSURE_PLATE = registerBlock("copper_block_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> COPPER_BLOCK_TRAPDOOR = registerBlock("copper_block_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> COPPER_BLOCK_DOOR = registerBlock("copper_block_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> GOLD_BLOCK_STAIRS = registerBlock("gold_block_stairs",
            () -> new StairBlock(
                () -> Blocks.GOLD_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GOLD_BLOCK_SLAB = registerBlock("gold_block_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GOLD_BLOCK_FENCE = registerBlock("gold_block_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GOLD_BLOCK_FENCE_GATE = registerBlock("gold_block_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GOLD_BLOCK_WALL = registerBlock("gold_block_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GOLD_BLOCK_BUTTON = registerBlock("gold_block_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GOLD_BLOCK_PRESSURE_PLATE = registerBlock("gold_block_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> GOLD_BLOCK_TRAPDOOR = registerBlock("gold_block_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> GOLD_BLOCK_DOOR = registerBlock("gold_block_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> DIAMOND_BLOCK_STAIRS = registerBlock("diamond_block_stairs",
            () -> new StairBlock(
                () -> Blocks.DIAMOND_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DIAMOND_BLOCK_SLAB = registerBlock("diamond_block_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DIAMOND_BLOCK_FENCE = registerBlock("diamond_block_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DIAMOND_BLOCK_FENCE_GATE = registerBlock("diamond_block_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DIAMOND_BLOCK_WALL = registerBlock("diamond_block_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DIAMOND_BLOCK_BUTTON = registerBlock("diamond_block_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DIAMOND_BLOCK_PRESSURE_PLATE = registerBlock("diamond_block_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> DIAMOND_BLOCK_TRAPDOOR = registerBlock("diamond_block_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> DIAMOND_BLOCK_DOOR = registerBlock("diamond_block_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> NETHERITE_BLOCK_STAIRS = registerBlock("netherite_block_stairs",
            () -> new StairBlock(
                () -> Blocks.NETHERITE_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> NETHERITE_BLOCK_SLAB = registerBlock("netherite_block_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> NETHERITE_BLOCK_FENCE = registerBlock("netherite_block_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> NETHERITE_BLOCK_FENCE_GATE = registerBlock("netherite_block_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> NETHERITE_BLOCK_WALL = registerBlock("netherite_block_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> NETHERITE_BLOCK_BUTTON = registerBlock("netherite_block_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> NETHERITE_BLOCK_PRESSURE_PLATE = registerBlock("netherite_block_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> NETHERITE_BLOCK_TRAPDOOR = registerBlock("netherite_block_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> NETHERITE_BLOCK_DOOR = registerBlock("netherite_block_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> MOSS_BLOCK_STAIRS = registerBlock("moss_block_stairs",
            () -> new StairBlock(
                () -> Blocks.MOSS_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MOSS_BLOCK_SLAB = registerBlock("moss_block_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MOSS_BLOCK_FENCE = registerBlock("moss_block_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MOSS_BLOCK_FENCE_GATE = registerBlock("moss_block_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MOSS_BLOCK_WALL = registerBlock("moss_block_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MOSS_BLOCK_BUTTON = registerBlock("moss_block_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MOSS_BLOCK_PRESSURE_PLATE = registerBlock("moss_block_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> MOSS_BLOCK_TRAPDOOR = registerBlock("moss_block_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> MOSS_BLOCK_DOOR = registerBlock("moss_block_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> DRIPSTONE_BLOCK_STAIRS = registerBlock("dripstone_block_stairs",
            () -> new StairBlock(
                () -> Blocks.DRIPSTONE_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DRIPSTONE_BLOCK_SLAB = registerBlock("dripstone_block_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DRIPSTONE_BLOCK_FENCE = registerBlock("dripstone_block_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DRIPSTONE_BLOCK_FENCE_GATE = registerBlock("dripstone_block_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DRIPSTONE_BLOCK_WALL = registerBlock("dripstone_block_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DRIPSTONE_BLOCK_BUTTON = registerBlock("dripstone_block_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DRIPSTONE_BLOCK_PRESSURE_PLATE = registerBlock("dripstone_block_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> DRIPSTONE_BLOCK_TRAPDOOR = registerBlock("dripstone_block_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> DRIPSTONE_BLOCK_DOOR = registerBlock("dripstone_block_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> PURPUR_BLOCK_STAIRS = registerBlock("purpur_block_stairs",
            () -> new StairBlock(
                () -> Blocks.PURPUR_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PURPUR_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PURPUR_BLOCK_SLAB = registerBlock("purpur_block_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PURPUR_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PURPUR_BLOCK_FENCE = registerBlock("purpur_block_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.PURPUR_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PURPUR_BLOCK_FENCE_GATE = registerBlock("purpur_block_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.PURPUR_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PURPUR_BLOCK_WALL = registerBlock("purpur_block_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PURPUR_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PURPUR_BLOCK_BUTTON = registerBlock("purpur_block_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.PURPUR_BLOCK).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PURPUR_BLOCK_PRESSURE_PLATE = registerBlock("purpur_block_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.PURPUR_BLOCK)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> PURPUR_BLOCK_TRAPDOOR = registerBlock("purpur_block_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.PURPUR_BLOCK)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> PURPUR_BLOCK_DOOR = registerBlock("purpur_block_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.PURPUR_BLOCK)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> BROWN_MUSHROOM_BLOCK_STAIRS = registerBlock("brown_mushroom_block_stairs",
            () -> new StairBlock(
                () -> Blocks.BROWN_MUSHROOM_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BROWN_MUSHROOM_BLOCK_SLAB = registerBlock("brown_mushroom_block_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BROWN_MUSHROOM_BLOCK_FENCE = registerBlock("brown_mushroom_block_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BROWN_MUSHROOM_BLOCK_FENCE_GATE = registerBlock("brown_mushroom_block_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BROWN_MUSHROOM_BLOCK_WALL = registerBlock("brown_mushroom_block_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BROWN_MUSHROOM_BLOCK_BUTTON = registerBlock("brown_mushroom_block_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM_BLOCK).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BROWN_MUSHROOM_BLOCK_PRESSURE_PLATE = registerBlock("brown_mushroom_block_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM_BLOCK)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> BROWN_MUSHROOM_BLOCK_TRAPDOOR = registerBlock("brown_mushroom_block_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM_BLOCK)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> BROWN_MUSHROOM_BLOCK_DOOR = registerBlock("brown_mushroom_block_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM_BLOCK)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> RED_MUSHROOM_BLOCK_STAIRS = registerBlock("red_mushroom_block_stairs",
            () -> new StairBlock(
                () -> Blocks.RED_MUSHROOM_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RED_MUSHROOM_BLOCK_SLAB = registerBlock("red_mushroom_block_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RED_MUSHROOM_BLOCK_FENCE = registerBlock("red_mushroom_block_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RED_MUSHROOM_BLOCK_FENCE_GATE = registerBlock("red_mushroom_block_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RED_MUSHROOM_BLOCK_WALL = registerBlock("red_mushroom_block_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RED_MUSHROOM_BLOCK_BUTTON = registerBlock("red_mushroom_block_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM_BLOCK).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RED_MUSHROOM_BLOCK_PRESSURE_PLATE = registerBlock("red_mushroom_block_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM_BLOCK)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> RED_MUSHROOM_BLOCK_TRAPDOOR = registerBlock("red_mushroom_block_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM_BLOCK)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> RED_MUSHROOM_BLOCK_DOOR = registerBlock("red_mushroom_block_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM_BLOCK)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> EMERALD_BLOCK_STAIRS = registerBlock("emerald_block_stairs",
            () -> new StairBlock(
                () -> Blocks.EMERALD_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> EMERALD_BLOCK_SLAB = registerBlock("emerald_block_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> EMERALD_BLOCK_FENCE = registerBlock("emerald_block_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> EMERALD_BLOCK_FENCE_GATE = registerBlock("emerald_block_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> EMERALD_BLOCK_WALL = registerBlock("emerald_block_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> EMERALD_BLOCK_BUTTON = registerBlock("emerald_block_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> EMERALD_BLOCK_PRESSURE_PLATE = registerBlock("emerald_block_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> EMERALD_BLOCK_TRAPDOOR = registerBlock("emerald_block_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> EMERALD_BLOCK_DOOR = registerBlock("emerald_block_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> STONE_STAIRS = registerBlock("stone_stairs",
            () -> new StairBlock(
                () -> Blocks.STONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> STONE_SLAB = registerBlock("stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> STONE_FENCE = registerBlock("stone_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> STONE_FENCE_GATE = registerBlock("stone_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.STONE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> STONE_WALL = registerBlock("stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> STONE_BUTTON = registerBlock("stone_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> STONE_PRESSURE_PLATE = registerBlock("stone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> STONE_TRAPDOOR = registerBlock("stone_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.STONE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> STONE_DOOR = registerBlock("stone_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.STONE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> GRANITE_STAIRS = registerBlock("granite_stairs",
            () -> new StairBlock(
                () -> Blocks.GRANITE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GRANITE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GRANITE_SLAB = registerBlock("granite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GRANITE_FENCE = registerBlock("granite_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GRANITE_FENCE_GATE = registerBlock("granite_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GRANITE_WALL = registerBlock("granite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GRANITE_BUTTON = registerBlock("granite_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GRANITE_PRESSURE_PLATE = registerBlock("granite_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.GRANITE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> GRANITE_TRAPDOOR = registerBlock("granite_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> GRANITE_DOOR = registerBlock("granite_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> POLISHED_GRANITE_STAIRS = registerBlock("polished_granite_stairs",
            () -> new StairBlock(
                () -> Blocks.POLISHED_GRANITE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.POLISHED_GRANITE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> POLISHED_GRANITE_SLAB = registerBlock("polished_granite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_GRANITE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> POLISHED_GRANITE_FENCE = registerBlock("polished_granite_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_GRANITE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> POLISHED_GRANITE_FENCE_GATE = registerBlock("polished_granite_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_GRANITE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_GRANITE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> POLISHED_GRANITE_BUTTON = registerBlock("polished_granite_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_GRANITE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> POLISHED_GRANITE_PRESSURE_PLATE = registerBlock("polished_granite_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.POLISHED_GRANITE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> POLISHED_GRANITE_TRAPDOOR = registerBlock("polished_granite_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_GRANITE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> POLISHED_GRANITE_DOOR = registerBlock("polished_granite_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_GRANITE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> DIORITE_STAIRS = registerBlock("diorite_stairs",
            () -> new StairBlock(
                () -> Blocks.DIORITE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DIORITE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DIORITE_SLAB = registerBlock("diorite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DIORITE_FENCE = registerBlock("diorite_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DIORITE_FENCE_GATE = registerBlock("diorite_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DIORITE_WALL = registerBlock("diorite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DIORITE_BUTTON = registerBlock("diorite_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DIORITE_PRESSURE_PLATE = registerBlock("diorite_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.DIORITE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> DIORITE_TRAPDOOR = registerBlock("diorite_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> DIORITE_DOOR = registerBlock("diorite_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> POLISHED_DIORITE_STAIRS = registerBlock("polished_diorite_stairs",
            () -> new StairBlock(
                () -> Blocks.POLISHED_DIORITE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.POLISHED_DIORITE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> POLISHED_DIORITE_SLAB = registerBlock("polished_diorite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DIORITE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> POLISHED_DIORITE_FENCE = registerBlock("polished_diorite_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DIORITE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> POLISHED_DIORITE_FENCE_GATE = registerBlock("polished_diorite_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DIORITE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DIORITE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> POLISHED_DIORITE_BUTTON = registerBlock("polished_diorite_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DIORITE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> POLISHED_DIORITE_PRESSURE_PLATE = registerBlock("polished_diorite_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.POLISHED_DIORITE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> POLISHED_DIORITE_TRAPDOOR = registerBlock("polished_diorite_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DIORITE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> POLISHED_DIORITE_DOOR = registerBlock("polished_diorite_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DIORITE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> ANDESITE_STAIRS = registerBlock("andesite_stairs",
            () -> new StairBlock(
                () -> Blocks.ANDESITE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ANDESITE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> ANDESITE_SLAB = registerBlock("andesite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> ANDESITE_FENCE = registerBlock("andesite_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> ANDESITE_FENCE_GATE = registerBlock("andesite_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> ANDESITE_WALL = registerBlock("andesite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> ANDESITE_BUTTON = registerBlock("andesite_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> ANDESITE_PRESSURE_PLATE = registerBlock("andesite_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.ANDESITE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> ANDESITE_TRAPDOOR = registerBlock("andesite_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> ANDESITE_DOOR = registerBlock("andesite_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> POLISHED_ANDESITE_STAIRS = registerBlock("polished_andesite_stairs",
            () -> new StairBlock(
                () -> Blocks.POLISHED_ANDESITE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> POLISHED_ANDESITE_SLAB = registerBlock("polished_andesite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> POLISHED_ANDESITE_FENCE = registerBlock("polished_andesite_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> POLISHED_ANDESITE_FENCE_GATE = registerBlock("polished_andesite_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> POLISHED_ANDESITE_BUTTON = registerBlock("polished_andesite_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> POLISHED_ANDESITE_PRESSURE_PLATE = registerBlock("polished_andesite_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> POLISHED_ANDESITE_TRAPDOOR = registerBlock("polished_andesite_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> POLISHED_ANDESITE_DOOR = registerBlock("polished_andesite_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> COBBLED_DEEPSLATE_STAIRS = registerBlock("cobbled_deepslate_stairs",
            () -> new StairBlock(
                () -> Blocks.COBBLED_DEEPSLATE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> COBBLED_DEEPSLATE_SLAB = registerBlock("cobbled_deepslate_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> COBBLED_DEEPSLATE_FENCE = registerBlock("cobbled_deepslate_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> COBBLED_DEEPSLATE_FENCE_GATE = registerBlock("cobbled_deepslate_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> COBBLED_DEEPSLATE_WALL = registerBlock("cobbled_deepslate_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> COBBLED_DEEPSLATE_BUTTON = registerBlock("cobbled_deepslate_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> COBBLED_DEEPSLATE_PRESSURE_PLATE = registerBlock("cobbled_deepslate_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> COBBLED_DEEPSLATE_TRAPDOOR = registerBlock("cobbled_deepslate_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> COBBLED_DEEPSLATE_DOOR = registerBlock("cobbled_deepslate_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> POLISHED_DEEPSLATE_STAIRS = registerBlock("polished_deepslate_stairs",
            () -> new StairBlock(
                () -> Blocks.POLISHED_DEEPSLATE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.POLISHED_DEEPSLATE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> POLISHED_DEEPSLATE_SLAB = registerBlock("polished_deepslate_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DEEPSLATE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> POLISHED_DEEPSLATE_FENCE = registerBlock("polished_deepslate_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DEEPSLATE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> POLISHED_DEEPSLATE_FENCE_GATE = registerBlock("polished_deepslate_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DEEPSLATE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> POLISHED_DEEPSLATE_WALL = registerBlock("polished_deepslate_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DEEPSLATE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> POLISHED_DEEPSLATE_BUTTON = registerBlock("polished_deepslate_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DEEPSLATE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> POLISHED_DEEPSLATE_PRESSURE_PLATE = registerBlock("polished_deepslate_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.POLISHED_DEEPSLATE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> POLISHED_DEEPSLATE_TRAPDOOR = registerBlock("polished_deepslate_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DEEPSLATE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> POLISHED_DEEPSLATE_DOOR = registerBlock("polished_deepslate_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DEEPSLATE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> CALCITE_STAIRS = registerBlock("calcite_stairs",
            () -> new StairBlock(
                () -> Blocks.CALCITE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CALCITE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CALCITE_SLAB = registerBlock("calcite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CALCITE_FENCE = registerBlock("calcite_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CALCITE_FENCE_GATE = registerBlock("calcite_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CALCITE_WALL = registerBlock("calcite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CALCITE_BUTTON = registerBlock("calcite_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CALCITE_PRESSURE_PLATE = registerBlock("calcite_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.CALCITE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> CALCITE_TRAPDOOR = registerBlock("calcite_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> CALCITE_DOOR = registerBlock("calcite_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> TUFF_STAIRS = registerBlock("tuff_stairs",
            () -> new StairBlock(
                () -> Blocks.TUFF.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.TUFF)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> TUFF_SLAB = registerBlock("tuff_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> TUFF_FENCE = registerBlock("tuff_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> TUFF_FENCE_GATE = registerBlock("tuff_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> TUFF_WALL = registerBlock("tuff_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> TUFF_BUTTON = registerBlock("tuff_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.TUFF).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> TUFF_PRESSURE_PLATE = registerBlock("tuff_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.TUFF)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> TUFF_TRAPDOOR = registerBlock("tuff_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> TUFF_DOOR = registerBlock("tuff_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> DIRT_STAIRS = registerBlock("dirt_stairs",
            () -> new StairBlock(
                () -> Blocks.DIRT.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DIRT)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DIRT_SLAB = registerBlock("dirt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DIRT)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DIRT_FENCE = registerBlock("dirt_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.DIRT)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DIRT_FENCE_GATE = registerBlock("dirt_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.DIRT)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DIRT_WALL = registerBlock("dirt_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DIRT)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DIRT_BUTTON = registerBlock("dirt_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DIRT_PRESSURE_PLATE = registerBlock("dirt_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.DIRT)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> DIRT_TRAPDOOR = registerBlock("dirt_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.DIRT)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> DIRT_DOOR = registerBlock("dirt_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.DIRT)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> COARSE_DIRT_STAIRS = registerBlock("coarse_dirt_stairs",
            () -> new StairBlock(
                () -> Blocks.COARSE_DIRT.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COARSE_DIRT)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> COARSE_DIRT_SLAB = registerBlock("coarse_dirt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COARSE_DIRT)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> COARSE_DIRT_FENCE = registerBlock("coarse_dirt_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.COARSE_DIRT)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> COARSE_DIRT_FENCE_GATE = registerBlock("coarse_dirt_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.COARSE_DIRT)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> COARSE_DIRT_WALL = registerBlock("coarse_dirt_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COARSE_DIRT)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> COARSE_DIRT_BUTTON = registerBlock("coarse_dirt_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.COARSE_DIRT).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> COARSE_DIRT_PRESSURE_PLATE = registerBlock("coarse_dirt_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.COARSE_DIRT)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> COARSE_DIRT_TRAPDOOR = registerBlock("coarse_dirt_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.COARSE_DIRT)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> COARSE_DIRT_DOOR = registerBlock("coarse_dirt_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.COARSE_DIRT)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> ROOTED_DIRT_STAIRS = registerBlock("rooted_dirt_stairs",
            () -> new StairBlock(
                () -> Blocks.ROOTED_DIRT.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ROOTED_DIRT)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> ROOTED_DIRT_SLAB = registerBlock("rooted_dirt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ROOTED_DIRT)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> ROOTED_DIRT_FENCE = registerBlock("rooted_dirt_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.ROOTED_DIRT)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> ROOTED_DIRT_FENCE_GATE = registerBlock("rooted_dirt_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.ROOTED_DIRT)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> ROOTED_DIRT_WALL = registerBlock("rooted_dirt_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.ROOTED_DIRT)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> ROOTED_DIRT_BUTTON = registerBlock("rooted_dirt_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.ROOTED_DIRT).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> ROOTED_DIRT_PRESSURE_PLATE = registerBlock("rooted_dirt_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.ROOTED_DIRT)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> ROOTED_DIRT_TRAPDOOR = registerBlock("rooted_dirt_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.ROOTED_DIRT)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> ROOTED_DIRT_DOOR = registerBlock("rooted_dirt_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.ROOTED_DIRT)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> MUD_STAIRS = registerBlock("mud_stairs",
            () -> new StairBlock(
                () -> Blocks.MUD.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.MUD)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MUD_SLAB = registerBlock("mud_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MUD)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MUD_FENCE = registerBlock("mud_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.MUD)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MUD_FENCE_GATE = registerBlock("mud_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.MUD)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MUD_WALL = registerBlock("mud_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.MUD)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MUD_BUTTON = registerBlock("mud_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.MUD).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MUD_PRESSURE_PLATE = registerBlock("mud_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.MUD)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> MUD_TRAPDOOR = registerBlock("mud_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.MUD)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> MUD_DOOR = registerBlock("mud_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.MUD)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> COBBLESTONE_STAIRS = registerBlock("cobblestone_stairs",
            () -> new StairBlock(
                () -> Blocks.COBBLESTONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> COBBLESTONE_SLAB = registerBlock("cobblestone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> COBBLESTONE_FENCE = registerBlock("cobblestone_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> COBBLESTONE_FENCE_GATE = registerBlock("cobblestone_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> COBBLESTONE_WALL = registerBlock("cobblestone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> COBBLESTONE_BUTTON = registerBlock("cobblestone_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> COBBLESTONE_PRESSURE_PLATE = registerBlock("cobblestone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> COBBLESTONE_TRAPDOOR = registerBlock("cobblestone_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> COBBLESTONE_DOOR = registerBlock("cobblestone_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> OAK_PLANKS_STAIRS = registerBlock("oak_planks_stairs",
            () -> new StairBlock(
                () -> Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> OAK_PLANKS_SLAB = registerBlock("oak_planks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> OAK_PLANKS_FENCE = registerBlock("oak_planks_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> OAK_PLANKS_FENCE_GATE = registerBlock("oak_planks_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> OAK_PLANKS_WALL = registerBlock("oak_planks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> OAK_PLANKS_BUTTON = registerBlock("oak_planks_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> OAK_PLANKS_PRESSURE_PLATE = registerBlock("oak_planks_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> OAK_PLANKS_TRAPDOOR = registerBlock("oak_planks_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> OAK_PLANKS_DOOR = registerBlock("oak_planks_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> SPRUCE_PLANKS_STAIRS = registerBlock("spruce_planks_stairs",
            () -> new StairBlock(
                () -> Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> SPRUCE_PLANKS_SLAB = registerBlock("spruce_planks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> SPRUCE_PLANKS_FENCE = registerBlock("spruce_planks_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> SPRUCE_PLANKS_FENCE_GATE = registerBlock("spruce_planks_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> SPRUCE_PLANKS_WALL = registerBlock("spruce_planks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> SPRUCE_PLANKS_BUTTON = registerBlock("spruce_planks_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> SPRUCE_PLANKS_PRESSURE_PLATE = registerBlock("spruce_planks_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> SPRUCE_PLANKS_TRAPDOOR = registerBlock("spruce_planks_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> SPRUCE_PLANKS_DOOR = registerBlock("spruce_planks_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> BIRCH_PLANKS_STAIRS = registerBlock("birch_planks_stairs",
            () -> new StairBlock(
                () -> Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BIRCH_PLANKS_SLAB = registerBlock("birch_planks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BIRCH_PLANKS_FENCE = registerBlock("birch_planks_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BIRCH_PLANKS_FENCE_GATE = registerBlock("birch_planks_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BIRCH_PLANKS_WALL = registerBlock("birch_planks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BIRCH_PLANKS_BUTTON = registerBlock("birch_planks_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BIRCH_PLANKS_PRESSURE_PLATE = registerBlock("birch_planks_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> BIRCH_PLANKS_TRAPDOOR = registerBlock("birch_planks_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> BIRCH_PLANKS_DOOR = registerBlock("birch_planks_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> JUNGLE_PLANKS_STAIRS = registerBlock("jungle_planks_stairs",
            () -> new StairBlock(
                () -> Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> JUNGLE_PLANKS_SLAB = registerBlock("jungle_planks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> JUNGLE_PLANKS_FENCE = registerBlock("jungle_planks_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> JUNGLE_PLANKS_FENCE_GATE = registerBlock("jungle_planks_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> JUNGLE_PLANKS_WALL = registerBlock("jungle_planks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> JUNGLE_PLANKS_BUTTON = registerBlock("jungle_planks_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> JUNGLE_PLANKS_PRESSURE_PLATE = registerBlock("jungle_planks_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> JUNGLE_PLANKS_TRAPDOOR = registerBlock("jungle_planks_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> JUNGLE_PLANKS_DOOR = registerBlock("jungle_planks_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> ACACIA_PLANKS_STAIRS = registerBlock("acacia_planks_stairs",
            () -> new StairBlock(
                () -> Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> ACACIA_PLANKS_SLAB = registerBlock("acacia_planks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> ACACIA_PLANKS_FENCE = registerBlock("acacia_planks_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> ACACIA_PLANKS_FENCE_GATE = registerBlock("acacia_planks_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> ACACIA_PLANKS_WALL = registerBlock("acacia_planks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> ACACIA_PLANKS_BUTTON = registerBlock("acacia_planks_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> ACACIA_PLANKS_PRESSURE_PLATE = registerBlock("acacia_planks_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> ACACIA_PLANKS_TRAPDOOR = registerBlock("acacia_planks_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> ACACIA_PLANKS_DOOR = registerBlock("acacia_planks_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> DARK_OAK_PLANKS_STAIRS = registerBlock("dark_oak_planks_stairs",
            () -> new StairBlock(
                () -> Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DARK_OAK_PLANKS_SLAB = registerBlock("dark_oak_planks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DARK_OAK_PLANKS_FENCE = registerBlock("dark_oak_planks_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DARK_OAK_PLANKS_FENCE_GATE = registerBlock("dark_oak_planks_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DARK_OAK_PLANKS_WALL = registerBlock("dark_oak_planks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DARK_OAK_PLANKS_BUTTON = registerBlock("dark_oak_planks_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DARK_OAK_PLANKS_PRESSURE_PLATE = registerBlock("dark_oak_planks_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> DARK_OAK_PLANKS_TRAPDOOR = registerBlock("dark_oak_planks_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> DARK_OAK_PLANKS_DOOR = registerBlock("dark_oak_planks_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> MANGROVE_PLANKS_STAIRS = registerBlock("mangrove_planks_stairs",
            () -> new StairBlock(
                () -> Blocks.MANGROVE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MANGROVE_PLANKS_SLAB = registerBlock("mangrove_planks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MANGROVE_PLANKS_FENCE = registerBlock("mangrove_planks_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MANGROVE_PLANKS_FENCE_GATE = registerBlock("mangrove_planks_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MANGROVE_PLANKS_WALL = registerBlock("mangrove_planks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MANGROVE_PLANKS_BUTTON = registerBlock("mangrove_planks_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MANGROVE_PLANKS_PRESSURE_PLATE = registerBlock("mangrove_planks_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> MANGROVE_PLANKS_TRAPDOOR = registerBlock("mangrove_planks_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> MANGROVE_PLANKS_DOOR = registerBlock("mangrove_planks_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> CRIMSON_PLANKS_STAIRS = registerBlock("crimson_planks_stairs",
            () -> new StairBlock(
                () -> Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CRIMSON_PLANKS_SLAB = registerBlock("crimson_planks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CRIMSON_PLANKS_FENCE = registerBlock("crimson_planks_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CRIMSON_PLANKS_FENCE_GATE = registerBlock("crimson_planks_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CRIMSON_PLANKS_WALL = registerBlock("crimson_planks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CRIMSON_PLANKS_BUTTON = registerBlock("crimson_planks_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CRIMSON_PLANKS_PRESSURE_PLATE = registerBlock("crimson_planks_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> CRIMSON_PLANKS_TRAPDOOR = registerBlock("crimson_planks_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> CRIMSON_PLANKS_DOOR = registerBlock("crimson_planks_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> WARPED_PLANKS_STAIRS = registerBlock("warped_planks_stairs",
            () -> new StairBlock(
                () -> Blocks.WARPED_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> WARPED_PLANKS_SLAB = registerBlock("warped_planks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> WARPED_PLANKS_FENCE = registerBlock("warped_planks_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> WARPED_PLANKS_FENCE_GATE = registerBlock("warped_planks_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> WARPED_PLANKS_WALL = registerBlock("warped_planks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> WARPED_PLANKS_BUTTON = registerBlock("warped_planks_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> WARPED_PLANKS_PRESSURE_PLATE = registerBlock("warped_planks_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> WARPED_PLANKS_TRAPDOOR = registerBlock("warped_planks_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> WARPED_PLANKS_DOOR = registerBlock("warped_planks_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> NETHER_GOLD_ORE_STAIRS = registerBlock("nether_gold_ore_stairs",
            () -> new StairBlock(
                () -> Blocks.NETHER_GOLD_ORE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> NETHER_GOLD_ORE_SLAB = registerBlock("nether_gold_ore_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> NETHER_GOLD_ORE_FENCE = registerBlock("nether_gold_ore_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> NETHER_GOLD_ORE_FENCE_GATE = registerBlock("nether_gold_ore_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> NETHER_GOLD_ORE_WALL = registerBlock("nether_gold_ore_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> NETHER_GOLD_ORE_BUTTON = registerBlock("nether_gold_ore_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> NETHER_GOLD_ORE_PRESSURE_PLATE = registerBlock("nether_gold_ore_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> NETHER_GOLD_ORE_TRAPDOOR = registerBlock("nether_gold_ore_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> NETHER_GOLD_ORE_DOOR = registerBlock("nether_gold_ore_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> NETHER_QUARTZ_ORE_STAIRS = registerBlock("nether_quartz_ore_stairs",
            () -> new StairBlock(
                () -> Blocks.NETHER_QUARTZ_ORE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> NETHER_QUARTZ_ORE_SLAB = registerBlock("nether_quartz_ore_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> NETHER_QUARTZ_ORE_FENCE = registerBlock("nether_quartz_ore_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> NETHER_QUARTZ_ORE_FENCE_GATE = registerBlock("nether_quartz_ore_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> NETHER_QUARTZ_ORE_WALL = registerBlock("nether_quartz_ore_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> NETHER_QUARTZ_ORE_BUTTON = registerBlock("nether_quartz_ore_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> NETHER_QUARTZ_ORE_PRESSURE_PLATE = registerBlock("nether_quartz_ore_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> NETHER_QUARTZ_ORE_TRAPDOOR = registerBlock("nether_quartz_ore_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> NETHER_QUARTZ_ORE_DOOR = registerBlock("nether_quartz_ore_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> BUDDING_AMETHYST_STAIRS = registerBlock("budding_amethyst_stairs",
            () -> new StairBlock(
                () -> Blocks.BUDDING_AMETHYST.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BUDDING_AMETHYST)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BUDDING_AMETHYST_SLAB = registerBlock("budding_amethyst_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BUDDING_AMETHYST)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BUDDING_AMETHYST_FENCE = registerBlock("budding_amethyst_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.BUDDING_AMETHYST)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BUDDING_AMETHYST_FENCE_GATE = registerBlock("budding_amethyst_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.BUDDING_AMETHYST)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BUDDING_AMETHYST_WALL = registerBlock("budding_amethyst_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BUDDING_AMETHYST)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BUDDING_AMETHYST_BUTTON = registerBlock("budding_amethyst_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.BUDDING_AMETHYST).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BUDDING_AMETHYST_PRESSURE_PLATE = registerBlock("budding_amethyst_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.BUDDING_AMETHYST)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> BUDDING_AMETHYST_TRAPDOOR = registerBlock("budding_amethyst_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.BUDDING_AMETHYST)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> BUDDING_AMETHYST_DOOR = registerBlock("budding_amethyst_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.BUDDING_AMETHYST)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> SPONGE_STAIRS = registerBlock("sponge_stairs",
            () -> new StairBlock(
                () -> Blocks.SPONGE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPONGE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> SPONGE_SLAB = registerBlock("sponge_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SPONGE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> SPONGE_FENCE = registerBlock("sponge_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.SPONGE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> SPONGE_FENCE_GATE = registerBlock("sponge_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.SPONGE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> SPONGE_WALL = registerBlock("sponge_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SPONGE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> SPONGE_BUTTON = registerBlock("sponge_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.SPONGE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> SPONGE_PRESSURE_PLATE = registerBlock("sponge_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.SPONGE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> SPONGE_TRAPDOOR = registerBlock("sponge_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.SPONGE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> SPONGE_DOOR = registerBlock("sponge_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.SPONGE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> WET_SPONGE_STAIRS = registerBlock("wet_sponge_stairs",
            () -> new StairBlock(
                () -> Blocks.WET_SPONGE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WET_SPONGE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> WET_SPONGE_SLAB = registerBlock("wet_sponge_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WET_SPONGE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> WET_SPONGE_FENCE = registerBlock("wet_sponge_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.WET_SPONGE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> WET_SPONGE_FENCE_GATE = registerBlock("wet_sponge_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.WET_SPONGE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> WET_SPONGE_WALL = registerBlock("wet_sponge_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.WET_SPONGE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> WET_SPONGE_BUTTON = registerBlock("wet_sponge_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.WET_SPONGE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> WET_SPONGE_PRESSURE_PLATE = registerBlock("wet_sponge_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.WET_SPONGE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> WET_SPONGE_TRAPDOOR = registerBlock("wet_sponge_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.WET_SPONGE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> WET_SPONGE_DOOR = registerBlock("wet_sponge_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.WET_SPONGE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> WHITE_WOOL_STAIRS = registerBlock("white_wool_stairs",
            () -> new StairBlock(
                () -> Blocks.WHITE_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> WHITE_WOOL_SLAB = registerBlock("white_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> WHITE_WOOL_FENCE = registerBlock("white_wool_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> WHITE_WOOL_FENCE_GATE = registerBlock("white_wool_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> WHITE_WOOL_WALL = registerBlock("white_wool_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> WHITE_WOOL_BUTTON = registerBlock("white_wool_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> WHITE_WOOL_PRESSURE_PLATE = registerBlock("white_wool_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> WHITE_WOOL_TRAPDOOR = registerBlock("white_wool_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> WHITE_WOOL_DOOR = registerBlock("white_wool_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> ORANGE_WOOL_STAIRS = registerBlock("orange_wool_stairs",
            () -> new StairBlock(
                () -> Blocks.ORANGE_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ORANGE_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> ORANGE_WOOL_SLAB = registerBlock("orange_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> ORANGE_WOOL_FENCE = registerBlock("orange_wool_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> ORANGE_WOOL_FENCE_GATE = registerBlock("orange_wool_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> ORANGE_WOOL_WALL = registerBlock("orange_wool_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> ORANGE_WOOL_BUTTON = registerBlock("orange_wool_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_WOOL).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> ORANGE_WOOL_PRESSURE_PLATE = registerBlock("orange_wool_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.ORANGE_WOOL)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> ORANGE_WOOL_TRAPDOOR = registerBlock("orange_wool_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_WOOL)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> ORANGE_WOOL_DOOR = registerBlock("orange_wool_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_WOOL)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> MAGENTA_WOOL_STAIRS = registerBlock("magenta_wool_stairs",
            () -> new StairBlock(
                () -> Blocks.MAGENTA_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.MAGENTA_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MAGENTA_WOOL_SLAB = registerBlock("magenta_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MAGENTA_WOOL_FENCE = registerBlock("magenta_wool_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MAGENTA_WOOL_FENCE_GATE = registerBlock("magenta_wool_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MAGENTA_WOOL_WALL = registerBlock("magenta_wool_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MAGENTA_WOOL_BUTTON = registerBlock("magenta_wool_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_WOOL).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MAGENTA_WOOL_PRESSURE_PLATE = registerBlock("magenta_wool_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.MAGENTA_WOOL)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> MAGENTA_WOOL_TRAPDOOR = registerBlock("magenta_wool_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_WOOL)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> MAGENTA_WOOL_DOOR = registerBlock("magenta_wool_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_WOOL)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> LIGHT_BLUE_WOOL_STAIRS = registerBlock("light_blue_wool_stairs",
            () -> new StairBlock(
                () -> Blocks.LIGHT_BLUE_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_BLUE_WOOL_SLAB = registerBlock("light_blue_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_BLUE_WOOL_FENCE = registerBlock("light_blue_wool_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_BLUE_WOOL_FENCE_GATE = registerBlock("light_blue_wool_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_BLUE_WOOL_WALL = registerBlock("light_blue_wool_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_BLUE_WOOL_BUTTON = registerBlock("light_blue_wool_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_WOOL).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_BLUE_WOOL_PRESSURE_PLATE = registerBlock("light_blue_wool_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_WOOL)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> LIGHT_BLUE_WOOL_TRAPDOOR = registerBlock("light_blue_wool_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_WOOL)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> LIGHT_BLUE_WOOL_DOOR = registerBlock("light_blue_wool_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_WOOL)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> YELLOW_WOOL_STAIRS = registerBlock("yellow_wool_stairs",
            () -> new StairBlock(
                () -> Blocks.YELLOW_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> YELLOW_WOOL_SLAB = registerBlock("yellow_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> YELLOW_WOOL_FENCE = registerBlock("yellow_wool_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> YELLOW_WOOL_FENCE_GATE = registerBlock("yellow_wool_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> YELLOW_WOOL_WALL = registerBlock("yellow_wool_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> YELLOW_WOOL_BUTTON = registerBlock("yellow_wool_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> YELLOW_WOOL_PRESSURE_PLATE = registerBlock("yellow_wool_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> YELLOW_WOOL_TRAPDOOR = registerBlock("yellow_wool_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> YELLOW_WOOL_DOOR = registerBlock("yellow_wool_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> LIME_WOOL_STAIRS = registerBlock("lime_wool_stairs",
            () -> new StairBlock(
                () -> Blocks.LIME_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIME_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIME_WOOL_SLAB = registerBlock("lime_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIME_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIME_WOOL_FENCE = registerBlock("lime_wool_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.LIME_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIME_WOOL_FENCE_GATE = registerBlock("lime_wool_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.LIME_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIME_WOOL_WALL = registerBlock("lime_wool_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIME_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIME_WOOL_BUTTON = registerBlock("lime_wool_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.LIME_WOOL).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIME_WOOL_PRESSURE_PLATE = registerBlock("lime_wool_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.LIME_WOOL)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> LIME_WOOL_TRAPDOOR = registerBlock("lime_wool_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.LIME_WOOL)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> LIME_WOOL_DOOR = registerBlock("lime_wool_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.LIME_WOOL)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> PINK_WOOL_STAIRS = registerBlock("pink_wool_stairs",
            () -> new StairBlock(
                () -> Blocks.PINK_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PINK_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PINK_WOOL_SLAB = registerBlock("pink_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PINK_WOOL_FENCE = registerBlock("pink_wool_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PINK_WOOL_FENCE_GATE = registerBlock("pink_wool_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PINK_WOOL_WALL = registerBlock("pink_wool_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PINK_WOOL_BUTTON = registerBlock("pink_wool_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PINK_WOOL_PRESSURE_PLATE = registerBlock("pink_wool_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.PINK_WOOL)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> PINK_WOOL_TRAPDOOR = registerBlock("pink_wool_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> PINK_WOOL_DOOR = registerBlock("pink_wool_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> GRAY_WOOL_STAIRS = registerBlock("gray_wool_stairs",
            () -> new StairBlock(
                () -> Blocks.GRAY_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GRAY_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GRAY_WOOL_SLAB = registerBlock("gray_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GRAY_WOOL_FENCE = registerBlock("gray_wool_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GRAY_WOOL_FENCE_GATE = registerBlock("gray_wool_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GRAY_WOOL_WALL = registerBlock("gray_wool_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GRAY_WOOL_BUTTON = registerBlock("gray_wool_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_WOOL).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GRAY_WOOL_PRESSURE_PLATE = registerBlock("gray_wool_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.GRAY_WOOL)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> GRAY_WOOL_TRAPDOOR = registerBlock("gray_wool_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_WOOL)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> GRAY_WOOL_DOOR = registerBlock("gray_wool_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_WOOL)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> LIGHT_GRAY_WOOL_STAIRS = registerBlock("light_gray_wool_stairs",
            () -> new StairBlock(
                () -> Blocks.LIGHT_GRAY_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_GRAY_WOOL_SLAB = registerBlock("light_gray_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_GRAY_WOOL_FENCE = registerBlock("light_gray_wool_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_GRAY_WOOL_FENCE_GATE = registerBlock("light_gray_wool_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_GRAY_WOOL_WALL = registerBlock("light_gray_wool_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_GRAY_WOOL_BUTTON = registerBlock("light_gray_wool_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_WOOL).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_GRAY_WOOL_PRESSURE_PLATE = registerBlock("light_gray_wool_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_WOOL)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> LIGHT_GRAY_WOOL_TRAPDOOR = registerBlock("light_gray_wool_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_WOOL)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> LIGHT_GRAY_WOOL_DOOR = registerBlock("light_gray_wool_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_WOOL)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> CYAN_WOOL_STAIRS = registerBlock("cyan_wool_stairs",
            () -> new StairBlock(
                () -> Blocks.CYAN_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CYAN_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CYAN_WOOL_SLAB = registerBlock("cyan_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CYAN_WOOL_FENCE = registerBlock("cyan_wool_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CYAN_WOOL_FENCE_GATE = registerBlock("cyan_wool_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CYAN_WOOL_WALL = registerBlock("cyan_wool_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CYAN_WOOL_BUTTON = registerBlock("cyan_wool_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_WOOL).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CYAN_WOOL_PRESSURE_PLATE = registerBlock("cyan_wool_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.CYAN_WOOL)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> CYAN_WOOL_TRAPDOOR = registerBlock("cyan_wool_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_WOOL)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> CYAN_WOOL_DOOR = registerBlock("cyan_wool_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_WOOL)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> PURPLE_WOOL_STAIRS = registerBlock("purple_wool_stairs",
            () -> new StairBlock(
                () -> Blocks.PURPLE_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PURPLE_WOOL_SLAB = registerBlock("purple_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PURPLE_WOOL_FENCE = registerBlock("purple_wool_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PURPLE_WOOL_FENCE_GATE = registerBlock("purple_wool_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PURPLE_WOOL_WALL = registerBlock("purple_wool_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PURPLE_WOOL_BUTTON = registerBlock("purple_wool_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PURPLE_WOOL_PRESSURE_PLATE = registerBlock("purple_wool_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> PURPLE_WOOL_TRAPDOOR = registerBlock("purple_wool_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> PURPLE_WOOL_DOOR = registerBlock("purple_wool_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> BLUE_WOOL_STAIRS = registerBlock("blue_wool_stairs",
            () -> new StairBlock(
                () -> Blocks.BLUE_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLUE_WOOL_SLAB = registerBlock("blue_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLUE_WOOL_FENCE = registerBlock("blue_wool_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLUE_WOOL_FENCE_GATE = registerBlock("blue_wool_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLUE_WOOL_WALL = registerBlock("blue_wool_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLUE_WOOL_BUTTON = registerBlock("blue_wool_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLUE_WOOL_PRESSURE_PLATE = registerBlock("blue_wool_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> BLUE_WOOL_TRAPDOOR = registerBlock("blue_wool_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> BLUE_WOOL_DOOR = registerBlock("blue_wool_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> BROWN_WOOL_STAIRS = registerBlock("brown_wool_stairs",
            () -> new StairBlock(
                () -> Blocks.BROWN_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BROWN_WOOL_SLAB = registerBlock("brown_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BROWN_WOOL_FENCE = registerBlock("brown_wool_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BROWN_WOOL_FENCE_GATE = registerBlock("brown_wool_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BROWN_WOOL_WALL = registerBlock("brown_wool_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BROWN_WOOL_BUTTON = registerBlock("brown_wool_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BROWN_WOOL_PRESSURE_PLATE = registerBlock("brown_wool_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> BROWN_WOOL_TRAPDOOR = registerBlock("brown_wool_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> BROWN_WOOL_DOOR = registerBlock("brown_wool_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> GREEN_WOOL_STAIRS = registerBlock("green_wool_stairs",
            () -> new StairBlock(
                () -> Blocks.GREEN_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GREEN_WOOL_SLAB = registerBlock("green_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GREEN_WOOL_FENCE = registerBlock("green_wool_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GREEN_WOOL_FENCE_GATE = registerBlock("green_wool_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GREEN_WOOL_WALL = registerBlock("green_wool_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GREEN_WOOL_BUTTON = registerBlock("green_wool_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GREEN_WOOL_PRESSURE_PLATE = registerBlock("green_wool_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> GREEN_WOOL_TRAPDOOR = registerBlock("green_wool_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> GREEN_WOOL_DOOR = registerBlock("green_wool_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> RED_WOOL_STAIRS = registerBlock("red_wool_stairs",
            () -> new StairBlock(
                () -> Blocks.RED_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.RED_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RED_WOOL_SLAB = registerBlock("red_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RED_WOOL_FENCE = registerBlock("red_wool_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RED_WOOL_FENCE_GATE = registerBlock("red_wool_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RED_WOOL_WALL = registerBlock("red_wool_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RED_WOOL_BUTTON = registerBlock("red_wool_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RED_WOOL_PRESSURE_PLATE = registerBlock("red_wool_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.RED_WOOL)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> RED_WOOL_TRAPDOOR = registerBlock("red_wool_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> RED_WOOL_DOOR = registerBlock("red_wool_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> BLACK_WOOL_STAIRS = registerBlock("black_wool_stairs",
            () -> new StairBlock(
                () -> Blocks.BLACK_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLACK_WOOL_SLAB = registerBlock("black_wool_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLACK_WOOL_FENCE = registerBlock("black_wool_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLACK_WOOL_FENCE_GATE = registerBlock("black_wool_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLACK_WOOL_WALL = registerBlock("black_wool_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLACK_WOOL_BUTTON = registerBlock("black_wool_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLACK_WOOL_PRESSURE_PLATE = registerBlock("black_wool_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> BLACK_WOOL_TRAPDOOR = registerBlock("black_wool_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> BLACK_WOOL_DOOR = registerBlock("black_wool_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            () -> new StairBlock(
                () -> Blocks.SMOOTH_STONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> SMOOTH_STONE_SLAB = registerBlock("smooth_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> SMOOTH_STONE_FENCE = registerBlock("smooth_stone_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> SMOOTH_STONE_FENCE_GATE = registerBlock("smooth_stone_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> SMOOTH_STONE_WALL = registerBlock("smooth_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> SMOOTH_STONE_BUTTON = registerBlock("smooth_stone_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> SMOOTH_STONE_PRESSURE_PLATE = registerBlock("smooth_stone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> SMOOTH_STONE_TRAPDOOR = registerBlock("smooth_stone_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> SMOOTH_STONE_DOOR = registerBlock("smooth_stone_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> BRICKS_STAIRS = registerBlock("bricks_stairs",
            () -> new StairBlock(
                () -> Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BRICKS_SLAB = registerBlock("bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BRICKS_FENCE = registerBlock("bricks_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BRICKS_FENCE_GATE = registerBlock("bricks_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BRICKS_WALL = registerBlock("bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BRICKS_BUTTON = registerBlock("bricks_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BRICKS_PRESSURE_PLATE = registerBlock("bricks_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.BRICKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> BRICKS_TRAPDOOR = registerBlock("bricks_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> BRICKS_DOOR = registerBlock("bricks_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> MOSSY_COBBLESTONE_STAIRS = registerBlock("mossy_cobblestone_stairs",
            () -> new StairBlock(
                () -> Blocks.MOSSY_COBBLESTONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MOSSY_COBBLESTONE_SLAB = registerBlock("mossy_cobblestone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MOSSY_COBBLESTONE_FENCE = registerBlock("mossy_cobblestone_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MOSSY_COBBLESTONE_FENCE_GATE = registerBlock("mossy_cobblestone_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MOSSY_COBBLESTONE_WALL = registerBlock("mossy_cobblestone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MOSSY_COBBLESTONE_BUTTON = registerBlock("mossy_cobblestone_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MOSSY_COBBLESTONE_PRESSURE_PLATE = registerBlock("mossy_cobblestone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> MOSSY_COBBLESTONE_TRAPDOOR = registerBlock("mossy_cobblestone_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> MOSSY_COBBLESTONE_DOOR = registerBlock("mossy_cobblestone_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> OBSIDIAN_STAIRS = registerBlock("obsidian_stairs",
            () -> new StairBlock(
                () -> Blocks.OBSIDIAN.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> OBSIDIAN_SLAB = registerBlock("obsidian_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> OBSIDIAN_FENCE = registerBlock("obsidian_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> OBSIDIAN_FENCE_GATE = registerBlock("obsidian_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> OBSIDIAN_WALL = registerBlock("obsidian_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> OBSIDIAN_BUTTON = registerBlock("obsidian_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> OBSIDIAN_PRESSURE_PLATE = registerBlock("obsidian_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> OBSIDIAN_TRAPDOOR = registerBlock("obsidian_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> OBSIDIAN_DOOR = registerBlock("obsidian_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> CLAY_STAIRS = registerBlock("clay_stairs",
            () -> new StairBlock(
                () -> Blocks.CLAY.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CLAY)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CLAY_SLAB = registerBlock("clay_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CLAY)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CLAY_FENCE = registerBlock("clay_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.CLAY)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CLAY_FENCE_GATE = registerBlock("clay_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.CLAY)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CLAY_WALL = registerBlock("clay_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CLAY)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CLAY_BUTTON = registerBlock("clay_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.CLAY).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CLAY_PRESSURE_PLATE = registerBlock("clay_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.CLAY)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> CLAY_TRAPDOOR = registerBlock("clay_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.CLAY)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> CLAY_DOOR = registerBlock("clay_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.CLAY)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> SOUL_SAND_STAIRS = registerBlock("soul_sand_stairs",
            () -> new StairBlock(
                () -> Blocks.SOUL_SAND.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SOUL_SAND)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> SOUL_SAND_SLAB = registerBlock("soul_sand_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SAND)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> SOUL_SAND_FENCE = registerBlock("soul_sand_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SAND)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> SOUL_SAND_FENCE_GATE = registerBlock("soul_sand_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SAND)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> SOUL_SAND_WALL = registerBlock("soul_sand_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SAND)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> SOUL_SAND_BUTTON = registerBlock("soul_sand_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SAND).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> SOUL_SAND_PRESSURE_PLATE = registerBlock("soul_sand_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.SOUL_SAND)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> SOUL_SAND_TRAPDOOR = registerBlock("soul_sand_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SAND)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> SOUL_SAND_DOOR = registerBlock("soul_sand_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SAND)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> SOUL_SOIL_STAIRS = registerBlock("soul_soil_stairs",
            () -> new StairBlock(
                () -> Blocks.SOUL_SOIL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SOUL_SOIL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> SOUL_SOIL_SLAB = registerBlock("soul_soil_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SOIL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> SOUL_SOIL_FENCE = registerBlock("soul_soil_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SOIL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> SOUL_SOIL_FENCE_GATE = registerBlock("soul_soil_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SOIL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> SOUL_SOIL_WALL = registerBlock("soul_soil_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SOIL)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> SOUL_SOIL_BUTTON = registerBlock("soul_soil_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SOIL).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> SOUL_SOIL_PRESSURE_PLATE = registerBlock("soul_soil_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.SOUL_SOIL)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> SOUL_SOIL_TRAPDOOR = registerBlock("soul_soil_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SOIL)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> SOUL_SOIL_DOOR = registerBlock("soul_soil_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SOIL)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs",
            () -> new StairBlock(
                () -> Blocks.SMOOTH_BASALT.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SMOOTH_BASALT)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_BASALT)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> SMOOTH_BASALT_FENCE = registerBlock("smooth_basalt_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_BASALT)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> SMOOTH_BASALT_FENCE_GATE = registerBlock("smooth_basalt_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_BASALT)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> SMOOTH_BASALT_WALL = registerBlock("smooth_basalt_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_BASALT)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> SMOOTH_BASALT_BUTTON = registerBlock("smooth_basalt_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_BASALT).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> SMOOTH_BASALT_PRESSURE_PLATE = registerBlock("smooth_basalt_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.SMOOTH_BASALT)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> SMOOTH_BASALT_TRAPDOOR = registerBlock("smooth_basalt_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_BASALT)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> SMOOTH_BASALT_DOOR = registerBlock("smooth_basalt_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_BASALT)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> STONE_BRICKS_STAIRS = registerBlock("stone_bricks_stairs",
            () -> new StairBlock(
                () -> Blocks.STONE_BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> STONE_BRICKS_SLAB = registerBlock("stone_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> STONE_BRICKS_FENCE = registerBlock("stone_bricks_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> STONE_BRICKS_FENCE_GATE = registerBlock("stone_bricks_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> STONE_BRICKS_WALL = registerBlock("stone_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> STONE_BRICKS_BUTTON = registerBlock("stone_bricks_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> STONE_BRICKS_PRESSURE_PLATE = registerBlock("stone_bricks_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> STONE_BRICKS_TRAPDOOR = registerBlock("stone_bricks_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> STONE_BRICKS_DOOR = registerBlock("stone_bricks_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> MOSSY_STONE_BRICKS_STAIRS = registerBlock("mossy_stone_bricks_stairs",
            () -> new StairBlock(
                () -> Blocks.MOSSY_STONE_BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.MOSSY_STONE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MOSSY_STONE_BRICKS_SLAB = registerBlock("mossy_stone_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_STONE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MOSSY_STONE_BRICKS_FENCE = registerBlock("mossy_stone_bricks_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_STONE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MOSSY_STONE_BRICKS_FENCE_GATE = registerBlock("mossy_stone_bricks_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_STONE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MOSSY_STONE_BRICKS_WALL = registerBlock("mossy_stone_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_STONE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MOSSY_STONE_BRICKS_BUTTON = registerBlock("mossy_stone_bricks_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_STONE_BRICKS).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MOSSY_STONE_BRICKS_PRESSURE_PLATE = registerBlock("mossy_stone_bricks_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.MOSSY_STONE_BRICKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> MOSSY_STONE_BRICKS_TRAPDOOR = registerBlock("mossy_stone_bricks_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_STONE_BRICKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> MOSSY_STONE_BRICKS_DOOR = registerBlock("mossy_stone_bricks_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_STONE_BRICKS)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> CRACKED_STONE_BRICKS_STAIRS = registerBlock("cracked_stone_bricks_stairs",
            () -> new StairBlock(
                () -> Blocks.CRACKED_STONE_BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CRACKED_STONE_BRICKS_SLAB = registerBlock("cracked_stone_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CRACKED_STONE_BRICKS_FENCE = registerBlock("cracked_stone_bricks_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CRACKED_STONE_BRICKS_FENCE_GATE = registerBlock("cracked_stone_bricks_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CRACKED_STONE_BRICKS_WALL = registerBlock("cracked_stone_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CRACKED_STONE_BRICKS_BUTTON = registerBlock("cracked_stone_bricks_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CRACKED_STONE_BRICKS_PRESSURE_PLATE = registerBlock("cracked_stone_bricks_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> CRACKED_STONE_BRICKS_TRAPDOOR = registerBlock("cracked_stone_bricks_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> CRACKED_STONE_BRICKS_DOOR = registerBlock("cracked_stone_bricks_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> CHISELED_STONE_BRICKS_STAIRS = registerBlock("chiseled_stone_bricks_stairs",
            () -> new StairBlock(
                () -> Blocks.CHISELED_STONE_BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CHISELED_STONE_BRICKS_SLAB = registerBlock("chiseled_stone_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CHISELED_STONE_BRICKS_FENCE = registerBlock("chiseled_stone_bricks_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CHISELED_STONE_BRICKS_FENCE_GATE = registerBlock("chiseled_stone_bricks_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CHISELED_STONE_BRICKS_WALL = registerBlock("chiseled_stone_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CHISELED_STONE_BRICKS_BUTTON = registerBlock("chiseled_stone_bricks_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CHISELED_STONE_BRICKS_PRESSURE_PLATE = registerBlock("chiseled_stone_bricks_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> CHISELED_STONE_BRICKS_TRAPDOOR = registerBlock("chiseled_stone_bricks_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> CHISELED_STONE_BRICKS_DOOR = registerBlock("chiseled_stone_bricks_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> PACKED_MUD_STAIRS = registerBlock("packed_mud_stairs",
            () -> new StairBlock(
                () -> Blocks.PACKED_MUD.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PACKED_MUD)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PACKED_MUD_SLAB = registerBlock("packed_mud_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PACKED_MUD_FENCE = registerBlock("packed_mud_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PACKED_MUD_FENCE_GATE = registerBlock("packed_mud_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PACKED_MUD_WALL = registerBlock("packed_mud_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PACKED_MUD_BUTTON = registerBlock("packed_mud_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PACKED_MUD_PRESSURE_PLATE = registerBlock("packed_mud_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.PACKED_MUD)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> PACKED_MUD_TRAPDOOR = registerBlock("packed_mud_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> PACKED_MUD_DOOR = registerBlock("packed_mud_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> MUD_BRICKS_STAIRS = registerBlock("mud_bricks_stairs",
            () -> new StairBlock(
                () -> Blocks.MUD_BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MUD_BRICKS_SLAB = registerBlock("mud_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MUD_BRICKS_FENCE = registerBlock("mud_bricks_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MUD_BRICKS_FENCE_GATE = registerBlock("mud_bricks_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MUD_BRICKS_WALL = registerBlock("mud_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MUD_BRICKS_BUTTON = registerBlock("mud_bricks_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MUD_BRICKS_PRESSURE_PLATE = registerBlock("mud_bricks_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> MUD_BRICKS_TRAPDOOR = registerBlock("mud_bricks_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> MUD_BRICKS_DOOR = registerBlock("mud_bricks_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> DEEPSLATE_BRICKS_STAIRS = registerBlock("deepslate_bricks_stairs",
            () -> new StairBlock(
                () -> Blocks.DEEPSLATE_BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_BRICKS_SLAB = registerBlock("deepslate_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_BRICKS_FENCE = registerBlock("deepslate_bricks_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_BRICKS_FENCE_GATE = registerBlock("deepslate_bricks_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_BRICKS_WALL = registerBlock("deepslate_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_BRICKS_BUTTON = registerBlock("deepslate_bricks_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_BRICKS_PRESSURE_PLATE = registerBlock("deepslate_bricks_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> DEEPSLATE_BRICKS_TRAPDOOR = registerBlock("deepslate_bricks_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> DEEPSLATE_BRICKS_DOOR = registerBlock("deepslate_bricks_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICKS_STAIRS = registerBlock("cracked_deepslate_bricks_stairs",
            () -> new StairBlock(
                () -> Blocks.CRACKED_DEEPSLATE_BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICKS_SLAB = registerBlock("cracked_deepslate_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICKS_FENCE = registerBlock("cracked_deepslate_bricks_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICKS_FENCE_GATE = registerBlock("cracked_deepslate_bricks_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICKS_WALL = registerBlock("cracked_deepslate_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICKS_BUTTON = registerBlock("cracked_deepslate_bricks_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_DEEPSLATE_BRICKS).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICKS_PRESSURE_PLATE = registerBlock("cracked_deepslate_bricks_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICKS_TRAPDOOR = registerBlock("cracked_deepslate_bricks_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> CRACKED_DEEPSLATE_BRICKS_DOOR = registerBlock("cracked_deepslate_bricks_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> DEEPSLATE_TILES_STAIRS = registerBlock("deepslate_tiles_stairs",
            () -> new StairBlock(
                () -> Blocks.DEEPSLATE_TILES.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_TILES_SLAB = registerBlock("deepslate_tiles_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_TILES_FENCE = registerBlock("deepslate_tiles_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_TILES_FENCE_GATE = registerBlock("deepslate_tiles_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_TILES_WALL = registerBlock("deepslate_tiles_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_TILES_BUTTON = registerBlock("deepslate_tiles_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DEEPSLATE_TILES_PRESSURE_PLATE = registerBlock("deepslate_tiles_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> DEEPSLATE_TILES_TRAPDOOR = registerBlock("deepslate_tiles_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> DEEPSLATE_TILES_DOOR = registerBlock("deepslate_tiles_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILES_STAIRS = registerBlock("cracked_deepslate_tiles_stairs",
            () -> new StairBlock(
                () -> Blocks.CRACKED_DEEPSLATE_TILES.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRACKED_DEEPSLATE_TILES)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILES_SLAB = registerBlock("cracked_deepslate_tiles_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_DEEPSLATE_TILES)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILES_FENCE = registerBlock("cracked_deepslate_tiles_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_DEEPSLATE_TILES)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILES_FENCE_GATE = registerBlock("cracked_deepslate_tiles_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_DEEPSLATE_TILES)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILES_WALL = registerBlock("cracked_deepslate_tiles_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_DEEPSLATE_TILES)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILES_BUTTON = registerBlock("cracked_deepslate_tiles_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_DEEPSLATE_TILES).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILES_PRESSURE_PLATE = registerBlock("cracked_deepslate_tiles_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.CRACKED_DEEPSLATE_TILES)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILES_TRAPDOOR = registerBlock("cracked_deepslate_tiles_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_DEEPSLATE_TILES)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> CRACKED_DEEPSLATE_TILES_DOOR = registerBlock("cracked_deepslate_tiles_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_DEEPSLATE_TILES)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> CHISELED_DEEPSLATE_STAIRS = registerBlock("chiseled_deepslate_stairs",
            () -> new StairBlock(
                () -> Blocks.CHISELED_DEEPSLATE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CHISELED_DEEPSLATE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CHISELED_DEEPSLATE_SLAB = registerBlock("chiseled_deepslate_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_DEEPSLATE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CHISELED_DEEPSLATE_FENCE = registerBlock("chiseled_deepslate_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_DEEPSLATE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CHISELED_DEEPSLATE_FENCE_GATE = registerBlock("chiseled_deepslate_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_DEEPSLATE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CHISELED_DEEPSLATE_WALL = registerBlock("chiseled_deepslate_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_DEEPSLATE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CHISELED_DEEPSLATE_BUTTON = registerBlock("chiseled_deepslate_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_DEEPSLATE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CHISELED_DEEPSLATE_PRESSURE_PLATE = registerBlock("chiseled_deepslate_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.CHISELED_DEEPSLATE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> CHISELED_DEEPSLATE_TRAPDOOR = registerBlock("chiseled_deepslate_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_DEEPSLATE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> CHISELED_DEEPSLATE_DOOR = registerBlock("chiseled_deepslate_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_DEEPSLATE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> MUSHROOM_STEM_STAIRS = registerBlock("mushroom_stem_stairs",
            () -> new StairBlock(
                () -> Blocks.MUSHROOM_STEM.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.MUSHROOM_STEM)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MUSHROOM_STEM_SLAB = registerBlock("mushroom_stem_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MUSHROOM_STEM)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MUSHROOM_STEM_FENCE = registerBlock("mushroom_stem_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.MUSHROOM_STEM)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MUSHROOM_STEM_FENCE_GATE = registerBlock("mushroom_stem_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.MUSHROOM_STEM)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MUSHROOM_STEM_WALL = registerBlock("mushroom_stem_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.MUSHROOM_STEM)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MUSHROOM_STEM_BUTTON = registerBlock("mushroom_stem_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.MUSHROOM_STEM).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MUSHROOM_STEM_PRESSURE_PLATE = registerBlock("mushroom_stem_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.MUSHROOM_STEM)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> MUSHROOM_STEM_TRAPDOOR = registerBlock("mushroom_stem_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.MUSHROOM_STEM)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> MUSHROOM_STEM_DOOR = registerBlock("mushroom_stem_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.MUSHROOM_STEM)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> NETHER_BRICKS_STAIRS = registerBlock("nether_bricks_stairs",
            () -> new StairBlock(
                () -> Blocks.NETHER_BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> NETHER_BRICKS_SLAB = registerBlock("nether_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> NETHER_BRICKS_FENCE = registerBlock("nether_bricks_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> NETHER_BRICKS_FENCE_GATE = registerBlock("nether_bricks_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> NETHER_BRICKS_WALL = registerBlock("nether_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> NETHER_BRICKS_BUTTON = registerBlock("nether_bricks_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> NETHER_BRICKS_PRESSURE_PLATE = registerBlock("nether_bricks_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> NETHER_BRICKS_TRAPDOOR = registerBlock("nether_bricks_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> NETHER_BRICKS_DOOR = registerBlock("nether_bricks_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> CRACKED_NETHER_BRICKS_STAIRS = registerBlock("cracked_nether_bricks_stairs",
            () -> new StairBlock(
                () -> Blocks.CRACKED_NETHER_BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRACKED_NETHER_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CRACKED_NETHER_BRICKS_SLAB = registerBlock("cracked_nether_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_NETHER_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CRACKED_NETHER_BRICKS_FENCE = registerBlock("cracked_nether_bricks_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_NETHER_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CRACKED_NETHER_BRICKS_FENCE_GATE = registerBlock("cracked_nether_bricks_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_NETHER_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CRACKED_NETHER_BRICKS_WALL = registerBlock("cracked_nether_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_NETHER_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CRACKED_NETHER_BRICKS_BUTTON = registerBlock("cracked_nether_bricks_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_NETHER_BRICKS).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CRACKED_NETHER_BRICKS_PRESSURE_PLATE = registerBlock("cracked_nether_bricks_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.CRACKED_NETHER_BRICKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> CRACKED_NETHER_BRICKS_TRAPDOOR = registerBlock("cracked_nether_bricks_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_NETHER_BRICKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> CRACKED_NETHER_BRICKS_DOOR = registerBlock("cracked_nether_bricks_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_NETHER_BRICKS)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> CHISELED_NETHER_BRICKS_STAIRS = registerBlock("chiseled_nether_bricks_stairs",
            () -> new StairBlock(
                () -> Blocks.CHISELED_NETHER_BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CHISELED_NETHER_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CHISELED_NETHER_BRICKS_SLAB = registerBlock("chiseled_nether_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_NETHER_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CHISELED_NETHER_BRICKS_FENCE = registerBlock("chiseled_nether_bricks_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_NETHER_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CHISELED_NETHER_BRICKS_FENCE_GATE = registerBlock("chiseled_nether_bricks_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_NETHER_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CHISELED_NETHER_BRICKS_WALL = registerBlock("chiseled_nether_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_NETHER_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CHISELED_NETHER_BRICKS_BUTTON = registerBlock("chiseled_nether_bricks_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_NETHER_BRICKS).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CHISELED_NETHER_BRICKS_PRESSURE_PLATE = registerBlock("chiseled_nether_bricks_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.CHISELED_NETHER_BRICKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> CHISELED_NETHER_BRICKS_TRAPDOOR = registerBlock("chiseled_nether_bricks_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_NETHER_BRICKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> CHISELED_NETHER_BRICKS_DOOR = registerBlock("chiseled_nether_bricks_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_NETHER_BRICKS)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> SCULK_STAIRS = registerBlock("sculk_stairs",
            () -> new StairBlock(
                () -> Blocks.SCULK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SCULK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> SCULK_SLAB = registerBlock("sculk_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SCULK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> SCULK_FENCE = registerBlock("sculk_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.SCULK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> SCULK_FENCE_GATE = registerBlock("sculk_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.SCULK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> SCULK_WALL = registerBlock("sculk_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SCULK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> SCULK_BUTTON = registerBlock("sculk_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.SCULK).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> SCULK_PRESSURE_PLATE = registerBlock("sculk_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.SCULK)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> SCULK_TRAPDOOR = registerBlock("sculk_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.SCULK)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> SCULK_DOOR = registerBlock("sculk_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.SCULK)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> END_STONE_STAIRS = registerBlock("end_stone_stairs",
            () -> new StairBlock(
                () -> Blocks.END_STONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.END_STONE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> END_STONE_SLAB = registerBlock("end_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> END_STONE_FENCE = registerBlock("end_stone_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> END_STONE_FENCE_GATE = registerBlock("end_stone_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> END_STONE_WALL = registerBlock("end_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> END_STONE_BUTTON = registerBlock("end_stone_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> END_STONE_PRESSURE_PLATE = registerBlock("end_stone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.END_STONE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> END_STONE_TRAPDOOR = registerBlock("end_stone_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> END_STONE_DOOR = registerBlock("end_stone_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> END_STONE_BRICKS_STAIRS = registerBlock("end_stone_bricks_stairs",
            () -> new StairBlock(
                () -> Blocks.END_STONE_BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> END_STONE_BRICKS_SLAB = registerBlock("end_stone_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> END_STONE_BRICKS_FENCE = registerBlock("end_stone_bricks_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> END_STONE_BRICKS_FENCE_GATE = registerBlock("end_stone_bricks_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> END_STONE_BRICKS_WALL = registerBlock("end_stone_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> END_STONE_BRICKS_BUTTON = registerBlock("end_stone_bricks_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> END_STONE_BRICKS_PRESSURE_PLATE = registerBlock("end_stone_bricks_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> END_STONE_BRICKS_TRAPDOOR = registerBlock("end_stone_bricks_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> END_STONE_BRICKS_DOOR = registerBlock("end_stone_bricks_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> QUARTZ_BRICKS_STAIRS = registerBlock("quartz_bricks_stairs",
            () -> new StairBlock(
                () -> Blocks.QUARTZ_BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> QUARTZ_BRICKS_SLAB = registerBlock("quartz_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> QUARTZ_BRICKS_FENCE = registerBlock("quartz_bricks_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> QUARTZ_BRICKS_FENCE_GATE = registerBlock("quartz_bricks_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> QUARTZ_BRICKS_WALL = registerBlock("quartz_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> QUARTZ_BRICKS_BUTTON = registerBlock("quartz_bricks_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> QUARTZ_BRICKS_PRESSURE_PLATE = registerBlock("quartz_bricks_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> QUARTZ_BRICKS_TRAPDOOR = registerBlock("quartz_bricks_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> QUARTZ_BRICKS_DOOR = registerBlock("quartz_bricks_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> WHITE_TERRACOTTA_STAIRS = registerBlock("white_terracotta_stairs",
            () -> new StairBlock(
                () -> Blocks.WHITE_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> WHITE_TERRACOTTA_SLAB = registerBlock("white_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> WHITE_TERRACOTTA_FENCE = registerBlock("white_terracotta_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> WHITE_TERRACOTTA_FENCE_GATE = registerBlock("white_terracotta_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> WHITE_TERRACOTTA_WALL = registerBlock("white_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> WHITE_TERRACOTTA_BUTTON = registerBlock("white_terracotta_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> WHITE_TERRACOTTA_PRESSURE_PLATE = registerBlock("white_terracotta_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> WHITE_TERRACOTTA_TRAPDOOR = registerBlock("white_terracotta_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> WHITE_TERRACOTTA_DOOR = registerBlock("white_terracotta_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> ORANGE_TERRACOTTA_STAIRS = registerBlock("orange_terracotta_stairs",
            () -> new StairBlock(
                () -> Blocks.ORANGE_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> ORANGE_TERRACOTTA_SLAB = registerBlock("orange_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> ORANGE_TERRACOTTA_FENCE = registerBlock("orange_terracotta_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> ORANGE_TERRACOTTA_FENCE_GATE = registerBlock("orange_terracotta_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> ORANGE_TERRACOTTA_WALL = registerBlock("orange_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> ORANGE_TERRACOTTA_BUTTON = registerBlock("orange_terracotta_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> ORANGE_TERRACOTTA_PRESSURE_PLATE = registerBlock("orange_terracotta_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> ORANGE_TERRACOTTA_TRAPDOOR = registerBlock("orange_terracotta_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> ORANGE_TERRACOTTA_DOOR = registerBlock("orange_terracotta_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> MAGENTA_TERRACOTTA_STAIRS = registerBlock("magenta_terracotta_stairs",
            () -> new StairBlock(
                () -> Blocks.MAGENTA_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MAGENTA_TERRACOTTA_SLAB = registerBlock("magenta_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MAGENTA_TERRACOTTA_FENCE = registerBlock("magenta_terracotta_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MAGENTA_TERRACOTTA_FENCE_GATE = registerBlock("magenta_terracotta_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MAGENTA_TERRACOTTA_WALL = registerBlock("magenta_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MAGENTA_TERRACOTTA_BUTTON = registerBlock("magenta_terracotta_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MAGENTA_TERRACOTTA_PRESSURE_PLATE = registerBlock("magenta_terracotta_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> MAGENTA_TERRACOTTA_TRAPDOOR = registerBlock("magenta_terracotta_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> MAGENTA_TERRACOTTA_DOOR = registerBlock("magenta_terracotta_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_STAIRS = registerBlock("light_blue_terracotta_stairs",
            () -> new StairBlock(
                () -> Blocks.LIGHT_BLUE_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("light_blue_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_FENCE = registerBlock("light_blue_terracotta_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_FENCE_GATE = registerBlock("light_blue_terracotta_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_WALL = registerBlock("light_blue_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_BUTTON = registerBlock("light_blue_terracotta_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_PRESSURE_PLATE = registerBlock("light_blue_terracotta_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_TRAPDOOR = registerBlock("light_blue_terracotta_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_DOOR = registerBlock("light_blue_terracotta_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> YELLOW_TERRACOTTA_STAIRS = registerBlock("yellow_terracotta_stairs",
            () -> new StairBlock(
                () -> Blocks.YELLOW_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> YELLOW_TERRACOTTA_SLAB = registerBlock("yellow_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> YELLOW_TERRACOTTA_FENCE = registerBlock("yellow_terracotta_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> YELLOW_TERRACOTTA_FENCE_GATE = registerBlock("yellow_terracotta_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> YELLOW_TERRACOTTA_WALL = registerBlock("yellow_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> YELLOW_TERRACOTTA_BUTTON = registerBlock("yellow_terracotta_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> YELLOW_TERRACOTTA_PRESSURE_PLATE = registerBlock("yellow_terracotta_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> YELLOW_TERRACOTTA_TRAPDOOR = registerBlock("yellow_terracotta_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> YELLOW_TERRACOTTA_DOOR = registerBlock("yellow_terracotta_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> LIME_TERRACOTTA_STAIRS = registerBlock("lime_terracotta_stairs",
            () -> new StairBlock(
                () -> Blocks.LIME_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIME_TERRACOTTA_SLAB = registerBlock("lime_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIME_TERRACOTTA_FENCE = registerBlock("lime_terracotta_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIME_TERRACOTTA_FENCE_GATE = registerBlock("lime_terracotta_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIME_TERRACOTTA_WALL = registerBlock("lime_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIME_TERRACOTTA_BUTTON = registerBlock("lime_terracotta_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIME_TERRACOTTA_PRESSURE_PLATE = registerBlock("lime_terracotta_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> LIME_TERRACOTTA_TRAPDOOR = registerBlock("lime_terracotta_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> LIME_TERRACOTTA_DOOR = registerBlock("lime_terracotta_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> PINK_TERRACOTTA_STAIRS = registerBlock("pink_terracotta_stairs",
            () -> new StairBlock(
                () -> Blocks.PINK_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PINK_TERRACOTTA_SLAB = registerBlock("pink_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PINK_TERRACOTTA_FENCE = registerBlock("pink_terracotta_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PINK_TERRACOTTA_FENCE_GATE = registerBlock("pink_terracotta_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PINK_TERRACOTTA_WALL = registerBlock("pink_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PINK_TERRACOTTA_BUTTON = registerBlock("pink_terracotta_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PINK_TERRACOTTA_PRESSURE_PLATE = registerBlock("pink_terracotta_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> PINK_TERRACOTTA_TRAPDOOR = registerBlock("pink_terracotta_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> PINK_TERRACOTTA_DOOR = registerBlock("pink_terracotta_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> GRAY_TERRACOTTA_STAIRS = registerBlock("gray_terracotta_stairs",
            () -> new StairBlock(
                () -> Blocks.GRAY_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GRAY_TERRACOTTA_SLAB = registerBlock("gray_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GRAY_TERRACOTTA_FENCE = registerBlock("gray_terracotta_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GRAY_TERRACOTTA_FENCE_GATE = registerBlock("gray_terracotta_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GRAY_TERRACOTTA_WALL = registerBlock("gray_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GRAY_TERRACOTTA_BUTTON = registerBlock("gray_terracotta_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GRAY_TERRACOTTA_PRESSURE_PLATE = registerBlock("gray_terracotta_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> GRAY_TERRACOTTA_TRAPDOOR = registerBlock("gray_terracotta_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> GRAY_TERRACOTTA_DOOR = registerBlock("gray_terracotta_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_STAIRS = registerBlock("light_gray_terracotta_stairs",
            () -> new StairBlock(
                () -> Blocks.LIGHT_GRAY_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("light_gray_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_FENCE = registerBlock("light_gray_terracotta_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_FENCE_GATE = registerBlock("light_gray_terracotta_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_WALL = registerBlock("light_gray_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_BUTTON = registerBlock("light_gray_terracotta_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_PRESSURE_PLATE = registerBlock("light_gray_terracotta_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_TRAPDOOR = registerBlock("light_gray_terracotta_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_DOOR = registerBlock("light_gray_terracotta_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> CYAN_TERRACOTTA_STAIRS = registerBlock("cyan_terracotta_stairs",
            () -> new StairBlock(
                () -> Blocks.CYAN_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CYAN_TERRACOTTA_SLAB = registerBlock("cyan_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CYAN_TERRACOTTA_FENCE = registerBlock("cyan_terracotta_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CYAN_TERRACOTTA_FENCE_GATE = registerBlock("cyan_terracotta_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CYAN_TERRACOTTA_WALL = registerBlock("cyan_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CYAN_TERRACOTTA_BUTTON = registerBlock("cyan_terracotta_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CYAN_TERRACOTTA_PRESSURE_PLATE = registerBlock("cyan_terracotta_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> CYAN_TERRACOTTA_TRAPDOOR = registerBlock("cyan_terracotta_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> CYAN_TERRACOTTA_DOOR = registerBlock("cyan_terracotta_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> PURPLE_TERRACOTTA_STAIRS = registerBlock("purple_terracotta_stairs",
            () -> new StairBlock(
                () -> Blocks.PURPLE_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PURPLE_TERRACOTTA_SLAB = registerBlock("purple_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PURPLE_TERRACOTTA_FENCE = registerBlock("purple_terracotta_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PURPLE_TERRACOTTA_FENCE_GATE = registerBlock("purple_terracotta_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PURPLE_TERRACOTTA_WALL = registerBlock("purple_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PURPLE_TERRACOTTA_BUTTON = registerBlock("purple_terracotta_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PURPLE_TERRACOTTA_PRESSURE_PLATE = registerBlock("purple_terracotta_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> PURPLE_TERRACOTTA_TRAPDOOR = registerBlock("purple_terracotta_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> PURPLE_TERRACOTTA_DOOR = registerBlock("purple_terracotta_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> BLUE_TERRACOTTA_STAIRS = registerBlock("blue_terracotta_stairs",
            () -> new StairBlock(
                () -> Blocks.BLUE_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLUE_TERRACOTTA_SLAB = registerBlock("blue_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLUE_TERRACOTTA_FENCE = registerBlock("blue_terracotta_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLUE_TERRACOTTA_FENCE_GATE = registerBlock("blue_terracotta_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLUE_TERRACOTTA_WALL = registerBlock("blue_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLUE_TERRACOTTA_BUTTON = registerBlock("blue_terracotta_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLUE_TERRACOTTA_PRESSURE_PLATE = registerBlock("blue_terracotta_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> BLUE_TERRACOTTA_TRAPDOOR = registerBlock("blue_terracotta_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> BLUE_TERRACOTTA_DOOR = registerBlock("blue_terracotta_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> BROWN_TERRACOTTA_STAIRS = registerBlock("brown_terracotta_stairs",
            () -> new StairBlock(
                () -> Blocks.BROWN_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BROWN_TERRACOTTA_SLAB = registerBlock("brown_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BROWN_TERRACOTTA_FENCE = registerBlock("brown_terracotta_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BROWN_TERRACOTTA_FENCE_GATE = registerBlock("brown_terracotta_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BROWN_TERRACOTTA_WALL = registerBlock("brown_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BROWN_TERRACOTTA_BUTTON = registerBlock("brown_terracotta_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BROWN_TERRACOTTA_PRESSURE_PLATE = registerBlock("brown_terracotta_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> BROWN_TERRACOTTA_TRAPDOOR = registerBlock("brown_terracotta_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> BROWN_TERRACOTTA_DOOR = registerBlock("brown_terracotta_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> GREEN_TERRACOTTA_STAIRS = registerBlock("green_terracotta_stairs",
            () -> new StairBlock(
                () -> Blocks.GREEN_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GREEN_TERRACOTTA_SLAB = registerBlock("green_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GREEN_TERRACOTTA_FENCE = registerBlock("green_terracotta_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GREEN_TERRACOTTA_FENCE_GATE = registerBlock("green_terracotta_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GREEN_TERRACOTTA_WALL = registerBlock("green_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GREEN_TERRACOTTA_BUTTON = registerBlock("green_terracotta_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GREEN_TERRACOTTA_PRESSURE_PLATE = registerBlock("green_terracotta_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> GREEN_TERRACOTTA_TRAPDOOR = registerBlock("green_terracotta_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> GREEN_TERRACOTTA_DOOR = registerBlock("green_terracotta_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> RED_TERRACOTTA_STAIRS = registerBlock("red_terracotta_stairs",
            () -> new StairBlock(
                () -> Blocks.RED_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RED_TERRACOTTA_SLAB = registerBlock("red_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RED_TERRACOTTA_FENCE = registerBlock("red_terracotta_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RED_TERRACOTTA_FENCE_GATE = registerBlock("red_terracotta_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RED_TERRACOTTA_WALL = registerBlock("red_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RED_TERRACOTTA_BUTTON = registerBlock("red_terracotta_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RED_TERRACOTTA_PRESSURE_PLATE = registerBlock("red_terracotta_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> RED_TERRACOTTA_TRAPDOOR = registerBlock("red_terracotta_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> RED_TERRACOTTA_DOOR = registerBlock("red_terracotta_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> BLACK_TERRACOTTA_STAIRS = registerBlock("black_terracotta_stairs",
            () -> new StairBlock(
                () -> Blocks.BLACK_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLACK_TERRACOTTA_SLAB = registerBlock("black_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLACK_TERRACOTTA_FENCE = registerBlock("black_terracotta_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLACK_TERRACOTTA_FENCE_GATE = registerBlock("black_terracotta_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLACK_TERRACOTTA_WALL = registerBlock("black_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLACK_TERRACOTTA_BUTTON = registerBlock("black_terracotta_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLACK_TERRACOTTA_PRESSURE_PLATE = registerBlock("black_terracotta_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> BLACK_TERRACOTTA_TRAPDOOR = registerBlock("black_terracotta_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> BLACK_TERRACOTTA_DOOR = registerBlock("black_terracotta_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> TERRACOTTA_STAIRS = registerBlock("terracotta_stairs",
            () -> new StairBlock(
                () -> Blocks.TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> TERRACOTTA_SLAB = registerBlock("terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> TERRACOTTA_FENCE = registerBlock("terracotta_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> TERRACOTTA_FENCE_GATE = registerBlock("terracotta_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> TERRACOTTA_WALL = registerBlock("terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> TERRACOTTA_BUTTON = registerBlock("terracotta_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> TERRACOTTA_PRESSURE_PLATE = registerBlock("terracotta_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> TERRACOTTA_TRAPDOOR = registerBlock("terracotta_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> TERRACOTTA_DOOR = registerBlock("terracotta_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> PRISMARINE_STAIRS = registerBlock("prismarine_stairs",
            () -> new StairBlock(
                () -> Blocks.PRISMARINE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PRISMARINE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PRISMARINE_SLAB = registerBlock("prismarine_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PRISMARINE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PRISMARINE_FENCE = registerBlock("prismarine_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.PRISMARINE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PRISMARINE_FENCE_GATE = registerBlock("prismarine_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.PRISMARINE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PRISMARINE_WALL = registerBlock("prismarine_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PRISMARINE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PRISMARINE_BUTTON = registerBlock("prismarine_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.PRISMARINE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PRISMARINE_PRESSURE_PLATE = registerBlock("prismarine_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.PRISMARINE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> PRISMARINE_TRAPDOOR = registerBlock("prismarine_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.PRISMARINE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> PRISMARINE_DOOR = registerBlock("prismarine_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.PRISMARINE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> PRISMARINE_BRICKS_STAIRS = registerBlock("prismarine_bricks_stairs",
            () -> new StairBlock(
                () -> Blocks.PRISMARINE_BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PRISMARINE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PRISMARINE_BRICKS_SLAB = registerBlock("prismarine_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PRISMARINE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PRISMARINE_BRICKS_FENCE = registerBlock("prismarine_bricks_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.PRISMARINE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PRISMARINE_BRICKS_FENCE_GATE = registerBlock("prismarine_bricks_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.PRISMARINE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PRISMARINE_BRICKS_WALL = registerBlock("prismarine_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PRISMARINE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PRISMARINE_BRICKS_BUTTON = registerBlock("prismarine_bricks_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.PRISMARINE_BRICKS).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PRISMARINE_BRICKS_PRESSURE_PLATE = registerBlock("prismarine_bricks_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.PRISMARINE_BRICKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> PRISMARINE_BRICKS_TRAPDOOR = registerBlock("prismarine_bricks_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.PRISMARINE_BRICKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> PRISMARINE_BRICKS_DOOR = registerBlock("prismarine_bricks_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.PRISMARINE_BRICKS)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> DARK_PRISMARINE_STAIRS = registerBlock("dark_prismarine_stairs",
            () -> new StairBlock(
                () -> Blocks.DARK_PRISMARINE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DARK_PRISMARINE_SLAB = registerBlock("dark_prismarine_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DARK_PRISMARINE_FENCE = registerBlock("dark_prismarine_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DARK_PRISMARINE_FENCE_GATE = registerBlock("dark_prismarine_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DARK_PRISMARINE_WALL = registerBlock("dark_prismarine_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DARK_PRISMARINE_BUTTON = registerBlock("dark_prismarine_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> DARK_PRISMARINE_PRESSURE_PLATE = registerBlock("dark_prismarine_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> DARK_PRISMARINE_TRAPDOOR = registerBlock("dark_prismarine_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> DARK_PRISMARINE_DOOR = registerBlock("dark_prismarine_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> NETHER_WART_BLOCK_STAIRS = registerBlock("nether_wart_block_stairs",
            () -> new StairBlock(
                () -> Blocks.NETHER_WART_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.NETHER_WART_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> NETHER_WART_BLOCK_SLAB = registerBlock("nether_wart_block_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_WART_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> NETHER_WART_BLOCK_FENCE = registerBlock("nether_wart_block_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_WART_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> NETHER_WART_BLOCK_FENCE_GATE = registerBlock("nether_wart_block_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_WART_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> NETHER_WART_BLOCK_WALL = registerBlock("nether_wart_block_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_WART_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> NETHER_WART_BLOCK_BUTTON = registerBlock("nether_wart_block_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_WART_BLOCK).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> NETHER_WART_BLOCK_PRESSURE_PLATE = registerBlock("nether_wart_block_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.NETHER_WART_BLOCK)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> NETHER_WART_BLOCK_TRAPDOOR = registerBlock("nether_wart_block_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_WART_BLOCK)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> NETHER_WART_BLOCK_DOOR = registerBlock("nether_wart_block_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_WART_BLOCK)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> WARPED_WART_BLOCK_STAIRS = registerBlock("warped_wart_block_stairs",
            () -> new StairBlock(
                () -> Blocks.WARPED_WART_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WARPED_WART_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> WARPED_WART_BLOCK_SLAB = registerBlock("warped_wart_block_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_WART_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> WARPED_WART_BLOCK_FENCE = registerBlock("warped_wart_block_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_WART_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> WARPED_WART_BLOCK_FENCE_GATE = registerBlock("warped_wart_block_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_WART_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> WARPED_WART_BLOCK_WALL = registerBlock("warped_wart_block_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_WART_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> WARPED_WART_BLOCK_BUTTON = registerBlock("warped_wart_block_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_WART_BLOCK).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> WARPED_WART_BLOCK_PRESSURE_PLATE = registerBlock("warped_wart_block_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.WARPED_WART_BLOCK)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> WARPED_WART_BLOCK_TRAPDOOR = registerBlock("warped_wart_block_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_WART_BLOCK)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> WARPED_WART_BLOCK_DOOR = registerBlock("warped_wart_block_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_WART_BLOCK)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> RED_NETHER_BRICKS_STAIRS = registerBlock("red_nether_bricks_stairs",
            () -> new StairBlock(
                () -> Blocks.RED_NETHER_BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RED_NETHER_BRICKS_SLAB = registerBlock("red_nether_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RED_NETHER_BRICKS_FENCE = registerBlock("red_nether_bricks_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RED_NETHER_BRICKS_FENCE_GATE = registerBlock("red_nether_bricks_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RED_NETHER_BRICKS_WALL = registerBlock("red_nether_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RED_NETHER_BRICKS_BUTTON = registerBlock("red_nether_bricks_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RED_NETHER_BRICKS_PRESSURE_PLATE = registerBlock("red_nether_bricks_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> RED_NETHER_BRICKS_TRAPDOOR = registerBlock("red_nether_bricks_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> RED_NETHER_BRICKS_DOOR = registerBlock("red_nether_bricks_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs",
            () -> new StairBlock(
                () -> Blocks.WHITE_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> WHITE_CONCRETE_FENCE = registerBlock("white_concrete_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> WHITE_CONCRETE_FENCE_GATE = registerBlock("white_concrete_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> WHITE_CONCRETE_WALL = registerBlock("white_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> WHITE_CONCRETE_BUTTON = registerBlock("white_concrete_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> WHITE_CONCRETE_PRESSURE_PLATE = registerBlock("white_concrete_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> WHITE_CONCRETE_TRAPDOOR = registerBlock("white_concrete_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> WHITE_CONCRETE_DOOR = registerBlock("white_concrete_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs",
            () -> new StairBlock(
                () -> Blocks.ORANGE_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ORANGE_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> ORANGE_CONCRETE_FENCE = registerBlock("orange_concrete_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> ORANGE_CONCRETE_FENCE_GATE = registerBlock("orange_concrete_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> ORANGE_CONCRETE_WALL = registerBlock("orange_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> ORANGE_CONCRETE_BUTTON = registerBlock("orange_concrete_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_CONCRETE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> ORANGE_CONCRETE_PRESSURE_PLATE = registerBlock("orange_concrete_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.ORANGE_CONCRETE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> ORANGE_CONCRETE_TRAPDOOR = registerBlock("orange_concrete_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_CONCRETE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> ORANGE_CONCRETE_DOOR = registerBlock("orange_concrete_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_CONCRETE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs",
            () -> new StairBlock(
                () -> Blocks.MAGENTA_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.MAGENTA_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MAGENTA_CONCRETE_FENCE = registerBlock("magenta_concrete_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MAGENTA_CONCRETE_FENCE_GATE = registerBlock("magenta_concrete_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MAGENTA_CONCRETE_WALL = registerBlock("magenta_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MAGENTA_CONCRETE_BUTTON = registerBlock("magenta_concrete_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_CONCRETE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MAGENTA_CONCRETE_PRESSURE_PLATE = registerBlock("magenta_concrete_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.MAGENTA_CONCRETE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> MAGENTA_CONCRETE_TRAPDOOR = registerBlock("magenta_concrete_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_CONCRETE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> MAGENTA_CONCRETE_DOOR = registerBlock("magenta_concrete_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_CONCRETE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs",
            () -> new StairBlock(
                () -> Blocks.LIGHT_BLUE_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_FENCE = registerBlock("light_blue_concrete_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_FENCE_GATE = registerBlock("light_blue_concrete_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_WALL = registerBlock("light_blue_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_BUTTON = registerBlock("light_blue_concrete_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_PRESSURE_PLATE = registerBlock("light_blue_concrete_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_TRAPDOOR = registerBlock("light_blue_concrete_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_DOOR = registerBlock("light_blue_concrete_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs",
            () -> new StairBlock(
                () -> Blocks.YELLOW_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> YELLOW_CONCRETE_FENCE = registerBlock("yellow_concrete_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> YELLOW_CONCRETE_FENCE_GATE = registerBlock("yellow_concrete_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> YELLOW_CONCRETE_WALL = registerBlock("yellow_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> YELLOW_CONCRETE_BUTTON = registerBlock("yellow_concrete_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> YELLOW_CONCRETE_PRESSURE_PLATE = registerBlock("yellow_concrete_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> YELLOW_CONCRETE_TRAPDOOR = registerBlock("yellow_concrete_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> YELLOW_CONCRETE_DOOR = registerBlock("yellow_concrete_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs",
            () -> new StairBlock(
                () -> Blocks.LIME_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIME_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIME_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIME_CONCRETE_FENCE = registerBlock("lime_concrete_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.LIME_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIME_CONCRETE_FENCE_GATE = registerBlock("lime_concrete_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.LIME_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIME_CONCRETE_WALL = registerBlock("lime_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIME_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIME_CONCRETE_BUTTON = registerBlock("lime_concrete_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.LIME_CONCRETE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIME_CONCRETE_PRESSURE_PLATE = registerBlock("lime_concrete_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.LIME_CONCRETE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> LIME_CONCRETE_TRAPDOOR = registerBlock("lime_concrete_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.LIME_CONCRETE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> LIME_CONCRETE_DOOR = registerBlock("lime_concrete_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.LIME_CONCRETE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs",
            () -> new StairBlock(
                () -> Blocks.PINK_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PINK_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PINK_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PINK_CONCRETE_FENCE = registerBlock("pink_concrete_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.PINK_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PINK_CONCRETE_FENCE_GATE = registerBlock("pink_concrete_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.PINK_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PINK_CONCRETE_WALL = registerBlock("pink_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PINK_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PINK_CONCRETE_BUTTON = registerBlock("pink_concrete_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.PINK_CONCRETE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PINK_CONCRETE_PRESSURE_PLATE = registerBlock("pink_concrete_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.PINK_CONCRETE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> PINK_CONCRETE_TRAPDOOR = registerBlock("pink_concrete_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.PINK_CONCRETE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> PINK_CONCRETE_DOOR = registerBlock("pink_concrete_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.PINK_CONCRETE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs",
            () -> new StairBlock(
                () -> Blocks.GRAY_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GRAY_CONCRETE_FENCE = registerBlock("gray_concrete_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GRAY_CONCRETE_FENCE_GATE = registerBlock("gray_concrete_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GRAY_CONCRETE_WALL = registerBlock("gray_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GRAY_CONCRETE_BUTTON = registerBlock("gray_concrete_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GRAY_CONCRETE_PRESSURE_PLATE = registerBlock("gray_concrete_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> GRAY_CONCRETE_TRAPDOOR = registerBlock("gray_concrete_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> GRAY_CONCRETE_DOOR = registerBlock("gray_concrete_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs",
            () -> new StairBlock(
                () -> Blocks.LIGHT_GRAY_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_FENCE = registerBlock("light_gray_concrete_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_FENCE_GATE = registerBlock("light_gray_concrete_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_WALL = registerBlock("light_gray_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_BUTTON = registerBlock("light_gray_concrete_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_PRESSURE_PLATE = registerBlock("light_gray_concrete_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_TRAPDOOR = registerBlock("light_gray_concrete_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_DOOR = registerBlock("light_gray_concrete_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs",
            () -> new StairBlock(
                () -> Blocks.CYAN_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CYAN_CONCRETE_FENCE = registerBlock("cyan_concrete_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CYAN_CONCRETE_FENCE_GATE = registerBlock("cyan_concrete_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CYAN_CONCRETE_WALL = registerBlock("cyan_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CYAN_CONCRETE_BUTTON = registerBlock("cyan_concrete_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CYAN_CONCRETE_PRESSURE_PLATE = registerBlock("cyan_concrete_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> CYAN_CONCRETE_TRAPDOOR = registerBlock("cyan_concrete_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> CYAN_CONCRETE_DOOR = registerBlock("cyan_concrete_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs",
            () -> new StairBlock(
                () -> Blocks.PURPLE_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PURPLE_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PURPLE_CONCRETE_FENCE = registerBlock("purple_concrete_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PURPLE_CONCRETE_FENCE_GATE = registerBlock("purple_concrete_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PURPLE_CONCRETE_WALL = registerBlock("purple_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PURPLE_CONCRETE_BUTTON = registerBlock("purple_concrete_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_CONCRETE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PURPLE_CONCRETE_PRESSURE_PLATE = registerBlock("purple_concrete_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.PURPLE_CONCRETE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> PURPLE_CONCRETE_TRAPDOOR = registerBlock("purple_concrete_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_CONCRETE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> PURPLE_CONCRETE_DOOR = registerBlock("purple_concrete_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_CONCRETE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs",
            () -> new StairBlock(
                () -> Blocks.BLUE_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLUE_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLUE_CONCRETE_FENCE = registerBlock("blue_concrete_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLUE_CONCRETE_FENCE_GATE = registerBlock("blue_concrete_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLUE_CONCRETE_WALL = registerBlock("blue_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLUE_CONCRETE_BUTTON = registerBlock("blue_concrete_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_CONCRETE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLUE_CONCRETE_PRESSURE_PLATE = registerBlock("blue_concrete_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.BLUE_CONCRETE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> BLUE_CONCRETE_TRAPDOOR = registerBlock("blue_concrete_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_CONCRETE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> BLUE_CONCRETE_DOOR = registerBlock("blue_concrete_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_CONCRETE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs",
            () -> new StairBlock(
                () -> Blocks.BROWN_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BROWN_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BROWN_CONCRETE_FENCE = registerBlock("brown_concrete_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BROWN_CONCRETE_FENCE_GATE = registerBlock("brown_concrete_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BROWN_CONCRETE_WALL = registerBlock("brown_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BROWN_CONCRETE_BUTTON = registerBlock("brown_concrete_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_CONCRETE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BROWN_CONCRETE_PRESSURE_PLATE = registerBlock("brown_concrete_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.BROWN_CONCRETE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> BROWN_CONCRETE_TRAPDOOR = registerBlock("brown_concrete_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_CONCRETE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> BROWN_CONCRETE_DOOR = registerBlock("brown_concrete_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_CONCRETE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs",
            () -> new StairBlock(
                () -> Blocks.GREEN_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GREEN_CONCRETE_FENCE = registerBlock("green_concrete_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GREEN_CONCRETE_FENCE_GATE = registerBlock("green_concrete_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GREEN_CONCRETE_WALL = registerBlock("green_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GREEN_CONCRETE_BUTTON = registerBlock("green_concrete_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GREEN_CONCRETE_PRESSURE_PLATE = registerBlock("green_concrete_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> GREEN_CONCRETE_TRAPDOOR = registerBlock("green_concrete_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> GREEN_CONCRETE_DOOR = registerBlock("green_concrete_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs",
            () -> new StairBlock(
                () -> Blocks.RED_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.RED_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RED_CONCRETE_FENCE = registerBlock("red_concrete_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.RED_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RED_CONCRETE_FENCE_GATE = registerBlock("red_concrete_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.RED_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RED_CONCRETE_WALL = registerBlock("red_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.RED_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RED_CONCRETE_BUTTON = registerBlock("red_concrete_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.RED_CONCRETE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RED_CONCRETE_PRESSURE_PLATE = registerBlock("red_concrete_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.RED_CONCRETE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> RED_CONCRETE_TRAPDOOR = registerBlock("red_concrete_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.RED_CONCRETE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> RED_CONCRETE_DOOR = registerBlock("red_concrete_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.RED_CONCRETE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs",
            () -> new StairBlock(
                () -> Blocks.BLACK_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLACK_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLACK_CONCRETE_FENCE = registerBlock("black_concrete_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLACK_CONCRETE_FENCE_GATE = registerBlock("black_concrete_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLACK_CONCRETE_WALL = registerBlock("black_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_CONCRETE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLACK_CONCRETE_BUTTON = registerBlock("black_concrete_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_CONCRETE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLACK_CONCRETE_PRESSURE_PLATE = registerBlock("black_concrete_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.BLACK_CONCRETE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> BLACK_CONCRETE_TRAPDOOR = registerBlock("black_concrete_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_CONCRETE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> BLACK_CONCRETE_DOOR = registerBlock("black_concrete_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_CONCRETE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> HONEYCOMB_BLOCK_STAIRS = registerBlock("honeycomb_block_stairs",
            () -> new StairBlock(
                () -> Blocks.HONEYCOMB_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.HONEYCOMB_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> HONEYCOMB_BLOCK_SLAB = registerBlock("honeycomb_block_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.HONEYCOMB_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> HONEYCOMB_BLOCK_FENCE = registerBlock("honeycomb_block_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.HONEYCOMB_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> HONEYCOMB_BLOCK_FENCE_GATE = registerBlock("honeycomb_block_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.HONEYCOMB_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> HONEYCOMB_BLOCK_WALL = registerBlock("honeycomb_block_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.HONEYCOMB_BLOCK)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> HONEYCOMB_BLOCK_BUTTON = registerBlock("honeycomb_block_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.HONEYCOMB_BLOCK).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> HONEYCOMB_BLOCK_PRESSURE_PLATE = registerBlock("honeycomb_block_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.HONEYCOMB_BLOCK)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> HONEYCOMB_BLOCK_TRAPDOOR = registerBlock("honeycomb_block_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.HONEYCOMB_BLOCK)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> HONEYCOMB_BLOCK_DOOR = registerBlock("honeycomb_block_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.HONEYCOMB_BLOCK)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> CRYING_OBSIDIAN_STAIRS = registerBlock("crying_obsidian_stairs",
            () -> new StairBlock(
                () -> Blocks.CRYING_OBSIDIAN.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRYING_OBSIDIAN)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CRYING_OBSIDIAN_SLAB = registerBlock("crying_obsidian_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CRYING_OBSIDIAN)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CRYING_OBSIDIAN_FENCE = registerBlock("crying_obsidian_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.CRYING_OBSIDIAN)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CRYING_OBSIDIAN_FENCE_GATE = registerBlock("crying_obsidian_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.CRYING_OBSIDIAN)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CRYING_OBSIDIAN_WALL = registerBlock("crying_obsidian_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CRYING_OBSIDIAN)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CRYING_OBSIDIAN_BUTTON = registerBlock("crying_obsidian_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.CRYING_OBSIDIAN).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CRYING_OBSIDIAN_PRESSURE_PLATE = registerBlock("crying_obsidian_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.CRYING_OBSIDIAN)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> CRYING_OBSIDIAN_TRAPDOOR = registerBlock("crying_obsidian_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.CRYING_OBSIDIAN)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> CRYING_OBSIDIAN_DOOR = registerBlock("crying_obsidian_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.CRYING_OBSIDIAN)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> BLACKSTONE_STAIRS = registerBlock("blackstone_stairs",
            () -> new StairBlock(
                () -> Blocks.BLACKSTONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLACKSTONE_SLAB = registerBlock("blackstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLACKSTONE_FENCE = registerBlock("blackstone_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLACKSTONE_FENCE_GATE = registerBlock("blackstone_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLACKSTONE_WALL = registerBlock("blackstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLACKSTONE_BUTTON = registerBlock("blackstone_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLACKSTONE_PRESSURE_PLATE = registerBlock("blackstone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> BLACKSTONE_TRAPDOOR = registerBlock("blackstone_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> BLACKSTONE_DOOR = registerBlock("blackstone_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> GILDED_BLACKSTONE_STAIRS = registerBlock("gilded_blackstone_stairs",
            () -> new StairBlock(
                () -> Blocks.GILDED_BLACKSTONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GILDED_BLACKSTONE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GILDED_BLACKSTONE_SLAB = registerBlock("gilded_blackstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GILDED_BLACKSTONE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GILDED_BLACKSTONE_FENCE = registerBlock("gilded_blackstone_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.GILDED_BLACKSTONE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GILDED_BLACKSTONE_FENCE_GATE = registerBlock("gilded_blackstone_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.GILDED_BLACKSTONE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GILDED_BLACKSTONE_WALL = registerBlock("gilded_blackstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GILDED_BLACKSTONE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GILDED_BLACKSTONE_BUTTON = registerBlock("gilded_blackstone_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.GILDED_BLACKSTONE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GILDED_BLACKSTONE_PRESSURE_PLATE = registerBlock("gilded_blackstone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.GILDED_BLACKSTONE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> GILDED_BLACKSTONE_TRAPDOOR = registerBlock("gilded_blackstone_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.GILDED_BLACKSTONE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> GILDED_BLACKSTONE_DOOR = registerBlock("gilded_blackstone_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.GILDED_BLACKSTONE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> POLISHED_BLACKSTONE_STAIRS = registerBlock("polished_blackstone_stairs",
            () -> new StairBlock(
                () -> Blocks.POLISHED_BLACKSTONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> POLISHED_BLACKSTONE_SLAB = registerBlock("polished_blackstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> POLISHED_BLACKSTONE_FENCE = registerBlock("polished_blackstone_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> POLISHED_BLACKSTONE_FENCE_GATE = registerBlock("polished_blackstone_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> POLISHED_BLACKSTONE_WALL = registerBlock("polished_blackstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> POLISHED_BLACKSTONE_BUTTON = registerBlock("polished_blackstone_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> POLISHED_BLACKSTONE_PRESSURE_PLATE = registerBlock("polished_blackstone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> POLISHED_BLACKSTONE_TRAPDOOR = registerBlock("polished_blackstone_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> POLISHED_BLACKSTONE_DOOR = registerBlock("polished_blackstone_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> CHISELED_POLISHED_BLACKSTONE_STAIRS = registerBlock("chiseled_polished_blackstone_stairs",
            () -> new StairBlock(
                () -> Blocks.CHISELED_POLISHED_BLACKSTONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CHISELED_POLISHED_BLACKSTONE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CHISELED_POLISHED_BLACKSTONE_SLAB = registerBlock("chiseled_polished_blackstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_POLISHED_BLACKSTONE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CHISELED_POLISHED_BLACKSTONE_FENCE = registerBlock("chiseled_polished_blackstone_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_POLISHED_BLACKSTONE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CHISELED_POLISHED_BLACKSTONE_FENCE_GATE = registerBlock("chiseled_polished_blackstone_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_POLISHED_BLACKSTONE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CHISELED_POLISHED_BLACKSTONE_WALL = registerBlock("chiseled_polished_blackstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_POLISHED_BLACKSTONE)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CHISELED_POLISHED_BLACKSTONE_BUTTON = registerBlock("chiseled_polished_blackstone_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_POLISHED_BLACKSTONE).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CHISELED_POLISHED_BLACKSTONE_PRESSURE_PLATE = registerBlock("chiseled_polished_blackstone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.CHISELED_POLISHED_BLACKSTONE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> CHISELED_POLISHED_BLACKSTONE_TRAPDOOR = registerBlock("chiseled_polished_blackstone_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_POLISHED_BLACKSTONE)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> CHISELED_POLISHED_BLACKSTONE_DOOR = registerBlock("chiseled_polished_blackstone_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_POLISHED_BLACKSTONE)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICKS_STAIRS = registerBlock("polished_blackstone_bricks_stairs",
            () -> new StairBlock(
                () -> Blocks.POLISHED_BLACKSTONE_BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICKS_SLAB = registerBlock("polished_blackstone_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICKS_FENCE = registerBlock("polished_blackstone_bricks_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICKS_FENCE_GATE = registerBlock("polished_blackstone_bricks_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICKS_WALL = registerBlock("polished_blackstone_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICKS_BUTTON = registerBlock("polished_blackstone_bricks_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICKS).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICKS_PRESSURE_PLATE = registerBlock("polished_blackstone_bricks_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICKS_TRAPDOOR = registerBlock("polished_blackstone_bricks_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICKS_DOOR = registerBlock("polished_blackstone_bricks_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICKS_STAIRS = registerBlock("cracked_polished_blackstone_bricks_stairs",
            () -> new StairBlock(
                () -> Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICKS_SLAB = registerBlock("cracked_polished_blackstone_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICKS_FENCE = registerBlock("cracked_polished_blackstone_bricks_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICKS_FENCE_GATE = registerBlock("cracked_polished_blackstone_bricks_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICKS_WALL = registerBlock("cracked_polished_blackstone_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICKS_BUTTON = registerBlock("cracked_polished_blackstone_bricks_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICKS_PRESSURE_PLATE = registerBlock("cracked_polished_blackstone_bricks_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICKS_TRAPDOOR = registerBlock("cracked_polished_blackstone_bricks_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICKS_DOOR = registerBlock("cracked_polished_blackstone_bricks_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> GLASS_STAIRS = registerBlock("glass_stairs",
            () -> new StairBlock(
                () -> Blocks.GLASS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GLASS_SLAB = registerBlock("glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GLASS_FENCE = registerBlock("glass_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GLASS_FENCE_GATE = registerBlock("glass_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GLASS_WALL = registerBlock("glass_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GLASS_BUTTON = registerBlock("glass_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GLASS_PRESSURE_PLATE = registerBlock("glass_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.GLASS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> GLASS_TRAPDOOR = registerBlock("glass_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> GLASS_DOOR = registerBlock("glass_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> TINTED_GLASS_STAIRS = registerBlock("tinted_glass_stairs",
            () -> new StairBlock(
                () -> Blocks.TINTED_GLASS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.TINTED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> TINTED_GLASS_SLAB = registerBlock("tinted_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.TINTED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> TINTED_GLASS_FENCE = registerBlock("tinted_glass_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.TINTED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> TINTED_GLASS_FENCE_GATE = registerBlock("tinted_glass_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.TINTED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> TINTED_GLASS_WALL = registerBlock("tinted_glass_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.TINTED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> TINTED_GLASS_BUTTON = registerBlock("tinted_glass_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.TINTED_GLASS).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> TINTED_GLASS_PRESSURE_PLATE = registerBlock("tinted_glass_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.TINTED_GLASS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> TINTED_GLASS_TRAPDOOR = registerBlock("tinted_glass_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.TINTED_GLASS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> TINTED_GLASS_DOOR = registerBlock("tinted_glass_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.TINTED_GLASS)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> WHITE_STAINED_GLASS_STAIRS = registerBlock("white_stained_glass_stairs",
            () -> new StairBlock(
                () -> Blocks.WHITE_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WHITE_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> WHITE_STAINED_GLASS_SLAB = registerBlock("white_stained_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> WHITE_STAINED_GLASS_FENCE = registerBlock("white_stained_glass_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> WHITE_STAINED_GLASS_FENCE_GATE = registerBlock("white_stained_glass_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> WHITE_STAINED_GLASS_WALL = registerBlock("white_stained_glass_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> WHITE_STAINED_GLASS_BUTTON = registerBlock("white_stained_glass_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_STAINED_GLASS).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> WHITE_STAINED_GLASS_PRESSURE_PLATE = registerBlock("white_stained_glass_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.WHITE_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> WHITE_STAINED_GLASS_TRAPDOOR = registerBlock("white_stained_glass_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> WHITE_STAINED_GLASS_DOOR = registerBlock("white_stained_glass_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> ORANGE_STAINED_GLASS_STAIRS = registerBlock("orange_stained_glass_stairs",
            () -> new StairBlock(
                () -> Blocks.ORANGE_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ORANGE_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> ORANGE_STAINED_GLASS_SLAB = registerBlock("orange_stained_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> ORANGE_STAINED_GLASS_FENCE = registerBlock("orange_stained_glass_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> ORANGE_STAINED_GLASS_FENCE_GATE = registerBlock("orange_stained_glass_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> ORANGE_STAINED_GLASS_WALL = registerBlock("orange_stained_glass_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> ORANGE_STAINED_GLASS_BUTTON = registerBlock("orange_stained_glass_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_STAINED_GLASS).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> ORANGE_STAINED_GLASS_PRESSURE_PLATE = registerBlock("orange_stained_glass_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.ORANGE_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> ORANGE_STAINED_GLASS_TRAPDOOR = registerBlock("orange_stained_glass_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> ORANGE_STAINED_GLASS_DOOR = registerBlock("orange_stained_glass_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> MAGENTA_STAINED_GLASS_STAIRS = registerBlock("magenta_stained_glass_stairs",
            () -> new StairBlock(
                () -> Blocks.MAGENTA_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.MAGENTA_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MAGENTA_STAINED_GLASS_SLAB = registerBlock("magenta_stained_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MAGENTA_STAINED_GLASS_FENCE = registerBlock("magenta_stained_glass_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MAGENTA_STAINED_GLASS_FENCE_GATE = registerBlock("magenta_stained_glass_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MAGENTA_STAINED_GLASS_WALL = registerBlock("magenta_stained_glass_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MAGENTA_STAINED_GLASS_BUTTON = registerBlock("magenta_stained_glass_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_STAINED_GLASS).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> MAGENTA_STAINED_GLASS_PRESSURE_PLATE = registerBlock("magenta_stained_glass_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.MAGENTA_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> MAGENTA_STAINED_GLASS_TRAPDOOR = registerBlock("magenta_stained_glass_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> MAGENTA_STAINED_GLASS_DOOR = registerBlock("magenta_stained_glass_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> LIGHT_BLUE_STAINED_GLASS_STAIRS = registerBlock("light_blue_stained_glass_stairs",
            () -> new StairBlock(
                () -> Blocks.LIGHT_BLUE_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_BLUE_STAINED_GLASS_SLAB = registerBlock("light_blue_stained_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_BLUE_STAINED_GLASS_FENCE = registerBlock("light_blue_stained_glass_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_BLUE_STAINED_GLASS_FENCE_GATE = registerBlock("light_blue_stained_glass_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_BLUE_STAINED_GLASS_WALL = registerBlock("light_blue_stained_glass_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_BLUE_STAINED_GLASS_BUTTON = registerBlock("light_blue_stained_glass_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_STAINED_GLASS).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_BLUE_STAINED_GLASS_PRESSURE_PLATE = registerBlock("light_blue_stained_glass_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> LIGHT_BLUE_STAINED_GLASS_TRAPDOOR = registerBlock("light_blue_stained_glass_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> LIGHT_BLUE_STAINED_GLASS_DOOR = registerBlock("light_blue_stained_glass_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> YELLOW_STAINED_GLASS_STAIRS = registerBlock("yellow_stained_glass_stairs",
            () -> new StairBlock(
                () -> Blocks.YELLOW_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.YELLOW_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> YELLOW_STAINED_GLASS_SLAB = registerBlock("yellow_stained_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> YELLOW_STAINED_GLASS_FENCE = registerBlock("yellow_stained_glass_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> YELLOW_STAINED_GLASS_FENCE_GATE = registerBlock("yellow_stained_glass_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> YELLOW_STAINED_GLASS_WALL = registerBlock("yellow_stained_glass_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> YELLOW_STAINED_GLASS_BUTTON = registerBlock("yellow_stained_glass_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_STAINED_GLASS).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> YELLOW_STAINED_GLASS_PRESSURE_PLATE = registerBlock("yellow_stained_glass_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.YELLOW_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> YELLOW_STAINED_GLASS_TRAPDOOR = registerBlock("yellow_stained_glass_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> YELLOW_STAINED_GLASS_DOOR = registerBlock("yellow_stained_glass_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> LIME_STAINED_GLASS_STAIRS = registerBlock("lime_stained_glass_stairs",
            () -> new StairBlock(
                () -> Blocks.LIME_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIME_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIME_STAINED_GLASS_SLAB = registerBlock("lime_stained_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIME_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIME_STAINED_GLASS_FENCE = registerBlock("lime_stained_glass_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.LIME_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIME_STAINED_GLASS_FENCE_GATE = registerBlock("lime_stained_glass_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.LIME_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIME_STAINED_GLASS_WALL = registerBlock("lime_stained_glass_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIME_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIME_STAINED_GLASS_BUTTON = registerBlock("lime_stained_glass_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.LIME_STAINED_GLASS).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIME_STAINED_GLASS_PRESSURE_PLATE = registerBlock("lime_stained_glass_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.LIME_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> LIME_STAINED_GLASS_TRAPDOOR = registerBlock("lime_stained_glass_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.LIME_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> LIME_STAINED_GLASS_DOOR = registerBlock("lime_stained_glass_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.LIME_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> PINK_STAINED_GLASS_STAIRS = registerBlock("pink_stained_glass_stairs",
            () -> new StairBlock(
                () -> Blocks.PINK_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PINK_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PINK_STAINED_GLASS_SLAB = registerBlock("pink_stained_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PINK_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PINK_STAINED_GLASS_FENCE = registerBlock("pink_stained_glass_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.PINK_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PINK_STAINED_GLASS_FENCE_GATE = registerBlock("pink_stained_glass_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.PINK_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PINK_STAINED_GLASS_WALL = registerBlock("pink_stained_glass_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PINK_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PINK_STAINED_GLASS_BUTTON = registerBlock("pink_stained_glass_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.PINK_STAINED_GLASS).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PINK_STAINED_GLASS_PRESSURE_PLATE = registerBlock("pink_stained_glass_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.PINK_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> PINK_STAINED_GLASS_TRAPDOOR = registerBlock("pink_stained_glass_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.PINK_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> PINK_STAINED_GLASS_DOOR = registerBlock("pink_stained_glass_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.PINK_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> GRAY_STAINED_GLASS_STAIRS = registerBlock("gray_stained_glass_stairs",
            () -> new StairBlock(
                () -> Blocks.GRAY_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GRAY_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GRAY_STAINED_GLASS_SLAB = registerBlock("gray_stained_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GRAY_STAINED_GLASS_FENCE = registerBlock("gray_stained_glass_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GRAY_STAINED_GLASS_FENCE_GATE = registerBlock("gray_stained_glass_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GRAY_STAINED_GLASS_WALL = registerBlock("gray_stained_glass_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GRAY_STAINED_GLASS_BUTTON = registerBlock("gray_stained_glass_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_STAINED_GLASS).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GRAY_STAINED_GLASS_PRESSURE_PLATE = registerBlock("gray_stained_glass_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.GRAY_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> GRAY_STAINED_GLASS_TRAPDOOR = registerBlock("gray_stained_glass_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> GRAY_STAINED_GLASS_DOOR = registerBlock("gray_stained_glass_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> LIGHT_GRAY_STAINED_GLASS_STAIRS = registerBlock("light_gray_stained_glass_stairs",
            () -> new StairBlock(
                () -> Blocks.LIGHT_GRAY_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_GRAY_STAINED_GLASS_SLAB = registerBlock("light_gray_stained_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_GRAY_STAINED_GLASS_FENCE = registerBlock("light_gray_stained_glass_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_GRAY_STAINED_GLASS_FENCE_GATE = registerBlock("light_gray_stained_glass_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_GRAY_STAINED_GLASS_WALL = registerBlock("light_gray_stained_glass_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_GRAY_STAINED_GLASS_BUTTON = registerBlock("light_gray_stained_glass_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_STAINED_GLASS).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> LIGHT_GRAY_STAINED_GLASS_PRESSURE_PLATE = registerBlock("light_gray_stained_glass_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> LIGHT_GRAY_STAINED_GLASS_TRAPDOOR = registerBlock("light_gray_stained_glass_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> LIGHT_GRAY_STAINED_GLASS_DOOR = registerBlock("light_gray_stained_glass_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> CYAN_STAINED_GLASS_STAIRS = registerBlock("cyan_stained_glass_stairs",
            () -> new StairBlock(
                () -> Blocks.CYAN_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CYAN_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CYAN_STAINED_GLASS_SLAB = registerBlock("cyan_stained_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CYAN_STAINED_GLASS_FENCE = registerBlock("cyan_stained_glass_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CYAN_STAINED_GLASS_FENCE_GATE = registerBlock("cyan_stained_glass_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CYAN_STAINED_GLASS_WALL = registerBlock("cyan_stained_glass_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CYAN_STAINED_GLASS_BUTTON = registerBlock("cyan_stained_glass_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_STAINED_GLASS).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> CYAN_STAINED_GLASS_PRESSURE_PLATE = registerBlock("cyan_stained_glass_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.CYAN_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> CYAN_STAINED_GLASS_TRAPDOOR = registerBlock("cyan_stained_glass_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> CYAN_STAINED_GLASS_DOOR = registerBlock("cyan_stained_glass_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> PURPLE_STAINED_GLASS_STAIRS = registerBlock("purple_stained_glass_stairs",
            () -> new StairBlock(
                () -> Blocks.PURPLE_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PURPLE_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PURPLE_STAINED_GLASS_SLAB = registerBlock("purple_stained_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PURPLE_STAINED_GLASS_FENCE = registerBlock("purple_stained_glass_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PURPLE_STAINED_GLASS_FENCE_GATE = registerBlock("purple_stained_glass_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PURPLE_STAINED_GLASS_WALL = registerBlock("purple_stained_glass_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PURPLE_STAINED_GLASS_BUTTON = registerBlock("purple_stained_glass_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_STAINED_GLASS).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> PURPLE_STAINED_GLASS_PRESSURE_PLATE = registerBlock("purple_stained_glass_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.PURPLE_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> PURPLE_STAINED_GLASS_TRAPDOOR = registerBlock("purple_stained_glass_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> PURPLE_STAINED_GLASS_DOOR = registerBlock("purple_stained_glass_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> BLUE_STAINED_GLASS_STAIRS = registerBlock("blue_stained_glass_stairs",
            () -> new StairBlock(
                () -> Blocks.BLUE_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLUE_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLUE_STAINED_GLASS_SLAB = registerBlock("blue_stained_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLUE_STAINED_GLASS_FENCE = registerBlock("blue_stained_glass_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLUE_STAINED_GLASS_FENCE_GATE = registerBlock("blue_stained_glass_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLUE_STAINED_GLASS_WALL = registerBlock("blue_stained_glass_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLUE_STAINED_GLASS_BUTTON = registerBlock("blue_stained_glass_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_STAINED_GLASS).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLUE_STAINED_GLASS_PRESSURE_PLATE = registerBlock("blue_stained_glass_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.BLUE_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> BLUE_STAINED_GLASS_TRAPDOOR = registerBlock("blue_stained_glass_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> BLUE_STAINED_GLASS_DOOR = registerBlock("blue_stained_glass_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> BROWN_STAINED_GLASS_STAIRS = registerBlock("brown_stained_glass_stairs",
            () -> new StairBlock(
                () -> Blocks.BROWN_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BROWN_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BROWN_STAINED_GLASS_SLAB = registerBlock("brown_stained_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BROWN_STAINED_GLASS_FENCE = registerBlock("brown_stained_glass_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BROWN_STAINED_GLASS_FENCE_GATE = registerBlock("brown_stained_glass_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BROWN_STAINED_GLASS_WALL = registerBlock("brown_stained_glass_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BROWN_STAINED_GLASS_BUTTON = registerBlock("brown_stained_glass_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_STAINED_GLASS).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BROWN_STAINED_GLASS_PRESSURE_PLATE = registerBlock("brown_stained_glass_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.BROWN_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> BROWN_STAINED_GLASS_TRAPDOOR = registerBlock("brown_stained_glass_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> BROWN_STAINED_GLASS_DOOR = registerBlock("brown_stained_glass_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> GREEN_STAINED_GLASS_STAIRS = registerBlock("green_stained_glass_stairs",
            () -> new StairBlock(
                () -> Blocks.GREEN_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GREEN_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GREEN_STAINED_GLASS_SLAB = registerBlock("green_stained_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GREEN_STAINED_GLASS_FENCE = registerBlock("green_stained_glass_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GREEN_STAINED_GLASS_FENCE_GATE = registerBlock("green_stained_glass_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GREEN_STAINED_GLASS_WALL = registerBlock("green_stained_glass_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GREEN_STAINED_GLASS_BUTTON = registerBlock("green_stained_glass_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_STAINED_GLASS).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> GREEN_STAINED_GLASS_PRESSURE_PLATE = registerBlock("green_stained_glass_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.GREEN_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> GREEN_STAINED_GLASS_TRAPDOOR = registerBlock("green_stained_glass_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> GREEN_STAINED_GLASS_DOOR = registerBlock("green_stained_glass_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> RED_STAINED_GLASS_STAIRS = registerBlock("red_stained_glass_stairs",
            () -> new StairBlock(
                () -> Blocks.RED_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.RED_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RED_STAINED_GLASS_SLAB = registerBlock("red_stained_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RED_STAINED_GLASS_FENCE = registerBlock("red_stained_glass_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.RED_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RED_STAINED_GLASS_FENCE_GATE = registerBlock("red_stained_glass_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.RED_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RED_STAINED_GLASS_WALL = registerBlock("red_stained_glass_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.RED_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RED_STAINED_GLASS_BUTTON = registerBlock("red_stained_glass_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.RED_STAINED_GLASS).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> RED_STAINED_GLASS_PRESSURE_PLATE = registerBlock("red_stained_glass_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.RED_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> RED_STAINED_GLASS_TRAPDOOR = registerBlock("red_stained_glass_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.RED_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> RED_STAINED_GLASS_DOOR = registerBlock("red_stained_glass_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.RED_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> BLACK_STAINED_GLASS_STAIRS = registerBlock("black_stained_glass_stairs",
            () -> new StairBlock(
                () -> Blocks.BLACK_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLACK_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLACK_STAINED_GLASS_SLAB = registerBlock("black_stained_glass_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLACK_STAINED_GLASS_FENCE = registerBlock("black_stained_glass_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLACK_STAINED_GLASS_FENCE_GATE = registerBlock("black_stained_glass_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLACK_STAINED_GLASS_WALL = registerBlock("black_stained_glass_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLACK_STAINED_GLASS_BUTTON = registerBlock("black_stained_glass_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_STAINED_GLASS).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> BLACK_STAINED_GLASS_PRESSURE_PLATE = registerBlock("black_stained_glass_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.BLACK_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> BLACK_STAINED_GLASS_TRAPDOOR = registerBlock("black_stained_glass_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> BLACK_STAINED_GLASS_DOOR = registerBlock("black_stained_glass_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_STAINED_GLASS)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> FLOWERING_AZALEA_LEAVES_STAIRS = registerBlock("flowering_azalea_leaves_stairs",
            () -> new StairBlock(
                () -> Blocks.FLOWERING_AZALEA_LEAVES.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.FLOWERING_AZALEA_LEAVES)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> FLOWERING_AZALEA_LEAVES_SLAB = registerBlock("flowering_azalea_leaves_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.FLOWERING_AZALEA_LEAVES)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> FLOWERING_AZALEA_LEAVES_FENCE = registerBlock("flowering_azalea_leaves_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.FLOWERING_AZALEA_LEAVES)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> FLOWERING_AZALEA_LEAVES_FENCE_GATE = registerBlock("flowering_azalea_leaves_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.FLOWERING_AZALEA_LEAVES)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> FLOWERING_AZALEA_LEAVES_WALL = registerBlock("flowering_azalea_leaves_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.FLOWERING_AZALEA_LEAVES)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> FLOWERING_AZALEA_LEAVES_BUTTON = registerBlock("flowering_azalea_leaves_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.FLOWERING_AZALEA_LEAVES).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> FLOWERING_AZALEA_LEAVES_PRESSURE_PLATE = registerBlock("flowering_azalea_leaves_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.FLOWERING_AZALEA_LEAVES)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> FLOWERING_AZALEA_LEAVES_TRAPDOOR = registerBlock("flowering_azalea_leaves_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.FLOWERING_AZALEA_LEAVES)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> FLOWERING_AZALEA_LEAVES_DOOR = registerBlock("flowering_azalea_leaves_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.FLOWERING_AZALEA_LEAVES)), ModCreativeModeTab.POD_TAB);

        public static final RegistryObject<Block> AZALEA_LEAVES_STAIRS = registerBlock("azalea_leaves_stairs",
            () -> new StairBlock(
                () -> Blocks.AZALEA_LEAVES.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.AZALEA_LEAVES)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> AZALEA_LEAVES_SLAB = registerBlock("azalea_leaves_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.AZALEA_LEAVES)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> AZALEA_LEAVES_FENCE = registerBlock("azalea_leaves_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.AZALEA_LEAVES)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> AZALEA_LEAVES_FENCE_GATE = registerBlock("azalea_leaves_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.AZALEA_LEAVES)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> AZALEA_LEAVES_WALL = registerBlock("azalea_leaves_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.AZALEA_LEAVES)), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> AZALEA_LEAVES_BUTTON = registerBlock("azalea_leaves_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.AZALEA_LEAVES).noCollission()), ModCreativeModeTab.POD_TAB);
        public static final RegistryObject<Block> AZALEA_LEAVES_PRESSURE_PLATE = registerBlock("azalea_leaves_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.AZALEA_LEAVES)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> AZALEA_LEAVES_TRAPDOOR = registerBlock("azalea_leaves_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.AZALEA_LEAVES)), ModCreativeModeTab.POD_TAB);
            public static final RegistryObject<Block> AZALEA_LEAVES_DOOR = registerBlock("azalea_leaves_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.AZALEA_LEAVES)), ModCreativeModeTab.POD_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}