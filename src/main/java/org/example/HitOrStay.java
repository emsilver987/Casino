package org.example;

import java.util.Scanner;

public class HitOrStay {
    public void determineHitOrStay(String userInput, int cardSum) {
        if (userInput.equalsIgnoreCase("hit")) {
            hit(cardSum);
        }
        else if (userInput.equalsIgnoreCase("stay")) {
            stay();
        }
        else{
            System.out.println(Messages.getInvalidMessage());
        }
    }
    public void hit(int cardSum){
        Initialize initialize = new Initialize();
        initialize.generateNewCard(cardSum);
    }
    public void stay(){

    }
}
