class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        Set<Integer> smaller = set1.size() <= set2.size()
                ? set1 : set2;
        Set<Integer> larger = smaller == set1 ? set2 : set1;

        List<Integer> result = new ArrayList<>();

        for (int num : smaller) {
            if (larger.contains(num)) {
                result.add(num);
            }
        }

        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();

    }
}