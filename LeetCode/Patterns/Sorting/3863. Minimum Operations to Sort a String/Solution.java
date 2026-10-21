
class Solution {
    public int minOperations(String s) {
        int n = s.length();

        // 0 operations if already sorted
        boolean sorted = true;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i - 1) > s.charAt(i)) {
                sorted = false;
                break;
            }
        }

        if (sorted) {
            return 0;
        }

        // An unsorted string of length 2 cannot be changed
        if (n == 2) {
            return -1;
        }

        char first = s.charAt(0);
        char last = s.charAt(n - 1);

        char min = 'z';
        char max = 'a';

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c < min) min = c;
            if (c > max) max = c;
        }

        if (first == max && last == min) {
            // Special case: reverse endpoints
            if (n == 3) {
                return 2;
            }
            return 3;
        }

        if (first == min || last == max) {
            return 1;
        }

        return 2;
    }
}
