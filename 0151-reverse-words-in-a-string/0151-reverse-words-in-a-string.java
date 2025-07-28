class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder res = new StringBuilder();
        int size = words.length;
        for(int i = size - 1; i >= 0; i--){
            res.append(words[i]);
            if(i != 0) res.append(" ");
        }
        return res.toString();
    }
}