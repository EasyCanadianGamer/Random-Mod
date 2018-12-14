package com.canadiangamer.randommod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockTowelHanger extends BlockBase {

public BlockTowelHanger(String name, Material cloth) {
		super(name, Material.CLOTH);
		
	}

public static  final  AxisAlignedBB TOWEL_HANGER_ABB = new AxisAlignedBB(0.1875D, 0, 0.1875D, 0.8125D, 0.625D, 0.8125);

	
	
	
	
	@Override
	public boolean isOpaqueCube(IBlockState state) 
	{
		return false;
	}

	@Override
	public boolean isFullCube(IBlockState state) 
	{
	  return false;	
	}

@Override
public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) 
{
  return TOWEL_HANGER_ABB;	
}

}
