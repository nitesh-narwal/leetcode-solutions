class Solution {
    public boolean checkIfExist(int[] arr) {

        // Checking the array is at length 1
        if(arr.length == 1){
            return false;
        }

        Arrays.sort(arr);

        int arrLeft = 0;
        int arrRight = arr.length -1 ;

        int arrMid = arrLeft + ( arrRight - arrLeft)/2;

        // Dividing the right-half of an array with to to find the target
        for(int i =  arrMid; i < arr.length; i++){
            arr[i] = (int)Math.ceil(arr[i]/2.0);
        }
        
        int right = arrMid - 1;

        for(int i  = 0; i <= right; i++){
            int target = arr[i];

            arrRight = arr.length -1 ;
            arrMid = arrLeft + ( arrRight - arrLeft)/2;

            while( arrMid <= arrRight){
                int mid = arrMid + (arrRight - arrMid)/2;
                if(arr[mid] > target ){
                    arrRight = mid -1;
                }
                else if(arr[mid] < target){
                    arrMid = mid + 1;
                }
                else{
                    return true;
                }
            }
        }
        return false;
    }
}