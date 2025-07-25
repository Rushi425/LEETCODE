class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length - 1;
        int coln = matrix[0].length - 1;
        int l = 0, h = row;
        while(l <= h){
            int mid = l + (h - l)/ 2;
            if(matrix[mid][0] <= target && target <= matrix[mid][coln]){
                int low = 0, high = coln;
                while(low <= high){
                    int m = low + (high - low) / 2;
                    if(matrix[mid][m] == target) return true;
                    else if (matrix[mid][m]  < target) low = m + 1;
                    else high = m - 1;
                }
                return false;
            }
            else if(matrix[mid][0] > target) h = mid - 1;
            else l = mid + 1;
        }
        return false;
    }
    
}