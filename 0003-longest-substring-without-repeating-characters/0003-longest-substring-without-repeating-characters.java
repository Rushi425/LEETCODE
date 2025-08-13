class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0, maxLength = 0;

        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);

            if(map.containsKey(c) && map.get(c) >= left){
                left = map.get(c) + 1;     
            }
            map.put(c, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;


        //  Set<Character> set = new HashSet<>();
        // int left = 0, right = 0, maxLength = 0;
        // while(right < s.length()){
        //     if(!set.contains(s.charAt(right))){
        //         set.add(s.charAt(right));
        //         maxLength = Math.max(maxLength, right-left+1);
        //         right++;
        //     }
        //     else{
        //         set.remove(s.charAt(left));
        //         left++;
        //     }
        // }
        // return maxLength;
    }  
}