class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        // find the pivot
        int n = nums.size();
        int pivot = -1;
        for(int i = n - 2; i >= 0; i--){
            if(nums[i] < nums[i + 1]){
                pivot = i;
                break;
            }
        }
        //edge case
        if(pivot == -1){
            reverse(nums.begin(), nums.end());
            return;
        }
        //find large number than pivot
        for(int i = n - 1; i > pivot; i--){
            if(nums[pivot] < nums[i]){
                swap(nums[pivot],nums[i]);
                break;
            }
        }
        //reverse part after pivot
        int a = pivot + 1, b = n - 1;
        while(a < b){
            swap(nums[a], nums[b]);
            a++;
            b--;
        }

    }
};