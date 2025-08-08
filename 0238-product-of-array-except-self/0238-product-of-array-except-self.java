class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        answer[0] = 1;
        for(int i = 1; i < n; i++){
            answer[i] = answer[i - 1] * nums[i - 1];
        }
        int suffix = 1;
        for(int i = n - 2; i >= 0; i--){
            suffix *= nums[i + 1];
            answer[i] *= suffix;
        }
        return answer;      
    }
}
   
        // int[] answer = new int[nums.length];
        // for(int i = 0; i < nums.length; i++){
        //     int productOfAll = 1;
        //     for(int j = 0; j < nums.length; j++){
        //         if(i == j) continue;
        //         productOfAll *= nums[j];
        //     }
        //     answer[i] = productOfAll;
        // }
        // return answer ;


        // int[] answer = new int[nums.length];        
        // int[] prefix = new int[nums.length];
        // int[] suffix = new int[nums.length];

        // prefix[0] = 1;
        // for(int i = 1; i < nums.length; i++){
        //     prefix[i] = prefix[i - 1] * nums[i - 1];
        // }
        // suffix[nums.length - 1] = 1;
        // for (int i = nums.length - 2; i >= 0; i--) {
        //     suffix[i] = suffix[i + 1] * nums[i + 1]; 
        // }
        // for(int i = 0; i < nums.length; i++){
        //     answer[i] = prefix[i] * suffix[i];
        // } 
        // return answer ;