package com.rayeart.wordsounds.util.handlers;

import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class RegistryHandler 
{
	public static void initRegistries()
	{
		SoundsHandler.registerSounds();
	}
}
