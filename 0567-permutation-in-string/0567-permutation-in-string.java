class Solution {

    static private boolean check(int[] freqnS1, int[] freqnS2){
        for(int i = 0; i < 26; i++){
            if(freqnS1[i] != freqnS2[i]) return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int window = s1.length();
        int[] freqnS1 = new int[26];
        int[] freqnS2 = new int[26];

        for(char c: s1.toCharArray()){
            freqnS1[c - 'a']++;
        }

        for(int i = 0; i < s2.length(); i++){
            freqnS2[s2.charAt(i) - 'a']++;

            if(i >= window){
                freqnS2[s2.charAt(i - window) - 'a']--;
            }

            if(check(freqnS1, freqnS2)){
                return true;
            }
        }
        return false;
    }
}