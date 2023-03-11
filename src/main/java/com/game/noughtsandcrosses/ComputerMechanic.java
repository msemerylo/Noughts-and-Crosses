package com.game.noughtsandcrosses;

import java.util.Random;

public class ComputerMechanic {

    public static boolean computerMove(char[][] board, char computerSymbol) {

        System.out.println(computerSymbol + " Computer move");
        int x = (int) Math.random();
        int y = (int) Math.random();

        boolean correctMove = board[x][y] == 0;
        if (!correctMove) {
            System.out.println("Incorrect move");
            return false;
        }
        board[x][y] = computerSymbol;
        return true;
    }
}

