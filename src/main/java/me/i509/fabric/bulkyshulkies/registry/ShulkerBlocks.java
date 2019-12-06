/*
 * MIT License
 *
 * Copyright (c) 2019 i509VCB
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package me.i509.fabric.bulkyshulkies.registry;

import net.minecraft.block.Block;
import net.minecraft.block.DispenserBlock;
import net.minecraft.block.Material;
import net.minecraft.block.dispenser.BlockPlacementDispenserBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.DyeColor;
import net.minecraft.util.registry.Registry;

import net.fabricmc.fabric.api.block.FabricBlockSettings;

import me.i509.fabric.bulkyshulkies.BulkyShulkies;
import me.i509.fabric.bulkyshulkies.api.block.slab.SlabBlockPlacementDispenserBehavior;
import me.i509.fabric.bulkyshulkies.block.cursed.slab.CursedSlabShulkerBox;
import me.i509.fabric.bulkyshulkies.block.material.copper.CopperShulkerBoxBlock;
import me.i509.fabric.bulkyshulkies.block.material.diamond.DiamondShulkerBoxBlock;
import me.i509.fabric.bulkyshulkies.block.material.iron.IronShulkerBoxBlock;
import me.i509.fabric.bulkyshulkies.block.material.gold.GoldShulkerBoxBlock;
import me.i509.fabric.bulkyshulkies.block.material.silver.SilverShulkerBoxBlock;

public class ShulkerBlocks {
	public static final Block.Settings SHULKER_BOX_SETTINGS = FabricBlockSettings.of(Material.SHULKER_BOX).hardness(2.0F).dynamicBounds().build().nonOpaque();

	/*
	 * ========================
	 *   Copper Shulker Boxes
	 * ========================
	 */

	public static final Block COPPER_SHULKER_BOX = register(new CopperShulkerBoxBlock(SHULKER_BOX_SETTINGS, null), "copper_shulker_box"); // Uncolored
	public static final Block WHITE_COPPER_SHULKER_BOX = register(new CopperShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.WHITE), "white_copper_shulker_box");
	public static final Block ORANGE_COPPER_SHULKER_BOX = register(new CopperShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.ORANGE), "orange_copper_shulker_box");
	public static final Block MAGENTA_COPPER_SHULKER_BOX = register(new CopperShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.MAGENTA), "magenta_copper_shulker_box");
	public static final Block LIGHT_BLUE_COPPER_SHULKER_BOX = register(new CopperShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.LIGHT_BLUE), "light_blue_copper_shulker_box");
	public static final Block YELLOW_COPPER_SHULKER_BOX = register(new CopperShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.YELLOW), "yellow_copper_shulker_box");
	public static final Block LIME_COPPER_SHULKER_BOX = register(new CopperShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.LIME), "lime_copper_shulker_box");
	public static final Block PINK_COPPER_SHULKER_BOX = register(new CopperShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.PINK), "pink_copper_shulker_box");
	public static final Block GRAY_COPPER_SHULKER_BOX = register(new CopperShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.GRAY), "gray_copper_shulker_box");
	public static final Block LIGHT_GRAY_COPPER_SHULKER_BOX = register(new CopperShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.LIGHT_GRAY), "light_gray_copper_shulker_box");
	public static final Block CYAN_COPPER_SHULKER_BOX = register(new CopperShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.CYAN), "cyan_copper_shulker_box");
	public static final Block PURPLE_COPPER_SHULKER_BOX = register(new CopperShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.PURPLE), "purple_copper_shulker_box");
	public static final Block BLUE_COPPER_SHULKER_BOX = register(new CopperShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.BLUE), "blue_copper_shulker_box");
	public static final Block BROWN_COPPER_SHULKER_BOX = register(new CopperShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.BROWN), "brown_copper_shulker_box");
	public static final Block GREEN_COPPER_SHULKER_BOX = register(new CopperShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.GREEN), "green_copper_shulker_box");
	public static final Block RED_COPPER_SHULKER_BOX = register(new CopperShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.RED), "red_copper_shulker_box");
	public static final Block BLACK_COPPER_SHULKER_BOX = register(new CopperShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.BLACK), "black_copper_shulker_box");

	/*
	 * ========================
	 *    Iron Shulker Boxes
	 * ========================
	 */

	public static final Block IRON_SHULKER_BOX = register(new IronShulkerBoxBlock(SHULKER_BOX_SETTINGS, null), "iron_shulker_box"); // Uncolored
	public static final Block WHITE_IRON_SHULKER_BOX = register(new IronShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.WHITE), "white_iron_shulker_box");
	public static final Block ORANGE_IRON_SHULKER_BOX = register(new IronShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.ORANGE), "orange_iron_shulker_box");
	public static final Block MAGENTA_IRON_SHULKER_BOX = register(new IronShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.MAGENTA), "magenta_iron_shulker_box");
	public static final Block LIGHT_BLUE_IRON_SHULKER_BOX = register(new IronShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.LIGHT_BLUE), "light_blue_iron_shulker_box");
	public static final Block YELLOW_IRON_SHULKER_BOX = register(new IronShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.YELLOW), "yellow_iron_shulker_box");
	public static final Block LIME_IRON_SHULKER_BOX = register(new IronShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.LIME), "lime_iron_shulker_box");
	public static final Block PINK_IRON_SHULKER_BOX = register(new IronShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.PINK), "pink_iron_shulker_box");
	public static final Block GRAY_IRON_SHULKER_BOX = register(new IronShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.GRAY), "gray_iron_shulker_box");
	public static final Block LIGHT_GRAY_IRON_SHULKER_BOX = register(new IronShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.LIGHT_GRAY), "light_gray_iron_shulker_box");
	public static final Block CYAN_IRON_SHULKER_BOX = register(new IronShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.CYAN), "cyan_iron_shulker_box");
	public static final Block PURPLE_IRON_SHULKER_BOX = register(new IronShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.PURPLE), "purple_iron_shulker_box");
	public static final Block BLUE_IRON_SHULKER_BOX = register(new IronShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.BLUE), "blue_iron_shulker_box");
	public static final Block BROWN_IRON_SHULKER_BOX = register(new IronShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.BROWN), "brown_iron_shulker_box");
	public static final Block GREEN_IRON_SHULKER_BOX = register(new IronShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.GREEN), "green_iron_shulker_box");
	public static final Block RED_IRON_SHULKER_BOX = register(new IronShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.RED), "red_iron_shulker_box");
	public static final Block BLACK_IRON_SHULKER_BOX = register(new IronShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.BLACK), "black_iron_shulker_box");

	/*
	 * ========================
	 *    Silver Shulker Boxes
	 * ========================
	 */

	public static final Block SILVER_SHULKER_BOX = register(new SilverShulkerBoxBlock(SHULKER_BOX_SETTINGS, null), "silver_shulker_box"); // Uncolored
	public static final Block WHITE_SILVER_SHULKER_BOX = register(new SilverShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.WHITE), "white_silver_shulker_box");
	public static final Block ORANGE_SILVER_SHULKER_BOX = register(new SilverShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.ORANGE), "orange_silver_shulker_box");
	public static final Block MAGENTA_SILVER_SHULKER_BOX = register(new SilverShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.MAGENTA), "magenta_silver_shulker_box");
	public static final Block LIGHT_BLUE_SILVER_SHULKER_BOX = register(new SilverShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.LIGHT_BLUE), "light_blue_silver_shulker_box");
	public static final Block YELLOW_SILVER_SHULKER_BOX = register(new SilverShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.YELLOW), "yellow_silver_shulker_box");
	public static final Block LIME_SILVER_SHULKER_BOX = register(new SilverShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.LIME), "lime_silver_shulker_box");
	public static final Block PINK_SILVER_SHULKER_BOX = register(new SilverShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.PINK), "pink_silver_shulker_box");
	public static final Block GRAY_SILVER_SHULKER_BOX = register(new SilverShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.GRAY), "gray_silver_shulker_box");
	public static final Block LIGHT_GRAY_SILVER_SHULKER_BOX = register(new SilverShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.LIGHT_GRAY), "light_gray_silver_shulker_box");
	public static final Block CYAN_SILVER_SHULKER_BOX = register(new SilverShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.CYAN), "cyan_silver_shulker_box");
	public static final Block PURPLE_SILVER_SHULKER_BOX = register(new SilverShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.PURPLE), "purple_silver_shulker_box");
	public static final Block BLUE_SILVER_SHULKER_BOX = register(new SilverShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.BLUE), "blue_silver_shulker_box");
	public static final Block BROWN_SILVER_SHULKER_BOX = register(new SilverShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.BROWN), "brown_silver_shulker_box");
	public static final Block GREEN_SILVER_SHULKER_BOX = register(new SilverShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.GREEN), "green_silver_shulker_box");
	public static final Block RED_SILVER_SHULKER_BOX = register(new SilverShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.RED), "red_silver_shulker_box");
	public static final Block BLACK_SILVER_SHULKER_BOX = register(new SilverShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.BLACK), "black_silver_shulker_box");

	/*
	 * ========================
	 *    Gold Shulker Boxes
	 * ========================
	 */

	public static final Block GOLD_SHULKER_BOX = register(new GoldShulkerBoxBlock(SHULKER_BOX_SETTINGS, null), "gold_shulker_box"); // Uncolored
	public static final Block WHITE_GOLD_SHULKER_BOX = register(new GoldShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.WHITE), "white_gold_shulker_box");
	public static final Block ORANGE_GOLD_SHULKER_BOX = register(new GoldShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.ORANGE), "orange_gold_shulker_box");
	public static final Block MAGENTA_GOLD_SHULKER_BOX = register(new GoldShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.MAGENTA), "magenta_gold_shulker_box");
	public static final Block LIGHT_BLUE_GOLD_SHULKER_BOX = register(new GoldShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.LIGHT_BLUE), "light_blue_gold_shulker_box");
	public static final Block YELLOW_GOLD_SHULKER_BOX = register(new GoldShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.YELLOW), "yellow_gold_shulker_box");
	public static final Block LIME_GOLD_SHULKER_BOX = register(new GoldShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.LIME), "lime_gold_shulker_box");
	public static final Block PINK_GOLD_SHULKER_BOX = register(new GoldShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.PINK), "pink_gold_shulker_box");
	public static final Block GRAY_GOLD_SHULKER_BOX = register(new GoldShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.GRAY), "gray_gold_shulker_box");
	public static final Block LIGHT_GRAY_GOLD_SHULKER_BOX = register(new GoldShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.LIGHT_GRAY), "light_gray_gold_shulker_box");
	public static final Block CYAN_GOLD_SHULKER_BOX = register(new GoldShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.CYAN), "cyan_gold_shulker_box");
	public static final Block PURPLE_GOLD_SHULKER_BOX = register(new GoldShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.PURPLE), "purple_gold_shulker_box");
	public static final Block BLUE_GOLD_SHULKER_BOX = register(new GoldShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.BLUE), "blue_gold_shulker_box");
	public static final Block BROWN_GOLD_SHULKER_BOX = register(new GoldShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.BROWN), "brown_gold_shulker_box");
	public static final Block GREEN_GOLD_SHULKER_BOX = register(new GoldShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.GREEN), "green_gold_shulker_box");
	public static final Block RED_GOLD_SHULKER_BOX = register(new GoldShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.RED), "red_gold_shulker_box");
	public static final Block BLACK_GOLD_SHULKER_BOX = register(new GoldShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.BLACK), "black_gold_shulker_box");

	/*
	 * ========================
	 *    Diamond Shulker Boxes
	 * ========================
	 */

	public static final Block DIAMOND_SHULKER_BOX = register(new DiamondShulkerBoxBlock(SHULKER_BOX_SETTINGS, null), "diamond_shulker_box"); // Uncolored
	public static final Block WHITE_DIAMOND_SHULKER_BOX = register(new DiamondShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.WHITE), "white_diamond_shulker_box");
	public static final Block ORANGE_DIAMOND_SHULKER_BOX = register(new DiamondShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.ORANGE), "orange_diamond_shulker_box");
	public static final Block MAGENTA_DIAMOND_SHULKER_BOX = register(new DiamondShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.MAGENTA), "magenta_diamond_shulker_box");
	public static final Block LIGHT_BLUE_DIAMOND_SHULKER_BOX = register(new DiamondShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.LIGHT_BLUE), "light_blue_diamond_shulker_box");
	public static final Block YELLOW_DIAMOND_SHULKER_BOX = register(new DiamondShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.YELLOW), "yellow_diamond_shulker_box");
	public static final Block LIME_DIAMOND_SHULKER_BOX = register(new DiamondShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.LIME), "lime_diamond_shulker_box");
	public static final Block PINK_DIAMOND_SHULKER_BOX = register(new DiamondShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.PINK), "pink_diamond_shulker_box");
	public static final Block GRAY_DIAMOND_SHULKER_BOX = register(new DiamondShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.GRAY), "gray_diamond_shulker_box");
	public static final Block LIGHT_GRAY_DIAMOND_SHULKER_BOX = register(new DiamondShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.LIGHT_GRAY), "light_gray_diamond_shulker_box");
	public static final Block CYAN_DIAMOND_SHULKER_BOX = register(new DiamondShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.CYAN), "cyan_diamond_shulker_box");
	public static final Block PURPLE_DIAMOND_SHULKER_BOX = register(new DiamondShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.PURPLE), "purple_diamond_shulker_box");
	public static final Block BLUE_DIAMOND_SHULKER_BOX = register(new DiamondShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.BLUE), "blue_diamond_shulker_box");
	public static final Block BROWN_DIAMOND_SHULKER_BOX = register(new DiamondShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.BROWN), "brown_diamond_shulker_box");
	public static final Block GREEN_DIAMOND_SHULKER_BOX = register(new DiamondShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.GREEN), "green_diamond_shulker_box");
	public static final Block RED_DIAMOND_SHULKER_BOX = register(new DiamondShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.RED), "red_diamond_shulker_box");
	public static final Block BLACK_DIAMOND_SHULKER_BOX = register(new DiamondShulkerBoxBlock(SHULKER_BOX_SETTINGS, DyeColor.BLACK), "black_diamond_shulker_box");

	/*
	 * ========================
	 *   Cursed Shulker Boxes
	 *       Slab Edition
	 * ========================
	 */

	public static final Block SLAB_SHULKER_BOX = register(new CursedSlabShulkerBox(SHULKER_BOX_SETTINGS, null), "slab_shulker_box");
	public static final Block WHITE_SLAB_SHULKER_BOX = register(new CursedSlabShulkerBox(SHULKER_BOX_SETTINGS, DyeColor.WHITE), "white_slab_shulker_box");
	public static final Block ORANGE_SLAB_SHULKER_BOX = register(new CursedSlabShulkerBox(SHULKER_BOX_SETTINGS, DyeColor.ORANGE), "orange_slab_shulker_box");
	public static final Block MAGENTA_SLAB_SHULKER_BOX = register(new CursedSlabShulkerBox(SHULKER_BOX_SETTINGS, DyeColor.MAGENTA), "magenta_slab_shulker_box");
	public static final Block LIGHT_BLUE_SLAB_SHULKER_BOX = register(new CursedSlabShulkerBox(SHULKER_BOX_SETTINGS, DyeColor.LIGHT_BLUE), "light_blue_slab_shulker_box");
	public static final Block YELLOW_SLAB_SHULKER_BOX = register(new CursedSlabShulkerBox(SHULKER_BOX_SETTINGS, DyeColor.YELLOW), "yellow_slab_shulker_box");
	public static final Block LIME_SLAB_SHULKER_BOX = register(new CursedSlabShulkerBox(SHULKER_BOX_SETTINGS, DyeColor.LIME), "lime_slab_shulker_box");
	public static final Block PINK_SLAB_SHULKER_BOX = register(new CursedSlabShulkerBox(SHULKER_BOX_SETTINGS, DyeColor.PINK), "pink_slab_shulker_box");
	public static final Block GRAY_SLAB_SHULKER_BOX = register(new CursedSlabShulkerBox(SHULKER_BOX_SETTINGS, DyeColor.GRAY), "gray_slab_shulker_box");
	public static final Block LIGHT_GRAY_SLAB_SHULKER_BOX = register(new CursedSlabShulkerBox(SHULKER_BOX_SETTINGS, DyeColor.LIGHT_GRAY), "light_gray_slab_shulker_box");
	public static final Block CYAN_SLAB_SHULKER_BOX = register(new CursedSlabShulkerBox(SHULKER_BOX_SETTINGS, DyeColor.CYAN), "cyan_slab_shulker_box");
	public static final Block PURPLE_SLAB_SHULKER_BOX = register(new CursedSlabShulkerBox(SHULKER_BOX_SETTINGS, DyeColor.PURPLE), "purple_slab_shulker_box");
	public static final Block BLUE_SLAB_SHULKER_BOX = register(new CursedSlabShulkerBox(SHULKER_BOX_SETTINGS, DyeColor.BLUE), "blue_slab_shulker_box");
	public static final Block BROWN_SLAB_SHULKER_BOX = register(new CursedSlabShulkerBox(SHULKER_BOX_SETTINGS, DyeColor.BROWN), "brown_slab_shulker_box");
	public static final Block GREEN_SLAB_SHULKER_BOX = register(new CursedSlabShulkerBox(SHULKER_BOX_SETTINGS, DyeColor.GREEN), "green_slab_shulker_box");
	public static final Block RED_SLAB_SHULKER_BOX = register(new CursedSlabShulkerBox(SHULKER_BOX_SETTINGS, DyeColor.RED), "red_slab_shulker_box");
	public static final Block BLACK_SLAB_SHULKER_BOX = register(new CursedSlabShulkerBox(SHULKER_BOX_SETTINGS, DyeColor.BLACK), "black_slab_shulker_box");

	private ShulkerBlocks() {
		// NO-OP
	}

	// Dispenser Behaviors.
	public static void init() {
		// Copper Boxes
		DispenserBlock.registerBehavior(COPPER_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(WHITE_COPPER_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(ORANGE_COPPER_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(MAGENTA_COPPER_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(LIGHT_BLUE_COPPER_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(YELLOW_COPPER_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(LIME_COPPER_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(PINK_COPPER_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(GRAY_COPPER_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(LIGHT_GRAY_COPPER_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(CYAN_COPPER_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(PURPLE_COPPER_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(BLUE_COPPER_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(BROWN_COPPER_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(GREEN_COPPER_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(RED_COPPER_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(BLACK_COPPER_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		// Iron Boxes
		DispenserBlock.registerBehavior(IRON_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(WHITE_IRON_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(ORANGE_IRON_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(MAGENTA_IRON_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(LIGHT_BLUE_IRON_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(YELLOW_IRON_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(LIME_IRON_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(PINK_IRON_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(GRAY_IRON_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(LIGHT_GRAY_IRON_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(CYAN_IRON_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(PURPLE_IRON_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(BLUE_IRON_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(BROWN_IRON_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(GREEN_IRON_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(RED_IRON_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(BLACK_IRON_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		// Silver Boxes
		DispenserBlock.registerBehavior(SILVER_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(WHITE_SILVER_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(ORANGE_SILVER_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(MAGENTA_SILVER_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(LIGHT_BLUE_SILVER_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(YELLOW_SILVER_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(LIME_SILVER_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(PINK_SILVER_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(GRAY_SILVER_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(LIGHT_GRAY_SILVER_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(CYAN_SILVER_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(PURPLE_SILVER_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(BLUE_SILVER_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(BROWN_SILVER_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(GREEN_SILVER_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(RED_SILVER_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(BLACK_SILVER_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		// Gold Boxes
		DispenserBlock.registerBehavior(GOLD_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(WHITE_GOLD_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(ORANGE_GOLD_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(MAGENTA_GOLD_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(LIGHT_BLUE_GOLD_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(YELLOW_GOLD_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(LIME_GOLD_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(PINK_GOLD_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(GRAY_GOLD_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(LIGHT_GRAY_GOLD_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(CYAN_GOLD_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(PURPLE_GOLD_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(BLUE_GOLD_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(BROWN_GOLD_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(GREEN_GOLD_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(RED_GOLD_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(BLACK_GOLD_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		// Diamond Boxes
		DispenserBlock.registerBehavior(DIAMOND_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(WHITE_DIAMOND_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(ORANGE_DIAMOND_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(MAGENTA_DIAMOND_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(LIGHT_BLUE_DIAMOND_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(YELLOW_DIAMOND_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(LIME_DIAMOND_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(PINK_DIAMOND_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(GRAY_DIAMOND_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(LIGHT_GRAY_DIAMOND_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(CYAN_DIAMOND_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(PURPLE_DIAMOND_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(BLUE_DIAMOND_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(BROWN_DIAMOND_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(GREEN_DIAMOND_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(RED_DIAMOND_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(BLACK_DIAMOND_SHULKER_BOX.asItem(), new BlockPlacementDispenserBehavior());
		// Slab Boxes
		DispenserBlock.registerBehavior(SLAB_SHULKER_BOX.asItem(), new SlabBlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(WHITE_SLAB_SHULKER_BOX.asItem(), new SlabBlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(ORANGE_SLAB_SHULKER_BOX.asItem(), new SlabBlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(MAGENTA_SLAB_SHULKER_BOX.asItem(), new SlabBlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(LIGHT_BLUE_SLAB_SHULKER_BOX.asItem(), new SlabBlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(YELLOW_SLAB_SHULKER_BOX.asItem(), new SlabBlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(LIME_SLAB_SHULKER_BOX.asItem(), new SlabBlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(PINK_SLAB_SHULKER_BOX.asItem(), new SlabBlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(GRAY_SLAB_SHULKER_BOX.asItem(), new SlabBlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(LIGHT_GRAY_SLAB_SHULKER_BOX.asItem(), new SlabBlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(CYAN_SLAB_SHULKER_BOX.asItem(), new SlabBlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(PURPLE_SLAB_SHULKER_BOX.asItem(), new SlabBlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(BLUE_SLAB_SHULKER_BOX.asItem(), new SlabBlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(BROWN_SLAB_SHULKER_BOX.asItem(), new SlabBlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(GREEN_SLAB_SHULKER_BOX.asItem(), new SlabBlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(RED_SLAB_SHULKER_BOX.asItem(), new SlabBlockPlacementDispenserBehavior());
		DispenserBlock.registerBehavior(BLACK_SLAB_SHULKER_BOX.asItem(), new SlabBlockPlacementDispenserBehavior());
	}

	public static Block register(Block block, String path) {
		return register(block, path, ShulkerItemGroups.UNSTACKABLE_CURSED_ITEM_SETTINGS);
	}

	public static Block register(Block block, String path, Item.Settings settings) {
		Block b = Registry.register(Registry.BLOCK, BulkyShulkies.id(path), block);
		Registry.register(Registry.ITEM, BulkyShulkies.id(path), new BlockItem(block, settings));
		return b;
	}
}