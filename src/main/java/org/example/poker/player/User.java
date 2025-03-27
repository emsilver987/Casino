package org.example.poker.player;
import org.example.poker.Card;
import org.example.poker.Deck;
import java.util.Random;

public class User implements Players {
    private int money;
    private boolean playing;
    Card cardOne;
    Card cardTwo;

    public User(){
        Deck sharedDeck = Deck.getInstance();
        this.cardOne = sharedDeck.getRandomCard();
        this.cardTwo = sharedDeck.getRandomCard();
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

    @Override
    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

}
