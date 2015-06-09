package com.github.connorlobb.AdvancedGeology.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

import com.github.connorlobb.AdvancedGeology.help.Reference;
import com.github.connorlobb.AdvancedGeology.tabs.ModTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class AdvancedGeologyHoe extends ItemHoe {
	public final ToolMaterial toolMaterial;
	
	public AdvancedGeologyHoe(ToolMaterial EnumToolMaterial) {
		super(EnumToolMaterial);
		toolMaterial = EnumToolMaterial;
		setCreativeTab(ModTabs.tabAdvancedPetrology);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister) {
		this.itemIcon = par1IconRegister.registerIcon(Reference.MODID + ":" + getUnlocalizedName().substring(5));
	}
}
