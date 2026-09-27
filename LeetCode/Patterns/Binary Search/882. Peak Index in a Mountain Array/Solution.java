class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length -1;

        /**
        In previous solution i was thinking 
            "I need to find the largest value." 
        But I think this instead 
            "I need to determine whether I'm before or after the peak.*/

        while(left < right){  // mot looking for the exact value instead narrowing the range
            int mid = left + (right - left)/2;

            if(arr[mid] < arr[mid + 1]){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        return  left;
    }
}