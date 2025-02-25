package org.example;

public class Calculations {
    public int cardSum(int a, int b){
        return a+b;
    }
    public boolean isBust(int cardSum){
        if (cardSum > 21){
            System.out.println("You bust!");
            return true;
        }
        else{
            return false;
        }
    }
    public void whoWon(int playerSum, int dealerSum){
        if (playerSum > dealerSum){
            System.out.println("You won!"); //Put these messages in messages class
        }
        else if (playerSum < dealerSum){
            System.out.println("Dealer won!");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
