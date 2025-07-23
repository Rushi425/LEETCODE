class Solution {
    public boolean isPalindrome(String s) {
        int low = 0, high = s.length() - 1;
		while(low <= high) {
            char left = s.charAt(low);
            char right = s.charAt(high);
            if(!Character.isLetterOrDigit(left)) {
                
                low++;
                continue;
            }
            if(!Character.isLetterOrDigit(right)) {
                high--;
                continue;
            }
			// if(s.charAt(low) != s.charAt(high)) {
			// 	return false;
			// }
            if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
                return false;
            }

            low++;
            high--;
		}
        return true;
    }
}
        
		