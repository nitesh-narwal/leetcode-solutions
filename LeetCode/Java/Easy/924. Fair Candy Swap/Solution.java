class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        
        int sumOfAlice = sum(aliceSizes);
        int sumOfBob = sum(bobSizes);

        int diff = (sumOfBob - sumOfAlice) / 2;

        Arrays.sort(bobSizes);

        for (int num1 : aliceSizes) {

            int target = num1 + diff;

            int left = 0;
            int right = bobSizes.length - 1;

            while (left <= right) {

                int mid = left + (right - left) / 2;

                if (bobSizes[mid] < target) {
                    left = mid + 1;
                }
                else if (bobSizes[mid] > target) {
                    right = mid - 1;
                }
                else {
                    return new int[]{num1, bobSizes[mid]};
                }
            }
        }

        return new int[]{};
    }

    int sum(int[] arr){
        // int sum = Arrays.stream(arr).sum();
        int sum = Arrays.stream(arr).reduce(0,(a,b) -> a + b);  // get fail in case of int size limit
        return sum;
    }
}