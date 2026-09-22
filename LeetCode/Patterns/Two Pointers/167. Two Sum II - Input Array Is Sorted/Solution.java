class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {

            int required = target - numbers[i];

            int index = BS(numbers, i + 1, numbers.length - 1, required);

            if (index != -1) {
                return new int[]{i + 1, index + 1};
            }
        }
        return new int[]{};
    }

    private int BS(int[] numbers, int left, int right, int target) {
        
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (numbers[mid] < target) {
                left = mid + 1;
            }
            else if (numbers[mid] > target) {
                right = mid - 1;
            }
            else {
                return mid;
            }
        }

        return -1;
    }
}