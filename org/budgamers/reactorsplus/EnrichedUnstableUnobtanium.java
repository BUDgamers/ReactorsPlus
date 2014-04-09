package org.budgamers.reactorsplus;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class EnrichedUnstableUnobtanium extends Item {

	public EnrichedUnstableUnobtanium(int par1) {
		super(par1);
		
		setUnlocalizedName("euUnobtanium");
		setTextureName("ic2addon:unobtanium_unstable");
		setCreativeTab(CreativeTabs.tabMisc);
	}

}
