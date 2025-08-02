class Solution {
    public String getSmallestString(String s, int k) {
        String res = "";
        for(int i = 0; i < s.length(); i++){
            int rightS = 'z' - s.charAt(i) + 1;
            int leftS = s.charAt(i) - 'a';
            int min = Math.min(rightS, leftS);
            if(k >= min){
                res += 'a';
                k -= min;
            }
            else{
                char c = (char)(s.charAt(i) - k);
                res += c;
                k = 0;
            } 
        }
        return res;
    }
}