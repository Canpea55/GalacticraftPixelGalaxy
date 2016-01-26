package com.ramilego.pixelgalaxy.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fluids.FluidContainerRegistry;

import com.ramilego.pixelgalaxy.Constants;
import com.ramilego.pixelgalaxy.PixelCreativeTab;
import com.ramilego.pixelgalaxy.blocks.PixelGalaxyBlocks;;

public class PixelGalaxyItems {
	
	public static Item pixelizerIngot;
	public static Item diamondPixel;
	public static Item ironPixelIngot;
	public static Item blueStoneIngot;
    public static Item pixelCharCoal;
    public static Item pixelCoal;
	
    //Buckets
    public static Item pixelWaterH3OBucket;
    public static Item pixelLavaBucket;
    
	//pixelizer tools
	public static Item pixelizerSword;
	public static Item pixelizerHoe;
	public static Item pixelizerPickaxe;
	public static Item pixelizerShovel;
	public static Item pixelizerAxe;
	
	//diamondPixel tools
	public static Item diamondPixelSword;
	public static Item diamondPixelHoe;
	public static Item diamondPixelPickaxe;
	public static Item diamondPixelShovel;
	public static Item diamondPixelAxe;
	
	//ironPixel tools
	public static Item ironPixelSword;
	public static Item ironPixelHoe;
	public static Item ironPixelPickaxe;
	public static Item ironPixelShovel;
	public static Item ironPixelAxe;

	//Stonepixel Tool
	public static Item stonePixelSword;
	public static Item stonePixelHoe;
	public static Item stonePixelPickaxe;
	public static Item stonePixelShovel;
	public static Item stonePixelAxe;
	
	//Woodpixel tools
	public static Item woodPixelSword;
	public static Item woodPixelHoe;
	public static Item woodPixelPickaxe;
	public static Item woodPixelShovel;
	public static Item woodPixelAxe;
	
	//pixelizer Armors
	public static Item pixelizerHelmet;
	public static Item pixelizerChestplate;
	public static Item pixelizerLeggings;
	public static Item pixelizerBoots;
	
	//diamondpixel armor
	public static Item diamondPixelHelmet;
	public static Item diamondPixelChestplate;
	public static Item diamondPixelLeggings;
	public static Item diamondPixelBoots;
	
	//Ironpixel armor
	public static Item ironPixelHelmet;
	public static Item ironPixelChestplate;
	public static Item ironPixelLeggings;
	public static Item ironPixelBoots;
	
	public static Item pixelWoodItem;
	public static Item pixelWoodStickItem;
	
	
	public static Item pixelRice;
	public static Item pixelRiceBread;
	
	
	//Seeds
	public static Item pixelPumkinSeed;
	public static Item pixelRiceSeed;
	public static Item pixelPeaSeed;
	
	//Food
	public static Item pixelPotato;
	public static Item pixelCarrot;
	public static Item pixelBeetroot;
	public static Item pixelApple;
	public static Item pixelOrange;
	public static Item pixelPea;
	public static Item pixelBakedPotato;
	
	//Soup or Stew
	public static Item pixelbowl;
	public static Item pixelbeetrootsoup;
	public static Item pixelPeaStew;
	public static Item pixelPotatoSoup;
	public static Item pixelCarrotSoup;
	
	//Drinkable
	public static Item pixelBottle;
	
	static ToolMaterial woodPixelToolMaterial = EnumHelper.addToolMaterial("stonePixelToolMaterial", 0, 59, 2.0f, 0.0f, 15);
	static ToolMaterial stonePixelToolMaterial = EnumHelper.addToolMaterial("stonePixelToolMaterial", 1, 131, 4.0f, 1.0f, 5);
	static ToolMaterial ironPixelToolMaterial = EnumHelper.addToolMaterial("ironPixelToolMaterial", 2, 250, 6.0f, 2.0f, 14);
	static ToolMaterial diamondPixelToolMaterial = EnumHelper.addToolMaterial("diamondPixelToolMaterial", 3, 1561, 3.0f, 4.0f, 10);
	static ToolMaterial pixelizerToolMaterial = EnumHelper.addToolMaterial("pixelizerToolMaterial", 4, 2000, 10.0f, 4.0f, 15);
	static ArmorMaterial pixelizerArmorMaterial = EnumHelper.addArmorMaterial("pixelizerArmorMaterial", 44, new int[]{4, 9, 7, 4}, 15);
	static ArmorMaterial diamondPixelMaterial = EnumHelper.addArmorMaterial("diamondPixelMaterial", 33, new int[]{3, 8, 6, 3}, 10);
	static ArmorMaterial ironPixelMaterial = EnumHelper.addArmorMaterial("ironPixelMaterial", 15, new int[]{2, 6, 5, 2}, 9);
	
