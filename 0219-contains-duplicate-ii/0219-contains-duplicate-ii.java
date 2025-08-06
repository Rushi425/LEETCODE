class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();  
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])) return true;
            set.add(nums[i]);
            if(set.size() > k){
                set.remove(nums[i - k]);
            }
        }
        return false; 


        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i = 0; i < nums.length; i++){
        //     if(map.containsKey(nums[i])) {
        //         if(i - map.get(nums[i]) <= k) return true;
        //     }
        //     map.put(nums[i], i);
        // }
        // return false;


        // for(int i = 0; i < nums.length - 1; i++){
        //     int j = i + 1;
        //     while(j < nums.length && j <= i + k){
        //         if(nums[i] == nums[j]) {  
        //             return true;
        //         }
        //     j++;
        //     }
        // }
        // return false;
    }
}







        