class Solution {
    private static void backTrackHelper(int start, int n, int k, List<Integer> path, List<List<Integer>> res){

        if(path.size() == k){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = start; i <= n; i++){   
            path.add(i);  // choose i and add
            backTrackHelper(i + 1, n, k, path, res);  // explore
            path.remove(path.size() - 1);   // backtrack
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        backTrackHelper(1, n, k, new ArrayList<>(), res);
        return res;
    }
}