class Solution {
    public static void swap(int []arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void nextPermutation(int[] nums) {
        int pivot = -1, n = nums.length;
        //find pivot
        for(int i = n - 2; i >= 0; i--){
            if(nums[i] < nums[i + 1]){
                pivot = i;
                break;
            }
        }
        if(pivot == -1) {
            Arrays.sort(nums);
            return ;}
        
        // find no. which is smallest greater no.
        for(int i = n - 1; i > pivot; i--){
            if(nums[i] > nums[pivot]){
                swap(nums, i, pivot);
                break;
            }
        }
        // reverse the remaining part from pivot
        int left = pivot + 1, right = n - 1;
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }    }
}