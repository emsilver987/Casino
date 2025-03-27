package org.example.poker.logic;

import org.example.poker.Deck;
import org.example.poker.Card;
import org.example.poker.player.*;

public class TableActions {
    Players players;

    public TableActions(Players player) {
        this.players = player;
    }

    public void call(){
        //Nothing?
    }

    public void raise(){
        //int how much raise, pass money paramter, figure out other logic
    }

    public void fold(){
        players.setPlaying(false);
    }
}
