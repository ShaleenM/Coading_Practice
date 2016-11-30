import java.util.*;


/**
 * Created by Mathurs on 10/25/16.
 */
public final class Test {

    int[] result = new int[3];

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Test test = new Test();
        while(s.hasNext()){
            String line = s.nextLine();
            String[] arr = line.split("\\s+");
            int[] input = new int[arr.length];
            for (int i = 0; i < input.length; i++) {
                input[i] = Integer.parseInt(arr[i]);
            }
            test.classify(input);
        }
    }

    public void classify(int[] sides){

        if(sides[0] == sides[2] && sides[1] == sides[3]){
            if(sides[0] == sides[1])
                result[0]++;
            else
                result[1]++;
        }
        else
            result[2]++;
    }

    public void deltaEncoding(int[] arr){
        List<Integer> result = new ArrayList<>();
        result.add(arr[0]);
        for(int i = 1;i<arr.length;i++){
            int diff = arr[i]-arr[i-1];
            if(diff>128 || diff<-128){
                result.add(-128);
            }
            result.add(diff);
        }
        for(int i:result){
            System.out.print(i+" ");
        }

        TreeMap<Integer,Integer> map = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
    }

}