package org.example.problems.medium.tictactoe.Model;

public class Board {

    public int size;
    public PlayingPiece[][] board;

    public Board(int size){
        this.size = size;
        board = new PlayingPiece[size][size];
    }



}
