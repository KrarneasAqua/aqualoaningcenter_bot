package me.krarneasaqua.commands;

import me.krarneasaqua.Main;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

public class ping implements MessageCreateListener {

    @Override
    public void onMessageCreate(MessageCreateEvent message) {
        //a!ping = will show "pong!" or current ping
        if (message.getMessageContent().equalsIgnoreCase(Main.Prefix + "ping")){
            message.getChannel().sendMessage("pong!");
        }
        //a!prefix = will show current prefix
        if (message.getMessageContent().equalsIgnoreCase(Main.Prefix + "prefix")){
            message.getChannel().sendMessage(Main.Prefix);
        }
    }
}
