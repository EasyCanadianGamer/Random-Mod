package com.canadiangamer.randommod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.canadiangamer.randommod.core.init.BlockInit;
import com.canadiangamer.randommod.core.init.ItemInit;
import com.canadiangamer.randommod.world.OreGeneration;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(RandomMod.MOD_ID)
public class RandomMod
{
    // Directly reference a log4j logger.
   public static final Logger LOGGER = LogManager.getLogger();
   public static final String MOD_ID = "rm";
public static final ItemGroup RANDOM_GROUP = new RandomGroup("RandomModTab");
    public RandomMod() {
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
		MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        
    }

    
    
    public static class RandomGroup extends ItemGroup {

		public RandomGroup(String label) {
			super(label);
		}

		@Override
		public ItemStack createIcon() {
			return ItemInit.RANDOM_BLOCK.get().getDefaultInstance();
		}
	}
  

}
