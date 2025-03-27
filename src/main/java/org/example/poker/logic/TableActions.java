package org.example.poker.logic;

import org.example.poker.player.*;
import org.example.poker.Table;

public class TableActions {
    Players players;

    public TableActions(Players player) {
        this.players = player;
    }

    public void tableChoice(int choice){
        if (choice == 1){
            call();
        }
        else if (choice == 2){
            raise();
        }
        else if (choice == 3){
            fold();
        }
    }

    public void call(){
        //Needs to take money out of the players "account"

    }

    //Check function will do nothing

    public void raise(){
        //int how much raise, pass money paramter, figure out other logic
    }

    public void fold(){
        players.setPlaying(false);
    }
}
