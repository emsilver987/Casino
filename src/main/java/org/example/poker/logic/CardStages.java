package org.example.poker.logic;

import org.example.poker.Card;
import org.example.poker.Messages;
import org.example.poker.Deck;
import org.example.poker.player.*;
import org.example.poker.Table;

public class CardStages {
    Messages messages;
    Deck deck;
    Players players;
    Players user;
    Table table;

    public CardStages() {
        this.messages = new Messages();
        this.deck = Deck.getInstance();
        this.user = new User();
        this.table = new Table();

        Players player1 = new Player1();
        Players player2 = new Player2();
        Players player3 = new Player3();
        Players player4 = new Player4();
        Players player5 = new Player5();
    }

    public void preFlop(){
        Card cardOne = user.getCardOne();
        Card cardTwo = user.getCardTwo();
        String cardOneString = cardOne.toString();
        String cardTwoString = cardTwo.toString();
        // Need a call here to instatiate all other players the same way - not here
        System.out.println(cardOneString + " " + cardTwoString);
        System.out.println(messages.getPreFlopMessage());
    }

    public void flop(){
        Card cardOne= table.getCard(1);
        Card cardTwo= table.getCard(2);
        Card cardThree= table.getCard(3);
        System.out.println(messages.getFlopMessage(cardOne.toString(), cardTwo.toString(), cardThree.toString()));
    }
}
