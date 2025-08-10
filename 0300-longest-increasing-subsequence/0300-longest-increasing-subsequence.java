class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int maxLength = 1;
        for(int i = 1; i < n; i++){
            for(int j = 0; j < i; j++){
                if(nums[j] < nums[i]){
                    dp[i] = Math.max(dp[i], dp[j] + 1); 
                }
            }
            maxLength = Math.max(maxLength, dp[i]);
        }
        return maxLength;
    }
}

    // public int lengthOfLIS(int[] nums) {
    //     return helper(nums, Integer.MIN_VALUE, 0);
    // }
    // static int helper(int[] nums, int prev, int index){
    //     // base condition
    //     if(index == nums.length) return 0;

    //     // 1.skip element
    //     int skip = helper(nums, prev, index + 1);
        
    //     // 2.take 
    //     int take = 0;
    //     if(prev < nums[index]){
    //         take = 1 + helper(nums, nums[index], index + 1);
    //     }
    //     return Math.max(skip, take);