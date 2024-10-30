class Solution {
public:
    void merge(vector<int>& n1, int m, vector<int>& n2, int n) {
   
        for(int i = 0, j = m; i < n; i++,j++){
            n1[j] = n2[i];
        }

        sort(n1.begin(),n1.end());
    }
};

