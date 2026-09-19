class Solution {
    public int arrangeCoins(int n) {
        long c = 0;
        int ans = 0;
        while(c <= n){
            ans++;
            c += ans;
        }
        return ans-1;
    }
}