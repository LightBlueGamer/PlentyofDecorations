package net.litecraft.plentyofdecorations;

import com.mojang.logging.LogUtils;
import net.litecraft.plentyofdecorations.block.ModBlocks;
import net.litecraft.plentyofdecorations.item.ModItems;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(PlentyOfDecorations.MOD_ID)
public class PlentyOfDecorations {
    public static final String MOD_ID = "plentyofdecorations";
    private static final Logger LOGGER = LogUtils.getLogger();

    // Very Important Comment
    public PlentyOfDecorations() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.GLASS_STAIRS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.GLASS_SLAB.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.GLASS_FENCE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.GLASS_FENCE_GATE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.GLASS_WALL.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.GLASS_BUTTON.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.GLASS_PRESSURE_PLATE.get(), RenderType.translucent());

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TINTED_GLASS_STAIRS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TINTED_GLASS_SLAB.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TINTED_GLASS_FENCE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TINTED_GLASS_FENCE_GATE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TINTED_GLASS_WALL.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TINTED_GLASS_BUTTON.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TINTED_GLASS_PRESSURE_PLATE.get(), RenderType.translucent());

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_STAINED_GLASS_STAIRS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_STAINED_GLASS_SLAB.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_STAINED_GLASS_FENCE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_STAINED_GLASS_FENCE_GATE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_STAINED_GLASS_WALL.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_STAINED_GLASS_BUTTON.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_STAINED_GLASS_PRESSURE_PLATE.get(), RenderType.translucent());

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_STAINED_GLASS_STAIRS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_STAINED_GLASS_SLAB.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_STAINED_GLASS_FENCE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_STAINED_GLASS_FENCE_GATE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_STAINED_GLASS_WALL.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_STAINED_GLASS_BUTTON.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_STAINED_GLASS_PRESSURE_PLATE.get(), RenderType.translucent());

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_STAINED_GLASS_STAIRS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_STAINED_GLASS_SLAB.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_STAINED_GLASS_FENCE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_STAINED_GLASS_FENCE_GATE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_STAINED_GLASS_WALL.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_STAINED_GLASS_BUTTON.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_STAINED_GLASS_PRESSURE_PLATE.get(), RenderType.translucent());

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_STAINED_GLASS_FENCE_GATE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_STAINED_GLASS_WALL.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_STAINED_GLASS_BUTTON.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_STAINED_GLASS_PRESSURE_PLATE.get(), RenderType.translucent());

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_STAINED_GLASS_STAIRS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_STAINED_GLASS_SLAB.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_STAINED_GLASS_FENCE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_STAINED_GLASS_FENCE_GATE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_STAINED_GLASS_WALL.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_STAINED_GLASS_BUTTON.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_STAINED_GLASS_PRESSURE_PLATE.get(), RenderType.translucent());

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIME_STAINED_GLASS_STAIRS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIME_STAINED_GLASS_SLAB.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIME_STAINED_GLASS_FENCE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIME_STAINED_GLASS_FENCE_GATE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIME_STAINED_GLASS_WALL.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIME_STAINED_GLASS_BUTTON.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIME_STAINED_GLASS_PRESSURE_PLATE.get(), RenderType.translucent());

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_STAINED_GLASS_STAIRS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_STAINED_GLASS_SLAB.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_STAINED_GLASS_FENCE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_STAINED_GLASS_FENCE_GATE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_STAINED_GLASS_WALL.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_STAINED_GLASS_BUTTON.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_STAINED_GLASS_PRESSURE_PLATE.get(), RenderType.translucent());

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_STAINED_GLASS_STAIRS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_STAINED_GLASS_SLAB.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_STAINED_GLASS_FENCE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_STAINED_GLASS_FENCE_GATE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_STAINED_GLASS_WALL.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_STAINED_GLASS_BUTTON.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_STAINED_GLASS_PRESSURE_PLATE.get(), RenderType.translucent());

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_STAINED_GLASS_FENCE_GATE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_STAINED_GLASS_WALL.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_STAINED_GLASS_BUTTON.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_STAINED_GLASS_PRESSURE_PLATE.get(), RenderType.translucent());

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_STAINED_GLASS_STAIRS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_STAINED_GLASS_SLAB.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_STAINED_GLASS_FENCE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_STAINED_GLASS_FENCE_GATE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_STAINED_GLASS_WALL.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_STAINED_GLASS_BUTTON.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_STAINED_GLASS_PRESSURE_PLATE.get(), RenderType.translucent());

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_STAINED_GLASS_STAIRS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_STAINED_GLASS_SLAB.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_STAINED_GLASS_FENCE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_STAINED_GLASS_FENCE_GATE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_STAINED_GLASS_WALL.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_STAINED_GLASS_BUTTON.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_STAINED_GLASS_PRESSURE_PLATE.get(), RenderType.translucent());

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_STAINED_GLASS_STAIRS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_STAINED_GLASS_SLAB.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_STAINED_GLASS_FENCE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_STAINED_GLASS_FENCE_GATE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_STAINED_GLASS_WALL.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_STAINED_GLASS_BUTTON.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_STAINED_GLASS_PRESSURE_PLATE.get(), RenderType.translucent());

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BROWN_STAINED_GLASS_STAIRS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BROWN_STAINED_GLASS_SLAB.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BROWN_STAINED_GLASS_FENCE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BROWN_STAINED_GLASS_FENCE_GATE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BROWN_STAINED_GLASS_WALL.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BROWN_STAINED_GLASS_BUTTON.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BROWN_STAINED_GLASS_PRESSURE_PLATE.get(), RenderType.translucent());

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_STAINED_GLASS_STAIRS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_STAINED_GLASS_SLAB.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_STAINED_GLASS_FENCE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_STAINED_GLASS_FENCE_GATE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_STAINED_GLASS_WALL.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_STAINED_GLASS_BUTTON.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_STAINED_GLASS_PRESSURE_PLATE.get(), RenderType.translucent());

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_STAINED_GLASS_STAIRS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_STAINED_GLASS_SLAB.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_STAINED_GLASS_FENCE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_STAINED_GLASS_FENCE_GATE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_STAINED_GLASS_WALL.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_STAINED_GLASS_BUTTON.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_STAINED_GLASS_PRESSURE_PLATE.get(), RenderType.translucent());

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_STAINED_GLASS_STAIRS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_STAINED_GLASS_SLAB.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_STAINED_GLASS_FENCE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_STAINED_GLASS_FENCE_GATE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_STAINED_GLASS_WALL.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_STAINED_GLASS_BUTTON.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_STAINED_GLASS_PRESSURE_PLATE.get(), RenderType.translucent());

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.FLOWERING_AZALEA_LEAVES_STAIRS.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.FLOWERING_AZALEA_LEAVES_SLAB.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.FLOWERING_AZALEA_LEAVES_FENCE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.FLOWERING_AZALEA_LEAVES_FENCE_GATE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.FLOWERING_AZALEA_LEAVES_WALL.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.FLOWERING_AZALEA_LEAVES_BUTTON.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.FLOWERING_AZALEA_LEAVES_PRESSURE_PLATE.get(), RenderType.cutout());

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.AZALEA_LEAVES_STAIRS.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.AZALEA_LEAVES_SLAB.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.AZALEA_LEAVES_FENCE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.AZALEA_LEAVES_FENCE_GATE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.AZALEA_LEAVES_WALL.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.AZALEA_LEAVES_BUTTON.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.AZALEA_LEAVES_PRESSURE_PLATE.get(), RenderType.cutout());

        }
    }
}