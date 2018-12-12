package com.canadiangamer.randommod.blocks.trees;

import com.canadiangamer.randommod.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.util.IStringSerializable;

public class PlanksRandom extends BlockBase 
{

public static final PropertyEnum<PlanksRandom.EnumType> VARIANT = PropertyEnum.<PlanksRandom.EnumType>create("variant", PlanksRandom.EnumType.class);
  
public PlanksRandom(String name) 
     {
      setUnlocalizedName(name);
      setRegistryName(name);
     }
       public static enum EnumType implements IStringSerializable 
       {
         private static final PlanksRandom.EnumType[] META_LOOKUP = new PlanksRandom.EnumType[values().length];
    	 private static int meta;
    	 private final String name, unlocalizedName;
    	 
    	 private EnumType(int meta, String name)
    	 {
			this(meta, name, name);
		}
    	 
    	 private EnumType(int meta, String name, String unlocalizedName) 
    	 {
			this.meta= meta;
			this.name= name;
			this.unlocalizedName = unlocalizedName; 
		}
    	 
		@Override
		public String getName() 
		{
			return this.name;		
    	   
       }
       
       public int getMeta()
       {
    	   return this.meta; 
       }
       
       public String getUnlocalizedName()
       {
    	   return this.unlocalizedName;
       }
     } 
  
       
       
       
       
