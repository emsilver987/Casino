package org.example.poker;
import org.example.poker.Messages;
import org.example.poker.logic.CardStages;

public class pokerPlay {
    Messages messages = new Messages();
    Deck deck = Deck.getInstance();
    CardStages cardStages = new CardStages();

    public void run(){
        System.out.println(messages.getWelcomePokerMessage());
        cardStages.preFlop();
    }
}
