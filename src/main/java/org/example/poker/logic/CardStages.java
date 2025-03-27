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
    Players user;

    public CardStages() {
        this.messages = new Messages();
        this.deck = Deck.getInstance();
        this.table = Table.getInstance();
    }

    public void preFlop(){
        Card cardOne = user.getCardOne();
        Card cardTwo = user.getCardTwo();
        String cardOneString = cardOne.toString();
        String cardTwoString = cardTwo.toString();
        System.out.println(cardOneString + " " + cardTwoString);
        System.out.println(messages.getPreFlopMessage());
    }

    public void flop(){
        System.out.println("Table has " + table.getAccumulatedMoney() + " in the pot");
        Card cardOne= table.getCard(1);
        Card cardTwo= table.getCard(2);
        Card cardThree= table.getCard(3);
        System.out.println(messages.getFlopMessage(cardOne.toString(), cardTwo.toString(), cardThree.toString()));
    }

    public void Turn(){
        System.out.println("Table has " + table.getAccumulatedMoney() + " in the pot");
        Card cardOne= table.getCard(1);
        Card cardTwo= table.getCard(2);
        Card cardThree= table.getCard(3);
        Card cardFour = table.getCard(4);
        System.out.println(messages.getTurnMessage(cardOne.toString(), cardTwo.toString(), cardThree.toString(), cardFour.toString()));
    }

    public void River(){
        System.out.println("Table has " + table.getAccumulatedMoney() + " in the pot");
        Card cardOne= table.getCard(1);
        Card cardTwo= table.getCard(2);
        Card cardThree= table.getCard(3);
        Card cardFour = table.getCard(4);
        Card cardFive = table.getCard(5);
        System.out.println(messages.getRiverMessage(cardOne.toString(), cardTwo.toString(), cardThree.toString(), cardFour.toString(), cardFive.toString()));
    }
}
