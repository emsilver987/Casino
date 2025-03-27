package org.example.poker.logic;

import org.example.poker.player.*;
import org.example.poker.Table;
import java.util.Scanner;

public class TableActions {
    Players players;
    Table table;
    Scanner scanner = new Scanner(System.in);

    public TableActions(Players player) {
        this.players = player;
        Table table = Table.getInstance();
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
        int buyIn = table.getBuyIn();
        players.subtractMoney(buyIn);
    }

    public void raise(int amount){
        int tableMoney = table.getAccumulatedMoney();
        players.subtractMoney(amount);
        table.addAccumulatedMoney(amount);
    }

    public void fold(){
        players.setPlaying(false);
    }
}
