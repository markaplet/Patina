package com.h0gbits.patina;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import net.minecraft.item.Item;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid="patina", name="Patina", version="0.1")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)

public class Patina {
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {}
	
	
	@Instance("patina")
	public static Patina instance;
	
	
	@SidedProxy(clientSide="com.h0gbits.patina.ClientProxy", serverSide="com.h0gbits.patina.ServerProxy")
	
	
	public static ServerProxy proxy;
	
	
	// Initialize Creative Tab	
	public static CreativeTabs patinaTab = new CreativeTabs("patinaTab") {
        public ItemStack getIconItemStack() {
                return new ItemStack(Block.blockIron, 1, 0);
        }
	};
	
	
	// Register Blocks
	public final Block patinaCopper = new PatinaCopper(500, Material.rock)
		.setHardness(3.0F)
		.setStepSound(Block.soundStoneFootstep)
		.setUnlocalizedName("patinaCopper")
		.setCreativeTab(patinaTab);
	
	public final static Block patinaIron = new PatinaIron(501, Material.rock)
		.setHardness(3.0F)
		.setStepSound(Block.soundStoneFootstep)
		.setUnlocalizedName("patinaIron")
		.setCreativeTab(patinaTab);
	
	public final static Block patinaEmerald = new PatinaEmerald(502, Material.rock)
		.setHardness(5.0F)
		.setStepSound(Block.soundStoneFootstep)
		.setUnlocalizedName("patinaEmerald")
		.setCreativeTab(patinaTab);
	
	public final static Block patinaDiamond = new PatinaDiamond(503, Material.rock)
		.setHardness(5.0F)
		.setStepSound(Block.soundStoneFootstep)
		.setUnlocalizedName("patinaDiamond")
		.setCreativeTab(patinaTab);
	
	public final static Block patinaGold = new PatinaGold(504, Material.rock)
		.setHardness(4.0F)
		.setStepSound(Block.soundStoneFootstep)
		.setUnlocalizedName("patinaGold")
		.setCreativeTab(patinaTab);
	
	public final static Block patinaBrick = new PatinaBrick(505, Material.rock)
		.setHardness(3.0F)
		.setStepSound(Block.soundStoneFootstep)
		.setUnlocalizedName("patinaBrick")
		.setCreativeTab(patinaTab);
	
	
	// Main Event Handler
	@EventHandler
	public void load(FMLInitializationEvent event) {
		proxy.registerRenders();
		
		// Register Copper Block - Only Available in creative until I learn how to access other mods
		GameRegistry.registerBlock(patinaCopper, "patinaCopper");
		LanguageRegistry.addName(patinaCopper, "Patina Copper");
		MinecraftForge.setBlockHarvestLevel(patinaCopper, "pickaxe", 1);
		
		// Register Iron Block
		GameRegistry.registerBlock(patinaIron, "patinaIron");
		LanguageRegistry.addName(patinaIron, "Patina Iron");
		MinecraftForge.setBlockHarvestLevel(patinaIron, "pickaxe", 1);
		
		// Register Emerald Block
		GameRegistry.registerBlock(patinaEmerald, "patinaEmerald");
		LanguageRegistry.addName(patinaEmerald, "Patina Emerald");
		MinecraftForge.setBlockHarvestLevel(patinaEmerald, "pickaxe", 2);
		
		// Register Diamond Block
		GameRegistry.registerBlock(patinaDiamond, "patinaDiamond");
		LanguageRegistry.addName(patinaDiamond, "Patina Diamond");
		MinecraftForge.setBlockHarvestLevel(patinaDiamond, "pickaxe", 2);
		
		// Register Gold Block
		GameRegistry.registerBlock(patinaGold, "patinaGold");
		LanguageRegistry.addName(patinaGold, "Patina Gold");
		MinecraftForge.setBlockHarvestLevel(patinaGold, "pickaxe", 1);
		
		// Register Bricks
		GameRegistry.registerBlock(patinaBrick, "patinaBrick");
		LanguageRegistry.addName(patinaBrick, "Patina Bricks");
		MinecraftForge.setBlockHarvestLevel(patinaBrick, "pickaxe", 0);
			
		// Load crafting recipes from PatinaCrafting class
		PatinaCrafting.loadRecipes();	
		
		// Creative Tab Name
		LanguageRegistry.instance().addStringLocalization("itemGroup.patinaTab", "en_US", "Patina");
	}
	
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {}
}
