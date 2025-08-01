class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        Set<Integer> seen1 = new HashSet<>();
        Set<Integer> seen2 = new HashSet<>();
        Set<Integer> counted = new HashSet<>();
        int []arr = new int[n];
        int repeated = 0;
        for(int i = 0; i < n; i++){
            seen1.add(A[i]);
            seen2.add(B[i]);

            if(seen2.contains(A[i]) && !counted.contains(A[i])){
                repeated += 1;
                counted.add(A[i]);
            }
            if(seen1.contains(B[i]) && !counted.contains(B[i])){
                repeated += 1;
                counted.add(B[i]);
            }
            arr[i] = repeated;
        }
        return arr;
    }
}