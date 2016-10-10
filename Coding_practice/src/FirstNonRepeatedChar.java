/**
 * Created by Mathurs on 10/10/16.
 */
public class FirstNonRepeatedChar {

    public  static char firstNonRepetedChar(String str){
        int[] checker = new int[256];

        for(int i = 0 ; i < str.length() ; i++){
            checker[(int) str.charAt(i)]++;
        }

        for(int i = 0 ; i < str.length() ; i++){
            if(checker[(int) str.charAt(i)] == 1 )
                return str.charAt(i);
        }
        return ' ';
    }

    public static void main(String[] args){
        System.out.println("First Non Repeating char :: " + firstNonRepetedChar("qwertyuiop.§asd.fghjklzxcvbnm,¶qwertyuiopasdfghjklzxcvbnm"));
    }
}
