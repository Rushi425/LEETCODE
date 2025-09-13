class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        // Store what each person knows        
        List<List<Integer>> knows = new ArrayList<>();
        for(int i = 0; i < languages.length; i++){
            List<Integer> temp = new ArrayList<>();
            for(int a: languages[i]){
                temp.add(a); 
            }
            knows.add(temp);
        }

        // People who cannot communicate       
        Set<Integer> notHappy = new HashSet<>();
        for(int[] friends: friendships){
            int t1 = friends[0] - 1; 
            int t2 = friends[1] - 1;
            boolean areFriends = false;
            for(int a: knows.get(t1)){
                if(knows.get(t2).contains(a)) {
                    areFriends = true;
                    break;
                }
            }
            if(!areFriends){
                notHappy.add(t1);
                notHappy.add(t2);
            }
        }

        // Try teaching each language to all "notHappy" people
        int minNeed = languages.length;
        for(int i = 1; i <= n; i++){
            int needCurrLang = 0; 
                for(int a: notHappy){
                    if(!knows.get(a).contains(i)){
                        needCurrLang += 1;
                    }   
                }
            minNeed = Math.min(needCurrLang, minNeed);
        }
        return minNeed;
    }
}


// class Solution {
//     public int minimumTeachings(int totalLanguages, int[][] userLanguages, int[][] friendships) {
//         Set<Integer> usersToTeach = new HashSet<>();
        
//         // Step 1: Find users who cannot communicate
//         for (int[] friendship : friendships) {
//             int u1 = friendship[0] - 1;
//             int u2 = friendship[1] - 1;
//             boolean canCommunicate = false;
            
//             for (int lang1 : userLanguages[u1]) {
//                 for (int lang2 : userLanguages[u2]) {
//                     if (lang1 == lang2) {
//                         canCommunicate = true;
//                         break;
//                     }
//                 }
//                 if (canCommunicate) break;
//             }
            
//             if (!canCommunicate) {
//                 usersToTeach.add(u1);
//                 usersToTeach.add(u2);
//             }
//         }
        
//         int minUsersToTeach = userLanguages.length + 1;
        
//         // Step 2: Try each language
//         for (int lang = 1; lang <= totalLanguages; lang++) {
//             int count = 0;
            
//             for (int user : usersToTeach) {
//                 boolean knows = false;
//                 for (int l : userLanguages[user]) {
//                     if (l == lang) {
//                         knows = true;
//                         break;
//                     }
//                 }
//                 if (!knows) count++;
//             }
            
//             minUsersToTeach = Math.min(minUsersToTeach, count);
//         }
        
//         return minUsersToTeach;
//     }
// }