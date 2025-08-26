class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];  

        int low = 0, high = n - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(mid == 0) {
                if(nums[mid + 1] != nums[mid])
                return nums[mid];
            }
            if(mid == n - 1) {
                if(nums[mid - 1] != nums[mid])
                return nums[mid];
            }

            if(mid > 0 && mid < n - 1 && nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]){
                return nums[mid];
            } 
            if((mid % 2 == 1 && nums[mid - 1] == nums[mid]) || (mid % 2 == 0 && nums[mid + 1] == nums[mid])){
                low = mid + 1;
            }
            else{
                high = mid - 1;

            }
        }
        return -1;
    }
}