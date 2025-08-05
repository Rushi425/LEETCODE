class Solution {
    public int reverseBits(int n) {
        int rev = 0;
        for(int i = 0; i < 32; i++){
            // make space
            rev = rev << 1;
            //extract last digit
            int t = n & 1;
            // add in rev
            rev = rev | t;
            // right shift n
            n = n >>> 1;
        }
        return rev;
    }
}