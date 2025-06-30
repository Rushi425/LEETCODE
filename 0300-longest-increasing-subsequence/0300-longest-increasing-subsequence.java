class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int [][] dp = new int[n][n+1];
        // Initialize with -1 (unvisited)
        for(int[] row: dp){
            Arrays.fill(row, -1);
        }
        
        return recur(0, -1, nums, dp); 
    }
    
    // i = current index, prev = index of previous element in LIS
    private int recur(int i, int prev, int [] nums, int[][] dp){
        if(i == nums.length) return 0;
        if(dp[i][prev+1] != -1) return dp[i][prev+1];

        int notTake = 0 + recur(i + 1, prev , nums, dp);
        int take = 0;
        if(prev == -1 || nums[i] > nums[prev]){
            take = 1 + recur(i + 1, i, nums, dp);
        }

        dp[i][prev+1] = Math.max(take, notTake);;
        return dp[i][prev+1];
    }
}
        

