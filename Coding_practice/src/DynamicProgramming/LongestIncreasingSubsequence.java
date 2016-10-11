package DynamicProgramming;

/**
 * Created by Mathurs on 10/10/16.
 */
public class LongestIncreasingSubsequence {

    /**
     * The longest Increasing Subsequence (LIS) problem is to find the length of the longest subsequence of a given
     * sequence such that all elements of the subsequence are sorted in increasing order
     * @param arr : Input array
     * @return : Maximum Increasing subsequence
     */
    public static int longestIncerasingSubsequence(int[] arr){
        int N = arr.length;
        int M[] = new int[N];

        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < i ;j++){

                if(arr[j] < arr[i] && (M[i] < M[j] + 1))
                    M[i] = M[j] + 1;
            }
        }

        int max = 0;
        for(int i = 0 ; i < M.length ; i++)
            max = max < M[i] ? M[i] : max;

        return max + 1 ;
    }

    public static void main(String[] args){
        int[] arr = { 10, 22, 9, 33, 21, 50, 41, 60 };
        System.out.println("Maximum Length = " + longestIncerasingSubsequence(arr));
    }
}
