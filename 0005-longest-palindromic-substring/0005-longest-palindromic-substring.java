class Solution {
    static String findLongestSubstring(String s, int left, int right, String res){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            if(res.length() < right - left + 1) res= s.substring(left, right+1);
            left--;
            right++;
        }
        return res;
    }
    public String longestPalindrome(String s) {
        int n = s.length();
        String res = "";
        for(int i = 0; i < n; i++){
            //even palindrome
            res = findLongestSubstring(s, i, i, res);
            //odd palindrome
            res = findLongestSubstring(s, i, i+1, res);
        }
        return res;
    }   
}