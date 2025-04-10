package org.example;
import java.util.Scanner;

public class UserBehavior {

    public int pickGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to play?:\n (1)BlackJack \n (2)Poker");
        return scanner.nextInt() - 1;
    }

}