	public static void registerItems(){
		pixelBakedPotato = new PixelItemRiceBread("pixelBakedPotato", 5, 0.3f, false)
				.setCreativeTab(PixelCreativeTab.PixelFoodsTab)
				.setUnlocalizedName("pixelBakedPotato")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelBakedPotato");
		
		pixelPotatoSoup = new PixelSoupItem("pixelPotatoSoup", 10, 0.6f, false)
				.setCreativeTab(PixelCreativeTab.PixelFoodsTab)
				.setUnlocalizedName("pixelPotatoSoup")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelpotatosoup");
		
		pixelCarrotSoup = new PixelSoupItem("pixelCarrotSoup", 10, 0.6f, false)
				.setCreativeTab(PixelCreativeTab.PixelFoodsTab)
				.setUnlocalizedName("pixelCarrotSoup")
				.setTextureName(Constants.TEXTURE_PREFIX + "PixelCarrotSoup");
		
		GameRegistry.registerItem(pixelPotatoSoup, "pixelPotatoSoup");
		GameRegistry.registerItem(pixelCarrotSoup, "pixelCarrotSoup");
		GameRegistry.registerItem(pixelBakedPotato, "pixelBakedPotato");
		
		pixelBottle = new PixelItem()
				.setCreativeTab(PixelCreativeTab.PixelItemsTab)
				.setUnlocalizedName("pixelBottle")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelBottle");
			
		GameRegistry.registerItem(pixelBottle, "pixelBottle");
		
		pixelPeaSeed = new PixelItemSeed(PixelGalaxyBlocks.pixelPeaCrop, PixelGalaxyBlocks.FarmlandPixel)
				.setCreativeTab(PixelCreativeTab.PixelFoodsTab)
				.setUnlocalizedName("pixelPeaSeed")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelseedspea");
		
		pixelPea = new PixelItemRiceBread("pixelPea", 6, 0.3f, false)
				.setCreativeTab(PixelCreativeTab.PixelFoodsTab)
				.setUnlocalizedName("pixelPea")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelPea");
		
		pixelPeaStew = new PixelSoupItem("pixelPeaStew", 10, 0.6f, false)
				.setCreativeTab(PixelCreativeTab.PixelFoodsTab)
				.setUnlocalizedName("pixelPeaStew")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelPeaStew");
		
		GameRegistry.registerItem(pixelPeaSeed, "pixelPeaSeed");
		GameRegistry.registerItem(pixelPea, "pixelPea");
		GameRegistry.registerItem(pixelPeaStew, "pixelPeaStew");
		
		pixelLavaBucket = new PixelLavaBucket("pixelLavaBucket");
		GameRegistry.registerItem(pixelLavaBucket, "pixelLavaBucket");
		FluidContainerRegistry.registerFluidContainer(PixelGalaxyBlocks.pixelLavaFluid, new ItemStack(PixelGalaxyItems.pixelLavaBucket), new ItemStack(Items.bucket));
				
		pixelWaterH3OBucket = new PixelWaterH3OBucket("pixelWaterH3OBucket");
		GameRegistry.registerItem(pixelWaterH3OBucket, "pixelWaterH3OBucket");
		FluidContainerRegistry.registerFluidContainer(PixelGalaxyBlocks.PixelWaterH3OFluid, new ItemStack(PixelGalaxyItems.pixelWaterH3OBucket), new ItemStack(Items.bucket));
		
		pixelCoal= new PixelWoodCoal()
				.setCreativeTab(PixelCreativeTab.PixelItemsTab)
				.setUnlocalizedName("pixelCoal")
				.setTextureName(Constants.TEXTURE_PREFIX + "PixelCoal");
		
		pixelCharCoal = new PixelWoodCoal()
				.setCreativeTab(PixelCreativeTab.PixelItemsTab)
				.setUnlocalizedName("pixelCharCoal")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelcharcoal");
		
		GameRegistry.registerItem(pixelCoal, "pixelCoal");
		GameRegistry.registerItem(pixelCharCoal, "pixelCharCoal");
		
		pixelbeetrootsoup = new PixelSoupItem("PixelBeetRootSoup", 10, 0.8f, false)
				.setCreativeTab(PixelCreativeTab.PixelFoodsTab)
				.setUnlocalizedName("PixelBeetRootSoup")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelbeetrootsoup");
		
		pixelbowl = new PixelItem()
				.setCreativeTab(PixelCreativeTab.PixelFoodsTab)
				.setUnlocalizedName("Pixelbowl")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelbowl");
		
		GameRegistry.registerItem(pixelbeetrootsoup, "PixelBeetRootSoup");
		GameRegistry.registerItem(pixelbowl, "pixelbowl");
		
		pixelOrange = new PixelItemRiceBread("pixelOrange", 5, 0.3f, false)
				.setCreativeTab(PixelCreativeTab.PixelFoodsTab)
				.setUnlocalizedName("pixelOrange")
				.setTextureName(Constants.TEXTURE_PREFIX + "PixelOrange");
		
		pixelApple = new PixelItemRiceBread("pixelApple", 6, 0.3f, false)
				.setCreativeTab(PixelCreativeTab.PixelFoodsTab)
				.setUnlocalizedName("pixelApple")
				.setTextureName(Constants.TEXTURE_PREFIX + "PixelApple");
		
		GameRegistry.registerItem(pixelOrange, "pixelOrange");
		GameRegistry.registerItem(pixelApple, "pixelApple");
		
		pixelBeetroot = new PixelSeedFood(2, 0.6f, PixelGalaxyBlocks.pixelBeetroot, PixelGalaxyBlocks.FarmlandPixel)
				.setCreativeTab(PixelCreativeTab.PixelFoodsTab)
				.setUnlocalizedName("pixelBeetroot")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelbeetroot");
		
		pixelCarrot = new PixelSeedFood(2, 0.6f, PixelGalaxyBlocks.pixelCarrot, PixelGalaxyBlocks.FarmlandPixel)
				.setCreativeTab(PixelCreativeTab.PixelFoodsTab)
				.setUnlocalizedName("pixelCarrot")
				.setTextureName(Constants.TEXTURE_PREFIX + "PixelCarrot");
		
		pixelPotato = new PixelSeedFood(2, 0.6f, PixelGalaxyBlocks.pixelPotato, PixelGalaxyBlocks.FarmlandPixel)
				.setCreativeTab(PixelCreativeTab.PixelFoodsTab)
				.setUnlocalizedName("pixelPotato")
				.setTextureName(Constants.TEXTURE_PREFIX + "PixelPotato");
		
		GameRegistry.registerItem(pixelCarrot, "pixelCarrot");
		GameRegistry.registerItem(pixelPotato, "pixelPotato");
		GameRegistry.registerItem(pixelBeetroot, "pixelBeetroot");
		
		pixelRiceBread = new PixelItemRiceBread("pixelRiceBread", 5, 0.6f, false)
				.setCreativeTab(PixelCreativeTab.PixelFoodsTab)
				.setUnlocalizedName("pixelRiceBread")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelRiceBread");
		
		GameRegistry.registerItem(pixelRiceBread, "pixelRiceBread");
		
		
		blueStoneIngot = new Item()
				.setCreativeTab(PixelCreativeTab.PixelItemsTab)
				.setUnlocalizedName("blueStoneIngot")
				.setTextureName(Constants.TEXTURE_PREFIX + "bluestone");
		
		GameRegistry.registerItem(blueStoneIngot, "blueStoneIngot");
		
		pixelRiceSeed = new PixelItemSeed(PixelGalaxyBlocks.pixelRicePlant, PixelGalaxyBlocks.FarmlandPixel)
				.setCreativeTab(PixelCreativeTab.PixelFoodsTab)
				.setUnlocalizedName("pixelRiceSeed")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelRiceSeeds");
		
		pixelPumkinSeed = new PixelItemSeed(PixelGalaxyBlocks.pixelPumpkinStem, PixelGalaxyBlocks.FarmlandPixel)
				.setCreativeTab(PixelCreativeTab.PixelFoodsTab)
				.setUnlocalizedName("pixelPumkinSeed")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelseeds_pumpkin");
		
		GameRegistry.registerItem(pixelRiceSeed, "pixelRiceSeed");
		GameRegistry.registerItem(pixelPumkinSeed, "pixelPumkinSeed");
		
		pixelRice = new Item()
				.setCreativeTab(PixelCreativeTab.PixelFoodsTab)
				.setUnlocalizedName("pixelRice")
				.setTextureName(Constants.TEXTURE_PREFIX + "pixelWheat");
		
		
		GameRegistry.registerItem(pixelRice, "pixelWheat");
		
		pixelWoodItem = new PixelWood().setUnlocalizedName("pixelWoodItem").setTextureName(Constants.TEXTURE_PREFIX + "pixelWoodItem");
		pixelWoodStickItem = new PixelWood().setUnlocalizedName("pixelWoodStick").setTextureName(Constants.TEXTURE_PREFIX + "pixelWoodStickItem");
		
		GameRegistry.registerItem(pixelWoodStickItem, "pixelWoodStick");
		GameRegistry.registerItem(pixelWoodItem, "pixelWoodItem");
		
		pixelizerIngot = new PixelItem().setUnlocalizedName("pixelizerIngot").setTextureName(Constants.TEXTURE_PREFIX + "pixelizerIngot");
		diamondPixel = new PixelItem().setUnlocalizedName("diamondPixel").setTextureName(Constants.TEXTURE_PREFIX + "diamondpixel");
		ironPixelIngot = new PixelItem().setUnlocalizedName("ironPixelIngot").setTextureName(Constants.TEXTURE_PREFIX + "ironPixelIngot");
		
		GameRegistry.registerItem(ironPixelIngot, "ironPixelIngot");
		GameRegistry.registerItem(diamondPixel, "diamondPixel");
		GameRegistry.registerItem(pixelizerIngot, "pixelizerIngot");
		
		pixelizerSword = new PixelSword(pixelizerToolMaterial).setUnlocalizedName("pixelizerSword").setTextureName(Constants.TEXTURE_PREFIX + "pixelizerSword");
		pixelizerHoe = new PixelHoe(pixelizerToolMaterial).setUnlocalizedName("pixelizerHoe").setTextureName(Constants.TEXTURE_PREFIX + "pixelizerHoe");
		pixelizerPickaxe = new PixelPickaxe(pixelizerToolMaterial).setUnlocalizedName("pixelizerPickaxe").setTextureName(Constants.TEXTURE_PREFIX + "pixelizerPickaxe");
		pixelizerShovel = new PixelShovel(pixelizerToolMaterial).setUnlocalizedName("pixelizerShovel").setTextureName(Constants.TEXTURE_PREFIX + "pixelizerShovel");
		pixelizerAxe = new PixelAxe(pixelizerToolMaterial).setUnlocalizedName("pixelizerAxe").setTextureName(Constants.TEXTURE_PREFIX + "pixelizerAxe");
		
		diamondPixelSword = new PixelSword(diamondPixelToolMaterial).setUnlocalizedName("diamondPixelSword").setTextureName(Constants.TEXTURE_PREFIX + "diamondPixelSword");
		diamondPixelHoe = new PixelHoe(diamondPixelToolMaterial).setUnlocalizedName("diamondPixelHoe").setTextureName(Constants.TEXTURE_PREFIX + "diamondPixelHoe");
		diamondPixelPickaxe = new PixelPickaxe(diamondPixelToolMaterial).setUnlocalizedName("diamondPixelPickaxe").setTextureName(Constants.TEXTURE_PREFIX + "diamondPixelPickaxe");
		diamondPixelShovel = new PixelShovel(diamondPixelToolMaterial).setUnlocalizedName("diamondPixelShovel").setTextureName(Constants.TEXTURE_PREFIX + "diamondPixelShovel");
		diamondPixelAxe = new PixelAxe(diamondPixelToolMaterial).setUnlocalizedName("diamondPixelAxe").setTextureName(Constants.TEXTURE_PREFIX + "diamondPixelAxe");
		
		ironPixelSword = new PixelSword(ironPixelToolMaterial).setUnlocalizedName("ironPixelSword").setTextureName(Constants.TEXTURE_PREFIX + "ironPixelSword");
		ironPixelHoe = new PixelHoe(ironPixelToolMaterial).setUnlocalizedName("ironPixelHoe").setTextureName(Constants.TEXTURE_PREFIX + "ironPixelHoe");
		ironPixelPickaxe = new PixelPickaxe(ironPixelToolMaterial).setUnlocalizedName("ironPixelPickaxe").setTextureName(Constants.TEXTURE_PREFIX + "ironPixelpickaxe");
		ironPixelShovel = new PixelShovel(ironPixelToolMaterial).setUnlocalizedName("ironPixelShovel").setTextureName(Constants.TEXTURE_PREFIX + "ironPixelShovel");
		ironPixelAxe = new PixelAxe(ironPixelToolMaterial).setUnlocalizedName("ironPixelAxe").setTextureName(Constants.TEXTURE_PREFIX + "ironPixelAxe");
		
		stonePixelSword = new PixelSword(stonePixelToolMaterial).setUnlocalizedName("stonePixelSword").setTextureName(Constants.TEXTURE_PREFIX + "stonePixelSword");
		stonePixelHoe = new PixelHoe(stonePixelToolMaterial).setUnlocalizedName("stonePixelHoe").setTextureName(Constants.TEXTURE_PREFIX + "stonePixelHoe");
		stonePixelPickaxe = new PixelPickaxe(stonePixelToolMaterial).setUnlocalizedName("stonePixelPickaxe").setTextureName(Constants.TEXTURE_PREFIX + "stonePixelPickaxe");
		stonePixelShovel = new PixelShovel(stonePixelToolMaterial).setUnlocalizedName("stonePixelShovel").setTextureName(Constants.TEXTURE_PREFIX + "stonePixelShovel");
		stonePixelAxe = new PixelAxe(stonePixelToolMaterial).setUnlocalizedName("stonePixelAxe").setTextureName(Constants.TEXTURE_PREFIX + "stonePixelAxe");
		
		woodPixelSword = new PixelSword(woodPixelToolMaterial).setUnlocalizedName("woodPixelSword").setTextureName(Constants.TEXTURE_PREFIX + "woodPixelSword");
		woodPixelHoe = new PixelHoe(woodPixelToolMaterial).setUnlocalizedName("woodPixelHoe").setTextureName(Constants.TEXTURE_PREFIX + "woodPixelHoe");
		woodPixelPickaxe = new PixelPickaxe(woodPixelToolMaterial).setUnlocalizedName("woodPixelPickaxe").setTextureName(Constants.TEXTURE_PREFIX + "woodPixelPickaxe");
		woodPixelShovel = new PixelShovel(woodPixelToolMaterial).setUnlocalizedName("woodPixelShovel").setTextureName(Constants.TEXTURE_PREFIX + "woodPixelShovel");
		woodPixelAxe = new PixelAxe(woodPixelToolMaterial).setUnlocalizedName("woodPixelAxe").setTextureName(Constants.TEXTURE_PREFIX + "woodPixelAxe");
		
		GameRegistry.registerItem(woodPixelSword, "woodPixelSword");
		GameRegistry.registerItem(woodPixelHoe, "woodPixelHoe");
		GameRegistry.registerItem(woodPixelPickaxe, "woodPixelPickaxe");
		GameRegistry.registerItem(woodPixelShovel, "woodPixelShovel");
		GameRegistry.registerItem(woodPixelAxe, "woodPixelAxe");
		
		GameRegistry.registerItem(stonePixelSword, "stonePixelSword");
		GameRegistry.registerItem(stonePixelHoe, "stonePixelHoe");
		GameRegistry.registerItem(stonePixelPickaxe, "stonePixelPickaxe");
		GameRegistry.registerItem(stonePixelShovel, "stonePixelShovel");
		GameRegistry.registerItem(stonePixelAxe, "stonePixelAxe");
		
		GameRegistry.registerItem(ironPixelSword, "ironPixelSword");
		GameRegistry.registerItem(ironPixelHoe, "ironPixelHoe");
		GameRegistry.registerItem(ironPixelPickaxe, "ironPixelPickaxe");
		GameRegistry.registerItem(ironPixelShovel, "ironPixelShovel");
		GameRegistry.registerItem(ironPixelAxe, "ironPixelAxe");
		
		GameRegistry.registerItem(pixelizerSword, "pixelizerSword");
		GameRegistry.registerItem(pixelizerHoe, "pixelizerHoe");
		GameRegistry.registerItem(pixelizerPickaxe, "pixelizerPickaxe");
		GameRegistry.registerItem(pixelizerShovel, "pixelizerShovel");
		GameRegistry.registerItem(pixelizerAxe, "pixelizerAxe");
		
		GameRegistry.registerItem(diamondPixelSword, "diamondPixelSword");
		GameRegistry.registerItem(diamondPixelHoe, "diamondPixelHoe");
		GameRegistry.registerItem(diamondPixelPickaxe, "diamondPixelPickaxe");
		GameRegistry.registerItem(diamondPixelShovel, "diamondPixelShovel");
		GameRegistry.registerItem(diamondPixelAxe, "diamondPixelAxe");
		
		pixelizerHelmet = new PixelizerArmor(pixelizerArmorMaterial, 3, 0).setUnlocalizedName("pixelizerHelmet").setTextureName(Constants.TEXTURE_PREFIX + "pixelizerHelmet");
		pixelizerChestplate = new PixelizerArmor(pixelizerArmorMaterial, 3, 1).setUnlocalizedName("pixelizerChestplate").setTextureName(Constants.TEXTURE_PREFIX + "pixelizerChestplate");
		pixelizerLeggings = new PixelizerArmor(pixelizerArmorMaterial, 3, 2).setUnlocalizedName("pixelizerLeggings").setTextureName(Constants.TEXTURE_PREFIX + "pixelizerLeggings");
		pixelizerBoots = new PixelizerArmor(pixelizerArmorMaterial, 3, 3).setUnlocalizedName("pixelizerBoots").setTextureName(Constants.TEXTURE_PREFIX + "pixelizerBoots");
		
		diamondPixelHelmet = new DiamondPixelArmor(diamondPixelMaterial, 3, 0).setUnlocalizedName("diamondPixelHelmet").setTextureName(Constants.TEXTURE_PREFIX + "diamondPixelHelmet");
		diamondPixelChestplate = new DiamondPixelArmor(diamondPixelMaterial, 3, 1).setUnlocalizedName("diamondPixelChestplate").setTextureName(Constants.TEXTURE_PREFIX + "diamondPixelChestplate");
		diamondPixelLeggings = new DiamondPixelArmor(diamondPixelMaterial, 3, 2).setUnlocalizedName("diamondPixelLeggings").setTextureName(Constants.TEXTURE_PREFIX + "diamondPixelLeggings");
		diamondPixelBoots = new DiamondPixelArmor(diamondPixelMaterial, 3, 3).setUnlocalizedName("diamondPixelBoots").setTextureName(Constants.TEXTURE_PREFIX + "diamondPixelBoots");
		
		ironPixelHelmet = new IronPixelArmor(ironPixelMaterial, 3, 0).setUnlocalizedName("ironPixelHelmet").setTextureName(Constants.TEXTURE_PREFIX + "ironPixelHelmet");
		ironPixelChestplate = new IronPixelArmor(ironPixelMaterial, 3, 1).setUnlocalizedName("ironPixelChestplate").setTextureName(Constants.TEXTURE_PREFIX + "ironPixelChestplate");
		ironPixelLeggings = new IronPixelArmor(ironPixelMaterial, 3, 2).setUnlocalizedName("ironPixelLeggings").setTextureName(Constants.TEXTURE_PREFIX + "ironPixelLeggings");
		ironPixelBoots = new IronPixelArmor(ironPixelMaterial, 3, 3).setUnlocalizedName("ironPixelBoots").setTextureName(Constants.TEXTURE_PREFIX + "ironPixelBoots");
		
		GameRegistry.registerItem(ironPixelHelmet, "ironPixelHelmet");
		GameRegistry.registerItem(ironPixelChestplate, "ironPixelChestplate");
		GameRegistry.registerItem(ironPixelLeggings, "ironPixelLeggings");
		GameRegistry.registerItem(ironPixelBoots, "ironPixelBoots");
		
		GameRegistry.registerItem(diamondPixelHelmet, "diamondPixelHelmet");
		GameRegistry.registerItem(diamondPixelChestplate, "diamondPixelChestplate");
		GameRegistry.registerItem(diamondPixelLeggings, "diamondPixelLeggings");
		GameRegistry.registerItem(diamondPixelBoots, "diamondPixelBoots");
		
		GameRegistry.registerItem(pixelizerHelmet, "pixelizerHelmet");
		GameRegistry.registerItem(pixelizerChestplate, "pixelizerChestplate");
		GameRegistry.registerItem(pixelizerLeggings, "pixelizerLeggings");
		GameRegistry.registerItem(pixelizerBoots, "pixelizerBoots");
		
		
	}
}