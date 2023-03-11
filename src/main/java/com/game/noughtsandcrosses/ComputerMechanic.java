package com.game.noughtsandcrosses;

import java.util.Random;

public class ComputerMechanic {

    public static boolean computerMove(char[][] board, char computerSymbol) {

        System.out.println(computerSymbol + " Computer move");
        int x = (int) Math.floor(Math.random()*2);
        int y = (int) Math.floor(Math.random()*2);

        boolean correctMove = board[x][y] == 0;
        if (!correctMove) {
            System.out.println("Incorrect move");
            return false;
        }
        board[x][y] = computerSymbol;
        return true;
    }
}

