import java.util.Arrays;

/**
 * Created by Mathurs on 10/18/16.
 */
public class NextPermutation {

    public static int[] nextPermutation(int[] nums) {
        if(nums == null || nums.length < 1)
            return nums;

        // int max = nums[nums.length - 1];
        // int minIndex = nums.length - 1;
        int index = nums.length -1;

        while(index > 0){
            if(nums[index-1] < nums[index])
                break;
            index--;

            // if(nums[i] < max)
            //     break;

            // if(nums[i] > max){
            //     max = nums[i];
            // }
            // else if(nums[i] < nums[minIndex]){
            //     minIndex = i;
            // }
        }
        index--;

        if(index <= 0){
            Arrays.sort(nums);
            return nums;
        }

        for(int i = nums.length -1 ; i > index ; i++){
            if(nums[i] > nums[index]){
                swap(i, index , nums);
                Arrays.sort(nums, index+1 , nums.length);
                return nums;
            }
        }

        return nums;

    }

    public static void swap (int x, int y,int[] num){
        int temp = num[x];
        num[x]=num[y];
        num[y]=temp;
    }

    public static void main(String[] args){
        int nums[] = new int[] {1,2,3};
        nums = nextPermutation(new int[] {1,2,3});

        for(int i = 0 ; i < 3 ; i++)
            System.out.println(nums[i]);
    }


}