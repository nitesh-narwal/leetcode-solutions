class Solution {
    public int findContentChildren(int[] g, int[] s) {
        try {
            Thread thread1 = new Thread(() -> Arrays.sort(g));
            Thread thread2 = new Thread(() -> Arrays.sort(s));
            thread1.start();
            thread2.start();
            thread1.join();
            thread2.join();
        } catch (Exception e) {
        }

        int i = 0; // Child pointer
        int j = 0; // Cookie pointer
        int count = 0;

        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                // This cookie satisfies this child
                count++;
                i++;
                j++;
            } else {
                // Cookie is too small; try the next cookie
                j++;
            }
        }

        return count;
    }
}