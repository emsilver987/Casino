package org.example;
import org.example.blackjack.Calculations;
import org.example.blackjack.HitOrStay;
import org.example.blackjack.Initialize;
import org.example.blackjack.Messages;
import org.example.poker.pokerPlay;
import org.example.blackjack.*;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(Messages.getWelcomeMessage());
        pokerPlay poker = new pokerPlay();
        poker.run();
    }
    // feat - display all players currently in
}