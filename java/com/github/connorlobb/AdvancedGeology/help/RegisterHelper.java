package com.github.connorlobb.AdvancedGeology.help;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class RegisterHelper {
	//How minecraft registers blocks and items
	public static void registerBlock(Block block)
	{
		//What will the block's technical name be?
		GameRegistry.registerBlock(block, Reference.MODID + block.getUnlocalizedName().substring(5));
	}
	public static void registerItem(Item item)
	{
		//What will the item's technical name be?
		GameRegistry.registerItem(item, Reference.MODID + item.getUnlocalizedName().substring(5));
	}
}
