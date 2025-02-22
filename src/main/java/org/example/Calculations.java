package org.example;

public class Calculations {
    public int cardSum(int a, int b){
        if (a == 10 || a == 11 || a == 12){
            a = 10;
        } else if (a == 13) {
            a = 1; //or 11 to be dealt with later
        } else if (b == 10 || b == 11 || b == 12) {
            b = 10;
        } else if (b == 13) {
            a = 1; //or 11 to be dealt with later
        }
        return a+b;
    }
}
