class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        if(n == 1) {
            return res;
        }
        int insert = 1,i = 0;
        for(i = 0;  i < n / 2; i++){
            res[i] = -insert++;
        }
        insert -= 1; 
        if(n % 2 != 0) res[i++] = 0;
        for(int j = i; j < n; j++){
            res[j] = insert;
            insert--;
        }
        return res;
    }
}

// for(int i = 1; i < n - 1; i++){
//             res[i] = 0;
//         }
//         res[0] = -n;
//         res[n - 1] = n;
//         return res;