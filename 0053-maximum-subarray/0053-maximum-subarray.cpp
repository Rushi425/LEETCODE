class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int currentSum = 0; //initialize to 0.
        int maxSum = INT_MIN;

        for(int i = 0; i < nums.size(); i++){
            currentSum += nums[i]; // add each number to currentSum.
            maxSum = max(currentSum, maxSum); // find maximum.

            if(currentSum < 0){ 
                currentSum = 0;
            }
            
        }
        return maxSum;
    }
    
};
