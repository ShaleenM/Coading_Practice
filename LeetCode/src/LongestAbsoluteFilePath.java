import java.util.HashMap;

/**
 * Created by Mathurs on 10/28/16.
 */
public class LongestAbsoluteFilePath {

    public int lengthLongestPath(String input1) {
        // Solution is ok. Wierd test cases
        if(input1 == null || input1.length() == 0)
            return 0;

        String[] input = input1.split("\n");
        HashMap<Integer , String> map = new HashMap<Integer, String>();
        int length = 0;
        for(int i = 0 ; i < input.length ; i++){
            String str = input[i];
            int tabCount = 0;
            tabCount = str.lastIndexOf('\t') +1;

            map.put(tabCount , str);

            if(str.indexOf('.') >= 0){
                int thisLen = 0;

                for(int n : map.keySet()){
                    thisLen = thisLen + map.get(n).trim().length() +1;
                    System.out.print(map.get(n).trim() + "-->");
                }
                System.out.println();

                thisLen--;

                length = Math.max(length , thisLen);
            }
        }

        return length;
    }
}
