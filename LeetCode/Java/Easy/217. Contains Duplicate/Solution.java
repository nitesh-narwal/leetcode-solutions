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
        int len =  nums.length;
        for(int i = 0; i < len; i++){
            boolean swapped = false;
            for(int j = 1; j < len - i; j++){
                if(nums[j-1] > nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    swapped = true;
                }
            }

            if(!swapped){
                break;
            }
        }
    }
}