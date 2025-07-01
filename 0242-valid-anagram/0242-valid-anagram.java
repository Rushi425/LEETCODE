class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int [] freq = new int[26];   // assuming only small letters

        for(char c: s.toCharArray()){
            freq[c - 'a']++;
        }
        for(int c : t.toCharArray()){
            freq[c - 'a']--;
            if(freq[c - 'a'] < 0) return false;
        }
        return true;
    }
}

/*
class Solution {
    public boolean isAnagram(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();

        if(sLength == tLength){
            if(){

            }
            else return false;
        }
        else {
            return false;
        }
    }
}*/
