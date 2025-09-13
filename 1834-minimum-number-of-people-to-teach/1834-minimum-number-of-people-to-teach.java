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


