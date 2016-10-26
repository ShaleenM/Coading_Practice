package Sorting;

/**
 * Created by Mathurs on 10/25/16.
 */
public class SelectionSort {

    public static void sort(int[] array){

        int min , temp;
        for(int i = 0 ; i < array.length -1 ; i++){
            min = i;
            for(int j = i + 1 ; j < array.length ; j++) {
                if(array[j] < array[min]){
                    min = j;
                }
            }
            // swap i and min
            temp = array[min];
            array[min] = array[i];
            array[i] = temp;

        }
    }

    public static void main(String[] args) {
        int[] array = {2,5,3,1,6};
        SelectionSort.sort(array);

        for(int i : array)
            System.out.print(i +" , ");
    }
}
