package net.purejosh.purediscstrickytrials.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;

public class ModItemGroups {

    public static void init() {
        // Discs
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
                Items.MUSIC_DISC_PIGSTEP.getDefaultStack(), ModItems.MUSIC_DISC_DEEPER.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
            ModItems.MUSIC_DISC_DEEPER.getDefaultStack(), ModItems.MUSIC_DISC_ELD_UNKNOWN.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
            ModItems.MUSIC_DISC_ELD_UNKNOWN.getDefaultStack(), ModItems.MUSIC_DISC_ENDLESS.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
            ModItems.MUSIC_DISC_ENDLESS.getDefaultStack(), ModItems.MUSIC_DISC_FEATHERFALL.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
            ModItems.MUSIC_DISC_FEATHERFALL.getDefaultStack(), ModItems.MUSIC_DISC_KOMOREBI.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
            ModItems.MUSIC_DISC_KOMOREBI.getDefaultStack(), ModItems.MUSIC_DISC_POKOPOKO.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
            ModItems.MUSIC_DISC_POKOPOKO.getDefaultStack(), ModItems.MUSIC_DISC_PUZZLEBOX.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
            ModItems.MUSIC_DISC_PUZZLEBOX.getDefaultStack(), ModItems.MUSIC_DISC_WATCHER.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
            ModItems.MUSIC_DISC_WATCHER.getDefaultStack(), ModItems.MUSIC_DISC_YAKUSOKU.getDefaultStack()));
    }
}
