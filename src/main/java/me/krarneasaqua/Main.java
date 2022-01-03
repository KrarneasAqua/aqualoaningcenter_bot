package me.krarneasaqua;

import me.krarneasaqua.commands.ping;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

public class Main {

    public static String Prefix = "a!";
    public static void main(String[] args){
        DiscordApi Bot = new DiscordApiBuilder().setToken(System.getenv().get("TOKEN")).login().join();

        Bot.addListener(new ping());

        System.out.println("Bot is online!");
    }
}
