package com.discord.bots;

import commands.ping;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

public class Main {
    public static void main(String[] args) {
        DiscordApi bot = new DiscordApiBuilder().setToken("Add your token").
                login().join();
        bot.addListener(new ping());
        System.out.println("Bot is Online!" + "Owner of the sever"+ bot.getOwner());
    }
}
