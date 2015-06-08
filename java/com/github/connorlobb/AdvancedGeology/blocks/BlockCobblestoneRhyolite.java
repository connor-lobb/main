package com.github.connorlobb.AdvancedGeology.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.github.connorlobb.AdvancedGeology.help.Reference;
import com.github.connorlobb.AdvancedGeology.tabs.ModTabs;

public class BlockCobblestoneRhyolite extends Block {
	public BlockCobblestoneRhyolite() {
		super(Material.rock);
		setBlockName("cobblestoneRhyolite");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(ModTabs.tabAdvancedPetrology);
		setStepSound(soundTypeStone);
		setHardness(3.7F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 0);
	}
}
