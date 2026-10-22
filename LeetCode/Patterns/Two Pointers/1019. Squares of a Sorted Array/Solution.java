class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int temp = nums[i];
            nums[i] = temp*temp;
        }

        select(nums);

        return nums;
    }

    public void select(int[] arr){
        for(int i =0; i < arr.length; i++){
            int last = arr.length - i;

            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last - 1);
        }
    }

    public int getMaxIndex(int[] arr, int start, int last){
        int max = 0;
        for(int i = 1; i < last; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    public void swap(int[] arr, int max, int last){
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
    }

}