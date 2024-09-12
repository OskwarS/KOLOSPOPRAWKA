package org.example;

public abstract class Board {
    Symbol[][] symbols = new Symbol[3][3];

    public void setSymbols(Symbol symbol, int x, int y) {
        this.symbols[x][y] = symbol;
    }

    public abstract void playGame(Player p1, Player p2);

    public abstract void start();

}
