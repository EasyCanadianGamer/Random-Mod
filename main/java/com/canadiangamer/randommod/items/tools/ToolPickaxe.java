package com.canadiangamer.randommod.items.tools;

import com.canadiangamer.randommod.Main;
import com.canadiangamer.randommod.init.ModItems;
import com.canadiangamer.randommod.util.IHasModel;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe implements IHasModel {



	   public ToolPickaxe(String name, ToolMaterial material) 
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
