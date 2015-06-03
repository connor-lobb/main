package com.github.connorlobb.AdvancedGeology;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

import com.github.connorlobb.AdvancedGeology.crafting.Recipes;
import com.github.connorlobb.AdvancedGeology.generation.AdvancedGeologyWorldGeneration;
import com.github.connorlobb.AdvancedGeology.help.Reference;
import com.github.connorlobb.AdvancedGeology.init.ModBlocks;
import com.github.connorlobb.AdvancedGeology.init.ModItems;

//Letting startup sequence know what mod this is

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class AdvancedGeology {
	
	//New initialization sequence
	
	@Instance(Reference.MODID)
	public static AdvancedGeology instance;
	AdvancedGeologyWorldGeneration eventWorldGen = new AdvancedGeologyWorldGeneration();
	
	//Run the following classes
	
	@Mod.EventHandler
	//Step one
	public void preInit(FMLPreInitializationEvent event)
	{
		ModItems.init();
		ModBlocks.init();
		GameRegistry.registerWorldGenerator(this.eventWorldGen, 0);
	}
	
	@Mod.EventHandler
	//Step two
	public void Init(FMLInitializationEvent event)
	{
		Recipes.init();
	}
	
	@Mod.EventHandler
	//Step three
	public void PostInit(FMLPostInitializationEvent event)
	{
		
	}

}
