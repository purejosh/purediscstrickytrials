
package net.purejosh.purediscstrickytrials.item;

import net.purejosh.purediscstrickytrials.init.PurediscstrickytrialsModSounds;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class MusicDiscPrecipiceItem extends RecordItem {
	public MusicDiscPrecipiceItem() {
		super(9, PurediscstrickytrialsModSounds.PRECIPICE, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 100);
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(content -> content.accept(this));
	}
}
