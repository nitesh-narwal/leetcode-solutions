class Solution {
    public int missingNumber(int[] nums) {
        bubble(nums);

        for(int i=0; i< nums.length; i++){
            if(nums.length != nums[nums.length - 1]){
                return nums.length;
            }
            if(i != nums[i] ){
                return i;
            }
        }
        return -1;
    }

    private void bubble(int[] arr){
        for(int i = 0; i < arr.length; i++){
            boolean swapped = false;
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