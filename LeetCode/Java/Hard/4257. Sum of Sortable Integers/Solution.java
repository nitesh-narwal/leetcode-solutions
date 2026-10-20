class Solution {
    public int sortableIntegers(int[] nums) {
        int n = nums.length;

        int[] prefixMax = new int[n + 1];
        int[] suffixMin = new int[n + 1];
        int[] drops = new int[n];

        // prefixMax[i] = maximum of nums[0 ... i-1]
        for (int i = 0; i < n; i++) {
            prefixMax[i + 1] = Math.max(prefixMax[i], nums[i]);
        }

        // suffixMin[i] = minimum of nums[i ... n-1]
        suffixMin[n] = Integer.MAX_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            suffixMin[i] = Math.min(nums[i], suffixMin[i + 1]);
        }

        // Count adjacent descents: nums[i-1] > nums[i]
        for (int i = 1; i < n; i++) {
            drops[i] = drops[i - 1];

            if (nums[i - 1] > nums[i]) {
                drops[i]++;
            }
        }

        int answer = 0;

        // Only divisors of n can be sortable
        for (int k = 1; k <= n; k++) {
            if (n % k != 0) {
                continue;
            }

            boolean sortable = true;

            for (int start = 0; start < n; start += k) {
                int end = start + k - 1;

                // Condition 1: the blocks must join in sorted order
                if (start > 0 &&
                    prefixMax[start] > suffixMin[start]) {
                    sortable = false;
                    break;
                }

                // Condition 2: at most one circular descent per block
                int circularDrops =
                        drops[end] - drops[start];

                if (nums[end] > nums[start]) {
                    circularDrops++;
                }

                if (circularDrops > 1) {
                    sortable = false;
                    break;
                }
            }

            if (sortable) {
                answer += k;
            }
        }

        return answer;
    }
}