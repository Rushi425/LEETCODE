class Solution {
    public static String findMinimumSubString(String s, String sub){
        if(sub.length() > s.length()) return "";
        int i = 0, j = 0;
        Map<Character, Integer> map = new HashMap<>();
        int min_length = Integer.MAX_VALUE;
        int startingOfString = 0;
        int count_required = sub.length();
        for(char c: sub.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
     
        while(j < s.length()){
                //get the char at j
                char endChar = s.charAt(j);
                if (map.containsKey(endChar)){
                    map.put(endChar, map.get(endChar) - 1);
                    if (map.get(endChar) >= 0){
                    count_required--;
                }
                }
                
                //Shrink if count_required = 0 -> till count_required = 1
                while(count_required == 0){
                    // start shrinking the window & update start of founded subString
                    int curr_windowSize = j - i + 1;
                    if(min_length > curr_windowSize){
                        min_length = curr_windowSize;
                        startingOfString = i;
                    }
                    char start_char = s.charAt(i);
                    if (map.containsKey(start_char)) {
                        map.put(start_char, map.get(start_char) + 1);
                        if (map.get(start_char) > 0) {
                            count_required++;
                        }
                    }
                  
                    i++;
                }
            j++;
        }
        return min_length >  s.length() ? "": s.substring(startingOfString, startingOfString + min_length);

    }

    public String minWindow(String s, String t) {
        return findMinimumSubString(s, t);
    }
}