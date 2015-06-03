package com.github.connorlobb.AdvancedGeology.blocks;

import com.github.connorlobb.AdvancedGeology.help.Reference;
import com.github.connorlobb.AdvancedGeology.tabs.ModTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockFossilAnalyzer extends Block {
	public IIcon[] icons = new IIcon[6];
	public BlockFossilAnalyzer()
	{
		super(Material.iron);
		setBlockName("fossilAnalyzer");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(ModTabs.tabAdvancedPalaeontology);
		setStepSound(soundTypeMetal);
		setHardness(5.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 1);
	}
	@Override
	public IIcon getIcon(int side, int meta) {
		return this.icons[side];
	}
	@Override
	public void registerBlockIcons(IIconRegister reg) {
		for (int i = 0; i < 6; i++) {
			this.icons[i] = reg.registerIcon(this.textureName + "_" + i);
		}
	}
}
