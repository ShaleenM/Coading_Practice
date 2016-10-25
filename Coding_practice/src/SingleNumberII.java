/**
 * Created by Mathurs on 10/18/16.
 */
public class SingleNumberII {

    public static int singleNumber(int[] nums) {

        if(nums.length < 3)
            return nums[0];

        int result = 0;

        for(int i = 0 ; i < Integer.SIZE ; i++){
            int sum = 0;
            int mask = (1 << i);
            for(int j = 0 ; j < nums.length ; j++){
                if((nums[j] & mask) > 0){
                    sum++;
                }
            }

            if((sum%3) != 0)
                result |= mask;
        }
        return result;
    }

    public static void main(String[] args){
        int[] input = {1,1,1,2,2,2,3};
        System.out.print("Solution :: "+ singleNumber(input));
    }
}
