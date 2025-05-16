
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ninjagoreforged.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.ninjagoreforged.potion.StunMobEffect;
import net.mcreator.ninjagoreforged.NinjagoReforgedMod;

public class NinjagoReforgedModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, NinjagoReforgedMod.MODID);
	public static final RegistryObject<MobEffect> STUN = REGISTRY.register("stun", () -> new StunMobEffect());
}
