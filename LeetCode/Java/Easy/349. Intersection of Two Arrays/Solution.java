class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hashNum1 = new HashSet<>();
        Set<Integer> hashNum2 = new HashSet<>();

        ArrayList<Integer> list = new ArrayList<>();

        for(int num : nums1){
            hashNum1.add(num);
        }

        for(int num : nums2){
            hashNum2.add(num);
        }

        if(hashNum1.size() > hashNum2.size()){  
            for(int num : hashNum1){
                if(hashNum2.contains(num)){
                    list.add(num);
                }
            }

            int[] primitiveArray = list.stream().mapToInt(Integer::intValue).toArray();
            return primitiveArray;

        }
        else{
            for(int num : hashNum2){
                if(hashNum1.contains(num)){
                    list.add(num);
                }
            }

            int[] primitiveArray = list.stream().mapToInt(Integer::intValue).toArray();
            return primitiveArray;
        }

    }
}