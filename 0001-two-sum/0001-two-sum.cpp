#include<unordered_map>
#include<vector>
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> result;

        for(int i = 0; i < nums.size(); i++){
            int complement = target - nums[i];

            if(result.find(complement) != result.end()){
                return {result[complement], i};
            }
            result[nums[i]] = i;
        }
        return {};
    }
};