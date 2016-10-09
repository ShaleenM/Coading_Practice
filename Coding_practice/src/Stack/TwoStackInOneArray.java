package Stack;

import java.util.EmptyStackException;

/**
 * Created by Mathurs on 9/19/16.
 */
public class TwoStackInOneArray {

    int[] array;
    int top1, top2 , capacity;

    TwoStackInOneArray(int capacity){
        this.capacity = capacity;
        this.top1 = -1;
        this.top2 = capacity ;
        this.array = new int[capacity];
    }

    public void push(int x , int n) throws Exception {
        //Insert x in stack n (0 or 1)

        if(top1 >= top2 - 1) throw new Exception();

        if(n == 0){
            array[++top1] = x;
        }
        else if(n == 1){
            array[--top2] = x;
        }

    }

    public int pop(int n) throws EmptyStackException{
        if(n == 0){
            if(top1 == -1) throw new EmptyStackException();
            return array[top1--];
        }
        else if(n == 1){
            if(top2 == capacity) throw new EmptyStackException();
            return array[top2++];
        }

        return Integer.MIN_VALUE;
    }

    public int top(int n){

        if(n == 0){
            if(top1 == -1) throw new EmptyStackException();
            return array[top1];
        }
        else if(n == 1){
            if(top2 == capacity) throw new EmptyStackException();
            return array[top2];
        }

        return Integer.MIN_VALUE;
    }

    public boolean empty(int n){
        if(n == 0 && top1 == -1) return true;
        else if(n ==1 && top2 == capacity) return true;
        else return false;
    }

}
