package Trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Mathurs on 10/1/16.
 */
public class MaxSlidingWindow {
    /**
     * In this implimentation we are assuming that input have no duplicate elements.
     * @param input : input array
     * @param k : Window Size
     */
    public static void maxSlidingWindow(int input[], int k){

        LinkedList<Integer> queue = new LinkedList<Integer>();
        LinkedList<Integer> result = new LinkedList<Integer>();

        if(input.length < k) return;

        for(int i = 0 ; i < k ; i++){
            while(!queue.isEmpty() && input[i] > queue.getLast())
                queue.poll();

            queue.add(input[i]);

        }

        result.add(queue.getFirst());

        for(int i = k ; i < input.length ; i++){
            if(!queue.isEmpty() && queue.getFirst() == input[i -k])
                queue.removeFirst();

            while(!queue.isEmpty() && input[i] > queue.getLast())
                queue.poll();

            queue.add(input[i]);

            result.add(queue.getFirst());
        }

        System.out.print(result.toString());
        return;
    }

    public static void maxSlidingWindow1(int input[], int k){

        LinkedList<Obj> queue = new LinkedList<Obj>();
        LinkedList<Integer> result = new LinkedList<Integer>();

        if(input.length < k) return;

        for(int i = 0 ; i < k ; i++){
            while(!queue.isEmpty() && input[i] > queue.getLast().val)
                queue.poll();

            queue.add(new Obj(input[i] , i));

        }

        result.add(queue.getFirst().val);

        for(int i = k ; i < input.length ; i++){
            if(!queue.isEmpty() && queue.getFirst().index == i)
                queue.removeFirst();

            while(!queue.isEmpty() && input[i] > queue.getLast().val)
                queue.poll();

            queue.add(new Obj(input[i] , i));

            result.add(queue.getFirst().val);
        }

        System.out.print(result.toString());
        return;
    }

    static class Obj {
        int val;
        int index;

        public Obj(int val, int index) {
            this.val = val;
            this.index = index;
        }
    }
}
