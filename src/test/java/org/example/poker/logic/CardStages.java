package org.example.poker.logic;

import org.example.poker.Card;
import org.example.poker.Deck;
import org.example.poker.Messages;
import org.example.poker.Table;
import org.example.poker.player.Players;
import org.example.poker.player.SimulatedPlayers;

public class CardStages {
    Messages messages;
    Deck deck;
    Table table;
    Players players;
    SimulatedPlayers simulatedPlayers;

    public CardStages(Players players) {//If we don't use the players constructor i can edit everything here back to user
        this.messages = new Messages();
        this.deck = Deck.getInstance();
        this.table = Table.getInstance();
        this.players = players;
        this.simulatedPlayers = new SimulatedPlayers();
    }

    public void preFlop(){
        Card cardOne = players.getCardOne();
        Card cardTwo = players.getCardTwo();
        String cardOneString = cardOne.toString();
        String cardTwoString = cardTwo.toString();
        System.out.println(cardOneString + " " + cardTwoString);
        System.out.println(messages.getPreFlopMessage());
        //simulatedPlayers
    }

    public void flop(){
        System.out.println("-----Table Balance: " + table.getAccumulatedMoney() + "-----"); //Duplicate Code
        Card cardOne= table.getCard(1);
        Card cardTwo= table.getCard(2);
        Card cardThree= table.getCard(3);
        System.out.println(messages.getFlopMessage(cardOne.toString(), cardTwo.toString(), cardThree.toString()));
    }

    public void Turn(){
        System.out.println("-----Table Balance:  " + table.getAccumulatedMoney() + "-----");
        Card cardOne= table.getCard(1);
        Card cardTwo= table.getCard(2);
        Card cardThree= table.getCard(3);
        Card cardFour = table.getCard(4);
        System.out.println(messages.getTurnMessage(cardOne.toString(), cardTwo.toString(), cardThree.toString(), cardFour.toString()));
    }

    public void River(){
        System.out.println("-----Table Balance:  " + table.getAccumulatedMoney() + "-----");
        Card cardOne= table.getCard(1);
        Card cardTwo= table.getCard(2);
        Card cardThree= table.getCard(3);
        Card cardFour = table.getCard(4);
        Card cardFive = table.getCard(5);
        System.out.println(messages.getRiverMessage(cardOne.toString(), cardTwo.toString(), cardThree.toString(), cardFour.toString(), cardFive.toString()));
    }
}
