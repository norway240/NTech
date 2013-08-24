package com.norway240.ntech.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemWrench extends Item{
	
	public ItemWrench(int id) {
		super(id);
		setCreativeTab(CreativeTabs.tabMisc);
		setMaxStackSize(1);
		setUnlocalizedName(ItemInfo.WRENCH_UNLOCALIZED_NAME);
	}
	
	@Override
	public boolean func_111207_a(ItemStack itemstack, EntityPlayer player, EntityLivingBase target) {
		if (!target.worldObj.isRemote) {
			target.motionY = 2;
		}
		
		return false;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.WRENCH_ICON);
	}

}
