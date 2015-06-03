package com.github.connorlobb.AdvancedGeology.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import com.github.connorlobb.AdvancedGeology.help.Reference;
import com.github.connorlobb.AdvancedGeology.init.ModBlocks;
import com.github.connorlobb.AdvancedGeology.tabs.ModTabs;

public class BlockStoneDiorite extends Block {
	public BlockStoneDiorite() {
		super(Material.rock);
		setBlockName("stoneDiorite");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(ModTabs.tabAdvancedPetrology);
		setStepSound(soundTypeStone);
		setHardness(2.7F);
		setResistance(14.0F);
		setHarvestLevel("pickaxe", 0);
	}
	
	@Override
	public Item getItemDropped(int metadata, Random random, int fortune) {
		return Item.getItemFromBlock(ModBlocks.cobblestoneDiorite);
	}
}
