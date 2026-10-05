class Solution {
    public int specialArray(int[] nums) {

        int[] freq = new int[101];

        for (int num : nums) {
            freq[num]++;
        }

        int count = nums.length;

        for (int x = 0; x <= nums.length; x++) {

            if (count == x) {
                return x;
            }

            count -= freq[x];
        }

        return -1;
    }
}