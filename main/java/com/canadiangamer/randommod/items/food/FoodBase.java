package com.canadiangamer.randommod.items.food;

import com.canadiangamer.randommod.Main;
import com.canadiangamer.randommod.init.ModItems;
import com.canadiangamer.randommod.util.IHasModel;

import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel
{
 
	public FoodBase(String name, int amount, float saturation, boolean isAnimalFood) 
	{
	  super(amount, saturation, isAnimalFood);	
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
