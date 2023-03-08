package com.game.noughtsandcrosses;

import java.util.Scanner;

public class PlayerMechanic {
    public static boolean playerMove(char[][]board,char playerSymbol) {
        System.out.println(playerSymbol + " Your turn");
        System.out.println("Enter a column number");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Enter a line number");
        int y = new Scanner(System.in).nextInt();

        boolean correctMove = board[x][y] == 0;
        if (!correctMove) {
            System.out.println("Incorrect move");
            return false;
        }
        board[x][y] = playerSymbol;
        return true;
    }
}
