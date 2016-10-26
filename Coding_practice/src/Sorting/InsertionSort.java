package Sorting;

/**
 * Created by Mathurs on 10/25/16.
 */
public class InsertionSort {

    public static void sort(int[] array){

        int temp;

        for(int i = 0 ; i < array.length ; i++){
            temp = array[i];
            int j = i;
            while(j > 0 && array[j - 1] > temp){
                array[j] = array[j -1];
                j--;
            }
            array[j] = temp;

        }
    }

    public static void main(String[] args) {
        int[] array = {2,5,3,1,6};
        InsertionSort.sort(array);

        for(int i : array)
            System.out.print(i +" , ");
    }
}
