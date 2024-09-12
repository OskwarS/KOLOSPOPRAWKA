package org.example;

public abstract class LocalBoard extends Board{

    @Override
    public void playGame(Player p1, Player p2) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.symbols[i][j] = Symbol.B;
            }
        }
        boolean game = true;
        Player currentPlayer = p1;
        while (game) {
            currentPlayer.playTurn();
            game = checkGameTurn();
            currentPlayer.inform("Tura gracza: " + currentPlayer.symbol);
            if (currentPlayer == p1) {
                currentPlayer = p2;
            } else {
                currentPlayer = p1;
            }
        p1.inform("Wynik: " + getGameResult());
        p2.inform("Wynik: " + getGameResult());
        }
    }

    public boolean checkGameTurn(){
        return false;
    }

    public String getGameResult(){
        return "REMIS";
    }

    @Override
    public void start() {
        Player one = new HumanPlayer();
        Player two = new HumanPlayer();
        playGame(one, two);
    }



}
