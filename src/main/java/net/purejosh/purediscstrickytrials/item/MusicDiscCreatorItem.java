
package net.purejosh.purediscstrickytrials.item;

import net.purejosh.purediscstrickytrials.init.PurediscstrickytrialsModSounds;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class MusicDiscCreatorItem extends RecordItem {
	public MusicDiscCreatorItem() {
		super(1, PurediscstrickytrialsModSounds.CREATOR, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3480);
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(content -> content.accept(this));
	}
}
