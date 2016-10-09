package Stack;

import java.util.Arrays;
import java.util.Stack;

/**
 * Created by Mathurs on 9/18/16.
 */
public class Main {

    public static void main(String[] args){

        TwoStackInOneArray stack = new TwoStackInOneArray(20);
        try {
            stack.push(3,1); stack.push(7,1); stack.push(1,1); stack.push(0,1); stack.push(6,1); stack.push(4,1); stack.push(2,1);
            System.out.println(Arrays.toString(stack.array));
            stack.push(3,0); stack.push(7,0); stack.push(1,0); stack.push(0,0); stack.push(6,0); stack.push(4,0); stack.push(2,0);
            System.out.println(Arrays.toString(stack.array));
        } catch (Exception e) {
            e.printStackTrace();
        }

//        System.out.println(Arrays.toString(myStack.toArray()));
    }


    // Karumanchi
    public static boolean isPalindrome(String string){
        if(string == null) return false;
        if(string.length() % 2 != 1) return false;

        Stack<Character> stack = new Stack<Character>();
        int i = 0;
        while(string.charAt(i) != 'X'){
            stack.push(string.charAt(i++));
        }

        i++ ;

        while (i < string.length()){
            if(string.charAt(i++) != stack.pop())
                return false;
        }

        return true;

    }
}
