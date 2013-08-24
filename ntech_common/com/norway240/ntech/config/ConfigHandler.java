package com.norway240.ntech.config;

import java.io.File;
import com.norway240.ntech.items.ItemInfo;
import net.minecraftforge.common.Configuration;

public class ConfigHandler {
	
	public static void init(File file) {
		Configuration config = new Configuration(file);
		
		config.load();
		
		ItemInfo.WRENCH_ID = config.getItem(ItemInfo.WRENCH_KEY, ItemInfo.WRENCH_DEFAULT).getInt() - 256;
		
		config.save();
		
	}

}
