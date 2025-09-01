class Solution {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        int prev1 = 1, prev2 = 1;
        for (int i = 2; i <= n; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}

// class Solution {
//     public int climbStairs(int n) {
//         return helper(n);
//     }

//     private int helper(int n) {
//         if (n == 0) return 1;  // reached top
//         if (n < 0) return 0;   // invalid path
//         return helper(n - 1) + helper(n - 2);
//     }
// }
// 

// class Solution {
//     public int climbStairs(int n) {
//         int[] dp = new int[n + 1];
//         Arrays.fill(dp, -1);
//         return helper(n, dp);
//     }

//     private int helper(int n, int[] dp) {
//         if (n == 0) return 1;
//         if (n < 0) return 0;
//         if (dp[n] != -1) return dp[n];
//         return dp[n] = helper(n - 1, dp) + helper(n - 2, dp);
//     }
// }

// class Solution {
//     public int climbStairs(int n) {
//         if (n == 1) return 1;
//         int[] dp = new int[n + 1];
//         dp[0] = 1;
//         dp[1] = 1;
//         for (int i = 2; i <= n; i++) {
//             dp[i] = dp[i - 1] + dp[i - 2];
//         }
//         return dp[n];
//     }
// }

