package Queues;

/**
 * Created by Mathurs on 9/20/16.
 */
public class ArrayQueue {

    int[] array;
    int front, rear;
    int capacity;
    int size;

    public ArrayQueue(int capacity){
        this.capacity = capacity;
        this.array = new int[capacity];
        this.front = -1;
        this.rear = -1;
    }

    public void enQueue(int x) throws Exception {
        if(size == capacity) throw new Exception();
        int index = (rear+1) % capacity;
        array[index] = x;
        rear = index;
        size++;
        if(front == -1) front = 0;
    }

    public int deQueue() throws Exception {
        if(size == 0) throw new Exception();

        int val = array[front];
        front = (front+1) % capacity;
        size--;
        return val;
    }

    public boolean empty(){
        return size == 0;
    }

    public int front(){
        return array[front];
    }

    public int size(){
        return size();
    }
}
