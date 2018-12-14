package com.canadiangamer.randommod.items.tools;

import com.canadiangamer.randommod.Main;
import com.canadiangamer.randommod.init.ModItems;
import com.canadiangamer.randommod.util.IHasModel;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class ToolSpade extends ItemSpade implements IHasModel{
	  
	public ToolSpade(String name, ToolMaterial material) 
	   
	   {
		   super(material);
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
