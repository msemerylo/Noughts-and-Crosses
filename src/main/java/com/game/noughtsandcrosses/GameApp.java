package com.game.noughtsandcrosses;

import java.util.Scanner;

public class GameApp {
    public static void main(String[] args) {
        System.out.println("Welcome!");
        System.out.println("Enter a board size");
        int size = new Scanner(System.in).nextInt();
        char playerSymbol = 'O';
        char[][]board=new char[size][size];

        boolean continueGame = true;
        int numberOfMoves = 0;

        while (continueGame && numberOfMoves<=size*size) {
            Board.boardPrint(board);
            boolean correctMove = PlayerMechanic.playerMove(board,playerSymbol);
            if (correctMove) {
                numberOfMoves++;
                boolean winLine = WinMechanic.checkLine(board, playerSymbol);
                boolean winColumn = WinMechanic.checkColumn(board, playerSymbol);
                boolean winAcross1 = WinMechanic.checkAcross1(board, playerSymbol);
                boolean winAcross2 = WinMechanic.checkAcross2(board, playerSymbol);
                if(winLine||winColumn||winAcross1||winAcross2){
                    System.out.println("Congratulations "+playerSymbol+" win!");
                    continueGame = false;
                }
                playerSymbol = playerSymbol == 'X' ? 'O' : 'X';
            }
        }

    }

}
