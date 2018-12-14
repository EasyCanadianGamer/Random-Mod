package com.canadiangamer.randommod.items;

import com.canadiangamer.randommod.Main;
import com.canadiangamer.randommod.init.ModItems;
import com.canadiangamer.randommod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

   public ItemBase(String name) 
   {
	  setUnlocalizedName(name);
	  setRegistryName(name);
	  setCreativeTab(Main.randomtab);
	  
	  ModItems.ITEMS.add(this);
   }
	
	@Override
	public void registerModels() 
	{
	Main.proxy.registerItemRenderer(this,0,"inventory");
	}

}
