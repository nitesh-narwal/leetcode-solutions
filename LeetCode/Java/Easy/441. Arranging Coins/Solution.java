class Solution {
    public int arrangeCoins(int n) {

        if (n == 1){
            return 1;
        }

        int left = 1; 
        int right = n;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(2*n == mid*(mid + 1)){
                return mid;
            }if(2*n >= mid*(mid + 1) ){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return right;
    }
}