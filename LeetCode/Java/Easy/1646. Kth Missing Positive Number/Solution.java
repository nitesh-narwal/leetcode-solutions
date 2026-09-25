class Solution {
    public int findKthPositive(int[] arr, int k) {

        ArrayList<Integer> demo = new ArrayList<>();

        int left = 0;
        int right = arr.length - 1;
        int val = 1;
        int end = arr.length + 2*k;

        while( val != -1){
            boolean rtn = BS(arr, left, right, val);

            if(!rtn){
                demo.add(val);
            }

            if( val == end ){
                val = -1;
                break;
            }
            val++;
        }

        return demo.get(k - 1);

    }

     static boolean BS(int[] arr, int left, int right, int target){
        while(left <= right){
        int mid = (int) Math.ceil(left + (right - left)/2);

        if(arr[mid] < target){
            left = mid + 1;
        }
        else if(arr[mid] > target){
            right = mid - 1;
        }
        else if( arr[mid] == target){
            return true;
        }
     }
     return false;
   } 

}