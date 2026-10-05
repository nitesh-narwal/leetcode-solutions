class Solution {
    public int specialArray(int[] nums) {

        int n = nums.length;
        int[] freq = new int[n + 1];

        for (int num : nums) {
            if (num >= n) {
                freq[n]++;
            } else {
                freq[num]++;
            }
        }

        int count = n;

        for (int x = 0; x <= n; x++) {

            if (count == x) {
                return x;
            }

            count -= freq[x];
        }

        return -1;
    }
}