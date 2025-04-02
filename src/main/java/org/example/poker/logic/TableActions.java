package org.example.poker.logic;

public interface TableActions {
    void tableChoice(int choice);
    void call();
    void raise(int amount);
    void fold();
}
