class Solution {
    public int findContentChildren(int[] g, int[] s) {
       int count = 0;

        Arrays.sort(g);
        Arrays.sort(s);

        for (int i = 0; i < s.length; i++) {
            if (s[i] >= g[count]) {
                count++;
                if (count == g.length)
                    return count;
            }
        }

        return count;
    }
}