package com.canadiangamer.randommod.items.tools;

import com.canadiangamer.randommod.Main;
import com.canadiangamer.randommod.init.ModItems;
import com.canadiangamer.randommod.util.IHasModel;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class ToolAxe extends ItemAxe implements IHasModel{

	   public ToolAxe(String name, ToolMaterial material)
	   {
		   super(material, 8.0F, -3.0F );
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
