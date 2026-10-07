class Solution {
    public void reverseString(char[] s) {
        
        int len = s.length;
        int ptr = len/2;

        if(len%2 == 0){
             for( int i =0 ; i < ptr ; i++){
                
                    char p = s[i];
                    s[i]= s[len -i -1];
                    s[len -i -1] = p;
                
            }
        System.out.print(s);



        }
        else if( len%2 != 0){
            for( int i =0 ; i < ptr ; i++){
                if (i == ptr ){
                    System.out.print(s);
                }
                else{
                    char p = s[i];
                    s[i]= s[len -i -1];
                    s[len -i -1] = p;
                }
            }
    System.out.print(s);

        }

    }
}