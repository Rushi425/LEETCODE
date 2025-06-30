class Solution {
  public int recur(int i, int j, int m, int n, int[][] dp) {
    if (i == m - 1 && j == n - 1) return 1;       // Reached destination
    if (i >= m || j >= n) return 0;              // Out of bounds
    if(dp[i][j] != -1) return dp[i][j]; //alrady solved
    return dp[i][j] = (recur(i + 1, j,m,n,dp) + recur(i, j + 1,m,n,dp));    // Move down + Move right
}
    public int uniquePaths(int m, int n) {
        int [][] dp = new int[m][n];       
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return recur(0, 0, m, n, dp);
    }
}