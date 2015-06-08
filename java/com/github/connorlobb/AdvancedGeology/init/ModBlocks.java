package com.github.connorlobb.AdvancedGeology.init;

import net.minecraft.block.Block;

import com.github.connorlobb.AdvancedGeology.blocks.BlockBricksAndesite;
import com.github.connorlobb.AdvancedGeology.blocks.BlockBricksBasalt;
import com.github.connorlobb.AdvancedGeology.blocks.BlockBricksChalk;
import com.github.connorlobb.AdvancedGeology.blocks.BlockBricksChert;
import com.github.connorlobb.AdvancedGeology.blocks.BlockBricksClaystone;
import com.github.connorlobb.AdvancedGeology.blocks.BlockBricksConglomerate;
import com.github.connorlobb.AdvancedGeology.blocks.BlockBricksDacite;
import com.github.connorlobb.AdvancedGeology.blocks.BlockBricksDiorite;
import com.github.connorlobb.AdvancedGeology.blocks.BlockBricksDolomite;
import com.github.connorlobb.AdvancedGeology.blocks.BlockBricksGabbro;
import com.github.connorlobb.AdvancedGeology.blocks.BlockBricksGneiss;
import com.github.connorlobb.AdvancedGeology.blocks.BlockBricksGranite;
import com.github.connorlobb.AdvancedGeology.blocks.BlockBricksLimestone;
import com.github.connorlobb.AdvancedGeology.blocks.BlockBricksMarble;
import com.github.connorlobb.AdvancedGeology.blocks.BlockBricksPhyllite;
import com.github.connorlobb.AdvancedGeology.blocks.BlockBricksQuartzite;
import com.github.connorlobb.AdvancedGeology.blocks.BlockBricksRhyolite;
import com.github.connorlobb.AdvancedGeology.blocks.BlockCobblestoneAndesite;
import com.github.connorlobb.AdvancedGeology.blocks.BlockCobblestoneBasalt;
import com.github.connorlobb.AdvancedGeology.blocks.BlockCobblestoneChalk;
import com.github.connorlobb.AdvancedGeology.blocks.BlockCobblestoneChert;
import com.github.connorlobb.AdvancedGeology.blocks.BlockCobblestoneClaystone;
import com.github.connorlobb.AdvancedGeology.blocks.BlockCobblestoneConglomerate;
import com.github.connorlobb.AdvancedGeology.blocks.BlockCobblestoneDacite;
import com.github.connorlobb.AdvancedGeology.blocks.BlockCobblestoneDiorite;
import com.github.connorlobb.AdvancedGeology.blocks.BlockCobblestoneDolomite;
import com.github.connorlobb.AdvancedGeology.blocks.BlockCobblestoneGabbro;
import com.github.connorlobb.AdvancedGeology.blocks.BlockCobblestoneGneiss;
import com.github.connorlobb.AdvancedGeology.blocks.BlockCobblestoneGranite;
import com.github.connorlobb.AdvancedGeology.blocks.BlockCobblestoneLimestone;
import com.github.connorlobb.AdvancedGeology.blocks.BlockCobblestoneMarble;
import com.github.connorlobb.AdvancedGeology.blocks.BlockCobblestonePhyllite;
import com.github.connorlobb.AdvancedGeology.blocks.BlockCobblestoneQuartzite;
import com.github.connorlobb.AdvancedGeology.blocks.BlockCobblestoneRhyolite;
import com.github.connorlobb.AdvancedGeology.blocks.BlockFossilAnalyzer;
import com.github.connorlobb.AdvancedGeology.blocks.BlockFossilOre;
import com.github.connorlobb.AdvancedGeology.blocks.BlockStoneAndesite;
import com.github.connorlobb.AdvancedGeology.blocks.BlockStoneBasalt;
import com.github.connorlobb.AdvancedGeology.blocks.BlockStoneChalk;
import com.github.connorlobb.AdvancedGeology.blocks.BlockStoneChert;
import com.github.connorlobb.AdvancedGeology.blocks.BlockStoneClaystone;
import com.github.connorlobb.AdvancedGeology.blocks.BlockStoneConglomerate;
import com.github.connorlobb.AdvancedGeology.blocks.BlockStoneDacite;
import com.github.connorlobb.AdvancedGeology.blocks.BlockStoneDiorite;
import com.github.connorlobb.AdvancedGeology.blocks.BlockStoneDolomite;
import com.github.connorlobb.AdvancedGeology.blocks.BlockStoneGabbro;
import com.github.connorlobb.AdvancedGeology.blocks.BlockStoneGneiss;
import com.github.connorlobb.AdvancedGeology.blocks.BlockStoneGranite;
import com.github.connorlobb.AdvancedGeology.blocks.BlockStoneLimestone;
import com.github.connorlobb.AdvancedGeology.blocks.BlockStoneMarble;
import com.github.connorlobb.AdvancedGeology.blocks.BlockStonePhyllite;
import com.github.connorlobb.AdvancedGeology.blocks.BlockStoneQuartzite;
import com.github.connorlobb.AdvancedGeology.blocks.BlockStoneRhyolite;
import com.github.connorlobb.AdvancedGeology.help.RegisterHelper;

