class Solution {

    static int calculate(int[] arr,int m,int n){
        if (n - m == 0) return 0;
        if (n - m == 1) return arr[m];

        // int []dp = new int [n - m];
        // dp[0] = arr[m];
        // dp[1] = Math.max(dp[m], arr[m + 1]);
        int prev2 = arr[m];
        int prev = Math.max(prev2, arr[m + 1]);
        int curr = 0;
        for(int i = m + 2; i < n; i++){
            // int take = dp[i - 2] + arr[i + m];
            int take = prev2 + arr[i];
            // int notTake = dp[i - 1];
            int notTake = prev;
            curr = Math.max(take, notTake);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }

    public int rob(int[] arr) {
        if (arr.length == 0) return 0;
        if (arr.length == 1) return arr[0];

        int startFrom0 = calculate(arr, 0, arr.length - 1);
        int startFrom1 = calculate(arr, 1, arr.length);
        
        return Math.max(startFrom1, startFrom0);
    }
}