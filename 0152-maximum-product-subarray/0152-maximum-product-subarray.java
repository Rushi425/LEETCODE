class Solution {
    public int maxProduct(int[] nums) {
        int min = nums[0], max = nums[0], maxTill = nums[0];

        for(int i = 1; i < nums.length; i++){
            int temp = max;
            max = Math.max(nums[i], Math.max(nums[i] * min, nums[i] * temp));
            min = Math.min(nums[i], Math.min(nums[i] * min, nums[i] * temp));
            maxTill = Math.max(maxTill, max);
        }
        return maxTill;
    }
}