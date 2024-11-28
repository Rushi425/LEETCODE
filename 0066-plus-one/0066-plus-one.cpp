class Solution {
public:
    vector<int> plusOne(vector<int>& v) {
        int n = v.size();
        
        for (int i = n - 1; i >= 0; i--) {
            v[i]++;  // Add 1 to the current digit
            
            if (v[i] < 10) {
                return v;  // No carry
            }
            
            v[i] = 0;  // Carry occurred set digit to 0
        }
        
        // Edge case If all digits were 9 
        v.insert(v.begin(), 1);
        return v;
    }
};
