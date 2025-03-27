package org.example.poker;

public class Messages {
    private static final String welcomePokerMessage = "Welcome to poker";
    private static final String[] moneyMessage = {"You have ", " dollars"};
    private static final String preFlopMessage = "Dealer deals cards to you and 5 other players";
    private static final String flopMessage = "Flop - Cards Dealt: ";
    private static final String turnMessage = "Turn - Cards Dealt: ";
    private static final String riverMessage = "River - Cards Dealt: ";
    private static final String underTheGunChoieMessage = "Call(1), Raise(2), Fold(3)";
    private static final String choieMessage = "Check(1), Raise(2), Fold(3)";

    public String getWelcomePokerMessage() {
        return welcomePokerMessage;
    }
    public String getMoneyMessage() {
        return moneyMessage[0] + moneyMessage[1];
        // Should have a static instance of money that could return that. Don't want to pass argument
    }
    public String getPreFlopMessage() {
        return preFlopMessage;
    }
    public String getFlopMessage(Card cardOne, Card cardTwo, Card cardThree) {
        return flopMessage + cardOne + cardTwo + cardThree;
    }
    public String getTurnMessage(Card cardFour) {
        return turnMessage + cardFour;
    }
    public String getRiverMessage(Card cardFive) {
        return riverMessage + cardFive;
    }
    public String getUnderTheGunChoieMessage(){
        return underTheGunChoieMessage;
    }
    public String getChoieMessage() {
        return choieMessage;
    }
}
