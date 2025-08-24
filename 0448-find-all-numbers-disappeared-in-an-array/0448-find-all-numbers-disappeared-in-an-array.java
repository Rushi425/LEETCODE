class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int idx = Math.abs(nums[i]) - 1;
            if(nums[idx] > 0){
                nums[idx] = -nums[idx];
            }
        }
        for(int i = 0; i < n; i++){
            if(nums[i] > 0) res.add(i + 1);
        }
        return res;
    }
}

        // Set<Integer> set = new HashSet<>();
        // List<Integer> res = new ArrayList<>();       
        // for (int num : nums) {
        //     set.add(num);
        // }        
        // for (int i = 1; i <= nums.length; i++) {
        //     if (!set.contains(i)) {
        //         res.add(i);
        //     }
        // }       
        // return res;


        // List<Integer> res = new ArrayList<>();
        // boolean[] seen = new boolean[nums.length + 1];       
        // for (int num : nums) {
        //     seen[num] = true;
        // }
        // for (int i = 1; i <= nums.length; i++) {
        //     if (!seen[i]) {
        //         res.add(i);
        //     }
        // }
        // return res;