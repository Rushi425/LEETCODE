class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        set<int> set1(nums1.begin(), nums1.end());
        set<int> set2(nums2.begin(), nums2.end());
        vector<int> ans;

        for(int number : set1){
            if(set2.count(number)){
                ans.push_back(number);
            }
        }
        return ans;
    }
};