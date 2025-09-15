class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int count = 0;

        for(String s: words){
            boolean canType = true;
            for(char c: brokenLetters.toCharArray()) {
                if(s.indexOf(c) != -1){
                    canType = false;
                    break;
                }
            }
            if(canType) count++;
        }
        return count;
    }
}



// class Solution {
//     public int canBeTypedWords(String text, String brokenLetters) {
//         int i = 0, start = 0, count = 0;
//         while(i <= text.length()){
//             if(i == text.length() || text.charAt(i) == ' ') {
//                 String s = text.substring(start, i);
//                 start = i + 1;

//                 boolean isValid = true;
//                 for(int j = 0; j < brokenLetters.length(); j++) {
//                     char c = brokenLetters.charAt(j);
//                     if(s.indexOf(c) != -1){
//                         isValid = false;
//                         break;
//                     }
//                 }
//                 if(isValid && s.length() > 0) count += 1;                   
//             }
//             i++;
//         }
//         return count;
//     }
// }