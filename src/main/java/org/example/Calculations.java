package org.example;

public class Calculations {
    public int cardSum(int a, int b){
        return a+b;
    }
    public boolean isBust(int cardSum){
        if (cardSum > 21){
            System.out.println(Messages.getPlayerBustsMessage());
            return true;
        }
        else{
            return false;
        }
    }
    public void whoWon(int playerSum, int dealerSum){
        if (playerSum > dealerSum){
            System.out.println(Messages.getPlayerWonMessage());
        }
        else if (playerSum < dealerSum){
            System.out.println(Messages.getDealerWonMessage());
        }
        else{
            System.out.println(Messages.getInvalidMessage());
        }
    }
}
