class Solution {
public:
    string reverseWords(string s) {
        reverse(s.begin(), s.end());

        string word ="";
        string ans = "";
        int n = s.length();

        for(int i = 0; i < n; i++){
            while(s[i] != ' ' && i < n){
                word += s[i];
                i++;
            }
            reverse(word.begin(), word.end());
            if(word.length() > 0){
                        ans += ' '+ word;
                        word.clear();
            }
        }  
       return ans.substr(1);
    }
    
};