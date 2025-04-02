package org.example.poker.logic;

import org.example.poker.Table;
import org.example.poker.player.Players;

import java.util.Scanner;

public class SimulatedTableActions implements TableActions {
    Players players;
    Table table;
    Scanner scanner = new Scanner(System.in);
    Boolean blindPlaced = false;

    public SimulatedTableActions(Players player) {
        this.players = player;
        this.table = Table.getInstance();
    }

    public void tableChoice(int choice){
        if (choice == 1){
            call();
        }
        else if (choice == 2){
            //Call a random raise funciton
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
        System.out.println("Your Balance: " + players.getMoney()); //Getter for playerName and display
    }

    public void raise(int amount){
        players.subtractMoney(amount);
        table.addAccumulatedMoney(amount);
        blindPlaced = true;
        System.out.println("Your Balance: " + players.getMoney()); //Gettter for playnerName
    }

    public void fold(){
        players.setPlaying(false); // Get that player folded
    }
}
