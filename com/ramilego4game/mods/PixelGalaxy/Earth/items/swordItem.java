package com.ramilego4game.mods.PixelGalaxy.Earth.items;

import com.ramilego4game.mods.PixelGalaxy.Earth.GalacticraftPixelEarth;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

public class swordItem extends ItemSword{

	public swordItem(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		setCreativeTab(GalacticraftPixelEarth.tabPEarth);
	}

}