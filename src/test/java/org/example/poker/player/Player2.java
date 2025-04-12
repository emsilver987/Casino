//package org.example.poker.player;
//import org.example.poker.Card;
//import org.example.poker.Deck;
//
//public class Player2 implements Players {
//    private int money = 100;
//    private boolean playing;
//    Card cardOne;
//    Card cardTwo;
//
//    public Player2(){
//        Deck sharedDeck = Deck.getInstance();
//        this.cardOne = sharedDeck.getRandomCard();
//        this.cardTwo = sharedDeck.getRandomCard();
//        playing = true;
//    }
//
//    public Card getCardOne() {
//        return cardOne;
//    }
//
//    public Card getCardTwo(){
//        return cardTwo;
//    }
//
//    public int getMoney() {
//        return money;
//    }
//    public boolean isPlaying(){
//        return playing;
//    }
//
//    @Override
//    public void setPlaying(boolean playing) {
//        this.playing = playing;
//    }
//
//    @Override
//    public int subtractMoney(int amount) {
//        money -= amount;
//        return money;
//    }
//
//    @Override
//    public void addMoney(int amount) {
//        money += amount;
//    }
//
//    public String getUser(){
//        return "Player 2";
//    }
//
//}
