class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) return 0;

        int n = intervals.length;
        // sorting based on end time 
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[1] - b[1];
            } 
        });

        int lastPicked = intervals[0][1];
        int count = 1;
        for(int i = 1; i < n; i++){
            if(lastPicked <= intervals[i][0]){
                count++;
                lastPicked = intervals[i][1];
            }
        }
        return n - count;
    }
}