package com.github.connorlobb.AdvancedGeology.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.github.connorlobb.AdvancedGeology.help.Reference;
import com.github.connorlobb.AdvancedGeology.tabs.ModTabs;

public class BlockCobblestoneDolomite extends Block {
	public BlockCobblestoneDolomite() {
		super(Material.rock);
		setBlockName("cobblestoneDolomite");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(ModTabs.tabAdvancedPetrology);
		setStepSound(soundTypeStone);
		setHardness(2.0F);
		setResistance(11.0F);
		setHarvestLevel("pickaxe", 0);
	}
}
