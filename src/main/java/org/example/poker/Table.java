package org.example.poker;

public class Table {
    Card cardOne;
    Card cardTwo;
    Card cardThree;
    Card cardFour;
    Card cardFive;
    int money;

    public Table(){
        Deck sharedDeck = Deck.getInstance();
        this.cardOne = sharedDeck.getRandomCard();
        this.cardTwo = sharedDeck.getRandomCard();
        this.cardThree = sharedDeck.getRandomCard();
        this.cardFour = sharedDeck.getRandomCard();
        this.cardFive = sharedDeck.getRandomCard();
        this.money = money;
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
    public int getMoney() {
        return money;
    }

}
