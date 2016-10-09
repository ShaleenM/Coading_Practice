package Stack;

/**
 * Created by Mathurs on 9/19/16.
 */
public class MinStack {

    ArrayStack stack ;
    ArrayStack minStack;
    int capacity;

    public MinStack(int capacity){
        this.capacity = capacity;
        stack = new ArrayStack(capacity);
        minStack = new ArrayStack(capacity);
    }

    public void push(int val){
        stack.push(val);

        if(minStack.empty()) {
            minStack.push(val);
            return;
        }else if(val <= minStack.peek())
            minStack.push(val);
    }

    public int getMinimum(){
        return minStack.peek();
    }

    public int pop(){

        if(stack.peek() == minStack.peek())
            minStack.pop();
        return stack.pop();
    }

    public int peek(){
        return stack.peek();
    }

}
