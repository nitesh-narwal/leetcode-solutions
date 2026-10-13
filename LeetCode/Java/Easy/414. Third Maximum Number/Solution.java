class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        
        for(int num : nums){
            hashSet.add(num);
        }

        List<Integer> list = new ArrayList<>(hashSet);

        int[] arr = new int[hashSet.size()];
        for(int i = 0; i < hashSet.size(); i++){
            arr[i] = list.get(i);
        }


        if(hashSet.size() == 2){
            if(arr[0] > arr[1] ){
                return arr[0];
            }
            else{
                return arr[1];
            }
        }

        Arrays.sort(arr);

        return arr[arr.length - 3];

    }
}