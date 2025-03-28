package org.example.poker.logic;

import org.example.poker.player.*;
import org.example.poker.Table;
import java.util.Scanner;

public class TableActions {
    Players players;
    Table table;
    Scanner scanner = new Scanner(System.in);
    Boolean blindPlaced = false;

    public TableActions(Players player) {
        this.players = player;
        this.table = Table.getInstance();
    }

    public void tableChoice(int choice){
        if (choice == 1){
            call();
        }
        else if (choice == 2){
            System.out.println("How much would you like to raise?");
            int amount = scanner.nextInt();
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
    }

    public void fold(){
        players.setPlaying(false);
    }
}
