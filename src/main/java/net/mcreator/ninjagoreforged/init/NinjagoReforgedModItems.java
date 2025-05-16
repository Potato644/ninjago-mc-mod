
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ninjagoreforged.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.ninjagoreforged.item.ElementSelectorItem;
import net.mcreator.ninjagoreforged.NinjagoReforgedMod;

public class NinjagoReforgedModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NinjagoReforgedMod.MODID);
	public static final RegistryObject<Item> ELEMENT_SELECTOR = REGISTRY.register("element_selector", () -> new ElementSelectorItem());
	// Start of user code block custom items
	// End of user code block custom items
}
