class Solution {
    public int largestPerimeter(int[] nums) {
        if(nums.length < 3){
            return 0;
        }

        select(nums);
        int len = nums.length;

        int a = nums[len - 1];
        int b = nums[len - 2];
        int c = nums[len - 3];

        int s = (int)Math.ceil((a + b + c)/2.0);

        if(s < 2){
            return 0;
        }

        int check = s*(s-a)*(s-b)*(s-c);

        if(check <= 0){
            return 0;
        }

        int area = (int)Math.sqrt(check);
        if(area <= 0){
            return 0;
        }

        return a+b+c;


    }

    public void select(int[] arr){

        for(int i = 0; i < arr.length; i++){
            int last = arr.length - i;

            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    public int getMaxIndex(int[] arr, int start, int last){
        int max = start;
        for(int i = 1; i < last; i++){
            if(arr[i-1] < arr[i]){
                max = i;
            }
        }

        return max;
    }

    public void swap(int[] arr, int max, int last){
        int temp = arr[last - 1];
        arr[last - 1] = arr[max];
        arr[max] = temp;
    }
}