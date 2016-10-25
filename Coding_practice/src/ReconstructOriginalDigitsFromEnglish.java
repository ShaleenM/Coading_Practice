/**
 * Created by Mathurs on 10/18/16.
 */
public class ReconstructOriginalDigitsFromEnglish {

    public static String originalDigits(String s) {

        if(s == null || s.length() < 2)
            return "";

        int[] num = new int[10];

        for(int i = 0 ; i < s.length() ; i++){
            switch(s.charAt(i)){
                case 'z':
                    num[0]++;
                    break;
                case 'w':
                    num[2]++;
                    break;
                case 'u' :
                    num[4]++;
                    break;
                case 'x' :
                    num[6]++;
                    break;
                case 'g':
                    num[8]++;
                    break;
                case 'h' :
                    num[3]++;
                    break;
                case 'f' :
                    num[5]++;
                    break;
                case 's' :
                    num[7]++;
                    break;
                case 'o' :
                    num[1]++;
                    break;
                case 'i' :
                    num[9]++;
                    break;
            }
        }

        num[3] = num[3] - num[8];
        num[5] = num[5] - num[4];
        num[7] = num[7] - num[6];
        num[9] = num[9] - num[8] - num[6] - num[5];
        num[1] = num[1] - num[0] - num[2] - num[4];

        for(int i = 0 ; i < 10 ; i++)
            System.out.println(num[i] + " --");

        StringBuilder sb = new StringBuilder();
        for(int n = 0 ; n < num.length ; n++){
            for(int i = 1 ; i <= num[n] ; i++)
                sb.append(n+"");
        }
        return sb.toString();
    }

    public static void main(String[] args){
        System.out.print(originalDigits("owoztneoer"));
    }
}
