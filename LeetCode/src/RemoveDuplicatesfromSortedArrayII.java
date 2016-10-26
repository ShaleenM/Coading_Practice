/**
 * Created by Mathurs on 10/26/16.
 */
public class RemoveDuplicatesfromSortedArrayII {


    public int removeDuplicates(int[] nums , int k) {

        if(nums == null)
            return 0;
        if(nums.length < 2)
            return nums.length;

        int currCount = 1;
        int totalCount = 1;
        int pos = 1;

        for(int i = 1 ; i < nums.length ; i++){

            if(nums[i] == nums[i -1])
                currCount++;
            else
                currCount = 1;

            if(currCount <= k){
                nums[pos++] = nums[i];
                totalCount++;
            }
        }

        return totalCount;
    }

    public static void main(String[] args) {
        RemoveDuplicatesfromSortedArrayII problem = new RemoveDuplicatesfromSortedArrayII();
        int[] nums = new int[] {1,2,2,3,3,3,4,4,4,4,4,4,4,5,5,5,5,5,5,6,6,6,6,6,7,7,7,7,7};
        int length = problem.removeDuplicates(nums , 2);

        for(int i = 0 ; i < length ; i++){
            System.out.print(nums[i] + " , ");
        }
    }
}
