class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int[] ans = {-1, -1};
        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] == target){
                int left = mid;
                while(left >=0 && nums[left] == target){
                    left-=1;
                }
                int right = mid;
                while(right <= nums.length - 1 && nums[right] == target){
                    right+=1;
                }
                ans[0] = left + 1;
                ans[1] = right - 1;
                return ans;
            } 
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }
}




//     public int[] searchRange(int[] nums, int target) {
//         int[] a = {-1, -1};
//         if(nums.length < 1) return a;        

//         // two binary searches
//         a[0] = find(nums, target, true);
//         a[1] = find(nums, target, false);

//         return a;
//     }

//     public static int find(int[] nums, int target, boolean isFirst){
//         int low = 0, high = nums.length, bound = -1;
//         while(low <= high){
//             int mid = (low + high) / 2;
//             if(nums[mid] == target){
//                 bound = mid;
//                 if(isFirst){
//                     high = mid - 1;
//                 }
//                 else{
//                     low = mid + 1;
//                 }

//             }
//             else if(nums[mid] < target){
//                 low = mid + 1;
//             }
//             else{
//                 high = mid - 1; 
//             }
//         }
//         return bound;
//     }