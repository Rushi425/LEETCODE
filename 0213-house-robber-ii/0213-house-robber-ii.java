import java.util.Vector;

class Solution {
    public int calculate(int []nums, int s, int e){
        if (s == e) return nums[s];
        // if(n == 0) return 0;
        // if(n == 1) return arr.get(0);

        // int prev = Math.max(arr.get(0), arr.get(1));
        // int prev2 = arr.get(0);
        // int current  = prev;
        int prev2 = nums[s];
        int prev = Math.max(nums[s], nums[s + 1]);
        int current = prev;


        for(int i = s+2; i <= e; i++){
            int take = nums[i] + prev2;
            int notTake = prev;
            current = Math.max(take, notTake);
            prev2 = prev;
            prev = current;
        }
        return current;
    }

    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        if(n == 1) return nums[0];
        // Vector<Integer> temp1 = new Vector<>();
        // Vector<Integer> temp2 = new Vector<>();
        // for(int i = 0; i < n;i++){
        //     if(i != 0) temp1.add(nums[i]); // exclude first house
        //     if(i != n - 1) temp2.add(nums[i]);// exclude last house
        // }
        int t1 = calculate(nums, 1, n - 1);
        int t2 = calculate(nums, 0, n - 2);
        return Math.max(t1, t2);
    }
}