class Solution {
    public int arrangeCoins(int n) {
        long l = 0, r = n;
        while(l <= r){
            long mid = l + (r - l) / 2;
            long count = mid * (mid + 1) / 2;
            if(count == n) return (int)mid;
            if(count < n){
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }
        return (int)r;
    }
}

        // int row = 0;
        // while(row + 1 <= n){
        //     row++;
        //     n -= row;
        // }
        // return row;

        
        // int row = 0, count = 0, total = 0;
        // while(total + row + 1 <= n){
        //     row += 1;
        //     total += row;
        //     count++;
        // }
        // return count;