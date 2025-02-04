class Solution {
    public int maxAscendingSum(int[] nums) {
        int current_sum = nums[0];
        int max_sum = 0;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i -1]){
                current_sum += nums[i];
            }
            else{
                max_sum = Math.max(current_sum, max_sum);
                current_sum = nums[i];
            }
        }
        return Math.max(current_sum, max_sum);
    }
}