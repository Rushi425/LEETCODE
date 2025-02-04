class Solution {
    static boolean searchRow(int[][] matrix, int target, int row) {
        int low = 0, high = matrix[0].length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (matrix[row][mid] == target) {
                return true;
            } else if (matrix[row][mid] < target) {
                low = mid + 1;  
            } else {
                high = mid - 1; 
            }
        }
        return false; 
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;  
        int sr = 0, er = m - 1;  

        while (sr <= er) {
            int mid = sr + (er - sr) / 2;

            if (target >= matrix[mid][0] && target <= matrix[mid][n - 1]) {
                return searchRow(matrix, target, mid);  
            } else if (target < matrix[mid][0]) {
                er = mid - 1;  
            } else {
                sr = mid + 1; 
            }
        }
        return false;  }}
