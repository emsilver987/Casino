package org.example.poker.player;

import org.example.poker.Card;
import org.example.poker.Deck;

import java.util.Random;

public class Player4 implements Players {
    private Card cardOne, cardTwo;
    private int money;
    private boolean playing;
    Random random = new Random();

    Player4(){
        Deck sharedDeck = Deck.getInstance();
        Card cardOne = sharedDeck.getRandomCard();
        Card cardTwo = sharedDeck.getRandomCard();
        money = 100;
        playing = true;
    }

    public Card getCardOne() {
        return cardOne;
    }
    public Card getCardTwo(){
        return cardTwo;
    }
    public int getMoney() {
        return money;
    }
    public boolean isPlaying(){
        return playing;
    }

}

