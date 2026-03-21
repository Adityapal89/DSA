class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int k = 2 * (numRows - 1);
        for (int i = 0; i < numRows; i++) {
            int idx = i;
            while (idx < n) {
                sb.append(s.charAt(idx));
                if (i != 0 && i != numRows - 1) {
                    int k1 = k - (2 * i);
                    int k2 = idx + k1;
                    if (k2 < n) {
                        sb.append(s.charAt(k2));
                    }
                }
                idx = idx + k;
            }
        }
        return sb.toString();
    }
}