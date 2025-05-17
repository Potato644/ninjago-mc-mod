
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ninjagoreforged.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.ninjagoreforged.client.gui.TimeWarriorRaceScreen;
import net.mcreator.ninjagoreforged.client.gui.StoneWarriorRaceScreen;
import net.mcreator.ninjagoreforged.client.gui.SkeletonWarriorRaceScreen;
import net.mcreator.ninjagoreforged.client.gui.ShadowCreatureRaceScreen;
import net.mcreator.ninjagoreforged.client.gui.SerpentineRaceScreen;
import net.mcreator.ninjagoreforged.client.gui.SeaCreatureRaceScreen;
import net.mcreator.ninjagoreforged.client.gui.OniRaceScreen;
import net.mcreator.ninjagoreforged.client.gui.OniDragonRaceScreen;
import net.mcreator.ninjagoreforged.client.gui.NindroidRaceScreen;
import net.mcreator.ninjagoreforged.client.gui.LivingPlantRaceScreen;
import net.mcreator.ninjagoreforged.client.gui.HumanRaceScreen;
import net.mcreator.ninjagoreforged.client.gui.GuardianRaceScreen;
import net.mcreator.ninjagoreforged.client.gui.GhostRaceScreen;
import net.mcreator.ninjagoreforged.client.gui.FogCreatureRaceScreen;
import net.mcreator.ninjagoreforged.client.gui.FallenOneRaceScreen;
import net.mcreator.ninjagoreforged.client.gui.ElementalMasterRaceScreen;
import net.mcreator.ninjagoreforged.client.gui.ElementSelectionScreen;
import net.mcreator.ninjagoreforged.client.gui.DragonRaceScreen;
import net.mcreator.ninjagoreforged.client.gui.DragonHunterRaceScreen;
import net.mcreator.ninjagoreforged.client.gui.DjinnRaceScreen;
import net.mcreator.ninjagoreforged.client.gui.CursedBeingRaceScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class NinjagoReforgedModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(NinjagoReforgedModMenus.ELEMENT_SELECTION.get(), ElementSelectionScreen::new);
			MenuScreens.register(NinjagoReforgedModMenus.HUMAN_RACE.get(), HumanRaceScreen::new);
			MenuScreens.register(NinjagoReforgedModMenus.DRAGON_RACE.get(), DragonRaceScreen::new);
			MenuScreens.register(NinjagoReforgedModMenus.ONI_RACE.get(), OniRaceScreen::new);
			MenuScreens.register(NinjagoReforgedModMenus.SERPENTINE_RACE.get(), SerpentineRaceScreen::new);
			MenuScreens.register(NinjagoReforgedModMenus.GHOST_RACE.get(), GhostRaceScreen::new);
			MenuScreens.register(NinjagoReforgedModMenus.NINDROID_RACE.get(), NindroidRaceScreen::new);
			MenuScreens.register(NinjagoReforgedModMenus.STONE_WARRIOR_RACE.get(), StoneWarriorRaceScreen::new);
			MenuScreens.register(NinjagoReforgedModMenus.ELEMENTAL_MASTER_RACE.get(), ElementalMasterRaceScreen::new);
			MenuScreens.register(NinjagoReforgedModMenus.ONI_DRAGON_RACE.get(), OniDragonRaceScreen::new);
			MenuScreens.register(NinjagoReforgedModMenus.FALLEN_ONE_RACE.get(), FallenOneRaceScreen::new);
			MenuScreens.register(NinjagoReforgedModMenus.SEA_CREATURE_RACE.get(), SeaCreatureRaceScreen::new);
			MenuScreens.register(NinjagoReforgedModMenus.SKELETON_WARRIOR_RACE.get(), SkeletonWarriorRaceScreen::new);
			MenuScreens.register(NinjagoReforgedModMenus.DJINN_RACE.get(), DjinnRaceScreen::new);
			MenuScreens.register(NinjagoReforgedModMenus.LIVING_PLANT_RACE.get(), LivingPlantRaceScreen::new);
			MenuScreens.register(NinjagoReforgedModMenus.DRAGON_HUNTER_RACE.get(), DragonHunterRaceScreen::new);
			MenuScreens.register(NinjagoReforgedModMenus.TIME_WARRIOR_RACE.get(), TimeWarriorRaceScreen::new);
			MenuScreens.register(NinjagoReforgedModMenus.FOG_CREATURE_RACE.get(), FogCreatureRaceScreen::new);
			MenuScreens.register(NinjagoReforgedModMenus.GUARDIAN_RACE.get(), GuardianRaceScreen::new);
			MenuScreens.register(NinjagoReforgedModMenus.SHADOW_CREATURE_RACE.get(), ShadowCreatureRaceScreen::new);
			MenuScreens.register(NinjagoReforgedModMenus.CURSED_BEING_RACE.get(), CursedBeingRaceScreen::new);
		});
	}
}
