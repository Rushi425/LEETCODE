class Solution {
    public int missingNumber(int[] nums) {
        int sumAvailable = 0, neededSum= 0;
        for(int i: nums){
            sumAvailable += i;
        }
        neededSum =  (nums.length * (nums.length + 1)) / 2;
        
    return neededSum - sumAvailable;
    }
}