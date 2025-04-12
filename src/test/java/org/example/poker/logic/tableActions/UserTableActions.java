package org.example.poker.logic.tableActions;

import org.example.poker.Table;
import org.example.poker.player.Players;

import java.util.Scanner;

public class UserTableActions implements TableActions {
    Players players;
    Table table;
    Scanner scanner = new Scanner(System.in);
    Boolean blindPlaced = false;

    public UserTableActions(Players player) {
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
        System.out.println("You buy in for " + table.getBuyIn());
        blindPlaced = true;
        System.out.println("-----Your Balance: " + players.getMoney() + "-----"); //Duplicate code - refactor
    }

    public void raise(int amount){
        players.subtractMoney(amount);
        table.addAccumulatedMoney(amount);
        blindPlaced = true;
        System.out.println("-----Your Balance: " + players.getMoney() + "-----");
    }

    public void fold(){
        players.setPlaying(false);
        System.out.println("-----Your Balance: " + players.getMoney() + "-----");
    }
}
