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
        this.size = size;
        board = new int[size][size];
        previous = new int[size][size];

    }

    public gameOfLife(int[][] g){
        this.size = g.length;
        previous = new int[size][size];
        board = new int[size][size];

        for(int i = 0; i<this.board.length;i++){
            for(int j =0; j<this.board[i].length;j++){
                board[i][j] = g[i][j];

            }
        }

    }

    public int[][] getBoard(){
        return this.board;
    }

    public void oneStep(){

        for(int i = 0; i < this.board.length; i++){
            for(int j = 0; j < this.board[i].length; j++){
                if(this.board[i][j]== 1){
                    if(neighbors(i, j) < 2)
                        this.previous[i][j]=0;
                    if(neighbors(i, j) == 2|| neighbors(i, j) ==3)
                        this.previous[i][j]=1;
                    if(neighbors(i,j) > 3 )
                        this.previous[i][j] =0;
                }
                if(this.board[i][j] == 0){
                    if(neighbors(i,j) == 3)
                        this.previous[i][j] = 1;
                    else
                        this.previous[i][j] =0;
                }

            }
        }

        for(int a = 0; a<board.length; a++){
            for(int b = 0; b<board[a].length; b++){
                this.board[a][b] = this.previous[a][b];
            }
        }


    }

    public int neighbors(int r, int c){
        int count = 0;

        if(r-1 >= 0){
            if (this.board[r - 1][c] != 0)
                count++;
            if(c - 1 >= 0)
                if (this.board[r - 1][c - 1] != 0)
                    count++;
            if(c+1 < board[r].length)
                if (this.board[r - 1][c + 1] != 0)
                    count++;
            }

        if (c - 1 >= 0)
                if (this.board[r][c - 1] != 0)
                    count++;

            if(c+1< board[0].length)
                if (this.board[r][c + 1] != 0)
                    count++;

        if(r+1 < board.length) {
            if (this.board[r + 1][c] != 0)
                count++;
            if(c-1>= 0) {
                if (this.board[r + 1][c - 1] != 0)
                    count++;
            }
            if(c+1 < board[0].length){
                if (this.board[r + 1][c + 1] != 0)
                count++;
            }
        }

        return count;
    }

    public void evolution(int n){
        for(int i = n; i > 0; i--){
            oneStep();
        }

    }

    public void printBoard(){
        for(int i = 0; i<this.board.length; i++){
            for(int g = 0; g<this.board[i].length; g++){
                System.out.print(this.board[i][g]);
            }
        }
    }

    //GOL gol = new GOL();
    //gol.oneStep();

    public static void main(String[] args) {
        int[][] test = {{0,0,0,0,0},{0,0,0,0,0},{0,1,1,1,0},{0,0,0,0,0},{0,0,0,0,0}};
        int[][] test1 = {{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,1,1,1,0},{0,1,1,1,0,0},{0,0,0,0,0,0}};
        int[][] test2 = {{0,0,0,0,0,0},{0,1,1,0,0,0},{0,1,1,0,0,0},{0,0,0,1,1,0,},{0,0,1,1,0,0},{0,0,0,0,0,0}};
        int[][] test3 = {{0,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,1,1,1,0,0,0,0},{0,0,0,1,0,1,0,1,0,0,0},{0,0,0,1,0,1,0,1,0,0,0},{0,0,0,0,1,1,1,0,0,0,0},{0,0,0,0,0,1,0,0,0,0,0}};




    }



}

//torusGameOfLife extends gameOfLife
//new constructors (cannot inherit constructors
//new neighbors method add @override *use modulus
//inherit neighbors, oneStep, evolution
