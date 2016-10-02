package Trees;

/**
 * Created by Mathurs on 9/30/16.
 */
public class MaxHeap {

    int capacity;
    int size;
    int[] array;

    public MaxHeap(int capacity){
        this.capacity = capacity;
        this.size = 0;
        this.array = new int[capacity];
    }

    public void insert(int val) throws Exception {
        if(capacity == size) throw new Exception("Heap Full!!!...");

        int k = size;
        int p = (k - 1) /2;
        array[size++] = val;

        while(p >= 0){

            if(array[p] < array[k]){
                //Swap values
                int temp = array[p];
                array[p] = array[k];
                array[k] = temp;

                k = p;
                p = (k - 1) / 2;
            }
            else
                break;
        }
    }

    public int deleteMax() throws Exception{

        if(size <= 0){
            throw new Exception("Heap Empty !! ..");
        }
        else if(size == 1) {
            size = 0;
            return array[0];
        }

        int hold = array[0];

        array[0] = array[--size];

        percolateDown(0);

        return hold;
    }

    public void percolateDown(int k){

        int l = 2*k +1;

        while(l < size){
            if(l+1 < size && array[l+1] >= array[l])
                l++;

            //Swap
            if(array[l] > array[k]) {
                int temp = array[k];
                array[k] = array[l];
                array[l] = temp;
            }
            else
                break;

            k = l;
            l = 2*k +1;
//            if(l >= size)
//                break;
        }
    }

    public int getMax(){
        return size > 0 ? array[0] : Integer.MIN_VALUE;
    }

}
