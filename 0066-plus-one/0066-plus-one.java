class Solution {
    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) {
            return new int[]{1};
        }
        int n = digits.length;
        for(int i = n - 1; i >= 0; i--){
            digits[i]++;

            if(digits[i] < 10) return digits;

            digits[i] = 0;
        }

        int []result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}

