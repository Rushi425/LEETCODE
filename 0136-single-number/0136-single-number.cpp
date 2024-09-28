class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int ans = 0;

        // for( int val: nums){
        //     ans = ans ^ val;
        // }
        // return ans;

        for(int i = 0; i < nums.size(); i++){
            ans = ans ^ nums[i];
        }
        return ans;
    }
};