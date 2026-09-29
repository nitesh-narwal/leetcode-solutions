class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
         int[] timesArr = new int[1001];

        // Count occurrences in nums1
        for (int num : nums1) {
            timesArr[num]++;
        }

        ArrayList<Integer> result = new ArrayList<>();

        // Match occurrences from nums2
        for (int num : nums2) {

            if (timesArr[num] > 0) {
                result.add(num);
                timesArr[num]--;
            }
        }

        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}