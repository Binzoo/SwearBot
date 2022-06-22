package commands;

import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

public class ping implements MessageCreateListener {

    @Override
    public void onMessageCreate(MessageCreateEvent message) {
        String [] ShouldNotUseWord = {"arse",
                "ass",
                "asshole",
                "bastard",
                "bitch",
                "bollocks",
                "brotherfucker",
                "bugger",
                "bullshit",
                "child-fucker",
                "Christ on a bike",
                "Christ on a cracker",
                "cocksucker",
                "crap",
                "cunt",
                "damn",
                "effing",
                "fatherfucker",
                "frigger",
                "fuck",
                "goddamn",
                "godsdamn",
                "hell",
                "holy shit",
                "horseshit",
                "in shit",
                "motherfucker",
                "nigga",
                "piss",
                "prick",
                "shit",
                "shit ass",
                "sisterfucker",
                "slut",
                "son of a bitch",
                "son of a whore",
                "sweet Jesus",
                "twat",};

        for (String s : ShouldNotUseWord) {
            if (message.getMessageContent().equalsIgnoreCase(s)) {
                message.getMessage().delete();
                message.getChannel().sendMessage("Pls don't use that!");

            }
        }

    }
}


