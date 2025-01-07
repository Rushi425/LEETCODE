class Solution {
public:
    int arrangeCoins(int n) {
        int num = n; 
        int count = 1;

        if(n == 1) return 1;
        while(true){
            num = num - count;
            if(num == 0){
                return --count;
            }
            else if(num < 0){
                return --count;
            }
            else{
                count++;
            }
        }
    }
};