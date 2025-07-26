class Solution {
    public String reverseWords(String s) {
        char [] charArr = s.toCharArray();
        int n = s.length();
        int start = 0;
        for(int i = 0; i <= n; i++){
            if(i == n || charArr[i] == ' '){
                reverse(charArr, start, i - 1);
                start = i + 1;
            }
        }
        return new String(charArr);
    }

    private void reverse(char []arr, int left, int right){
        while(left < right){
            char temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;

        }
    } 
}