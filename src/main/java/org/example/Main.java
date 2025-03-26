package org.example;
import org.example.blackjack.Calculations;
import org.example.blackjack.HitOrStay;
import org.example.blackjack.Initialize;
import org.example.blackjack.Messages;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(Messages.getWelcomeMessage());
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