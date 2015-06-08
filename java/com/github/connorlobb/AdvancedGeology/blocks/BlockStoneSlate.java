package com.github.connorlobb.AdvancedGeology.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import com.github.connorlobb.AdvancedGeology.help.Reference;
import com.github.connorlobb.AdvancedGeology.init.ModBlocks;
import com.github.connorlobb.AdvancedGeology.tabs.ModTabs;

public class BlockStoneSlate extends Block {
	public BlockStoneSlate() {
		super(Material.rock);
		setBlockName("stoneSlate");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(ModTabs.tabAdvancedPetrology);
		setStepSound(soundTypeStone);
		setHardness(2.1F);
		setResistance(12.0F);
		setHarvestLevel("pickaxe", 0);
	}
	
	@Override
	public Item getItemDropped(int metadata, Random random, int fortune) {
		return Item.getItemFromBlock(ModBlocks.cobblestoneSlate);
	}
}
