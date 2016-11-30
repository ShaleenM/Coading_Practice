/**
 * Created by Mathurs on 11/29/16.
 */
public class NQueenProblemII {

    int result = 0;

    public int totalNQueens(int n) {

        if (n < 2)
            return n;


        boolean[][] board = new boolean[n][n];
        totalNQueens(board, n, 0);
        return result;
    }

    private void totalNQueens(boolean[][] board, int n, int col) {
        System.out.println(col);
        if (col == n) {
            result++;
            return;
        }

        for (int row = 0; row < n; row++) {
            board[row][col] = true;
            boolean flag = true;

            int i = row;
            int j = col;
            while (i > 0 && j > 0) {
                i--;
                j--;
                if (board[i][j]) {
                    flag = false;
                    break;
                }
            }

            i = row;
            j = col;
            while (i < n - 1 && j > 0) {
                i++;
                j--;
                if (board[i][j]) {
                    flag = false;
                    break;
                }
            }

            i = row;
            j = col;
            while (j > 0) {
                j--;
                if (board[i][j]) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                totalNQueens(board, n, col + 1);
            }
            board[row][col] = false;
        }

    }

    public static void main(String[] args) {
        NQueenProblemII solution = new NQueenProblemII();
        System.out.println(solution.totalNQueens(8));
    }
}
