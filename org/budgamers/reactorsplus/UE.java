package org.budgamers.reactorsplus;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ic2.api.item.Items;
import ic2.api.reactor.IReactor;
import ic2.api.reactor.IReactorComponent;

public class UE extends Item implements IReactorComponent {

	public UE(int par1) {
		super(par1);
		
		setUnlocalizedName("unobtaniumE");
		setTextureName("ic2addon:unobtanium_evaporator");
		setCreativeTab(CreativeTabs.tabMisc);
	}

	@Override
	public void processChamber(IReactor reactor, ItemStack yourStack, int x, int y, boolean heatrun) {
		if(reactor.getItemAt(x + 1, y) == Items.getItem("reactorUraniumQuad")) {
			reactor.addHeat(-1000);
		} else if(reactor.getItemAt(x - 1, y) == Items.getItem("reactorUraniumQuad")) {
			reactor.addHeat(-1000);
		} else if(reactor.getItemAt(x, y + 1) == Items.getItem("reactorUraniumQuad")) {
			reactor.addHeat(-1000);
		} else if(reactor.getItemAt(x, y - 1) == Items.getItem("reactorUraniumQuad")) {
			reactor.addHeat(-1000);
		}
		
		reactor.addHeat(-1000);
	}

	@Override
	public boolean acceptUraniumPulse(IReactor reactor, ItemStack yourStack, ItemStack pulsingStack, int youX, int youY, int pulseX, int pulseY, boolean heatrun) {
		return false;
	}

	@Override
	public boolean canStoreHeat(IReactor reactor, ItemStack yourStack, int x, int y) {
		return false;
	}

	@Override
	public int getMaxHeat(IReactor reactor, ItemStack yourStack, int x, int y) {
		return 0;
	}

	@Override
	public int getCurrentHeat(IReactor reactor, ItemStack yourStack, int x, int y) {
		return 0;
	}

	@Override
	public int alterHeat(IReactor reactor, ItemStack yourStack, int x, int y, int heat) {
		return 0;
	}

	@Override
	public float influenceExplosion(IReactor reactor, ItemStack yourStack) {
		return 0;
	}

}
