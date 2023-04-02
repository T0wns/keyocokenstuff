
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.cringeco.keyocokenstuff.init;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.cringeco.keyocokenstuff.item.VinegarItem;
import net.cringeco.keyocokenstuff.item.TomatoSeedsItem;
import net.cringeco.keyocokenstuff.item.TomatoItem;
import net.cringeco.keyocokenstuff.item.SunflowerOilItem;
import net.cringeco.keyocokenstuff.item.MayonnaiseItem;
import net.cringeco.keyocokenstuff.item.KetchupItem;
import net.cringeco.keyocokenstuff.KeyocokenstuffMod;

public class KeyocokenstuffModItems {
	public static Item TOMATO_SEEDS;
	public static Item TOMATO;
	public static Item SUNFLOWER_OIL;
	public static Item MAYONNAISE;
	public static Item VINEGAR;
	public static Item KETCHUP;

	public static void load() {
		TOMATO_SEEDS = Registry.register(Registry.ITEM, new ResourceLocation(KeyocokenstuffMod.MODID, "tomato_seeds"), new TomatoSeedsItem());
		TOMATO = Registry.register(Registry.ITEM, new ResourceLocation(KeyocokenstuffMod.MODID, "tomato"), new TomatoItem());
		SUNFLOWER_OIL = Registry.register(Registry.ITEM, new ResourceLocation(KeyocokenstuffMod.MODID, "sunflower_oil"), new SunflowerOilItem());
		MAYONNAISE = Registry.register(Registry.ITEM, new ResourceLocation(KeyocokenstuffMod.MODID, "mayonnaise"), new MayonnaiseItem());
		VINEGAR = Registry.register(Registry.ITEM, new ResourceLocation(KeyocokenstuffMod.MODID, "vinegar"), new VinegarItem());
		KETCHUP = Registry.register(Registry.ITEM, new ResourceLocation(KeyocokenstuffMod.MODID, "ketchup"), new KetchupItem());
	}
}
