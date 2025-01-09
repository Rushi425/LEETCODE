class Solution {
public:
    int isPrefixOfWord(string sentence, string searchWord) {
        int count = 1;
        int searchLen = searchWord.length();
        stringstream s(sentence); 
        string word;
        while(s >> word){
            if(word.substr(0, searchLen) == searchWord){
                return count;
            }
            else{
                count++;
            }
        }
        return -1;
    }
};