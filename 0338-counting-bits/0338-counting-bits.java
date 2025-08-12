class Solution {
    public int[] countBits(int n) {
        int [] ans = new int[n+1];
        int offset = 1;
        for(int i = 1; i <= n; i++){
            if((offset * 2) == i) offset = i;
            ans[i] = 1 + ans[i - offset]; 
        }
        return ans;


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


        // int [] dp = new int [n+1];
        // for(int i = 1; i <= n; i++){
        //     int count = 0;
        //     int temp = i;
        //     while(temp > 0){
        //         if(temp % 2 == 1) count+=1;
        //         temp /= 2;
        //     }
        //     dp[i] = count;
        // }
        // return dp;
    }
}