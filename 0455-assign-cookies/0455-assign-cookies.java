class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g); // sort greed
        Arrays.sort(s); // sort cookie sizes

        int child = 0;
        int cookie = 0;

        while(child < g.length && cookie < s.length){
            if(g[child] <= s[cookie]){
                child++;
            }
            cookie++;
        }
        return child;

        // while (child < g.length && cookie < s.length) {
        //     if (s[cookie] < g[child]) { 
        //         cookie++;
        //     }
        //     else{
        //         cookie++;
        //         child++;
        //     }
        // }
        // return child;

    }
}
