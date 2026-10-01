class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        
        int sumAlice = 0;
        int sumBob = 0;

        for (int x : aliceSizes) {
            sumAlice += x;
        }

        for (int x : bobSizes) {
            sumBob += x;
        }

        int diff = (sumBob - sumAlice) / 2;

        Set<Integer> bobSet = new HashSet<>();

        for (int x : bobSizes) {
            bobSet.add(x);
        }

        for (int x : aliceSizes) {

            int y = x + diff;

            if (bobSet.contains(y)) {
                return new int[]{x, y};
            }
        }

        return new int[]{};
    }
}