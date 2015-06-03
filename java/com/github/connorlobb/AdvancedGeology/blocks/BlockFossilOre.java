package com.github.connorlobb.AdvancedGeology.blocks;

import java.util.Random;

import com.github.connorlobb.AdvancedGeology.help.Reference;
import com.github.connorlobb.AdvancedGeology.init.ModItems;
import com.github.connorlobb.AdvancedGeology.tabs.ModTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
public class BlockFossilOre extends Block {
	public BlockFossilOre()
	{
		super(Material.rock);
		setBlockName("fossilOre");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(ModTabs.tabAdvancedPalaeontology);
		setStepSound(soundTypeStone);
		setHardness(3.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 1);
	}
	@Override
	public Item getItemDropped (int metadata, Random random, int fortune)
	{
		return ModItems.fossil;
	}
}
