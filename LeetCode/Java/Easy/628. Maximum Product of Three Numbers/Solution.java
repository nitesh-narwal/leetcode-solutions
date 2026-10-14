class Solution {
    public int maximumProduct(int[] nums) {
        int len = nums.length;
        bubble(nums);
        if(nums[0] < 0 && nums[0]*nums[1]*nums[len - 1] > nums[len-1]*nums[len-2]*nums[len-3]){
            return nums[0]*nums[1]*nums[len - 1];
        }
        else{
            return nums[len-1]*nums[len-2]*nums[len-3];
        }
    }

    private void bubble(int[] arr){
        boolean swapped = false;

        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j-1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}