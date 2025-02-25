package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(Messages.getWelcomeMessage());
        System.out.println(Messages.getWelcomeBlackjackMessage());
        Initialize initialize = new Initialize();
        int cardSum = initialize.generateCards();
        System.out.println(Messages.getHitOrStayMessage());
        Calculations calculations = new Calculations();
        while (!calculations.isBust(cardSum)){
            Scanner userInput = new Scanner(System.in);
            String hitOrStayInput = userInput.nextLine();
            HitOrStay hitOrStay = new HitOrStay();
            cardSum = hitOrStay.determineHitOrStay(hitOrStayInput, cardSum);
        }
    }
}