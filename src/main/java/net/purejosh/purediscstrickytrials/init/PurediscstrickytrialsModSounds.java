
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.purejosh.purediscstrickytrials.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class PurediscstrickytrialsModSounds {
	public static SoundEvent CREATOR = SoundEvent.createVariableRangeEvent(new ResourceLocation("purediscstrickytrials", "creator"));
	public static SoundEvent CREATOR_MUSIC_BOX = SoundEvent.createVariableRangeEvent(new ResourceLocation("purediscstrickytrials", "creator_music_box"));
	public static SoundEvent DEEPER = SoundEvent.createVariableRangeEvent(new ResourceLocation("purediscstrickytrials", "deeper"));
	public static SoundEvent ELD_UNKNOWN = SoundEvent.createVariableRangeEvent(new ResourceLocation("purediscstrickytrials", "eld_unknown"));
	public static SoundEvent ENDLESS = SoundEvent.createVariableRangeEvent(new ResourceLocation("purediscstrickytrials", "endless"));
	public static SoundEvent FEATHERFALL = SoundEvent.createVariableRangeEvent(new ResourceLocation("purediscstrickytrials", "featherfall"));
	public static SoundEvent KOMOREBI = SoundEvent.createVariableRangeEvent(new ResourceLocation("purediscstrickytrials", "komorebi"));
	public static SoundEvent POKOPOKO = SoundEvent.createVariableRangeEvent(new ResourceLocation("purediscstrickytrials", "pokopoko"));
	public static SoundEvent PRECIPICE = SoundEvent.createVariableRangeEvent(new ResourceLocation("purediscstrickytrials", "precipice"));
	public static SoundEvent PUZZLEBOX = SoundEvent.createVariableRangeEvent(new ResourceLocation("purediscstrickytrials", "puzzlebox"));
	public static SoundEvent WATCHER = SoundEvent.createVariableRangeEvent(new ResourceLocation("purediscstrickytrials", "watcher"));
	public static SoundEvent YAKUSOKU = SoundEvent.createVariableRangeEvent(new ResourceLocation("purediscstrickytrials", "yakusoku"));

	public static void load() {
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("purediscstrickytrials", "creator"), CREATOR);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("purediscstrickytrials", "creator_music_box"), CREATOR_MUSIC_BOX);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("purediscstrickytrials", "deeper"), DEEPER);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("purediscstrickytrials", "eld_unknown"), ELD_UNKNOWN);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("purediscstrickytrials", "endless"), ENDLESS);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("purediscstrickytrials", "featherfall"), FEATHERFALL);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("purediscstrickytrials", "komorebi"), KOMOREBI);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("purediscstrickytrials", "pokopoko"), POKOPOKO);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("purediscstrickytrials", "precipice"), PRECIPICE);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("purediscstrickytrials", "puzzlebox"), PUZZLEBOX);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("purediscstrickytrials", "watcher"), WATCHER);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("purediscstrickytrials", "yakusoku"), YAKUSOKU);
	}
}
