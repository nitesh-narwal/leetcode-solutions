class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        boolean[] exists = new boolean[1001];

        for (int num : nums1) {
            exists[num] = true;
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (int num : nums2) {
            if (exists[num]) {
                result.add(num);
                exists[num] = false;
            }
        }

        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        
    }
}