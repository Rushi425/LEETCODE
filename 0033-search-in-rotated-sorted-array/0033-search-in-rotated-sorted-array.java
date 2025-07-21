class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high= nums.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;

            if(nums[mid] == target) return mid;

            // if left sorted then check it is availble or not left part otherwise it is in right part
            if(nums[low] <= nums[mid]){
                if(nums[low] <= target && nums[mid] > target){
                    high = mid -1;
                }
                else low = mid + 1;
            }

            else{
                if(nums[mid] < target && target <= nums[high]){
                    low = mid + 1;
                }
                else{
                    high = mid -1;
                }
            }
        }
        return -1;
    }
}