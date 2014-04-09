package org.budgamers.reactorsplus;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class EnrichedUnobtanium extends Item {

	public EnrichedUnobtanium(int par1) {
		super(par1);
		
		setUnlocalizedName("eUnobtanium");
		setTextureName("ic2addon:unobtanium_enriched");
		setCreativeTab(CreativeTabs.tabMisc);
	}
}