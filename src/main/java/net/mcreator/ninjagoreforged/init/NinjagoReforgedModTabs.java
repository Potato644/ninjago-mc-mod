
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ninjagoreforged.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.ninjagoreforged.NinjagoReforgedMod;

public class NinjagoReforgedModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NinjagoReforgedMod.MODID);
	public static final RegistryObject<CreativeModeTab> NINJAGO = REGISTRY.register("ninjago",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.ninjago_reforged.ninjago")).icon(() -> new ItemStack(Items.NETHER_STAR)).displayItems((parameters, tabData) -> {
				tabData.accept(NinjagoReforgedModItems.ELEMENT_SELECTOR.get());
			}).build());
}
