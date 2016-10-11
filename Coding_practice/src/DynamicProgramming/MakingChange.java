package DynamicProgramming;

/**
 * Created by Mathurs on 10/10/16.
 */
public class MakingChange {

    /**
     *
     * @param N : Amount
     * @param coin : Array of available coin denominations
     * @return : Minimum number of coins required to generate the amount.
     */
    public static int makingChange(int N , int[] coin){

        int M[] = new int[N+1];

        for(int n = 0 ; n <= N ; n++){

            if(n == 0) {
                M[n] = 0;
                continue;
            }

            int min = Integer.MAX_VALUE;

            for(int c = 0 ; c < coin.length ; c++){
                //Assuming that the coin denominations are given in ascending order
                if(coin[c] <= n)
                    min = Math.min(M[n - coin[c]] , min);
            }
            M[n] = min +1;
        }

        return M[N];
    }

    public static void main(String[] args){
        int N = 11;
        int coin[] = {9,4,5,1,2,3};
        System.out.println("Optimal Number of coins =   " + makingChange(N , coin));
    }
}
