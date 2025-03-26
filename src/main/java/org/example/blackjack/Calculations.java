package org.example.blackjack;

public class Calculations {
    public int cardSum(int a, int b){
        return a+b;
    }
    public boolean isBust(int cardSum){
        if (cardSum > 21){
            System.out.println(Messages.getGeneralBustMessage());
            return true;
        }
        else{
            return false;
        }
    }
}
