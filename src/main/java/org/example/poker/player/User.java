package org.example.poker.player;
import org.example.poker.Card;

import java.util.Random;

public class User {
    private Card cardOne, cardTwo;
    private int money;
    private boolean playing;
    Random random = new Random();

    User(){
        this.cardOne = new Card();
        this.cardTwo = new Card();
        money = 100;
        playing = true;
    }

    public boolean isPlaying(){
        return playing;
    }

}
