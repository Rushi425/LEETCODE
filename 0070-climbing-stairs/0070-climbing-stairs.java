class Solution {
    public int climbStairs(int n) {
        // if(n == 1) return 1;
        // if(n == 0) return 1;
        // return climbStairs(n-1)+ climbStairs(n-2);


        if(n == 1) return 1;
        if(n == 0) return 1;
        int prev = 1;
        int prev2 = 1;
        int current = 0;
        for(int i = 2; i <= n; i++){
            current = prev + prev2;
            prev2 = prev;
            prev = current;
             
        }
    return current;
    }

}