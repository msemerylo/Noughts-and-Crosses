package com.game.noughtsandcrosses;

public class Board {
    public static void boardPrint(char[][]board) {
        int size = board.length;
        System.out.print("  ");
        for (int i = 0; i < size; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int x = 0; x < board.length; x++) {
            System.out.print(x);
            System.out.print("|");
            for (int y = 0; y < board[x].length; y++) {
                System.out.print(board[x][y] + "|");
            }
            System.out.println();
        }
    }
}
