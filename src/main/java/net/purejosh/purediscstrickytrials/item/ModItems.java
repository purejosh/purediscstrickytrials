package net.purejosh.purediscstrickytrials.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.purejosh.purediscstrickytrials.PureDiscsTrickyTrials;
import net.purejosh.purediscstrickytrials.sound.ModJukeboxSongs;

public class ModItems {
    // Discs
	public static final Item MUSIC_DISC_DEEPER = register("music_disc_deeper", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.DEEPER)));
	public static final Item MUSIC_DISC_ELD_UNKNOWN = register("music_disc_eld_unknown", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ELD_UNKNOWN)));
	public static final Item MUSIC_DISC_ENDLESS = register("music_disc_endless", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.ENDLESS)));
	public static final Item MUSIC_DISC_FEATHERFALL = register("music_disc_featherfall", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.FEATHERFALL)));
	public static final Item MUSIC_DISC_KOMOREBI = register("music_disc_komorebi", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.KOMOREBI)));
	public static final Item MUSIC_DISC_POKOPOKO = register("music_disc_pokopoko", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.POKOPOKO)));
	public static final Item MUSIC_DISC_PUZZLEBOX = register("music_disc_puzzlebox", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.PUZZLEBOX)));
	public static final Item MUSIC_DISC_WATCHER = register("music_disc_watcher", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.WATCHER)));
	public static final Item MUSIC_DISC_YAKUSOKU = register("music_disc_yakusoku", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.YAKUSOKU)));

	// Helper method for registering an item.
	public static Item register(String id, Item item) {
		return Registry.register(Registries.ITEM, Identifier.of(PureDiscsTrickyTrials.MOD_ID, id), item);
	}

	// Class initializer called from the entrypoint.
	public static void init() {
	}
}