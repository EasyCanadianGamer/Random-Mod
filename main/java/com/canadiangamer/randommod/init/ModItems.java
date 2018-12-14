package com.canadiangamer.randommod.init;

import java.util.ArrayList;
import java.util.List;

import com.canadiangamer.randommod.items.ItemBase;
import com.canadiangamer.randommod.items.armor.ArmorBase;
import com.canadiangamer.randommod.items.food.FoodBase;
import com.canadiangamer.randommod.items.food.FoodEffectBase;
import com.canadiangamer.randommod.items.tools.ToolAxe;
import com.canadiangamer.randommod.items.tools.ToolHoe;
import com.canadiangamer.randommod.items.tools.ToolPickaxe;
import com.canadiangamer.randommod.items.tools.ToolSpade;
import com.canadiangamer.randommod.items.tools.ToolSword;
import com.canadiangamer.randommod.util.Reference;

import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems
{

	//Material
	public static final ToolMaterial MATERIAL_RANDOM_INGOT = EnumHelper.addToolMaterial("material_random_ingot", 3, 43353645, 10.0f, 900.0f, 20);
	public static final ArmorMaterial ARMOR_MATERIAL_RANDOM_INGOT = EnumHelper.addArmorMaterial("armour_material_random_ingot", Reference.MOD_ID + ":random_ingot", 50, new int[] {27, 28, 29, 30}, 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	
	
	//Items
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item RANDOM_INGOT = new ItemBase ("random_ingot");
	
	//Tools
	public static final ItemSword RANDOM_SWORD = new ToolSword("random_sword",  MATERIAL_RANDOM_INGOT);
	public static final ItemSpade RANDOM_SHOVEL = new ToolSpade("random_shovel", MATERIAL_RANDOM_INGOT);
    public static final ItemPickaxe RANDOM_PICKAXE = new ToolPickaxe("random_pickaxe", MATERIAL_RANDOM_INGOT);
    public static final ItemAxe RANDOM_AXE = new ToolAxe("random_axe", MATERIAL_RANDOM_INGOT);
    public static final ItemHoe RANDOM_HOE = new ToolHoe("random_hoe", MATERIAL_RANDOM_INGOT);

      //Armor
     public static final Item RANDOM_HELMET = new ArmorBase("random_helmet", ARMOR_MATERIAL_RANDOM_INGOT, 1, EntityEquipmentSlot.HEAD);
     public static final Item RANDOM_CHESTPLATE = new ArmorBase("random_chestplate", ARMOR_MATERIAL_RANDOM_INGOT, 1, EntityEquipmentSlot.CHEST);
     public static final Item RANDOM_LEGGINGS = new ArmorBase("random_leggings", ARMOR_MATERIAL_RANDOM_INGOT, 2, EntityEquipmentSlot.LEGS);
     public static final Item RANDOM_BOOTS = new ArmorBase("random_boots", ARMOR_MATERIAL_RANDOM_INGOT, 1, EntityEquipmentSlot.FEET);
   
     //Food 
     //public static final Item RANDOM_MEAT_RAW = new FoodBase("random_meat_raw", 8, 4.2f, false);
     //public static final Item RANDOM_MEAT_COOKED = new FoodBase("random_meat_cooked", 16, 5.2f, false);
     public static final Item RANDOM_MEAT_RAW = new FoodEffectBase("random_meat_raw", 8, 4.2f, false, new PotionEffect(MobEffects.SLOWNESS, (60*20), 2, false, true));
     public static final Item RANDOM_MEAT_COOKED = new FoodEffectBase("random_meat_cooked", 16, 5.2f, false, new PotionEffect(MobEffects.SPEED, 2*(60*20), 4, false, true));
}
 