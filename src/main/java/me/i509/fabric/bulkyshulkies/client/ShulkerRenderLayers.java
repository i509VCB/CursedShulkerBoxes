package me.i509.fabric.bulkyshulkies.client;

import me.i509.fabric.bulkyshulkies.BulkyShulkiesMod;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.minecraft.client.texture.SpriteAtlasTexture;
import net.minecraft.client.util.SpriteIdentifier;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.function.Consumer;

public class ShulkerRenderLayers {
	public static final Identifier SHULKER_BOXES_ATLAS_TEXTURE = BulkyShulkiesMod.id("textures/atlas/shulker_boxes.png");

	public static void makeAtlases(Consumer<SpriteIdentifier> consumer, String key) {
		consumer.accept(new SpriteIdentifier(SHULKER_BOXES_ATLAS_TEXTURE, BulkyShulkiesMod.id(makePath(key, null))));
		Arrays.stream(DyeColor.values()).forEach(c -> consumer.accept(new SpriteIdentifier(SHULKER_BOXES_ATLAS_TEXTURE, BulkyShulkiesMod.id(makePath(key, c)))));
	}

	public static void registerSprites(SpriteAtlasTexture atlas, ClientSpriteRegistryCallback.Registry registry, String key) {
		registry.register(BulkyShulkiesMod.id(makePath(key, null)));
		Arrays.stream(DyeColor.values()).forEach(c -> registry.register(BulkyShulkiesMod.id(makePath(key, c))));
	}

	private static String makePath(String key, @Nullable DyeColor color) {
		if (color != null) {
			return "be/shulker/" + key + "/shulker_" + color.getName();
		}

		return "be/shulker/" + key + "/shulker";
	}
}
