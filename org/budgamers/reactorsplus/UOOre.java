package org.budgamers.reactorsplus;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class UOOre extends Block {

	public UOOre(int par1, Material par2Material) {
		super(par1, par2Material);
		
		setUnlocalizedName("oUnobtanium");
		setTextureName("ic2addon:unobtanium_ore");
		setResistance(1000.0F);
		setHardness(25.0F);
		setCreativeTab(CreativeTabs.tabBlock);
	}

}
