class Solution {
public:

int allocateWeight(vector<int> weight, int D){
    int low = weight[0], high = 0;
    for(int weights : weight){
        if(weights > low) low = weights;
        high += weights;
    }

    while(low < high){
        int currentDays = 1, currentSum = 0;

        int mid = low + (high - low) / 2;
        for(int w : weight){
            if(currentSum + w > mid){
                currentDays++;
                currentSum = 0;
            }
            currentSum += w;
        }
       
        if(currentDays > D) low = mid + 1;
		else high = mid ;	
    }
    return low;
}

    int shipWithinDays(vector<int>& weights, int D) {
         return allocateWeight(weights, D);
    }
};