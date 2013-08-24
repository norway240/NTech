package com.norway240.ntech.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items {
	
	public static Item wrench;
	
	public static void init() {
		wrench = new ItemWrench(ItemInfo.WRENCH_ID);
	}
	
	public static void addNames() {
		LanguageRegistry.addName(wrench, ItemInfo.WRENCH_NAME);
	}
	
	public static void registerRecipes() {
		GameRegistry.addRecipe(new ItemStack(wrench),
				new Object[] { " S ",
							   " I ",
							   " I ",
							   
							   'I', Item.ingotIron,
							   'S', Item.stick
							});
							   
	}

}
