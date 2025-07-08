class Solution {
    public static String get(String str){
        int[] freq = new int[26];

        for(char c: str.toCharArray()){
            freq[c -'a']++;
        }
        StringBuilder freqStr = new StringBuilder();
        char ch = 'a';
        for(int i : freq){
            freqStr.append(ch);
            freqStr.append(i);
            ch++;
        }
        return freqStr.toString();
    } 

    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList();

        Map<String, List<String>> map = new HashMap<>();

        for(String s: strs){
            String freqStr = get(s);
            if(map.containsKey(freqStr)){
                map.get(freqStr).add(s);
            }
            else{
                List<String> temp = new ArrayList<>();
                temp.add(s);
                map.put(freqStr, temp);
            }
        }
        return new ArrayList<>(map.values());
    }
}