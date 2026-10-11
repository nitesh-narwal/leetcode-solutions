class Solution {
    public boolean containsDuplicate(int[] nums) {
        bubble(nums);

        for(int i= 1; i < nums.length; i++){
            if(nums[i -1] == nums[i]){
                return true;
            }
        }
        return false;
    }

    private void bubble(int[] nums){
       Arrays.sort(nums);
    }
}