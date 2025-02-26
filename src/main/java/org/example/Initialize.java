package org.example;

public class Initialize {
   public int generateCards(){
       BlackjackCard card1 = new BlackjackCard();
       BlackjackCard card2 = new BlackjackCard();
       Calculations calc = new Calculations();
       int card1Val = card1.getValue();
       int card2Val = card2.getValue();
       int cardSum = calc.cardSum(card1Val, card2Val);
       System.out.println("Card 1: " + card1 + "\nCard 2: " + card2 + "\nTotal: " + cardSum);
       return cardSum;
   }
   public int generateNewCard(int cardSum){
       BlackjackCard newCard = new BlackjackCard();
       Calculations calc = new Calculations();
       int card1Val = newCard.getValue();
       int newCardSum = calc.cardSum(cardSum, card1Val);
       System.out.println("New Card: " + newCard + "\nNew Total: " + newCardSum);
       return newCardSum;
   }

}
