package org.budgamers.reactorsplus;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class UOOreGenerator implements IWorldGenerator {

	public int[][][] structure = new int[2][2][2];
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId) {
		case 0: generateSurface(random, chunkX, chunkZ, world); break;
		}
	}
	
	private void generateSurface(Random random, int chunkX, int chunkZ, World world) {
		for(int i = 0; i < 1; i++) {
			int xPos = (chunkX * 16) + random.nextInt(16);
			int yPos = random.nextInt(16);
			int zPos = (chunkZ * 16) + random.nextInt(16);
			
			world.setBlock(xPos, yPos, zPos, IC2Addon.unobtaniumOreID);
			System.out.println(xPos + " " + yPos + " " + zPos);
		}
	}
}