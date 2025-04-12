package org.example.poker.logic;

import org.example.poker.Card;
import org.example.poker.Messages;
import org.example.poker.Deck;
import org.example.poker.player.*;
import org.example.poker.Table;

public class CardStages {
    Messages messages;
    Deck deck;
    Table table;
    Players players;
    SimulatedPlayers simulatedPlayers;
    Card cardOnePlayer;
    Card cardTwoPlayer;
    Card cardOne;
    Card cardTwo;
    Card cardThree;
    Card cardFour;
    Card cardFive;

    public CardStages(Players players) {//If we don't use the players constructor i can edit everything here back to user
        this.messages = new Messages();
        this.deck = Deck.getInstance();
        this.table = Table.getInstance();
        this.players = players;
        this.simulatedPlayers = new SimulatedPlayers();
        cardOne= table.getCard(1);
        cardTwo= table.getCard(2);
        cardThree= table.getCard(3);
        cardFour = table.getCard(4);
        cardFive = table.getCard(5);
        cardOnePlayer = players.getCardOne();
        cardTwoPlayer = players.getCardTwo();
    }

    public void preFlop() {
        String cardOneString = cardOnePlayer.toString();
        String cardTwoString = cardTwoPlayer.toString();
        System.out.println(cardOneString + " " + cardTwoString);
        System.out.println(messages.getPreFlopMessage());
    }

    public void flop(){
        tableBalanceMessage();
        System.out.println(messages.getFlopMessage(cardOne.toString(), cardTwo.toString(), cardThree.toString()));
    }

    public void Turn(){
        tableBalanceMessage();
        System.out.println(messages.getTurnMessage(cardOne.toString(), cardTwo.toString(), cardThree.toString(), cardFour.toString()));
    }

    public void River(){
        tableBalanceMessage();
        System.out.println(messages.getRiverMessage(cardOne.toString(), cardTwo.toString(), cardThree.toString(), cardFour.toString(), cardFive.toString()));
    }

    public void tableBalanceMessage(){
        System.out.println("-----Table Balance:  " + table.getAccumulatedMoney() + "-----");
    }
}
