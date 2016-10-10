package DynamicProgramming;

/**
 * Created by Mathurs on 10/10/16.
 * This class counts the number of paths from
 * Upper Left corner of matrix to
 * Lower right corner of matrix
 */
public class CountPaths {

    static int[][] memory;
    int sizeR;
    int sizeC;

    public CountPaths(int sizeR, int sizeC) {
        this.sizeR = sizeR;
        this.sizeC = sizeC;
        memory = new int[sizeR][sizeC];
    }

    public int countPaths(){
        return countPaths(sizeR -1 , sizeC -1);
    }

    private int countPaths(int row, int col){
        if(row == 0 || col == 0)
            return 1;

        if(memory[row-1][col] == 0)
            memory[row-1][col] = countPaths(row -1 , col);

        if(memory[row][col -1] == 0)
            memory[row][col-1] = countPaths(row , col-1);

        return memory[row-1][col] +  memory[row][col-1];
    }

    public static void main(String[] args){
        System.out.println("Number of Paths = "+ new CountPaths(5,3).countPaths());
    }
}
