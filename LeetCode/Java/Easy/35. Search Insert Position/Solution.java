class Solution {
    public int searchInsert(int[] nums, int target) {

        if(target > nums[nums.length - 1] ){
            return nums.length;
        }
        else if(target < nums[0]){
            return 0;
        }

        int left = 0;
        int right = nums.length - 1;

        while(left <= right ){
            int mid = left + (right - left)/2;

            if(target > nums[mid]){
                left = mid + 1;
                if(target < nums[mid + 1]){
                    return mid + 1;
                }
            }
            else if( target < nums[mid]){
                right = mid - 1;
                if(target > nums[mid - 1]){
                    return mid;
                }
            }
            else{
                return mid;
            }


        }
        return 0;
    }
}