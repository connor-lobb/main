package com.github.connorlobb.AdvancedGeology.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.github.connorlobb.AdvancedGeology.help.Reference;
import com.github.connorlobb.AdvancedGeology.tabs.ModTabs;

public class BlockBricksQuartzite extends Block {
	public BlockBricksQuartzite() {
		super(Material.rock);
		setBlockName("bricksQuartzite");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(ModTabs.tabAdvancedPetrology);
		setStepSound(soundTypeStone);
		setHardness(2.1F);
		setResistance(12.0F);
		setHarvestLevel("pickaxe", 0);
	}
}