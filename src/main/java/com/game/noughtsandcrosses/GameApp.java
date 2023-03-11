package com.game.noughtsandcrosses;

import java.util.Scanner;

public class GameApp {
    public static void main(String[] args) {
        System.out.println("Welcome!");
        //System.out.println("Enter a board size");
        int size = 3; //new Scanner(System.in).nextInt();
        char playerSymbol = 'O';
        char computerSymbol = 'X';
        char[][]board=new char[size][size];

        boolean continueGame = true;
        int numberOfMoves = 0;

        while (continueGame && numberOfMoves<=size*size) {
            Board.boardPrint(board);
            boolean correctMove = (PlayerMechanic.playerMove(board,playerSymbol))||(ComputerMechanic.computerMove(board,computerSymbol));
            if (correctMove) {
                numberOfMoves++;
                boolean winLine = WinMechanic.checkLine(board,computerSymbol);
                boolean winColumn = WinMechanic.checkColumn(board, playerSymbol);
                boolean winAcross1 = WinMechanic.checkAcross1(board, playerSymbol);
                boolean winAcross2 = WinMechanic.checkAcross2(board, playerSymbol);

                boolean computerWinLine = WinMechanic.checkLine(board,computerSymbol);
                boolean computerWinColumn = WinMechanic.checkColumn(board,computerSymbol);
                boolean computerWinAcross1 = WinMechanic.checkAcross1(board,computerSymbol);
                boolean computerWinAcross2 = WinMechanic.checkAcross2(board,computerSymbol);
                if(winLine||winColumn||winAcross1||winAcross2){
                    System.out.println("Congratulations "+playerSymbol+" win!");
                    continueGame = false;
                }
                if (computerWinLine||computerWinColumn||computerWinAcross1||computerWinAcross2){
                    System.out.println("You lose! "+computerSymbol+" Computer win!");
                }
                if(playerSymbol=='O') {
                    ComputerMechanic.computerMove(board,computerSymbol);
                }else {
                    playerSymbol='O';
                }
            }
        }

    }

}
