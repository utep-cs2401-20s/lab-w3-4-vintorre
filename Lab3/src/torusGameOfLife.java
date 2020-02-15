public class torusGameOfLife extends gameOfLife{

    public torusGameOfLife(){}

    public torusGameOfLife(int size){
        this.size = size;
        board = new int[size][size];
        previous = new int[size][size];

    }

    public torusGameOfLife(int[][] g){
        this.size = g.length;
        previous = new int[size][size];
        board = new int[size][size];

        for(int i = 0; i<this.board.length;i++){
            for(int j =0; j<this.board[i].length;j++){
                board[i][j] = g[i][j];

            }
        }

    }

    @Override
    public int neighbors (int r, int c){
        int count = 0;

        if(board[((r+size)-1)%size][((c+size)-1)%size] == 1)
            count++;
        if(this.board[((r+size)-1)%size][(c+size)%size] == 1)
            count++;
        if(this.board[((r+size)-1)%size][((c+size)+1)%size] == 1)
            count++;
        if(this.board[(r+size)%size][((c+size)-1)%size] == 1)
            count++;
        if(this.board[(r+size)%size][((c+size)+1)%size] == 1)
            count++;
        if(this.board[((r+size)+1)%size][((c+size)-1)%size] == 1)
            count++;
        if(this.board[((r+size)+1)%size][(c+size)%size]== 1)
            count++;
        if(this.board[((r+size)+1)%size][((c+size)+1)%size] == 1)
            count++;

        return count;
    }

    public static void main(String[] args) {
        int[][] v = {{0,0,0,0,0},{0,0,0,0,0},{0,1,1,1,0},{0,0,0,0,0},{0,0,0,0,0}};
        int[][] test1 = {{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,1,1,1,0},{0,1,1,1,0,0},{0,0,0,0,0,0}};
        int[][] test2 = {{0,0,0,0,0,0},{0,1,1,0,0,0},{0,1,1,0,0,0},{0,0,0,1,1,0,},{0,0,1,1,0,0},{0,0,0,0,0,0}};
        int[][] test3 = {{0,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,1,1,1,0,0,0,0},{0,0,0,1,0,1,0,1,0,0,0},{0,0,0,1,0,1,0,1,0,0,0},{0,0,0,0,1,1,1,0,0,0,0},{0,0,0,0,0,1,0,0,0,0,0}};
        int[][] A = {{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,1,1,1,0,0,0,0},{0,0,0,1,0,1,0,1,0,0,0},{0,0,0,1,0,1,0,1,0,0,0},{0,0,0,0,1,1,1,0,0,0,0},{0,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,1,1,1,0,0,0,0},{0,0,0,1,0,1,0,1,0,0,0},{0,0,0,1,0,1,0,1,0,0,0},{0,0,0,0,1,1,1,0,0,0,0},{0,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0}};

        torusGameOfLife t = new torusGameOfLife(v);
        t.oneStep();
        t.printBoard();
    }
}
