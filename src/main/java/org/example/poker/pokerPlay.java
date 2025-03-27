package org.example.poker;
import org.example.poker.Messages;
import org.example.poker.logic.CardStages;

import java.util.Scanner;

public class pokerPlay {
    Messages messages = new Messages();
    Deck deck = Deck.getInstance();
    CardStages cardStages = new CardStages();
    Scanner scanner = new Scanner(System.in);

    public void run(){
        System.out.println(messages.getWelcomePokerMessage());
        cardStages.preFlop();
        System.out.println(messages.getUnderTheGunChoieMessage());
        String underGunChoice = scanner.nextLine();
        // Logic for underGun
        cardStages.flop();
        cardStages.Turn();
        cardStages.River();
    }

}
