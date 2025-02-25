package org.example;

import java.util.Scanner;

public class HitOrStay {
    public void determineHitOrStay(String userInput, int cardSum) {
        if (userInput.equalsIgnoreCase("hit")) {
            hit(cardSum);
        }
        else if (userInput.equalsIgnoreCase("stay")) {
            stay(cardSum);
        }
        else{
            System.out.println(Messages.getInvalidMessage());
        }
    }
    public int hit(int cardSum){
        Initialize initialize = new Initialize();
        cardSum = initialize.generateNewCard(cardSum);
        Calculations calculations = new Calculations();
        calculations.isBust(cardSum);
        return cardSum;
    }
    public void stay(int cardSum){
        Initialize initialize = new Initialize();
        int dealerSum = initialize.generateCards();
        while (dealerSum < cardSum){
            dealerSum = hit(dealerSum);
        }

    }
}
