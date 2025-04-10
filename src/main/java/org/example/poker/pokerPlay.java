package org.example.poker;
import org.example.Game;
import org.example.poker.logic.CardStages;
import org.example.poker.logic.UserTableActions;
import org.example.poker.player.SimulatedPlayers;
import org.example.poker.player.User;

import java.util.Scanner;

public class pokerPlay implements Game {
    Messages messages = new Messages();
    Deck deck = Deck.getInstance();
    Scanner scanner = new Scanner(System.in);
    User user = new User();
    CardStages cardStages = new CardStages(user);
    UserTableActions tableActions = new UserTableActions(user);
    SimulatedPlayers simulatedPlayers = new SimulatedPlayers();

    public void run(){
        System.out.println(messages.getWelcomePokerMessage());
        cardStages.preFlop();
        System.out.println(messages.getUnderTheGunChoieMessage());
        tableActions.tableChoice(scanner.nextInt());
        simulatedPlayers.runSimulatedPlayers();
        cardStages.flop();
        System.out.println(messages.getChoieMessage());
        tableActions.tableChoice(scanner.nextInt());
        simulatedPlayers.runSimulatedPlayers();
        cardStages.Turn();
        System.out.println(messages.getChoieMessage());
        tableActions.tableChoice(scanner.nextInt());
        simulatedPlayers.runSimulatedPlayers();
        cardStages.River();
    }

}
