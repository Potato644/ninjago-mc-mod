package net.mcreator.ninjagoreforged.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.ninjagoreforged.init.NinjagoReforgedModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class StunProcedureProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(NinjagoReforgedModMobEffects.STUN.get())) {
			if (entity instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
				_livingEntity1.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0);
			if (entity instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttributes().hasAttribute(Attributes.JUMP_STRENGTH))
				_livingEntity2.getAttribute(Attributes.JUMP_STRENGTH).setBaseValue(0);
		} else {
			if (entity instanceof LivingEntity _livingEntity3 && _livingEntity3.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
				_livingEntity3.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.1);
			if (entity instanceof LivingEntity _livingEntity4 && _livingEntity4.getAttributes().hasAttribute(Attributes.JUMP_STRENGTH))
				_livingEntity4.getAttribute(Attributes.JUMP_STRENGTH).setBaseValue(0.42);
		}
	}
}
