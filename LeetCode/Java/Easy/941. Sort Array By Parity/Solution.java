
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        bubble(nums);
        return nums;
    }

    private void bubble(int[] arr) {
        boolean ready = true;
        int i = 0;
        int j = arr.length;

        while (ready) {
            // Stop when pointers meet or cross
            if (i >= j) {
                break;
            }

            if (arr[i] % 2 == 0) {
                // Left element is already correct
                i++;
                continue;
            }
            else if (arr[j - 1] % 2 != 0) {
                // Right element is already correct
                j--;
                continue;
            }
            else {
                // Left is odd and right is even: swap
                int temp = arr[j - 1];
                arr[j - 1] = arr[i];
                arr[i] = temp;

                i++;
                j--;
            }
        }
    }
}
