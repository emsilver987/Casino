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
    // Function Responsible for Dealer Dealing
    public void stay(int cardSum){
        Initialize initialize = new Initialize();
        Calculations calculations = new Calculations();
        System.out.println("\nDealers Cards: ");
        int dealerSum = initialize.generateCards();
        while (dealerSum <= cardSum){
            System.out.println("\nDealers Draws Another Card: ");
            dealerSum = hit(dealerSum);
        }
        if (!calculations.isBust(dealerSum)){
            System.out.println("\nDealer Wins");
        }
        else {
            System.out.println("\nYou Win!");
        }
    }
}
