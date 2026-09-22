class Solution {
    public int arrangeCoins(int n) {

        if (n == 1){
            return 1;
        }

        int left = 1; 
        int right = n;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(2*n < mid*(mid + 1)){
                return mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return 0;
    }
}