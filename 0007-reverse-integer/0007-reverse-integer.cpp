class Solution {
public:
    int reverse(int x) {
        long long rev = 0; //to avoid overflow error
        while(x != 0){
            int temp = x % 10;
            rev = rev * 10 + temp;
            x = x / 10;
        }
        if(rev < INT_MIN || rev > INT_MAX){
            return 0;
        }
        return rev;
    }
};