package com.canadiangamer.randommod.core.init;

import java.util.function.ToIntFunction;

import com.canadiangamer.randommod.RandomMod;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	

	// Light level (Change the 5 to whatever light level you want).
		public static ToIntFunction<BlockState> lightLevel = BlockState -> 10;
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			RandomMod.MOD_ID);
	
	public static final RegistryObject<Block> RANDOM_BLOCK = BLOCKS
			.register("random_block",
					() -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.BLUE)
							.hardnessAndResistance(15f, 30f).harvestTool(ToolType.PICKAXE).harvestLevel(5)
							.sound(SoundType.METAL).setRequiresTool().setLightLevel(lightLevel)));
	
	public static final RegistryObject<Block> RANDOM_ORE = BLOCKS.register("random_ore",
			() -> new Block(AbstractBlock.Properties.from(Blocks.IRON_ORE)));

}
