package net.miunohri.enhancementmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;
import net.miunohri.enhancementmod.EnhancementMod;
import net.miunohri.enhancementmod.item.ModItems;
import net.miunohri.enhancementmod.loot.AddItemModifier;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, EnhancementMod.MOD_ID);
    }

    @Override
    protected void start() {
        add("enhancement_stone_from_mobs", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/creeper")).build() }, ModItems.ENHANCEMENT_STONE.get()));

        add("enhancement_stone_from_mobs", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/spider")).build() }, ModItems.ENHANCEMENT_STONE.get()));

        add("enhancement_stone_from_mobs", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/witch")).build() }, ModItems.ENHANCEMENT_STONE.get()));

        add("enhancement_stone_from_mobs", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/zombie")).build() }, ModItems.ENHANCEMENT_STONE.get()));

        add("enhancement_stone_from_mobs", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/zombie_villager")).build() }, ModItems.ENHANCEMENT_STONE.get()));

        add("enhancement_stone_from_mobs", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/phantom")).build() }, ModItems.ENHANCEMENT_STONE.get()));

        add("enhancement_stone_from_mobs", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/husk")).build() }, ModItems.ENHANCEMENT_STONE.get()));

        add("enhancement_stone_from_mobs", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/enderman")).build() }, ModItems.ENHANCEMENT_STONE.get()));

        add("enhancement_stone_from_mobs", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/skeleton")).build() }, ModItems.ENHANCEMENT_STONE.get()));

    }
}
