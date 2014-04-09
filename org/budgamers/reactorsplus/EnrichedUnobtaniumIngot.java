package org.budgamers.reactorsplus;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class EnrichedUnobtaniumIngot extends Item {

	public EnrichedUnobtaniumIngot(int par1) {
		super(par1);
		
		setUnlocalizedName("eUnobtaniumI");
		setTextureName("ic2addon:unobtanium_ingot");
		setCreativeTab(CreativeTabs.tabMisc);
	}
}