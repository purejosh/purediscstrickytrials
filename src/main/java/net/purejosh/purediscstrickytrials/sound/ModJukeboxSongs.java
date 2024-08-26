package net.purejosh.purediscstrickytrials.sound;

import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.purejosh.purediscstrickytrials.PureDiscsTrickyTrials;

public interface ModJukeboxSongs {

    RegistryKey<JukeboxSong> DEEPER = of("deeper");
    RegistryKey<JukeboxSong> ELD_UNKNOWN = of("eld_unknown");
    RegistryKey<JukeboxSong> ENDLESS = of("endless");
    RegistryKey<JukeboxSong> FEATHERFALL = of("featherfall");
    RegistryKey<JukeboxSong> KOMOREBI = of("komorebi");
    RegistryKey<JukeboxSong> POKOPOKO = of("pokopoko");
    RegistryKey<JukeboxSong> PUZZLEBOX = of("puzzlebox");
    RegistryKey<JukeboxSong> WATCHER = of("watcher");
    RegistryKey<JukeboxSong> YAKUSOKU = of("yakusoku");

    private static RegistryKey<JukeboxSong> of(String id) {
        return RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(PureDiscsTrickyTrials.MOD_ID, id));
    }
}
