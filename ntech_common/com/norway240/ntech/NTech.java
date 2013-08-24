package com.norway240.ntech;

import com.norway240.ntech.config.ConfigHandler;
import com.norway240.ntech.items.Items;
import com.norway240.ntech.network.PacketHandler;
import com.norway240.ntech.proxies.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = ModInformation.ID, name = ModInformation.NAME, version = ModInformation.VERSION)
@NetworkMod(channels = {ModInformation.CHANNEL}, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)	
public class NTech {
	
	@Instance(ModInformation.ID)
	public static NTech instance;
	
	@SidedProxy(clientSide = "com.norway240.ntech.proxies.ClientProxy", serverSide = "com.norway240.ntech.CommonProxy")
	public static CommonProxy proxy;
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		Items.init();
		proxy.initSounds();
		proxy.initRenderers();
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event) {
		Items.addNames();
		Items.registerRecipes();
	}
	
	@EventHandler
	public void modsLoaded(FMLPostInitializationEvent event) {
		
	}

}
