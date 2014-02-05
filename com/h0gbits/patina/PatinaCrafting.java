package com.h0gbits.patina;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class PatinaCrafting {

	public static void loadRecipes() {
		// Create Stack Name Variables
		ItemStack waterStack = new ItemStack(Item.bucketWater);
		ItemStack dirtStack = new ItemStack(Block.dirt);
		ItemStack ironStack = new ItemStack(Block.blockIron);
		ItemStack goldStack = new ItemStack(Block.blockGold);
		ItemStack diamondStack = new ItemStack(Block.blockDiamond);
		ItemStack emeraldStack = new ItemStack(Block.blockEmerald);
		ItemStack brickStack = new ItemStack(Block.brick);
		
		// NOTE: First two lines are for creating the patina block,
		// The second two lines are for uncrafting the patina block
				
		// Iron
		GameRegistry.addShapelessRecipe(new ItemStack(Patina.patinaIron), dirtStack, ironStack);
		GameRegistry.addRecipe(new ItemStack(Patina.patinaIron, 8), "III", "IDI", "III", 'I', ironStack, 'D', dirtStack );
		
		GameRegistry.addShapelessRecipe(new ItemStack(Block.blockIron), Patina.patinaIron, waterStack);
		GameRegistry.addRecipe(new ItemStack(Block.blockIron, 8), "III", "IWI", "III", 'I', Patina.patinaIron, 'W', waterStack );
				
		// Gold
		GameRegistry.addShapelessRecipe(new ItemStack(Patina.patinaGold), dirtStack, goldStack);
		GameRegistry.addRecipe(new ItemStack(Patina.patinaGold, 8), "GGG", "GDG", "GGG", 'G', goldStack, 'D', dirtStack );
		
		GameRegistry.addShapelessRecipe(new ItemStack(Block.blockGold), Patina.patinaGold, waterStack);
		GameRegistry.addRecipe(new ItemStack(Block.blockGold, 8), "GGG", "GWG", "GGG", 'G', Patina.patinaGold, 'W', waterStack );
				
		// Gold
		GameRegistry.addShapelessRecipe(new ItemStack(Patina.patinaEmerald), dirtStack, emeraldStack);
		GameRegistry.addRecipe(new ItemStack(Patina.patinaEmerald, 8), "EEE", "EDE", "EEE", 'E', emeraldStack, 'D', dirtStack );
		
		GameRegistry.addShapelessRecipe(new ItemStack(Block.blockEmerald), Patina.patinaEmerald, waterStack);
		GameRegistry.addRecipe(new ItemStack(Block.blockEmerald, 8), "EEE", "EWE", "EEE", 'E', Patina.patinaEmerald, 'W', waterStack );
				
		// Diamond
		GameRegistry.addShapelessRecipe(new ItemStack(Patina.patinaDiamond), dirtStack, diamondStack);
		GameRegistry.addRecipe(new ItemStack(Patina.patinaDiamond, 8), "EEE", "EDE", "EEE", 'E', diamondStack, 'D', dirtStack );
		
		GameRegistry.addShapelessRecipe(new ItemStack(Block.blockDiamond), Patina.patinaDiamond, waterStack);
		GameRegistry.addRecipe(new ItemStack(Block.blockDiamond, 8), "EEE", "EWE", "EEE", 'E', Patina.patinaDiamond, 'W', waterStack );
				
		// Bricks
		GameRegistry.addShapelessRecipe(new ItemStack(Patina.patinaBrick), dirtStack, brickStack);
		GameRegistry.addRecipe(new ItemStack(Patina.patinaBrick, 8), "BBB", "BDB", "BBB", 'B', brickStack, 'D', dirtStack );
		
		GameRegistry.addShapelessRecipe(new ItemStack(Block.brick), Patina.patinaBrick, waterStack);
		GameRegistry.addRecipe(new ItemStack(Block.brick, 8), "BBB", "BWB", "BBB", 'B', Patina.patinaBrick, 'W', waterStack );
		
	}

}
