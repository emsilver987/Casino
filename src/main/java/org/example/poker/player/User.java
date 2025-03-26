package org.example.poker.player;
import org.example.poker.Card;
import org.example.poker.Deck;

import java.util.HashMap;
import java.util.Random;

public class User {
    private Card cardOne, cardTwo;
    private int money;
    private boolean playing;
    Random random = new Random();

    User(){
        Deck sharedDeck = Deck.getInstance();
        Card cardOne = sharedDeck.getRandomCard();
        Card cardTwo = sharedDeck.getRandomCard();
        money = 100;
        playing = true;
    }

    public boolean isPlaying(){
        return playing;
    }

}
