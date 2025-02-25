package org.example;

import java.util.Scanner;

public class HitOrStay {
    public int determineHitOrStay(String userInput, int cardSum) {
        if (userInput.equalsIgnoreCase("hit")) {
            cardSum = hit(cardSum);
            return cardSum;
        }
        else if (userInput.equalsIgnoreCase("stay")) {
            stay(cardSum);
            return cardSum;
        }
        else{
            System.out.println(Messages.getInvalidMessage());
            return -1;
        }
    }
    public int hit(int cardSum){
        Initialize initialize = new Initialize();
        cardSum = initialize.generateNewCard(cardSum);
        Calculations calculations = new Calculations();
        if (calculations.isBust(cardSum)){
            System.exit(0);
        }
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
