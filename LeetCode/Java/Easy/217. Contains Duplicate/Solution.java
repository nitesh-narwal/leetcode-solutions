class Solution {
    public boolean containsDuplicate(int[] nums) {
        int[] freq = new int[2*nums.length];

        for(int num : nums){
            freq[num]++;
        }

        int i = 0;
        while( i <= nums.length){
            if(freq[i] > 1){
                return true;
            }

            i++;
        }

        return false;
    }
}