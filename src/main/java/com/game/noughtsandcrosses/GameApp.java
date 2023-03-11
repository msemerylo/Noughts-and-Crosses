package com.game.noughtsandcrosses;

import java.util.Scanner;

public class GameApp {
    public static void main(String[] args) {
        System.out.println("Welcome!");
        //System.out.println("Enter a board size");
        int size = 3; //new Scanner(System.in).nextInt();
        char playerSymbol = 'O';
        char computerSymbol = 'X';
        char turn = playerSymbol;
        char[][]board=new char[size][size];

        boolean continueGame = true;
        int numberOfMoves = 0;

        while (continueGame && numberOfMoves<=size*size) {
            Board.boardPrint(board);
            boolean correctMove = (PlayerMechanic.playerMove(board,playerSymbol));
            boolean computerCorrectMove = (ComputerMechanic.computerMove(board,computerSymbol));
            if (correctMove) {
                numberOfMoves++;
                boolean winLine = WinMechanic.checkLine(board, playerSymbol);
                boolean winColumn = WinMechanic.checkColumn(board, playerSymbol);
                boolean winAcross1 = WinMechanic.checkAcross1(board, playerSymbol);
                boolean winAcross2 = WinMechanic.checkAcross2(board, playerSymbol);

                if (winLine || winColumn || winAcross1 || winAcross2) {
                    System.out.println("Congratulations " + playerSymbol + " win!");
                    Board.boardPrint(board);
                    continueGame = false;
                }
                if (turn == playerSymbol) {
                    ComputerMechanic.computerMove(board, computerSymbol);
                } else {
                    PlayerMechanic.playerMove(board, playerSymbol);
                }
            }


            if (computerCorrectMove){
                numberOfMoves++;
                boolean computerWinLine = WinMechanic.checkLine(board,computerSymbol);
                boolean computerWinColumn = WinMechanic.checkColumn(board,computerSymbol);
                boolean computerWinAcross1 = WinMechanic.checkAcross1(board,computerSymbol);
                boolean computerWinAcross2 = WinMechanic.checkAcross2(board,computerSymbol);

                if (computerWinLine || computerWinColumn || computerWinAcross1 || computerWinAcross2){
                    System.out.println("You lose! "+computerSymbol+" Computer win!");
                    Board.boardPrint(board);
                    continueGame = false;
                }
               // if(turn == computerSymbol) {
               //     PlayerMechanic.playerMove(board,playerSymbol);
               // }else {
               //     ComputerMechanic.computerMove(board, computerSymbol);
               // }
            }
        }

    }

}
