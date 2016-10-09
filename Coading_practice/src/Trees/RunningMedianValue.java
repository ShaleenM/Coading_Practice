package Trees;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by Mathurs on 10/1/16.
 */
public class RunningMedianValue {

    public static void runningMedianValue(){

        Scanner scanner = new Scanner(System.in);
        int median;

        /**     Min Heap    */
        PriorityQueue<Integer> minQ = new PriorityQueue<Integer>(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        /**     Max Heap    */
        PriorityQueue<Integer> maxQ = new PriorityQueue<Integer>(new Comparator<Integer>() {

            public int compare(Integer o1, Integer o2){
                return o2.compareTo(o1);
            }
        });

        while(true){
            System.out.print("Input Number = ");
            String input = scanner.nextLine();
            if(input.equals("exit")) break;
            int val = Integer.parseInt(input);

            maxQ.add(val);

            if(!minQ.isEmpty() && maxQ.peek() > minQ.peek())
                minQ.add(maxQ.poll());

            if(!maxQ.isEmpty() && maxQ.size() > minQ.size() + 1)
                minQ.add(maxQ.poll());

            if(!minQ.isEmpty() && minQ.size() > maxQ.size() + 1)
                maxQ.add(minQ.poll());

            if((minQ.size() == maxQ.size()))
                median = (minQ.peek() + maxQ.peek()) / 2;
            else if(minQ.size() == maxQ.size() + 1)
                median = minQ.peek();
            else if(minQ.size() + 1 == maxQ.size())
                median = maxQ.peek();
            else {
                System.out.println("Phatta!!!!.....");
                median = Integer.MIN_VALUE;
            }

            System.out.println("Current Median = " + median);
        }
    }
}
