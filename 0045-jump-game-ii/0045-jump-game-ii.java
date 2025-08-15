class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int left = 0, right = 0;

        while(right < nums.length - 1){
            int farthest = 0;
            for(int i = left; i <= right; i++){
                farthest = Math.max(farthest, i + nums[i]);
            }
            jumps += 1;
            left = right + 1;
            right = farthest ; 
        }
        return jumps;
    }
}


    // public static int function(int index, int jumps, int[] nums, int minJumps){
    //     if(index >= nums.length - 1) return Math.min(jumps, minJumps);
        
    //     for(int i = 1; i <= nums[index]; i++){
    //         minJumps = function(index + i, jumps + 1, nums, minJumps);
    //     }
    //     return minJumps;
    // } 

    // public int jump(int[] nums) {
    //     return function(0, 0, nums, Integer.MAX_VALUE);
    // }