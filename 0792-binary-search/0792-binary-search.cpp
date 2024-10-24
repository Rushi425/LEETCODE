class Solution {
public:
    int search(vector<int>& nums, int target) {
        int low = 0;
        int high = nums.size()-1;
        int mid;

        if(low == high){
            if(nums[low] == target){
                return low;
            }
            return -1;
        }
        while(low <= high){
            mid = (low + high) / 2;
            if(nums[mid] == target){
                return mid;
            }

            if(target < nums[mid]){
                high = mid - 1;
            }    
            else{
                low = mid + 1;
            }
        }
        return -1;
    }
};