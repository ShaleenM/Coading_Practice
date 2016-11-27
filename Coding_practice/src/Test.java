import java.util.*;

/**
 * Created by Mathurs on 10/25/16.
 */
public final class Test {

    int test1;
    int test2;

    public Test(int test1, int test2) {
        this.test1 = test1;
        this.test2 = test2;
    }
    //    public enum Planet {
//        MERCURY (3.303e+23, 2.4397e6),
//        VENUS   (4.869e+24, 6.0518e6),
//        EARTH   (5.976e+24, 6.37814e6),
//        MARS    (6.421e+23, 3.3972e6),
//        JUPITER (1.9e+27,   7.1492e7),
//        SATURN  (5.688e+26, 6.0268e7),
//        URANUS  (8.686e+25, 2.5559e7),
//        NEPTUNE (1.024e+26, 2.4746e7);
//
//        private final double mass;   // in kilograms
//        private final double radius; // in meters
//        Planet(double mass, double radius) {
//            this.mass = mass;
//            this.radius = radius;
//        }
//        private double mass() { return mass; }
//        private double radius() { return radius; }
//
//        // universal gravitational constant  (m3 kg-1 s-2)
//        public static final double G = 6.67300E-11;
//
//        double surfaceGravity() {
//            return G * mass / (radius * radius);
//        }
//        double surfaceWeight(double otherMass) {
//            return otherMass * surfaceGravity();
//        }
//        public static void main(String[] args) {
//            if (args.length != 1) {
//                System.err.println("Usage: java Planet <earth_weight>");
//                System.exit(-1);
//            }
//            double earthWeight = Double.parseDouble(args[0]);
//            double mass = earthWeight/EARTH.surfaceGravity();
//            for (Planet p : Planet.values())
//                System.out.printf("Your weight on %s is %f%n",
//                        p, p.surfaceWeight(mass));
//        }
//    }




    public static void main(String[] args) {

        int n = 10 ;

        HashMap<Object, Object> map = new HashMap<Object, Object>();
        map.put(new Integer(3) , new String("lkhsdkfjb"));

//        MyComparator myComparator = new MyComparator(10);
//
//        PriorityQueue<Integer> list = new PriorityQueue<Integer>(myComparator);
//        PriorityQueue<Integer> list1 = new PriorityQueue<Integer>(myComparator);
//        for(int i =1 ; i < 20 ; i++){
//            list.add(i);
//        }
//
//        Iterator itr = list.iterator();
//        while(itr.hasNext()){
//            System.out.print(itr.next() + " , ");
//        }
//        System.out.println();
//
//        myComparator.setBase(15);
//
//        while(!list.isEmpty())
//            list1.add(list.remove());
//
//        itr = list1.iterator();
//        while(itr.hasNext()){
//            System.out.print(itr.next() + " , ");
//        }
//
//        myComparator.setBase(5);
//
//        while(!list1.isEmpty())
//            list.add(list1.remove());
//
//        System.out.println();
//        itr = list.iterator();
//        while(itr.hasNext()){
//            System.out.print(itr.next() + " , ");
//        }
    }

    public void parseGeneData(){

        String key;
        String value;


    }
}

//class MyComparator implements Comparator<Integer> {
//
//    int base;
//
//    public MyComparator(int base) {
//        this.base = base;
//    }
//
//    public int compare(Integer o1, Integer o2) {
//        return Math.abs(o1 - base) - Math.abs(o2 - base);
//    }
//
//    public void setBase(int base) {
//        this.base = base;
//    }
//}