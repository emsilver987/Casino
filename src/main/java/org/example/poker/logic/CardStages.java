package org.example.poker.logic;

import org.example.poker.Card;
import org.example.poker.Messages;
import org.example.poker.Deck;
import org.example.poker.player.*;

public class CardStages {
    Messages messages;
    Deck deck;
    Players players;
    Players user;

    public CardStages() {
        this.messages = new Messages();
        this.deck = Deck.getInstance();
        this.user = new User();

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
        System.out.println(cardOneString + " " + cardTwoString);
        System.out.println(messages.getPreFlopMessage());
    }
}
