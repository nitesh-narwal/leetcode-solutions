class Solution {

    int times = 0;
    public boolean isPowerOfThree(int n) {
        times = 0;
        recurse(n);
        if(times%3 == 0 && n > 0){
            return true;
        }
        return false;
    }


    private void recurse(int num){
        if(num/3 <= 0 ){
            return;
        }
        times++;
        recurse(num/3);
    }
}