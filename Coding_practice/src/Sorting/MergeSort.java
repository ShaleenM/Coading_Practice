package Sorting;

import java.util.Arrays;

/**
 * Created by Mathurs on 11/14/16.
 */
public class MergeSort {

    public void mergeSort(int[] array){
        if(array == null)
            return;

        mergeSort(array, new int[array.length] , 0 , array.length - 1);
    }

    private void mergeSort(int[] array , int[] helper , int left , int right){

        if(left >= right)
            return;

        int mid = (right + left) / 2;
        mergeSort(array, helper, left , mid);
        mergeSort(array, helper, mid+1 , right);

        merge(array, helper , left , mid , right);

    }

    private void merge(int[] array , int[] helper , int left , int mid , int right){

        for(int i = left ; i <= right ; i++)
            helper[i] = array[i];

        int leftptr = left;
        int rightptr = mid +1;

        int ptr = left;


        while(leftptr <= mid && rightptr <= right){
            if(helper[leftptr] <= helper[rightptr])
                array[ptr++] = helper[leftptr++];
            else
                array[ptr++] = helper[rightptr++];
        }

        for(int i = 0; i <= mid - leftptr ; i++){
            array[ptr+i] = helper[leftptr+i];
        }
    }

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] array = new int[] {10,3,5,1,2,6,8,9,0,0,0,0,0,0,0};
        mergeSort.mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

}
