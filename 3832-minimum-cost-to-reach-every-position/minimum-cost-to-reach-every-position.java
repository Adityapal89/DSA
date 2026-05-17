class Solution {
    public int[] minCosts(int[] cost) {
        int n = cost.length;
        int[] ans = new int[n];
        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            minVal = Math.min(minVal, cost[i]);
            ans[i] = minVal;
        }
        return ans;
    }
}