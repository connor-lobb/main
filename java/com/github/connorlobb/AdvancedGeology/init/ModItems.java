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
	public static Item.ToolMaterial CLAYSTONE = EnumHelper.addToolMaterial("CHERT", 1, 172, 2.3F, 2.3F, 10);
	public static Item.ToolMaterial CONGLOMERATE = EnumHelper.addToolMaterial("CONGLOMERATE", 1, 172, 2.3F, 2.3F, 10);
	public static Item.ToolMaterial DACITE = EnumHelper.addToolMaterial("DACITE", 1, 232, 2.9F, 2.6F, 6);
	public static Item.ToolMaterial DIORITE = EnumHelper.addToolMaterial("DIORITE", 1, 232, 2.9F, 2.6F, 6);
	public static Item.ToolMaterial DOLOMITE = EnumHelper.addToolMaterial("DOLOMITE", 1, 172, 2.3F, 2.3F, 10);
	public static Item.ToolMaterial GABBRO = EnumHelper.addToolMaterial("GABBRO", 1, 232, 2.9F, 2.6F, 6);
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
	public static Item claystonePickaxe = new AdvancedGeologyPickaxe(CLAYSTONE).setUnlocalizedName("claystonePickaxe");
	public static Item claystoneSword = new AdvancedGeologySword(CLAYSTONE).setUnlocalizedName("claystoneSword");
	public static Item claystoneAxe = new AdvancedGeologyAxe(CLAYSTONE).setUnlocalizedName("claystoneAxe");
	public static Item claystoneShovel = new AdvancedGeologyShovel(CLAYSTONE).setUnlocalizedName("claystoneShovel");
	public static Item claystoneHoe = new AdvancedGeologyHoe(CLAYSTONE).setUnlocalizedName("claystoneHoe");
	public static Item conglomeratePickaxe = new AdvancedGeologyPickaxe(CONGLOMERATE).setUnlocalizedName("conglomeratePickaxe");
	public static Item conglomerateSword = new AdvancedGeologySword(CONGLOMERATE).setUnlocalizedName("conglomerateSword");
	public static Item conglomerateAxe = new AdvancedGeologyAxe(CONGLOMERATE).setUnlocalizedName("conglomerateAxe");
	public static Item conglomerateShovel = new AdvancedGeologyShovel(CONGLOMERATE).setUnlocalizedName("conglomerateShovel");
	public static Item conglomerateHoe = new AdvancedGeologyHoe(CONGLOMERATE).setUnlocalizedName("conglomerateHoe");
	public static Item dacitePickaxe = new AdvancedGeologyPickaxe(DACITE).setUnlocalizedName("dacitePickaxe");
	public static Item daciteSword = new AdvancedGeologySword(DACITE).setUnlocalizedName("daciteSword");
	public static Item daciteAxe = new AdvancedGeologyAxe(DACITE).setUnlocalizedName("daciteAxe");
	public static Item daciteShovel = new AdvancedGeologyShovel(DACITE).setUnlocalizedName("daciteShovel");
	public static Item daciteHoe = new AdvancedGeologyHoe(DACITE).setUnlocalizedName("daciteHoe");
	public static Item dioritePickaxe = new AdvancedGeologyPickaxe(DIORITE).setUnlocalizedName("dioritePickaxe");
	public static Item dioriteSword = new AdvancedGeologySword(DIORITE).setUnlocalizedName("dioriteSword");
	public static Item dioriteAxe = new AdvancedGeologyAxe(DIORITE).setUnlocalizedName("dioriteAxe");
	public static Item dioriteShovel = new AdvancedGeologyShovel(DIORITE).setUnlocalizedName("dioriteShovel");
	public static Item dioriteHoe = new AdvancedGeologyHoe(DIORITE).setUnlocalizedName("dioriteHoe");
	public static Item dolomitePickaxe = new AdvancedGeologyPickaxe(DOLOMITE).setUnlocalizedName("dolomitePickaxe");
	public static Item dolomiteSword = new AdvancedGeologySword(DOLOMITE).setUnlocalizedName("dolomiteSword");
	public static Item dolomiteAxe = new AdvancedGeologyAxe(DOLOMITE).setUnlocalizedName("dolomiteAxe");
	public static Item dolomiteShovel = new AdvancedGeologyShovel(DOLOMITE).setUnlocalizedName("dolomiteShovel");
	public static Item dolomiteHoe = new AdvancedGeologyHoe(DOLOMITE).setUnlocalizedName("dolomiteHoe");
	public static Item gabbroPickaxe = new AdvancedGeologyPickaxe(GABBRO).setUnlocalizedName("gabbroPickaxe");
	public static Item gabbroSword = new AdvancedGeologySword(GABBRO).setUnlocalizedName("gabbroSword");
	public static Item gabbroAxe = new AdvancedGeologyAxe(GABBRO).setUnlocalizedName("gabbroAxe");
	public static Item gabbroShovel = new AdvancedGeologyShovel(GABBRO).setUnlocalizedName("gabbroShovel");
	public static Item gabbroHoe = new AdvancedGeologyHoe(GABBRO).setUnlocalizedName("gabbroHoe");
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
		RegisterHelper.registerItem(claystonePickaxe);
		RegisterHelper.registerItem(claystoneSword);
		RegisterHelper.registerItem(claystoneAxe);
		RegisterHelper.registerItem(claystoneShovel);
		RegisterHelper.registerItem(claystoneHoe);
		RegisterHelper.registerItem(conglomeratePickaxe);
		RegisterHelper.registerItem(conglomerateSword);
		RegisterHelper.registerItem(conglomerateAxe);
		RegisterHelper.registerItem(conglomerateShovel);
		RegisterHelper.registerItem(conglomerateHoe);
		RegisterHelper.registerItem(dacitePickaxe);
		RegisterHelper.registerItem(daciteSword);
		RegisterHelper.registerItem(daciteAxe);
		RegisterHelper.registerItem(daciteShovel);
		RegisterHelper.registerItem(daciteHoe);
		RegisterHelper.registerItem(dioritePickaxe);
		RegisterHelper.registerItem(dioriteSword);
		RegisterHelper.registerItem(dioriteAxe);
		RegisterHelper.registerItem(dioriteShovel);
		RegisterHelper.registerItem(dioriteHoe);
		RegisterHelper.registerItem(dolomitePickaxe);
		RegisterHelper.registerItem(dolomiteSword);
		RegisterHelper.registerItem(dolomiteAxe);
		RegisterHelper.registerItem(dolomiteShovel);
		RegisterHelper.registerItem(dolomiteHoe);
		RegisterHelper.registerItem(gabbroPickaxe);
		RegisterHelper.registerItem(gabbroSword);
		RegisterHelper.registerItem(gabbroAxe);
		RegisterHelper.registerItem(gabbroShovel);
		RegisterHelper.registerItem(gabbroHoe);
	}

}
