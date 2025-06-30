public class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> lis = new ArrayList<>();
        int l = 0;
        for(int i : nums){
            int idx = Collections.binarySearch(lis, i);

            if(idx < 0){
                idx = -(idx + 1);
            }

            if(idx == lis.size()){
                lis.add(i);
                l++;
            }
            else{
                lis.set(idx, i);
            }
        }
        return l;
    }
}
