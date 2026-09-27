class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length -1;
        int val = 0;
        int indx = 0;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(val < arr[mid]){
                val = arr[mid];
                indx = mid;
                left = mid + 1;
            }
            else if(val > arr[mid]){
                right = mid - 1;
            }
        }
        return indx;
    }
}