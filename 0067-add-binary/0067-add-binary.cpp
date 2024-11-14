class Solution {
public:
    string addBinary(string a, string b) {
        int i = a.size() - 1, j = b.size() - 1; //calculate size;
        string result = "";  // for result
        int carry = 0; 

        // run till the either a = 0,b = 0 or carry = 1 is anything
        while(i >= 0 || j >= 0 || carry > 0){        
            int sum = carry;

        // convert the string charcater which is number(0,1) using '0'.
            if(i >= 0){
                sum += a[i] - '0'; 
                i--;
            }

            if(j >= 0){
                sum += b[j] - '0';
                j--;
            }
        // "+=" for appending in string directly 
            result += (sum % 2) + '0';
            carry = sum / 2;
        }
        // reverse the string
        reverse(result.begin(), result.end());
        return result;
    }
    
};