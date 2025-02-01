class Solution {
public:
    int strStr(string haystack, string needle) {
        //Solution 1
        // return haystack.find(needle);

        //solution 2
        // int a = haystack.size(), b = needle.size();
        // for(int i = 0; i < a - b; i++){
        //     if(haystack.substr(i, b) ==needle){
        //         return i;
        //     }
        // }
        // return -1;

        //soltion 3
        return haystack.find(needle) == string::npos ? -1 : haystack.find(needle);
    }
};