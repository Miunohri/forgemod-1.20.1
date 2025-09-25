package net.miunohri.enhancementmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
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
        add("enhancement_stone_from_creeper", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.fromNamespaceAndPath("minecraft", "entities/creeper")).build(), LootItemRandomChanceCondition.randomChance(0.2f).build()}, ModItems.ENHANCEMENT_STONE.get()));

        add("enhancement_stone_from_spider", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.fromNamespaceAndPath("minecraft","entities/spider")).build(), LootItemRandomChanceCondition.randomChance(0.2f).build()}, ModItems.ENHANCEMENT_STONE.get()));

        add("enhancement_stone_from_witch", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.fromNamespaceAndPath("minecraft","entities/witch")).build(), LootItemRandomChanceCondition.randomChance(0.2f).build()}, ModItems.ENHANCEMENT_STONE.get()));

        add("enhancement_stone_from_zombie", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.fromNamespaceAndPath("minecraft","entities/zombie")).build(), LootItemRandomChanceCondition.randomChance(0.2f).build()}, ModItems.ENHANCEMENT_STONE.get()));

        add("enhancement_stone_from_zombie_villager", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.fromNamespaceAndPath("minecraft","entities/zombie_villager")).build(), LootItemRandomChanceCondition.randomChance(0.2f).build()}, ModItems.ENHANCEMENT_STONE.get()));

        add("enhancement_stone_from_phantom", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.fromNamespaceAndPath("minecraft","entities/phantom")).build(), LootItemRandomChanceCondition.randomChance(0.2f).build()}, ModItems.ENHANCEMENT_STONE.get()));

        add("enhancement_stone_from_husk", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.fromNamespaceAndPath("minecraft","entities/husk")).build(), LootItemRandomChanceCondition.randomChance(0.2f).build()}, ModItems.ENHANCEMENT_STONE.get()));

        add("enhancement_stone_from_enderman", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.fromNamespaceAndPath("minecraft","entities/enderman")).build(), LootItemRandomChanceCondition.randomChance(0.2f).build()}, ModItems.ENHANCEMENT_STONE.get()));

        add("enhancement_stone_from_skeleton", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.fromNamespaceAndPath("minecraft","entities/skeleton")).build(), LootItemRandomChanceCondition.randomChance(0.2f).build()}, ModItems.ENHANCEMENT_STONE.get()));

        add("enhancement_stone_from_cave_spider", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.fromNamespaceAndPath("minecraft","entities/cave_spider")).build(), LootItemRandomChanceCondition.randomChance(0.2f).build()}, ModItems.ENHANCEMENT_STONE.get()));

        add("enhancement_stone_from_evoker", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.fromNamespaceAndPath("minecraft","entities/evoker")).build(), LootItemRandomChanceCondition.randomChance(0.2f).build()}, ModItems.ENHANCEMENT_STONE.get()));

        add("enhancement_stone_from_drowned", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.fromNamespaceAndPath("minecraft","entities/drowned")).build(), LootItemRandomChanceCondition.randomChance(0.2f).build()}, ModItems.ENHANCEMENT_STONE.get()));

        add("enhancement_stone_from_ghast", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.fromNamespaceAndPath("minecraft","entities/ghast")).build(), LootItemRandomChanceCondition.randomChance(0.2f).build()}, ModItems.ENHANCEMENT_STONE.get()));

        add("enhancement_stone_from_illusioner", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.fromNamespaceAndPath("minecraft","entities/illusioner")).build(), LootItemRandomChanceCondition.randomChance(0.2f).build()}, ModItems.ENHANCEMENT_STONE.get()));

        add("enhancement_stone_from_vindicator", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.fromNamespaceAndPath("minecraft","entities/vindicator")).build(), LootItemRandomChanceCondition.randomChance(0.2f).build()}, ModItems.ENHANCEMENT_STONE.get()));

        add("enhancement_stone_from_giant", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.fromNamespaceAndPath("minecraft","entities/giant")).build(), LootItemRandomChanceCondition.randomChance(0.2f).build()}, ModItems.ENHANCEMENT_STONE.get()));

        add("enhancement_stone_from_blaze", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.fromNamespaceAndPath("minecraft","entities/blaze")).build(), LootItemRandomChanceCondition.randomChance(0.2f).build()}, ModItems.ENHANCEMENT_STONE.get()));

        add("enhancement_stone_from_elder_guardian", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.fromNamespaceAndPath("minecraft","entities/elder_guardian")).build(), LootItemRandomChanceCondition.randomChance(0.2f).build()}, ModItems.ENHANCEMENT_STONE.get()));

        add("enhancement_stone_from_guardian", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.fromNamespaceAndPath("minecraft","entities/guardian")).build(), LootItemRandomChanceCondition.randomChance(0.2f).build()}, ModItems.ENHANCEMENT_STONE.get()));

        add("enhancement_stone_from_piglin", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.fromNamespaceAndPath("minecraft","entities/piglin")).build(), LootItemRandomChanceCondition.randomChance(0.2f).build()}, ModItems.ENHANCEMENT_STONE.get()));

        add("enhancement_stone_from_piglin_brute", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.fromNamespaceAndPath("minecraft","entities/piglin_brute")).build(), LootItemRandomChanceCondition.randomChance(0.2f).build()}, ModItems.ENHANCEMENT_STONE.get()));

        add("enhancement_stone_from_pillager", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.fromNamespaceAndPath("minecraft","entities/pillager")).build(), LootItemRandomChanceCondition.randomChance(0.2f).build()}, ModItems.ENHANCEMENT_STONE.get()));

        add("enhancement_stone_from_ravager", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.fromNamespaceAndPath("minecraft","entities/ravager")).build(), LootItemRandomChanceCondition.randomChance(0.2f).build()}, ModItems.ENHANCEMENT_STONE.get()));

        add("enhancement_stone_from_shulker", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.fromNamespaceAndPath("minecraft","entities/shulker")).build(), LootItemRandomChanceCondition.randomChance(0.2f).build()}, ModItems.ENHANCEMENT_STONE.get()));

        add("enhancement_stone_from_wither_skeleton", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.fromNamespaceAndPath("minecraft","entities/wither_skeleton")).build(), LootItemRandomChanceCondition.randomChance(0.2f).build()}, ModItems.ENHANCEMENT_STONE.get()));

        add("enhancement_stone_from_wither", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.fromNamespaceAndPath("minecraft","entities/wither")).build(), LootItemRandomChanceCondition.randomChance(0.2f).build()}, ModItems.ENHANCEMENT_STONE.get()));

        add("enhancement_stone_from_zombified_piglin", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.fromNamespaceAndPath("minecraft","entities/zombified_piglin")).build() }, ModItems.ENHANCEMENT_STONE.get()));

    }
}
