class Solution {
    public boolean isPerfectSquare(int num) {
        float ceil = num/2;
        int left = 1;
        int right = (int)Math.ceil(ceil);
        boolean var = false;

        while(left <= right){
            int mid = left + (right - left)/2;

            if (mid == num / mid && num % mid == 0) {
                return true;
            }
            else if (mid > num / mid) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return var;
    }
}