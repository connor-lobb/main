package com.github.connorlobb.AdvancedGeology.blocks;

import com.github.connorlobb.AdvancedGeology.help.Reference;
import com.github.connorlobb.AdvancedGeology.tabs.ModTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCobblestoneChalk extends Block {
	public BlockCobblestoneChalk() {
		super(Material.rock);
		setBlockName("cobblestoneChalk");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(ModTabs.tabAdvancedPetrology);
		setStepSound(soundTypeStone);
		setHardness(2.0F);
		setResistance(11.0F);
		setHarvestLevel("pickaxe", 0);
	}
}
