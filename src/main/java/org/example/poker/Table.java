package org.example.poker;

public class Table {
    Card cardOne;
    Card cardTwo;
    Card cardThree;
    Card cardFour;
    Card cardFive;
    int accumulatedMoney = 0;
    int buyIn = 10;
    private static Table instance;

    private Table() {
        Deck sharedDeck = Deck.getInstance();
        this.cardOne = sharedDeck.getRandomCard();
        this.cardTwo = sharedDeck.getRandomCard();
        this.cardThree = sharedDeck.getRandomCard();
        this.cardFour = sharedDeck.getRandomCard();
        this.cardFive = sharedDeck.getRandomCard();
    }

    public static Table getInstance() {
        if (instance == null) {
            instance = new Table();
        }
        return instance;
    }

    public Card getCard(int index) {
        if (index == 1){
            return cardOne;
        }
        else if (index == 2){
            return cardTwo;
        }
        else if (index == 3){
            return cardThree;
        }
        else if (index == 4){
            return cardFour;
        }
        else if (index == 5){
            return cardFive;
        }
        return null;
    }

    public int getAccumulatedMoney() {
        return accumulatedMoney;
    }

    public void addAccumulatedMoney(int amount) {
        accumulatedMoney =+ amount;
    }

    public int getBuyIn() {
        return buyIn;
    }

}
