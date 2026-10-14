class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count = 0;
        int matched = 0;
        for(int i = 0; i < g.length; i++){
            for(int j = 0; j < s.length; j++){
                
                if(g[i] <= s[j] && matched != s[j] ){
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    private void bubble(int[] arr){

        boolean swapped = false;

        for(int i =0; i < arr.length; i++){
            for(int j = 1; i< arr.length - i; j++){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = arr[j];
                swapped = true;
            }

            if(!swapped){
                break;
            }
        }
    }
}