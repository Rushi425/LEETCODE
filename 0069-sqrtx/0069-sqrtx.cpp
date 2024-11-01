class Solution {
public:

    int binarySearch(int x) {

        if (x == 0 || x == 1) return x;  

        int low = 0;
        int high = x;
        int ans = -1;
        long long square;  // Use long long to prevent overflow

        while (low <= high) {
            int mid = low + (high - low) / 2;
            square = (long long)mid * mid;  // Cast mid to long long

            if (square == x) {
                return mid;
            }
            if (square < x) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    int mySqrt(int x) {
        return binarySearch(x);
    }
};
