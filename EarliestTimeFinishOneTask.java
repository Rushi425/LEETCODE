class Solution {
    public int earliestTime(int[][] tasks) {
        int min = Integer.MAX_VALUE;
        for(int[] task: tasks){
            if(task[0] + task[1] < min){
                min = task[0] + task[1];
            }
        }
        return min;
    }
}
