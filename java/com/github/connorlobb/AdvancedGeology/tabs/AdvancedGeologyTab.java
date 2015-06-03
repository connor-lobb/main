package com.github.connorlobb.AdvancedGeology.tabs;

import com.github.connorlobb.AdvancedGeology.generation.AdvancedGeologyWorldGeneration;
import com.github.connorlobb.AdvancedGeology.init.ModItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class AdvancedGeologyTab extends CreativeTabs {
	String name;
	
	public AdvancedGeologyTab(int par1, String par2Str)
	{
		//Defines the new creative tab's name
		super(par1, par2Str);
		this.name = par2Str;
	}
	
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem()
	{
		//Defines the new creative tabs
		if (this.name == "tabAdvancedPetrology")
		{
			return Items.flint;
		}
		else if (this.name == "tabAdvancedMineralogy")
		{
			return Items.diamond;
		}
		else if (this.name == "tabAdvancedPalaeontology")
		{
			return ModItems.fossil;
		}
		return null;
	}
}
