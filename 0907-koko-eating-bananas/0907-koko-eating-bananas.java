class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }

        int low = 1, high = max;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long hours = 0;

            for (int pile : piles) {
                hours += (pile + mid - 1L) / mid;
            }

            if (hours <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}

