package net.fivaflo.flaettcraft.item;

import net.fivaflo.flaettcraft.FlaettCraft;
import net.fivaflo.flaettcraft.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier Vibranium = TierSortingRegistry.registerTier(
            new ForgeTier(5,2100, 10.0F, 5.0F, 25,
                    ModTags.Blocks.Needs_Vibranium_Tool, () -> Ingredient.of(ModItems.Vibranium.get())),
            new ResourceLocation(FlaettCraft.MODID, "vibranium"), List.of(Tiers.NETHERITE), List.of());
}
