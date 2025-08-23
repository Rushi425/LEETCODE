class Solution {
    public int characterReplacement(String s, int k) {
        int[] freqn = new int[26];
        int left = 0, maxFreqn = 0, maxLen = 0;
        for (int right = 0; right < s.length(); right++) {
            int index = s.charAt(right) - 'A';
            freqn[index]++;
            maxFreqn = Math.max(maxFreqn, freqn[index]);
            while ((right - left + 1) - maxFreqn > k) {
                freqn[s.charAt(left) - 'A']--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}


    //    int n = s.length();
    //    int left = 0, right = 0, maxLen = 0, maxFreqn = 0;
    //    int[] freqn = new int[26];
    //    while(right < n){
    //     freqn[s.charAt(right) - 'A']++;
    //     maxFreqn = Math.max(maxFreqn, freqn[s.charAt(right) - 'A']);
    //     while((right - left) + 1 - maxFreqn > k){
    //         freqn[s.charAt(left) - 'A']--;
    //         for(int i = 0; i < 26; i++){
    //             maxFreqn = Math.max(maxFreqn, freqn[i]);
    //         }
    //         left++;
    //     }
    //     if((right - left) - maxFreqn <= k){
    //         maxLen = Math.max(maxLen, right - left + 1);
    //     }
    //     right++;
    //    }
    //    return maxLen;




        // int n = s.length();
        // int maxlen = 0;
        // char[] charArray = str.toCharArray();
        // for(int i = 0; i < n; i++){
        //     int[] freqn = new int[26];
		// 	int chnagesNeeded = 0, maxFreqn = Integer.MIN_VALUE;
        //     for(int j = i; j < n; j++){
		// 		freqn[charArray[j] - 'A']++;
		// 		maxFreqn = Math.max(maxFreqn, freqn[charArray[j] - 'A']);
        //         if(chnagesNeeded <= k) {
		// 			maxLength = Math.max(maxLength, (j - i) + 1);	
        //     }
        // }