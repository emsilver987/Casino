package org.example.poker.logic;

import org.example.poker.Table;
import org.example.poker.player.Players;

import java.util.Scanner;
import java.util.Random;

public class SimulatedTableActions implements TableActions {
    Players players;
    Table table;
    Scanner scanner = new Scanner(System.in);
    Boolean blindPlaced = false;
    Random random = new Random();

    public SimulatedTableActions(Players player) {
        this.players = player;
        this.table = Table.getInstance();
    }

    public void tableChoice(int choice){
        if (choice == 1){
            call();
        }
        else if (choice == 2){
            int amount = random.nextInt(30) + 1;
            raise(amount);
        }
        else if (choice == 3){
            fold();
        }
    }

    public void call(){
        if (blindPlaced){
            return;
        }
        int buyIn = table.getBuyIn();
        table.addAccumulatedMoney(buyIn);
        players.subtractMoney(buyIn);
        blindPlaced = true;
    }

    public void raise(int amount){
        players.subtractMoney(amount);
        table.addAccumulatedMoney(amount);
        blindPlaced = true;
        System.out.println(players.getUser() + " raised " + amount);
    }

    public void fold(){
        players.setPlaying(false);
        System.out.println(players.getUser() + " folds");
    }

    // feat - display end balances after round over
}
