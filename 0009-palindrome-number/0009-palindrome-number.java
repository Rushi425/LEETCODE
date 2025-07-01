class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x); // Integer.toString(x)
        int left = 0, right = s.length() -1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)) return false;
            right--;
            left++;
        }
        return true;
    }
}


/*
class Solution {
    public boolean isPalindrome(int x) {
        // -ve or ending with zero bu not zero
        if(x < 0 ||( x % 10 == 0 && x != 0)) return false;

        int rev = 0;

        while(x > rev){
            // int rem = x % 10; 
            rev = rev * 10 + (x % 10); 
            x = x / 10;
        }

        return (x == rev ||x == rev / 10 );
    }
}*/