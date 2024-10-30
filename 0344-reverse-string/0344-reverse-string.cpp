class Solution {
public:
    void reverseString(vector<char>& s) {
       int low = 0;
       char temp;
       int high = s.size() - 1; 
        while(low < high){
            temp = s[low];
            s[low] = s[high];
            s[high] = temp;
            low++;
            high--;
        }
        
    }
    
};