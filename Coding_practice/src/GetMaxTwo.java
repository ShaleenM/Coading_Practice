/**
 * Created by Mathurs on 10/9/16.
 */
public class GetMaxTwo {

    public static void getMaxTwo(int[] arr){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max1)
                max1 = arr[i];
            else if(arr[i] <= max1 && arr[i] > max2)
                max2 = arr[i];
        }

        System.out.println("("+max1+" , "+max2+")");
    }

    public static void main(String[] args){
        int[] arr = {6,2,7,3,8,0,2,1,5,7,4,5};

    }
}
