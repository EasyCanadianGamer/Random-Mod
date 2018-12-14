package com.canadiangamer.randommod.init;

import java.util.ArrayList;
import java.util.List;

import com.canadiangamer.randommod.blocks.BlockBase;
import com.canadiangamer.randommod.blocks.BlockTowelHanger;
import com.canadiangamer.randommod.blocks.RandomBlock;
import com.canadiangamer.randommod.blocks.RandomOre;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Blocks
	public static final Block RANDOM_BLOCK  = new RandomBlock("random_block", Material.IRON);
    public static final Block RANDOM_ORE = new RandomOre("random_ore", Material.ROCK);
	public static final Block TOWEL_HANGER = new BlockTowelHanger("towel_hanger", Material.CLOTH);
;
}
