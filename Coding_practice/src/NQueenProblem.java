import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Mathurs on 10/8/16.
 */
public class NQueenProblem {

    public static boolean isSafe(int[][] board , int row, int col){
        /**
         * check left side of the row
         */
       for(int i = col ; i >= 0 ; i--){
           if(board[row][i] == 1)
               return false;
       }
        /**
         * check upper left diagnol
         */
        for(int i = row, j = col; i >= 0 && j >= 0 ; i--, j-- ){
            if(board[i][j] == 1)
                return false;
        }

        /**
         * check lower left diagnol
         */
        for(int i = row, j= col; i < board.length && j >= 0 ; i++, j--){
            if(board[i][j] == 1)
                return false;
        }

        return true;
    }


    public static boolean solveNQueen(int[][] board, int col){

        if(col == board[0].length)
            return true;

        for(int row = 0 ; row < board.length ; row++) {
            if (isSafe(board, row , col)){

                board[row][col] = 1 ;

                if(solveNQueen(board, col+1))
                    return true;
                else
                    board[row][col] = 0 ;
            }
        }
        return false;
    }

    static void printBoard(int board[][])
    {
        for (int i = 0; i < board.length; i++)
        {
            for (int j = 0; j < board.length; j++)
                System.out.print(" " + board[i][j]
                        + " ");
            System.out.println();
        }
    }

    public static void main(String[] args){

        int[][] board = {{0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0},};

        if(solveNQueen(board , 0) == true)
            printBoard(board);
        else
            System.out.print("No solution");
    }

}
