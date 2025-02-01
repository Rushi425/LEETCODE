class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        if(strs.empty()) return "";
        sort(strs.begin(), strs.end());
        int i = 0;
        string firstString = strs[0], lastString = strs.back();

        while(i < firstString.length() && firstString[i] == lastString[i]) i++;

        return lastString.substr(0, i);

    }
};