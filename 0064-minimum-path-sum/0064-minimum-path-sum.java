class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length; 
        int [][] dp = new int[m][n];
        dp[0][0] = grid[0][0];

        //first row -> coloumn size till
        for(int i = 1; i < n; i++){
            dp[0][i] = grid[0][i]+ dp[0][i - 1];
        }
        // first coln
        for(int i = 1; i < m; i++){
            dp[i][0] = grid[i][0] + dp[i - 1][0];
        }

        //remaining all 
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                dp[i][j] = grid[i][j] + Math.min(dp[i][j - 1], dp[i - 1][j]);
            }
        }
    return dp[m - 1][n - 1];
    }
}