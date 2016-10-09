package Queues;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Mathurs on 9/22/16.
 */
public class Main {

    public static void main(String[] args){
        ArrayQueue q = new ArrayQueue(100);
        try {
            q.enQueue(1);
            q.enQueue(2);
            q.enQueue(3);
            q.enQueue(4);
            q.enQueue(5);
            System.out.println(q.deQueue());
            System.out.println(q.deQueue());
            System.out.println(q.deQueue());
            System.out.println(q.deQueue());
            System.out.println(q.deQueue());
            q.enQueue(6);
            q.enQueue(7);
            q.enQueue(8);
            q.enQueue(9);
            System.out.println(q.deQueue());
            System.out.println(q.deQueue());
            System.out.println(q.deQueue());
            q.enQueue(1);
            q.enQueue(2);
            q.enQueue(3);
            q.enQueue(4);
            q.enQueue(5);
            System.out.println(q.deQueue());
            System.out.println(q.deQueue());
            System.out.println(q.deQueue());
            System.out.println(q.deQueue());
            System.out.println(q.deQueue());
            q.enQueue(6);
            q.enQueue(7);
            q.enQueue(8);
            q.enQueue(9);
            System.out.println(q.deQueue());
            System.out.println(q.deQueue());
            System.out.println(q.deQueue());
            q.enQueue(1);
            q.enQueue(2);
            q.enQueue(3);
            q.enQueue(4);
            q.enQueue(5);
            System.out.println(q.deQueue());
            System.out.println(q.deQueue());
            System.out.println(q.deQueue());
            System.out.println(q.deQueue());
            System.out.println(q.deQueue());
            q.enQueue(6);
            q.enQueue(7);
            q.enQueue(8);
            q.enQueue(9);
            System.out.println(q.deQueue());
            System.out.println(q.deQueue());
            System.out.println(q.deQueue());
            q.enQueue(1);
            q.enQueue(2);
            q.enQueue(3);
            q.enQueue(4);
            q.enQueue(5);
            System.out.println(q.deQueue());
            System.out.println(q.deQueue());
            System.out.println(q.deQueue());
            System.out.println(q.deQueue());
            System.out.println(q.deQueue());
            q.enQueue(6);
            q.enQueue(7);
            q.enQueue(8);
            q.enQueue(9);
            System.out.println(q.deQueue());
            System.out.println(q.deQueue());
            System.out.println(q.deQueue());
            q.enQueue(1);
            q.enQueue(2);
            q.enQueue(3);
            q.enQueue(4);
            q.enQueue(5);
            System.out.println(q.deQueue());
            System.out.println(q.deQueue());
            System.out.println(q.deQueue());
            System.out.println(q.deQueue());
            System.out.println(q.deQueue());
            q.enQueue(6);
            q.enQueue(7);
            q.enQueue(8);
            q.enQueue(9);
            System.out.println(q.deQueue());
            System.out.println(q.deQueue());
            System.out.println(q.deQueue());
            q.enQueue(1);
            q.enQueue(2);
            q.enQueue(3);
            q.enQueue(4);
            q.enQueue(5);
            System.out.println(q.deQueue());
            System.out.println(q.deQueue());
            System.out.println(q.deQueue());
            System.out.println(q.deQueue());
            System.out.println(q.deQueue());
            q.enQueue(6);
            q.enQueue(7);
            q.enQueue(8);
            q.enQueue(9);
            System.out.println(q.deQueue());
            System.out.println(q.deQueue());
            System.out.println(q.deQueue());
        } catch (Exception e) {
            System.out.println("Exception");
            System.out.println(e.getMessage());
        }
    }
}
