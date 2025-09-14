class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int count = 0, currSum = 0; 
        for(int n: nums){
            currSum += n;

            if(map.containsKey(currSum - k)){
                count += map.get(currSum - k);
            }

            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }
        return count;
    }
}


// // solution 1
// import java.util.ArrayList;
// import java.util.List;

// public class PrintSubArraysWithKsum {
	
// 	static void helper(int[] input, List<Integer> ds, int currSum, int i, int k, int n) {
// 		if(i == n) {
// 			if(currSum == k) {
// 				System.out.println(ds.toString());
// 			}
// 			return;
// 		}
		
// 		// Take
// 		ds.add(input[i]);
// 		currSum += input[i];
// 		helper(input, ds, currSum, i + 1, k, n);
		
// 		currSum -= input[i];
// 		ds.remove(ds.size() - 1);
		
// 		// not pick
// 		helper(input, ds, currSum, i + 1, k, n);
// 	}

// 	public static void main(String[] args) {
// 		int[] input = {1, 2, 3};
// 		int k = 3;
// 		List<Integer> ds = new ArrayList<>();
// 		helper(input, ds, 0, 0, k, input.length);

// 	}
// }


// // Solution 2
// class Solution {
//     public int helper(int[] nums, int k, int index) {
//         if (index == nums.length)
//             return 0;

//         int sum = 0, count = 0;
//         // Try all subarrays starting from index
//         for (int i = index; i < nums.length; i++) {
//             sum += nums[i];
//             if (sum == k)
//                 count += 1;
//         }
//         // Recurse to start from the next index
//         return count + helper(nums, k, index + 1);
//     }

//     public int subarraySum(int[] nums, int k) {
//         return helper(nums, k, 0);
//     }
// }

// //solution 2
// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         int n = nums.length;
//         int[] prefixSum = new int[n];
//         prefixSum[0] = nums[0];

//         for(int i = 1; i < n; i++) {
//             prefixSum[i] = nums[i] + prefixSum[i - 1];
//         }

//         int count = 0;
//         for(int i = 0; i < n; i++) {
//             if(prefixSum[i] == k) count += 1;
//             for(int j = 0; j < i; j++){
//                 if(prefixSum[i] -  prefixSum[j] == k) count += 1;
//             }
//         }
//         return count;
//     }
// }





