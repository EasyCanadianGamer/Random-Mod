package com.canadiangamer.randommod.tabs;

import com.canadiangamer.randommod.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RandomTab  extends CreativeTabs
{
public RandomTab(String label ) {super("randommod");
     this.setBackgroundImageName("randommod.png");}
public ItemStack getTabIconItem() { return new ItemStack(Item.getItemFromBlock(ModBlocks.RANDOM_BLOCK));}

}
