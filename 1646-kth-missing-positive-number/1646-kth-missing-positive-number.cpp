class Solution {
public:
    int findKthPositive(vector<int>& arr, int k) {
        int currentMissing = 0;
        int i = 0; //works like pointer
        int current = 1; //starting from zero

        while(true){
            if(i < arr.size() && arr[i] == current){
                i++;
            }
            else{
                currentMissing++;
                if(currentMissing == k){
                    return current;
                }
            }
            current++;
        }
    }
};