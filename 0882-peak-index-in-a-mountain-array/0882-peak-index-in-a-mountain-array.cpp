class Solution {
public:
    int peakIndexInMountainArray(vector<int>& arr) {
      
       

        int low = 1;
        int high = arr.size() - 2;
        int mid;

        while(low <= high){
            mid = low + (high - low) / 2;

            if(arr[mid - 1] < arr[mid] && arr[mid + 1] < arr[mid]){
                return mid;
            }

            if(arr[mid - 1] < arr[mid]){
                low = mid + 1;
            }
            if(arr[mid + 1] < arr[mid]){
                high = mid - 1;
            }
           
        }
        return 0;
    }
};