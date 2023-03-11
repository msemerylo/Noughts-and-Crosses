package com.game.noughtsandcrosses;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class NoughtsAndCrossesTestSuite {

    @Test
    public void testVerifyingOWinsInLines() {
        //given
        char playerSymbol = 'O';
        int size = 3;
        char[][]board = new char[size][size];
        board[0][0]=playerSymbol;
        board[0][1]=playerSymbol;
        board[0][2]=playerSymbol;
        //when
        //then
        Assert.assertEquals(true,WinMechanic.checkLine(board,playerSymbol));
    }
    @Test
    public void testVerifyingOWinsInColumns(){
        //given
        char playerSymbol = 'O';
        int size = 3;
        char[][]board = new char[size][size];
        board[0][0]=playerSymbol;
        board[1][0]=playerSymbol;
        board[2][0]=playerSymbol;
        //when
        //then
        Assert.assertEquals(true,WinMechanic.checkColumn(board,playerSymbol));
    }
    @Test
    public void testVerifyingOWinsAcross1(){
        //given
        char playerSymbol = 'O';
        int size = 3;
        char[][]board = new char[size][size];
        board[0][0]=playerSymbol;
        board[1][1]=playerSymbol;
        board[2][2]=playerSymbol;
        //when
        //then
        Assert.assertEquals(true,WinMechanic.checkAcross1(board,playerSymbol));
    }
    @Test
    public void testVerifyingOWinsAcross2(){
        //given
        char playerSymbol = 'O';
        int size = 3;
        char[][]board = new char[size][size];
        board[0][2]=playerSymbol;
        board[1][1]=playerSymbol;
        board[2][0]=playerSymbol;
        //when
        //then
        Assert.assertEquals(true,WinMechanic.checkAcross2(board,playerSymbol));
    }
    @Test
    public void testVerifyingXWinsInLines() {
        //given
        char playerSymbol = 'X';
        int size = 3;
        char[][]board = new char[size][size];
        board[0][0]=playerSymbol;
        board[0][1]=playerSymbol;
        board[0][2]=playerSymbol;
        //when
        //then
        Assert.assertEquals(true,WinMechanic.checkLine(board,playerSymbol));
    }
    @Test
    public void testVerifyingXWinsInColumns(){
        //given
        char playerSymbol = 'X';
        int size = 3;
        char[][]board = new char[size][size];
        board[0][0]=playerSymbol;
        board[1][0]=playerSymbol;
        board[2][0]=playerSymbol;
        //when
        //then
        Assert.assertEquals(true,WinMechanic.checkColumn(board,playerSymbol));
    }
    @Test
    public void testVerifyingXWinsAcross1(){
        //given
        char playerSymbol = 'X';
        int size = 3;
        char[][]board = new char[size][size];
        board[0][0]=playerSymbol;
        board[1][1]=playerSymbol;
        board[2][2]=playerSymbol;
        //when
        //then
        Assert.assertEquals(true,WinMechanic.checkAcross1(board,playerSymbol));
    }
    @Test
    public void testVerifyingXWinsAcross2(){
        //given
        char playerSymbol = 'X';
        int size = 3;
        char[][]board = new char[size][size];
        board[0][2]=playerSymbol;
        board[1][1]=playerSymbol;
        board[2][0]=playerSymbol;
        //when
        //then
        Assert.assertEquals(true,WinMechanic.checkAcross2(board,playerSymbol));
    }
}
