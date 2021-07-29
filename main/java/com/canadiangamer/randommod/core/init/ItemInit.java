package com.canadiangamer.randommod.core.init;

import com.canadiangamer.randommod.RandomMod;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	
public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, 
		RandomMod.MOD_ID);
//Items
	public static final RegistryObject<Item> RANDOM_INGOT = ITEMS.register("random_ingot",
			() -> new Item(new Item.Properties().group(RandomMod.RANDOM_GROUP)));

	// Block Items
		public static final RegistryObject<BlockItem> RANDOM_BLOCK = ITEMS.register("random_block",
				() -> new BlockItem(BlockInit.RANDOM_BLOCK.get(),
						new Item.Properties().group(RandomMod.RANDOM_GROUP)));
		
		public static final RegistryObject<BlockItem> RANDOM_ORE = ITEMS.register("random_ore",
				() -> new BlockItem(BlockInit.RANDOM_ORE.get(), new Item.Properties().group(RandomMod.RANDOM_GROUP)));
}
