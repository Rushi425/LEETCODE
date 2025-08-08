class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] bool = new boolean[nums.length];
        for(int i: nums){
            if(bool[i] == true) return i;
            bool[i] = true;
        }
        return -1;

        // Arrays.sort(nums);
        // for(int i = 1; i < nums.length; i++){
        //     if(nums[i] == nums[i - 1]) return nums[i];
        // }
        // return -1; 

        // HashSet<Integer> seen = new HashSet<>();
        // for (int num : nums) {
        //     if (seen.contains(num)) return num;
        //     seen.add(num);
        // }
        // return -1;
    }
}