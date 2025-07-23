class Solution {
    public boolean canJump(int[] nums) {
        int reach = 0;
        for(int i = 0; i < nums.length; i++){
            if(!(i > reach)){
                reach = Math.max(reach, i + nums[i]);
            }
            else return false;
        }
        return true;
    }
}