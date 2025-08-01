class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean[] rows = new boolean[m];
        boolean[] coln = new boolean[n];
        for(int i = 0; i < m; i++){
            int a = 0;
            while(a < n){
                if(matrix[i][a] == 0){
                    rows[i] = true;
                    coln[a] = true;
                }
                a++;
            }
        }
        for(int i = 0; i < m; i++){
            int a = 0;
            while(a < n){
                if(rows[i]|| coln[a]){
                    matrix[i][a] = 0;
                }
                a++;
            }
        }
    }
}