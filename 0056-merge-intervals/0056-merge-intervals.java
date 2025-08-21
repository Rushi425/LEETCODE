class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        // Arrays.sort(intervals, new Comparator<int[]>(){
        //     public int compare(int[] fa, int[] b){
        //         return (a[0], b[0])
        //     }
        // })

        List<int[]> list = new ArrayList<>();
        int n = intervals.length;
        int[] curr = new int[2];
        curr[0] = intervals[0][0];
        curr[1] = intervals[0][1];
        int i = 1;
        while(i < n){
            // overlap
            if(curr[1] >= intervals[i][0]){
                // merging only max element min is as it is 
                curr[1] = Math.max(curr[1], intervals[i][1]);
            }
            else{
                list.add(curr); // previous merged interval
                curr = intervals[i];
            }
            i += 1;
        }
        list.add(curr);

        int[][] res = new int[list.size()][2];
        int x = 0;
        for(int[] a: list){
            res[x][0] = a[0];
            res[x][1] = a[1];
            x += 1;
        }
        return res;
    }
}