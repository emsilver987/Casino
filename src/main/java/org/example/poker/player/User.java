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
    public int subtractMoney(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount to subtract cannot be negative.");
        }
        if (amount > money) {
            throw new IllegalArgumentException("Insufficient funds: cannot subtract " + amount + " from " + money);
        }
        money -= amount;
        return money;
    }

    @Override
    public void addMoney(int amount) {
        money += amount;
    }

    @Override
    public String getUser() {
        return "User";
    }
}
