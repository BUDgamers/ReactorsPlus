package org.budgamers.reactorsplus;

import ic2.api.item.Items;
import ic2.api.recipe.RecipeInputItemStack;
import ic2.api.recipe.Recipes;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "ic2addon", name = "Reactors+", version = "1.53")
public class IC2Addon {

	public static Block unobtaniumOre;
	
	public static Item unobtanium;
	public static Item extremeCircuit;
	public static Item enrichedUnstableUnobtanium;
	public static Item enrichedUnobtanium;
	public static Item enrichedUnobtaniumIngot;
	public static Item unobtaniumPlate;
	
	public static Item unobtaniumHeatVent;
	public static Item unobtaniumHeatEvaporator;
	
	public static int unobtaniumOreID;
	public static int unobtaniumID;
	public static int extremeCircuitID;
	public static int enrichedUnstableUnobtaniumID;
	public static int enrichedUnobtaniumID;
	public static int enrichedUnobtaniumIngotID;
	public static int unobtaniumPlateID;
	public static int unobtaniumHeatVentID;
	public static int unobtaniumHeatEvaporatorID;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		Configuration config = new Configuration(e.getSuggestedConfigurationFile());
		
		config.load();
		
		unobtaniumOreID = config.get(Configuration.CATEGORY_BLOCK, "unobtaniumOre", 3000).getInt();
		
		unobtaniumID = config.get(Configuration.CATEGORY_ITEM, "unobtanium", 29000).getInt();
		extremeCircuitID = config.get(Configuration.CATEGORY_ITEM, "extremeCircuit", 29001).getInt();
		enrichedUnstableUnobtaniumID = config.get(Configuration.CATEGORY_ITEM, "enrichedUnstableUnobtanium", 29002).getInt();
		enrichedUnobtaniumID = config.get(Configuration.CATEGORY_ITEM, "enrichedUnobtanium", 29003).getInt();
		enrichedUnobtaniumIngotID = config.get(Configuration.CATEGORY_ITEM, "enrichedUnobtaniumIngot", 29004).getInt();
		unobtaniumPlateID = config.get(Configuration.CATEGORY_ITEM, "unobtaniumPlate", 29005).getInt();
		unobtaniumHeatVentID = config.get(Configuration.CATEGORY_ITEM, "unobtaniumHeatVent", 29006).getInt();
		unobtaniumHeatEvaporatorID = config.get(Configuration.CATEGORY_ITEM, "unobtaniumHeatEvaporator", 29007).getInt();
		
		config.save();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e) {
		unobtaniumOre = new UOOre(unobtaniumOreID, Material.rock);
		
		unobtanium = new UO(unobtaniumID);
		extremeCircuit = new EC(extremeCircuitID);
		enrichedUnstableUnobtanium = new EUUO(enrichedUnstableUnobtaniumID);
		enrichedUnobtanium = new EUO(enrichedUnobtaniumID);
		enrichedUnobtaniumIngot = new EUOI(enrichedUnobtaniumIngotID);
		unobtaniumPlate = new UOP(unobtaniumPlateID);
		unobtaniumHeatVent = new UHV(unobtaniumHeatVentID);
		unobtaniumHeatEvaporator = new UE(unobtaniumHeatEvaporatorID);
		
		GameRegistry.registerBlock(unobtaniumOre, "oUnobtanium");
		
		addRecipes();
		addNames();
		
		GameRegistry.registerWorldGenerator(new UOOreGenerator());
	}
	
	private void addRecipes() {
		ItemStack circuit = Items.getItem("advancedCircuit"); 
		ItemStack coil = Items.getItem("coil"); 
		ItemStack mesh = Items.getItem("carbonPlate"); 
		ItemStack vent = Items.getItem("reactorVentDiamond");
		ItemStack hammer = Items.getItem("ForgeHammer");
		
		Recipes.extractor.addRecipe(new RecipeInputItemStack(new ItemStack(unobtaniumOre)), null, new ItemStack(unobtanium)); 
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(unobtanium)), null, new ItemStack(enrichedUnstableUnobtanium));
		Recipes.extractor.addRecipe(new RecipeInputItemStack(new ItemStack(enrichedUnstableUnobtanium)), null, new ItemStack(enrichedUnobtanium)); 
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(enrichedUnobtanium)), null, new ItemStack(enrichedUnobtaniumIngot)); 
		
		GameRegistry.addRecipe(new ItemStack(extremeCircuit), new Object[]{"CMC", "MAM", "CMC", 'C', coil, 'M', mesh.getItem(), 'A', circuit.getItem()});
		GameRegistry.addRecipe(new ItemStack(unobtaniumHeatVent), new Object[]{"PBP", "EAE", "PBP", 'P', unobtaniumPlate, 'B', Block.fenceIron, 'E', extremeCircuit, 'A', vent.getItem()});
		GameRegistry.addRecipe(new ItemStack(unobtaniumHeatEvaporator), new Object[]{"PWP", "UVU", "PLP", 'P', unobtaniumPlate, 'W', Item.bucketWater, 'U', enrichedUnobtanium, 'V', unobtaniumHeatVent, 'L', Item.bucketLava}); GameRegistry.addShapelessRecipe(new ItemStack(unobtaniumPlate), new Object[]{enrichedUnobtaniumIngot});
		GameRegistry.addRecipe(new ItemStack(unobtaniumPlate, 9), new Object[]{"III", "III", "III", 'I', enrichedUnobtaniumIngot});
	}
	
	private void addNames() {
		LanguageRegistry.addName(unobtaniumOre, "Unobtainium Ore");
		LanguageRegistry.addName(extremeCircuit, "Extreme Circuit");
		LanguageRegistry.addName(unobtanium, "Raw Unobtainium");
		LanguageRegistry.addName(enrichedUnstableUnobtanium, "Enriched Unstable Unobtainium");
		LanguageRegistry.addName(enrichedUnobtanium, "Enriched Unobtainium");
		LanguageRegistry.addName(enrichedUnobtaniumIngot, "Unobtainium Ingot"); 
		LanguageRegistry.addName(unobtaniumPlate, "Unobtainium Plate"); 
		LanguageRegistry.addName(unobtaniumHeatVent, "Unobtainium Heat Vent");
		LanguageRegistry.addName(unobtaniumHeatEvaporator, "Unobtanium Heat Evaporator");
	}
}