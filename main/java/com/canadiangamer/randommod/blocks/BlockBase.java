package com.canadiangamer.randommod.blocks;

import com.canadiangamer.randommod.Main;
import com.canadiangamer.randommod.init.ModBlocks;
import com.canadiangamer.randommod.init.ModItems;
import com.canadiangamer.randommod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
   public BlockBase (String name, Material material) 
   {
	   super(material);
		  setUnlocalizedName(name);
		  setRegistryName(name);
		  setCreativeTab(Main.randomtab);
		  
		  ModBlocks.BLOCKS.add(this);
		  ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
   }

@Override
public void registerModels() 
{
Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");	
}
}
