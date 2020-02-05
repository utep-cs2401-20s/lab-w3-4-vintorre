public class gameOfLife{
    /*torus will call its own neighbor method
    *evolution will call neighbor method
    *have previous board and next board
    *neighbor%size
    *(neighbor+size)%size
    */

    int size;
    int[][] board;
    int[][] previous;


    public gameOfLife(){}

    public gameOfLife(int size){
        board = new int[size][size];
        previous = new int[size][size];

    }

    public gameOfLife(int[][] board){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j< board[i].length; j++){
                this.previous[i][j]= board[i][j];
            }
        }
    }

    public int[][] getBoard(){
        return this.board;
    }

    public static void main(String[] args) {
        System.out.print("hello");
    }



}
