package com.game.noughtsandcrosses;

public class ComputerMechanic {
    public static boolean computerMove(char[][] board, char computerSymbol) {

        System.out.println(computerSymbol + " Computer move");
        int x = (int) Math.floor(Math.random()*3);
        int y = (int) Math.floor(Math.random()*3);

        boolean computerCorrectMove = board[x][y] == 0;
        if (!computerCorrectMove) {
            System.out.println("Incorrect move");
            return false;
        }
        board[x][y] = computerSymbol;
        return true;
    }
}

