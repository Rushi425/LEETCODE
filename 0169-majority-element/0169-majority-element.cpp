class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int n = nums.size(); 
        int majority = n/2;

        for(int val : nums ){
            int freq = 0;
            for(int el : nums ){
                if(val == el){
                    freq++;
                }
            }
            if(freq > majority){
                return val;
            }
        }

           return 0;

    }
};