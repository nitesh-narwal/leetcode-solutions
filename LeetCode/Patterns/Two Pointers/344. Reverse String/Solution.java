class Solution {
    public void reverseString(char[] s) {
        // Just call the method, do not use "return" since this method is void
        recursive(s, 0, s.length - 1); 
    }

    // Changed return type to void and added 'int' to left and right
    private void recursive(char[] arr, int left, int right) {
        // Correct base case: Stop when pointers cross or meet in the middle
        if (left >= right) {
            return;
        }
    
        // Swap elements (char cannot be null, assign directly)
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        // Recursively call with shifted pointers (no data types in arguments)
        recursive(arr, left + 1, right - 1);
    }
}
