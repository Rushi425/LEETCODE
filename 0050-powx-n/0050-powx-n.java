class Solution {
    double solve(double x, long n){
        if(n == 0) return 1.0;
        if(n < 0){
            return solve(1/x, -n);
        }
        if(n % 2 == 0){
            return solve(x*x, n/2);
        }
        else return x*solve(x*x, (n-1)/2);
    }

    public double myPow(double x, long n) {
        return solve(x, (long)n);
    }   
}

// class Solution {
//     double solve(double x, long n) {
//         if (n == 0) return 1.0;
        
//         if (n % 2 == 0) {
//             return solve(x * x, n / 2);
//         } else {
//             return x * solve(x * x, (n - 1) / 2);
//         }
//     }

//     public double myPow(double x, int n) {
//         long power = n;  // Convert to long to avoid overflow
//         if (power < 0) {
//             x = 1 / x;
//             power = -power;
//         }
//         return solve(x, power);
//     }
// }
