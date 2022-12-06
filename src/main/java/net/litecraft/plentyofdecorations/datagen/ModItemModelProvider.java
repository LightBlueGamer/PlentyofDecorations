package net.litecraft.plentyofdecorations.datagen;

import net.litecraft.plentyofdecorations.PlentyOfDecorations;
import net.litecraft.plentyofdecorations.block.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, PlentyOfDecorations.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
    }

    private ItemModelBuilder simpleItem(Item item) {
        return withExistingParent(item.toString(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(PlentyOfDecorations.MOD_ID,"item/" + item.toString()));
    }

    private ItemModelBuilder handeheldItem(Item item) {
        return withExistingParent(item.toString(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(PlentyOfDecorations.MOD_ID,"item/" + item.toString()));
    }
}
