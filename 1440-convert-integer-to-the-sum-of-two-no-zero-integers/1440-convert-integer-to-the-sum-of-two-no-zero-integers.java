class Solution {
    private static boolean containsZero(int n) {
        while(n > 0) {
            if(n % 10 == 0) return true;
            n /= 10;
        }
        return false;
    }
    public int[] getNoZeroIntegers(int n) {
        int a = n / 2;
        int b = n - a;
        while(containsZero(a) || containsZero(b)) {
            a++;
            b--;
        }
    return new int[]{a, b};
    }
}


// class Solution {
//     public static boolean containsZero(int n){
//         while(n > 0) {
//             if(n % 10 == 0) return true;
//             n /= 10; 
//         }
//         return false;
//     }

//     public int[] getNoZeroIntegers(int n) {
//         int v1 = 0, v2 = 0;
//         int[] res = new int[2];
//         v1 = n / 2;
//         v2 = n - v1;
//         // check for v1
//         while(containsZero(v1)) {
//             v1 += 1;
//             v2 -= 1;
//         }
//         // check for v2
//         while(containsZero(v2)) {
//             v2 += 1;
//             v1 -= 1;
//         }
//         res[0] = v1;
//         res[1] = v2;
//         return res;
//     }
// }


// class Solution {
//     private static boolean containsZero(int n) {
//         while(n > 0) {
//             if(n % 10 == 0) return true;
//             n /= 10;
//         }
//         return false;
//     }

//     public int[] getNoZeroIntegers(int n) {
//         int[] res = new int[2];
//         int a = 0, b = 0;
//         for(int i = 1; i < n ; i++){
//             a = i; 
//             if(containsZero(a)){
//                 continue;
//             }
//             b = n - a;
//             if(containsZero(b)){
//                continue; 
//             }
//             break;
//         }
//         res[0] = a;
//         res[1] = b;
//         return res;
//     }
// }
