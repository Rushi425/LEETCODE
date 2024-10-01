class Solution {
public:
    int mostFrequentEven(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        
        int mostFreq = -1;  // To store the most frequent even number
        int highestFreq = 0;  // To track the highest frequency
        int currentFreq = 0;  // To track the current frequency
        

        for(int i = 0; i < nums.size(); i++){
            if(nums[i] % 2 == 0){
                currentFreq = 1;
        

                while(i + 1 < nums.size() && nums[i] == nums[i+1]){
                    currentFreq +=1 ;
                    i++;
                }
                if(currentFreq > highestFreq){
                   highestFreq = currentFreq ;
                    mostFreq = nums[i];
                }
               
            }
        }
        return mostFreq;
    }
};

                
            
              
