/**
 * Created by Mathurs on 10/14/16.
 */
public class ConvertStringToNumber {

    public static int toNumber(String s , int base){

        if(s == null)
            return 0;

        boolean isNegative = false;

        if(s.charAt(0) == '-'){
            isNegative = true;
            s = s.substring(1);
        }

        int mul = 1;
        int number = 0;

        for(int i = s.length() -1 ; i >= 0 ; i--){
            int temp = s.charAt(i) - '0';
            number = number + (temp * mul);
            mul = mul * base;
        }

        if(isNegative)
            number = number * -1;

        return number;
    }

    public static void main(String[] args){
        System.out.println(toNumber("2634" , 8));
    }
}