package DynamicProgramming;

/**
 * Created by Mathurs on 10/10/16.
 */
public class KanpsackZeroOne {

    /**
     *
     * @param W : total allowed weight
     * @param wt : Array representing weight of i-th item
     * @param val : Array representing value of i-th item
     * @param n : Total availabe items to choose from
     * @return
     */
    public static int knapsack(int W , int[] wt , int[] val , int n){


        int M[][] = new int[n+1][W+1];

        for(int i = 0 ; i < n+1 ; i++){
            for(int w = 0 ; w < W+1 ; w++){

                if(i == 0 || w == 0)
                    M[i][w] = 0;
                else if(wt[i-1] > w)
                    M[i][w] = M[i-1][w];
                else
                    M[i][w] = Math.max(M[i-1][w] , M[i-1][w-wt[i-1]]+val[i-1]);
            }
        }

        return M[n][W];
    }

    public static void main(String[] args){
        int val[] = new int[]{60, 100, 120};
        int wt[] = new int[]{10, 20, 30};
        int W = 50;
        int n = val.length;
        System.out.println(knapsack(W, wt, val, n));

    }
}
