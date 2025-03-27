package org.example.poker.player;
import org.example.poker.Card;
import org.example.poker.Deck;
import java.util.Random;

public class User implements Players {
    private int money = 100;
    private boolean playing;
    Card cardOne;
    Card cardTwo;

    public User(){
        Deck sharedDeck = Deck.getInstance();
        this.cardOne = sharedDeck.getRandomCard();
        this.cardTwo = sharedDeck.getRandomCard();
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

    @Override
    public void subtractMoney(int amount) {
        money -= amount;
        System.out.println(amount + " coins have been taken from your account\nThis brings your balance down to: " + money);
    }

    @Override
    public void addMoney(int amount) {
        money += amount;
    }

}
