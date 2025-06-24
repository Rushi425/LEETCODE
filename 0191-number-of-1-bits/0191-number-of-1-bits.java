class Solution {
    // public int hammingWeight(int n) {
    //     int count = 0;
    //     for(int i = 0; i < 32; i++){
    //         if((n & 1) == 1) count++;
    //         n = n >> 1;
    //     } 
    //     return count;  
    // }

    // public int hammingWeight(int n){
    //     // Brian Kernighan’s Algorithm
    //         int c = 0;
    //         while(n != 0){
    //             n = n & (n - 1);c++;
    //         }
    //         return c;
    // }

    // java 8+
    public int hammingWeight(int n){
        return Integer.bitCount(n);
    }
}