package com.github.connorlobb.AdvancedGeology.blocks;

import com.github.connorlobb.AdvancedGeology.help.Reference;
import com.github.connorlobb.AdvancedGeology.tabs.ModTabs;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class BlockBricksAndesite extends Block {
	public BlockBricksAndesite() {
		super(Material.rock);
		setBlockName("bricksAndesite");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(ModTabs.tabAdvancedPetrology);
		setStepSound(soundTypeStone);
		setHardness(2.7F);
		setResistance(14.0F);
		setHarvestLevel("pickaxe", 0);
	}
}