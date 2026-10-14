class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        bubble(nums);
        if(nums[0] < 0 && nums[0]*nums[1]*nums[len - 1] > nums[len-1]*nums[len-2]*nums[len-3]){
            return nums[0]*nums[1]*nums[len - 1];
        }
        else{
            return nums[len-1]*nums[len-2]*nums[len-3];
        }
    }

    
}