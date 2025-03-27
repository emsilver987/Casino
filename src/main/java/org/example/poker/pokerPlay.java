package org.example.poker;
import org.example.poker.Messages;
import org.example.poker.logic.CardStages;
import org.example.poker.logic.TableActions;
import org.example.poker.player.User;

import java.util.Scanner;

public class pokerPlay {
    Messages messages = new Messages();
    Deck deck = Deck.getInstance();
    Scanner scanner = new Scanner(System.in);
    User user = new User();
    CardStages cardStages = new CardStages(user);
    TableActions tableActions = new TableActions(user);

    public void run(){
        System.out.println(messages.getWelcomePokerMessage());
        cardStages.preFlop();
        System.out.println(messages.getUnderTheGunChoieMessage());
        tableActions.tableChoice(scanner.nextInt());
        cardStages.flop();
        cardStages.Turn();
        cardStages.River();
    }

}
