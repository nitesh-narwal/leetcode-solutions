class Solution {
    public char nextGreatestLetter(char[] letters, char target) {


        int left = 0;
        int right = letters.length - 1;
        int mid = 0;

        if(letters[right] < target){
            return letters[0];
        }

        while(left <= right){
            mid = left + (right - left)/2;

            if(letters[mid] < target){
                left = mid + 1;
            }
            else if(letters[mid] > target){
                right = mid - 1;
            }
            else{
                if(letters[mid] == letters[0]){
                    return letters[mid + 1];
                }else{
                    return letters[mid - 1];
                }
            }
        }
        
        if( mid != 0 && mid != right){
            return letters[mid + 1];
        }
        else{
            return letters[0];
        }
    }
}