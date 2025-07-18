class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int [] array = new int[m+n];

        System.arraycopy(nums1, 0, array, 0, m);
        System.arraycopy(nums2, 0, array, m, n);
        Arrays.sort(array);
        int mid = 0;
        int arrayLength = array.length;
        if(arrayLength % 2 != 0){
            mid = arrayLength / 2;
            return array[mid];
        }
        else{
            mid = arrayLength / 2;
            double sum = array[mid] + array[mid - 1];
            return sum/2;
        }
        
    }
}