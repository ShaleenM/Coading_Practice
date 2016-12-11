import java.util.Vector;

/**
 * Created by Shaleen Mathurs on 11/29/16.
 */
public class PrintCombinationsKList {

    public void printCombinations(Vector<Vector<String>> input){

        Vector<String> in1  = input.get(0);
        Vector<String> in2;

        for(int i = 1 ; i < input.size() ; i++){
            Vector<String> currRes = new Vector<>();
            in2 = input.get(i);

            /**
             * Uncomment if we want to skip empty vecotrs
             *
            if(in2.size() == 0)
                continue;
            else if(in1.size() == 0){  // If first list is empty
                in1 = in2;
                continue;
            }
            */

            for(String s1 : in1){
                for(String s2 : in2){
                    currRes.add(s1+" "+s2);
                }
            }
            in1 = currRes;
        }

        for(String s : in1)
            System.out.println(s);
    }

    public static void main(String[] args) {
        Vector<Vector<String>> input = new Vector<>();
        Vector<String> list = new Vector<>();

        input.add(list);
        list = new Vector<>();

        list.add("shaleen");
        list.add("shyam");
        list.add("ram");
        list.add("vishnu");

        input.add(list);
        list = new Vector<>();

        list.add("know");
        list.add("went");
        list.add("had");
        list.add("want");

        input.add(list);
        list = new Vector<>();

        list.add("basketball");
        list.add("football");
        list.add("cricket");
        list.add("coding");

        input.add(list);

        PrintCombinationsKList solution = new PrintCombinationsKList();
        solution.printCombinations(input);
    }

}
