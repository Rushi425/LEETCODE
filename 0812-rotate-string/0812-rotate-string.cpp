class Solution {
public:
    bool rotateString(string s, string goal) {
        if(s.size() == goal.size() && (s+s).find(goal) != -1) return true;
        else return false;

    }
};