package net.miunohri.enhancementmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.miunohri.enhancementmod.EnhancementMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EnhancementMod.MOD_ID);

    public static final RegistryObject<Item> ENHANCEMENT_STONE = ITEMS.register("enhancement_stone", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ADV_ENHANCEMENT_STONE = ITEMS.register("adv_enhancement_stone", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
