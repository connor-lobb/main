package com.github.connorlobb.AdvancedGeology.blocks;

import com.github.connorlobb.AdvancedGeology.help.Reference;
import com.github.connorlobb.AdvancedGeology.tabs.ModTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCobblestoneAndesite extends Block {
	public BlockCobblestoneAndesite() {
		super(Material.rock);
		setBlockName("cobblestoneAndesite");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(ModTabs.tabAdvancedPetrology);
		setStepSound(soundTypeStone);
		setHardness(3.7F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 0);
	}
}
