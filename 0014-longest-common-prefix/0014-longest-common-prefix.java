class Solution {
    public String longestCommonPrefix(String[] str) {
        if(str.length == 0 || str == null) return "";

        String prefix = str[0];
        

        for(int i = 1; i < str.length; i++){
            int j = 0;
            while (j < prefix.length() && j < str[i].length() && prefix.charAt(j) == str[i].charAt(j)){
                j++;
            }
            prefix = prefix.substring(0, j);
        }
        if(prefix.isEmpty()) return "";
        return prefix;

    }
}