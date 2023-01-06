package searchinsert.solution;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        if (target < nums[0]) {
            return 0;
        }

        if (nums.length == 1){
            if(target <= nums[0]){
                return 0;
            }
            else{
                return 1;
            }
        }

        for (int i = 1; i < nums.length; i++){
            if(target == nums[i-1]){
                return i-1;
            }

            else if (target > nums[i-1]){

                if (target <= nums[i]){
                    return i;
                }
            }
        }

        return nums.length;
    }
}
