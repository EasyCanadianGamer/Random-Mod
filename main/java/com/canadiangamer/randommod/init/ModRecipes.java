package com.canadiangamer.randommod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
  public static void init() {
	  GameRegistry.addSmelting(ModBlocks.RANDOM_BLOCK , new ItemStack(ModItems.RANDOM_INGOT, 9), 3.5f);
	  GameRegistry.addSmelting(ModBlocks.RANDOM_ORE , new ItemStack(ModItems.RANDOM_INGOT, 1), 6.5f);
	  GameRegistry.addSmelting(ModItems.RANDOM_MEAT_RAW , new ItemStack(ModItems.RANDOM_MEAT_COOKED, 1), 6.5f);
  }
}
