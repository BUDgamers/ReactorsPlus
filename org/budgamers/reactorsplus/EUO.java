package org.budgamers.reactorsplus;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class EUO extends Item {

	public EUO(int par1) {
		super(par1);
		
		setUnlocalizedName("eUnobtanium");
		setTextureName("ic2addon:unobtanium_enriched");
		setCreativeTab(CreativeTabs.tabMisc);
	}
}