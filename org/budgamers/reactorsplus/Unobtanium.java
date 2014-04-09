package org.budgamers.reactorsplus;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Unobtanium extends Item {

	public UO(int par1) {
		super(par1);
		
		setUnlocalizedName("unobtanium");
		setTextureName("ic2addon:unobtanium");
		setCreativeTab(CreativeTabs.tabMaterials);
	}
}
