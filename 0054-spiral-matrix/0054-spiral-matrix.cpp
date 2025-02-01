class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int m = matrix.size();
        int n = matrix[0].size();
        int left = 0, right = n - 1, bottom = m - 1, top = 0;
        vector<int> res;

        while(top <= bottom && left <= right){
            //move towards left
            for(int i = top; i <= right; i++)
                res.push_back(matrix[top][i]);
            top++;
            
            //move downwords
            for(int i = top; i <= bottom; i++)
                res.push_back(matrix[i][right]);
            right--;

            //move left 
            if(top <= bottom){
                for(int i = right; i >= left; i--)
                    res.push_back(matrix[bottom][i]);
                bottom--;
            }
            //move upwords
            if(left <= right){
                for(int i = bottom; i >= top; i--)
                    res.push_back(matrix[i][left]);
                left++;
            }
        }
        return res;
    }
};