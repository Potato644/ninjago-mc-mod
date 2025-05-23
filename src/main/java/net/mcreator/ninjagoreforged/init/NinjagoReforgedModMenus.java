
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ninjagoreforged.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.ninjagoreforged.world.inventory.TimeWarriorRaceMenu;
import net.mcreator.ninjagoreforged.world.inventory.StoneWarriorRaceMenu;
import net.mcreator.ninjagoreforged.world.inventory.SkeletonWarriorRaceMenu;
import net.mcreator.ninjagoreforged.world.inventory.ShadowCreatureRaceMenu;
import net.mcreator.ninjagoreforged.world.inventory.SerpentineRaceMenu;
import net.mcreator.ninjagoreforged.world.inventory.SeaCreatureRaceMenu;
import net.mcreator.ninjagoreforged.world.inventory.OniRaceMenu;
import net.mcreator.ninjagoreforged.world.inventory.OniDragonRaceMenu;
import net.mcreator.ninjagoreforged.world.inventory.NindroidRaceMenu;
import net.mcreator.ninjagoreforged.world.inventory.LivingPlantRaceMenu;
import net.mcreator.ninjagoreforged.world.inventory.HumanRaceMenu;
import net.mcreator.ninjagoreforged.world.inventory.GuardianRaceMenu;
import net.mcreator.ninjagoreforged.world.inventory.GhostRaceMenu;
import net.mcreator.ninjagoreforged.world.inventory.FogCreatureRaceMenu;
import net.mcreator.ninjagoreforged.world.inventory.FallenOneRaceMenu;
import net.mcreator.ninjagoreforged.world.inventory.ElementalMasterRaceMenu;
import net.mcreator.ninjagoreforged.world.inventory.ElementSelectionMenu;
import net.mcreator.ninjagoreforged.world.inventory.DragonRaceMenu;
import net.mcreator.ninjagoreforged.world.inventory.DragonHunterRaceMenu;
import net.mcreator.ninjagoreforged.world.inventory.DjinnRaceMenu;
import net.mcreator.ninjagoreforged.world.inventory.CursedBeingRaceMenu;
import net.mcreator.ninjagoreforged.NinjagoReforgedMod;

public class NinjagoReforgedModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, NinjagoReforgedMod.MODID);
	public static final RegistryObject<MenuType<ElementSelectionMenu>> ELEMENT_SELECTION = REGISTRY.register("element_selection", () -> IForgeMenuType.create(ElementSelectionMenu::new));
	public static final RegistryObject<MenuType<HumanRaceMenu>> HUMAN_RACE = REGISTRY.register("human_race", () -> IForgeMenuType.create(HumanRaceMenu::new));
	public static final RegistryObject<MenuType<DragonRaceMenu>> DRAGON_RACE = REGISTRY.register("dragon_race", () -> IForgeMenuType.create(DragonRaceMenu::new));
	public static final RegistryObject<MenuType<OniRaceMenu>> ONI_RACE = REGISTRY.register("oni_race", () -> IForgeMenuType.create(OniRaceMenu::new));
	public static final RegistryObject<MenuType<SerpentineRaceMenu>> SERPENTINE_RACE = REGISTRY.register("serpentine_race", () -> IForgeMenuType.create(SerpentineRaceMenu::new));
	public static final RegistryObject<MenuType<GhostRaceMenu>> GHOST_RACE = REGISTRY.register("ghost_race", () -> IForgeMenuType.create(GhostRaceMenu::new));
	public static final RegistryObject<MenuType<NindroidRaceMenu>> NINDROID_RACE = REGISTRY.register("nindroid_race", () -> IForgeMenuType.create(NindroidRaceMenu::new));
	public static final RegistryObject<MenuType<StoneWarriorRaceMenu>> STONE_WARRIOR_RACE = REGISTRY.register("stone_warrior_race", () -> IForgeMenuType.create(StoneWarriorRaceMenu::new));
	public static final RegistryObject<MenuType<ElementalMasterRaceMenu>> ELEMENTAL_MASTER_RACE = REGISTRY.register("elemental_master_race", () -> IForgeMenuType.create(ElementalMasterRaceMenu::new));
	public static final RegistryObject<MenuType<OniDragonRaceMenu>> ONI_DRAGON_RACE = REGISTRY.register("oni_dragon_race", () -> IForgeMenuType.create(OniDragonRaceMenu::new));
	public static final RegistryObject<MenuType<FallenOneRaceMenu>> FALLEN_ONE_RACE = REGISTRY.register("fallen_one_race", () -> IForgeMenuType.create(FallenOneRaceMenu::new));
	public static final RegistryObject<MenuType<SeaCreatureRaceMenu>> SEA_CREATURE_RACE = REGISTRY.register("sea_creature_race", () -> IForgeMenuType.create(SeaCreatureRaceMenu::new));
	public static final RegistryObject<MenuType<SkeletonWarriorRaceMenu>> SKELETON_WARRIOR_RACE = REGISTRY.register("skeleton_warrior_race", () -> IForgeMenuType.create(SkeletonWarriorRaceMenu::new));
	public static final RegistryObject<MenuType<DjinnRaceMenu>> DJINN_RACE = REGISTRY.register("djinn_race", () -> IForgeMenuType.create(DjinnRaceMenu::new));
	public static final RegistryObject<MenuType<LivingPlantRaceMenu>> LIVING_PLANT_RACE = REGISTRY.register("living_plant_race", () -> IForgeMenuType.create(LivingPlantRaceMenu::new));
	public static final RegistryObject<MenuType<DragonHunterRaceMenu>> DRAGON_HUNTER_RACE = REGISTRY.register("dragon_hunter_race", () -> IForgeMenuType.create(DragonHunterRaceMenu::new));
	public static final RegistryObject<MenuType<TimeWarriorRaceMenu>> TIME_WARRIOR_RACE = REGISTRY.register("time_warrior_race", () -> IForgeMenuType.create(TimeWarriorRaceMenu::new));
	public static final RegistryObject<MenuType<FogCreatureRaceMenu>> FOG_CREATURE_RACE = REGISTRY.register("fog_creature_race", () -> IForgeMenuType.create(FogCreatureRaceMenu::new));
	public static final RegistryObject<MenuType<GuardianRaceMenu>> GUARDIAN_RACE = REGISTRY.register("guardian_race", () -> IForgeMenuType.create(GuardianRaceMenu::new));
	public static final RegistryObject<MenuType<ShadowCreatureRaceMenu>> SHADOW_CREATURE_RACE = REGISTRY.register("shadow_creature_race", () -> IForgeMenuType.create(ShadowCreatureRaceMenu::new));
	public static final RegistryObject<MenuType<CursedBeingRaceMenu>> CURSED_BEING_RACE = REGISTRY.register("cursed_being_race", () -> IForgeMenuType.create(CursedBeingRaceMenu::new));
}
