class Solution {
    public int[] countBits(int n) {
        int [] dp = new int [n+1];
        int offset = 1;
        
        for(int i = 1; i <= n; i++){
            if((offset * 2) == i) 
                offset = i;
            dp[i] = 1 + dp[i- offset];
        }
        return dp;


        // int [] ans = new int [n + 1];

        // for(int i = 0; i <= n; i++){
        //     int c = 0;
        //     int x = i;
        //     while(x != 0){
        //         if((x & 1) == 1) c++;
        //         x = x>>1;
        //     }
        //     ans[i] = c;
        // }
        // return ans;
    }
}