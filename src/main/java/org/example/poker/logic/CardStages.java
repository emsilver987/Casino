package org.example.poker.logic;
import org.example.poker.Card;
import org.example.poker.Messages;
import org.example.poker.Deck;

public class CardStages {
    Messages messages = new Messages();
    Deck deck = Deck.getInstance();

    public CardStages() {

    }

    public void preFlop(){
        Card cardOne = deck.getRandomCard();
        Card CardTwo = deck.getRandomCard();

        System.out.println(messages.getPreFlopMessage());
    }
}
