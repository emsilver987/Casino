package org.example.poker;
import org.example.poker.Messages;

public class pokerPlay {
    Messages messages = new Messages();
    Deck deck = Deck.getInstance();

    public void run(){
        System.out.println(messages.getWelcomePokerMessage());

    }
}
