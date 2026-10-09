class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m; i < nums1.length; i++){
            nums1[i] = nums2[i - m];
        }

        bubble(nums1);

    }

    private void bubble(int[] arr){
        int len = arr.length;
        boolean swapped = false;

        for(int i = 0; i < len; i++){
            for(int j = 1; j < len - i; j++){
                if(arr[j]<arr[j-1]){
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