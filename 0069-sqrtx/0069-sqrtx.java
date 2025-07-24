class Solution {
    public int mySqrt(int x) {
        int i = 0;
        while((long)i * i <= x){
            if((long)(i * i) == x) return i; 
            ++i;
        }
        return i - 1;
    }
}