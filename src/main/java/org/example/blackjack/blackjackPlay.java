package org.example.blackjack;

import java.util.Scanner;

public class blackjackPlay {
    public void run(){
        System.out.println(Messages.getWelcomeBlackjackMessage());
        Initialize initialize = new Initialize();
        int cardSum = initialize.generateCards();
        Calculations calculations = new Calculations();
        while (!calculations.isBust(cardSum)){
            System.out.println(Messages.getHitOrStayMessage());
            Scanner userInput = new Scanner(System.in);
            String hitOrStayInput = userInput.nextLine();
            HitOrStay hitOrStay = new HitOrStay();
            cardSum = hitOrStay.determineHitOrStay(hitOrStayInput, cardSum);
        }
    }
}
