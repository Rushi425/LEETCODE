class Solution {
    public int mySqrt(int x) {
        int low = 0, high = x;
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low) / 2;

            long square =(long) mid * mid;
            if(square == x){
                return mid;
            }
            else if(square < x) {
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }
}