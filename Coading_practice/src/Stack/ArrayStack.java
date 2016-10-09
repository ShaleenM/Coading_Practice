package Stack;

/**
 * Created by Shaleen Mathur on 9/15/16.
 */


public class ArrayStack {

    int top, capacity;
    int[] array;

    public ArrayStack(int capacity){
        this.capacity = capacity;
        this.top = 0;
        this.array = new int[capacity];
    }

    public void push(int val){
        if(isFull())
            doubleStack();

        array[top++] = val;

        return;
    }

    public int pop(){

        return array[--top];
    }

    public int peek(){
        return array[top - 1];
    }

    public boolean isFull(){
        if(top == capacity)
            return true;
        else
            return false;
    }

    public boolean empty(){
        return top == 0;
    }

    public void deleteStack(){
        top = 0;
    }

    public void doubleStack(){
        int[] newArray = new int[capacity*2];
        System.arraycopy(array,0,newArray,0,capacity);
        capacity *= 2;
        array = newArray;
    }


}
