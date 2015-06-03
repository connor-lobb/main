package com.github.connorlobb.AdvancedGeology.init;

import com.github.connorlobb.AdvancedGeology.help.RegisterHelper;
import com.github.connorlobb.AdvancedGeology.items.AdvancedGeologyItem;

import net.minecraft.item.Item;

public class ModItems {
	//Defines item values
	public static Item fossil = new AdvancedGeologyItem().setUnlocalizedName("fossil");
	public static void init()
	{
		//Creates item's technical name
		RegisterHelper.registerItem(fossil);
	}

}
