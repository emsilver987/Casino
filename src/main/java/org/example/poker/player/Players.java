package org.example.poker.player;

import org.example.poker.Card;

public interface Players {
    public Card getCardOne();
    public Card getCardTwo();
    public int getMoney();
    public boolean isPlaying();
    public void setPlaying(boolean playing);
    public void subtractMoney(int amount);
    public void addMoney(int amount);
}
