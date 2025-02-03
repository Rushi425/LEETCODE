class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max_length = 1;
        int incre = 1, decre = 1;

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] < nums[i + 1]){
                incre += 1;
                decre = 1;
            }
            else if(nums[i] > nums[i + 1]){
                decre += 1;
                incre = 1;
            }
            else{
                incre = decre = 1;
            }
            max_length = Math.max(max_length, Math.max(incre, decre));
        }
        return max_length;
    }
}