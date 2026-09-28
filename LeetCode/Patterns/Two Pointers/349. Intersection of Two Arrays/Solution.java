class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        ArrayList<Integer> arr = new ArrayList<>();
        int lenOfNums1 = nums1.length;

        for(int i = 0; i < lenOfNums1; i++){
            if(arr.contains(nums1[i])){
                continue; // Skips only the current round and continues the loop
            }

            for(int j= 0; j < nums2.length; j++){
                if(arr.contains(nums1[i])){
                    continue;
                }
                else if(nums2[j] == nums1[i]){
                    arr.add(nums1[i]);
                }
            }
        }
        int[] rtnArr = arr.stream().mapToInt(Integer::intValue).toArray();

        return rtnArr;
        
    }
}