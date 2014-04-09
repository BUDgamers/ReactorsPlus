package org.budgamers.reactorsplus;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ExtremeCircuit extends Item {
	
	public ExtremeCircuit(int par1) {
		super(par1);
		
		setUnlocalizedName("extremeCircuit");
		setTextureName("ic2addon:extreme_circuit");
		setCreativeTab(CreativeTabs.tabMisc);
	}
}
