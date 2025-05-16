
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ninjagoreforged.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.ninjagoreforged.world.inventory.ElementSelectionMenu;
import net.mcreator.ninjagoreforged.NinjagoReforgedMod;

public class NinjagoReforgedModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, NinjagoReforgedMod.MODID);
	public static final RegistryObject<MenuType<ElementSelectionMenu>> ELEMENT_SELECTION = REGISTRY.register("element_selection", () -> IForgeMenuType.create(ElementSelectionMenu::new));
}
