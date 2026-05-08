class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int mod = 12345;
        int n = grid.length;
        int m = grid[0].length;
        int size = n * m;
        long[] prefix = new long[size];
        long[] suffix = new long[size];
        prefix[0] = 1;
        for (int i = 1; i < size; i++) {
            int r = (i - 1) / m;
            int c = (i - 1) % m;
            prefix[i] = (prefix[i - 1] * grid[r][c]) % mod;
        }
        suffix[size - 1] = 1;
        for (int i = size - 2; i >= 0; i--) {
            int r = (i + 1) / m;
            int c = (i + 1) % m;
            suffix[i] = (suffix[i + 1] * grid[r][c]) % mod;
        }
        int[][] ans = new int[n][m];
        for (int i = 0; i < size; i++) {
            int r = i / m;
            int c = i % m;
            ans[r][c] = (int)((prefix[i] * suffix[i]) % mod);
        }
        return ans;
    }
}