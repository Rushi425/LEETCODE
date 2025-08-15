class Solution {
    public boolean canJump(int[] nums) {
        int reach = 0;
        for(int i = 0; i < nums.length; i++){
            if(!(i > reach)){
                reach = Math.max(reach, i + nums[i]);
            } else{
                return false;
            }
        }
        return true;
    }
}
        // not valid
        // for(int i = 1; i < nums.length; i++) {
        //     if(max == 0) return false;
		// 	max = max - 1;
		// 	max = Math.max(max, nums[i]);
		// 	if(max == 0) {
		// 		return false;
		// 	}
		// }