/**
 * Created by Mathurs on 10/26/16.
 */
public class WiggleSubsequence {

    public int wiggleMaxLength(int[] nums) {

        if(nums == null || nums.length == 0)
            return 0;
        if(nums.length < 2)
            return nums.length;

        int big , small;
        int length = 2;
        int k = 0;

        while(true){
            if(nums[k+0] > nums[k+1]){
                big = k + 0;
                small = k + 1;
                break;
            }
            else if(nums[k+0] < nums[k+1]){
                big = k + 1;
                small = k + 0;
                break;
            }
            else{
                if(k+1 == nums.length-1)
                    return 1;
                else
                    k++;
            }
        }

        System.out.println(k);

        for(int i = k+2 ; i < nums.length ; i++){
            if(big > small){
                if(nums[big] > nums[i]){
                    length++;
                    small = i;
                }
                else{
                    big = i;
                }
            }
            else{
                if(nums[small] < nums[i]){
                    length++;
                    big = i;
                }
                else{
                    small = i;
                }
            }
        }

        return length;
    }
}
