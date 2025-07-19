class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int [] prefixMax = new int[n];
        int [] suffixMax = new int[n];

        //store left max and right max for i index of height
        prefixMax[0] = height[0];
        suffixMax[n - 1] = height[n - 1];

        for(int i = 1; i < n; i++){
            prefixMax[i] = Math.max(prefixMax[i - 1], height[i]);
        } 
        for(int i = n - 2; i >= 0; i--){
            suffixMax[i] = Math.max(suffixMax[i + 1], height[i]);
        }

        int store = 0;
        for(int i = 0; i < n; i++){
            //optional check
            if(height[i] < prefixMax[i] && (height[i] < suffixMax[i])){
                store += Math.min(prefixMax[i], suffixMax[i]) - height[i];
            }
        }
        return store;
    }
}