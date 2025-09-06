class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length, n = img[0].length;
        int[][] res = new int[m][n];
        int[] val = {-1, 0, 1};
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int count = 0, sum = 0;
                for(int X: val){
                    for(int Y: val){
                        int x = i + X;
                        int y = j + Y;
                        if(x >= 0 && x < m && y >= 0 && y < n){
                            sum += img[x][y];
                            count += 1;
                        }
                    }
                }
                res[i][j] = sum / count;    
            }
        }
        return res;
    }
}

// class Solution {
//     public int[][] imageSmoother(int[][] img) {
//         int m = img.length, n = img[0].length;
//         int[][] res = new int[m][n];
//         for(int i = 0; i < m; i++){
//             for(int j = 0; j < n; j++){
//                 int count = 0, sum = 0;
//                 // top left
//                 if(i - 1 >= 0 && j - 1 >= 0){
//                     count += 1; 
//                     sum += img[i - 1][j - 1];
//                 } 
//                 // top 
//                 if(i - 1 >= 0){
//                     count += 1; 
//                     sum += img[i - 1][j];
//                 }
//                 // top right
//                 if(i - 1 >= 0 && j + 1 < n){
//                     count += 1; 
//                     sum += img[i - 1][j + 1];
//                 } 
//                 // left
//                 if(j - 1 >= 0){
//                     count += 1; 
//                     sum += img[i][j - 1];
//                 }  
//                 // current cell
//                 count += 1; 
//                 sum += img[i][j];
//                 // right   
//                 if( j + 1 < n){
//                     count += 1; 
//                     sum += img[i][j + 1];
//                 } 
//                 // Bottom-left
//                 if(i + 1 < m && j - 1 >= 0){
//                     count += 1; 
//                     sum += img[i + 1][j - 1];
//                 }
//                 // Bottom
//                 if(i + 1 < m){
//                     count += 1; 
//                     sum += img[i + 1][j];
//                 }  
//                 // Bottom-right
//                 if(i + 1 < m && j + 1 < n){
//                     count += 1; 
//                     sum += img[i + 1][j + 1];
//                 }     
//                 res[i][j] = sum / count;   
//             }    
//         }
//         return res;
//     }
// }