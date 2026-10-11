class Solution {
    public int missingNumber(int[] nums) {
       Set<Integer> hashSet = new HashSet<>();

       for(int num: nums){
        hashSet.add(num);
       }

       for(int i =0; i < nums.length; i++){
            if(!hashSet.contains(nums.length)){
                return nums.length;
            }
            if(!hashSet.contains(i)){
                return i;
            }
        }
        return -1;
    }
}