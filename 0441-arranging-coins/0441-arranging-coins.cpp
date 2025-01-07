class Solution {
public:
    int arrangeCoins(int n) {
        long long low = 0, high = n;

        while (low <= high) {
            long long mid = low + (high - low) / 2;
            long long sum = mid * (mid + 1) / 2; 

            if (sum == n) {
                return mid; 
            } else if (sum < n) {
                low = mid + 1; 
            } else {
                high = mid - 1; 
            }
        }

        return high; 
    }
};



        // int num = n; 
        // int count = 1;

        // if(n == 1) return 1;
        // while(true){
        //     num = num - count;
        //     if(num == 0){
        //         return count;
        //     }
        //     else if(num < 0){
        //         return --count;
        //     }
        //     else{
        //         count++;
        //     }