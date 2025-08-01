class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max = 1, inc_sub = 1, dec_sub = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] < nums[i - 1]){
                dec_sub += 1;
                inc_sub = 1; 
            }
            else if(nums[i] > nums[i - 1]){
                inc_sub += 1;
                dec_sub = 1;
            }
            else{
                inc_sub = 1;
                dec_sub = 1;
            }
            max = Math.max(max, Math.max(inc_sub, dec_sub));
        }
        return max;
    }
    
}