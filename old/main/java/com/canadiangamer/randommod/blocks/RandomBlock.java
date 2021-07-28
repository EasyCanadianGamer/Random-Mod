package com.canadiangamer.randommod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RandomBlock extends BlockBase 
{

	public RandomBlock(String name, Material material) 
	{
		super(name, material);
	
	setSoundType(SoundType.METAL);	
	setHardness(5.0F);
	setResistance(15.0F);
	setHarvestLevel("pickaxe", 2);
	setLightLevel(1.0f);
	}
}
