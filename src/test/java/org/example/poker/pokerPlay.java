package org.example.poker;
import org.example.Game;
import org.example.poker.logic.CardStages;
import org.example.poker.logic.EndGame;
import org.example.poker.logic.tableActions.UserTableActions;
import org.example.poker.player.SimulatedPlayers;
import org.example.poker.player.User;

import java.util.Scanner;

public class pokerPlay implements Game {
    private final Messages messages;
    private final Deck deck;
    private final Scanner scanner;
    private final User user;
    private final CardStages cardStages;
    private final UserTableActions tableActions;
    private final SimulatedPlayers simulatedPlayers;
    private final EndGame endGame;

    public pokerPlay(Messages messages, Deck deck, Scanner scanner,
                     User user, CardStages cardStages,
                     UserTableActions tableActions,
                     SimulatedPlayers simulatedPlayers,
                     EndGame endGame) {
        this.messages = messages;
        this.deck = deck;
        this.scanner = scanner;
        this.user = user;
        this.cardStages = cardStages;
        this.tableActions = tableActions;
        this.simulatedPlayers = simulatedPlayers;
        this.endGame = endGame;
    }


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
        endGame.run(simulatedPlayers.getAllPlayers(user));
    }

}
