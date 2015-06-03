package com.github.connorlobb.AdvancedGeology.blocks;

import java.util.Random;

import com.github.connorlobb.AdvancedGeology.help.Reference;
import com.github.connorlobb.AdvancedGeology.init.ModBlocks;
import com.github.connorlobb.AdvancedGeology.tabs.ModTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockStoneChalk extends Block {
	public BlockStoneChalk() {
		super(Material.rock);
		setBlockName("stoneChalk");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(ModTabs.tabAdvancedPetrology);
		setStepSound(soundTypeStone);
		setHardness(1.5F);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", 0);
	}
	
	@Override
	public Item getItemDropped(int metadata, Random random, int fortune) {
		return Item.getItemFromBlock(ModBlocks.cobblestoneChalk);
	}
}
