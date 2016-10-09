import java.util.Scanner;

/**
 * Created by Mathurs on 10/9/16.
 */
public class TicTacToe {

    int[][] board;
    int size = 3;

    class move{
        int row;
        int col;
        int player;

        public move(int player, int row, int col) {
            this.row = row;
            this.col = col;
            this.player = player;
        }

        public int getRow() {
            return row;
        }

        public void setRow(int row) {
            this.row = row;
        }

        public int getCol() {
            return col;
        }

        public void setCol(int col) {
            this.col = col;
        }

        public int getPlayer() {
            return player;
        }

        public void setPlayer(int player) {
            this.player = player;
        }
    }


    public TicTacToe() {
        this.board = new int[size][size];
    }

    public boolean checkRow(int row, int player){

        if(board[row][0] == player && board[row][1] == player  && board[row][2] == player )
            return true;
        else
            return false;
    }

    public boolean checkCol(int col, int player){

        if(board[0][col] == player && board[1][col] == player  && board[2][col] == player )
            return true;
        else
            return false;
    }

    public boolean checkDiagnol(int player){
        if(board[0][0] == player && board[1][1] == player && board[2][2] == player)
            return true;

        if(board[2][0] == player && board[1][1] == player && board[0][2] == player)
            return true;

        return false;
    }

    public void declareWinner(int player){
        System.out.print("Player "+player+" Won");
    }

    public void startTicTacToe(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Start TIC TAC TOE");


        int movesCount = 0;
        while(true){
            System.out.println("Enter Player , row , col");
            String[] input = scanner.next().split(",");
            int player = Integer.parseInt(input[0].trim());
            int row = Integer.parseInt(input[1].trim());
            int col = Integer.parseInt(input[2].trim());

            movesCount++;
            board[row][col] = player;

            if(checkRow(row, player)){
                declareWinner(player);
                break;
            }

            if(checkCol(col, player)){
                declareWinner(player);
                break;
            }

            if(row==0 && col ==0 ||
                    row==1 && col==1 ||
                    row==2 && col==2 ||
                    row==2 && col==0 ||
                    row==0 && col==2){
                if(checkDiagnol(player)){
                    declareWinner(player);
                    break;
                }
            }

            if(movesCount == 9){
                System.out.println("Game Draw");
            }
        }
    }

    public static void main(String[] args){
        TicTacToe game = new TicTacToe();
        game.startTicTacToe();
    }
}
