class Solution {
public:
    bool isPalindrome(int x) {
        //for -ve no.
        if(x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }

        int rev = 0;
        int original = x;
        while(x != 0){
            int temp = x % 10;

            if(rev > INT_MAX / 10 || rev == INT_MAX / 10 && temp > 7 ){
                return false;
            }
            rev = rev * 10 + temp;
            x /= 10;
        }
        return rev == original;
    }
};