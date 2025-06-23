class Solution {
    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length - 1;
        int max = 0;

      while(low<high){
        int width = high - low;
        int minHeight = Math.min(height[low], height[high]);
        int capacity = width * minHeight;

        max= Math.max(max,capacity);
        if (height[low] < height[high]) {
                low++;
            } else {
                high--;
            }
      }
      return max;
    }
}