class Solution { 
    public int search(int[] nums, int target) { 
        return binarySearch(nums, target, 0, nums.length - 1);
    } 

    // Separate helper method for recursion
    private int binarySearch(int[] nums, int target, int left, int right) {
        // Base case: element is not present
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            // Must return the result of the recursive call
            return binarySearch(nums, target, mid + 1, right);
        } else {
            return binarySearch(nums, target, left, mid - 1);
        }
    }
}
