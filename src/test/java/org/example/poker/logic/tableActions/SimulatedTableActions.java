package org.example.poker.logic.tableActions;

import org.example.poker.Table;
import org.example.poker.player.Players;

import java.util.Random;
import java.util.Scanner;

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
        if (!players.isPlaying()){
            return;
        }
        if (choice == 1){
            call();
        }
        else if (choice == 2){
            int[] amount = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
            int number = amount[random.nextInt(9)];
            raise(number);
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
        System.out.println(players.getUser() + " buys in for " + table.getBuyIn());
        table.addAccumulatedMoney(buyIn);
        players.subtractMoney(buyIn);
        blindPlaced = true;
    }

    public void raise(int amount){
        players.subtractMoney(amount);
        table.addAccumulatedMoney(amount);
        blindPlaced = true; // This blindPlaced logic is not great
        System.out.println(players.getUser() + " raised " + amount);
    }

    public void fold(){
        players.setPlaying(false);
        System.out.println(players.getUser() + " folds");
    }

    // feat - display end balances after round over
}
