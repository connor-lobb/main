package com.github.connorlobb.AdvancedGeology.tabs;

import net.minecraft.creativetab.CreativeTabs;

public class ModTabs {
	//Creates technical name for new creative tabs
	public static CreativeTabs tabAdvancedPetrology = new AdvancedGeologyTab(CreativeTabs.getNextID(),"tabAdvancedPetrology");
	public static CreativeTabs tabAdvancedMineralogy = new AdvancedGeologyTab(CreativeTabs.getNextID(),"tabAdvancedMineralogy");
	public static CreativeTabs tabAdvancedPalaeontology = new AdvancedGeologyTab(CreativeTabs.getNextID(), "tabAdvancedPalaeontology");
}
