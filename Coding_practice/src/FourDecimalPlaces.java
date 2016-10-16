/**
 * Created by Mathurs on 10/14/16.
 *
 */
public class FourDecimalPlaces {

    public static boolean floatFourDecimal(float f){
        String fString = String.valueOf(f);
        System.out.println(fString);
        return fString.length() - fString.indexOf(".") - 1 == 4;
    }

    public static boolean doubleFourDecimal(double d){
        String dString = String.valueOf(d);
        System.out.println(dString);
        return dString.length() - dString.indexOf(".") - 1 == 4;
    }

    public static void main(String[] args){
        System.out.println(floatFourDecimal(3.021f));
        System.out.println(doubleFourDecimal(3.021111));
    }
}
