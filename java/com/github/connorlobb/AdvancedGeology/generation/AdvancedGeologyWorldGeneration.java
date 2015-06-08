package com.github.connorlobb.AdvancedGeology.generation;

import java.util.Random;

import com.github.connorlobb.AdvancedGeology.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class AdvancedGeologyWorldGeneration implements IWorldGenerator {
	
	//Define generation method
	
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		
		//Dimension value and chunk size
		
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);
		case 1:
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
		}
	}
	
	//Adding new things to the world generator
	
	private void generateSurface(World world, Random random, int x, int z) {
		//Overworld dimension world generation
		//Sedimetary
		addOreSpawn(ModBlocks.stoneChalk, world, random, x, z, 16, 16, 40 + random.nextInt(20), 10, 60, 128);
		addOreSpawn(ModBlocks.stoneChert, world, random, x, z, 16, 16, 40 + random.nextInt(20), 10, 60, 128);
		addOreSpawn(ModBlocks.stoneClaystone, world, random, x, z, 16, 16, 40 + random.nextInt(20), 10, 60, 128);
		addOreSpawn(ModBlocks.stoneConglomerate, world, random, x, z, 16, 16, 40 + random.nextInt(20), 10, 60, 128);
		addOreSpawn(ModBlocks.stoneDolomite, world, random, x, z, 16, 16, 40 + random.nextInt(20), 10, 60, 128);
		addOreSpawn(ModBlocks.stoneLimestone, world, random, x, z, 16, 16, 40 + random.nextInt(20), 10, 60, 128);
		addOreSpawn(ModBlocks.stoneRockSalt, world, random, x, z, 16, 16, 40 + random.nextInt(20), 10, 60, 128);
		//Shale
		//Metamorphic
		addOreSpawn(ModBlocks.stoneGneiss, world, random, x, z, 16, 16, 40 + random.nextInt(20), 15, 30, 128);
		addOreSpawn(ModBlocks.stoneMarble, world, random, x, z, 16, 16, 40 + random.nextInt(20), 15, 30, 128);
		addOreSpawn(ModBlocks.stonePhyllite, world, random, x, z, 16, 16, 40 + random.nextInt(20), 15, 30, 128);
		addOreSpawn(ModBlocks.stoneQuartzite, world, random, x, z, 16, 16, 40 + random.nextInt(20), 15, 30, 128);
		//Schist
		//Slate
		//Igneous
		addOreSpawn(ModBlocks.stoneAndesite, world, random, x, z, 16, 16, 40 + random.nextInt(20), 20, 1, 128);
		addOreSpawn(ModBlocks.stoneBasalt, world, random, x, z, 16, 16, 40 + random.nextInt(20), 20, 1, 128);
		addOreSpawn(ModBlocks.stoneDacite, world, random, x, z, 16, 16, 40 + random.nextInt(20), 20, 1, 128);
		addOreSpawn(ModBlocks.stoneDiorite, world, random, x, z, 16, 16, 40 + random.nextInt(20), 20, 1, 128);
		addOreSpawn(ModBlocks.stoneGabbro, world, random, x, z, 16, 16, 40 + random.nextInt(20), 20, 1, 128);
		addOreSpawn(ModBlocks.stoneGranite, world, random, x, z, 16, 16, 40 + random.nextInt(20), 20, 1, 128);
		addOreSpawn(ModBlocks.stoneRhyolite, world, random, x, z, 16, 16, 40 + random.nextInt(20), 20, 1, 128);
		//Vanilla Stuff
		addOreSpawn(Blocks.coal_ore, world, random, x, z, 16, 16, 10 + random.nextInt(10), 15, 1, 128);
		addOreSpawn(Blocks.diamond_ore, world, random, x, z, 16, 16, 3 + random.nextInt(5), 1, 1, 16);
		addOreSpawn(Blocks.gold_ore, world, random, x, z, 16, 16, 4 + random.nextInt(4), 2, 1, 32);
		addOreSpawn(Blocks.iron_ore, world, random, x, z, 16, 16, 4 + random.nextInt(6), 15, 1, 63);
		addOreSpawn(Blocks.lapis_ore, world, random, x, z, 16, 16, 2 + random.nextInt(6), 3, 13, 16);
		addOreSpawn(Blocks.redstone_ore, world, random, x, z, 16, 16, 4 + random.nextInt(4), 4, 1, 16);
		addOreSpawn(Blocks.dirt, world, random, x, z, 16, 16, 32 + random.nextInt(40), 5, 1, 128);
		addOreSpawn(Blocks.gravel, world, random, x, z, 16, 16, 32 + random.nextInt(40), 5, 1, 128);
		//Ore
		addOreSpawn(ModBlocks.fossilOre, world, random, x, z, 16, 16, 2 + random.nextInt(6), 8, 1, 60);
	}
	private void generateNether(World world, Random random, int x, int z) {
		//Nether dimension world generation
	}
	private void generateEnd(World world, Random random, int x, int z) {
		//End dimension world generation
	}
	private void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chanceToSpawn, int minY, int maxY) {
		for (int i = 0; i < chanceToSpawn; i++) {
			//How ores spawn (size, location)
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(maxY - minY);
			int posZ = blockZPos + random.nextInt(maxZ);
			new WorldGenMinable(block, maxVeinSize).generate(world, random, posX, posY, posZ);
		}
	}
}
