class Solution {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];

        dp[0] = 1;
        int i2 =0;
        int i3 = 0;
        int i5 = 0;
        for(int i=1; i<n; i++){
            int n2 = dp[i2] * 2;
            int n3 = dp[i3] * 3;
            int n5 = dp[i5] * 5;
            dp[i] = Math.min(n2, Math.min(n3,n5));

            if(dp[i] == n2) i2++;
            if(dp[i] == n3) i3++;
            if(dp[i] == n5) i5++;

        }
        return dp[n-1];
    }
}