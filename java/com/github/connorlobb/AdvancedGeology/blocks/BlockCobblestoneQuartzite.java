package com.github.connorlobb.AdvancedGeology.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.github.connorlobb.AdvancedGeology.help.Reference;
import com.github.connorlobb.AdvancedGeology.tabs.ModTabs;

public class BlockCobblestoneQuartzite extends Block {
	public BlockCobblestoneQuartzite() {
		super(Material.rock);
		setBlockName("cobblestoneQuartzite");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(ModTabs.tabAdvancedPetrology);
		setStepSound(soundTypeStone);
		setHardness(3.1F);
		setResistance(13.0F);
		setHarvestLevel("pickaxe", 0);
	}
}
