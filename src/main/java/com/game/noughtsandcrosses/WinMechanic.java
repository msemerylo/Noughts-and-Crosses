package com.game.noughtsandcrosses;

public class WinMechanic {
    public static boolean checkLine(char[][] board, char playerSymbol){
        int size = board.length;
        for (int x=0;x<size;x++){
            boolean win = true;
            for (int y=0;y<size;y++){
                if (board[x][y]!=playerSymbol){
                    win = false;
                    break;
                }
            }
            if(win){
                return true;
            }
        }
        return false;
    }
    public static boolean checkColumn(char[][] board, char playerSymbol){
        int size = board.length;
        for (int y=0;y<size;y++){
            boolean win = true;
            for (int x=0;x<size;x++){
                if (board[x][y]!=playerSymbol){
                    win = false;
                    break;
                }
            }
            if(win){
                return true;
            }
        }
        return false;
    }
    public static boolean checkAcross1(char[][] board, char playerSymbol){
        int size = board.length;
        for (int i=0;i<size;i++){
            if(board[i][i] !=playerSymbol){
                return false;
            }
        }
        return true;
    }
    public static boolean checkAcross2(char[][] board, char playerSymbol){
        int size = board.length;
        for (int a=0;a<size;a++){
            if (board[a][size-a-1]!=playerSymbol){
                return false;
            }
        }
        return true;
    }
    public static boolean checkDraw(char[][] board, char playerSymbol){
        int size = board.length;
        return true;
    }
}
