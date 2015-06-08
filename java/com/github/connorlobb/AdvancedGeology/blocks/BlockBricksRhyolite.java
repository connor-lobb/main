package com.github.connorlobb.AdvancedGeology.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.github.connorlobb.AdvancedGeology.help.Reference;
import com.github.connorlobb.AdvancedGeology.tabs.ModTabs;

public class BlockBricksRhyolite extends Block {
	public BlockBricksRhyolite() {
		super(Material.rock);
		setBlockName("bricksRhyolite");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(ModTabs.tabAdvancedPetrology);
		setStepSound(soundTypeStone);
		setHardness(2.7F);
		setResistance(14.0F);
		setHarvestLevel("pickaxe", 0);
	}
}