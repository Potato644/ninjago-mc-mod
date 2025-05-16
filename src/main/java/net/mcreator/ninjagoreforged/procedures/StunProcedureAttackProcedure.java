package net.mcreator.ninjagoreforged.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.ninjagoreforged.init.NinjagoReforgedModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class StunProcedureAttackProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getSource().getDirectEntity());
		}
	}

	public static void execute(Entity immediatesourceentity) {
		execute(null, immediatesourceentity);
	}

	private static void execute(@Nullable Event event, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		if (immediatesourceentity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(NinjagoReforgedModMobEffects.STUN.get())) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
		}
	}
}
