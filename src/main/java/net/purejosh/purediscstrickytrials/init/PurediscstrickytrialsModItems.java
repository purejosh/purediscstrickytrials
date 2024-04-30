/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.purejosh.purediscstrickytrials.init;

import net.purejosh.purediscstrickytrials.item.MusicDiscYakusokuItem;
import net.purejosh.purediscstrickytrials.item.MusicDiscWatcherItem;
import net.purejosh.purediscstrickytrials.item.MusicDiscPuzzleboxItem;
import net.purejosh.purediscstrickytrials.item.MusicDiscPrecipiceItem;
import net.purejosh.purediscstrickytrials.item.MusicDiscPokopokoItem;
import net.purejosh.purediscstrickytrials.item.MusicDiscKomorebiItem;
import net.purejosh.purediscstrickytrials.item.MusicDiscFeatherfallItem;
import net.purejosh.purediscstrickytrials.item.MusicDiscEndlessItem;
import net.purejosh.purediscstrickytrials.item.MusicDiscEldUnknownItem;
import net.purejosh.purediscstrickytrials.item.MusicDiscDeeperItem;
import net.purejosh.purediscstrickytrials.item.MusicDiscCreatorMusicBoxItem;
import net.purejosh.purediscstrickytrials.item.MusicDiscCreatorItem;
import net.purejosh.purediscstrickytrials.PurediscstrickytrialsMod;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class PurediscstrickytrialsModItems {
	public static Item MUSIC_DISC_CREATOR;
	public static Item MUSIC_DISC_CREATOR_MUSIC_BOX;
	public static Item MUSIC_DISC_DEEPER;
	public static Item MUSIC_DISC_ELD_UNKNOWN;
	public static Item MUSIC_DISC_ENDLESS;
	public static Item MUSIC_DISC_FEATHERFALL;
	public static Item MUSIC_DISC_KOMOREBI;
	public static Item MUSIC_DISC_POKOPOKO;
	public static Item MUSIC_DISC_PRECIPICE;
	public static Item MUSIC_DISC_PUZZLEBOX;
	public static Item MUSIC_DISC_WATCHER;
	public static Item MUSIC_DISC_YAKUSOKU;

	public static void load() {
		MUSIC_DISC_CREATOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PurediscstrickytrialsMod.MODID, "music_disc_creator"), new MusicDiscCreatorItem());
		MUSIC_DISC_CREATOR_MUSIC_BOX = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PurediscstrickytrialsMod.MODID, "music_disc_creator_music_box"), new MusicDiscCreatorMusicBoxItem());
		MUSIC_DISC_DEEPER = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PurediscstrickytrialsMod.MODID, "music_disc_deeper"), new MusicDiscDeeperItem());
		MUSIC_DISC_ELD_UNKNOWN = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PurediscstrickytrialsMod.MODID, "music_disc_eld_unknown"), new MusicDiscEldUnknownItem());
		MUSIC_DISC_ENDLESS = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PurediscstrickytrialsMod.MODID, "music_disc_endless"), new MusicDiscEndlessItem());
		MUSIC_DISC_FEATHERFALL = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PurediscstrickytrialsMod.MODID, "music_disc_featherfall"), new MusicDiscFeatherfallItem());
		MUSIC_DISC_KOMOREBI = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PurediscstrickytrialsMod.MODID, "music_disc_komorebi"), new MusicDiscKomorebiItem());
		MUSIC_DISC_POKOPOKO = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PurediscstrickytrialsMod.MODID, "music_disc_pokopoko"), new MusicDiscPokopokoItem());
		MUSIC_DISC_PRECIPICE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PurediscstrickytrialsMod.MODID, "music_disc_precipice"), new MusicDiscPrecipiceItem());
		MUSIC_DISC_PUZZLEBOX = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PurediscstrickytrialsMod.MODID, "music_disc_puzzlebox"), new MusicDiscPuzzleboxItem());
		MUSIC_DISC_WATCHER = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PurediscstrickytrialsMod.MODID, "music_disc_watcher"), new MusicDiscWatcherItem());
		MUSIC_DISC_YAKUSOKU = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PurediscstrickytrialsMod.MODID, "music_disc_yakusoku"), new MusicDiscYakusokuItem());
	}

	public static void clientLoad() {
	}
}
