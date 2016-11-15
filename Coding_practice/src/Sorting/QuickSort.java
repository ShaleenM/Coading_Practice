package Sorting;

import java.util.Arrays;

/**
 * Created by Mathurs on 11/14/16.
 */
public class QuickSort {

    public void quickSort(int[] array){
        quickSort(array , 0 , array.length - 1);
    }

    private void quickSort(int[] array , int left , int right){

        int index = partition(array , left , right);

        if(index - 1 > left)
            quickSort(array , left ,index - 1 );

        if(index < right)
            quickSort(array , index , right);

    }

    private int partition(int[] array , int left , int right){

        int pivot = array[(left + right) /2];

        while(left <= right){

            while(array[left] < pivot) left++;
            while(array[right] > pivot) right--;

            if(left <= right){
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;

                left++;
                right--;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        QuickSort sorting = new QuickSort();
        int[] array = {};

        System.out.println(Arrays.toString(array));

        sorting.quickSort(array);

        System.out.println(Arrays.toString(array));
    }
}
