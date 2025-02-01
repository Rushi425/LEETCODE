class Solution {
public:
    bool searchInRow(vector<vector<int>>& matrix, int target, int row){
        int n = matrix[0].size();
        int low = 0, high = n - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            
            if(matrix[row][mid] == target) return true;
            else if(target < matrix[row][mid]) high = mid - 1;
            else low = mid + 1;
        }
        return false;
        
    }

    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int m = matrix.size(), n = matrix[0].size();
        int sr= 0, er = m - 1;

        while(sr <= er){
            int mid = sr + (er - sr) / 2;
            if(target >= matrix[mid][0] && target <= matrix[mid][n -1]){
                //found the row
                return searchInRow(matrix, target, mid);  
            }
            else if(target < matrix[mid][0]){
                er = mid - 1;
            }
            else{
                sr = mid + 1;
            }
        }
        return false;
    }
};