class Solution {
public:
    int longestMonotonicSubarray(vector<int>& nums) {
        int incre = 1, decre = 1, max_length = 1;;
        for(int i = 0; i < nums.size() - 1; i++){
            if(nums[i] < nums[i + 1]){
                incre += 1;
                decre = 1;
            }
            else if(nums[i] > nums[i + 1]){
                decre += 1;
                incre = 1;
            }
            else{
                decre = incre = 1;
            }
            max_length = max(max_length, max(incre, decre));
        }
        return max_length;
    }
};