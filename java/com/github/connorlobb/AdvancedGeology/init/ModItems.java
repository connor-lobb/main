package com.github.connorlobb.AdvancedGeology.init;

import com.github.connorlobb.AdvancedGeology.help.RegisterHelper;
import com.github.connorlobb.AdvancedGeology.items.AdvancedGeologyAxe;
import com.github.connorlobb.AdvancedGeology.items.AdvancedGeologyHoe;
import com.github.connorlobb.AdvancedGeology.items.AdvancedGeologyItem;
import com.github.connorlobb.AdvancedGeology.items.AdvancedGeologyPickaxe;
import com.github.connorlobb.AdvancedGeology.items.AdvancedGeologyShovel;
import com.github.connorlobb.AdvancedGeology.items.AdvancedGeologySword;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	//Defines tool stats
	public static Item.ToolMaterial ANDESITE = EnumHelper.addToolMaterial("ANDESITE", 1, 232, 2.9F, 2.6F, 6);
	public static Item.ToolMaterial BASALT = EnumHelper.addToolMaterial("BASALT", 1, 232, 2.9F, 2.6F, 6);
	public static Item.ToolMaterial CHALK = EnumHelper.addToolMaterial("CHALK", 1, 172, 2.3F, 2.3F, 10);
	public static Item.ToolMaterial CHERT = EnumHelper.addToolMaterial("CHERT", 1, 172, 2.3F, 2.3F, 10);
	//Defines item values
	public static Item fossil = new AdvancedGeologyItem().setUnlocalizedName("fossil");
	public static Item andesitePickaxe = new AdvancedGeologyPickaxe(ANDESITE).setUnlocalizedName("andesitePickaxe");
	public static Item andesiteSword = new AdvancedGeologySword(ANDESITE).setUnlocalizedName("andesiteSword");
	public static Item andesiteAxe = new AdvancedGeologyAxe(ANDESITE).setUnlocalizedName("andesiteAxe");
	public static Item andesiteShovel = new AdvancedGeologyShovel(ANDESITE).setUnlocalizedName("andesiteShovel");
	public static Item andesiteHoe = new AdvancedGeologyHoe(ANDESITE).setUnlocalizedName("andesiteHoe");
	public static Item basaltPickaxe = new AdvancedGeologyPickaxe(BASALT).setUnlocalizedName("basaltPickaxe");
	public static Item basaltSword = new AdvancedGeologySword(BASALT).setUnlocalizedName("basaltSword");
	public static Item basaltAxe = new AdvancedGeologyAxe(BASALT).setUnlocalizedName("basaltAxe");
	public static Item basaltShovel = new AdvancedGeologyShovel(BASALT).setUnlocalizedName("basaltShovel");
	public static Item basaltHoe = new AdvancedGeologyHoe(BASALT).setUnlocalizedName("basaltHoe");
	public static Item chalkPickaxe = new AdvancedGeologyPickaxe(CHALK).setUnlocalizedName("chalkPickaxe");
	public static Item chalkSword = new AdvancedGeologySword(CHALK).setUnlocalizedName("chalkSword");
	public static Item chalkAxe = new AdvancedGeologyAxe(CHALK).setUnlocalizedName("chalkAxe");
	public static Item chalkShovel = new AdvancedGeologyShovel(CHALK).setUnlocalizedName("chalkShovel");
	public static Item chalkHoe = new AdvancedGeologyHoe(CHALK).setUnlocalizedName("chalkHoe");
	public static Item chertPickaxe = new AdvancedGeologyPickaxe(CHERT).setUnlocalizedName("chertPickaxe");
	public static Item chertSword = new AdvancedGeologySword(CHERT).setUnlocalizedName("chertSword");
	public static Item chertAxe = new AdvancedGeologyAxe(CHERT).setUnlocalizedName("chertAxe");
	public static Item chertShovel = new AdvancedGeologyShovel(CHERT).setUnlocalizedName("chertShovel");
	public static Item chertHoe = new AdvancedGeologyHoe(CHERT).setUnlocalizedName("chertHoe");
	public static void init()
	{
		//Creates item's technical name
		RegisterHelper.registerItem(fossil);
		RegisterHelper.registerItem(andesitePickaxe);
		RegisterHelper.registerItem(andesiteSword);
		RegisterHelper.registerItem(andesiteAxe);
		RegisterHelper.registerItem(andesiteShovel);
		RegisterHelper.registerItem(andesiteHoe);
		RegisterHelper.registerItem(basaltPickaxe);
		RegisterHelper.registerItem(basaltSword);
		RegisterHelper.registerItem(basaltAxe);
		RegisterHelper.registerItem(basaltShovel);
		RegisterHelper.registerItem(basaltHoe);
		RegisterHelper.registerItem(chalkPickaxe);
		RegisterHelper.registerItem(chalkSword);
		RegisterHelper.registerItem(chalkAxe);
		RegisterHelper.registerItem(chalkShovel);
		RegisterHelper.registerItem(chalkHoe);
		RegisterHelper.registerItem(chertPickaxe);
		RegisterHelper.registerItem(chertSword);
		RegisterHelper.registerItem(chertAxe);
		RegisterHelper.registerItem(chertShovel);
		RegisterHelper.registerItem(chertHoe);
	}

}
