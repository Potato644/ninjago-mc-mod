package net.mcreator.ninjagoreforged.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.ninjagoreforged.world.inventory.ElementSelectionMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ElementSelectionScreen extends AbstractContainerScreen<ElementSelectionMenu> {
	private final static HashMap<String, Object> guistate = ElementSelectionMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_fire;
	Button button_water;
	Button button_ssbyu_ice;
	Button button_sselightning;
	Button button_ssaearth;
	Button button_ss2energy;

	public ElementSelectionScreen(ElementSelectionMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 300;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("ninjago_reforged:textures/screens/element_selection.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		button_fire = Button.builder(Component.translatable("gui.ninjago_reforged.element_selection.button_fire"), e -> {
		}).bounds(this.leftPos + 9, this.topPos + 10, 86, 20).build();
		guistate.put("button:button_fire", button_fire);
		this.addRenderableWidget(button_fire);
		button_water = Button.builder(Component.translatable("gui.ninjago_reforged.element_selection.button_water"), e -> {
		}).bounds(this.leftPos + 201, this.topPos + 133, 87, 20).build();
		guistate.put("button:button_water", button_water);
		this.addRenderableWidget(button_water);
		button_ssbyu_ice = Button.builder(Component.translatable("gui.ninjago_reforged.element_selection.button_ssbyu_ice"), e -> {
		}).bounds(this.leftPos + 9, this.topPos + 72, 87, 20).build();
		guistate.put("button:button_ssbyu_ice", button_ssbyu_ice);
		this.addRenderableWidget(button_ssbyu_ice);
		button_sselightning = Button.builder(Component.translatable("gui.ninjago_reforged.element_selection.button_sselightning"), e -> {
		}).bounds(this.leftPos + 9, this.topPos + 133, 88, 20).build();
		guistate.put("button:button_sselightning", button_sselightning);
		this.addRenderableWidget(button_sselightning);
		button_ssaearth = Button.builder(Component.translatable("gui.ninjago_reforged.element_selection.button_ssaearth"), e -> {
		}).bounds(this.leftPos + 201, this.topPos + 10, 87, 20).build();
		guistate.put("button:button_ssaearth", button_ssaearth);
		this.addRenderableWidget(button_ssaearth);
		button_ss2energy = Button.builder(Component.translatable("gui.ninjago_reforged.element_selection.button_ss2energy"), e -> {
		}).bounds(this.leftPos + 201, this.topPos + 72, 87, 20).build();
		guistate.put("button:button_ss2energy", button_ss2energy);
		this.addRenderableWidget(button_ss2energy);
	}
}
