package net.miunohri.enhancementmod.item;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.miunohri.enhancementmod.EnhancementMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EnhancementMod.MOD_ID);

    public static final RegistryObject<Item> ENHANCEMENT_STONE = ITEMS.register("enhancement_stone", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ADV_ENHANCEMENT_STONE = ITEMS.register("adv_enhancement_stone", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ENHANCEMENT_SMITHING_TEMPLATE = ITEMS. register("enhancement_smithing_template", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CLOTH = ITEMS.register("cloth", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CLOTH_HELMET = ITEMS.register("cloth_helmet", () -> new
            ArmorItem(ModArmorMaterials.CLOTH, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> CLOTH_TUNIC = ITEMS.register("cloth_tunic", () -> new
            ArmorItem(ModArmorMaterials.CLOTH, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> CLOTH_LEGGINGS = ITEMS.register("cloth_leggings", () -> new
            ArmorItem(ModArmorMaterials.CLOTH, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> CLOTH_BOOTS = ITEMS.register("cloth_boots", () -> new
            ArmorItem(ModArmorMaterials.CLOTH, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
