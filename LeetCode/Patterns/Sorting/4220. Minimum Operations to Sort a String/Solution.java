
class Solution {
    public int minOperations(String s) {
        int n = s.length();

        // Already sorted?
        boolean sorted = true;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i - 1) > s.charAt(i)) {
                sorted = false;
                break;
            }
        }

        if (sorted) return 0;
        if (n == 2) return -1;

        char first = s.charAt(0);
        char last = s.charAt(n - 1);

        char lo = 'z';
        char hi = 'a';

        // Examine only the middle characters
        for (int i = 1; i < n - 1; i++) {
            lo = (char) Math.min(lo, s.charAt(i));
            hi = (char) Math.max(hi, s.charAt(i));
        }

        if (first <= Math.min(lo, last) ||
            Math.max(first, hi) <= last) {
            return 1;
        }

        if (last < lo && hi < first) {
            return 3;
        }

        return 2;
    }
}
