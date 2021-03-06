package com.rayeart.wordsounds.util.handlers;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ChatTestHandler {
	
	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	 public void ListenChat(ClientChatReceivedEvent event) {
        Minecraft game = Minecraft.getMinecraft();
        EntityPlayerSP player = game.player;
        if (event.getMessage().getUnformattedText().toLowerCase().contains("oof")) {
        	System.out.println("got here");
        	player.playSound(SoundsHandler.chat_oof, 1, 1);
        }
	}
}