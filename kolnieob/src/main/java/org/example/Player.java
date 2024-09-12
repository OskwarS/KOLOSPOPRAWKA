package org.example;

public abstract class Player {
    Symbol symbol;
    Board board;

    public abstract void playTurn();
    public abstract void inform(String string);

    public abstract void playGame(Player p1, Player p2);
}
