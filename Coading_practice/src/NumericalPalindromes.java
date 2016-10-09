import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by Mathurs on 9/21/16.
 */
public class NumericalPalindromes {

    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);
        String line = stdin.nextLine();
        stdin.close();
        StringBuilder sb = new StringBuilder();
        TreeMap<Character , Integer> map = new TreeMap<Character, Integer>(new Comparator<Character>() {
            public int compare(Character o1, Character o2) {
                return o2.compareTo(o1);
            }
        });
        for(char c : line.toCharArray()){
            if(map.containsKey(c))
                map.put(c , map.get(c)+1);
            else
                map.put(c, 1);
        }

        for(char c : map.keySet()){
            if(map.get(c) > 1){
                for(int i = 0 ; i < map.get(c)/2 ; i++) {
                    sb.append(c);
                }
                map.put(c , map.get(c) % 2);
            }
        }

        int len = sb.length();
        for(int i = 0 ; i < len ; i++){
            sb.insert(len, sb.charAt(i));
        }



        for(char c : map.keySet()){
            if(map.get(c) % 2 == 1){
                sb.insert(sb.length()/2 ,c);
                break;
            }
        }

        System.out.print(sb.toString());
    }
}
