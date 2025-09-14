class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Set<Integer> tempSet = new HashSet<>();
        for(int a: nums){
            tempSet.add(a);
        }
        List<Integer> tempList= new ArrayList<>(tempSet);

        tempList.sort(Collections.reverseOrder());

        int size = Math.min(k, tempList.size());
        int[] res= new int[size];

        for(int i = 0; i < size; i++){
            res[i] = tempList.get(i);
        }
        
        return res;
    }
}


// brute force with (TLE)
// class Solution {
//     public int[] maxKDistinct(int[] nums, int k) {
//         Set<Integer> res = new HashSet<>();
//         int maxSum = Integer.MIN_VALUE;
//         int n = nums.length;

//         for (int i = 0; i < n; i++) {
//             Set<Integer> temp = new HashSet<>();
//             int sum = 0, min = nums[i];

//             for (int j = i; j < n; j++) {
//                 if (temp.contains(nums[j])) continue;

//                 if (temp.size() + 1 <= k) {
//                     sum += nums[j];
//                     temp.add(nums[j]);
//                     min = Math.min(min, nums[j]);   
//                 } else {
//                     if (min > nums[j]) continue;
//                     else {
//                         temp.remove(min);
//                         sum -= min;
//                         temp.add(nums[j]);
//                         sum += nums[j];

//                         min = Integer.MAX_VALUE;
//                         for (int a : temp) {
//                             min = Math.min(min, a);
//                         }
//                     }
//                 }
//             }

//             if (sum > maxSum) {
//                 maxSum = sum;
//                 res = new HashSet<>(temp);
//             }
//         }

//         List<Integer> tempList = new ArrayList<>(res);
//         tempList.sort(Collections.reverseOrder());

//         int[] resArray = new int[tempList.size()];
//         int idx = 0;
//         for (int a : tempList) {   
//             resArray[idx++] = a;
//         }

//         return resArray;
//     }
// }
