class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int row = 0, coln = n - 1;
        while(row < m && coln >= 0){
            if(matrix[row][coln] == target) return true;
            else if(matrix[row][coln] > target) coln--;
            else row++;
        }
        return false;
    }
}