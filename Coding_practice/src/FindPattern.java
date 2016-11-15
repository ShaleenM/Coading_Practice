/**
 * Created by Mathurs on 10/31/16.
 */

import java.io.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class FindPattern {

    public static void main(String[] args) {

        String pattern = "foo";
        String[] dict = {"abb", "abc", "xyz", "xyy"};

        ArrayList<String> ans = match(dict, pattern);

        System.out.println(ans);
    }

    public static ArrayList<String> match(String[] dict, String pattern) {
        ArrayList<String> retVal = new ArrayList<>();
        int[] rule = makePatternRules(pattern);
        for (int i = 0; i < dict.length; i++) {
            int[] arr = makePatternRules(dict[i]);
            if (Arrays.equals(arr, rule)) {
                retVal.add(dict[i]);
            }
        }
        return retVal;
    }

    public static int[] makePatternRules(String pattern) {
        HashMap<Character, Integer> map = new HashMap<>();
        int[] rule = new int[pattern.length()];
        for (int i = 0; i < pattern.length(); i++) {
            if (!map.containsKey(pattern.charAt(i))) {
                map.put(pattern.charAt(i), i);
            }
            rule[i] = map.get(pattern.charAt(i));
        }
        return rule;
    }

}
