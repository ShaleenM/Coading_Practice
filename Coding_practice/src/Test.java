import java.util.*;


/**
 * Created by Mathurs on 10/25/16.
 */
public final class Test {
//
//    int[] result = new int[3];
//
//    public static void main(String[] args) {
//
//        int a = Integer.MAX_VALUE;
//        double b = Double.MAX_VALUE;
//        float c = 0;
//        long d = 0;
//        System.out.print((a + d) * (b+c));
//
//        Scanner s = new Scanner(System.in);
//        Test test = new Test();
//        while(s.hasNext()){
//            String line = s.nextLine();
//            String[] arr = line.split("\\s+");
//            int[] input = new int[arr.length];
//            for (int i = 0; i < input.length; i++) {
//                input[i] = Integer.parseInt(arr[i]);
//            }
//            test.classify(input);
//
//
//        }
//    }
//
//    public void classify(int[] sides){
//
//        if(sides[0] == sides[2] && sides[1] == sides[3]){
//            if(sides[0] == sides[1])
//                result[0]++;
//            else
//                result[1]++;
//        }
//        else
//            result[2]++;
//    }
//
//    public void deltaEncoding(int[] arr){
//        List<Integer> result = new ArrayList<>();
//        result.add(arr[0]);
//        for(int i = 1;i<arr.length;i++){
//            int diff = arr[i]-arr[i-1];
//            if(diff>128 || diff<-128){
//                result.add(-128);
//            }
//            result.add(diff);
//        }
//        for(int i:result){
//            System.out.print(i+" ");
//        }
//
//        TreeMap<Integer,Integer> map = new TreeMap<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return 0;
//            }
//        });
//    }


//    static final Integer i1 = 1;
//    final Integer i2 = 2;
//    Integer i3 = 3;

//    public static void main(String[] args) {
////        final Integer i4 =4;
////        Integer i5 = 5;
////
////        class Inner{
////            final Integer i6 = 6;
////            Integer i7 =7;
////            Inner(){
////                System.out.print( "this " + i6 + i7);
////            }
//
//        try{
//            Float f1 = new Float("3.0");
//            int x = f1.intValue();
//            byte b = f1.byteValue();
//            double d = f1.doubleValue();
//            System.out.print(x+b+d);
//
//        }catch (NumberFormatException e){
//            System.out.println("bad number");
//        }


//    }




//
//    public static void main(String[] args) {
//        Thread t = new MyThread(){
//            public void run(){
//                System.out.print(" foo");
//            }
//        };
//        t.start();
//    }
//}
//
//class MyThread extends Thread{
//    MyThread(){
//        System.out.print(" My Thread");
//    }
//
//    public void run(){
//        System.out.print(" bar");
//    }
//
//    public void run(String s){
//        System.out.print(" baz");
//    }


    public static void main(String[] args) {
        try{
            throw new Exc1();
        }
        catch (Exc0 exc0){
            System.out.print("Ex0");
        }
        catch (Exception e){
            System.out.print("Exception");
        }
    }
}

class Exc0 extends Exception{}
class Exc1 extends Exc0{}
