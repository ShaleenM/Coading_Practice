package DynamicProgramming;

/**
 * Created by Mathurs on 10/9/16.
 */
public class ShortestPathInMatrix {

    static int[][] memory;

    public static int shortestPath(int[][] matrix){
        memory = new int[matrix.length][matrix[0].length];
        return shortestPath(matrix, matrix.length -1 , matrix[0].length -1);
    }

    private static int shortestPath(int[][] matrix, int row, int col){
        if(row == 0 && col == 0)
            return matrix[0][0];

        int min = Integer.MAX_VALUE;
        if(col > 0){
            if(memory[col -1][row] == 0)
                min = Math.min(shortestPath(matrix, row, col -1) , min);
            else
                min = Math.min(memory[col -1][row] , min);
        }

        if(row > 0){
            if(memory[col][row - 1 ] == 0)
                min = Math.min(shortestPath(matrix, row -1 , col) , min);
            else
                min = Math.min(memory[col][row - 1] , min);
        }

        if(col > 0 && row > 0){
            if(memory[col -1][row-1] == 0)
                min = Math.min(shortestPath(matrix, row - 1, col -1) , min);
            else
                min = Math.min(memory[col -1][row - 1] , min);
        }

        return min + matrix[row][col];
    }

    public static void main(String [] args){
        int[][] matrix = {{1,2,3},
                            {4,3,10},
                            {1,5,3}};

        System.out.println("Length of shortest path = "+ shortestPath(matrix));
    }
}
