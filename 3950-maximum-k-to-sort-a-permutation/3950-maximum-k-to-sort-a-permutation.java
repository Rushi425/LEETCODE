class Solution {
    public int sortPermutation(int[] nums) {
        int[] copy = nums.clone();
        Arrays.sort(copy);
        List<Integer> arr = new ArrayList<>(); 
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != copy[i]){
                arr.add(i);
            }
        }
        int k = Integer.MAX_VALUE;
        for(int i: arr){
            k &= nums[i];
        }
        return arr.size() > 0? k: 0;
    }
}