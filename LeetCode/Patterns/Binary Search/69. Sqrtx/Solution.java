class Solution {
    public int mySqrt(int x) {

       int sqrt = 0;
        while(true){
        
            if(sqrt*sqrt < x){
                sqrt++;
                if(sqrt*sqrt > x){
                    return sqrt - 1 ;
                }
            }
            else{
                break;
            }
        }
        return sqrt;
    }
}