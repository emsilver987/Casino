package org.example;

public class Initialize {
   public void generateCards(){
       BlackjackCard card1 = new BlackjackCard();
       BlackjackCard card2 = new BlackjackCard();
       Calculations calc = new Calculations();
       System.out.println("Card 1: " + card1.toString() + "\nCard 2: " + card2.toString() + "\nYour Total: " + calc.cardSum(card1.getValue(), card2.getValue()));
   }

}
