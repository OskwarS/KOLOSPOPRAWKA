package org.example;

public class TicTacToe {
    public static void main(String[] args) {
        if(args[0].equals("hotseats")) {
            Board board = new LocalBoard() {
                @Override
                public void start() {
                    super.start();
                }
            };
            board.start();


        }
    }
}
