class Solution {
public:
    vector<int> getSneakyNumbers(vector<int>& nums) {
        for(int i = 0; i < nums.size(); i++){
            nums[i] += 1;
        }
        vector<int> ans;
        for(int i = 0; i < nums.size(); i++){
            int idx = abs(nums[i]);
            if(nums[idx] < 0){
                ans.push_back(idx-1);
            }
            else{
                nums[idx] *=(-1);            
            }
    }
    return ans;
}};