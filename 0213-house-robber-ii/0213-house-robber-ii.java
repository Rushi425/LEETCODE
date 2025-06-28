import java.util.Vector;

class Solution {
    public int calculate(Vector<Integer> arr){
        int n = arr.size();
        if(n == 0) return 0;
        if(n == 1) return arr.get(0);

        int prev = Math.max(arr.get(0), arr.get(1));
        int prev2 = arr.get(0);
        int current  = prev;

        for(int i = 2; i < n; i++){
            int take = arr.get(i) + prev2;
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
        Vector<Integer> temp1 = new Vector<>();
        Vector<Integer> temp2 = new Vector<>();
        for(int i = 0; i < n;i++){
            if(i != 0) temp1.add(nums[i]); // exclude first house
            if(i != n - 1) temp2.add(nums[i]);// exclude last house
        }
        int t1 = calculate(temp1);
        int t2 = calculate(temp2);
        return Math.max(t1, t2);
    }
}