class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        int n = nums.size(), pivot = -1;
        for(int i = n - 2; i >= 0; i--){ // pivot element 
            if(nums[i] < nums[i + 1]){
                pivot = i;
                break;
            }
        }
        if(pivot == -1) { // handling edge cases like (5,4,3,2,1)
            reverse(nums.begin(), nums.end());
            return;   
        }
        // Find the smallest element larger than nums[pivot] and swap
        for(int i = n - 1; i > pivot; i--){
            if(nums[i] > nums[pivot]){
                swap(nums[i],nums[pivot]);
                break;
            }
        }

        int a = pivot + 1, b = n - 1;
        while(a < b){
            swap(nums[a], nums[b]);
            a++;
            b--;
        }
        
    }
    
};