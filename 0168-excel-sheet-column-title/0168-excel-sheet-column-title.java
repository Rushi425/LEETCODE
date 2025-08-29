class Solution {
    public String convertToTitle(int columnNumber) {
        // String res = "";
        StringBuilder res = new StringBuilder();
        int num = columnNumber;
        while(num > 0){
            num--;
            int temp = num % 26;
            char c =  (char) ('A' + temp);
            // res += c;
            res.append(c);
            num /= 26;
        }

        // String reversed = "";
        // for (int i = res.length() - 1; i >= 0; i--) {
        //     reversed += res.charAt(i);
        // }
        return res.reverse().toString();
        // return reversed;
    }
}