public class ModBlocks {
	//What class file defines the new blocks?
	public static Block fossilOre = new BlockFossilOre();
	public static Block fossilAnalyzer = new BlockFossilAnalyzer();
	public static Block stoneAndesite = new BlockStoneAndesite();
	public static Block stoneBasalt = new BlockStoneBasalt();
	public static Block stoneChalk = new BlockStoneChalk();
	public static Block stoneChert = new BlockStoneChert();
	public static Block stoneClaystone = new BlockStoneClaystone();
	public static Block stoneConglomerate = new BlockStoneConglomerate();
	public static Block stoneDacite = new BlockStoneDacite();
	public static Block stoneDiorite = new BlockStoneDiorite();
	public static Block stoneDolomite = new BlockStoneDolomite();
	public static Block stoneGabbro = new BlockStoneGabbro();
	public static Block stoneGneiss = new BlockStoneGneiss();
	public static Block stoneGranite = new BlockStoneGranite();
	public static Block stoneLimestone = new BlockStoneLimestone();
	public static Block stoneMarble = new BlockStoneMarble();
	public static Block stonePhyllite = new BlockStonePhyllite();
	public static Block stoneQuartzite = new BlockStoneQuartzite();
	public static Block stoneRhyolite = new BlockStoneRhyolite();
	public static Block cobblestoneAndesite = new BlockCobblestoneAndesite();
	public static Block cobblestoneBasalt = new BlockCobblestoneBasalt();
	public static Block cobblestoneChalk = new BlockCobblestoneChalk();
	public static Block cobblestoneChert = new BlockCobblestoneChert();
	public static Block cobblestoneClaystone = new BlockCobblestoneClaystone();
	public static Block cobblestoneConglomerate = new BlockCobblestoneConglomerate();
	public static Block cobblestoneDacite = new BlockCobblestoneDacite();
	public static Block cobblestoneDiorite = new BlockCobblestoneDiorite();
	public static Block cobblestoneDolomite = new BlockCobblestoneDolomite();
	public static Block cobblestoneGabbro = new BlockCobblestoneGabbro();
	public static Block cobblestoneGneiss = new BlockCobblestoneGneiss();
	public static Block cobblestoneGranite = new BlockCobblestoneGranite();
	public static Block cobblestoneLimestone = new BlockCobblestoneLimestone();
	public static Block cobblestoneMarble = new BlockCobblestoneMarble();
	public static Block cobblestonePhyllite = new BlockCobblestonePhyllite();
	public static Block cobblestoneQuartzite = new BlockCobblestoneQuartzite();
	public static Block cobblestoneRhyolite = new BlockCobblestoneRhyolite();
	public static Block bricksAndesite = new BlockBricksAndesite();
	public static Block bricksBasalt = new BlockBricksBasalt();
	public static Block bricksChalk = new BlockBricksChalk();
	public static Block bricksChert = new BlockBricksChert();
	public static Block bricksClaystone = new BlockBricksClaystone();
	public static Block bricksConglomerate = new BlockBricksConglomerate();
	public static Block bricksDacite = new BlockBricksDacite();
	public static Block bricksDiorite = new BlockBricksDiorite();
	public static Block bricksDolomite = new BlockBricksDolomite();
	public static Block bricksGabbro = new BlockBricksGabbro();
	public static Block bricksGneiss = new BlockBricksGneiss();
	public static Block bricksGranite = new BlockBricksGranite();
	public static Block bricksLimestone = new BlockBricksLimestone();
	public static Block bricksMarble = new BlockBricksMarble();
	public static Block bricksPhyllite = new BlockBricksPhyllite();
	public static Block bricksQuartzite = new BlockBricksQuartzite();
	public static Block bricksRhyolite = new BlockBricksRhyolite();
	public static void init()
	{
		//Creates block's technical name
		RegisterHelper.registerBlock(fossilOre);
		RegisterHelper.registerBlock(fossilAnalyzer);
		RegisterHelper.registerBlock(stoneAndesite);
		RegisterHelper.registerBlock(stoneBasalt);
		RegisterHelper.registerBlock(stoneChalk);
		RegisterHelper.registerBlock(stoneChert);
		RegisterHelper.registerBlock(stoneClaystone);
		RegisterHelper.registerBlock(stoneConglomerate);
		RegisterHelper.registerBlock(stoneDacite);
		RegisterHelper.registerBlock(stoneDiorite);
		RegisterHelper.registerBlock(stoneDolomite);
		RegisterHelper.registerBlock(stoneGabbro);
		RegisterHelper.registerBlock(stoneGneiss);
		RegisterHelper.registerBlock(stoneGranite);
		RegisterHelper.registerBlock(stoneLimestone);
		RegisterHelper.registerBlock(stoneMarble);
		RegisterHelper.registerBlock(stonePhyllite);
		RegisterHelper.registerBlock(stoneQuartzite);
		RegisterHelper.registerBlock(stoneRhyolite);
		RegisterHelper.registerBlock(cobblestoneAndesite);
		RegisterHelper.registerBlock(cobblestoneBasalt);
		RegisterHelper.registerBlock(cobblestoneChalk);
		RegisterHelper.registerBlock(cobblestoneChert);
		RegisterHelper.registerBlock(cobblestoneClaystone);
		RegisterHelper.registerBlock(cobblestoneConglomerate);
		RegisterHelper.registerBlock(cobblestoneDacite);
		RegisterHelper.registerBlock(cobblestoneDiorite);
		RegisterHelper.registerBlock(cobblestoneDolomite);
		RegisterHelper.registerBlock(cobblestoneGabbro);
		RegisterHelper.registerBlock(cobblestoneGneiss);
		RegisterHelper.registerBlock(cobblestoneGranite);
		RegisterHelper.registerBlock(cobblestoneLimestone);
		RegisterHelper.registerBlock(cobblestoneMarble);
		RegisterHelper.registerBlock(cobblestonePhyllite);
		RegisterHelper.registerBlock(cobblestoneQuartzite);
		RegisterHelper.registerBlock(cobblestoneRhyolite);
		RegisterHelper.registerBlock(bricksAndesite);
		RegisterHelper.registerBlock(bricksBasalt);
		RegisterHelper.registerBlock(bricksChalk);
		RegisterHelper.registerBlock(bricksChert);
		RegisterHelper.registerBlock(bricksClaystone);
		RegisterHelper.registerBlock(bricksConglomerate);
		RegisterHelper.registerBlock(bricksDacite);
		RegisterHelper.registerBlock(bricksDiorite);
		RegisterHelper.registerBlock(bricksDolomite);
		RegisterHelper.registerBlock(bricksGabbro);
		RegisterHelper.registerBlock(bricksGneiss);
		RegisterHelper.registerBlock(bricksGranite);
		RegisterHelper.registerBlock(bricksLimestone);
		RegisterHelper.registerBlock(bricksMarble);
		RegisterHelper.registerBlock(bricksPhyllite);
		RegisterHelper.registerBlock(bricksQuartzite);
		RegisterHelper.registerBlock(bricksRhyolite);
	}
}
