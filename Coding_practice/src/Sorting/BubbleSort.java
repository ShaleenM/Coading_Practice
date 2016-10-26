package Sorting;

/**
 * Created by Mathurs on 10/25/16.
 */
public class BubbleSort {

    public static void sort(int[] array){

        for(int pass = array.length -1 ; pass  >= 0 ; pass--){
            for(int i = 0 ; i < pass ; i++){
                if(array[i] > array[i+1]) {
                    //Swap
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }

            }
        }
    }

    public static void main(String[] args) {
        int[] array = {2,5,3,1,6};
        BubbleSort.sort(array);

        for(int i : array)
            System.out.print(i +" , ");
    }
}
