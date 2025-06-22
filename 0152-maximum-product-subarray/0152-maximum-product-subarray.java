class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            int current =1;
            for(int j = i; j < nums.length; j++){
                current *= nums[j];
                max = Math.max(current, max);
            }
        } return max;
    }
}