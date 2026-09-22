class Solution {
    public int arrangeCoins(int n) {

        int left = 1;
        int right = n;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            long required = (long) mid * (mid + 1);

            if (required == 2L * n) {
                return mid;
            }
            else if (required < 2L * n) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return right;
    }
}