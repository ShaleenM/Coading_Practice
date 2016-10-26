import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * Created by Mathurs on 10/25/16.
 */
public class Test {

    public static void main(String[] args) {

        int n = 10 ;

        MyComparator myComparator = new MyComparator(10);

        PriorityQueue<Integer> list = new PriorityQueue<Integer>(myComparator);
        PriorityQueue<Integer> list1 = new PriorityQueue<Integer>(myComparator);
        for(int i =1 ; i < 20 ; i++){
            list.add(i);
        }

        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + " , ");
        }
        System.out.println();

        myComparator.setBase(15);

        while(!list.isEmpty())
            list1.add(list.remove());

        itr = list1.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + " , ");
        }

        myComparator.setBase(5);

        while(!list1.isEmpty())
            list.add(list1.remove());

        System.out.println();
        itr = list.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + " , ");
        }
    }
}

class MyComparator implements Comparator<Integer> {

    int base;

    public MyComparator(int base) {
        this.base = base;
    }

    public int compare(Integer o1, Integer o2) {
        return Math.abs(o1 - base) - Math.abs(o2 - base);
    }

    public void setBase(int base) {
        this.base = base;
    }
}