class Solution {
    public int minOperations(String s) {

        if(s.length() < 3){
            return -1;
        }
        char[] arr = s.toCharArray();
        int value = bubble(arr);
        return value;
    }

    public int bubble(char[] arr){
        boolean swapped = false;
        int val = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j-1] > arr[j]){
                    char temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                    val++;
                }
            }
            if(!swapped){
                break;
            }
        }
        return val;
    }
}