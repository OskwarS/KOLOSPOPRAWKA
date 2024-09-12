package org.example;

import java.util.Scanner;

public class HumanPlayer extends Player {
    private void showBoard(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.println(this.board.symbols[i][j] + " ");
            }
            System.out.println("/n");
        }
    }
    private void listenInput(){
        Scanner sc = new Scanner(System.in);
        this.board.setSymbols(this.symbol, sc.nextInt(), sc.nextInt());
    }

    @Override
    public void inform(String string) {

    }

    @Override
    public void playTurn() {
        showBoard();
        listenInput();
        inform("tura");
    }
}
